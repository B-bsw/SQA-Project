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
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        java.lang.String str3 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.abstractMethod");
        boolean boolean7 = closureCodingConvention0.isConstantKey("hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType8 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType9 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType10 = null;
        closureCodingConvention0.applySubclassRelationship(functionType8, functionType9, subclassType10);
        java.lang.String str12 = closureCodingConvention0.getAbstractMethodName();
        boolean boolean14 = closureCodingConvention0.isPrivate("hi!");
        boolean boolean17 = closureCodingConvention0.isExported("goog.exportSymbol", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportSymbol" + "'", str3, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "goog.abstractMethod" + "'", str12, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        boolean boolean5 = closureCodingConvention0.isValidEnumKey("hi!");
        boolean boolean7 = closureCodingConvention0.isPrivate("");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = null;
        com.google.javascript.jscomp.Scope scope9 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray10 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList11 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList11, objectTypeArray10);
        java.util.Map<java.lang.String, java.lang.String> strMap13 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry8, scope9, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList11, strMap13);
        boolean boolean16 = closureCodingConvention0.isSuperClassReference("goog.exportSymbol");
        com.google.javascript.rhino.Node node17 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap18 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node17, strMap18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship21 = closureCodingConvention0.getDelegateRelationship(node20);
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection22 = closureCodingConvention0.getAssertionFunctions();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objectTypeArray10);
        org.junit.Assert.assertArrayEquals(objectTypeArray10, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(delegateRelationship21);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection22);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        com.google.javascript.rhino.Node node3 = null;
        boolean boolean4 = closureCodingConvention0.isVarArgsParameter(node3);
        com.google.javascript.rhino.jstype.FunctionType functionType5 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType6 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType7 = null;
        closureCodingConvention0.applySubclassRelationship(functionType5, functionType6, subclassType7);
        boolean boolean11 = closureCodingConvention0.isExported("goog.exportSymbol", true);
        boolean boolean13 = closureCodingConvention0.isExported("goog.abstractMethod");
        java.lang.String str14 = closureCodingConvention0.getDelegateSuperclassName();
        com.google.javascript.rhino.jstype.FunctionType functionType15 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType16 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType17 = null;
        closureCodingConvention0.applySubclassRelationship(functionType15, functionType16, subclassType17);
        boolean boolean21 = closureCodingConvention0.isExported("goog.abstractMethod", false);
        boolean boolean23 = closureCodingConvention0.isConstant("goog.exportSymbol");
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = closureCodingConvention0.extractClassNameIfProvide(node24, node25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.Node node3 = null;
        boolean boolean4 = closureCodingConvention0.isOptionalParameter(node3);
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = closureCodingConvention0.isVarArgsParameter(node5);
        com.google.javascript.rhino.Node node7 = null;
        boolean boolean8 = closureCodingConvention0.isOptionalParameter(node7);
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType12 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType13 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType9, objectType10, objectType11, functionType12, functionType13);
        java.lang.String str15 = closureCodingConvention0.getExportSymbolFunction();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = null;
        com.google.javascript.jscomp.Scope scope17 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention18 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str19 = closureCodingConvention18.getAbstractMethodName();
        java.lang.String str20 = closureCodingConvention18.getGlobalObject();
        java.lang.String str21 = closureCodingConvention18.getExportPropertyFunction();
        boolean boolean23 = closureCodingConvention18.isConstant("");
        boolean boolean26 = closureCodingConvention18.isExported("hi!", false);
        com.google.javascript.rhino.Node node27 = null;
        boolean boolean28 = closureCodingConvention18.isOptionalParameter(node27);
        boolean boolean30 = closureCodingConvention18.isConstant("goog.abstractMethod");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry31 = null;
        com.google.javascript.jscomp.Scope scope32 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray33 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList34 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList34, objectTypeArray33);
        java.util.Map<java.lang.String, java.lang.String> strMap36 = null;
        closureCodingConvention18.defineDelegateProxyPrototypeProperties(jSTypeRegistry31, scope32, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList34, strMap36);
        java.util.Map<java.lang.String, java.lang.String> strMap38 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry16, scope17, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList34, strMap38);
        com.google.javascript.rhino.jstype.FunctionType functionType40 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType41 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType42 = null;
        closureCodingConvention0.applySubclassRelationship(functionType40, functionType41, subclassType42);
        java.lang.String str44 = closureCodingConvention0.getExportPropertyFunction();
        java.lang.String str45 = closureCodingConvention0.getAbstractMethodName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "goog.exportSymbol" + "'", str15, "goog.exportSymbol");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "goog.abstractMethod" + "'", str19, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "goog.global" + "'", str20, "goog.global");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "goog.exportProperty" + "'", str21, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(objectTypeArray33);
        org.junit.Assert.assertArrayEquals(objectTypeArray33, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "goog.exportProperty" + "'", str44, "goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "goog.abstractMethod" + "'", str45, "goog.abstractMethod");
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        boolean boolean4 = closureCodingConvention0.isExported("goog.abstractMethod");
        boolean boolean7 = closureCodingConvention0.isExported("goog.abstractMethod", false);
        boolean boolean9 = closureCodingConvention0.isConstantKey("");
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = closureCodingConvention0.isVarArgsParameter(node10);
        boolean boolean13 = closureCodingConvention0.isValidEnumKey("hi!");
        boolean boolean15 = closureCodingConvention0.isSuperClassReference("hi!");
        boolean boolean17 = closureCodingConvention0.isValidEnumKey("hi!");
        java.lang.String str18 = closureCodingConvention0.getGlobalObject();
        java.lang.String str19 = closureCodingConvention0.getAbstractMethodName();
        java.lang.Class<?> wildcardClass20 = closureCodingConvention0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "goog.global" + "'", str18, "goog.global");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "goog.abstractMethod" + "'", str19, "goog.abstractMethod");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        com.google.javascript.rhino.Node node3 = null;
        boolean boolean4 = closureCodingConvention0.isVarArgsParameter(node3);
        boolean boolean6 = closureCodingConvention0.isExported("goog.exportProperty");
        com.google.javascript.rhino.Node node7 = null;
        boolean boolean8 = closureCodingConvention0.isVarArgsParameter(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship10 = closureCodingConvention0.getDelegateRelationship(node9);
        boolean boolean12 = closureCodingConvention0.isValidEnumKey("");
        com.google.javascript.rhino.jstype.FunctionType functionType13 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType14 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            closureCodingConvention0.applySingletonGetter(functionType13, functionType14, objectType15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(delegateRelationship10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        boolean boolean5 = closureCodingConvention0.isValidEnumKey("hi!");
        boolean boolean7 = closureCodingConvention0.isPrivate("");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = null;
        com.google.javascript.jscomp.Scope scope9 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray10 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList11 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList11, objectTypeArray10);
        java.util.Map<java.lang.String, java.lang.String> strMap13 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry8, scope9, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList11, strMap13);
        com.google.javascript.rhino.Node node15 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap16 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node15, strMap16);
        boolean boolean19 = closureCodingConvention0.isPrivate("goog.exportProperty");
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship21 = closureCodingConvention0.getDelegateRelationship(node20);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objectTypeArray10);
        org.junit.Assert.assertArrayEquals(objectTypeArray10, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(delegateRelationship21);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        boolean boolean4 = closureCodingConvention0.isExported("goog.abstractMethod");
        java.lang.String str5 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean7 = closureCodingConvention0.isConstant("hi!");
        boolean boolean9 = closureCodingConvention0.isExported("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "goog.exportSymbol" + "'", str5, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        java.lang.String str4 = closureCodingConvention0.getDelegateSuperclassName();
        boolean boolean6 = closureCodingConvention0.isValidEnumKey("goog.abstractMethod");
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection7 = closureCodingConvention0.getAssertionFunctions();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection7);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        boolean boolean5 = closureCodingConvention0.isConstantKey("goog.abstractMethod");
        boolean boolean7 = closureCodingConvention0.isSuperClassReference("goog.global");
        java.lang.String str8 = closureCodingConvention0.getDelegateSuperclassName();
        java.lang.String str9 = closureCodingConvention0.getExportSymbolFunction();
        java.lang.String str10 = closureCodingConvention0.getGlobalObject();
        boolean boolean12 = closureCodingConvention0.isValidEnumKey("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "goog.exportSymbol" + "'", str9, "goog.exportSymbol");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "goog.global" + "'", str10, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        com.google.javascript.rhino.Node node3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList4 = closureCodingConvention0.identifyTypeDeclarationCall(node3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.Node node4 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node4, strMap5);
        java.lang.String str7 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean9 = closureCodingConvention0.isPrivate("hi!");
        boolean boolean12 = closureCodingConvention0.isExported("", true);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "goog.exportSymbol" + "'", str7, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.exportProperty");
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection6 = closureCodingConvention0.getAssertionFunctions();
        com.google.javascript.rhino.Node node7 = null;
        boolean boolean8 = closureCodingConvention0.isOptionalParameter(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = closureCodingConvention0.extractClassNameIfProvide(node9, node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.exportProperty");
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = closureCodingConvention0.isPropertyTestFunction(node6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.Node node4 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node4, strMap5);
        boolean boolean8 = closureCodingConvention0.isConstant("");
        com.google.javascript.rhino.Node node9 = null;
        boolean boolean10 = closureCodingConvention0.isVarArgsParameter(node9);
        com.google.javascript.rhino.Node node11 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap12 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node11, strMap12);
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.Bind bind15 = closureCodingConvention0.describeFunctionBind(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        boolean boolean4 = closureCodingConvention0.isExported("goog.abstractMethod");
        boolean boolean7 = closureCodingConvention0.isExported("goog.abstractMethod", false);
        boolean boolean9 = closureCodingConvention0.isConstantKey("");
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = closureCodingConvention0.isVarArgsParameter(node10);
        boolean boolean13 = closureCodingConvention0.isValidEnumKey("hi!");
        boolean boolean15 = closureCodingConvention0.isSuperClassReference("hi!");
        java.lang.String str16 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.Node node17 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap18 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node17, strMap18);
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship21 = closureCodingConvention0.getClassesDefinedByCall(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "goog.exportProperty" + "'", str16, "goog.exportProperty");
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.exportProperty");
        boolean boolean7 = closureCodingConvention0.isValidEnumKey("goog.global");
        com.google.javascript.rhino.jstype.FunctionType functionType8 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType9 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType10 = null;
        closureCodingConvention0.applySubclassRelationship(functionType8, functionType9, subclassType10);
        com.google.javascript.rhino.Node node12 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap13 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node12, strMap13);
        java.lang.String str15 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.jstype.FunctionType functionType16 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType17 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType18 = null;
        closureCodingConvention0.applySubclassRelationship(functionType16, functionType17, subclassType18);
        boolean boolean21 = closureCodingConvention0.isPrivate("goog.exportProperty");
        java.lang.String str22 = closureCodingConvention0.getDelegateSuperclassName();
        boolean boolean24 = closureCodingConvention0.isPrivate("");
        boolean boolean27 = closureCodingConvention0.isExported("", false);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = closureCodingConvention0.extractClassNameIfProvide(node28, node29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "goog.abstractMethod" + "'", str15, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        boolean boolean4 = closureCodingConvention0.isExported("goog.abstractMethod");
        boolean boolean7 = closureCodingConvention0.isExported("goog.abstractMethod", false);
        boolean boolean9 = closureCodingConvention0.isConstantKey("");
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = closureCodingConvention0.isVarArgsParameter(node10);
        boolean boolean13 = closureCodingConvention0.isConstantKey("goog.global");
        boolean boolean15 = closureCodingConvention0.isConstant("");
        com.google.javascript.rhino.Node node16 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node16, strMap17);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        java.lang.String str3 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.abstractMethod");
        boolean boolean7 = closureCodingConvention0.isConstantKey("hi!");
        java.lang.String str8 = closureCodingConvention0.getGlobalObject();
        boolean boolean10 = closureCodingConvention0.isConstantKey("hi!");
        com.google.javascript.rhino.Node node11 = null;
        boolean boolean12 = closureCodingConvention0.isOptionalParameter(node11);
        com.google.javascript.rhino.Node node13 = null;
        boolean boolean14 = closureCodingConvention0.isVarArgsParameter(node13);
        java.lang.String str15 = closureCodingConvention0.getGlobalObject();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection16 = closureCodingConvention0.getAssertionFunctions();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection17 = closureCodingConvention0.getAssertionFunctions();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection18 = closureCodingConvention0.getAssertionFunctions();
        com.google.javascript.rhino.Node node19 = null;
        boolean boolean20 = closureCodingConvention0.isVarArgsParameter(node19);
        java.lang.String str21 = closureCodingConvention0.getAbstractMethodName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportSymbol" + "'", str3, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "goog.global" + "'", str8, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "goog.global" + "'", str15, "goog.global");
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection16);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection17);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "goog.abstractMethod" + "'", str21, "goog.abstractMethod");
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        java.lang.String str3 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean5 = closureCodingConvention0.isSuperClassReference("goog.exportProperty");
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = closureCodingConvention0.isOptionalParameter(node6);
        com.google.javascript.rhino.Node node8 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node8, strMap9);
        boolean boolean13 = closureCodingConvention0.isExported("goog.abstractMethod", true);
        boolean boolean15 = closureCodingConvention0.isConstantKey("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportSymbol" + "'", str3, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        java.lang.String str3 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean5 = closureCodingConvention0.isSuperClassReference("goog.exportProperty");
        boolean boolean7 = closureCodingConvention0.isSuperClassReference("goog.exportSymbol");
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship9 = closureCodingConvention0.getDelegateRelationship(node8);
        com.google.javascript.rhino.jstype.FunctionType functionType10 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType11 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType12 = null;
        closureCodingConvention0.applySubclassRelationship(functionType10, functionType11, subclassType12);
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType17 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType18 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType14, objectType15, objectType16, functionType17, functionType18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = closureCodingConvention0.isOptionalParameter(node20);
        java.lang.String str22 = closureCodingConvention0.getAbstractMethodName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportSymbol" + "'", str3, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(delegateRelationship9);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "goog.abstractMethod" + "'", str22, "goog.abstractMethod");
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean5 = closureCodingConvention0.isConstant("");
        boolean boolean8 = closureCodingConvention0.isExported("hi!", false);
        com.google.javascript.rhino.Node node9 = null;
        boolean boolean10 = closureCodingConvention0.isOptionalParameter(node9);
        boolean boolean13 = closureCodingConvention0.isExported("goog.global", true);
        com.google.javascript.rhino.jstype.FunctionType functionType14 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType15 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType16 = null;
        closureCodingConvention0.applySubclassRelationship(functionType14, functionType15, subclassType16);
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection18 = closureCodingConvention0.getAssertionFunctions();
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship20 = closureCodingConvention0.getDelegateRelationship(node19);
        com.google.javascript.rhino.Node node21 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = closureCodingConvention0.isPropertyTestFunction(node21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection18);
        org.junit.Assert.assertNull(delegateRelationship20);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.Node node3 = null;
        boolean boolean4 = closureCodingConvention0.isOptionalParameter(node3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType8 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType9 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType5, objectType6, objectType7, functionType8, functionType9);
        boolean boolean12 = closureCodingConvention0.isConstantKey("");
        java.lang.String str13 = closureCodingConvention0.getGlobalObject();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "goog.global" + "'", str13, "goog.global");
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        boolean boolean4 = closureCodingConvention0.isExported("goog.global");
        java.lang.String str5 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship7 = closureCodingConvention0.getDelegateRelationship(node6);
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection8 = closureCodingConvention0.getAssertionFunctions();
        com.google.javascript.rhino.Node node9 = null;
        boolean boolean10 = closureCodingConvention0.isVarArgsParameter(node9);
        com.google.javascript.rhino.Node node11 = null;
        boolean boolean12 = closureCodingConvention0.isOptionalParameter(node11);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = null;
        com.google.javascript.jscomp.Scope scope14 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention15 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str16 = closureCodingConvention15.getDelegateSuperclassName();
        java.lang.String str17 = closureCodingConvention15.getExportSymbolFunction();
        boolean boolean19 = closureCodingConvention15.isPrivate("hi!");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = null;
        com.google.javascript.jscomp.Scope scope21 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray22 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList23 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList23, objectTypeArray22);
        java.util.Map<java.lang.String, java.lang.String> strMap25 = null;
        closureCodingConvention15.defineDelegateProxyPrototypeProperties(jSTypeRegistry20, scope21, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList23, strMap25);
        java.util.Map<java.lang.String, java.lang.String> strMap27 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry13, scope14, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList23, strMap27);
        boolean boolean31 = closureCodingConvention0.isExported("goog.exportSymbol", false);
        com.google.javascript.rhino.jstype.FunctionType functionType32 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType33 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType34 = null;
        // The following exception was thrown during execution in test generation
        try {
            closureCodingConvention0.applySingletonGetter(functionType32, functionType33, objectType34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "goog.exportProperty" + "'", str5, "goog.exportProperty");
        org.junit.Assert.assertNull(delegateRelationship7);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "goog.exportSymbol" + "'", str17, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objectTypeArray22);
        org.junit.Assert.assertArrayEquals(objectTypeArray22, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        java.lang.String str3 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.abstractMethod");
        boolean boolean7 = closureCodingConvention0.isConstantKey("hi!");
        java.lang.String str8 = closureCodingConvention0.getExportSymbolFunction();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = null;
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast objectLiteralCast11 = closureCodingConvention0.getObjectLiteralCast(nodeTraversal9, node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportSymbol" + "'", str3, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "goog.exportSymbol" + "'", str8, "goog.exportSymbol");
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        java.lang.String str3 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.abstractMethod");
        boolean boolean7 = closureCodingConvention0.isConstantKey("hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType8 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType9 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType10 = null;
        closureCodingConvention0.applySubclassRelationship(functionType8, functionType9, subclassType10);
        boolean boolean14 = closureCodingConvention0.isExported("goog.exportSymbol", true);
        com.google.javascript.rhino.Node node15 = null;
        boolean boolean16 = closureCodingConvention0.isVarArgsParameter(node15);
        java.lang.String str17 = closureCodingConvention0.getDelegateSuperclassName();
        boolean boolean20 = closureCodingConvention0.isExported("goog.exportProperty", false);
        boolean boolean22 = closureCodingConvention0.isConstantKey("goog.global");
        com.google.javascript.rhino.Node node23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList24 = closureCodingConvention0.identifyTypeDeclarationCall(node23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportSymbol" + "'", str3, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        java.lang.String str4 = closureCodingConvention0.getExportSymbolFunction();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal5 = null;
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast objectLiteralCast7 = closureCodingConvention0.getObjectLiteralCast(nodeTraversal5, node6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "goog.exportSymbol" + "'", str4, "goog.exportSymbol");
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = closureCodingConvention0.isOptionalParameter(node4);
        java.lang.String str6 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.Node node7 = null;
        boolean boolean8 = closureCodingConvention0.isOptionalParameter(node7);
        com.google.javascript.rhino.Node node9 = null;
        boolean boolean10 = closureCodingConvention0.isOptionalParameter(node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType12 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType13 = null;
        closureCodingConvention0.applySubclassRelationship(functionType11, functionType12, subclassType13);
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection15 = closureCodingConvention0.getAssertionFunctions();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "goog.global" + "'", str6, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection15);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean3 = closureCodingConvention0.isValidEnumKey("goog.global");
        java.lang.String str4 = closureCodingConvention0.getDelegateSuperclassName();
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = closureCodingConvention0.isOptionalParameter(node5);
        boolean boolean9 = closureCodingConvention0.isExported("goog.exportProperty", true);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.exportSymbol" + "'", str1, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        com.google.javascript.rhino.Node node3 = null;
        boolean boolean4 = closureCodingConvention0.isVarArgsParameter(node3);
        com.google.javascript.rhino.jstype.FunctionType functionType5 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType6 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType7 = null;
        closureCodingConvention0.applySubclassRelationship(functionType5, functionType6, subclassType7);
        boolean boolean11 = closureCodingConvention0.isExported("goog.exportSymbol", true);
        boolean boolean13 = closureCodingConvention0.isExported("goog.abstractMethod");
        java.lang.String str14 = closureCodingConvention0.getDelegateSuperclassName();
        com.google.javascript.rhino.jstype.FunctionType functionType15 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType16 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType17 = null;
        closureCodingConvention0.applySubclassRelationship(functionType15, functionType16, subclassType17);
        boolean boolean21 = closureCodingConvention0.isExported("goog.abstractMethod", false);
        java.lang.String str22 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.jstype.FunctionType functionType23 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType24 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType25 = null;
        // The following exception was thrown during execution in test generation
        try {
            closureCodingConvention0.applySingletonGetter(functionType23, functionType24, objectType25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "goog.abstractMethod" + "'", str22, "goog.abstractMethod");
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        boolean boolean4 = closureCodingConvention0.isExported("goog.abstractMethod");
        boolean boolean7 = closureCodingConvention0.isExported("goog.abstractMethod", false);
        boolean boolean9 = closureCodingConvention0.isConstantKey("");
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = closureCodingConvention0.isVarArgsParameter(node10);
        java.lang.String str12 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean14 = closureCodingConvention0.isConstantKey("");
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship16 = closureCodingConvention0.getDelegateRelationship(node15);
        java.lang.String str17 = closureCodingConvention0.getDelegateSuperclassName();
        boolean boolean19 = closureCodingConvention0.isConstantKey("goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "goog.exportProperty" + "'", str12, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(delegateRelationship16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.exportProperty");
        java.lang.String str6 = closureCodingConvention0.getDelegateSuperclassName();
        boolean boolean8 = closureCodingConvention0.isSuperClassReference("goog.abstractMethod");
        com.google.javascript.rhino.jstype.FunctionType functionType9 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType10 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType11 = null;
        closureCodingConvention0.applySubclassRelationship(functionType9, functionType10, subclassType11);
        com.google.javascript.rhino.Node node13 = null;
        boolean boolean14 = closureCodingConvention0.isVarArgsParameter(node13);
        boolean boolean16 = closureCodingConvention0.isConstant("goog.abstractMethod");
        com.google.javascript.rhino.Node node17 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap18 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node17, strMap18);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getDelegateSuperclassName();
        java.lang.String str2 = closureCodingConvention0.getAbstractMethodName();
        boolean boolean4 = closureCodingConvention0.isSuperClassReference("goog.exportProperty");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.abstractMethod" + "'", str2, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean5 = closureCodingConvention0.isConstant("");
        boolean boolean8 = closureCodingConvention0.isExported("hi!", false);
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship10 = closureCodingConvention0.getClassesDefinedByCall(node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getDelegateSuperclassName();
        boolean boolean3 = closureCodingConvention0.isConstant("hi!");
        java.lang.String str4 = closureCodingConvention0.getDelegateSuperclassName();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = null;
        com.google.javascript.jscomp.Scope scope6 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention7 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str8 = closureCodingConvention7.getDelegateSuperclassName();
        java.lang.String str9 = closureCodingConvention7.getExportSymbolFunction();
        boolean boolean11 = closureCodingConvention7.isPrivate("hi!");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = null;
        com.google.javascript.jscomp.Scope scope13 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray14 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList15 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList15, objectTypeArray14);
        java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
        closureCodingConvention7.defineDelegateProxyPrototypeProperties(jSTypeRegistry12, scope13, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList15, strMap17);
        java.util.Map<java.lang.String, java.lang.String> strMap19 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry5, scope6, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList15, strMap19);
        com.google.javascript.rhino.Node node21 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap22 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node21, strMap22);
        boolean boolean25 = closureCodingConvention0.isExported("goog.exportSymbol");
        java.lang.Class<?> wildcardClass26 = closureCodingConvention0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "goog.exportSymbol" + "'", str9, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objectTypeArray14);
        org.junit.Assert.assertArrayEquals(objectTypeArray14, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        java.lang.String str3 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.abstractMethod");
        boolean boolean7 = closureCodingConvention0.isConstantKey("hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType8 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType9 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType10 = null;
        closureCodingConvention0.applySubclassRelationship(functionType8, functionType9, subclassType10);
        com.google.javascript.rhino.Node node12 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap13 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node12, strMap13);
        java.lang.String str15 = closureCodingConvention0.getExportSymbolFunction();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportSymbol" + "'", str3, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "goog.exportSymbol" + "'", str15, "goog.exportSymbol");
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.Node node4 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node4, strMap5);
        java.lang.String str7 = closureCodingConvention0.getExportSymbolFunction();
        java.lang.String str8 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.Node node9 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node9, strMap10);
        java.lang.String str12 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = closureCodingConvention0.extractClassNameIfRequire(node13, node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "goog.exportSymbol" + "'", str7, "goog.exportSymbol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "goog.global" + "'", str8, "goog.global");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "goog.global" + "'", str12, "goog.global");
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        com.google.javascript.rhino.Node node3 = null;
        boolean boolean4 = closureCodingConvention0.isVarArgsParameter(node3);
        boolean boolean6 = closureCodingConvention0.isExported("goog.exportProperty");
        com.google.javascript.rhino.Node node7 = null;
        boolean boolean8 = closureCodingConvention0.isVarArgsParameter(node7);
        com.google.javascript.rhino.Node node9 = null;
        boolean boolean10 = closureCodingConvention0.isVarArgsParameter(node9);
        boolean boolean13 = closureCodingConvention0.isExported("", true);
        boolean boolean15 = closureCodingConvention0.isConstant("");
        boolean boolean17 = closureCodingConvention0.isConstant("goog.global");
        boolean boolean19 = closureCodingConvention0.isConstantKey("goog.exportProperty");
        java.lang.String str20 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean22 = closureCodingConvention0.isValidEnumKey("goog.global");
        com.google.javascript.rhino.Node node23 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap24 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node23, strMap24);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "goog.exportProperty" + "'", str20, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.Node node3 = null;
        boolean boolean4 = closureCodingConvention0.isOptionalParameter(node3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType8 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType9 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType5, objectType6, objectType7, functionType8, functionType9);
        boolean boolean13 = closureCodingConvention0.isExported("goog.exportSymbol", false);
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = closureCodingConvention0.getSingletonGetterClassName(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        java.lang.String str3 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean5 = closureCodingConvention0.isSuperClassReference("goog.exportProperty");
        boolean boolean7 = closureCodingConvention0.isSuperClassReference("goog.exportSymbol");
        java.lang.String str8 = closureCodingConvention0.getExportPropertyFunction();
        java.lang.String str9 = closureCodingConvention0.getAbstractMethodName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportSymbol" + "'", str3, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "goog.exportProperty" + "'", str8, "goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "goog.abstractMethod" + "'", str9, "goog.abstractMethod");
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        com.google.javascript.rhino.Node node3 = null;
        boolean boolean4 = closureCodingConvention0.isVarArgsParameter(node3);
        boolean boolean6 = closureCodingConvention0.isExported("goog.exportProperty");
        boolean boolean8 = closureCodingConvention0.isPrivate("goog.global");
        java.lang.String str9 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = closureCodingConvention0.isVarArgsParameter(node10);
        java.lang.String str12 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean14 = closureCodingConvention0.isConstant("goog.exportProperty");
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection15 = closureCodingConvention0.getAssertionFunctions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "goog.exportProperty" + "'", str9, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "goog.exportSymbol" + "'", str12, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection15);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.exportProperty");
        boolean boolean7 = closureCodingConvention0.isPrivate("hi!");
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = closureCodingConvention0.isVarArgsParameter(node8);
        java.lang.String str10 = closureCodingConvention0.getDelegateSuperclassName();
        boolean boolean12 = closureCodingConvention0.isExported("");
        com.google.javascript.rhino.Node node13 = null;
        boolean boolean14 = closureCodingConvention0.isVarArgsParameter(node13);
        boolean boolean16 = closureCodingConvention0.isConstantKey("goog.exportSymbol");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        boolean boolean4 = closureCodingConvention0.isExported("goog.abstractMethod");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = null;
        com.google.javascript.jscomp.Scope scope6 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention7 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str8 = closureCodingConvention7.getAbstractMethodName();
        java.lang.String str9 = closureCodingConvention7.getGlobalObject();
        java.lang.String str10 = closureCodingConvention7.getGlobalObject();
        boolean boolean12 = closureCodingConvention7.isValidEnumKey("hi!");
        boolean boolean14 = closureCodingConvention7.isPrivate("");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = null;
        com.google.javascript.jscomp.Scope scope16 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray17 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList18 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList18, objectTypeArray17);
        java.util.Map<java.lang.String, java.lang.String> strMap20 = null;
        closureCodingConvention7.defineDelegateProxyPrototypeProperties(jSTypeRegistry15, scope16, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList18, strMap20);
        java.util.Map<java.lang.String, java.lang.String> strMap22 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry5, scope6, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList18, strMap22);
        java.lang.String str24 = closureCodingConvention0.getGlobalObject();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "goog.abstractMethod" + "'", str8, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "goog.global" + "'", str9, "goog.global");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "goog.global" + "'", str10, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(objectTypeArray17);
        org.junit.Assert.assertArrayEquals(objectTypeArray17, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "goog.global" + "'", str24, "goog.global");
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        boolean boolean5 = closureCodingConvention0.isPrivate("");
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection6 = closureCodingConvention0.getAssertionFunctions();
        boolean boolean8 = closureCodingConvention0.isConstantKey("goog.abstractMethod");
        com.google.javascript.rhino.jstype.FunctionType functionType9 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType10 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType11 = null;
        closureCodingConvention0.applySubclassRelationship(functionType9, functionType10, subclassType11);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast objectLiteralCast15 = closureCodingConvention0.getObjectLiteralCast(nodeTraversal13, node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        java.lang.String str3 = closureCodingConvention0.getDelegateSuperclassName();
        com.google.javascript.rhino.Node node4 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node4, strMap5);
        boolean boolean8 = closureCodingConvention0.isConstant("goog.abstractMethod");
        boolean boolean10 = closureCodingConvention0.isSuperClassReference("");
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship12 = closureCodingConvention0.getDelegateRelationship(node11);
        java.lang.String str13 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = closureCodingConvention0.getSingletonGetterClassName(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(delegateRelationship12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "goog.exportProperty" + "'", str13, "goog.exportProperty");
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = closureCodingConvention0.isOptionalParameter(node4);
        boolean boolean7 = closureCodingConvention0.isSuperClassReference("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        boolean boolean5 = closureCodingConvention0.isValidEnumKey("hi!");
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = closureCodingConvention0.isVarArgsParameter(node6);
        java.lang.String str8 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType12 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType13 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType9, objectType10, objectType11, functionType12, functionType13);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = null;
        com.google.javascript.jscomp.Scope scope16 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention17 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str18 = closureCodingConvention17.getAbstractMethodName();
        java.lang.String str19 = closureCodingConvention17.getGlobalObject();
        java.lang.String str20 = closureCodingConvention17.getGlobalObject();
        boolean boolean22 = closureCodingConvention17.isValidEnumKey("hi!");
        boolean boolean24 = closureCodingConvention17.isPrivate("");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = null;
        com.google.javascript.jscomp.Scope scope26 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray27 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList28 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList28, objectTypeArray27);
        java.util.Map<java.lang.String, java.lang.String> strMap30 = null;
        closureCodingConvention17.defineDelegateProxyPrototypeProperties(jSTypeRegistry25, scope26, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList28, strMap30);
        java.util.Map<java.lang.String, java.lang.String> strMap32 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry15, scope16, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList28, strMap32);
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection34 = closureCodingConvention0.getAssertionFunctions();
        boolean boolean37 = closureCodingConvention0.isExported("hi!", false);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.rhino.Node node39 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str40 = closureCodingConvention0.extractClassNameIfProvide(node38, node39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "goog.abstractMethod" + "'", str8, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "goog.abstractMethod" + "'", str18, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "goog.global" + "'", str19, "goog.global");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "goog.global" + "'", str20, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objectTypeArray27);
        org.junit.Assert.assertArrayEquals(objectTypeArray27, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        java.lang.String str3 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.abstractMethod");
        boolean boolean7 = closureCodingConvention0.isConstantKey("hi!");
        java.lang.String str8 = closureCodingConvention0.getGlobalObject();
        boolean boolean10 = closureCodingConvention0.isConstantKey("hi!");
        java.lang.String str11 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str12 = closureCodingConvention0.getAbstractMethodName();
        boolean boolean14 = closureCodingConvention0.isConstantKey("goog.exportSymbol");
        com.google.javascript.rhino.Node node15 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap16 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node15, strMap16);
        com.google.javascript.rhino.jstype.ObjectType objectType18 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType21 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType22 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType18, objectType19, objectType20, functionType21, functionType22);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportSymbol" + "'", str3, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "goog.global" + "'", str8, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "goog.abstractMethod" + "'", str11, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "goog.abstractMethod" + "'", str12, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        java.lang.String str3 = closureCodingConvention0.getDelegateSuperclassName();
        com.google.javascript.rhino.Node node4 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node4, strMap5);
        boolean boolean8 = closureCodingConvention0.isConstant("goog.abstractMethod");
        boolean boolean10 = closureCodingConvention0.isSuperClassReference("");
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship12 = closureCodingConvention0.getDelegateRelationship(node11);
        boolean boolean14 = closureCodingConvention0.isPrivate("goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(delegateRelationship12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        java.lang.String str3 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean5 = closureCodingConvention0.isSuperClassReference("goog.exportProperty");
        boolean boolean7 = closureCodingConvention0.isSuperClassReference("goog.exportSymbol");
        java.lang.String str8 = closureCodingConvention0.getExportPropertyFunction();
        java.lang.String str9 = closureCodingConvention0.getExportSymbolFunction();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportSymbol" + "'", str3, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "goog.exportProperty" + "'", str8, "goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "goog.exportSymbol" + "'", str9, "goog.exportSymbol");
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean5 = closureCodingConvention0.isConstant("");
        boolean boolean7 = closureCodingConvention0.isConstant("goog.exportSymbol");
        boolean boolean9 = closureCodingConvention0.isSuperClassReference("goog.global");
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = closureCodingConvention0.isOptionalParameter(node10);
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = closureCodingConvention0.isPropertyTestFunction(node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        java.lang.String str4 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = closureCodingConvention0.isVarArgsParameter(node5);
        boolean boolean8 = closureCodingConvention0.isSuperClassReference("goog.exportSymbol");
        boolean boolean10 = closureCodingConvention0.isConstantKey("hi!");
        com.google.javascript.rhino.Node node11 = null;
        boolean boolean12 = closureCodingConvention0.isVarArgsParameter(node11);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "goog.abstractMethod" + "'", str4, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        com.google.javascript.rhino.Node node3 = null;
        boolean boolean4 = closureCodingConvention0.isVarArgsParameter(node3);
        boolean boolean6 = closureCodingConvention0.isExported("goog.exportProperty");
        com.google.javascript.rhino.Node node7 = null;
        boolean boolean8 = closureCodingConvention0.isVarArgsParameter(node7);
        com.google.javascript.rhino.Node node9 = null;
        boolean boolean10 = closureCodingConvention0.isVarArgsParameter(node9);
        java.lang.String str11 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.Node node12 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap13 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node12, strMap13);
        boolean boolean16 = closureCodingConvention0.isPrivate("goog.exportSymbol");
        com.google.javascript.rhino.jstype.FunctionType functionType17 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType18 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType19 = null;
        closureCodingConvention0.applySubclassRelationship(functionType17, functionType18, subclassType19);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "goog.global" + "'", str11, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getDelegateSuperclassName();
        java.lang.String str2 = closureCodingConvention0.getExportSymbolFunction();
        java.lang.String str3 = closureCodingConvention0.getDelegateSuperclassName();
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = closureCodingConvention0.isOptionalParameter(node4);
        java.lang.String str6 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = null;
        com.google.javascript.jscomp.Scope scope8 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention9 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str10 = closureCodingConvention9.getAbstractMethodName();
        java.lang.String str11 = closureCodingConvention9.getGlobalObject();
        java.lang.String str12 = closureCodingConvention9.getGlobalObject();
        boolean boolean14 = closureCodingConvention9.isConstant("goog.global");
        com.google.javascript.rhino.Node node15 = null;
        boolean boolean16 = closureCodingConvention9.isVarArgsParameter(node15);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = null;
        com.google.javascript.jscomp.Scope scope18 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention19 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str20 = closureCodingConvention19.getAbstractMethodName();
        java.lang.String str21 = closureCodingConvention19.getGlobalObject();
        java.lang.String str22 = closureCodingConvention19.getGlobalObject();
        boolean boolean24 = closureCodingConvention19.isValidEnumKey("hi!");
        com.google.javascript.rhino.Node node25 = null;
        boolean boolean26 = closureCodingConvention19.isVarArgsParameter(node25);
        java.lang.String str27 = closureCodingConvention19.getAbstractMethodName();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = null;
        com.google.javascript.jscomp.Scope scope29 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention30 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str31 = closureCodingConvention30.getAbstractMethodName();
        java.lang.String str32 = closureCodingConvention30.getGlobalObject();
        java.lang.String str33 = closureCodingConvention30.getGlobalObject();
        boolean boolean35 = closureCodingConvention30.isValidEnumKey("hi!");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry36 = null;
        com.google.javascript.jscomp.Scope scope37 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention38 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean40 = closureCodingConvention38.isConstantKey("");
        java.lang.String str41 = closureCodingConvention38.getExportSymbolFunction();
        boolean boolean43 = closureCodingConvention38.isPrivate("goog.abstractMethod");
        boolean boolean45 = closureCodingConvention38.isConstantKey("hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType46 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType47 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType48 = null;
        closureCodingConvention38.applySubclassRelationship(functionType46, functionType47, subclassType48);
        boolean boolean52 = closureCodingConvention38.isExported("goog.exportSymbol", true);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry53 = null;
        com.google.javascript.jscomp.Scope scope54 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention55 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str56 = closureCodingConvention55.getAbstractMethodName();
        java.lang.String str57 = closureCodingConvention55.getGlobalObject();
        java.lang.String str58 = closureCodingConvention55.getExportPropertyFunction();
        boolean boolean60 = closureCodingConvention55.isConstant("");
        boolean boolean63 = closureCodingConvention55.isExported("hi!", false);
        com.google.javascript.rhino.Node node64 = null;
        boolean boolean65 = closureCodingConvention55.isOptionalParameter(node64);
        boolean boolean67 = closureCodingConvention55.isConstant("goog.abstractMethod");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry68 = null;
        com.google.javascript.jscomp.Scope scope69 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray70 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList71 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList71, objectTypeArray70);
        java.util.Map<java.lang.String, java.lang.String> strMap73 = null;
        closureCodingConvention55.defineDelegateProxyPrototypeProperties(jSTypeRegistry68, scope69, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList71, strMap73);
        java.util.Map<java.lang.String, java.lang.String> strMap75 = null;
        closureCodingConvention38.defineDelegateProxyPrototypeProperties(jSTypeRegistry53, scope54, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList71, strMap75);
        java.util.Map<java.lang.String, java.lang.String> strMap77 = null;
        closureCodingConvention30.defineDelegateProxyPrototypeProperties(jSTypeRegistry36, scope37, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList71, strMap77);
        java.util.Map<java.lang.String, java.lang.String> strMap79 = null;
        closureCodingConvention19.defineDelegateProxyPrototypeProperties(jSTypeRegistry28, scope29, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList71, strMap79);
        java.util.Map<java.lang.String, java.lang.String> strMap81 = null;
        closureCodingConvention9.defineDelegateProxyPrototypeProperties(jSTypeRegistry17, scope18, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList71, strMap81);
        java.util.Map<java.lang.String, java.lang.String> strMap83 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry7, scope8, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList71, strMap83);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.exportSymbol" + "'", str2, "goog.exportSymbol");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "goog.abstractMethod" + "'", str6, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "goog.abstractMethod" + "'", str10, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "goog.global" + "'", str11, "goog.global");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "goog.global" + "'", str12, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "goog.abstractMethod" + "'", str20, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "goog.global" + "'", str21, "goog.global");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "goog.global" + "'", str22, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "goog.abstractMethod" + "'", str27, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "goog.abstractMethod" + "'", str31, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "goog.global" + "'", str32, "goog.global");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "goog.global" + "'", str33, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "goog.exportSymbol" + "'", str41, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "goog.abstractMethod" + "'", str56, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "goog.global" + "'", str57, "goog.global");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "goog.exportProperty" + "'", str58, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(objectTypeArray70);
        org.junit.Assert.assertArrayEquals(objectTypeArray70, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        java.lang.String str3 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean5 = closureCodingConvention0.isSuperClassReference("goog.exportProperty");
        com.google.javascript.rhino.Node node6 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap7 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node6, strMap7);
        java.lang.String str9 = closureCodingConvention0.getDelegateSuperclassName();
        java.lang.String str10 = closureCodingConvention0.getExportSymbolFunction();
        com.google.javascript.rhino.jstype.FunctionType functionType11 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType12 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType13 = null;
        closureCodingConvention0.applySubclassRelationship(functionType11, functionType12, subclassType13);
        com.google.javascript.rhino.jstype.FunctionType functionType15 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType16 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType17 = null;
        closureCodingConvention0.applySubclassRelationship(functionType15, functionType16, subclassType17);
        java.lang.String str19 = closureCodingConvention0.getExportSymbolFunction();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        com.google.javascript.rhino.Node node21 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast objectLiteralCast22 = closureCodingConvention0.getObjectLiteralCast(nodeTraversal20, node21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportSymbol" + "'", str3, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "goog.exportSymbol" + "'", str10, "goog.exportSymbol");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "goog.exportSymbol" + "'", str19, "goog.exportSymbol");
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        boolean boolean5 = closureCodingConvention0.isValidEnumKey("hi!");
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = closureCodingConvention0.isVarArgsParameter(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = closureCodingConvention0.isVarArgsParameter(node8);
        java.lang.String str10 = closureCodingConvention0.getExportPropertyFunction();
        java.lang.String str11 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.jstype.FunctionType functionType12 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType13 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType14 = null;
        closureCodingConvention0.applySubclassRelationship(functionType12, functionType13, subclassType14);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "goog.exportProperty" + "'", str10, "goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "goog.global" + "'", str11, "goog.global");
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        boolean boolean4 = closureCodingConvention0.isExported("goog.abstractMethod");
        boolean boolean7 = closureCodingConvention0.isExported("goog.abstractMethod", false);
        com.google.javascript.rhino.Node node8 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node8, strMap9);
        java.lang.String str11 = closureCodingConvention0.getDelegateSuperclassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        java.lang.String str3 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.abstractMethod");
        boolean boolean7 = closureCodingConvention0.isConstantKey("hi!");
        java.lang.String str8 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.Node node9 = null;
        boolean boolean10 = closureCodingConvention0.isVarArgsParameter(node9);
        boolean boolean12 = closureCodingConvention0.isPrivate("goog.abstractMethod");
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType16 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType17 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType13, objectType14, objectType15, functionType16, functionType17);
        com.google.javascript.rhino.Node node19 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap20 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node19, strMap20);
        java.lang.String str22 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.Node node23 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap24 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node23, strMap24);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportSymbol" + "'", str3, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "goog.global" + "'", str8, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "goog.abstractMethod" + "'", str22, "goog.abstractMethod");
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        boolean boolean5 = closureCodingConvention0.isValidEnumKey("hi!");
        boolean boolean7 = closureCodingConvention0.isPrivate("");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = null;
        com.google.javascript.jscomp.Scope scope9 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray10 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList11 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList11, objectTypeArray10);
        java.util.Map<java.lang.String, java.lang.String> strMap13 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry8, scope9, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList11, strMap13);
        boolean boolean16 = closureCodingConvention0.isSuperClassReference("goog.exportSymbol");
        boolean boolean18 = closureCodingConvention0.isValidEnumKey("hi!");
        boolean boolean20 = closureCodingConvention0.isExported("goog.exportProperty");
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection21 = closureCodingConvention0.getAssertionFunctions();
        boolean boolean23 = closureCodingConvention0.isExported("goog.exportProperty");
        java.lang.String str24 = closureCodingConvention0.getDelegateSuperclassName();
        java.lang.String str25 = closureCodingConvention0.getGlobalObject();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection26 = closureCodingConvention0.getAssertionFunctions();
        java.lang.String str27 = closureCodingConvention0.getExportPropertyFunction();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objectTypeArray10);
        org.junit.Assert.assertArrayEquals(objectTypeArray10, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "goog.global" + "'", str25, "goog.global");
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "goog.exportProperty" + "'", str27, "goog.exportProperty");
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.Node node4 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node4, strMap5);
        java.lang.String str7 = closureCodingConvention0.getExportSymbolFunction();
        java.lang.String str8 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.Node node9 = null;
        boolean boolean10 = closureCodingConvention0.isOptionalParameter(node9);
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection11 = closureCodingConvention0.getAssertionFunctions();
        java.lang.String str12 = closureCodingConvention0.getExportSymbolFunction();
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = closureCodingConvention0.getSingletonGetterClassName(node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "goog.exportSymbol" + "'", str7, "goog.exportSymbol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "goog.global" + "'", str8, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "goog.exportSymbol" + "'", str12, "goog.exportSymbol");
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        java.lang.String str3 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.abstractMethod");
        boolean boolean7 = closureCodingConvention0.isConstantKey("hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType8 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType9 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType10 = null;
        closureCodingConvention0.applySubclassRelationship(functionType8, functionType9, subclassType10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = closureCodingConvention0.isVarArgsParameter(node12);
        boolean boolean15 = closureCodingConvention0.isValidEnumKey("goog.abstractMethod");
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType18 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType19 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType20 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType16, objectType17, objectType18, functionType19, functionType20);
        java.lang.String str22 = closureCodingConvention0.getExportSymbolFunction();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportSymbol" + "'", str3, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "goog.exportSymbol" + "'", str22, "goog.exportSymbol");
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        java.lang.String str3 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.abstractMethod");
        boolean boolean7 = closureCodingConvention0.isConstantKey("hi!");
        java.lang.String str8 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.Node node9 = null;
        boolean boolean10 = closureCodingConvention0.isVarArgsParameter(node9);
        boolean boolean12 = closureCodingConvention0.isPrivate("goog.abstractMethod");
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship14 = closureCodingConvention0.getDelegateRelationship(node13);
        boolean boolean16 = closureCodingConvention0.isConstant("goog.exportSymbol");
        boolean boolean18 = closureCodingConvention0.isSuperClassReference("goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportSymbol" + "'", str3, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "goog.global" + "'", str8, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(delegateRelationship14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean5 = closureCodingConvention0.isConstant("");
        boolean boolean7 = closureCodingConvention0.isConstant("goog.exportSymbol");
        java.lang.String str8 = closureCodingConvention0.getExportSymbolFunction();
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType12 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType13 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType9, objectType10, objectType11, functionType12, functionType13);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "goog.exportSymbol" + "'", str8, "goog.exportSymbol");
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        boolean boolean4 = closureCodingConvention0.isExported("goog.abstractMethod");
        boolean boolean7 = closureCodingConvention0.isExported("goog.abstractMethod", false);
        boolean boolean9 = closureCodingConvention0.isConstantKey("");
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = closureCodingConvention0.isVarArgsParameter(node10);
        java.lang.String str12 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean14 = closureCodingConvention0.isConstantKey("");
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship16 = closureCodingConvention0.getDelegateRelationship(node15);
        com.google.javascript.rhino.jstype.FunctionType functionType17 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType18 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType19 = null;
        closureCodingConvention0.applySubclassRelationship(functionType17, functionType18, subclassType19);
        com.google.javascript.rhino.jstype.FunctionType functionType21 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType22 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType23 = null;
        // The following exception was thrown during execution in test generation
        try {
            closureCodingConvention0.applySingletonGetter(functionType21, functionType22, objectType23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "goog.exportProperty" + "'", str12, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(delegateRelationship16);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        boolean boolean5 = closureCodingConvention0.isValidEnumKey("hi!");
        boolean boolean7 = closureCodingConvention0.isValidEnumKey("goog.abstractMethod");
        boolean boolean9 = closureCodingConvention0.isExported("goog.abstractMethod");
        boolean boolean11 = closureCodingConvention0.isPrivate("goog.global");
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType15 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType16 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType12, objectType13, objectType14, functionType15, functionType16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = closureCodingConvention0.extractClassNameIfProvide(node18, node19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        boolean boolean5 = closureCodingConvention0.isValidEnumKey("hi!");
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = closureCodingConvention0.isVarArgsParameter(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = closureCodingConvention0.isVarArgsParameter(node8);
        boolean boolean11 = closureCodingConvention0.isPrivate("");
        java.lang.String str12 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str13 = closureCodingConvention0.getExportSymbolFunction();
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship15 = closureCodingConvention0.getClassesDefinedByCall(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "goog.abstractMethod" + "'", str12, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "goog.exportSymbol" + "'", str13, "goog.exportSymbol");
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        boolean boolean4 = closureCodingConvention0.isExported("goog.global");
        java.lang.String str5 = closureCodingConvention0.getGlobalObject();
        boolean boolean7 = closureCodingConvention0.isConstantKey("goog.global");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "goog.global" + "'", str5, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.exportProperty");
        java.lang.String str6 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str7 = closureCodingConvention0.getExportPropertyFunction();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection8 = closureCodingConvention0.getAssertionFunctions();
        boolean boolean11 = closureCodingConvention0.isExported("", false);
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = closureCodingConvention0.getSingletonGetterClassName(node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "goog.abstractMethod" + "'", str6, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "goog.exportProperty" + "'", str7, "goog.exportProperty");
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        boolean boolean5 = closureCodingConvention0.isValidEnumKey("hi!");
        boolean boolean7 = closureCodingConvention0.isPrivate("");
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType11 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType12 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType8, objectType9, objectType10, functionType11, functionType12);
        boolean boolean15 = closureCodingConvention0.isConstant("goog.exportProperty");
        java.lang.String str16 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean19 = closureCodingConvention0.isExported("", true);
        java.lang.String str20 = closureCodingConvention0.getExportSymbolFunction();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "goog.exportSymbol" + "'", str16, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "goog.exportSymbol" + "'", str20, "goog.exportSymbol");
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection2 = closureCodingConvention0.getAssertionFunctions();
        java.lang.String str3 = closureCodingConvention0.getExportSymbolFunction();
        java.lang.String str4 = closureCodingConvention0.getDelegateSuperclassName();
        boolean boolean6 = closureCodingConvention0.isSuperClassReference("goog.exportSymbol");
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType10 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType11 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType7, objectType8, objectType9, functionType10, functionType11);
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType16 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType17 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType13, objectType14, objectType15, functionType16, functionType17);
        java.lang.String str19 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean21 = closureCodingConvention0.isSuperClassReference("goog.exportSymbol");
        com.google.javascript.rhino.Node node22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = closureCodingConvention0.getSingletonGetterClassName(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportSymbol" + "'", str3, "goog.exportSymbol");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "goog.exportProperty" + "'", str19, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        boolean boolean4 = closureCodingConvention0.isExported("goog.abstractMethod");
        boolean boolean7 = closureCodingConvention0.isExported("goog.abstractMethod", false);
        boolean boolean9 = closureCodingConvention0.isConstantKey("");
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = closureCodingConvention0.isVarArgsParameter(node10);
        boolean boolean13 = closureCodingConvention0.isValidEnumKey("hi!");
        boolean boolean15 = closureCodingConvention0.isSuperClassReference("hi!");
        java.lang.String str16 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean19 = closureCodingConvention0.isExported("goog.abstractMethod", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "goog.exportProperty" + "'", str16, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        com.google.javascript.rhino.Node node3 = null;
        boolean boolean4 = closureCodingConvention0.isVarArgsParameter(node3);
        com.google.javascript.rhino.jstype.FunctionType functionType5 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType6 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType7 = null;
        closureCodingConvention0.applySubclassRelationship(functionType5, functionType6, subclassType7);
        boolean boolean11 = closureCodingConvention0.isExported("goog.exportSymbol", true);
        boolean boolean13 = closureCodingConvention0.isExported("goog.abstractMethod");
        java.lang.String str14 = closureCodingConvention0.getDelegateSuperclassName();
        com.google.javascript.rhino.jstype.FunctionType functionType15 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType16 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType17 = null;
        closureCodingConvention0.applySubclassRelationship(functionType15, functionType16, subclassType17);
        boolean boolean21 = closureCodingConvention0.isExported("goog.abstractMethod", false);
        boolean boolean23 = closureCodingConvention0.isConstant("goog.exportSymbol");
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = closureCodingConvention0.extractClassNameIfRequire(node24, node25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        java.lang.String str3 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.abstractMethod");
        boolean boolean7 = closureCodingConvention0.isConstantKey("hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType8 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType9 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType10 = null;
        closureCodingConvention0.applySubclassRelationship(functionType8, functionType9, subclassType10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = closureCodingConvention0.isVarArgsParameter(node12);
        boolean boolean16 = closureCodingConvention0.isExported("goog.exportProperty", false);
        boolean boolean18 = closureCodingConvention0.isConstant("goog.exportProperty");
        boolean boolean20 = closureCodingConvention0.isPrivate("goog.exportSymbol");
        java.lang.String str21 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType23 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType25 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType26 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType22, objectType23, objectType24, functionType25, functionType26);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportSymbol" + "'", str3, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "goog.abstractMethod" + "'", str21, "goog.abstractMethod");
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        boolean boolean4 = closureCodingConvention0.isConstant("goog.exportProperty");
        boolean boolean6 = closureCodingConvention0.isExported("goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        java.lang.String str3 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.abstractMethod");
        boolean boolean7 = closureCodingConvention0.isConstantKey("goog.abstractMethod");
        java.lang.String str8 = closureCodingConvention0.getExportSymbolFunction();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportSymbol" + "'", str3, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "goog.exportSymbol" + "'", str8, "goog.exportSymbol");
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        com.google.javascript.rhino.Node node3 = null;
        boolean boolean4 = closureCodingConvention0.isVarArgsParameter(node3);
        boolean boolean6 = closureCodingConvention0.isExported("goog.exportProperty");
        boolean boolean8 = closureCodingConvention0.isPrivate("goog.global");
        java.lang.String str9 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = closureCodingConvention0.isVarArgsParameter(node10);
        java.lang.String str12 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean14 = closureCodingConvention0.isConstant("goog.exportProperty");
        boolean boolean17 = closureCodingConvention0.isExported("goog.exportSymbol", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "goog.exportProperty" + "'", str9, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "goog.exportSymbol" + "'", str12, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        com.google.javascript.rhino.Node node3 = null;
        boolean boolean4 = closureCodingConvention0.isVarArgsParameter(node3);
        boolean boolean6 = closureCodingConvention0.isExported("goog.exportProperty");
        com.google.javascript.rhino.Node node7 = null;
        boolean boolean8 = closureCodingConvention0.isVarArgsParameter(node7);
        boolean boolean10 = closureCodingConvention0.isExported("goog.global");
        com.google.javascript.rhino.jstype.FunctionType functionType11 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType12 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            closureCodingConvention0.applySingletonGetter(functionType11, functionType12, objectType13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean3 = closureCodingConvention0.isValidEnumKey("goog.global");
        java.lang.String str4 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str5 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = closureCodingConvention0.extractClassNameIfProvide(node6, node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.exportSymbol" + "'", str1, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "goog.abstractMethod" + "'", str4, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "goog.abstractMethod" + "'", str5, "goog.abstractMethod");
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        boolean boolean4 = closureCodingConvention0.isExported("goog.abstractMethod");
        boolean boolean7 = closureCodingConvention0.isExported("goog.abstractMethod", false);
        boolean boolean9 = closureCodingConvention0.isConstantKey("");
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = closureCodingConvention0.isVarArgsParameter(node10);
        boolean boolean13 = closureCodingConvention0.isValidEnumKey("hi!");
        boolean boolean15 = closureCodingConvention0.isSuperClassReference("hi!");
        boolean boolean17 = closureCodingConvention0.isValidEnumKey("hi!");
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = closureCodingConvention0.isOptionalParameter(node18);
        boolean boolean21 = closureCodingConvention0.isExported("goog.global");
        boolean boolean23 = closureCodingConvention0.isExported("goog.global");
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType25 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType27 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType28 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType24, objectType25, objectType26, functionType27, functionType28);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        boolean boolean5 = closureCodingConvention0.isValidEnumKey("hi!");
        boolean boolean7 = closureCodingConvention0.isPrivate("");
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType11 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType12 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType8, objectType9, objectType10, functionType11, functionType12);
        com.google.javascript.rhino.jstype.FunctionType functionType14 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType15 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType16 = null;
        closureCodingConvention0.applySubclassRelationship(functionType14, functionType15, subclassType16);
        boolean boolean19 = closureCodingConvention0.isConstantKey("hi!");
        boolean boolean21 = closureCodingConvention0.isValidEnumKey("goog.abstractMethod");
        com.google.javascript.rhino.Node node22 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap23 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node22, strMap23);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship26 = closureCodingConvention0.getDelegateRelationship(node25);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(delegateRelationship26);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        com.google.javascript.rhino.Node node3 = null;
        boolean boolean4 = closureCodingConvention0.isVarArgsParameter(node3);
        boolean boolean6 = closureCodingConvention0.isExported("goog.global");
        java.lang.String str7 = closureCodingConvention0.getExportSymbolFunction();
        java.lang.String str8 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = null;
        com.google.javascript.jscomp.Scope scope10 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention11 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean13 = closureCodingConvention11.isConstantKey("");
        boolean boolean15 = closureCodingConvention11.isExported("goog.abstractMethod");
        boolean boolean18 = closureCodingConvention11.isExported("goog.abstractMethod", false);
        boolean boolean20 = closureCodingConvention11.isConstantKey("");
        com.google.javascript.rhino.Node node21 = null;
        boolean boolean22 = closureCodingConvention11.isVarArgsParameter(node21);
        java.lang.String str23 = closureCodingConvention11.getExportSymbolFunction();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry24 = null;
        com.google.javascript.jscomp.Scope scope25 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention26 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str27 = closureCodingConvention26.getAbstractMethodName();
        java.lang.String str28 = closureCodingConvention26.getGlobalObject();
        java.lang.String str29 = closureCodingConvention26.getGlobalObject();
        boolean boolean31 = closureCodingConvention26.isPrivate("");
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection32 = closureCodingConvention26.getAssertionFunctions();
        com.google.javascript.rhino.jstype.ObjectType objectType33 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType36 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType37 = null;
        closureCodingConvention26.applyDelegateRelationship(objectType33, objectType34, objectType35, functionType36, functionType37);
        java.lang.String str39 = closureCodingConvention26.getAbstractMethodName();
        boolean boolean41 = closureCodingConvention26.isValidEnumKey("hi!");
        java.lang.String str42 = closureCodingConvention26.getExportSymbolFunction();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry43 = null;
        com.google.javascript.jscomp.Scope scope44 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention45 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str46 = closureCodingConvention45.getAbstractMethodName();
        java.lang.String str47 = closureCodingConvention45.getGlobalObject();
        java.lang.String str48 = closureCodingConvention45.getGlobalObject();
        boolean boolean50 = closureCodingConvention45.isValidEnumKey("hi!");
        com.google.javascript.rhino.Node node51 = null;
        boolean boolean52 = closureCodingConvention45.isVarArgsParameter(node51);
        java.lang.String str53 = closureCodingConvention45.getAbstractMethodName();
        com.google.javascript.rhino.jstype.ObjectType objectType54 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType55 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType56 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType57 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType58 = null;
        closureCodingConvention45.applyDelegateRelationship(objectType54, objectType55, objectType56, functionType57, functionType58);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry60 = null;
        com.google.javascript.jscomp.Scope scope61 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention62 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str63 = closureCodingConvention62.getAbstractMethodName();
        java.lang.String str64 = closureCodingConvention62.getGlobalObject();
        java.lang.String str65 = closureCodingConvention62.getGlobalObject();
        boolean boolean67 = closureCodingConvention62.isValidEnumKey("hi!");
        boolean boolean69 = closureCodingConvention62.isPrivate("");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry70 = null;
        com.google.javascript.jscomp.Scope scope71 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray72 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList73 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList73, objectTypeArray72);
        java.util.Map<java.lang.String, java.lang.String> strMap75 = null;
        closureCodingConvention62.defineDelegateProxyPrototypeProperties(jSTypeRegistry70, scope71, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList73, strMap75);
        java.util.Map<java.lang.String, java.lang.String> strMap77 = null;
        closureCodingConvention45.defineDelegateProxyPrototypeProperties(jSTypeRegistry60, scope61, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList73, strMap77);
        java.util.Map<java.lang.String, java.lang.String> strMap79 = null;
        closureCodingConvention26.defineDelegateProxyPrototypeProperties(jSTypeRegistry43, scope44, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList73, strMap79);
        java.util.Map<java.lang.String, java.lang.String> strMap81 = null;
        closureCodingConvention11.defineDelegateProxyPrototypeProperties(jSTypeRegistry24, scope25, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList73, strMap81);
        java.util.Map<java.lang.String, java.lang.String> strMap83 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry9, scope10, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList73, strMap83);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "goog.exportSymbol" + "'", str7, "goog.exportSymbol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "goog.global" + "'", str8, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "goog.exportSymbol" + "'", str23, "goog.exportSymbol");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "goog.abstractMethod" + "'", str27, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "goog.global" + "'", str28, "goog.global");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "goog.global" + "'", str29, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection32);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "goog.abstractMethod" + "'", str39, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "goog.exportSymbol" + "'", str42, "goog.exportSymbol");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "goog.abstractMethod" + "'", str46, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "goog.global" + "'", str47, "goog.global");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "goog.global" + "'", str48, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "goog.abstractMethod" + "'", str53, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "goog.abstractMethod" + "'", str63, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "goog.global" + "'", str64, "goog.global");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "goog.global" + "'", str65, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(objectTypeArray72);
        org.junit.Assert.assertArrayEquals(objectTypeArray72, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.exportProperty");
        java.lang.String str6 = closureCodingConvention0.getDelegateSuperclassName();
        boolean boolean8 = closureCodingConvention0.isSuperClassReference("goog.abstractMethod");
        java.lang.String str9 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean11 = closureCodingConvention0.isConstantKey("goog.exportProperty");
        java.lang.String str12 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.jstype.FunctionType functionType13 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType14 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType15 = null;
        closureCodingConvention0.applySubclassRelationship(functionType13, functionType14, subclassType15);
        boolean boolean18 = closureCodingConvention0.isSuperClassReference("goog.exportSymbol");
        java.lang.String str19 = closureCodingConvention0.getExportSymbolFunction();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "goog.exportSymbol" + "'", str9, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "goog.global" + "'", str12, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "goog.exportSymbol" + "'", str19, "goog.exportSymbol");
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        boolean boolean4 = closureCodingConvention0.isExported("goog.abstractMethod");
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = closureCodingConvention0.isVarArgsParameter(node5);
        java.lang.String str7 = closureCodingConvention0.getExportSymbolFunction();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "goog.exportSymbol" + "'", str7, "goog.exportSymbol");
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        boolean boolean5 = closureCodingConvention0.isValidEnumKey("hi!");
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = closureCodingConvention0.isVarArgsParameter(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = closureCodingConvention0.isVarArgsParameter(node8);
        boolean boolean11 = closureCodingConvention0.isPrivate("");
        java.lang.String str12 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.Bind bind14 = closureCodingConvention0.describeFunctionBind(node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "goog.abstractMethod" + "'", str12, "goog.abstractMethod");
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        java.lang.String str4 = closureCodingConvention0.getExportSymbolFunction();
        com.google.javascript.rhino.Node node5 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node5, strMap6);
        java.lang.String str8 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship10 = closureCodingConvention0.getDelegateRelationship(node9);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "goog.exportSymbol" + "'", str4, "goog.exportSymbol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "goog.exportProperty" + "'", str8, "goog.exportProperty");
        org.junit.Assert.assertNull(delegateRelationship10);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getDelegateSuperclassName();
        boolean boolean3 = closureCodingConvention0.isConstant("hi!");
        java.lang.String str4 = closureCodingConvention0.getDelegateSuperclassName();
        com.google.javascript.rhino.Node node5 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node5, strMap6);
        java.lang.String str8 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.jstype.FunctionType functionType9 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType10 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType11 = null;
        closureCodingConvention0.applySubclassRelationship(functionType9, functionType10, subclassType11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = closureCodingConvention0.extractClassNameIfRequire(node13, node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "goog.global" + "'", str8, "goog.global");
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.Node node4 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node4, strMap5);
        boolean boolean8 = closureCodingConvention0.isConstant("");
        com.google.javascript.rhino.jstype.FunctionType functionType9 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType10 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType11 = null;
        closureCodingConvention0.applySubclassRelationship(functionType9, functionType10, subclassType11);
        java.lang.String str13 = closureCodingConvention0.getDelegateSuperclassName();
        com.google.javascript.rhino.jstype.FunctionType functionType14 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType15 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType16 = null;
        closureCodingConvention0.applySubclassRelationship(functionType14, functionType15, subclassType16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = closureCodingConvention0.extractClassNameIfProvide(node18, node19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        java.lang.String str3 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.abstractMethod");
        boolean boolean7 = closureCodingConvention0.isConstantKey("hi!");
        java.lang.String str8 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.Node node9 = null;
        boolean boolean10 = closureCodingConvention0.isVarArgsParameter(node9);
        boolean boolean12 = closureCodingConvention0.isPrivate("goog.abstractMethod");
        boolean boolean14 = closureCodingConvention0.isSuperClassReference("hi!");
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = closureCodingConvention0.getSingletonGetterClassName(node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportSymbol" + "'", str3, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "goog.global" + "'", str8, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getDelegateSuperclassName();
        boolean boolean3 = closureCodingConvention0.isConstant("goog.exportProperty");
        java.lang.String str4 = closureCodingConvention0.getDelegateSuperclassName();
        boolean boolean6 = closureCodingConvention0.isPrivate("goog.global");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean5 = closureCodingConvention0.isConstant("");
        boolean boolean7 = closureCodingConvention0.isConstant("goog.exportSymbol");
        boolean boolean9 = closureCodingConvention0.isSuperClassReference("goog.global");
        com.google.javascript.rhino.jstype.FunctionType functionType10 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType11 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType12 = null;
        closureCodingConvention0.applySubclassRelationship(functionType10, functionType11, subclassType12);
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = closureCodingConvention0.getSingletonGetterClassName(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        boolean boolean4 = closureCodingConvention0.isExported("goog.global");
        java.lang.String str5 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = closureCodingConvention0.isVarArgsParameter(node6);
        boolean boolean9 = closureCodingConvention0.isSuperClassReference("hi!");
        boolean boolean12 = closureCodingConvention0.isExported("goog.global", false);
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection13 = closureCodingConvention0.getAssertionFunctions();
        boolean boolean15 = closureCodingConvention0.isExported("goog.abstractMethod");
        com.google.javascript.rhino.jstype.FunctionType functionType16 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType17 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType18 = null;
        closureCodingConvention0.applySubclassRelationship(functionType16, functionType17, subclassType18);
        java.lang.String str20 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str21 = closureCodingConvention0.getGlobalObject();
        boolean boolean23 = closureCodingConvention0.isPrivate("goog.exportSymbol");
        boolean boolean26 = closureCodingConvention0.isExported("", true);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = closureCodingConvention0.extractClassNameIfProvide(node27, node28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "goog.exportProperty" + "'", str5, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "goog.abstractMethod" + "'", str20, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "goog.global" + "'", str21, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        boolean boolean5 = closureCodingConvention0.isValidEnumKey("hi!");
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = closureCodingConvention0.isVarArgsParameter(node6);
        java.lang.String str8 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType12 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType13 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType9, objectType10, objectType11, functionType12, functionType13);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = null;
        com.google.javascript.jscomp.Scope scope16 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention17 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str18 = closureCodingConvention17.getAbstractMethodName();
        java.lang.String str19 = closureCodingConvention17.getGlobalObject();
        java.lang.String str20 = closureCodingConvention17.getGlobalObject();
        boolean boolean22 = closureCodingConvention17.isValidEnumKey("hi!");
        boolean boolean24 = closureCodingConvention17.isPrivate("");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = null;
        com.google.javascript.jscomp.Scope scope26 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray27 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList28 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList28, objectTypeArray27);
        java.util.Map<java.lang.String, java.lang.String> strMap30 = null;
        closureCodingConvention17.defineDelegateProxyPrototypeProperties(jSTypeRegistry25, scope26, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList28, strMap30);
        java.util.Map<java.lang.String, java.lang.String> strMap32 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry15, scope16, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList28, strMap32);
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection34 = closureCodingConvention0.getAssertionFunctions();
        com.google.javascript.rhino.Node node35 = null;
        boolean boolean36 = closureCodingConvention0.isVarArgsParameter(node35);
        com.google.javascript.rhino.Node node37 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.Bind bind38 = closureCodingConvention0.describeFunctionBind(node37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "goog.abstractMethod" + "'", str8, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "goog.abstractMethod" + "'", str18, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "goog.global" + "'", str19, "goog.global");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "goog.global" + "'", str20, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objectTypeArray27);
        org.junit.Assert.assertArrayEquals(objectTypeArray27, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        java.lang.String str3 = closureCodingConvention0.getDelegateSuperclassName();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection4 = closureCodingConvention0.getAssertionFunctions();
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = closureCodingConvention0.isVarArgsParameter(node5);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.exportProperty");
        java.lang.String str6 = closureCodingConvention0.getDelegateSuperclassName();
        boolean boolean8 = closureCodingConvention0.isSuperClassReference("goog.abstractMethod");
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType12 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType13 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType9, objectType10, objectType11, functionType12, functionType13);
        com.google.javascript.rhino.jstype.FunctionType functionType15 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType16 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType17 = null;
        closureCodingConvention0.applySubclassRelationship(functionType15, functionType16, subclassType17);
        boolean boolean20 = closureCodingConvention0.isValidEnumKey("goog.abstractMethod");
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType23 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType24 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType25 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType21, objectType22, objectType23, functionType24, functionType25);
        boolean boolean28 = closureCodingConvention0.isPrivate("");
        boolean boolean30 = closureCodingConvention0.isPrivate("hi!");
        java.lang.String str31 = closureCodingConvention0.getAbstractMethodName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "goog.abstractMethod" + "'", str31, "goog.abstractMethod");
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        java.lang.String str3 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.abstractMethod");
        boolean boolean7 = closureCodingConvention0.isConstantKey("hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType8 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType9 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType10 = null;
        closureCodingConvention0.applySubclassRelationship(functionType8, functionType9, subclassType10);
        boolean boolean14 = closureCodingConvention0.isExported("goog.exportSymbol", true);
        com.google.javascript.rhino.Node node15 = null;
        boolean boolean16 = closureCodingConvention0.isVarArgsParameter(node15);
        java.lang.String str17 = closureCodingConvention0.getDelegateSuperclassName();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection18 = closureCodingConvention0.getAssertionFunctions();
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship20 = closureCodingConvention0.getDelegateRelationship(node19);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportSymbol" + "'", str3, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection18);
        org.junit.Assert.assertNull(delegateRelationship20);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.exportProperty");
        java.lang.String str6 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str7 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean9 = closureCodingConvention0.isPrivate("goog.exportSymbol");
        java.lang.String str10 = closureCodingConvention0.getAbstractMethodName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "goog.abstractMethod" + "'", str6, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "goog.exportProperty" + "'", str7, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "goog.abstractMethod" + "'", str10, "goog.abstractMethod");
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        boolean boolean5 = closureCodingConvention0.isConstant("goog.global");
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship7 = closureCodingConvention0.getDelegateRelationship(node6);
        boolean boolean10 = closureCodingConvention0.isExported("hi!", false);
        boolean boolean12 = closureCodingConvention0.isExported("goog.abstractMethod");
        boolean boolean14 = closureCodingConvention0.isValidEnumKey("goog.abstractMethod");
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList16 = closureCodingConvention0.identifyTypeDeclarationCall(node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(delegateRelationship7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.Node node4 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node4, strMap5);
        java.lang.String str7 = closureCodingConvention0.getExportSymbolFunction();
        java.lang.String str8 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.Node node9 = null;
        boolean boolean10 = closureCodingConvention0.isOptionalParameter(node9);
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection11 = closureCodingConvention0.getAssertionFunctions();
        java.lang.String str12 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean14 = closureCodingConvention0.isValidEnumKey("goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "goog.exportSymbol" + "'", str7, "goog.exportSymbol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "goog.global" + "'", str8, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "goog.exportSymbol" + "'", str12, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        boolean boolean4 = closureCodingConvention0.isExported("goog.global");
        java.lang.String str5 = closureCodingConvention0.getGlobalObject();
        boolean boolean7 = closureCodingConvention0.isConstant("");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = null;
        com.google.javascript.jscomp.Scope scope9 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention10 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str11 = closureCodingConvention10.getAbstractMethodName();
        java.lang.String str12 = closureCodingConvention10.getGlobalObject();
        java.lang.String str13 = closureCodingConvention10.getGlobalObject();
        boolean boolean15 = closureCodingConvention10.isValidEnumKey("hi!");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = null;
        com.google.javascript.jscomp.Scope scope17 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention18 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean20 = closureCodingConvention18.isConstantKey("");
        java.lang.String str21 = closureCodingConvention18.getExportSymbolFunction();
        boolean boolean23 = closureCodingConvention18.isPrivate("goog.abstractMethod");
        boolean boolean25 = closureCodingConvention18.isConstantKey("hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType26 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType27 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType28 = null;
        closureCodingConvention18.applySubclassRelationship(functionType26, functionType27, subclassType28);
        boolean boolean32 = closureCodingConvention18.isExported("goog.exportSymbol", true);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = null;
        com.google.javascript.jscomp.Scope scope34 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention35 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str36 = closureCodingConvention35.getAbstractMethodName();
        java.lang.String str37 = closureCodingConvention35.getGlobalObject();
        java.lang.String str38 = closureCodingConvention35.getExportPropertyFunction();
        boolean boolean40 = closureCodingConvention35.isConstant("");
        boolean boolean43 = closureCodingConvention35.isExported("hi!", false);
        com.google.javascript.rhino.Node node44 = null;
        boolean boolean45 = closureCodingConvention35.isOptionalParameter(node44);
        boolean boolean47 = closureCodingConvention35.isConstant("goog.abstractMethod");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = null;
        com.google.javascript.jscomp.Scope scope49 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray50 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList51 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList51, objectTypeArray50);
        java.util.Map<java.lang.String, java.lang.String> strMap53 = null;
        closureCodingConvention35.defineDelegateProxyPrototypeProperties(jSTypeRegistry48, scope49, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList51, strMap53);
        java.util.Map<java.lang.String, java.lang.String> strMap55 = null;
        closureCodingConvention18.defineDelegateProxyPrototypeProperties(jSTypeRegistry33, scope34, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList51, strMap55);
        java.util.Map<java.lang.String, java.lang.String> strMap57 = null;
        closureCodingConvention10.defineDelegateProxyPrototypeProperties(jSTypeRegistry16, scope17, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList51, strMap57);
        java.util.Map<java.lang.String, java.lang.String> strMap59 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry8, scope9, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList51, strMap59);
        java.lang.String str61 = closureCodingConvention0.getDelegateSuperclassName();
        java.lang.String str62 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.Node node63 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.Bind bind64 = closureCodingConvention0.describeFunctionBind(node63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "goog.global" + "'", str5, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "goog.abstractMethod" + "'", str11, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "goog.global" + "'", str12, "goog.global");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "goog.global" + "'", str13, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "goog.exportSymbol" + "'", str21, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "goog.abstractMethod" + "'", str36, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "goog.global" + "'", str37, "goog.global");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "goog.exportProperty" + "'", str38, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(objectTypeArray50);
        org.junit.Assert.assertArrayEquals(objectTypeArray50, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "goog.abstractMethod" + "'", str62, "goog.abstractMethod");
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean5 = closureCodingConvention0.isConstant("");
        boolean boolean7 = closureCodingConvention0.isConstant("goog.exportSymbol");
        boolean boolean9 = closureCodingConvention0.isSuperClassReference("goog.global");
        boolean boolean11 = closureCodingConvention0.isExported("goog.exportProperty");
        com.google.javascript.rhino.jstype.FunctionType functionType12 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType13 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType14 = null;
        closureCodingConvention0.applySubclassRelationship(functionType12, functionType13, subclassType14);
        boolean boolean17 = closureCodingConvention0.isSuperClassReference("goog.global");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        java.lang.String str3 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.abstractMethod");
        boolean boolean7 = closureCodingConvention0.isPrivate("goog.abstractMethod");
        java.lang.String str8 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean11 = closureCodingConvention0.isExported("hi!", true);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = closureCodingConvention0.isVarArgsParameter(node12);
        boolean boolean15 = closureCodingConvention0.isSuperClassReference("");
        java.lang.String str16 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList18 = closureCodingConvention0.identifyTypeDeclarationCall(node17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportSymbol" + "'", str3, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "goog.exportProperty" + "'", str8, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "goog.global" + "'", str16, "goog.global");
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        java.lang.String str4 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = closureCodingConvention0.isVarArgsParameter(node5);
        boolean boolean8 = closureCodingConvention0.isSuperClassReference("goog.exportSymbol");
        boolean boolean10 = closureCodingConvention0.isConstantKey("hi!");
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = closureCodingConvention0.isPropertyTestFunction(node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "goog.abstractMethod" + "'", str4, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        java.lang.String str4 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = closureCodingConvention0.isVarArgsParameter(node5);
        java.lang.String str7 = closureCodingConvention0.getAbstractMethodName();
        boolean boolean10 = closureCodingConvention0.isExported("goog.exportProperty", true);
        java.lang.String str11 = closureCodingConvention0.getExportSymbolFunction();
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = closureCodingConvention0.isVarArgsParameter(node12);
        java.lang.String str14 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.jstype.FunctionType functionType15 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType16 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType17 = null;
        closureCodingConvention0.applySubclassRelationship(functionType15, functionType16, subclassType17);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "goog.abstractMethod" + "'", str4, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "goog.abstractMethod" + "'", str7, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "goog.exportSymbol" + "'", str11, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "goog.abstractMethod" + "'", str14, "goog.abstractMethod");
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        com.google.javascript.rhino.Node node3 = null;
        boolean boolean4 = closureCodingConvention0.isVarArgsParameter(node3);
        boolean boolean6 = closureCodingConvention0.isExported("goog.exportProperty");
        boolean boolean9 = closureCodingConvention0.isExported("goog.abstractMethod", false);
        boolean boolean11 = closureCodingConvention0.isValidEnumKey("goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        boolean boolean4 = closureCodingConvention0.isExported("goog.global");
        java.lang.String str5 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = closureCodingConvention0.isVarArgsParameter(node6);
        boolean boolean9 = closureCodingConvention0.isSuperClassReference("hi!");
        boolean boolean12 = closureCodingConvention0.isExported("goog.global", false);
        boolean boolean14 = closureCodingConvention0.isConstantKey("hi!");
        java.lang.String str15 = closureCodingConvention0.getDelegateSuperclassName();
        java.lang.String str16 = closureCodingConvention0.getDelegateSuperclassName();
        boolean boolean18 = closureCodingConvention0.isConstantKey("goog.exportProperty");
        com.google.javascript.rhino.Node node19 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.Bind bind20 = closureCodingConvention0.describeFunctionBind(node19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "goog.exportProperty" + "'", str5, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.Node node4 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node4, strMap5);
        boolean boolean8 = closureCodingConvention0.isConstant("");
        boolean boolean10 = closureCodingConvention0.isConstantKey("goog.exportSymbol");
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList12 = closureCodingConvention0.identifyTypeDeclarationCall(node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        java.lang.String str3 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.abstractMethod");
        boolean boolean7 = closureCodingConvention0.isConstantKey("hi!");
        java.lang.String str8 = closureCodingConvention0.getGlobalObject();
        boolean boolean10 = closureCodingConvention0.isConstantKey("hi!");
        java.lang.String str11 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = closureCodingConvention0.isVarArgsParameter(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship15 = closureCodingConvention0.getDelegateRelationship(node14);
        java.lang.String str16 = closureCodingConvention0.getAbstractMethodName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportSymbol" + "'", str3, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "goog.global" + "'", str8, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "goog.abstractMethod" + "'", str11, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(delegateRelationship15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "goog.abstractMethod" + "'", str16, "goog.abstractMethod");
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.Node node3 = null;
        boolean boolean4 = closureCodingConvention0.isOptionalParameter(node3);
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = closureCodingConvention0.isVarArgsParameter(node5);
        com.google.javascript.rhino.Node node7 = null;
        boolean boolean8 = closureCodingConvention0.isOptionalParameter(node7);
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType12 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType13 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType9, objectType10, objectType11, functionType12, functionType13);
        java.lang.String str15 = closureCodingConvention0.getExportSymbolFunction();
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship17 = closureCodingConvention0.getDelegateRelationship(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship19 = closureCodingConvention0.getDelegateRelationship(node18);
        java.lang.String str20 = closureCodingConvention0.getExportSymbolFunction();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "goog.exportSymbol" + "'", str15, "goog.exportSymbol");
        org.junit.Assert.assertNull(delegateRelationship17);
        org.junit.Assert.assertNull(delegateRelationship19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "goog.exportSymbol" + "'", str20, "goog.exportSymbol");
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        boolean boolean4 = closureCodingConvention0.isExported("goog.global");
        java.lang.String str5 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean7 = closureCodingConvention0.isExported("goog.abstractMethod");
        java.lang.String str8 = closureCodingConvention0.getDelegateSuperclassName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "goog.exportProperty" + "'", str5, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        boolean boolean5 = closureCodingConvention0.isValidEnumKey("hi!");
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = closureCodingConvention0.isVarArgsParameter(node6);
        java.lang.String str8 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType12 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType13 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType9, objectType10, objectType11, functionType12, functionType13);
        java.lang.String str15 = closureCodingConvention0.getDelegateSuperclassName();
        boolean boolean17 = closureCodingConvention0.isConstant("goog.exportProperty");
        boolean boolean19 = closureCodingConvention0.isConstantKey("goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "goog.abstractMethod" + "'", str8, "goog.abstractMethod");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        boolean boolean5 = closureCodingConvention0.isPrivate("");
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection6 = closureCodingConvention0.getAssertionFunctions();
        boolean boolean8 = closureCodingConvention0.isSuperClassReference("hi!");
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship10 = closureCodingConvention0.getDelegateRelationship(node9);
        java.lang.String str11 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str12 = closureCodingConvention0.getGlobalObject();
        boolean boolean14 = closureCodingConvention0.isSuperClassReference("hi!");
        java.lang.Class<?> wildcardClass15 = closureCodingConvention0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(delegateRelationship10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "goog.abstractMethod" + "'", str11, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "goog.global" + "'", str12, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getDelegateSuperclassName();
        java.lang.String str2 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean4 = closureCodingConvention0.isPrivate("hi!");
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = closureCodingConvention0.isOptionalParameter(node5);
        boolean boolean8 = closureCodingConvention0.isValidEnumKey("");
        com.google.javascript.rhino.Node node9 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node9, strMap10);
        java.lang.String str12 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean14 = closureCodingConvention0.isConstant("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.exportSymbol" + "'", str2, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "goog.exportSymbol" + "'", str12, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        java.lang.String str3 = closureCodingConvention0.getDelegateSuperclassName();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection4 = closureCodingConvention0.getAssertionFunctions();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection5 = closureCodingConvention0.getAssertionFunctions();
        com.google.javascript.rhino.jstype.FunctionType functionType6 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType7 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType8 = null;
        closureCodingConvention0.applySubclassRelationship(functionType6, functionType7, subclassType8);
        boolean boolean11 = closureCodingConvention0.isConstant("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection4);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        boolean boolean5 = closureCodingConvention0.isValidEnumKey("hi!");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = null;
        com.google.javascript.jscomp.Scope scope7 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention8 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean10 = closureCodingConvention8.isConstantKey("");
        java.lang.String str11 = closureCodingConvention8.getExportSymbolFunction();
        boolean boolean13 = closureCodingConvention8.isPrivate("goog.abstractMethod");
        boolean boolean15 = closureCodingConvention8.isConstantKey("hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType16 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType17 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType18 = null;
        closureCodingConvention8.applySubclassRelationship(functionType16, functionType17, subclassType18);
        boolean boolean22 = closureCodingConvention8.isExported("goog.exportSymbol", true);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry23 = null;
        com.google.javascript.jscomp.Scope scope24 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention25 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str26 = closureCodingConvention25.getAbstractMethodName();
        java.lang.String str27 = closureCodingConvention25.getGlobalObject();
        java.lang.String str28 = closureCodingConvention25.getExportPropertyFunction();
        boolean boolean30 = closureCodingConvention25.isConstant("");
        boolean boolean33 = closureCodingConvention25.isExported("hi!", false);
        com.google.javascript.rhino.Node node34 = null;
        boolean boolean35 = closureCodingConvention25.isOptionalParameter(node34);
        boolean boolean37 = closureCodingConvention25.isConstant("goog.abstractMethod");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry38 = null;
        com.google.javascript.jscomp.Scope scope39 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray40 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList41 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList41, objectTypeArray40);
        java.util.Map<java.lang.String, java.lang.String> strMap43 = null;
        closureCodingConvention25.defineDelegateProxyPrototypeProperties(jSTypeRegistry38, scope39, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList41, strMap43);
        java.util.Map<java.lang.String, java.lang.String> strMap45 = null;
        closureCodingConvention8.defineDelegateProxyPrototypeProperties(jSTypeRegistry23, scope24, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList41, strMap45);
        java.util.Map<java.lang.String, java.lang.String> strMap47 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry6, scope7, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList41, strMap47);
        com.google.javascript.rhino.Node node49 = null;
        boolean boolean50 = closureCodingConvention0.isVarArgsParameter(node49);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "goog.exportSymbol" + "'", str11, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "goog.abstractMethod" + "'", str26, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "goog.global" + "'", str27, "goog.global");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "goog.exportProperty" + "'", str28, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(objectTypeArray40);
        org.junit.Assert.assertArrayEquals(objectTypeArray40, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getDelegateSuperclassName();
        java.lang.String str2 = closureCodingConvention0.getExportSymbolFunction();
        com.google.javascript.rhino.Node node3 = null;
        boolean boolean4 = closureCodingConvention0.isVarArgsParameter(node3);
        com.google.javascript.rhino.jstype.FunctionType functionType5 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            closureCodingConvention0.applySingletonGetter(functionType5, functionType6, objectType7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.exportSymbol" + "'", str2, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        boolean boolean5 = closureCodingConvention0.isConstant("goog.global");
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship7 = closureCodingConvention0.getDelegateRelationship(node6);
        boolean boolean10 = closureCodingConvention0.isExported("hi!", false);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = null;
        com.google.javascript.jscomp.Scope scope12 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention13 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str14 = closureCodingConvention13.getAbstractMethodName();
        java.lang.String str15 = closureCodingConvention13.getGlobalObject();
        java.lang.String str16 = closureCodingConvention13.getGlobalObject();
        boolean boolean18 = closureCodingConvention13.isValidEnumKey("hi!");
        com.google.javascript.rhino.Node node19 = null;
        boolean boolean20 = closureCodingConvention13.isVarArgsParameter(node19);
        java.lang.String str21 = closureCodingConvention13.getAbstractMethodName();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = null;
        com.google.javascript.jscomp.Scope scope23 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention24 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str25 = closureCodingConvention24.getAbstractMethodName();
        java.lang.String str26 = closureCodingConvention24.getGlobalObject();
        java.lang.String str27 = closureCodingConvention24.getGlobalObject();
        boolean boolean29 = closureCodingConvention24.isValidEnumKey("hi!");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = null;
        com.google.javascript.jscomp.Scope scope31 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention32 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean34 = closureCodingConvention32.isConstantKey("");
        java.lang.String str35 = closureCodingConvention32.getExportSymbolFunction();
        boolean boolean37 = closureCodingConvention32.isPrivate("goog.abstractMethod");
        boolean boolean39 = closureCodingConvention32.isConstantKey("hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType40 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType41 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType42 = null;
        closureCodingConvention32.applySubclassRelationship(functionType40, functionType41, subclassType42);
        boolean boolean46 = closureCodingConvention32.isExported("goog.exportSymbol", true);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = null;
        com.google.javascript.jscomp.Scope scope48 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention49 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str50 = closureCodingConvention49.getAbstractMethodName();
        java.lang.String str51 = closureCodingConvention49.getGlobalObject();
        java.lang.String str52 = closureCodingConvention49.getExportPropertyFunction();
        boolean boolean54 = closureCodingConvention49.isConstant("");
        boolean boolean57 = closureCodingConvention49.isExported("hi!", false);
        com.google.javascript.rhino.Node node58 = null;
        boolean boolean59 = closureCodingConvention49.isOptionalParameter(node58);
        boolean boolean61 = closureCodingConvention49.isConstant("goog.abstractMethod");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry62 = null;
        com.google.javascript.jscomp.Scope scope63 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray64 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList65 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList65, objectTypeArray64);
        java.util.Map<java.lang.String, java.lang.String> strMap67 = null;
        closureCodingConvention49.defineDelegateProxyPrototypeProperties(jSTypeRegistry62, scope63, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList65, strMap67);
        java.util.Map<java.lang.String, java.lang.String> strMap69 = null;
        closureCodingConvention32.defineDelegateProxyPrototypeProperties(jSTypeRegistry47, scope48, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList65, strMap69);
        java.util.Map<java.lang.String, java.lang.String> strMap71 = null;
        closureCodingConvention24.defineDelegateProxyPrototypeProperties(jSTypeRegistry30, scope31, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList65, strMap71);
        java.util.Map<java.lang.String, java.lang.String> strMap73 = null;
        closureCodingConvention13.defineDelegateProxyPrototypeProperties(jSTypeRegistry22, scope23, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList65, strMap73);
        java.util.Map<java.lang.String, java.lang.String> strMap75 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry11, scope12, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList65, strMap75);
        java.lang.String str77 = closureCodingConvention0.getDelegateSuperclassName();
        boolean boolean79 = closureCodingConvention0.isConstantKey("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(delegateRelationship7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "goog.abstractMethod" + "'", str14, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "goog.global" + "'", str15, "goog.global");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "goog.global" + "'", str16, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "goog.abstractMethod" + "'", str21, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "goog.abstractMethod" + "'", str25, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "goog.global" + "'", str26, "goog.global");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "goog.global" + "'", str27, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "goog.exportSymbol" + "'", str35, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "goog.abstractMethod" + "'", str50, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "goog.global" + "'", str51, "goog.global");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "goog.exportProperty" + "'", str52, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(objectTypeArray64);
        org.junit.Assert.assertArrayEquals(objectTypeArray64, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNull(str77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection2 = closureCodingConvention0.getAssertionFunctions();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection3 = closureCodingConvention0.getAssertionFunctions();
        boolean boolean5 = closureCodingConvention0.isExported("goog.abstractMethod");
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship7 = closureCodingConvention0.getDelegateRelationship(node6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType11 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType12 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType8, objectType9, objectType10, functionType11, functionType12);
        boolean boolean15 = closureCodingConvention0.isPrivate("goog.exportSymbol");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection2);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(delegateRelationship7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean5 = closureCodingConvention0.isConstant("");
        boolean boolean8 = closureCodingConvention0.isExported("hi!", false);
        com.google.javascript.rhino.Node node9 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node9, strMap10);
        boolean boolean13 = closureCodingConvention0.isValidEnumKey("goog.exportSymbol");
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = closureCodingConvention0.isOptionalParameter(node14);
        java.lang.String str16 = closureCodingConvention0.getGlobalObject();
        java.lang.String str17 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.jstype.FunctionType functionType18 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType19 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType20 = null;
        closureCodingConvention0.applySubclassRelationship(functionType18, functionType19, subclassType20);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "goog.global" + "'", str16, "goog.global");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "goog.global" + "'", str17, "goog.global");
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean5 = closureCodingConvention0.isConstant("");
        boolean boolean8 = closureCodingConvention0.isExported("hi!", false);
        com.google.javascript.rhino.Node node9 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node9, strMap10);
        boolean boolean13 = closureCodingConvention0.isExported("goog.abstractMethod");
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = closureCodingConvention0.isOptionalParameter(node14);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        com.google.javascript.rhino.Node node3 = null;
        boolean boolean4 = closureCodingConvention0.isVarArgsParameter(node3);
        com.google.javascript.rhino.jstype.FunctionType functionType5 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType6 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType7 = null;
        closureCodingConvention0.applySubclassRelationship(functionType5, functionType6, subclassType7);
        boolean boolean11 = closureCodingConvention0.isExported("goog.exportSymbol", true);
        boolean boolean13 = closureCodingConvention0.isExported("goog.abstractMethod");
        java.lang.String str14 = closureCodingConvention0.getDelegateSuperclassName();
        boolean boolean16 = closureCodingConvention0.isConstantKey("goog.exportSymbol");
        java.lang.String str17 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList19 = closureCodingConvention0.identifyTypeDeclarationCall(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "goog.global" + "'", str17, "goog.global");
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        java.lang.String str3 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.abstractMethod");
        boolean boolean7 = closureCodingConvention0.isConstantKey("hi!");
        java.lang.String str8 = closureCodingConvention0.getGlobalObject();
        boolean boolean10 = closureCodingConvention0.isConstantKey("hi!");
        java.lang.String str11 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str12 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str13 = closureCodingConvention0.getAbstractMethodName();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection14 = closureCodingConvention0.getAssertionFunctions();
        com.google.javascript.rhino.Node node15 = null;
        boolean boolean16 = closureCodingConvention0.isVarArgsParameter(node15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportSymbol" + "'", str3, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "goog.global" + "'", str8, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "goog.abstractMethod" + "'", str11, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "goog.abstractMethod" + "'", str12, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "goog.abstractMethod" + "'", str13, "goog.abstractMethod");
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        java.lang.String str3 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.abstractMethod");
        boolean boolean7 = closureCodingConvention0.isConstantKey("hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType8 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType9 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType10 = null;
        closureCodingConvention0.applySubclassRelationship(functionType8, functionType9, subclassType10);
        boolean boolean14 = closureCodingConvention0.isExported("goog.exportSymbol", true);
        com.google.javascript.rhino.Node node15 = null;
        boolean boolean16 = closureCodingConvention0.isVarArgsParameter(node15);
        java.lang.String str17 = closureCodingConvention0.getDelegateSuperclassName();
        boolean boolean19 = closureCodingConvention0.isPrivate("goog.exportProperty");
        java.lang.String str20 = closureCodingConvention0.getDelegateSuperclassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportSymbol" + "'", str3, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean5 = closureCodingConvention0.isConstant("");
        boolean boolean8 = closureCodingConvention0.isExported("hi!", false);
        com.google.javascript.rhino.Node node9 = null;
        boolean boolean10 = closureCodingConvention0.isOptionalParameter(node9);
        boolean boolean12 = closureCodingConvention0.isConstant("goog.abstractMethod");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = null;
        com.google.javascript.jscomp.Scope scope14 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray15 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList16 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList16, objectTypeArray15);
        java.util.Map<java.lang.String, java.lang.String> strMap18 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry13, scope14, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList16, strMap18);
        boolean boolean21 = closureCodingConvention0.isPrivate("goog.global");
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = closureCodingConvention0.isOptionalParameter(node22);
        java.lang.String str24 = closureCodingConvention0.getExportPropertyFunction();
        java.lang.String str25 = closureCodingConvention0.getAbstractMethodName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objectTypeArray15);
        org.junit.Assert.assertArrayEquals(objectTypeArray15, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "goog.exportProperty" + "'", str24, "goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "goog.abstractMethod" + "'", str25, "goog.abstractMethod");
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.exportProperty");
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = closureCodingConvention0.isVarArgsParameter(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = closureCodingConvention0.isVarArgsParameter(node8);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        java.lang.String str4 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = closureCodingConvention0.isVarArgsParameter(node5);
        java.lang.String str7 = closureCodingConvention0.getAbstractMethodName();
        boolean boolean10 = closureCodingConvention0.isExported("goog.exportProperty", true);
        java.lang.String str11 = closureCodingConvention0.getExportSymbolFunction();
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = closureCodingConvention0.isVarArgsParameter(node12);
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection14 = closureCodingConvention0.getAssertionFunctions();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "goog.abstractMethod" + "'", str4, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "goog.abstractMethod" + "'", str7, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "goog.exportSymbol" + "'", str11, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection14);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection2 = closureCodingConvention0.getAssertionFunctions();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.Node node4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.Bind bind5 = closureCodingConvention0.describeFunctionBind(node4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        com.google.javascript.rhino.Node node3 = null;
        boolean boolean4 = closureCodingConvention0.isVarArgsParameter(node3);
        boolean boolean6 = closureCodingConvention0.isExported("goog.exportProperty");
        com.google.javascript.rhino.Node node7 = null;
        boolean boolean8 = closureCodingConvention0.isVarArgsParameter(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship10 = closureCodingConvention0.getDelegateRelationship(node9);
        boolean boolean12 = closureCodingConvention0.isConstant("");
        boolean boolean14 = closureCodingConvention0.isValidEnumKey("goog.abstractMethod");
        java.lang.String str15 = closureCodingConvention0.getExportSymbolFunction();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(delegateRelationship10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "goog.exportSymbol" + "'", str15, "goog.exportSymbol");
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        boolean boolean4 = closureCodingConvention0.isExported("goog.abstractMethod");
        boolean boolean7 = closureCodingConvention0.isExported("goog.abstractMethod", false);
        java.lang.String str8 = closureCodingConvention0.getExportSymbolFunction();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "goog.exportSymbol" + "'", str8, "goog.exportSymbol");
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        boolean boolean5 = closureCodingConvention0.isPrivate("");
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection6 = closureCodingConvention0.getAssertionFunctions();
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType10 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType11 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType7, objectType8, objectType9, functionType10, functionType11);
        java.lang.String str13 = closureCodingConvention0.getAbstractMethodName();
        boolean boolean15 = closureCodingConvention0.isValidEnumKey("hi!");
        java.lang.String str16 = closureCodingConvention0.getExportSymbolFunction();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = null;
        com.google.javascript.jscomp.Scope scope18 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention19 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str20 = closureCodingConvention19.getAbstractMethodName();
        java.lang.String str21 = closureCodingConvention19.getGlobalObject();
        java.lang.String str22 = closureCodingConvention19.getGlobalObject();
        boolean boolean24 = closureCodingConvention19.isValidEnumKey("hi!");
        com.google.javascript.rhino.Node node25 = null;
        boolean boolean26 = closureCodingConvention19.isVarArgsParameter(node25);
        java.lang.String str27 = closureCodingConvention19.getAbstractMethodName();
        com.google.javascript.rhino.jstype.ObjectType objectType28 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType31 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType32 = null;
        closureCodingConvention19.applyDelegateRelationship(objectType28, objectType29, objectType30, functionType31, functionType32);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = null;
        com.google.javascript.jscomp.Scope scope35 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention36 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str37 = closureCodingConvention36.getAbstractMethodName();
        java.lang.String str38 = closureCodingConvention36.getGlobalObject();
        java.lang.String str39 = closureCodingConvention36.getGlobalObject();
        boolean boolean41 = closureCodingConvention36.isValidEnumKey("hi!");
        boolean boolean43 = closureCodingConvention36.isPrivate("");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = null;
        com.google.javascript.jscomp.Scope scope45 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray46 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList47 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList47, objectTypeArray46);
        java.util.Map<java.lang.String, java.lang.String> strMap49 = null;
        closureCodingConvention36.defineDelegateProxyPrototypeProperties(jSTypeRegistry44, scope45, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList47, strMap49);
        java.util.Map<java.lang.String, java.lang.String> strMap51 = null;
        closureCodingConvention19.defineDelegateProxyPrototypeProperties(jSTypeRegistry34, scope35, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList47, strMap51);
        java.util.Map<java.lang.String, java.lang.String> strMap53 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry17, scope18, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList47, strMap53);
        java.lang.Class<?> wildcardClass55 = closureCodingConvention0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "goog.abstractMethod" + "'", str13, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "goog.exportSymbol" + "'", str16, "goog.exportSymbol");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "goog.abstractMethod" + "'", str20, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "goog.global" + "'", str21, "goog.global");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "goog.global" + "'", str22, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "goog.abstractMethod" + "'", str27, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "goog.abstractMethod" + "'", str37, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "goog.global" + "'", str38, "goog.global");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "goog.global" + "'", str39, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(objectTypeArray46);
        org.junit.Assert.assertArrayEquals(objectTypeArray46, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getDelegateSuperclassName();
        java.lang.String str2 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean4 = closureCodingConvention0.isPrivate("hi!");
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = closureCodingConvention0.isOptionalParameter(node5);
        boolean boolean8 = closureCodingConvention0.isValidEnumKey("");
        com.google.javascript.rhino.Node node9 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node9, strMap10);
        java.lang.String str12 = closureCodingConvention0.getExportSymbolFunction();
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship14 = closureCodingConvention0.getDelegateRelationship(node13);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.exportSymbol" + "'", str2, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "goog.exportSymbol" + "'", str12, "goog.exportSymbol");
        org.junit.Assert.assertNull(delegateRelationship14);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = closureCodingConvention0.isOptionalParameter(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = closureCodingConvention0.isOptionalParameter(node6);
        boolean boolean9 = closureCodingConvention0.isConstant("goog.exportProperty");
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = closureCodingConvention0.isOptionalParameter(node10);
        com.google.javascript.rhino.jstype.FunctionType functionType12 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType13 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType14 = null;
        closureCodingConvention0.applySubclassRelationship(functionType12, functionType13, subclassType14);
        java.lang.String str16 = closureCodingConvention0.getDelegateSuperclassName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean5 = closureCodingConvention0.isConstant("");
        boolean boolean8 = closureCodingConvention0.isExported("hi!", false);
        com.google.javascript.rhino.Node node9 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node9, strMap10);
        boolean boolean13 = closureCodingConvention0.isValidEnumKey("goog.exportSymbol");
        boolean boolean15 = closureCodingConvention0.isPrivate("goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        boolean boolean5 = closureCodingConvention0.isValidEnumKey("hi!");
        boolean boolean7 = closureCodingConvention0.isPrivate("");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = null;
        com.google.javascript.jscomp.Scope scope9 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray10 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList11 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList11, objectTypeArray10);
        java.util.Map<java.lang.String, java.lang.String> strMap13 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry8, scope9, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList11, strMap13);
        boolean boolean16 = closureCodingConvention0.isSuperClassReference("goog.exportSymbol");
        boolean boolean18 = closureCodingConvention0.isValidEnumKey("hi!");
        boolean boolean20 = closureCodingConvention0.isExported("goog.exportProperty");
        com.google.javascript.rhino.jstype.FunctionType functionType21 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType22 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType23 = null;
        closureCodingConvention0.applySubclassRelationship(functionType21, functionType22, subclassType23);
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection25 = closureCodingConvention0.getAssertionFunctions();
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType28 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType29 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType30 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType26, objectType27, objectType28, functionType29, functionType30);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objectTypeArray10);
        org.junit.Assert.assertArrayEquals(objectTypeArray10, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection25);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        java.lang.String str3 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.abstractMethod");
        boolean boolean7 = closureCodingConvention0.isConstantKey("hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType8 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType9 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType10 = null;
        closureCodingConvention0.applySubclassRelationship(functionType8, functionType9, subclassType10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = closureCodingConvention0.isVarArgsParameter(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = closureCodingConvention0.extractClassNameIfProvide(node14, node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportSymbol" + "'", str3, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        boolean boolean5 = closureCodingConvention0.isValidEnumKey("hi!");
        boolean boolean7 = closureCodingConvention0.isPrivate("");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = null;
        com.google.javascript.jscomp.Scope scope9 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray10 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList11 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList11, objectTypeArray10);
        java.util.Map<java.lang.String, java.lang.String> strMap13 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry8, scope9, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList11, strMap13);
        boolean boolean16 = closureCodingConvention0.isSuperClassReference("goog.exportSymbol");
        boolean boolean18 = closureCodingConvention0.isValidEnumKey("hi!");
        boolean boolean20 = closureCodingConvention0.isExported("goog.exportProperty");
        com.google.javascript.rhino.jstype.FunctionType functionType21 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType22 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType23 = null;
        closureCodingConvention0.applySubclassRelationship(functionType21, functionType22, subclassType23);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = closureCodingConvention0.extractClassNameIfProvide(node25, node26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objectTypeArray10);
        org.junit.Assert.assertArrayEquals(objectTypeArray10, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        java.lang.String str3 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.abstractMethod");
        boolean boolean7 = closureCodingConvention0.isConstantKey("hi!");
        java.lang.String str8 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.Node node9 = null;
        boolean boolean10 = closureCodingConvention0.isVarArgsParameter(node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType12 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType13 = null;
        closureCodingConvention0.applySubclassRelationship(functionType11, functionType12, subclassType13);
        com.google.javascript.rhino.Node node15 = null;
        boolean boolean16 = closureCodingConvention0.isVarArgsParameter(node15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = closureCodingConvention0.extractClassNameIfProvide(node17, node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportSymbol" + "'", str3, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "goog.global" + "'", str8, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        boolean boolean5 = closureCodingConvention0.isValidEnumKey("hi!");
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = closureCodingConvention0.isVarArgsParameter(node6);
        java.lang.String str8 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry9 = null;
        com.google.javascript.jscomp.Scope scope10 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention11 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str12 = closureCodingConvention11.getAbstractMethodName();
        java.lang.String str13 = closureCodingConvention11.getGlobalObject();
        java.lang.String str14 = closureCodingConvention11.getGlobalObject();
        boolean boolean16 = closureCodingConvention11.isValidEnumKey("hi!");
        boolean boolean18 = closureCodingConvention11.isPrivate("");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = null;
        com.google.javascript.jscomp.Scope scope20 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray21 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList22 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList22, objectTypeArray21);
        java.util.Map<java.lang.String, java.lang.String> strMap24 = null;
        closureCodingConvention11.defineDelegateProxyPrototypeProperties(jSTypeRegistry19, scope20, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList22, strMap24);
        java.util.Map<java.lang.String, java.lang.String> strMap26 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry9, scope10, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList22, strMap26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = closureCodingConvention0.extractClassNameIfRequire(node28, node29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "goog.abstractMethod" + "'", str8, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "goog.abstractMethod" + "'", str12, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "goog.global" + "'", str13, "goog.global");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "goog.global" + "'", str14, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objectTypeArray21);
        org.junit.Assert.assertArrayEquals(objectTypeArray21, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        boolean boolean5 = closureCodingConvention0.isValidEnumKey("hi!");
        boolean boolean7 = closureCodingConvention0.isPrivate("");
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType11 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType12 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType8, objectType9, objectType10, functionType11, functionType12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = closureCodingConvention0.isVarArgsParameter(node14);
        java.lang.String str16 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean18 = closureCodingConvention0.isSuperClassReference("goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "goog.exportProperty" + "'", str16, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.exportProperty");
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection6 = closureCodingConvention0.getAssertionFunctions();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship8 = closureCodingConvention0.getDelegateRelationship(node7);
        com.google.javascript.rhino.Node node9 = null;
        boolean boolean10 = closureCodingConvention0.isVarArgsParameter(node9);
        java.lang.String str11 = closureCodingConvention0.getDelegateSuperclassName();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection12 = closureCodingConvention0.getAssertionFunctions();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection6);
        org.junit.Assert.assertNull(delegateRelationship8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection12);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        java.lang.String str3 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.abstractMethod");
        boolean boolean7 = closureCodingConvention0.isPrivate("goog.abstractMethod");
        java.lang.String str8 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean11 = closureCodingConvention0.isExported("hi!", true);
        boolean boolean13 = closureCodingConvention0.isPrivate("hi!");
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = closureCodingConvention0.isOptionalParameter(node14);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportSymbol" + "'", str3, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "goog.exportProperty" + "'", str8, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        boolean boolean5 = closureCodingConvention0.isPrivate("");
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection6 = closureCodingConvention0.getAssertionFunctions();
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType10 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType11 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType7, objectType8, objectType9, functionType10, functionType11);
        java.lang.String str13 = closureCodingConvention0.getAbstractMethodName();
        boolean boolean15 = closureCodingConvention0.isValidEnumKey("hi!");
        java.lang.String str16 = closureCodingConvention0.getExportSymbolFunction();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry17 = null;
        com.google.javascript.jscomp.Scope scope18 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention19 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str20 = closureCodingConvention19.getAbstractMethodName();
        java.lang.String str21 = closureCodingConvention19.getGlobalObject();
        java.lang.String str22 = closureCodingConvention19.getGlobalObject();
        boolean boolean24 = closureCodingConvention19.isValidEnumKey("hi!");
        com.google.javascript.rhino.Node node25 = null;
        boolean boolean26 = closureCodingConvention19.isVarArgsParameter(node25);
        java.lang.String str27 = closureCodingConvention19.getAbstractMethodName();
        com.google.javascript.rhino.jstype.ObjectType objectType28 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType29 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType30 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType31 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType32 = null;
        closureCodingConvention19.applyDelegateRelationship(objectType28, objectType29, objectType30, functionType31, functionType32);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry34 = null;
        com.google.javascript.jscomp.Scope scope35 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention36 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str37 = closureCodingConvention36.getAbstractMethodName();
        java.lang.String str38 = closureCodingConvention36.getGlobalObject();
        java.lang.String str39 = closureCodingConvention36.getGlobalObject();
        boolean boolean41 = closureCodingConvention36.isValidEnumKey("hi!");
        boolean boolean43 = closureCodingConvention36.isPrivate("");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = null;
        com.google.javascript.jscomp.Scope scope45 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray46 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList47 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList47, objectTypeArray46);
        java.util.Map<java.lang.String, java.lang.String> strMap49 = null;
        closureCodingConvention36.defineDelegateProxyPrototypeProperties(jSTypeRegistry44, scope45, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList47, strMap49);
        java.util.Map<java.lang.String, java.lang.String> strMap51 = null;
        closureCodingConvention19.defineDelegateProxyPrototypeProperties(jSTypeRegistry34, scope35, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList47, strMap51);
        java.util.Map<java.lang.String, java.lang.String> strMap53 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry17, scope18, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList47, strMap53);
        com.google.javascript.rhino.Node node55 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship56 = closureCodingConvention0.getClassesDefinedByCall(node55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "goog.abstractMethod" + "'", str13, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "goog.exportSymbol" + "'", str16, "goog.exportSymbol");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "goog.abstractMethod" + "'", str20, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "goog.global" + "'", str21, "goog.global");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "goog.global" + "'", str22, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "goog.abstractMethod" + "'", str27, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "goog.abstractMethod" + "'", str37, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "goog.global" + "'", str38, "goog.global");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "goog.global" + "'", str39, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(objectTypeArray46);
        org.junit.Assert.assertArrayEquals(objectTypeArray46, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean5 = closureCodingConvention0.isConstant("");
        boolean boolean8 = closureCodingConvention0.isExported("hi!", false);
        com.google.javascript.rhino.Node node9 = null;
        boolean boolean10 = closureCodingConvention0.isOptionalParameter(node9);
        boolean boolean13 = closureCodingConvention0.isExported("goog.global", true);
        com.google.javascript.rhino.jstype.FunctionType functionType14 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType15 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType16 = null;
        closureCodingConvention0.applySubclassRelationship(functionType14, functionType15, subclassType16);
        boolean boolean19 = closureCodingConvention0.isPrivate("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        java.lang.String str3 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean5 = closureCodingConvention0.isSuperClassReference("goog.exportProperty");
        com.google.javascript.rhino.Node node6 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap7 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node6, strMap7);
        java.lang.String str9 = closureCodingConvention0.getDelegateSuperclassName();
        java.lang.String str10 = closureCodingConvention0.getExportSymbolFunction();
        com.google.javascript.rhino.Node node11 = null;
        boolean boolean12 = closureCodingConvention0.isOptionalParameter(node11);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportSymbol" + "'", str3, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "goog.exportSymbol" + "'", str10, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getExportSymbolFunction();
        com.google.javascript.rhino.jstype.FunctionType functionType2 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType3 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType4 = null;
        closureCodingConvention0.applySubclassRelationship(functionType2, functionType3, subclassType4);
        boolean boolean7 = closureCodingConvention0.isPrivate("goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.exportSymbol" + "'", str1, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.Node node4 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node4, strMap5);
        java.lang.String str7 = closureCodingConvention0.getExportSymbolFunction();
        java.lang.String str8 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.Node node9 = null;
        boolean boolean10 = closureCodingConvention0.isOptionalParameter(node9);
        boolean boolean12 = closureCodingConvention0.isSuperClassReference("goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "goog.exportSymbol" + "'", str7, "goog.exportSymbol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "goog.global" + "'", str8, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        boolean boolean5 = closureCodingConvention0.isPrivate("");
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection6 = closureCodingConvention0.getAssertionFunctions();
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType10 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType11 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType7, objectType8, objectType9, functionType10, functionType11);
        java.lang.String str13 = closureCodingConvention0.getAbstractMethodName();
        boolean boolean15 = closureCodingConvention0.isValidEnumKey("hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType16 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType17 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType18 = null;
        closureCodingConvention0.applySubclassRelationship(functionType16, functionType17, subclassType18);
        com.google.javascript.rhino.jstype.ObjectType objectType20 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType23 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType24 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType20, objectType21, objectType22, functionType23, functionType24);
        com.google.javascript.rhino.Node node26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList27 = closureCodingConvention0.identifyTypeDeclarationCall(node26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "goog.abstractMethod" + "'", str13, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.Node node4 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node4, strMap5);
        java.lang.String str7 = closureCodingConvention0.getExportSymbolFunction();
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType11 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType12 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType8, objectType9, objectType10, functionType11, functionType12);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "goog.exportSymbol" + "'", str7, "goog.exportSymbol");
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        boolean boolean4 = closureCodingConvention0.isExported("goog.global");
        boolean boolean6 = closureCodingConvention0.isValidEnumKey("goog.global");
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship8 = closureCodingConvention0.getDelegateRelationship(node7);
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.Bind bind10 = closureCodingConvention0.describeFunctionBind(node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(delegateRelationship8);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        com.google.javascript.rhino.Node node3 = null;
        boolean boolean4 = closureCodingConvention0.isVarArgsParameter(node3);
        boolean boolean6 = closureCodingConvention0.isExported("goog.exportProperty");
        com.google.javascript.rhino.Node node7 = null;
        boolean boolean8 = closureCodingConvention0.isVarArgsParameter(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship10 = closureCodingConvention0.getDelegateRelationship(node9);
        boolean boolean12 = closureCodingConvention0.isConstant("");
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship14 = closureCodingConvention0.getDelegateRelationship(node13);
        java.lang.String str15 = closureCodingConvention0.getGlobalObject();
        java.lang.Class<?> wildcardClass16 = closureCodingConvention0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(delegateRelationship10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(delegateRelationship14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "goog.global" + "'", str15, "goog.global");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        com.google.javascript.rhino.Node node3 = null;
        boolean boolean4 = closureCodingConvention0.isVarArgsParameter(node3);
        boolean boolean6 = closureCodingConvention0.isExported("goog.exportProperty");
        com.google.javascript.rhino.Node node7 = null;
        boolean boolean8 = closureCodingConvention0.isVarArgsParameter(node7);
        com.google.javascript.rhino.Node node9 = null;
        boolean boolean10 = closureCodingConvention0.isVarArgsParameter(node9);
        boolean boolean13 = closureCodingConvention0.isExported("", true);
        java.lang.String str14 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = closureCodingConvention0.getSingletonGetterClassName(node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "goog.abstractMethod" + "'", str14, "goog.abstractMethod");
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        java.lang.String str3 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.abstractMethod");
        boolean boolean7 = closureCodingConvention0.isConstantKey("hi!");
        java.lang.String str8 = closureCodingConvention0.getGlobalObject();
        boolean boolean10 = closureCodingConvention0.isConstantKey("hi!");
        com.google.javascript.rhino.Node node11 = null;
        boolean boolean12 = closureCodingConvention0.isOptionalParameter(node11);
        com.google.javascript.rhino.Node node13 = null;
        boolean boolean14 = closureCodingConvention0.isVarArgsParameter(node13);
        boolean boolean17 = closureCodingConvention0.isExported("goog.abstractMethod", true);
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection18 = closureCodingConvention0.getAssertionFunctions();
        com.google.javascript.rhino.Node node19 = null;
        boolean boolean20 = closureCodingConvention0.isVarArgsParameter(node19);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportSymbol" + "'", str3, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "goog.global" + "'", str8, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        java.lang.String str3 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.abstractMethod");
        boolean boolean7 = closureCodingConvention0.isConstantKey("hi!");
        java.lang.String str8 = closureCodingConvention0.getGlobalObject();
        boolean boolean10 = closureCodingConvention0.isConstantKey("hi!");
        java.lang.String str11 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str12 = closureCodingConvention0.getAbstractMethodName();
        boolean boolean14 = closureCodingConvention0.isConstantKey("goog.exportSymbol");
        boolean boolean16 = closureCodingConvention0.isExported("goog.exportSymbol");
        java.lang.Class<?> wildcardClass17 = closureCodingConvention0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportSymbol" + "'", str3, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "goog.global" + "'", str8, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "goog.abstractMethod" + "'", str11, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "goog.abstractMethod" + "'", str12, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        boolean boolean5 = closureCodingConvention0.isConstantKey("goog.abstractMethod");
        boolean boolean7 = closureCodingConvention0.isSuperClassReference("goog.global");
        java.lang.String str8 = closureCodingConvention0.getDelegateSuperclassName();
        java.lang.String str9 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList11 = closureCodingConvention0.identifyTypeDeclarationCall(node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "goog.global" + "'", str9, "goog.global");
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection2 = closureCodingConvention0.getAssertionFunctions();
        java.lang.String str3 = closureCodingConvention0.getExportSymbolFunction();
        java.lang.String str4 = closureCodingConvention0.getDelegateSuperclassName();
        boolean boolean6 = closureCodingConvention0.isSuperClassReference("goog.exportSymbol");
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType10 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType11 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType7, objectType8, objectType9, functionType10, functionType11);
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType16 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType17 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType13, objectType14, objectType15, functionType16, functionType17);
        boolean boolean20 = closureCodingConvention0.isValidEnumKey("goog.global");
        com.google.javascript.rhino.Node node21 = null;
        boolean boolean22 = closureCodingConvention0.isOptionalParameter(node21);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportSymbol" + "'", str3, "goog.exportSymbol");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        java.lang.String str3 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.abstractMethod");
        boolean boolean7 = closureCodingConvention0.isConstantKey("hi!");
        boolean boolean9 = closureCodingConvention0.isConstant("goog.global");
        java.lang.String str10 = closureCodingConvention0.getExportPropertyFunction();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportSymbol" + "'", str3, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "goog.exportProperty" + "'", str10, "goog.exportProperty");
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.Node node4 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node4, strMap5);
        boolean boolean8 = closureCodingConvention0.isConstant("");
        com.google.javascript.rhino.Node node9 = null;
        boolean boolean10 = closureCodingConvention0.isVarArgsParameter(node9);
        com.google.javascript.rhino.Node node11 = null;
        boolean boolean12 = closureCodingConvention0.isVarArgsParameter(node11);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        boolean boolean4 = closureCodingConvention0.isExported("goog.abstractMethod");
        boolean boolean7 = closureCodingConvention0.isExported("goog.abstractMethod", false);
        boolean boolean9 = closureCodingConvention0.isConstantKey("");
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = closureCodingConvention0.isVarArgsParameter(node10);
        boolean boolean13 = closureCodingConvention0.isValidEnumKey("hi!");
        boolean boolean15 = closureCodingConvention0.isSuperClassReference("hi!");
        java.lang.String str16 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean18 = closureCodingConvention0.isValidEnumKey("goog.abstractMethod");
        java.lang.String str19 = closureCodingConvention0.getDelegateSuperclassName();
        com.google.javascript.rhino.jstype.FunctionType functionType20 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType21 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType22 = null;
        closureCodingConvention0.applySubclassRelationship(functionType20, functionType21, subclassType22);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "goog.exportProperty" + "'", str16, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection2 = closureCodingConvention0.getAssertionFunctions();
        java.lang.String str3 = closureCodingConvention0.getExportSymbolFunction();
        java.lang.String str4 = closureCodingConvention0.getDelegateSuperclassName();
        boolean boolean6 = closureCodingConvention0.isSuperClassReference("goog.exportSymbol");
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType10 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType11 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType7, objectType8, objectType9, functionType10, functionType11);
        java.lang.String str13 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean16 = closureCodingConvention0.isExported("goog.exportProperty", true);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportSymbol" + "'", str3, "goog.exportSymbol");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "goog.exportProperty" + "'", str13, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        java.lang.String str4 = closureCodingConvention0.getDelegateSuperclassName();
        boolean boolean6 = closureCodingConvention0.isValidEnumKey("goog.abstractMethod");
        com.google.javascript.rhino.jstype.FunctionType functionType7 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType8 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType9 = null;
        closureCodingConvention0.applySubclassRelationship(functionType7, functionType8, subclassType9);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        boolean boolean4 = closureCodingConvention0.isExported("goog.abstractMethod");
        boolean boolean7 = closureCodingConvention0.isExported("goog.abstractMethod", false);
        boolean boolean9 = closureCodingConvention0.isConstantKey("");
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = closureCodingConvention0.isVarArgsParameter(node10);
        boolean boolean13 = closureCodingConvention0.isValidEnumKey("hi!");
        boolean boolean15 = closureCodingConvention0.isSuperClassReference("hi!");
        boolean boolean17 = closureCodingConvention0.isValidEnumKey("hi!");
        java.lang.String str18 = closureCodingConvention0.getGlobalObject();
        java.lang.String str19 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList21 = closureCodingConvention0.identifyTypeDeclarationCall(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "goog.global" + "'", str18, "goog.global");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "goog.abstractMethod" + "'", str19, "goog.abstractMethod");
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        boolean boolean5 = closureCodingConvention0.isPrivate("");
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection6 = closureCodingConvention0.getAssertionFunctions();
        boolean boolean8 = closureCodingConvention0.isSuperClassReference("hi!");
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship10 = closureCodingConvention0.getDelegateRelationship(node9);
        java.lang.String str11 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship13 = closureCodingConvention0.getDelegateRelationship(node12);
        boolean boolean15 = closureCodingConvention0.isSuperClassReference("goog.abstractMethod");
        boolean boolean17 = closureCodingConvention0.isExported("");
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList19 = closureCodingConvention0.identifyTypeDeclarationCall(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(delegateRelationship10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "goog.abstractMethod" + "'", str11, "goog.abstractMethod");
        org.junit.Assert.assertNull(delegateRelationship13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        boolean boolean5 = closureCodingConvention0.isPrivate("");
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection6 = closureCodingConvention0.getAssertionFunctions();
        boolean boolean8 = closureCodingConvention0.isSuperClassReference("hi!");
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship10 = closureCodingConvention0.getDelegateRelationship(node9);
        java.lang.String str11 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str12 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType16 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType17 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType13, objectType14, objectType15, functionType16, functionType17);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(delegateRelationship10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "goog.abstractMethod" + "'", str11, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "goog.global" + "'", str12, "goog.global");
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        boolean boolean5 = closureCodingConvention0.isPrivate("");
        com.google.javascript.rhino.jstype.FunctionType functionType6 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType7 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType8 = null;
        closureCodingConvention0.applySubclassRelationship(functionType6, functionType7, subclassType8);
        boolean boolean11 = closureCodingConvention0.isExported("goog.exportProperty");
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = closureCodingConvention0.extractClassNameIfProvide(node12, node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        java.lang.String str4 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str5 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = closureCodingConvention0.isPropertyTestFunction(node6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "goog.abstractMethod" + "'", str4, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "goog.exportProperty" + "'", str5, "goog.exportProperty");
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.exportProperty");
        java.lang.String str6 = closureCodingConvention0.getDelegateSuperclassName();
        boolean boolean8 = closureCodingConvention0.isSuperClassReference("goog.abstractMethod");
        com.google.javascript.rhino.jstype.FunctionType functionType9 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType10 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType11 = null;
        closureCodingConvention0.applySubclassRelationship(functionType9, functionType10, subclassType11);
        com.google.javascript.rhino.Node node13 = null;
        boolean boolean14 = closureCodingConvention0.isVarArgsParameter(node13);
        java.lang.String str15 = closureCodingConvention0.getExportSymbolFunction();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "goog.exportSymbol" + "'", str15, "goog.exportSymbol");
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.Node node4 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node4, strMap5);
        boolean boolean8 = closureCodingConvention0.isConstant("");
        java.lang.String str9 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType13 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType14 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType10, objectType11, objectType12, functionType13, functionType14);
        boolean boolean17 = closureCodingConvention0.isValidEnumKey("goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "goog.global" + "'", str9, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        java.lang.String str3 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.abstractMethod");
        java.lang.String str6 = closureCodingConvention0.getDelegateSuperclassName();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship8 = closureCodingConvention0.getDelegateRelationship(node7);
        com.google.javascript.rhino.Node node9 = null;
        boolean boolean10 = closureCodingConvention0.isVarArgsParameter(node9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportSymbol" + "'", str3, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(delegateRelationship8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        java.lang.String str3 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.abstractMethod");
        boolean boolean7 = closureCodingConvention0.isConstantKey("hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType8 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType9 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType10 = null;
        closureCodingConvention0.applySubclassRelationship(functionType8, functionType9, subclassType10);
        boolean boolean13 = closureCodingConvention0.isSuperClassReference("");
        com.google.javascript.rhino.Node node14 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap15 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node14, strMap15);
        java.lang.String str17 = closureCodingConvention0.getDelegateSuperclassName();
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = closureCodingConvention0.isOptionalParameter(node18);
        com.google.javascript.rhino.jstype.FunctionType functionType20 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType21 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType22 = null;
        closureCodingConvention0.applySubclassRelationship(functionType20, functionType21, subclassType22);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportSymbol" + "'", str3, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean5 = closureCodingConvention0.isConstant("");
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = closureCodingConvention0.isOptionalParameter(node6);
        boolean boolean9 = closureCodingConvention0.isValidEnumKey("goog.global");
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType13 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType14 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType10, objectType11, objectType12, functionType13, functionType14);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        java.lang.String str3 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.abstractMethod");
        boolean boolean7 = closureCodingConvention0.isConstantKey("hi!");
        java.lang.String str8 = closureCodingConvention0.getGlobalObject();
        boolean boolean10 = closureCodingConvention0.isConstantKey("hi!");
        com.google.javascript.rhino.Node node11 = null;
        boolean boolean12 = closureCodingConvention0.isOptionalParameter(node11);
        com.google.javascript.rhino.Node node13 = null;
        boolean boolean14 = closureCodingConvention0.isVarArgsParameter(node13);
        java.lang.String str15 = closureCodingConvention0.getDelegateSuperclassName();
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType18 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType19 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType20 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType16, objectType17, objectType18, functionType19, functionType20);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportSymbol" + "'", str3, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "goog.global" + "'", str8, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        java.lang.String str3 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean5 = closureCodingConvention0.isSuperClassReference("goog.exportProperty");
        com.google.javascript.rhino.Node node6 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap7 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node6, strMap7);
        java.lang.String str9 = closureCodingConvention0.getDelegateSuperclassName();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = null;
        com.google.javascript.jscomp.Scope scope11 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention12 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean14 = closureCodingConvention12.isConstantKey("");
        java.lang.String str15 = closureCodingConvention12.getExportSymbolFunction();
        boolean boolean17 = closureCodingConvention12.isPrivate("goog.abstractMethod");
        boolean boolean19 = closureCodingConvention12.isConstantKey("hi!");
        java.lang.String str20 = closureCodingConvention12.getExportSymbolFunction();
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType23 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType24 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType25 = null;
        closureCodingConvention12.applyDelegateRelationship(objectType21, objectType22, objectType23, functionType24, functionType25);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = null;
        com.google.javascript.jscomp.Scope scope28 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention29 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str30 = closureCodingConvention29.getAbstractMethodName();
        java.lang.String str31 = closureCodingConvention29.getGlobalObject();
        java.lang.String str32 = closureCodingConvention29.getGlobalObject();
        boolean boolean34 = closureCodingConvention29.isConstantKey("goog.abstractMethod");
        boolean boolean36 = closureCodingConvention29.isSuperClassReference("goog.global");
        java.lang.String str37 = closureCodingConvention29.getDelegateSuperclassName();
        java.lang.String str38 = closureCodingConvention29.getExportSymbolFunction();
        boolean boolean40 = closureCodingConvention29.isSuperClassReference("goog.exportSymbol");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = null;
        com.google.javascript.jscomp.Scope scope42 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention43 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str44 = closureCodingConvention43.getAbstractMethodName();
        java.lang.String str45 = closureCodingConvention43.getGlobalObject();
        java.lang.String str46 = closureCodingConvention43.getGlobalObject();
        boolean boolean48 = closureCodingConvention43.isValidEnumKey("hi!");
        boolean boolean50 = closureCodingConvention43.isPrivate("");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry51 = null;
        com.google.javascript.jscomp.Scope scope52 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray53 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList54 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList54, objectTypeArray53);
        java.util.Map<java.lang.String, java.lang.String> strMap56 = null;
        closureCodingConvention43.defineDelegateProxyPrototypeProperties(jSTypeRegistry51, scope52, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList54, strMap56);
        java.util.Map<java.lang.String, java.lang.String> strMap58 = null;
        closureCodingConvention29.defineDelegateProxyPrototypeProperties(jSTypeRegistry41, scope42, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList54, strMap58);
        java.util.Map<java.lang.String, java.lang.String> strMap60 = null;
        closureCodingConvention12.defineDelegateProxyPrototypeProperties(jSTypeRegistry27, scope28, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList54, strMap60);
        java.util.Map<java.lang.String, java.lang.String> strMap62 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry10, scope11, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList54, strMap62);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportSymbol" + "'", str3, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "goog.exportSymbol" + "'", str15, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "goog.exportSymbol" + "'", str20, "goog.exportSymbol");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "goog.abstractMethod" + "'", str30, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "goog.global" + "'", str31, "goog.global");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "goog.global" + "'", str32, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "goog.exportSymbol" + "'", str38, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "goog.abstractMethod" + "'", str44, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "goog.global" + "'", str45, "goog.global");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "goog.global" + "'", str46, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(objectTypeArray53);
        org.junit.Assert.assertArrayEquals(objectTypeArray53, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        boolean boolean4 = closureCodingConvention0.isExported("goog.abstractMethod");
        boolean boolean7 = closureCodingConvention0.isExported("goog.abstractMethod", false);
        boolean boolean9 = closureCodingConvention0.isConstantKey("");
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = closureCodingConvention0.isVarArgsParameter(node10);
        java.lang.String str12 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean14 = closureCodingConvention0.isExported("goog.global");
        boolean boolean16 = closureCodingConvention0.isExported("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "goog.exportSymbol" + "'", str12, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        java.lang.String str3 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.abstractMethod");
        boolean boolean7 = closureCodingConvention0.isConstantKey("hi!");
        java.lang.String str8 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.Node node9 = null;
        boolean boolean10 = closureCodingConvention0.isVarArgsParameter(node9);
        boolean boolean12 = closureCodingConvention0.isPrivate("goog.abstractMethod");
        boolean boolean14 = closureCodingConvention0.isSuperClassReference("hi!");
        com.google.javascript.rhino.Node node15 = null;
        boolean boolean16 = closureCodingConvention0.isOptionalParameter(node15);
        com.google.javascript.rhino.jstype.FunctionType functionType17 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType18 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        // The following exception was thrown during execution in test generation
        try {
            closureCodingConvention0.applySingletonGetter(functionType17, functionType18, objectType19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportSymbol" + "'", str3, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "goog.global" + "'", str8, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        boolean boolean5 = closureCodingConvention0.isConstantKey("goog.abstractMethod");
        java.lang.String str6 = closureCodingConvention0.getDelegateSuperclassName();
        boolean boolean8 = closureCodingConvention0.isPrivate("goog.abstractMethod");
        boolean boolean10 = closureCodingConvention0.isValidEnumKey("goog.exportSymbol");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = null;
        com.google.javascript.jscomp.Scope scope12 = null;
        java.util.List<com.google.javascript.rhino.jstype.ObjectType> objectTypeList13 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry11, scope12, objectTypeList13, strMap14);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.exportProperty");
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection6 = closureCodingConvention0.getAssertionFunctions();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship8 = closureCodingConvention0.getDelegateRelationship(node7);
        com.google.javascript.rhino.Node node9 = null;
        boolean boolean10 = closureCodingConvention0.isVarArgsParameter(node9);
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = closureCodingConvention0.getSingletonGetterClassName(node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection6);
        org.junit.Assert.assertNull(delegateRelationship8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.exportProperty");
        java.lang.String str6 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str7 = closureCodingConvention0.getExportPropertyFunction();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection8 = closureCodingConvention0.getAssertionFunctions();
        boolean boolean11 = closureCodingConvention0.isExported("", false);
        java.lang.String str12 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean14 = closureCodingConvention0.isExported("goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "goog.abstractMethod" + "'", str6, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "goog.exportProperty" + "'", str7, "goog.exportProperty");
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "goog.exportProperty" + "'", str12, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        boolean boolean4 = closureCodingConvention0.isExported("goog.global");
        java.lang.String str5 = closureCodingConvention0.getGlobalObject();
        boolean boolean7 = closureCodingConvention0.isConstant("");
        com.google.javascript.rhino.jstype.FunctionType functionType8 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType9 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType10 = null;
        closureCodingConvention0.applySubclassRelationship(functionType8, functionType9, subclassType10);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = null;
        com.google.javascript.jscomp.Scope scope13 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray14 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList15 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList15, objectTypeArray14);
        java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry12, scope13, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList15, strMap17);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = null;
        com.google.javascript.jscomp.Scope scope20 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention21 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str22 = closureCodingConvention21.getAbstractMethodName();
        java.lang.String str23 = closureCodingConvention21.getGlobalObject();
        java.lang.String str24 = closureCodingConvention21.getGlobalObject();
        boolean boolean26 = closureCodingConvention21.isValidEnumKey("hi!");
        com.google.javascript.rhino.jstype.ObjectType objectType27 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType28 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType29 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType30 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType31 = null;
        closureCodingConvention21.applyDelegateRelationship(objectType27, objectType28, objectType29, functionType30, functionType31);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = null;
        com.google.javascript.jscomp.Scope scope34 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention35 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str36 = closureCodingConvention35.getAbstractMethodName();
        java.lang.String str37 = closureCodingConvention35.getGlobalObject();
        com.google.javascript.rhino.Node node38 = null;
        boolean boolean39 = closureCodingConvention35.isOptionalParameter(node38);
        com.google.javascript.rhino.Node node40 = null;
        boolean boolean41 = closureCodingConvention35.isVarArgsParameter(node40);
        com.google.javascript.rhino.Node node42 = null;
        boolean boolean43 = closureCodingConvention35.isOptionalParameter(node42);
        com.google.javascript.rhino.jstype.ObjectType objectType44 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType45 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType46 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType47 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType48 = null;
        closureCodingConvention35.applyDelegateRelationship(objectType44, objectType45, objectType46, functionType47, functionType48);
        java.lang.String str50 = closureCodingConvention35.getExportSymbolFunction();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry51 = null;
        com.google.javascript.jscomp.Scope scope52 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention53 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str54 = closureCodingConvention53.getAbstractMethodName();
        java.lang.String str55 = closureCodingConvention53.getGlobalObject();
        java.lang.String str56 = closureCodingConvention53.getExportPropertyFunction();
        boolean boolean58 = closureCodingConvention53.isConstant("");
        boolean boolean61 = closureCodingConvention53.isExported("hi!", false);
        com.google.javascript.rhino.Node node62 = null;
        boolean boolean63 = closureCodingConvention53.isOptionalParameter(node62);
        boolean boolean65 = closureCodingConvention53.isConstant("goog.abstractMethod");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry66 = null;
        com.google.javascript.jscomp.Scope scope67 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray68 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList69 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList69, objectTypeArray68);
        java.util.Map<java.lang.String, java.lang.String> strMap71 = null;
        closureCodingConvention53.defineDelegateProxyPrototypeProperties(jSTypeRegistry66, scope67, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList69, strMap71);
        java.util.Map<java.lang.String, java.lang.String> strMap73 = null;
        closureCodingConvention35.defineDelegateProxyPrototypeProperties(jSTypeRegistry51, scope52, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList69, strMap73);
        java.util.Map<java.lang.String, java.lang.String> strMap75 = null;
        closureCodingConvention21.defineDelegateProxyPrototypeProperties(jSTypeRegistry33, scope34, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList69, strMap75);
        java.util.Map<java.lang.String, java.lang.String> strMap77 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry19, scope20, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList69, strMap77);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "goog.global" + "'", str5, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objectTypeArray14);
        org.junit.Assert.assertArrayEquals(objectTypeArray14, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "goog.abstractMethod" + "'", str22, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "goog.global" + "'", str23, "goog.global");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "goog.global" + "'", str24, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "goog.abstractMethod" + "'", str36, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "goog.global" + "'", str37, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "goog.exportSymbol" + "'", str50, "goog.exportSymbol");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "goog.abstractMethod" + "'", str54, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "goog.global" + "'", str55, "goog.global");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "goog.exportProperty" + "'", str56, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(objectTypeArray68);
        org.junit.Assert.assertArrayEquals(objectTypeArray68, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        boolean boolean4 = closureCodingConvention0.isExported("goog.global");
        java.lang.String str5 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship7 = closureCodingConvention0.getDelegateRelationship(node6);
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection8 = closureCodingConvention0.getAssertionFunctions();
        com.google.javascript.rhino.Node node9 = null;
        boolean boolean10 = closureCodingConvention0.isVarArgsParameter(node9);
        java.lang.String str11 = closureCodingConvention0.getExportPropertyFunction();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "goog.exportProperty" + "'", str5, "goog.exportProperty");
        org.junit.Assert.assertNull(delegateRelationship7);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "goog.exportProperty" + "'", str11, "goog.exportProperty");
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        java.lang.String str3 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.abstractMethod");
        boolean boolean7 = closureCodingConvention0.isConstantKey("hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType8 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType9 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType10 = null;
        closureCodingConvention0.applySubclassRelationship(functionType8, functionType9, subclassType10);
        boolean boolean14 = closureCodingConvention0.isExported("goog.exportSymbol", true);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = null;
        com.google.javascript.jscomp.Scope scope16 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention17 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str18 = closureCodingConvention17.getAbstractMethodName();
        java.lang.String str19 = closureCodingConvention17.getGlobalObject();
        java.lang.String str20 = closureCodingConvention17.getExportPropertyFunction();
        boolean boolean22 = closureCodingConvention17.isConstant("");
        boolean boolean25 = closureCodingConvention17.isExported("hi!", false);
        com.google.javascript.rhino.Node node26 = null;
        boolean boolean27 = closureCodingConvention17.isOptionalParameter(node26);
        boolean boolean29 = closureCodingConvention17.isConstant("goog.abstractMethod");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = null;
        com.google.javascript.jscomp.Scope scope31 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray32 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList33 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList33, objectTypeArray32);
        java.util.Map<java.lang.String, java.lang.String> strMap35 = null;
        closureCodingConvention17.defineDelegateProxyPrototypeProperties(jSTypeRegistry30, scope31, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList33, strMap35);
        java.util.Map<java.lang.String, java.lang.String> strMap37 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry15, scope16, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList33, strMap37);
        java.lang.String str39 = closureCodingConvention0.getDelegateSuperclassName();
        com.google.javascript.rhino.jstype.FunctionType functionType40 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType41 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType42 = null;
        closureCodingConvention0.applySubclassRelationship(functionType40, functionType41, subclassType42);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportSymbol" + "'", str3, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "goog.abstractMethod" + "'", str18, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "goog.global" + "'", str19, "goog.global");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "goog.exportProperty" + "'", str20, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objectTypeArray32);
        org.junit.Assert.assertArrayEquals(objectTypeArray32, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        boolean boolean4 = closureCodingConvention0.isExported("goog.global");
        java.lang.String str5 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship7 = closureCodingConvention0.getDelegateRelationship(node6);
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection8 = closureCodingConvention0.getAssertionFunctions();
        boolean boolean10 = closureCodingConvention0.isConstant("goog.exportSymbol");
        java.lang.String str11 = closureCodingConvention0.getExportSymbolFunction();
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship13 = closureCodingConvention0.getDelegateRelationship(node12);
        java.lang.String str14 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.Node node15 = null;
        boolean boolean16 = closureCodingConvention0.isVarArgsParameter(node15);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal17 = null;
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast objectLiteralCast19 = closureCodingConvention0.getObjectLiteralCast(nodeTraversal17, node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "goog.exportProperty" + "'", str5, "goog.exportProperty");
        org.junit.Assert.assertNull(delegateRelationship7);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "goog.exportSymbol" + "'", str11, "goog.exportSymbol");
        org.junit.Assert.assertNull(delegateRelationship13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "goog.abstractMethod" + "'", str14, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        boolean boolean5 = closureCodingConvention0.isConstant("goog.global");
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship7 = closureCodingConvention0.getDelegateRelationship(node6);
        java.lang.String str8 = closureCodingConvention0.getExportPropertyFunction();
        java.lang.String str9 = closureCodingConvention0.getExportSymbolFunction();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(delegateRelationship7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "goog.exportProperty" + "'", str8, "goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "goog.exportSymbol" + "'", str9, "goog.exportSymbol");
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        boolean boolean4 = closureCodingConvention0.isExported("goog.abstractMethod");
        boolean boolean7 = closureCodingConvention0.isExported("goog.abstractMethod", false);
        boolean boolean9 = closureCodingConvention0.isConstantKey("");
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = closureCodingConvention0.isVarArgsParameter(node10);
        boolean boolean13 = closureCodingConvention0.isValidEnumKey("hi!");
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship15 = closureCodingConvention0.getDelegateRelationship(node14);
        boolean boolean17 = closureCodingConvention0.isConstantKey("goog.exportProperty");
        boolean boolean19 = closureCodingConvention0.isValidEnumKey("hi!");
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection20 = closureCodingConvention0.getAssertionFunctions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(delegateRelationship15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection20);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        boolean boolean5 = closureCodingConvention0.isValidEnumKey("hi!");
        boolean boolean7 = closureCodingConvention0.isValidEnumKey("goog.abstractMethod");
        boolean boolean10 = closureCodingConvention0.isExported("goog.exportSymbol", false);
        com.google.javascript.rhino.Node node11 = null;
        boolean boolean12 = closureCodingConvention0.isOptionalParameter(node11);
        boolean boolean14 = closureCodingConvention0.isConstant("goog.global");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        com.google.javascript.rhino.Node node3 = null;
        boolean boolean4 = closureCodingConvention0.isVarArgsParameter(node3);
        boolean boolean6 = closureCodingConvention0.isExported("goog.exportProperty");
        boolean boolean8 = closureCodingConvention0.isPrivate("goog.global");
        java.lang.String str9 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = closureCodingConvention0.isVarArgsParameter(node10);
        java.lang.String str12 = closureCodingConvention0.getExportSymbolFunction();
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.Bind bind14 = closureCodingConvention0.describeFunctionBind(node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "goog.exportProperty" + "'", str9, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "goog.exportSymbol" + "'", str12, "goog.exportSymbol");
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        java.lang.String str3 = closureCodingConvention0.getDelegateSuperclassName();
        com.google.javascript.rhino.Node node4 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node4, strMap5);
        boolean boolean8 = closureCodingConvention0.isConstant("goog.abstractMethod");
        boolean boolean10 = closureCodingConvention0.isSuperClassReference("");
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship12 = closureCodingConvention0.getDelegateRelationship(node11);
        com.google.javascript.rhino.Node node13 = null;
        boolean boolean14 = closureCodingConvention0.isVarArgsParameter(node13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(delegateRelationship12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = closureCodingConvention0.isOptionalParameter(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = closureCodingConvention0.isOptionalParameter(node6);
        java.lang.String str8 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.Node node9 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node9, strMap10);
        boolean boolean13 = closureCodingConvention0.isPrivate("goog.exportSymbol");
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship15 = closureCodingConvention0.getDelegateRelationship(node14);
        java.lang.String str16 = closureCodingConvention0.getGlobalObject();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "goog.abstractMethod" + "'", str8, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(delegateRelationship15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "goog.global" + "'", str16, "goog.global");
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        java.lang.String str3 = closureCodingConvention0.getAbstractMethodName();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection4 = closureCodingConvention0.getAssertionFunctions();
        java.lang.String str5 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.jstype.FunctionType functionType6 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType7 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType8 = null;
        closureCodingConvention0.applySubclassRelationship(functionType6, functionType7, subclassType8);
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.Bind bind11 = closureCodingConvention0.describeFunctionBind(node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.abstractMethod" + "'", str3, "goog.abstractMethod");
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "goog.global" + "'", str5, "goog.global");
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        java.lang.String str3 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.abstractMethod");
        boolean boolean7 = closureCodingConvention0.isConstantKey("hi!");
        java.lang.String str8 = closureCodingConvention0.getGlobalObject();
        boolean boolean10 = closureCodingConvention0.isConstantKey("hi!");
        java.lang.String str11 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship13 = closureCodingConvention0.getDelegateRelationship(node12);
        java.lang.String str14 = closureCodingConvention0.getAbstractMethodName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportSymbol" + "'", str3, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "goog.global" + "'", str8, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "goog.abstractMethod" + "'", str11, "goog.abstractMethod");
        org.junit.Assert.assertNull(delegateRelationship13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "goog.abstractMethod" + "'", str14, "goog.abstractMethod");
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.exportProperty");
        java.lang.String str6 = closureCodingConvention0.getDelegateSuperclassName();
        boolean boolean8 = closureCodingConvention0.isSuperClassReference("goog.abstractMethod");
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType12 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType13 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType9, objectType10, objectType11, functionType12, functionType13);
        com.google.javascript.rhino.jstype.FunctionType functionType15 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType16 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType17 = null;
        closureCodingConvention0.applySubclassRelationship(functionType15, functionType16, subclassType17);
        boolean boolean20 = closureCodingConvention0.isValidEnumKey("goog.abstractMethod");
        com.google.javascript.jscomp.NodeTraversal nodeTraversal21 = null;
        com.google.javascript.rhino.Node node22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast objectLiteralCast23 = closureCodingConvention0.getObjectLiteralCast(nodeTraversal21, node22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection2 = closureCodingConvention0.getAssertionFunctions();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection3 = closureCodingConvention0.getAssertionFunctions();
        boolean boolean6 = closureCodingConvention0.isExported("goog.exportProperty", true);
        boolean boolean8 = closureCodingConvention0.isPrivate("goog.global");
        com.google.javascript.rhino.Node node9 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node9, strMap10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection2);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        java.lang.String str3 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.abstractMethod");
        boolean boolean7 = closureCodingConvention0.isConstantKey("hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType8 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType9 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType10 = null;
        closureCodingConvention0.applySubclassRelationship(functionType8, functionType9, subclassType10);
        java.lang.String str12 = closureCodingConvention0.getDelegateSuperclassName();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection13 = closureCodingConvention0.getAssertionFunctions();
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = closureCodingConvention0.isOptionalParameter(node14);
        boolean boolean17 = closureCodingConvention0.isConstantKey("goog.abstractMethod");
        boolean boolean20 = closureCodingConvention0.isExported("goog.abstractMethod", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportSymbol" + "'", str3, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        java.lang.String str3 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.abstractMethod");
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType9 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType10 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType6, objectType7, objectType8, functionType9, functionType10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = closureCodingConvention0.isVarArgsParameter(node12);
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType17 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType18 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType14, objectType15, objectType16, functionType17, functionType18);
        boolean boolean21 = closureCodingConvention0.isPrivate("goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportSymbol" + "'", str3, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        boolean boolean4 = closureCodingConvention0.isExported("goog.global");
        java.lang.String str5 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship7 = closureCodingConvention0.getDelegateRelationship(node6);
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection8 = closureCodingConvention0.getAssertionFunctions();
        com.google.javascript.rhino.Node node9 = null;
        boolean boolean10 = closureCodingConvention0.isVarArgsParameter(node9);
        com.google.javascript.rhino.Node node11 = null;
        boolean boolean12 = closureCodingConvention0.isVarArgsParameter(node11);
        boolean boolean14 = closureCodingConvention0.isExported("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "goog.exportProperty" + "'", str5, "goog.exportProperty");
        org.junit.Assert.assertNull(delegateRelationship7);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        java.lang.String str3 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.abstractMethod");
        boolean boolean7 = closureCodingConvention0.isConstantKey("hi!");
        java.lang.String str8 = closureCodingConvention0.getExportSymbolFunction();
        com.google.javascript.rhino.Node node9 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node9, strMap10);
        boolean boolean13 = closureCodingConvention0.isConstant("goog.abstractMethod");
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = closureCodingConvention0.isVarArgsParameter(node14);
        boolean boolean17 = closureCodingConvention0.isSuperClassReference("goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportSymbol" + "'", str3, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "goog.exportSymbol" + "'", str8, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.Node node3 = null;
        boolean boolean4 = closureCodingConvention0.isOptionalParameter(node3);
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = closureCodingConvention0.isVarArgsParameter(node5);
        boolean boolean8 = closureCodingConvention0.isPrivate("");
        boolean boolean10 = closureCodingConvention0.isConstant("goog.abstractMethod");
        com.google.javascript.rhino.Node node11 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap12 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node11, strMap12);
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection14 = closureCodingConvention0.getAssertionFunctions();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection14);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        java.lang.String str3 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.exportProperty");
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = closureCodingConvention0.isPropertyTestFunction(node6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportSymbol" + "'", str3, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        java.lang.String str3 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean5 = closureCodingConvention0.isSuperClassReference("goog.exportProperty");
        com.google.javascript.rhino.Node node6 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap7 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node6, strMap7);
        java.lang.String str9 = closureCodingConvention0.getDelegateSuperclassName();
        boolean boolean11 = closureCodingConvention0.isSuperClassReference("goog.exportSymbol");
        java.lang.String str12 = closureCodingConvention0.getExportPropertyFunction();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportSymbol" + "'", str3, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "goog.exportProperty" + "'", str12, "goog.exportProperty");
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        com.google.javascript.rhino.Node node3 = null;
        boolean boolean4 = closureCodingConvention0.isVarArgsParameter(node3);
        boolean boolean6 = closureCodingConvention0.isExported("goog.exportProperty");
        com.google.javascript.rhino.Node node7 = null;
        boolean boolean8 = closureCodingConvention0.isVarArgsParameter(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship10 = closureCodingConvention0.getDelegateRelationship(node9);
        java.lang.String str11 = closureCodingConvention0.getDelegateSuperclassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(delegateRelationship10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.exportProperty");
        com.google.javascript.rhino.Node node6 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap7 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node6, strMap7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship10 = closureCodingConvention0.getDelegateRelationship(node9);
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection11 = closureCodingConvention0.getAssertionFunctions();
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship13 = closureCodingConvention0.getDelegateRelationship(node12);
        java.lang.String str14 = closureCodingConvention0.getDelegateSuperclassName();
        com.google.javascript.rhino.Node node15 = null;
        boolean boolean16 = closureCodingConvention0.isVarArgsParameter(node15);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(delegateRelationship10);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection11);
        org.junit.Assert.assertNull(delegateRelationship13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = closureCodingConvention0.isOptionalParameter(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = closureCodingConvention0.isOptionalParameter(node6);
        boolean boolean9 = closureCodingConvention0.isConstant("goog.exportProperty");
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = closureCodingConvention0.isOptionalParameter(node10);
        com.google.javascript.rhino.jstype.FunctionType functionType12 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType13 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType14 = null;
        closureCodingConvention0.applySubclassRelationship(functionType12, functionType13, subclassType14);
        boolean boolean18 = closureCodingConvention0.isExported("", true);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        com.google.javascript.rhino.Node node3 = null;
        boolean boolean4 = closureCodingConvention0.isVarArgsParameter(node3);
        boolean boolean6 = closureCodingConvention0.isExported("goog.exportProperty");
        com.google.javascript.rhino.Node node7 = null;
        boolean boolean8 = closureCodingConvention0.isVarArgsParameter(node7);
        com.google.javascript.rhino.Node node9 = null;
        boolean boolean10 = closureCodingConvention0.isVarArgsParameter(node9);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType12 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType13 = null;
        closureCodingConvention0.applySubclassRelationship(functionType11, functionType12, subclassType13);
        java.lang.String str15 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType18 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType19 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType20 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType16, objectType17, objectType18, functionType19, functionType20);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "goog.abstractMethod" + "'", str15, "goog.abstractMethod");
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        com.google.javascript.rhino.Node node3 = null;
        boolean boolean4 = closureCodingConvention0.isVarArgsParameter(node3);
        boolean boolean6 = closureCodingConvention0.isExported("goog.exportProperty");
        com.google.javascript.rhino.Node node7 = null;
        boolean boolean8 = closureCodingConvention0.isVarArgsParameter(node7);
        com.google.javascript.rhino.Node node9 = null;
        boolean boolean10 = closureCodingConvention0.isVarArgsParameter(node9);
        boolean boolean13 = closureCodingConvention0.isExported("", true);
        boolean boolean15 = closureCodingConvention0.isConstant("");
        boolean boolean17 = closureCodingConvention0.isConstant("goog.global");
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship19 = closureCodingConvention0.getDelegateRelationship(node18);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(delegateRelationship19);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        boolean boolean5 = closureCodingConvention0.isConstantKey("goog.abstractMethod");
        boolean boolean7 = closureCodingConvention0.isSuperClassReference("goog.global");
        java.lang.String str8 = closureCodingConvention0.getDelegateSuperclassName();
        java.lang.String str9 = closureCodingConvention0.getExportSymbolFunction();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType11 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType12 = null;
        closureCodingConvention0.applySubclassRelationship(functionType10, functionType11, subclassType12);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "goog.exportSymbol" + "'", str9, "goog.exportSymbol");
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection2 = closureCodingConvention0.getAssertionFunctions();
        java.lang.String str3 = closureCodingConvention0.getExportSymbolFunction();
        java.lang.String str4 = closureCodingConvention0.getDelegateSuperclassName();
        boolean boolean6 = closureCodingConvention0.isSuperClassReference("goog.exportSymbol");
        com.google.javascript.rhino.Node node7 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node7, strMap8);
        com.google.javascript.rhino.Node node10 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node10, strMap11);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportSymbol" + "'", str3, "goog.exportSymbol");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        boolean boolean4 = closureCodingConvention0.isExported("goog.global");
        boolean boolean6 = closureCodingConvention0.isValidEnumKey("goog.global");
        java.lang.String str7 = closureCodingConvention0.getExportPropertyFunction();
        java.lang.Class<?> wildcardClass8 = closureCodingConvention0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "goog.exportProperty" + "'", str7, "goog.exportProperty");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        boolean boolean4 = closureCodingConvention0.isExported("goog.abstractMethod");
        boolean boolean7 = closureCodingConvention0.isExported("goog.abstractMethod", false);
        boolean boolean9 = closureCodingConvention0.isConstantKey("");
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = closureCodingConvention0.isVarArgsParameter(node10);
        boolean boolean13 = closureCodingConvention0.isValidEnumKey("hi!");
        boolean boolean15 = closureCodingConvention0.isSuperClassReference("hi!");
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType18 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType19 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType20 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType16, objectType17, objectType18, functionType19, functionType20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = closureCodingConvention0.isVarArgsParameter(node22);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        java.lang.String str3 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.abstractMethod");
        boolean boolean7 = closureCodingConvention0.isConstantKey("hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType8 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType9 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType10 = null;
        closureCodingConvention0.applySubclassRelationship(functionType8, functionType9, subclassType10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = closureCodingConvention0.isVarArgsParameter(node12);
        boolean boolean15 = closureCodingConvention0.isValidEnumKey("goog.abstractMethod");
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType18 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType19 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType20 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType16, objectType17, objectType18, functionType19, functionType20);
        boolean boolean23 = closureCodingConvention0.isValidEnumKey("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportSymbol" + "'", str3, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.Node node3 = null;
        boolean boolean4 = closureCodingConvention0.isOptionalParameter(node3);
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = closureCodingConvention0.isVarArgsParameter(node5);
        com.google.javascript.rhino.Node node7 = null;
        boolean boolean8 = closureCodingConvention0.isOptionalParameter(node7);
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType12 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType13 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType9, objectType10, objectType11, functionType12, functionType13);
        java.lang.String str15 = closureCodingConvention0.getDelegateSuperclassName();
        com.google.javascript.rhino.jstype.FunctionType functionType16 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType17 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType18 = null;
        closureCodingConvention0.applySubclassRelationship(functionType16, functionType17, subclassType18);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        boolean boolean4 = closureCodingConvention0.isExported("goog.global");
        java.lang.String str5 = closureCodingConvention0.getGlobalObject();
        boolean boolean7 = closureCodingConvention0.isConstant("");
        com.google.javascript.rhino.jstype.FunctionType functionType8 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType9 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType10 = null;
        closureCodingConvention0.applySubclassRelationship(functionType8, functionType9, subclassType10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = closureCodingConvention0.isOptionalParameter(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = closureCodingConvention0.isOptionalParameter(node14);
        com.google.javascript.rhino.jstype.FunctionType functionType16 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType17 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType18 = null;
        // The following exception was thrown during execution in test generation
        try {
            closureCodingConvention0.applySingletonGetter(functionType16, functionType17, objectType18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "goog.global" + "'", str5, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        com.google.javascript.rhino.Node node3 = null;
        boolean boolean4 = closureCodingConvention0.isVarArgsParameter(node3);
        boolean boolean6 = closureCodingConvention0.isExported("goog.exportProperty");
        com.google.javascript.rhino.Node node7 = null;
        boolean boolean8 = closureCodingConvention0.isVarArgsParameter(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship10 = closureCodingConvention0.getDelegateRelationship(node9);
        java.lang.String str11 = closureCodingConvention0.getExportPropertyFunction();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(delegateRelationship10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "goog.exportProperty" + "'", str11, "goog.exportProperty");
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean5 = closureCodingConvention0.isConstant("");
        boolean boolean8 = closureCodingConvention0.isExported("hi!", false);
        com.google.javascript.rhino.Node node9 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node9, strMap10);
        boolean boolean13 = closureCodingConvention0.isValidEnumKey("goog.exportSymbol");
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = closureCodingConvention0.isOptionalParameter(node14);
        java.lang.String str16 = closureCodingConvention0.getGlobalObject();
        java.lang.String str17 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = closureCodingConvention0.isVarArgsParameter(node18);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "goog.global" + "'", str16, "goog.global");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "goog.global" + "'", str17, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        boolean boolean5 = closureCodingConvention0.isValidEnumKey("hi!");
        boolean boolean7 = closureCodingConvention0.isValidEnumKey("goog.abstractMethod");
        boolean boolean9 = closureCodingConvention0.isExported("goog.abstractMethod");
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = closureCodingConvention0.extractClassNameIfRequire(node10, node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        com.google.javascript.rhino.Node node3 = null;
        boolean boolean4 = closureCodingConvention0.isVarArgsParameter(node3);
        boolean boolean6 = closureCodingConvention0.isExported("goog.exportProperty");
        boolean boolean8 = closureCodingConvention0.isPrivate("goog.global");
        java.lang.String str9 = closureCodingConvention0.getExportPropertyFunction();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection10 = closureCodingConvention0.getAssertionFunctions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "goog.exportProperty" + "'", str9, "goog.exportProperty");
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection10);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        java.lang.String str3 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean5 = closureCodingConvention0.isSuperClassReference("goog.exportProperty");
        com.google.javascript.rhino.Node node6 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap7 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node6, strMap7);
        java.lang.String str9 = closureCodingConvention0.getDelegateSuperclassName();
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = closureCodingConvention0.isVarArgsParameter(node10);
        boolean boolean13 = closureCodingConvention0.isConstantKey("goog.global");
        boolean boolean15 = closureCodingConvention0.isSuperClassReference("");
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship17 = closureCodingConvention0.getDelegateRelationship(node16);
        boolean boolean19 = closureCodingConvention0.isValidEnumKey("");
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        com.google.javascript.rhino.Node node21 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast objectLiteralCast22 = closureCodingConvention0.getObjectLiteralCast(nodeTraversal20, node21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportSymbol" + "'", str3, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(delegateRelationship17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.Node node4 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node4, strMap5);
        java.lang.String str7 = closureCodingConvention0.getExportSymbolFunction();
        com.google.javascript.rhino.jstype.FunctionType functionType8 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType9 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType10 = null;
        closureCodingConvention0.applySubclassRelationship(functionType8, functionType9, subclassType10);
        boolean boolean13 = closureCodingConvention0.isConstant("hi!");
        java.lang.String str14 = closureCodingConvention0.getExportSymbolFunction();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "goog.exportSymbol" + "'", str7, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "goog.exportSymbol" + "'", str14, "goog.exportSymbol");
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        java.lang.String str3 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.abstractMethod");
        boolean boolean7 = closureCodingConvention0.isConstantKey("hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType8 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType9 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType10 = null;
        closureCodingConvention0.applySubclassRelationship(functionType8, functionType9, subclassType10);
        java.lang.String str12 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship14 = closureCodingConvention0.getDelegateRelationship(node13);
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType18 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType19 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType15, objectType16, objectType17, functionType18, functionType19);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType23 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType24 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType25 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType21, objectType22, objectType23, functionType24, functionType25);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = null;
        com.google.javascript.jscomp.Scope scope28 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention29 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str30 = closureCodingConvention29.getAbstractMethodName();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection31 = closureCodingConvention29.getAssertionFunctions();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection32 = closureCodingConvention29.getAssertionFunctions();
        com.google.javascript.rhino.Node node33 = null;
        boolean boolean34 = closureCodingConvention29.isOptionalParameter(node33);
        boolean boolean36 = closureCodingConvention29.isConstantKey("goog.global");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry37 = null;
        com.google.javascript.jscomp.Scope scope38 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention39 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean41 = closureCodingConvention39.isConstantKey("");
        java.lang.String str42 = closureCodingConvention39.getExportSymbolFunction();
        boolean boolean44 = closureCodingConvention39.isPrivate("goog.abstractMethod");
        boolean boolean46 = closureCodingConvention39.isConstantKey("hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType47 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType48 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType49 = null;
        closureCodingConvention39.applySubclassRelationship(functionType47, functionType48, subclassType49);
        boolean boolean53 = closureCodingConvention39.isExported("goog.exportSymbol", true);
        java.lang.String str54 = closureCodingConvention39.getExportPropertyFunction();
        boolean boolean57 = closureCodingConvention39.isExported("goog.exportProperty", true);
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection58 = closureCodingConvention39.getAssertionFunctions();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry59 = null;
        com.google.javascript.jscomp.Scope scope60 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention61 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str62 = closureCodingConvention61.getAbstractMethodName();
        java.lang.String str63 = closureCodingConvention61.getGlobalObject();
        java.lang.String str64 = closureCodingConvention61.getGlobalObject();
        boolean boolean66 = closureCodingConvention61.isValidEnumKey("hi!");
        boolean boolean68 = closureCodingConvention61.isPrivate("");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry69 = null;
        com.google.javascript.jscomp.Scope scope70 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray71 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList72 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList72, objectTypeArray71);
        java.util.Map<java.lang.String, java.lang.String> strMap74 = null;
        closureCodingConvention61.defineDelegateProxyPrototypeProperties(jSTypeRegistry69, scope70, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList72, strMap74);
        java.util.Map<java.lang.String, java.lang.String> strMap76 = null;
        closureCodingConvention39.defineDelegateProxyPrototypeProperties(jSTypeRegistry59, scope60, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList72, strMap76);
        java.util.Map<java.lang.String, java.lang.String> strMap78 = null;
        closureCodingConvention29.defineDelegateProxyPrototypeProperties(jSTypeRegistry37, scope38, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList72, strMap78);
        java.util.Map<java.lang.String, java.lang.String> strMap80 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry27, scope28, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList72, strMap80);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportSymbol" + "'", str3, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "goog.abstractMethod" + "'", str12, "goog.abstractMethod");
        org.junit.Assert.assertNull(delegateRelationship14);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "goog.abstractMethod" + "'", str30, "goog.abstractMethod");
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection31);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "goog.exportSymbol" + "'", str42, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "goog.exportProperty" + "'", str54, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection58);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "goog.abstractMethod" + "'", str62, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "goog.global" + "'", str63, "goog.global");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "goog.global" + "'", str64, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(objectTypeArray71);
        org.junit.Assert.assertArrayEquals(objectTypeArray71, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        java.lang.String str3 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.abstractMethod");
        boolean boolean7 = closureCodingConvention0.isConstantKey("hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType8 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType9 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType10 = null;
        closureCodingConvention0.applySubclassRelationship(functionType8, functionType9, subclassType10);
        boolean boolean14 = closureCodingConvention0.isExported("goog.global", false);
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection15 = closureCodingConvention0.getAssertionFunctions();
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = closureCodingConvention0.isVarArgsParameter(node16);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportSymbol" + "'", str3, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getDelegateSuperclassName();
        boolean boolean3 = closureCodingConvention0.isConstant("goog.exportProperty");
        java.lang.String str4 = closureCodingConvention0.getDelegateSuperclassName();
        boolean boolean6 = closureCodingConvention0.isPrivate("goog.exportProperty");
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.Bind bind8 = closureCodingConvention0.describeFunctionBind(node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        java.lang.String str3 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.abstractMethod");
        boolean boolean7 = closureCodingConvention0.isConstantKey("hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType8 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType9 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType10 = null;
        closureCodingConvention0.applySubclassRelationship(functionType8, functionType9, subclassType10);
        boolean boolean14 = closureCodingConvention0.isExported("goog.exportSymbol", true);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = null;
        com.google.javascript.jscomp.Scope scope16 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention17 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str18 = closureCodingConvention17.getAbstractMethodName();
        java.lang.String str19 = closureCodingConvention17.getGlobalObject();
        java.lang.String str20 = closureCodingConvention17.getExportPropertyFunction();
        boolean boolean22 = closureCodingConvention17.isConstant("");
        boolean boolean25 = closureCodingConvention17.isExported("hi!", false);
        com.google.javascript.rhino.Node node26 = null;
        boolean boolean27 = closureCodingConvention17.isOptionalParameter(node26);
        boolean boolean29 = closureCodingConvention17.isConstant("goog.abstractMethod");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = null;
        com.google.javascript.jscomp.Scope scope31 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray32 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList33 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList33, objectTypeArray32);
        java.util.Map<java.lang.String, java.lang.String> strMap35 = null;
        closureCodingConvention17.defineDelegateProxyPrototypeProperties(jSTypeRegistry30, scope31, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList33, strMap35);
        java.util.Map<java.lang.String, java.lang.String> strMap37 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry15, scope16, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList33, strMap37);
        boolean boolean40 = closureCodingConvention0.isSuperClassReference("hi!");
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection41 = closureCodingConvention0.getAssertionFunctions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportSymbol" + "'", str3, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "goog.abstractMethod" + "'", str18, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "goog.global" + "'", str19, "goog.global");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "goog.exportProperty" + "'", str20, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objectTypeArray32);
        org.junit.Assert.assertArrayEquals(objectTypeArray32, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection41);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        boolean boolean5 = closureCodingConvention0.isValidEnumKey("hi!");
        boolean boolean7 = closureCodingConvention0.isPrivate("");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = null;
        com.google.javascript.jscomp.Scope scope9 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray10 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList11 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList11, objectTypeArray10);
        java.util.Map<java.lang.String, java.lang.String> strMap13 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry8, scope9, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList11, strMap13);
        boolean boolean16 = closureCodingConvention0.isSuperClassReference("goog.exportSymbol");
        boolean boolean18 = closureCodingConvention0.isExported("goog.exportSymbol");
        boolean boolean21 = closureCodingConvention0.isExported("hi!", false);
        java.lang.String str22 = closureCodingConvention0.getExportSymbolFunction();
        java.lang.String str23 = closureCodingConvention0.getAbstractMethodName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objectTypeArray10);
        org.junit.Assert.assertArrayEquals(objectTypeArray10, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "goog.exportSymbol" + "'", str22, "goog.exportSymbol");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "goog.abstractMethod" + "'", str23, "goog.abstractMethod");
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.Node node4 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node4, strMap5);
        java.lang.String str7 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = null;
        com.google.javascript.jscomp.Scope scope9 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention10 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str11 = closureCodingConvention10.getAbstractMethodName();
        java.lang.String str12 = closureCodingConvention10.getGlobalObject();
        java.lang.String str13 = closureCodingConvention10.getGlobalObject();
        boolean boolean15 = closureCodingConvention10.isValidEnumKey("hi!");
        boolean boolean17 = closureCodingConvention10.isPrivate("");
        com.google.javascript.rhino.jstype.ObjectType objectType18 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType21 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType22 = null;
        closureCodingConvention10.applyDelegateRelationship(objectType18, objectType19, objectType20, functionType21, functionType22);
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = closureCodingConvention10.isVarArgsParameter(node24);
        boolean boolean27 = closureCodingConvention10.isValidEnumKey("goog.exportProperty");
        boolean boolean29 = closureCodingConvention10.isExported("");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = null;
        com.google.javascript.jscomp.Scope scope31 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention32 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str33 = closureCodingConvention32.getAbstractMethodName();
        java.lang.String str34 = closureCodingConvention32.getGlobalObject();
        java.lang.String str35 = closureCodingConvention32.getGlobalObject();
        boolean boolean37 = closureCodingConvention32.isValidEnumKey("hi!");
        com.google.javascript.rhino.Node node38 = null;
        boolean boolean39 = closureCodingConvention32.isVarArgsParameter(node38);
        java.lang.String str40 = closureCodingConvention32.getAbstractMethodName();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry41 = null;
        com.google.javascript.jscomp.Scope scope42 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention43 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str44 = closureCodingConvention43.getAbstractMethodName();
        java.lang.String str45 = closureCodingConvention43.getGlobalObject();
        java.lang.String str46 = closureCodingConvention43.getGlobalObject();
        boolean boolean48 = closureCodingConvention43.isValidEnumKey("hi!");
        boolean boolean50 = closureCodingConvention43.isPrivate("");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry51 = null;
        com.google.javascript.jscomp.Scope scope52 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray53 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList54 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList54, objectTypeArray53);
        java.util.Map<java.lang.String, java.lang.String> strMap56 = null;
        closureCodingConvention43.defineDelegateProxyPrototypeProperties(jSTypeRegistry51, scope52, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList54, strMap56);
        java.util.Map<java.lang.String, java.lang.String> strMap58 = null;
        closureCodingConvention32.defineDelegateProxyPrototypeProperties(jSTypeRegistry41, scope42, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList54, strMap58);
        java.util.Map<java.lang.String, java.lang.String> strMap60 = null;
        closureCodingConvention10.defineDelegateProxyPrototypeProperties(jSTypeRegistry30, scope31, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList54, strMap60);
        java.util.Map<java.lang.String, java.lang.String> strMap62 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry8, scope9, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList54, strMap62);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "goog.global" + "'", str7, "goog.global");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "goog.abstractMethod" + "'", str11, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "goog.global" + "'", str12, "goog.global");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "goog.global" + "'", str13, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "goog.abstractMethod" + "'", str33, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "goog.global" + "'", str34, "goog.global");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "goog.global" + "'", str35, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "goog.abstractMethod" + "'", str40, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "goog.abstractMethod" + "'", str44, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "goog.global" + "'", str45, "goog.global");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "goog.global" + "'", str46, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(objectTypeArray53);
        org.junit.Assert.assertArrayEquals(objectTypeArray53, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.Node node4 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node4, strMap5);
        java.lang.String str7 = closureCodingConvention0.getExportSymbolFunction();
        java.lang.String str8 = closureCodingConvention0.getGlobalObject();
        boolean boolean11 = closureCodingConvention0.isExported("goog.exportProperty", false);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "goog.exportSymbol" + "'", str7, "goog.exportSymbol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "goog.global" + "'", str8, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        java.lang.String str3 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.abstractMethod");
        boolean boolean7 = closureCodingConvention0.isConstantKey("hi!");
        java.lang.String str8 = closureCodingConvention0.getGlobalObject();
        java.lang.String str9 = closureCodingConvention0.getExportPropertyFunction();
        java.lang.String str10 = closureCodingConvention0.getExportSymbolFunction();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection11 = closureCodingConvention0.getAssertionFunctions();
        java.lang.String str12 = closureCodingConvention0.getDelegateSuperclassName();
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = closureCodingConvention0.getSingletonGetterClassName(node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportSymbol" + "'", str3, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "goog.global" + "'", str8, "goog.global");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "goog.exportProperty" + "'", str9, "goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "goog.exportSymbol" + "'", str10, "goog.exportSymbol");
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        java.lang.String str3 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.abstractMethod");
        boolean boolean7 = closureCodingConvention0.isConstantKey("hi!");
        java.lang.String str8 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.Node node9 = null;
        boolean boolean10 = closureCodingConvention0.isVarArgsParameter(node9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship12 = closureCodingConvention0.getDelegateRelationship(node11);
        java.lang.String str13 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str14 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str15 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship17 = closureCodingConvention0.getDelegateRelationship(node16);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportSymbol" + "'", str3, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "goog.global" + "'", str8, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(delegateRelationship12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "goog.abstractMethod" + "'", str13, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "goog.abstractMethod" + "'", str14, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "goog.abstractMethod" + "'", str15, "goog.abstractMethod");
        org.junit.Assert.assertNull(delegateRelationship17);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        com.google.javascript.rhino.Node node3 = null;
        boolean boolean4 = closureCodingConvention0.isVarArgsParameter(node3);
        boolean boolean6 = closureCodingConvention0.isExported("goog.exportProperty");
        boolean boolean9 = closureCodingConvention0.isExported("goog.abstractMethod", false);
        java.lang.String str10 = closureCodingConvention0.getGlobalObject();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "goog.global" + "'", str10, "goog.global");
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        java.lang.String str3 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean5 = closureCodingConvention0.isSuperClassReference("goog.exportProperty");
        com.google.javascript.rhino.Node node6 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap7 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node6, strMap7);
        java.lang.String str9 = closureCodingConvention0.getDelegateSuperclassName();
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = closureCodingConvention0.isVarArgsParameter(node10);
        java.lang.String str12 = closureCodingConvention0.getExportSymbolFunction();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportSymbol" + "'", str3, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "goog.exportSymbol" + "'", str12, "goog.exportSymbol");
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.exportProperty");
        java.lang.String str6 = closureCodingConvention0.getDelegateSuperclassName();
        boolean boolean8 = closureCodingConvention0.isSuperClassReference("goog.abstractMethod");
        java.lang.String str9 = closureCodingConvention0.getExportSymbolFunction();
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = closureCodingConvention0.isVarArgsParameter(node10);
        com.google.javascript.rhino.jstype.FunctionType functionType12 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType13 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType14 = null;
        closureCodingConvention0.applySubclassRelationship(functionType12, functionType13, subclassType14);
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList17 = closureCodingConvention0.identifyTypeDeclarationCall(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "goog.exportSymbol" + "'", str9, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        boolean boolean4 = closureCodingConvention0.isExported("goog.global");
        java.lang.String str5 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = closureCodingConvention0.isVarArgsParameter(node6);
        boolean boolean9 = closureCodingConvention0.isSuperClassReference("hi!");
        boolean boolean12 = closureCodingConvention0.isExported("goog.global", false);
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection13 = closureCodingConvention0.getAssertionFunctions();
        boolean boolean15 = closureCodingConvention0.isExported("goog.abstractMethod");
        boolean boolean17 = closureCodingConvention0.isValidEnumKey("goog.exportSymbol");
        boolean boolean19 = closureCodingConvention0.isExported("hi!");
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = closureCodingConvention0.extractClassNameIfProvide(node20, node21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "goog.exportProperty" + "'", str5, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection2 = closureCodingConvention0.getAssertionFunctions();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection3 = closureCodingConvention0.getAssertionFunctions();
        boolean boolean5 = closureCodingConvention0.isExported("goog.abstractMethod");
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship7 = closureCodingConvention0.getDelegateRelationship(node6);
        boolean boolean9 = closureCodingConvention0.isConstant("goog.exportSymbol");
        boolean boolean11 = closureCodingConvention0.isConstantKey("hi!");
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship13 = closureCodingConvention0.getDelegateRelationship(node12);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection2);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(delegateRelationship7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(delegateRelationship13);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.exportProperty");
        com.google.javascript.rhino.Node node6 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap7 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node6, strMap7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship10 = closureCodingConvention0.getDelegateRelationship(node9);
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection11 = closureCodingConvention0.getAssertionFunctions();
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship13 = closureCodingConvention0.getDelegateRelationship(node12);
        java.lang.String str14 = closureCodingConvention0.getDelegateSuperclassName();
        java.lang.String str15 = closureCodingConvention0.getExportSymbolFunction();
        java.lang.String str16 = closureCodingConvention0.getGlobalObject();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(delegateRelationship10);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection11);
        org.junit.Assert.assertNull(delegateRelationship13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "goog.exportSymbol" + "'", str15, "goog.exportSymbol");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "goog.global" + "'", str16, "goog.global");
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.Node node3 = null;
        boolean boolean4 = closureCodingConvention0.isOptionalParameter(node3);
        java.lang.Class<?> wildcardClass5 = closureCodingConvention0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship5 = closureCodingConvention0.getDelegateRelationship(node4);
        java.lang.String str6 = closureCodingConvention0.getAbstractMethodName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertNull(delegateRelationship5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "goog.abstractMethod" + "'", str6, "goog.abstractMethod");
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        boolean boolean5 = closureCodingConvention0.isValidEnumKey("hi!");
        boolean boolean7 = closureCodingConvention0.isPrivate("");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = null;
        com.google.javascript.jscomp.Scope scope9 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray10 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList11 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList11, objectTypeArray10);
        java.util.Map<java.lang.String, java.lang.String> strMap13 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry8, scope9, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList11, strMap13);
        boolean boolean16 = closureCodingConvention0.isSuperClassReference("goog.exportSymbol");
        boolean boolean18 = closureCodingConvention0.isValidEnumKey("hi!");
        boolean boolean20 = closureCodingConvention0.isExported("goog.exportProperty");
        boolean boolean22 = closureCodingConvention0.isExported("goog.abstractMethod");
        boolean boolean24 = closureCodingConvention0.isConstant("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objectTypeArray10);
        org.junit.Assert.assertArrayEquals(objectTypeArray10, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getDelegateSuperclassName();
        java.lang.String str2 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean4 = closureCodingConvention0.isPrivate("hi!");
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = closureCodingConvention0.isOptionalParameter(node5);
        boolean boolean8 = closureCodingConvention0.isValidEnumKey("");
        com.google.javascript.rhino.Node node9 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node9, strMap10);
        com.google.javascript.rhino.jstype.FunctionType functionType12 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType13 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType14 = null;
        closureCodingConvention0.applySubclassRelationship(functionType12, functionType13, subclassType14);
        boolean boolean18 = closureCodingConvention0.isExported("hi!", false);
        com.google.javascript.rhino.Node node19 = null;
        boolean boolean20 = closureCodingConvention0.isVarArgsParameter(node19);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.exportSymbol" + "'", str2, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        java.lang.String str3 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.abstractMethod");
        boolean boolean7 = closureCodingConvention0.isConstantKey("hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType8 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType9 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType10 = null;
        closureCodingConvention0.applySubclassRelationship(functionType8, functionType9, subclassType10);
        boolean boolean14 = closureCodingConvention0.isExported("goog.exportSymbol", true);
        com.google.javascript.rhino.Node node15 = null;
        boolean boolean16 = closureCodingConvention0.isVarArgsParameter(node15);
        java.lang.String str17 = closureCodingConvention0.getDelegateSuperclassName();
        boolean boolean20 = closureCodingConvention0.isExported("goog.exportProperty", false);
        boolean boolean22 = closureCodingConvention0.isConstantKey("goog.global");
        boolean boolean25 = closureCodingConvention0.isExported("", false);
        java.lang.String str26 = closureCodingConvention0.getGlobalObject();
        java.lang.String str27 = closureCodingConvention0.getDelegateSuperclassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportSymbol" + "'", str3, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "goog.global" + "'", str26, "goog.global");
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.exportProperty");
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection6 = closureCodingConvention0.getAssertionFunctions();
        com.google.javascript.rhino.Node node7 = null;
        boolean boolean8 = closureCodingConvention0.isOptionalParameter(node7);
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType12 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType13 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType9, objectType10, objectType11, functionType12, functionType13);
        java.lang.String str15 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean17 = closureCodingConvention0.isSuperClassReference("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "goog.exportProperty" + "'", str15, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        java.lang.String str3 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.abstractMethod");
        boolean boolean7 = closureCodingConvention0.isConstantKey("hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType8 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType9 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType10 = null;
        closureCodingConvention0.applySubclassRelationship(functionType8, functionType9, subclassType10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = closureCodingConvention0.isVarArgsParameter(node12);
        java.lang.String str14 = closureCodingConvention0.getGlobalObject();
        boolean boolean16 = closureCodingConvention0.isPrivate("goog.abstractMethod");
        java.lang.String str17 = closureCodingConvention0.getDelegateSuperclassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportSymbol" + "'", str3, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "goog.global" + "'", str14, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        java.lang.String str3 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.abstractMethod");
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship7 = closureCodingConvention0.getDelegateRelationship(node6);
        java.lang.String str8 = closureCodingConvention0.getAbstractMethodName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportSymbol" + "'", str3, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(delegateRelationship7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "goog.abstractMethod" + "'", str8, "goog.abstractMethod");
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        com.google.javascript.rhino.Node node3 = null;
        boolean boolean4 = closureCodingConvention0.isVarArgsParameter(node3);
        boolean boolean6 = closureCodingConvention0.isExported("goog.exportProperty");
        com.google.javascript.rhino.Node node7 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node7, strMap8);
        com.google.javascript.rhino.Node node10 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node10, strMap11);
        boolean boolean15 = closureCodingConvention0.isExported("goog.exportProperty", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getDelegateSuperclassName();
        java.lang.String str2 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean4 = closureCodingConvention0.isPrivate("hi!");
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = closureCodingConvention0.isOptionalParameter(node5);
        boolean boolean8 = closureCodingConvention0.isValidEnumKey("");
        boolean boolean10 = closureCodingConvention0.isExported("goog.global");
        boolean boolean12 = closureCodingConvention0.isSuperClassReference("goog.exportSymbol");
        com.google.javascript.rhino.jstype.FunctionType functionType13 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType14 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            closureCodingConvention0.applySingletonGetter(functionType13, functionType14, objectType15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.exportSymbol" + "'", str2, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        java.lang.String str3 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean5 = closureCodingConvention0.isSuperClassReference("goog.exportProperty");
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = closureCodingConvention0.isOptionalParameter(node6);
        com.google.javascript.rhino.Node node8 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node8, strMap9);
        boolean boolean13 = closureCodingConvention0.isExported("goog.abstractMethod", true);
        java.lang.String str14 = closureCodingConvention0.getDelegateSuperclassName();
        java.lang.String str15 = closureCodingConvention0.getExportSymbolFunction();
        java.lang.String str16 = closureCodingConvention0.getGlobalObject();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportSymbol" + "'", str3, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "goog.exportSymbol" + "'", str15, "goog.exportSymbol");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "goog.global" + "'", str16, "goog.global");
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection2 = closureCodingConvention0.getAssertionFunctions();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection3 = closureCodingConvention0.getAssertionFunctions();
        boolean boolean5 = closureCodingConvention0.isExported("goog.abstractMethod");
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship7 = closureCodingConvention0.getDelegateRelationship(node6);
        boolean boolean10 = closureCodingConvention0.isExported("goog.global", false);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal11 = null;
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast objectLiteralCast13 = closureCodingConvention0.getObjectLiteralCast(nodeTraversal11, node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection2);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(delegateRelationship7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        java.lang.String str3 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.abstractMethod");
        boolean boolean7 = closureCodingConvention0.isConstantKey("hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType8 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType9 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType10 = null;
        closureCodingConvention0.applySubclassRelationship(functionType8, functionType9, subclassType10);
        java.lang.String str12 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship14 = closureCodingConvention0.getDelegateRelationship(node13);
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType18 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType19 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType15, objectType16, objectType17, functionType18, functionType19);
        com.google.javascript.rhino.Node node21 = null;
        boolean boolean22 = closureCodingConvention0.isVarArgsParameter(node21);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportSymbol" + "'", str3, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "goog.abstractMethod" + "'", str12, "goog.abstractMethod");
        org.junit.Assert.assertNull(delegateRelationship14);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection2 = closureCodingConvention0.getAssertionFunctions();
        java.lang.String str3 = closureCodingConvention0.getExportSymbolFunction();
        java.lang.String str4 = closureCodingConvention0.getDelegateSuperclassName();
        boolean boolean6 = closureCodingConvention0.isSuperClassReference("goog.exportSymbol");
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType10 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType11 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType7, objectType8, objectType9, functionType10, functionType11);
        java.lang.String str13 = closureCodingConvention0.getExportSymbolFunction();
        java.lang.String str14 = closureCodingConvention0.getAbstractMethodName();
        boolean boolean16 = closureCodingConvention0.isValidEnumKey("goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportSymbol" + "'", str3, "goog.exportSymbol");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "goog.exportSymbol" + "'", str13, "goog.exportSymbol");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "goog.abstractMethod" + "'", str14, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.exportProperty");
        java.lang.String str6 = closureCodingConvention0.getDelegateSuperclassName();
        boolean boolean8 = closureCodingConvention0.isSuperClassReference("goog.abstractMethod");
        java.lang.String str9 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean11 = closureCodingConvention0.isConstantKey("goog.exportProperty");
        boolean boolean14 = closureCodingConvention0.isExported("goog.global", false);
        com.google.javascript.rhino.jstype.FunctionType functionType15 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType16 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType17 = null;
        closureCodingConvention0.applySubclassRelationship(functionType15, functionType16, subclassType17);
        java.lang.String str19 = closureCodingConvention0.getExportSymbolFunction();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "goog.exportSymbol" + "'", str9, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "goog.exportSymbol" + "'", str19, "goog.exportSymbol");
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.Node node3 = null;
        boolean boolean4 = closureCodingConvention0.isOptionalParameter(node3);
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = closureCodingConvention0.isVarArgsParameter(node5);
        com.google.javascript.rhino.Node node7 = null;
        boolean boolean8 = closureCodingConvention0.isOptionalParameter(node7);
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType12 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType13 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType9, objectType10, objectType11, functionType12, functionType13);
        java.lang.String str15 = closureCodingConvention0.getExportSymbolFunction();
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship17 = closureCodingConvention0.getDelegateRelationship(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship19 = closureCodingConvention0.getDelegateRelationship(node18);
        java.lang.String str20 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType23 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType24 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType25 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType21, objectType22, objectType23, functionType24, functionType25);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "goog.exportSymbol" + "'", str15, "goog.exportSymbol");
        org.junit.Assert.assertNull(delegateRelationship17);
        org.junit.Assert.assertNull(delegateRelationship19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "goog.abstractMethod" + "'", str20, "goog.abstractMethod");
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.exportProperty");
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection6 = closureCodingConvention0.getAssertionFunctions();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship8 = closureCodingConvention0.getDelegateRelationship(node7);
        com.google.javascript.rhino.Node node9 = null;
        boolean boolean10 = closureCodingConvention0.isVarArgsParameter(node9);
        com.google.javascript.rhino.Node node11 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap12 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node11, strMap12);
        com.google.javascript.rhino.jstype.FunctionType functionType14 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType15 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType16 = null;
        closureCodingConvention0.applySubclassRelationship(functionType14, functionType15, subclassType16);
        boolean boolean19 = closureCodingConvention0.isSuperClassReference("hi!");
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.Bind bind21 = closureCodingConvention0.describeFunctionBind(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection6);
        org.junit.Assert.assertNull(delegateRelationship8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.exportProperty");
        boolean boolean7 = closureCodingConvention0.isValidEnumKey("goog.global");
        java.lang.String str8 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = null;
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast objectLiteralCast11 = closureCodingConvention0.getObjectLiteralCast(nodeTraversal9, node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "goog.abstractMethod" + "'", str8, "goog.abstractMethod");
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        java.lang.String str3 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.abstractMethod");
        boolean boolean7 = closureCodingConvention0.isPrivate("goog.abstractMethod");
        java.lang.String str8 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean11 = closureCodingConvention0.isExported("hi!", true);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = closureCodingConvention0.isVarArgsParameter(node12);
        java.lang.String str14 = closureCodingConvention0.getDelegateSuperclassName();
        java.lang.String str15 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean17 = closureCodingConvention0.isExported("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportSymbol" + "'", str3, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "goog.exportProperty" + "'", str8, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "goog.exportSymbol" + "'", str15, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        com.google.javascript.rhino.Node node3 = null;
        boolean boolean4 = closureCodingConvention0.isVarArgsParameter(node3);
        boolean boolean6 = closureCodingConvention0.isExported("goog.exportProperty");
        boolean boolean8 = closureCodingConvention0.isPrivate("goog.global");
        java.lang.String str9 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = closureCodingConvention0.isVarArgsParameter(node10);
        java.lang.String str12 = closureCodingConvention0.getExportSymbolFunction();
        java.lang.String str13 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean15 = closureCodingConvention0.isValidEnumKey("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "goog.exportProperty" + "'", str9, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "goog.exportSymbol" + "'", str12, "goog.exportSymbol");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "goog.exportSymbol" + "'", str13, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        java.lang.String str3 = closureCodingConvention0.getAbstractMethodName();
        boolean boolean5 = closureCodingConvention0.isConstantKey("goog.exportSymbol");
        boolean boolean7 = closureCodingConvention0.isConstant("goog.global");
        boolean boolean9 = closureCodingConvention0.isSuperClassReference("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.abstractMethod" + "'", str3, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        com.google.javascript.rhino.Node node3 = null;
        boolean boolean4 = closureCodingConvention0.isVarArgsParameter(node3);
        boolean boolean6 = closureCodingConvention0.isExported("goog.exportProperty");
        com.google.javascript.rhino.Node node7 = null;
        boolean boolean8 = closureCodingConvention0.isVarArgsParameter(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship10 = closureCodingConvention0.getDelegateRelationship(node9);
        boolean boolean12 = closureCodingConvention0.isConstant("");
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship14 = closureCodingConvention0.getDelegateRelationship(node13);
        java.lang.String str15 = closureCodingConvention0.getAbstractMethodName();
        boolean boolean18 = closureCodingConvention0.isExported("", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(delegateRelationship10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(delegateRelationship14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "goog.abstractMethod" + "'", str15, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.Node node4 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node4, strMap5);
        java.lang.String str7 = closureCodingConvention0.getExportSymbolFunction();
        java.lang.String str8 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.Node node9 = null;
        boolean boolean10 = closureCodingConvention0.isOptionalParameter(node9);
        com.google.javascript.rhino.Node node11 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap12 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node11, strMap12);
        boolean boolean15 = closureCodingConvention0.isPrivate("hi!");
        boolean boolean17 = closureCodingConvention0.isConstantKey("goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "goog.exportSymbol" + "'", str7, "goog.exportSymbol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "goog.global" + "'", str8, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.exportProperty");
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection6 = closureCodingConvention0.getAssertionFunctions();
        java.lang.String str7 = closureCodingConvention0.getDelegateSuperclassName();
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship9 = closureCodingConvention0.getClassesDefinedByCall(node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        boolean boolean5 = closureCodingConvention0.isConstantKey("goog.abstractMethod");
        boolean boolean7 = closureCodingConvention0.isSuperClassReference("goog.global");
        java.lang.String str8 = closureCodingConvention0.getDelegateSuperclassName();
        java.lang.String str9 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean11 = closureCodingConvention0.isSuperClassReference("goog.exportSymbol");
        boolean boolean13 = closureCodingConvention0.isPrivate("hi!");
        boolean boolean15 = closureCodingConvention0.isExported("");
        com.google.javascript.rhino.jstype.FunctionType functionType16 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType17 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType18 = null;
        closureCodingConvention0.applySubclassRelationship(functionType16, functionType17, subclassType18);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "goog.exportSymbol" + "'", str9, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        boolean boolean4 = closureCodingConvention0.isExported("goog.abstractMethod");
        boolean boolean7 = closureCodingConvention0.isExported("goog.abstractMethod", false);
        com.google.javascript.rhino.Node node8 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node8, strMap9);
        boolean boolean12 = closureCodingConvention0.isConstant("goog.global");
        com.google.javascript.rhino.Node node13 = null;
        boolean boolean14 = closureCodingConvention0.isVarArgsParameter(node13);
        boolean boolean16 = closureCodingConvention0.isPrivate("goog.global");
        com.google.javascript.rhino.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = closureCodingConvention0.isPropertyTestFunction(node17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        boolean boolean5 = closureCodingConvention0.isConstant("goog.global");
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship7 = closureCodingConvention0.getDelegateRelationship(node6);
        boolean boolean10 = closureCodingConvention0.isExported("hi!", false);
        java.lang.String str11 = closureCodingConvention0.getGlobalObject();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(delegateRelationship7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "goog.global" + "'", str11, "goog.global");
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        java.lang.String str3 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.abstractMethod");
        boolean boolean7 = closureCodingConvention0.isConstantKey("hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType8 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType9 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType10 = null;
        closureCodingConvention0.applySubclassRelationship(functionType8, functionType9, subclassType10);
        java.lang.String str12 = closureCodingConvention0.getDelegateSuperclassName();
        boolean boolean14 = closureCodingConvention0.isPrivate("goog.exportProperty");
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection15 = closureCodingConvention0.getAssertionFunctions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportSymbol" + "'", str3, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection15);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        boolean boolean5 = closureCodingConvention0.isPrivate("");
        com.google.javascript.rhino.jstype.FunctionType functionType6 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType7 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType8 = null;
        closureCodingConvention0.applySubclassRelationship(functionType6, functionType7, subclassType8);
        java.lang.String str10 = closureCodingConvention0.getAbstractMethodName();
        boolean boolean12 = closureCodingConvention0.isConstant("goog.global");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "goog.abstractMethod" + "'", str10, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        com.google.javascript.rhino.Node node3 = null;
        boolean boolean4 = closureCodingConvention0.isVarArgsParameter(node3);
        boolean boolean6 = closureCodingConvention0.isExported("goog.exportProperty");
        java.lang.String str7 = closureCodingConvention0.getGlobalObject();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "goog.global" + "'", str7, "goog.global");
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean5 = closureCodingConvention0.isConstant("");
        boolean boolean8 = closureCodingConvention0.isExported("hi!", false);
        com.google.javascript.rhino.Node node9 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node9, strMap10);
        java.lang.String str12 = closureCodingConvention0.getExportSymbolFunction();
        com.google.javascript.rhino.Node node13 = null;
        boolean boolean14 = closureCodingConvention0.isOptionalParameter(node13);
        boolean boolean16 = closureCodingConvention0.isExported("");
        java.lang.String str17 = closureCodingConvention0.getDelegateSuperclassName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "goog.exportSymbol" + "'", str12, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        com.google.javascript.rhino.Node node3 = null;
        boolean boolean4 = closureCodingConvention0.isVarArgsParameter(node3);
        com.google.javascript.rhino.jstype.FunctionType functionType5 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType6 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType7 = null;
        closureCodingConvention0.applySubclassRelationship(functionType5, functionType6, subclassType7);
        boolean boolean11 = closureCodingConvention0.isExported("goog.exportSymbol", true);
        boolean boolean13 = closureCodingConvention0.isExported("goog.abstractMethod");
        java.lang.String str14 = closureCodingConvention0.getDelegateSuperclassName();
        boolean boolean16 = closureCodingConvention0.isConstantKey("goog.exportSymbol");
        boolean boolean18 = closureCodingConvention0.isConstantKey("goog.exportProperty");
        com.google.javascript.rhino.Node node19 = null;
        boolean boolean20 = closureCodingConvention0.isOptionalParameter(node19);
        com.google.javascript.rhino.Node node21 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = closureCodingConvention0.isPropertyTestFunction(node21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        com.google.javascript.rhino.Node node3 = null;
        boolean boolean4 = closureCodingConvention0.isVarArgsParameter(node3);
        boolean boolean6 = closureCodingConvention0.isExported("goog.exportProperty");
        boolean boolean8 = closureCodingConvention0.isPrivate("goog.global");
        java.lang.String str9 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = closureCodingConvention0.isVarArgsParameter(node10);
        java.lang.String str12 = closureCodingConvention0.getDelegateSuperclassName();
        boolean boolean14 = closureCodingConvention0.isConstantKey("goog.exportSymbol");
        boolean boolean16 = closureCodingConvention0.isExported("goog.global");
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType18 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType20 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType21 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType17, objectType18, objectType19, functionType20, functionType21);
        boolean boolean25 = closureCodingConvention0.isExported("", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "goog.exportProperty" + "'", str9, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = closureCodingConvention0.isOptionalParameter(node4);
        boolean boolean7 = closureCodingConvention0.isConstantKey("hi!");
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = closureCodingConvention0.isPropertyTestFunction(node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        boolean boolean5 = closureCodingConvention0.isPrivate("");
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection6 = closureCodingConvention0.getAssertionFunctions();
        boolean boolean8 = closureCodingConvention0.isSuperClassReference("hi!");
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship10 = closureCodingConvention0.getDelegateRelationship(node9);
        java.lang.String str11 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship13 = closureCodingConvention0.getDelegateRelationship(node12);
        java.lang.String str14 = closureCodingConvention0.getExportSymbolFunction();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(delegateRelationship10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "goog.abstractMethod" + "'", str11, "goog.abstractMethod");
        org.junit.Assert.assertNull(delegateRelationship13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "goog.exportSymbol" + "'", str14, "goog.exportSymbol");
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getDelegateSuperclassName();
        boolean boolean3 = closureCodingConvention0.isConstant("hi!");
        java.lang.String str4 = closureCodingConvention0.getDelegateSuperclassName();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = null;
        com.google.javascript.jscomp.Scope scope6 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention7 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str8 = closureCodingConvention7.getDelegateSuperclassName();
        java.lang.String str9 = closureCodingConvention7.getExportSymbolFunction();
        boolean boolean11 = closureCodingConvention7.isPrivate("hi!");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = null;
        com.google.javascript.jscomp.Scope scope13 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray14 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList15 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList15, objectTypeArray14);
        java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
        closureCodingConvention7.defineDelegateProxyPrototypeProperties(jSTypeRegistry12, scope13, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList15, strMap17);
        java.util.Map<java.lang.String, java.lang.String> strMap19 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry5, scope6, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList15, strMap19);
        com.google.javascript.rhino.Node node21 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap22 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node21, strMap22);
        boolean boolean25 = closureCodingConvention0.isExported("goog.exportSymbol");
        boolean boolean27 = closureCodingConvention0.isConstant("hi!");
        boolean boolean29 = closureCodingConvention0.isSuperClassReference("goog.exportProperty");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "goog.exportSymbol" + "'", str9, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objectTypeArray14);
        org.junit.Assert.assertArrayEquals(objectTypeArray14, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.exportProperty");
        com.google.javascript.rhino.Node node6 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap7 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node6, strMap7);
        com.google.javascript.rhino.jstype.FunctionType functionType9 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType10 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType11 = null;
        closureCodingConvention0.applySubclassRelationship(functionType9, functionType10, subclassType11);
        java.lang.String str13 = closureCodingConvention0.getExportPropertyFunction();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection14 = closureCodingConvention0.getAssertionFunctions();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "goog.exportProperty" + "'", str13, "goog.exportProperty");
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection14);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.Node node3 = null;
        boolean boolean4 = closureCodingConvention0.isOptionalParameter(node3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType8 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType9 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType5, objectType6, objectType7, functionType8, functionType9);
        boolean boolean13 = closureCodingConvention0.isExported("hi!", true);
        java.lang.String str14 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.jstype.FunctionType functionType15 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType16 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType17 = null;
        closureCodingConvention0.applySubclassRelationship(functionType15, functionType16, subclassType17);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "goog.abstractMethod" + "'", str14, "goog.abstractMethod");
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        java.lang.String str4 = closureCodingConvention0.getAbstractMethodName();
        boolean boolean6 = closureCodingConvention0.isSuperClassReference("goog.abstractMethod");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = null;
        com.google.javascript.jscomp.Scope scope8 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention9 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean11 = closureCodingConvention9.isConstantKey("");
        java.lang.String str12 = closureCodingConvention9.getExportSymbolFunction();
        boolean boolean14 = closureCodingConvention9.isSuperClassReference("goog.exportProperty");
        boolean boolean16 = closureCodingConvention9.isSuperClassReference("goog.exportSymbol");
        com.google.javascript.rhino.Node node17 = null;
        boolean boolean18 = closureCodingConvention9.isOptionalParameter(node17);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry19 = null;
        com.google.javascript.jscomp.Scope scope20 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention21 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean23 = closureCodingConvention21.isConstantKey("");
        java.lang.String str24 = closureCodingConvention21.getExportSymbolFunction();
        boolean boolean26 = closureCodingConvention21.isPrivate("goog.abstractMethod");
        boolean boolean28 = closureCodingConvention21.isConstantKey("hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType29 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType30 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType31 = null;
        closureCodingConvention21.applySubclassRelationship(functionType29, functionType30, subclassType31);
        boolean boolean35 = closureCodingConvention21.isExported("goog.exportSymbol", true);
        java.lang.String str36 = closureCodingConvention21.getExportPropertyFunction();
        boolean boolean39 = closureCodingConvention21.isExported("goog.exportProperty", true);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = null;
        com.google.javascript.jscomp.Scope scope41 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention42 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str43 = closureCodingConvention42.getAbstractMethodName();
        java.lang.String str44 = closureCodingConvention42.getGlobalObject();
        java.lang.String str45 = closureCodingConvention42.getExportPropertyFunction();
        boolean boolean47 = closureCodingConvention42.isConstant("");
        boolean boolean50 = closureCodingConvention42.isExported("hi!", false);
        com.google.javascript.rhino.Node node51 = null;
        boolean boolean52 = closureCodingConvention42.isOptionalParameter(node51);
        boolean boolean54 = closureCodingConvention42.isConstant("goog.abstractMethod");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = null;
        com.google.javascript.jscomp.Scope scope56 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray57 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList58 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList58, objectTypeArray57);
        java.util.Map<java.lang.String, java.lang.String> strMap60 = null;
        closureCodingConvention42.defineDelegateProxyPrototypeProperties(jSTypeRegistry55, scope56, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList58, strMap60);
        java.util.Map<java.lang.String, java.lang.String> strMap62 = null;
        closureCodingConvention21.defineDelegateProxyPrototypeProperties(jSTypeRegistry40, scope41, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList58, strMap62);
        java.util.Map<java.lang.String, java.lang.String> strMap64 = null;
        closureCodingConvention9.defineDelegateProxyPrototypeProperties(jSTypeRegistry19, scope20, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList58, strMap64);
        java.util.Map<java.lang.String, java.lang.String> strMap66 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry7, scope8, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList58, strMap66);
        com.google.javascript.rhino.Node node68 = null;
        com.google.javascript.rhino.Node node69 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str70 = closureCodingConvention0.extractClassNameIfProvide(node68, node69);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "goog.abstractMethod" + "'", str4, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "goog.exportSymbol" + "'", str12, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "goog.exportSymbol" + "'", str24, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "goog.exportProperty" + "'", str36, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "goog.abstractMethod" + "'", str43, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "goog.global" + "'", str44, "goog.global");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "goog.exportProperty" + "'", str45, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(objectTypeArray57);
        org.junit.Assert.assertArrayEquals(objectTypeArray57, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        boolean boolean4 = closureCodingConvention0.isExported("goog.global");
        java.lang.String str5 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship7 = closureCodingConvention0.getDelegateRelationship(node6);
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection8 = closureCodingConvention0.getAssertionFunctions();
        com.google.javascript.rhino.Node node9 = null;
        boolean boolean10 = closureCodingConvention0.isVarArgsParameter(node9);
        com.google.javascript.rhino.Node node11 = null;
        boolean boolean12 = closureCodingConvention0.isOptionalParameter(node11);
        com.google.javascript.rhino.Node node13 = null;
        boolean boolean14 = closureCodingConvention0.isOptionalParameter(node13);
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = closureCodingConvention0.getSingletonGetterClassName(node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "goog.exportProperty" + "'", str5, "goog.exportProperty");
        org.junit.Assert.assertNull(delegateRelationship7);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        boolean boolean4 = closureCodingConvention0.isConstant("goog.exportProperty");
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = closureCodingConvention0.isOptionalParameter(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship8 = closureCodingConvention0.getDelegateRelationship(node7);
        boolean boolean10 = closureCodingConvention0.isConstantKey("");
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = closureCodingConvention0.getSingletonGetterClassName(node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(delegateRelationship8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean5 = closureCodingConvention0.isConstant("");
        boolean boolean8 = closureCodingConvention0.isExported("hi!", false);
        com.google.javascript.rhino.Node node9 = null;
        boolean boolean10 = closureCodingConvention0.isOptionalParameter(node9);
        boolean boolean13 = closureCodingConvention0.isExported("goog.global", true);
        com.google.javascript.rhino.jstype.FunctionType functionType14 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType15 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType16 = null;
        closureCodingConvention0.applySubclassRelationship(functionType14, functionType15, subclassType16);
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection18 = closureCodingConvention0.getAssertionFunctions();
        boolean boolean20 = closureCodingConvention0.isConstant("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean5 = closureCodingConvention0.isConstant("");
        boolean boolean8 = closureCodingConvention0.isExported("hi!", false);
        com.google.javascript.rhino.Node node9 = null;
        boolean boolean10 = closureCodingConvention0.isOptionalParameter(node9);
        boolean boolean12 = closureCodingConvention0.isConstant("goog.abstractMethod");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = null;
        com.google.javascript.jscomp.Scope scope14 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray15 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList16 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList16, objectTypeArray15);
        java.util.Map<java.lang.String, java.lang.String> strMap18 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry13, scope14, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList16, strMap18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = closureCodingConvention0.isVarArgsParameter(node20);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objectTypeArray15);
        org.junit.Assert.assertArrayEquals(objectTypeArray15, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean5 = closureCodingConvention0.isConstant("");
        java.lang.String str6 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean8 = closureCodingConvention0.isValidEnumKey("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "goog.exportSymbol" + "'", str6, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        boolean boolean4 = closureCodingConvention0.isExported("goog.global");
        java.lang.String str5 = closureCodingConvention0.getDelegateSuperclassName();
        boolean boolean7 = closureCodingConvention0.isConstant("goog.abstractMethod");
        java.lang.Class<?> wildcardClass8 = closureCodingConvention0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection2 = closureCodingConvention0.getAssertionFunctions();
        java.lang.String str3 = closureCodingConvention0.getExportSymbolFunction();
        java.lang.String str4 = closureCodingConvention0.getDelegateSuperclassName();
        boolean boolean6 = closureCodingConvention0.isSuperClassReference("goog.exportSymbol");
        com.google.javascript.rhino.Node node7 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node7, strMap8);
        java.lang.String str10 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = closureCodingConvention0.extractClassNameIfProvide(node11, node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportSymbol" + "'", str3, "goog.exportSymbol");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "goog.global" + "'", str10, "goog.global");
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.exportProperty");
        java.lang.String str6 = closureCodingConvention0.getDelegateSuperclassName();
        boolean boolean8 = closureCodingConvention0.isSuperClassReference("goog.abstractMethod");
        java.lang.String str9 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean11 = closureCodingConvention0.isConstantKey("goog.exportProperty");
        java.lang.String str12 = closureCodingConvention0.getGlobalObject();
        java.lang.String str13 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.jstype.FunctionType functionType14 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType15 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType16 = null;
        closureCodingConvention0.applySubclassRelationship(functionType14, functionType15, subclassType16);
        java.lang.String str18 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.Node node19 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.Bind bind20 = closureCodingConvention0.describeFunctionBind(node19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "goog.exportSymbol" + "'", str9, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "goog.global" + "'", str12, "goog.global");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "goog.global" + "'", str13, "goog.global");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "goog.abstractMethod" + "'", str18, "goog.abstractMethod");
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        boolean boolean5 = closureCodingConvention0.isValidEnumKey("hi!");
        boolean boolean7 = closureCodingConvention0.isExported("");
        boolean boolean9 = closureCodingConvention0.isConstantKey("goog.abstractMethod");
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = closureCodingConvention0.extractClassNameIfProvide(node10, node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        com.google.javascript.rhino.Node node3 = null;
        boolean boolean4 = closureCodingConvention0.isVarArgsParameter(node3);
        boolean boolean6 = closureCodingConvention0.isExported("goog.exportProperty");
        com.google.javascript.rhino.Node node7 = null;
        boolean boolean8 = closureCodingConvention0.isVarArgsParameter(node7);
        java.lang.String str9 = closureCodingConvention0.getExportSymbolFunction();
        java.lang.String str10 = closureCodingConvention0.getExportSymbolFunction();
        java.lang.String str11 = closureCodingConvention0.getDelegateSuperclassName();
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = closureCodingConvention0.getSingletonGetterClassName(node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "goog.exportSymbol" + "'", str9, "goog.exportSymbol");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "goog.exportSymbol" + "'", str10, "goog.exportSymbol");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        java.lang.String str3 = closureCodingConvention0.getDelegateSuperclassName();
        java.lang.String str4 = closureCodingConvention0.getAbstractMethodName();
        boolean boolean6 = closureCodingConvention0.isSuperClassReference("goog.exportProperty");
        boolean boolean8 = closureCodingConvention0.isPrivate("hi!");
        boolean boolean10 = closureCodingConvention0.isPrivate("goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "goog.abstractMethod" + "'", str4, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        boolean boolean4 = closureCodingConvention0.isExported("goog.global");
        java.lang.String str5 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = closureCodingConvention0.isVarArgsParameter(node6);
        boolean boolean9 = closureCodingConvention0.isExported("goog.exportSymbol");
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = closureCodingConvention0.isOptionalParameter(node10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "goog.exportProperty" + "'", str5, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        com.google.javascript.rhino.Node node3 = null;
        boolean boolean4 = closureCodingConvention0.isVarArgsParameter(node3);
        boolean boolean6 = closureCodingConvention0.isExported("goog.exportProperty");
        com.google.javascript.rhino.Node node7 = null;
        boolean boolean8 = closureCodingConvention0.isVarArgsParameter(node7);
        com.google.javascript.rhino.Node node9 = null;
        boolean boolean10 = closureCodingConvention0.isVarArgsParameter(node9);
        java.lang.String str11 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = null;
        com.google.javascript.jscomp.Scope scope13 = null;
        java.util.List<com.google.javascript.rhino.jstype.ObjectType> objectTypeList14 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap15 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry12, scope13, objectTypeList14, strMap15);
        boolean boolean18 = closureCodingConvention0.isExported("");
        java.lang.String str19 = closureCodingConvention0.getGlobalObject();
        java.lang.String str20 = closureCodingConvention0.getExportSymbolFunction();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "goog.global" + "'", str11, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "goog.global" + "'", str19, "goog.global");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "goog.exportSymbol" + "'", str20, "goog.exportSymbol");
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        java.lang.String str3 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.abstractMethod");
        boolean boolean7 = closureCodingConvention0.isConstantKey("hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType8 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType9 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType10 = null;
        closureCodingConvention0.applySubclassRelationship(functionType8, functionType9, subclassType10);
        java.lang.String str12 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship14 = closureCodingConvention0.getDelegateRelationship(node13);
        java.lang.String str15 = closureCodingConvention0.getAbstractMethodName();
        boolean boolean18 = closureCodingConvention0.isExported("goog.exportProperty", false);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal19 = null;
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast objectLiteralCast21 = closureCodingConvention0.getObjectLiteralCast(nodeTraversal19, node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportSymbol" + "'", str3, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "goog.abstractMethod" + "'", str12, "goog.abstractMethod");
        org.junit.Assert.assertNull(delegateRelationship14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "goog.abstractMethod" + "'", str15, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        java.lang.String str3 = closureCodingConvention0.getAbstractMethodName();
        boolean boolean5 = closureCodingConvention0.isConstantKey("goog.exportSymbol");
        com.google.javascript.rhino.Node node6 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap7 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node6, strMap7);
        java.lang.String str9 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.jstype.FunctionType functionType10 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType11 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            closureCodingConvention0.applySingletonGetter(functionType10, functionType11, objectType12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.abstractMethod" + "'", str3, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "goog.exportProperty" + "'", str9, "goog.exportProperty");
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        java.lang.String str3 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.abstractMethod");
        boolean boolean7 = closureCodingConvention0.isConstantKey("hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType8 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType9 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType10 = null;
        closureCodingConvention0.applySubclassRelationship(functionType8, functionType9, subclassType10);
        boolean boolean14 = closureCodingConvention0.isExported("goog.exportSymbol", true);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = null;
        com.google.javascript.jscomp.Scope scope16 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention17 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str18 = closureCodingConvention17.getAbstractMethodName();
        java.lang.String str19 = closureCodingConvention17.getGlobalObject();
        java.lang.String str20 = closureCodingConvention17.getExportPropertyFunction();
        boolean boolean22 = closureCodingConvention17.isConstant("");
        boolean boolean25 = closureCodingConvention17.isExported("hi!", false);
        com.google.javascript.rhino.Node node26 = null;
        boolean boolean27 = closureCodingConvention17.isOptionalParameter(node26);
        boolean boolean29 = closureCodingConvention17.isConstant("goog.abstractMethod");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = null;
        com.google.javascript.jscomp.Scope scope31 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray32 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList33 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList33, objectTypeArray32);
        java.util.Map<java.lang.String, java.lang.String> strMap35 = null;
        closureCodingConvention17.defineDelegateProxyPrototypeProperties(jSTypeRegistry30, scope31, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList33, strMap35);
        java.util.Map<java.lang.String, java.lang.String> strMap37 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry15, scope16, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList33, strMap37);
        boolean boolean40 = closureCodingConvention0.isSuperClassReference("hi!");
        com.google.javascript.rhino.Node node41 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean42 = closureCodingConvention0.isPropertyTestFunction(node41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportSymbol" + "'", str3, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "goog.abstractMethod" + "'", str18, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "goog.global" + "'", str19, "goog.global");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "goog.exportProperty" + "'", str20, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objectTypeArray32);
        org.junit.Assert.assertArrayEquals(objectTypeArray32, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        java.lang.String str4 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = closureCodingConvention0.isVarArgsParameter(node5);
        java.lang.String str7 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.Bind bind9 = closureCodingConvention0.describeFunctionBind(node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "goog.abstractMethod" + "'", str4, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "goog.abstractMethod" + "'", str7, "goog.abstractMethod");
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        java.lang.String str4 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = closureCodingConvention0.isVarArgsParameter(node5);
        java.lang.String str7 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str8 = closureCodingConvention0.getAbstractMethodName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "goog.abstractMethod" + "'", str4, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "goog.abstractMethod" + "'", str7, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "goog.abstractMethod" + "'", str8, "goog.abstractMethod");
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        boolean boolean4 = closureCodingConvention0.isExported("goog.abstractMethod");
        boolean boolean7 = closureCodingConvention0.isExported("goog.abstractMethod", false);
        boolean boolean9 = closureCodingConvention0.isConstantKey("");
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = closureCodingConvention0.isVarArgsParameter(node10);
        java.lang.String str12 = closureCodingConvention0.getExportSymbolFunction();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = null;
        com.google.javascript.jscomp.Scope scope14 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention15 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str16 = closureCodingConvention15.getAbstractMethodName();
        java.lang.String str17 = closureCodingConvention15.getGlobalObject();
        java.lang.String str18 = closureCodingConvention15.getGlobalObject();
        boolean boolean20 = closureCodingConvention15.isPrivate("");
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection21 = closureCodingConvention15.getAssertionFunctions();
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType23 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType25 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType26 = null;
        closureCodingConvention15.applyDelegateRelationship(objectType22, objectType23, objectType24, functionType25, functionType26);
        java.lang.String str28 = closureCodingConvention15.getAbstractMethodName();
        boolean boolean30 = closureCodingConvention15.isValidEnumKey("hi!");
        java.lang.String str31 = closureCodingConvention15.getExportSymbolFunction();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry32 = null;
        com.google.javascript.jscomp.Scope scope33 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention34 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str35 = closureCodingConvention34.getAbstractMethodName();
        java.lang.String str36 = closureCodingConvention34.getGlobalObject();
        java.lang.String str37 = closureCodingConvention34.getGlobalObject();
        boolean boolean39 = closureCodingConvention34.isValidEnumKey("hi!");
        com.google.javascript.rhino.Node node40 = null;
        boolean boolean41 = closureCodingConvention34.isVarArgsParameter(node40);
        java.lang.String str42 = closureCodingConvention34.getAbstractMethodName();
        com.google.javascript.rhino.jstype.ObjectType objectType43 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType44 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType45 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType46 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType47 = null;
        closureCodingConvention34.applyDelegateRelationship(objectType43, objectType44, objectType45, functionType46, functionType47);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry49 = null;
        com.google.javascript.jscomp.Scope scope50 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention51 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str52 = closureCodingConvention51.getAbstractMethodName();
        java.lang.String str53 = closureCodingConvention51.getGlobalObject();
        java.lang.String str54 = closureCodingConvention51.getGlobalObject();
        boolean boolean56 = closureCodingConvention51.isValidEnumKey("hi!");
        boolean boolean58 = closureCodingConvention51.isPrivate("");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry59 = null;
        com.google.javascript.jscomp.Scope scope60 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray61 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList62 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList62, objectTypeArray61);
        java.util.Map<java.lang.String, java.lang.String> strMap64 = null;
        closureCodingConvention51.defineDelegateProxyPrototypeProperties(jSTypeRegistry59, scope60, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList62, strMap64);
        java.util.Map<java.lang.String, java.lang.String> strMap66 = null;
        closureCodingConvention34.defineDelegateProxyPrototypeProperties(jSTypeRegistry49, scope50, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList62, strMap66);
        java.util.Map<java.lang.String, java.lang.String> strMap68 = null;
        closureCodingConvention15.defineDelegateProxyPrototypeProperties(jSTypeRegistry32, scope33, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList62, strMap68);
        java.util.Map<java.lang.String, java.lang.String> strMap70 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry13, scope14, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList62, strMap70);
        java.lang.String str72 = closureCodingConvention0.getDelegateSuperclassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "goog.exportSymbol" + "'", str12, "goog.exportSymbol");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "goog.abstractMethod" + "'", str16, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "goog.global" + "'", str17, "goog.global");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "goog.global" + "'", str18, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection21);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "goog.abstractMethod" + "'", str28, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "goog.exportSymbol" + "'", str31, "goog.exportSymbol");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "goog.abstractMethod" + "'", str35, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "goog.global" + "'", str36, "goog.global");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "goog.global" + "'", str37, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "goog.abstractMethod" + "'", str42, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "goog.abstractMethod" + "'", str52, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "goog.global" + "'", str53, "goog.global");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "goog.global" + "'", str54, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(objectTypeArray61);
        org.junit.Assert.assertArrayEquals(objectTypeArray61, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(str72);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        java.lang.String str3 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.abstractMethod");
        boolean boolean7 = closureCodingConvention0.isConstantKey("hi!");
        java.lang.String str8 = closureCodingConvention0.getGlobalObject();
        boolean boolean10 = closureCodingConvention0.isConstantKey("hi!");
        com.google.javascript.rhino.Node node11 = null;
        boolean boolean12 = closureCodingConvention0.isOptionalParameter(node11);
        com.google.javascript.rhino.Node node13 = null;
        boolean boolean14 = closureCodingConvention0.isVarArgsParameter(node13);
        java.lang.String str15 = closureCodingConvention0.getGlobalObject();
        java.lang.String str16 = closureCodingConvention0.getDelegateSuperclassName();
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType18 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType20 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType21 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType17, objectType18, objectType19, functionType20, functionType21);
        com.google.javascript.rhino.Node node23 = null;
        boolean boolean24 = closureCodingConvention0.isOptionalParameter(node23);
        boolean boolean26 = closureCodingConvention0.isPrivate("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportSymbol" + "'", str3, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "goog.global" + "'", str8, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "goog.global" + "'", str15, "goog.global");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        java.lang.String str3 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.abstractMethod");
        boolean boolean7 = closureCodingConvention0.isConstantKey("hi!");
        java.lang.String str8 = closureCodingConvention0.getGlobalObject();
        boolean boolean10 = closureCodingConvention0.isConstantKey("hi!");
        java.lang.String str11 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = closureCodingConvention0.isVarArgsParameter(node12);
        boolean boolean15 = closureCodingConvention0.isExported("");
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = closureCodingConvention0.isVarArgsParameter(node16);
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection18 = closureCodingConvention0.getAssertionFunctions();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection19 = closureCodingConvention0.getAssertionFunctions();
        java.lang.Class<?> wildcardClass20 = assertionFunctionSpecCollection19.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportSymbol" + "'", str3, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "goog.global" + "'", str8, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "goog.abstractMethod" + "'", str11, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection18);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.Node node3 = null;
        boolean boolean4 = closureCodingConvention0.isOptionalParameter(node3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType8 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType9 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType5, objectType6, objectType7, functionType8, functionType9);
        boolean boolean13 = closureCodingConvention0.isExported("goog.exportSymbol", false);
        boolean boolean15 = closureCodingConvention0.isPrivate("goog.abstractMethod");
        boolean boolean17 = closureCodingConvention0.isPrivate("goog.global");
        boolean boolean19 = closureCodingConvention0.isConstant("");
        com.google.javascript.rhino.jstype.ObjectType objectType20 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType23 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType24 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType20, objectType21, objectType22, functionType23, functionType24);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        java.lang.String str3 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.abstractMethod");
        boolean boolean7 = closureCodingConvention0.isConstantKey("hi!");
        java.lang.String str8 = closureCodingConvention0.getExportSymbolFunction();
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType12 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType13 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType9, objectType10, objectType11, functionType12, functionType13);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = null;
        com.google.javascript.jscomp.Scope scope16 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention17 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str18 = closureCodingConvention17.getAbstractMethodName();
        java.lang.String str19 = closureCodingConvention17.getGlobalObject();
        java.lang.String str20 = closureCodingConvention17.getGlobalObject();
        boolean boolean22 = closureCodingConvention17.isConstantKey("goog.abstractMethod");
        boolean boolean24 = closureCodingConvention17.isSuperClassReference("goog.global");
        java.lang.String str25 = closureCodingConvention17.getDelegateSuperclassName();
        java.lang.String str26 = closureCodingConvention17.getExportSymbolFunction();
        boolean boolean28 = closureCodingConvention17.isSuperClassReference("goog.exportSymbol");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry29 = null;
        com.google.javascript.jscomp.Scope scope30 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention31 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str32 = closureCodingConvention31.getAbstractMethodName();
        java.lang.String str33 = closureCodingConvention31.getGlobalObject();
        java.lang.String str34 = closureCodingConvention31.getGlobalObject();
        boolean boolean36 = closureCodingConvention31.isValidEnumKey("hi!");
        boolean boolean38 = closureCodingConvention31.isPrivate("");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = null;
        com.google.javascript.jscomp.Scope scope40 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray41 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList42 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList42, objectTypeArray41);
        java.util.Map<java.lang.String, java.lang.String> strMap44 = null;
        closureCodingConvention31.defineDelegateProxyPrototypeProperties(jSTypeRegistry39, scope40, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList42, strMap44);
        java.util.Map<java.lang.String, java.lang.String> strMap46 = null;
        closureCodingConvention17.defineDelegateProxyPrototypeProperties(jSTypeRegistry29, scope30, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList42, strMap46);
        java.util.Map<java.lang.String, java.lang.String> strMap48 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry15, scope16, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList42, strMap48);
        boolean boolean51 = closureCodingConvention0.isExported("goog.global");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportSymbol" + "'", str3, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "goog.exportSymbol" + "'", str8, "goog.exportSymbol");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "goog.abstractMethod" + "'", str18, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "goog.global" + "'", str19, "goog.global");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "goog.global" + "'", str20, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "goog.exportSymbol" + "'", str26, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "goog.abstractMethod" + "'", str32, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "goog.global" + "'", str33, "goog.global");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "goog.global" + "'", str34, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objectTypeArray41);
        org.junit.Assert.assertArrayEquals(objectTypeArray41, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        java.lang.String str4 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean6 = closureCodingConvention0.isConstantKey("");
        com.google.javascript.rhino.Node node7 = null;
        boolean boolean8 = closureCodingConvention0.isOptionalParameter(node7);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "goog.exportSymbol" + "'", str4, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.Node node3 = null;
        boolean boolean4 = closureCodingConvention0.isOptionalParameter(node3);
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType8 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType9 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType5, objectType6, objectType7, functionType8, functionType9);
        boolean boolean13 = closureCodingConvention0.isExported("hi!", true);
        java.lang.String str14 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str15 = closureCodingConvention0.getExportPropertyFunction();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "goog.abstractMethod" + "'", str14, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "goog.exportProperty" + "'", str15, "goog.exportProperty");
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        java.lang.String str4 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = closureCodingConvention0.isVarArgsParameter(node5);
        java.lang.String str7 = closureCodingConvention0.getAbstractMethodName();
        boolean boolean9 = closureCodingConvention0.isSuperClassReference("goog.global");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "goog.abstractMethod" + "'", str4, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "goog.abstractMethod" + "'", str7, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.exportProperty");
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection6 = closureCodingConvention0.getAssertionFunctions();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship8 = closureCodingConvention0.getDelegateRelationship(node7);
        com.google.javascript.rhino.Node node9 = null;
        boolean boolean10 = closureCodingConvention0.isVarArgsParameter(node9);
        com.google.javascript.rhino.Node node11 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap12 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node11, strMap12);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry14 = null;
        com.google.javascript.jscomp.Scope scope15 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention16 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str17 = closureCodingConvention16.getAbstractMethodName();
        java.lang.String str18 = closureCodingConvention16.getGlobalObject();
        java.lang.String str19 = closureCodingConvention16.getExportPropertyFunction();
        com.google.javascript.rhino.Node node20 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap21 = null;
        closureCodingConvention16.checkForCallingConventionDefiningCalls(node20, strMap21);
        java.lang.String str23 = closureCodingConvention16.getExportSymbolFunction();
        java.lang.String str24 = closureCodingConvention16.getGlobalObject();
        com.google.javascript.rhino.Node node25 = null;
        boolean boolean26 = closureCodingConvention16.isOptionalParameter(node25);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = null;
        com.google.javascript.jscomp.Scope scope28 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention29 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str30 = closureCodingConvention29.getAbstractMethodName();
        java.lang.String str31 = closureCodingConvention29.getGlobalObject();
        java.lang.String str32 = closureCodingConvention29.getExportPropertyFunction();
        boolean boolean34 = closureCodingConvention29.isConstant("");
        boolean boolean37 = closureCodingConvention29.isExported("hi!", false);
        com.google.javascript.rhino.Node node38 = null;
        boolean boolean39 = closureCodingConvention29.isOptionalParameter(node38);
        boolean boolean42 = closureCodingConvention29.isExported("goog.global", true);
        java.lang.String str43 = closureCodingConvention29.getExportSymbolFunction();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = null;
        com.google.javascript.jscomp.Scope scope45 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention46 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean48 = closureCodingConvention46.isConstantKey("");
        java.lang.String str49 = closureCodingConvention46.getExportSymbolFunction();
        boolean boolean51 = closureCodingConvention46.isPrivate("goog.abstractMethod");
        boolean boolean53 = closureCodingConvention46.isConstantKey("hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType54 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType55 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType56 = null;
        closureCodingConvention46.applySubclassRelationship(functionType54, functionType55, subclassType56);
        java.lang.String str58 = closureCodingConvention46.getDelegateSuperclassName();
        boolean boolean60 = closureCodingConvention46.isConstant("");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry61 = null;
        com.google.javascript.jscomp.Scope scope62 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray63 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList64 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList64, objectTypeArray63);
        java.util.Map<java.lang.String, java.lang.String> strMap66 = null;
        closureCodingConvention46.defineDelegateProxyPrototypeProperties(jSTypeRegistry61, scope62, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList64, strMap66);
        java.util.Map<java.lang.String, java.lang.String> strMap68 = null;
        closureCodingConvention29.defineDelegateProxyPrototypeProperties(jSTypeRegistry44, scope45, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList64, strMap68);
        java.util.Map<java.lang.String, java.lang.String> strMap70 = null;
        closureCodingConvention16.defineDelegateProxyPrototypeProperties(jSTypeRegistry27, scope28, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList64, strMap70);
        java.util.Map<java.lang.String, java.lang.String> strMap72 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry14, scope15, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList64, strMap72);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry74 = null;
        com.google.javascript.jscomp.Scope scope75 = null;
        java.util.List<com.google.javascript.rhino.jstype.ObjectType> objectTypeList76 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap77 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry74, scope75, objectTypeList76, strMap77);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection6);
        org.junit.Assert.assertNull(delegateRelationship8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "goog.abstractMethod" + "'", str17, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "goog.global" + "'", str18, "goog.global");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "goog.exportProperty" + "'", str19, "goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "goog.exportSymbol" + "'", str23, "goog.exportSymbol");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "goog.global" + "'", str24, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "goog.abstractMethod" + "'", str30, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "goog.global" + "'", str31, "goog.global");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "goog.exportProperty" + "'", str32, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "goog.exportSymbol" + "'", str43, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "goog.exportSymbol" + "'", str49, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(objectTypeArray63);
        org.junit.Assert.assertArrayEquals(objectTypeArray63, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        java.lang.String str3 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.abstractMethod");
        boolean boolean7 = closureCodingConvention0.isConstantKey("hi!");
        java.lang.String str8 = closureCodingConvention0.getGlobalObject();
        boolean boolean10 = closureCodingConvention0.isConstantKey("hi!");
        java.lang.String str11 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str12 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str13 = closureCodingConvention0.getAbstractMethodName();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection14 = closureCodingConvention0.getAssertionFunctions();
        boolean boolean16 = closureCodingConvention0.isConstant("hi!");
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship18 = closureCodingConvention0.getDelegateRelationship(node17);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportSymbol" + "'", str3, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "goog.global" + "'", str8, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "goog.abstractMethod" + "'", str11, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "goog.abstractMethod" + "'", str12, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "goog.abstractMethod" + "'", str13, "goog.abstractMethod");
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(delegateRelationship18);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        boolean boolean5 = closureCodingConvention0.isValidEnumKey("hi!");
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = closureCodingConvention0.isVarArgsParameter(node6);
        java.lang.String str8 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str9 = closureCodingConvention0.getGlobalObject();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "goog.abstractMethod" + "'", str8, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "goog.global" + "'", str9, "goog.global");
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        java.lang.String str3 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.abstractMethod");
        boolean boolean7 = closureCodingConvention0.isConstantKey("hi!");
        java.lang.String str8 = closureCodingConvention0.getGlobalObject();
        boolean boolean10 = closureCodingConvention0.isConstantKey("hi!");
        java.lang.String str11 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship13 = closureCodingConvention0.getDelegateRelationship(node12);
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection14 = closureCodingConvention0.getAssertionFunctions();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = null;
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast objectLiteralCast17 = closureCodingConvention0.getObjectLiteralCast(nodeTraversal15, node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportSymbol" + "'", str3, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "goog.global" + "'", str8, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "goog.abstractMethod" + "'", str11, "goog.abstractMethod");
        org.junit.Assert.assertNull(delegateRelationship13);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection14);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        boolean boolean4 = closureCodingConvention0.isExported("goog.global");
        java.lang.String str5 = closureCodingConvention0.getGlobalObject();
        boolean boolean7 = closureCodingConvention0.isConstant("");
        java.lang.String str8 = closureCodingConvention0.getDelegateSuperclassName();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection9 = closureCodingConvention0.getAssertionFunctions();
        java.lang.String str10 = closureCodingConvention0.getDelegateSuperclassName();
        boolean boolean12 = closureCodingConvention0.isConstantKey("goog.exportSymbol");
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = closureCodingConvention0.isPropertyTestFunction(node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "goog.global" + "'", str5, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        boolean boolean4 = closureCodingConvention0.isExported("goog.global");
        java.lang.String str5 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = closureCodingConvention0.isVarArgsParameter(node6);
        boolean boolean9 = closureCodingConvention0.isExported("goog.exportSymbol");
        boolean boolean11 = closureCodingConvention0.isConstantKey("goog.abstractMethod");
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection12 = closureCodingConvention0.getAssertionFunctions();
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship14 = closureCodingConvention0.getClassesDefinedByCall(node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "goog.exportProperty" + "'", str5, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection12);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        boolean boolean4 = closureCodingConvention0.isExported("goog.abstractMethod");
        boolean boolean7 = closureCodingConvention0.isExported("goog.abstractMethod", false);
        boolean boolean9 = closureCodingConvention0.isConstantKey("");
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = closureCodingConvention0.isVarArgsParameter(node10);
        boolean boolean13 = closureCodingConvention0.isValidEnumKey("hi!");
        boolean boolean15 = closureCodingConvention0.isSuperClassReference("hi!");
        boolean boolean17 = closureCodingConvention0.isValidEnumKey("hi!");
        java.lang.String str18 = closureCodingConvention0.getGlobalObject();
        java.lang.String str19 = closureCodingConvention0.getGlobalObject();
        java.lang.String str20 = closureCodingConvention0.getExportPropertyFunction();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "goog.global" + "'", str18, "goog.global");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "goog.global" + "'", str19, "goog.global");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "goog.exportProperty" + "'", str20, "goog.exportProperty");
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        boolean boolean4 = closureCodingConvention0.isExported("goog.global");
        java.lang.String str5 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = closureCodingConvention0.isVarArgsParameter(node6);
        boolean boolean9 = closureCodingConvention0.isExported("goog.exportSymbol");
        boolean boolean11 = closureCodingConvention0.isSuperClassReference("");
        java.lang.String str12 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean14 = closureCodingConvention0.isConstantKey("goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "goog.exportProperty" + "'", str5, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "goog.exportSymbol" + "'", str12, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection2 = closureCodingConvention0.getAssertionFunctions();
        java.lang.String str3 = closureCodingConvention0.getExportSymbolFunction();
        com.google.javascript.rhino.Node node4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.Bind bind5 = closureCodingConvention0.describeFunctionBind(node4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportSymbol" + "'", str3, "goog.exportSymbol");
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        java.lang.String str3 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.abstractMethod");
        boolean boolean7 = closureCodingConvention0.isConstantKey("hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType8 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType9 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType10 = null;
        closureCodingConvention0.applySubclassRelationship(functionType8, functionType9, subclassType10);
        boolean boolean14 = closureCodingConvention0.isExported("goog.exportSymbol", true);
        java.lang.String str15 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean18 = closureCodingConvention0.isExported("goog.exportProperty", true);
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection19 = closureCodingConvention0.getAssertionFunctions();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection20 = closureCodingConvention0.getAssertionFunctions();
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType23 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType24 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType25 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType21, objectType22, objectType23, functionType24, functionType25);
        com.google.javascript.rhino.Node node27 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = closureCodingConvention0.isPropertyTestFunction(node27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportSymbol" + "'", str3, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "goog.exportProperty" + "'", str15, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection19);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection20);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean5 = closureCodingConvention0.isConstant("");
        boolean boolean7 = closureCodingConvention0.isConstant("goog.exportSymbol");
        boolean boolean9 = closureCodingConvention0.isSuperClassReference("goog.global");
        boolean boolean11 = closureCodingConvention0.isValidEnumKey("hi!");
        boolean boolean13 = closureCodingConvention0.isExported("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        boolean boolean4 = closureCodingConvention0.isExported("goog.global");
        java.lang.String str5 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.jstype.FunctionType functionType6 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType7 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType8 = null;
        closureCodingConvention0.applySubclassRelationship(functionType6, functionType7, subclassType8);
        boolean boolean11 = closureCodingConvention0.isPrivate("goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "goog.global" + "'", str5, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        boolean boolean5 = closureCodingConvention0.isPrivate("");
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection6 = closureCodingConvention0.getAssertionFunctions();
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType10 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType11 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType7, objectType8, objectType9, functionType10, functionType11);
        java.lang.String str13 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = closureCodingConvention0.isOptionalParameter(node14);
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship17 = closureCodingConvention0.getClassesDefinedByCall(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "goog.abstractMethod" + "'", str13, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        boolean boolean4 = closureCodingConvention0.isExported("goog.global");
        java.lang.String str5 = closureCodingConvention0.getGlobalObject();
        boolean boolean7 = closureCodingConvention0.isConstant("");
        com.google.javascript.rhino.Node node8 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node8, strMap9);
        com.google.javascript.rhino.Node node11 = null;
        boolean boolean12 = closureCodingConvention0.isOptionalParameter(node11);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "goog.global" + "'", str5, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.Node node4 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node4, strMap5);
        java.lang.String str7 = closureCodingConvention0.getExportSymbolFunction();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection8 = closureCodingConvention0.getAssertionFunctions();
        java.lang.String str9 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = closureCodingConvention0.isVarArgsParameter(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = closureCodingConvention0.extractClassNameIfRequire(node12, node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "goog.exportSymbol" + "'", str7, "goog.exportSymbol");
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "goog.exportProperty" + "'", str9, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.exportProperty");
        com.google.javascript.rhino.Node node6 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap7 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node6, strMap7);
        com.google.javascript.rhino.jstype.FunctionType functionType9 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType10 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType11 = null;
        closureCodingConvention0.applySubclassRelationship(functionType9, functionType10, subclassType11);
        boolean boolean14 = closureCodingConvention0.isPrivate("goog.exportSymbol");
        com.google.javascript.rhino.Node node15 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap16 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node15, strMap16);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.exportProperty");
        boolean boolean7 = closureCodingConvention0.isValidEnumKey("goog.global");
        com.google.javascript.rhino.jstype.FunctionType functionType8 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType9 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType10 = null;
        closureCodingConvention0.applySubclassRelationship(functionType8, functionType9, subclassType10);
        com.google.javascript.rhino.Node node12 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap13 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node12, strMap13);
        java.lang.String str15 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.jstype.FunctionType functionType16 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType17 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType18 = null;
        closureCodingConvention0.applySubclassRelationship(functionType16, functionType17, subclassType18);
        boolean boolean21 = closureCodingConvention0.isPrivate("goog.exportProperty");
        boolean boolean23 = closureCodingConvention0.isConstantKey("goog.exportSymbol");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "goog.abstractMethod" + "'", str15, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        boolean boolean5 = closureCodingConvention0.isValidEnumKey("hi!");
        boolean boolean7 = closureCodingConvention0.isPrivate("");
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType11 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType12 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType8, objectType9, objectType10, functionType11, functionType12);
        com.google.javascript.rhino.jstype.FunctionType functionType14 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType15 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType16 = null;
        closureCodingConvention0.applySubclassRelationship(functionType14, functionType15, subclassType16);
        com.google.javascript.rhino.jstype.ObjectType objectType18 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType21 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType22 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType18, objectType19, objectType20, functionType21, functionType22);
        boolean boolean25 = closureCodingConvention0.isConstant("hi!");
        boolean boolean28 = closureCodingConvention0.isExported("hi!", true);
        com.google.javascript.rhino.Node node29 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap30 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node29, strMap30);
        com.google.javascript.rhino.Node node32 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.SubclassRelationship subclassRelationship33 = closureCodingConvention0.getClassesDefinedByCall(node32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        boolean boolean5 = closureCodingConvention0.isValidEnumKey("hi!");
        boolean boolean7 = closureCodingConvention0.isPrivate("");
        boolean boolean9 = closureCodingConvention0.isConstantKey("goog.global");
        boolean boolean11 = closureCodingConvention0.isPrivate("goog.global");
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodingConvention.Bind bind13 = closureCodingConvention0.describeFunctionBind(node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        java.lang.String str3 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.abstractMethod");
        boolean boolean7 = closureCodingConvention0.isConstantKey("hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType8 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType9 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType10 = null;
        closureCodingConvention0.applySubclassRelationship(functionType8, functionType9, subclassType10);
        boolean boolean14 = closureCodingConvention0.isExported("goog.exportSymbol", true);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry15 = null;
        com.google.javascript.jscomp.Scope scope16 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention17 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str18 = closureCodingConvention17.getAbstractMethodName();
        java.lang.String str19 = closureCodingConvention17.getGlobalObject();
        java.lang.String str20 = closureCodingConvention17.getExportPropertyFunction();
        boolean boolean22 = closureCodingConvention17.isConstant("");
        boolean boolean25 = closureCodingConvention17.isExported("hi!", false);
        com.google.javascript.rhino.Node node26 = null;
        boolean boolean27 = closureCodingConvention17.isOptionalParameter(node26);
        boolean boolean29 = closureCodingConvention17.isConstant("goog.abstractMethod");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = null;
        com.google.javascript.jscomp.Scope scope31 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray32 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList33 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList33, objectTypeArray32);
        java.util.Map<java.lang.String, java.lang.String> strMap35 = null;
        closureCodingConvention17.defineDelegateProxyPrototypeProperties(jSTypeRegistry30, scope31, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList33, strMap35);
        java.util.Map<java.lang.String, java.lang.String> strMap37 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry15, scope16, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList33, strMap37);
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection39 = closureCodingConvention0.getAssertionFunctions();
        java.lang.String str40 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship42 = closureCodingConvention0.getDelegateRelationship(node41);
        java.lang.String str43 = closureCodingConvention0.getDelegateSuperclassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportSymbol" + "'", str3, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "goog.abstractMethod" + "'", str18, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "goog.global" + "'", str19, "goog.global");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "goog.exportProperty" + "'", str20, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objectTypeArray32);
        org.junit.Assert.assertArrayEquals(objectTypeArray32, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "goog.abstractMethod" + "'", str40, "goog.abstractMethod");
        org.junit.Assert.assertNull(delegateRelationship42);
        org.junit.Assert.assertNull(str43);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        boolean boolean5 = closureCodingConvention0.isValidEnumKey("hi!");
        boolean boolean7 = closureCodingConvention0.isPrivate("");
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType11 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType12 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType8, objectType9, objectType10, functionType11, functionType12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = closureCodingConvention0.isVarArgsParameter(node14);
        com.google.javascript.rhino.jstype.FunctionType functionType16 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType17 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType18 = null;
        closureCodingConvention0.applySubclassRelationship(functionType16, functionType17, subclassType18);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.Node node3 = null;
        boolean boolean4 = closureCodingConvention0.isOptionalParameter(node3);
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = closureCodingConvention0.isVarArgsParameter(node5);
        com.google.javascript.rhino.Node node7 = null;
        boolean boolean8 = closureCodingConvention0.isOptionalParameter(node7);
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType12 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType13 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType9, objectType10, objectType11, functionType12, functionType13);
        java.lang.String str15 = closureCodingConvention0.getExportSymbolFunction();
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship17 = closureCodingConvention0.getDelegateRelationship(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship19 = closureCodingConvention0.getDelegateRelationship(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = closureCodingConvention0.isOptionalParameter(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = closureCodingConvention0.isOptionalParameter(node22);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "goog.exportSymbol" + "'", str15, "goog.exportSymbol");
        org.junit.Assert.assertNull(delegateRelationship17);
        org.junit.Assert.assertNull(delegateRelationship19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        java.lang.String str3 = closureCodingConvention0.getExportSymbolFunction();
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship5 = closureCodingConvention0.getDelegateRelationship(node4);
        com.google.javascript.rhino.jstype.FunctionType functionType6 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            closureCodingConvention0.applySingletonGetter(functionType6, functionType7, objectType8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportSymbol" + "'", str3, "goog.exportSymbol");
        org.junit.Assert.assertNull(delegateRelationship5);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        boolean boolean4 = closureCodingConvention0.isExported("goog.global");
        boolean boolean6 = closureCodingConvention0.isConstant("hi!");
        boolean boolean8 = closureCodingConvention0.isPrivate("goog.exportProperty");
        boolean boolean10 = closureCodingConvention0.isConstant("goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        java.lang.String str3 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.abstractMethod");
        boolean boolean7 = closureCodingConvention0.isConstantKey("hi!");
        java.lang.String str8 = closureCodingConvention0.getGlobalObject();
        boolean boolean10 = closureCodingConvention0.isConstantKey("hi!");
        java.lang.String str11 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = closureCodingConvention0.isVarArgsParameter(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship15 = closureCodingConvention0.getDelegateRelationship(node14);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = null;
        com.google.javascript.jscomp.Scope scope17 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention18 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str19 = closureCodingConvention18.getAbstractMethodName();
        java.lang.String str20 = closureCodingConvention18.getGlobalObject();
        java.lang.String str21 = closureCodingConvention18.getGlobalObject();
        boolean boolean23 = closureCodingConvention18.isValidEnumKey("hi!");
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = closureCodingConvention18.isVarArgsParameter(node24);
        com.google.javascript.rhino.Node node26 = null;
        boolean boolean27 = closureCodingConvention18.isVarArgsParameter(node26);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry28 = null;
        com.google.javascript.jscomp.Scope scope29 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention30 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str31 = closureCodingConvention30.getAbstractMethodName();
        java.lang.String str32 = closureCodingConvention30.getGlobalObject();
        java.lang.String str33 = closureCodingConvention30.getGlobalObject();
        boolean boolean35 = closureCodingConvention30.isValidEnumKey("hi!");
        com.google.javascript.rhino.Node node36 = null;
        boolean boolean37 = closureCodingConvention30.isVarArgsParameter(node36);
        java.lang.String str38 = closureCodingConvention30.getAbstractMethodName();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry39 = null;
        com.google.javascript.jscomp.Scope scope40 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention41 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str42 = closureCodingConvention41.getAbstractMethodName();
        java.lang.String str43 = closureCodingConvention41.getGlobalObject();
        java.lang.String str44 = closureCodingConvention41.getGlobalObject();
        boolean boolean46 = closureCodingConvention41.isValidEnumKey("hi!");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = null;
        com.google.javascript.jscomp.Scope scope48 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention49 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean51 = closureCodingConvention49.isConstantKey("");
        java.lang.String str52 = closureCodingConvention49.getExportSymbolFunction();
        boolean boolean54 = closureCodingConvention49.isPrivate("goog.abstractMethod");
        boolean boolean56 = closureCodingConvention49.isConstantKey("hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType57 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType58 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType59 = null;
        closureCodingConvention49.applySubclassRelationship(functionType57, functionType58, subclassType59);
        boolean boolean63 = closureCodingConvention49.isExported("goog.exportSymbol", true);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry64 = null;
        com.google.javascript.jscomp.Scope scope65 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention66 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str67 = closureCodingConvention66.getAbstractMethodName();
        java.lang.String str68 = closureCodingConvention66.getGlobalObject();
        java.lang.String str69 = closureCodingConvention66.getExportPropertyFunction();
        boolean boolean71 = closureCodingConvention66.isConstant("");
        boolean boolean74 = closureCodingConvention66.isExported("hi!", false);
        com.google.javascript.rhino.Node node75 = null;
        boolean boolean76 = closureCodingConvention66.isOptionalParameter(node75);
        boolean boolean78 = closureCodingConvention66.isConstant("goog.abstractMethod");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry79 = null;
        com.google.javascript.jscomp.Scope scope80 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray81 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList82 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList82, objectTypeArray81);
        java.util.Map<java.lang.String, java.lang.String> strMap84 = null;
        closureCodingConvention66.defineDelegateProxyPrototypeProperties(jSTypeRegistry79, scope80, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList82, strMap84);
        java.util.Map<java.lang.String, java.lang.String> strMap86 = null;
        closureCodingConvention49.defineDelegateProxyPrototypeProperties(jSTypeRegistry64, scope65, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList82, strMap86);
        java.util.Map<java.lang.String, java.lang.String> strMap88 = null;
        closureCodingConvention41.defineDelegateProxyPrototypeProperties(jSTypeRegistry47, scope48, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList82, strMap88);
        java.util.Map<java.lang.String, java.lang.String> strMap90 = null;
        closureCodingConvention30.defineDelegateProxyPrototypeProperties(jSTypeRegistry39, scope40, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList82, strMap90);
        java.util.Map<java.lang.String, java.lang.String> strMap92 = null;
        closureCodingConvention18.defineDelegateProxyPrototypeProperties(jSTypeRegistry28, scope29, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList82, strMap92);
        java.util.Map<java.lang.String, java.lang.String> strMap94 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry16, scope17, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList82, strMap94);
        boolean boolean97 = closureCodingConvention0.isValidEnumKey("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportSymbol" + "'", str3, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "goog.global" + "'", str8, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "goog.abstractMethod" + "'", str11, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(delegateRelationship15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "goog.abstractMethod" + "'", str19, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "goog.global" + "'", str20, "goog.global");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "goog.global" + "'", str21, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "goog.abstractMethod" + "'", str31, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "goog.global" + "'", str32, "goog.global");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "goog.global" + "'", str33, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "goog.abstractMethod" + "'", str38, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "goog.abstractMethod" + "'", str42, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "goog.global" + "'", str43, "goog.global");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "goog.global" + "'", str44, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "goog.exportSymbol" + "'", str52, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "goog.abstractMethod" + "'", str67, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "goog.global" + "'", str68, "goog.global");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "goog.exportProperty" + "'", str69, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(objectTypeArray81);
        org.junit.Assert.assertArrayEquals(objectTypeArray81, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        boolean boolean5 = closureCodingConvention0.isValidEnumKey("hi!");
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = closureCodingConvention0.isVarArgsParameter(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = closureCodingConvention0.isVarArgsParameter(node8);
        boolean boolean11 = closureCodingConvention0.isPrivate("");
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = closureCodingConvention0.isOptionalParameter(node12);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.Node node4 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node4, strMap5);
        java.lang.String str7 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean9 = closureCodingConvention0.isPrivate("hi!");
        java.lang.String str10 = closureCodingConvention0.getAbstractMethodName();
        boolean boolean12 = closureCodingConvention0.isPrivate("goog.abstractMethod");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = null;
        com.google.javascript.jscomp.Scope scope14 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention15 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean17 = closureCodingConvention15.isConstantKey("");
        java.lang.String str18 = closureCodingConvention15.getExportSymbolFunction();
        boolean boolean20 = closureCodingConvention15.isPrivate("goog.abstractMethod");
        boolean boolean22 = closureCodingConvention15.isConstantKey("hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType23 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType24 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType25 = null;
        closureCodingConvention15.applySubclassRelationship(functionType23, functionType24, subclassType25);
        java.lang.String str27 = closureCodingConvention15.getDelegateSuperclassName();
        boolean boolean29 = closureCodingConvention15.isConstant("");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = null;
        com.google.javascript.jscomp.Scope scope31 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray32 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList33 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList33, objectTypeArray32);
        java.util.Map<java.lang.String, java.lang.String> strMap35 = null;
        closureCodingConvention15.defineDelegateProxyPrototypeProperties(jSTypeRegistry30, scope31, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList33, strMap35);
        java.util.Map<java.lang.String, java.lang.String> strMap37 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry13, scope14, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList33, strMap37);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "goog.exportSymbol" + "'", str7, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "goog.abstractMethod" + "'", str10, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "goog.exportSymbol" + "'", str18, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objectTypeArray32);
        org.junit.Assert.assertArrayEquals(objectTypeArray32, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        boolean boolean5 = closureCodingConvention0.isPrivate("");
        com.google.javascript.rhino.jstype.FunctionType functionType6 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType7 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType8 = null;
        closureCodingConvention0.applySubclassRelationship(functionType6, functionType7, subclassType8);
        java.lang.String str10 = closureCodingConvention0.getGlobalObject();
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection11 = closureCodingConvention0.getAssertionFunctions();
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship13 = closureCodingConvention0.getDelegateRelationship(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = closureCodingConvention0.isOptionalParameter(node14);
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = closureCodingConvention0.getSingletonGetterClassName(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "goog.global" + "'", str10, "goog.global");
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection11);
        org.junit.Assert.assertNull(delegateRelationship13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean2 = closureCodingConvention0.isConstantKey("");
        java.lang.String str3 = closureCodingConvention0.getExportSymbolFunction();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.abstractMethod");
        boolean boolean7 = closureCodingConvention0.isConstantKey("hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType8 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType9 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType10 = null;
        closureCodingConvention0.applySubclassRelationship(functionType8, functionType9, subclassType10);
        boolean boolean14 = closureCodingConvention0.isExported("goog.exportSymbol", true);
        java.lang.String str15 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean18 = closureCodingConvention0.isExported("goog.exportProperty", true);
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType22 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType23 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType19, objectType20, objectType21, functionType22, functionType23);
        com.google.javascript.rhino.jstype.FunctionType functionType25 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType26 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType27 = null;
        closureCodingConvention0.applySubclassRelationship(functionType25, functionType26, subclassType27);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportSymbol" + "'", str3, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "goog.exportProperty" + "'", str15, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.Node node4 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node4, strMap5);
        java.lang.String str7 = closureCodingConvention0.getExportSymbolFunction();
        java.lang.String str8 = closureCodingConvention0.getGlobalObject();
        com.google.javascript.rhino.Node node9 = null;
        boolean boolean10 = closureCodingConvention0.isVarArgsParameter(node9);
        boolean boolean12 = closureCodingConvention0.isConstantKey("goog.exportSymbol");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "goog.exportSymbol" + "'", str7, "goog.exportSymbol");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "goog.global" + "'", str8, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        java.lang.String str4 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = closureCodingConvention0.isVarArgsParameter(node5);
        java.lang.String str7 = closureCodingConvention0.getAbstractMethodName();
        boolean boolean10 = closureCodingConvention0.isExported("goog.exportProperty", true);
        com.google.javascript.rhino.jstype.FunctionType functionType11 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType12 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType13 = null;
        closureCodingConvention0.applySubclassRelationship(functionType11, functionType12, subclassType13);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "goog.abstractMethod" + "'", str4, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "goog.abstractMethod" + "'", str7, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        boolean boolean4 = closureCodingConvention0.isExported("goog.global");
        java.lang.String str5 = closureCodingConvention0.getGlobalObject();
        boolean boolean7 = closureCodingConvention0.isConstant("");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = null;
        com.google.javascript.jscomp.Scope scope9 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention10 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str11 = closureCodingConvention10.getAbstractMethodName();
        java.lang.String str12 = closureCodingConvention10.getGlobalObject();
        java.lang.String str13 = closureCodingConvention10.getGlobalObject();
        boolean boolean15 = closureCodingConvention10.isValidEnumKey("hi!");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = null;
        com.google.javascript.jscomp.Scope scope17 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention18 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean20 = closureCodingConvention18.isConstantKey("");
        java.lang.String str21 = closureCodingConvention18.getExportSymbolFunction();
        boolean boolean23 = closureCodingConvention18.isPrivate("goog.abstractMethod");
        boolean boolean25 = closureCodingConvention18.isConstantKey("hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType26 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType27 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType28 = null;
        closureCodingConvention18.applySubclassRelationship(functionType26, functionType27, subclassType28);
        boolean boolean32 = closureCodingConvention18.isExported("goog.exportSymbol", true);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry33 = null;
        com.google.javascript.jscomp.Scope scope34 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention35 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str36 = closureCodingConvention35.getAbstractMethodName();
        java.lang.String str37 = closureCodingConvention35.getGlobalObject();
        java.lang.String str38 = closureCodingConvention35.getExportPropertyFunction();
        boolean boolean40 = closureCodingConvention35.isConstant("");
        boolean boolean43 = closureCodingConvention35.isExported("hi!", false);
        com.google.javascript.rhino.Node node44 = null;
        boolean boolean45 = closureCodingConvention35.isOptionalParameter(node44);
        boolean boolean47 = closureCodingConvention35.isConstant("goog.abstractMethod");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry48 = null;
        com.google.javascript.jscomp.Scope scope49 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray50 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList51 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList51, objectTypeArray50);
        java.util.Map<java.lang.String, java.lang.String> strMap53 = null;
        closureCodingConvention35.defineDelegateProxyPrototypeProperties(jSTypeRegistry48, scope49, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList51, strMap53);
        java.util.Map<java.lang.String, java.lang.String> strMap55 = null;
        closureCodingConvention18.defineDelegateProxyPrototypeProperties(jSTypeRegistry33, scope34, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList51, strMap55);
        java.util.Map<java.lang.String, java.lang.String> strMap57 = null;
        closureCodingConvention10.defineDelegateProxyPrototypeProperties(jSTypeRegistry16, scope17, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList51, strMap57);
        java.util.Map<java.lang.String, java.lang.String> strMap59 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry8, scope9, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList51, strMap59);
        boolean boolean62 = closureCodingConvention0.isSuperClassReference("hi!");
        java.lang.String str63 = closureCodingConvention0.getExportSymbolFunction();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "goog.global" + "'", str5, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "goog.abstractMethod" + "'", str11, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "goog.global" + "'", str12, "goog.global");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "goog.global" + "'", str13, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "goog.exportSymbol" + "'", str21, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "goog.abstractMethod" + "'", str36, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "goog.global" + "'", str37, "goog.global");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "goog.exportProperty" + "'", str38, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(objectTypeArray50);
        org.junit.Assert.assertArrayEquals(objectTypeArray50, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "goog.exportSymbol" + "'", str63, "goog.exportSymbol");
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        boolean boolean4 = closureCodingConvention0.isExported("goog.global");
        java.lang.String str5 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship7 = closureCodingConvention0.getDelegateRelationship(node6);
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection8 = closureCodingConvention0.getAssertionFunctions();
        boolean boolean10 = closureCodingConvention0.isConstant("goog.exportSymbol");
        java.lang.String str11 = closureCodingConvention0.getExportSymbolFunction();
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodingConvention.DelegateRelationship delegateRelationship13 = closureCodingConvention0.getDelegateRelationship(node12);
        java.lang.String str14 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.Node node15 = null;
        boolean boolean16 = closureCodingConvention0.isVarArgsParameter(node15);
        boolean boolean18 = closureCodingConvention0.isPrivate("");
        boolean boolean20 = closureCodingConvention0.isPrivate("goog.exportProperty");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "goog.exportProperty" + "'", str5, "goog.exportProperty");
        org.junit.Assert.assertNull(delegateRelationship7);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "goog.exportSymbol" + "'", str11, "goog.exportSymbol");
        org.junit.Assert.assertNull(delegateRelationship13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "goog.abstractMethod" + "'", str14, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.exportProperty");
        boolean boolean7 = closureCodingConvention0.isValidEnumKey("goog.global");
        com.google.javascript.rhino.jstype.FunctionType functionType8 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType9 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType10 = null;
        closureCodingConvention0.applySubclassRelationship(functionType8, functionType9, subclassType10);
        com.google.javascript.rhino.Node node12 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap13 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node12, strMap13);
        java.lang.String str15 = closureCodingConvention0.getAbstractMethodName();
        com.google.javascript.rhino.jstype.FunctionType functionType16 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType17 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType18 = null;
        closureCodingConvention0.applySubclassRelationship(functionType16, functionType17, subclassType18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = closureCodingConvention0.isOptionalParameter(node20);
        boolean boolean23 = closureCodingConvention0.isConstant("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "goog.abstractMethod" + "'", str15, "goog.abstractMethod");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        com.google.javascript.rhino.Node node4 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node4, strMap5);
        boolean boolean8 = closureCodingConvention0.isConstant("");
        com.google.javascript.rhino.jstype.FunctionType functionType9 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType10 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType11 = null;
        closureCodingConvention0.applySubclassRelationship(functionType9, functionType10, subclassType11);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry13 = null;
        com.google.javascript.jscomp.Scope scope14 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention15 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str16 = closureCodingConvention15.getAbstractMethodName();
        java.lang.String str17 = closureCodingConvention15.getGlobalObject();
        java.lang.String str18 = closureCodingConvention15.getExportPropertyFunction();
        boolean boolean20 = closureCodingConvention15.isConstant("");
        boolean boolean23 = closureCodingConvention15.isExported("hi!", false);
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = closureCodingConvention15.isOptionalParameter(node24);
        boolean boolean28 = closureCodingConvention15.isExported("goog.global", true);
        java.lang.String str29 = closureCodingConvention15.getExportSymbolFunction();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry30 = null;
        com.google.javascript.jscomp.Scope scope31 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention32 = new com.google.javascript.jscomp.ClosureCodingConvention();
        boolean boolean34 = closureCodingConvention32.isConstantKey("");
        java.lang.String str35 = closureCodingConvention32.getExportSymbolFunction();
        boolean boolean37 = closureCodingConvention32.isPrivate("goog.abstractMethod");
        boolean boolean39 = closureCodingConvention32.isConstantKey("hi!");
        com.google.javascript.rhino.jstype.FunctionType functionType40 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType41 = null;
        com.google.javascript.jscomp.CodingConvention.SubclassType subclassType42 = null;
        closureCodingConvention32.applySubclassRelationship(functionType40, functionType41, subclassType42);
        java.lang.String str44 = closureCodingConvention32.getDelegateSuperclassName();
        boolean boolean46 = closureCodingConvention32.isConstant("");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry47 = null;
        com.google.javascript.jscomp.Scope scope48 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray49 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList50 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList50, objectTypeArray49);
        java.util.Map<java.lang.String, java.lang.String> strMap52 = null;
        closureCodingConvention32.defineDelegateProxyPrototypeProperties(jSTypeRegistry47, scope48, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList50, strMap52);
        java.util.Map<java.lang.String, java.lang.String> strMap54 = null;
        closureCodingConvention15.defineDelegateProxyPrototypeProperties(jSTypeRegistry30, scope31, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList50, strMap54);
        java.util.Map<java.lang.String, java.lang.String> strMap56 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry13, scope14, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList50, strMap56);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "goog.abstractMethod" + "'", str16, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "goog.global" + "'", str17, "goog.global");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "goog.exportProperty" + "'", str18, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "goog.exportSymbol" + "'", str29, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "goog.exportSymbol" + "'", str35, "goog.exportSymbol");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(objectTypeArray49);
        org.junit.Assert.assertArrayEquals(objectTypeArray49, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        boolean boolean5 = closureCodingConvention0.isValidEnumKey("hi!");
        boolean boolean7 = closureCodingConvention0.isExported("");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = null;
        com.google.javascript.jscomp.Scope scope9 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention10 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str11 = closureCodingConvention10.getAbstractMethodName();
        java.lang.String str12 = closureCodingConvention10.getGlobalObject();
        java.lang.String str13 = closureCodingConvention10.getGlobalObject();
        boolean boolean15 = closureCodingConvention10.isValidEnumKey("hi!");
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType18 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType19 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType20 = null;
        closureCodingConvention10.applyDelegateRelationship(objectType16, objectType17, objectType18, functionType19, functionType20);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry22 = null;
        com.google.javascript.jscomp.Scope scope23 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention24 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str25 = closureCodingConvention24.getAbstractMethodName();
        java.lang.String str26 = closureCodingConvention24.getGlobalObject();
        com.google.javascript.rhino.Node node27 = null;
        boolean boolean28 = closureCodingConvention24.isOptionalParameter(node27);
        com.google.javascript.rhino.Node node29 = null;
        boolean boolean30 = closureCodingConvention24.isVarArgsParameter(node29);
        com.google.javascript.rhino.Node node31 = null;
        boolean boolean32 = closureCodingConvention24.isOptionalParameter(node31);
        com.google.javascript.rhino.jstype.ObjectType objectType33 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType36 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType37 = null;
        closureCodingConvention24.applyDelegateRelationship(objectType33, objectType34, objectType35, functionType36, functionType37);
        java.lang.String str39 = closureCodingConvention24.getExportSymbolFunction();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry40 = null;
        com.google.javascript.jscomp.Scope scope41 = null;
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention42 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str43 = closureCodingConvention42.getAbstractMethodName();
        java.lang.String str44 = closureCodingConvention42.getGlobalObject();
        java.lang.String str45 = closureCodingConvention42.getExportPropertyFunction();
        boolean boolean47 = closureCodingConvention42.isConstant("");
        boolean boolean50 = closureCodingConvention42.isExported("hi!", false);
        com.google.javascript.rhino.Node node51 = null;
        boolean boolean52 = closureCodingConvention42.isOptionalParameter(node51);
        boolean boolean54 = closureCodingConvention42.isConstant("goog.abstractMethod");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = null;
        com.google.javascript.jscomp.Scope scope56 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray57 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList58 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList58, objectTypeArray57);
        java.util.Map<java.lang.String, java.lang.String> strMap60 = null;
        closureCodingConvention42.defineDelegateProxyPrototypeProperties(jSTypeRegistry55, scope56, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList58, strMap60);
        java.util.Map<java.lang.String, java.lang.String> strMap62 = null;
        closureCodingConvention24.defineDelegateProxyPrototypeProperties(jSTypeRegistry40, scope41, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList58, strMap62);
        java.util.Map<java.lang.String, java.lang.String> strMap64 = null;
        closureCodingConvention10.defineDelegateProxyPrototypeProperties(jSTypeRegistry22, scope23, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList58, strMap64);
        java.util.Map<java.lang.String, java.lang.String> strMap66 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry8, scope9, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList58, strMap66);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "goog.abstractMethod" + "'", str11, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "goog.global" + "'", str12, "goog.global");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "goog.global" + "'", str13, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "goog.abstractMethod" + "'", str25, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "goog.global" + "'", str26, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "goog.exportSymbol" + "'", str39, "goog.exportSymbol");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "goog.abstractMethod" + "'", str43, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "goog.global" + "'", str44, "goog.global");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "goog.exportProperty" + "'", str45, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(objectTypeArray57);
        org.junit.Assert.assertArrayEquals(objectTypeArray57, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        boolean boolean5 = closureCodingConvention0.isPrivate("goog.exportProperty");
        boolean boolean7 = closureCodingConvention0.isSuperClassReference("hi!");
        java.lang.Class<?> wildcardClass8 = closureCodingConvention0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getExportPropertyFunction();
        boolean boolean5 = closureCodingConvention0.isConstant("");
        boolean boolean8 = closureCodingConvention0.isExported("hi!", false);
        com.google.javascript.rhino.Node node9 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node9, strMap10);
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType15 = null;
        com.google.javascript.rhino.jstype.FunctionType functionType16 = null;
        closureCodingConvention0.applyDelegateRelationship(objectType12, objectType13, objectType14, functionType15, functionType16);
        boolean boolean19 = closureCodingConvention0.isConstantKey("goog.global");
        boolean boolean21 = closureCodingConvention0.isSuperClassReference("goog.abstractMethod");
        com.google.javascript.rhino.Node node22 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap23 = null;
        closureCodingConvention0.checkForCallingConventionDefiningCalls(node22, strMap23);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.exportProperty" + "'", str3, "goog.exportProperty");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        com.google.javascript.jscomp.ClosureCodingConvention closureCodingConvention0 = new com.google.javascript.jscomp.ClosureCodingConvention();
        java.lang.String str1 = closureCodingConvention0.getAbstractMethodName();
        java.lang.String str2 = closureCodingConvention0.getGlobalObject();
        java.lang.String str3 = closureCodingConvention0.getGlobalObject();
        boolean boolean5 = closureCodingConvention0.isValidEnumKey("hi!");
        boolean boolean7 = closureCodingConvention0.isPrivate("");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry8 = null;
        com.google.javascript.jscomp.Scope scope9 = null;
        com.google.javascript.rhino.jstype.ObjectType[] objectTypeArray10 = new com.google.javascript.rhino.jstype.ObjectType[] {};
        java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType> objectTypeList11 = new java.util.ArrayList<com.google.javascript.rhino.jstype.ObjectType>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList11, objectTypeArray10);
        java.util.Map<java.lang.String, java.lang.String> strMap13 = null;
        closureCodingConvention0.defineDelegateProxyPrototypeProperties(jSTypeRegistry8, scope9, (java.util.List<com.google.javascript.rhino.jstype.ObjectType>) objectTypeList11, strMap13);
        boolean boolean16 = closureCodingConvention0.isSuperClassReference("goog.exportSymbol");
        boolean boolean18 = closureCodingConvention0.isValidEnumKey("hi!");
        boolean boolean20 = closureCodingConvention0.isExported("goog.exportProperty");
        java.util.Collection<com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec> assertionFunctionSpecCollection21 = closureCodingConvention0.getAssertionFunctions();
        boolean boolean23 = closureCodingConvention0.isExported("goog.exportProperty");
        java.lang.String str24 = closureCodingConvention0.getDelegateSuperclassName();
        java.lang.String str25 = closureCodingConvention0.getGlobalObject();
        boolean boolean27 = closureCodingConvention0.isConstant("goog.global");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "goog.abstractMethod" + "'", str1, "goog.abstractMethod");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "goog.global" + "'", str2, "goog.global");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "goog.global" + "'", str3, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objectTypeArray10);
        org.junit.Assert.assertArrayEquals(objectTypeArray10, new com.google.javascript.rhino.jstype.ObjectType[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(assertionFunctionSpecCollection21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "goog.global" + "'", str25, "goog.global");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }
}

