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
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node3, (int) (byte) -1);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isNodeTypeReferenced(node3, 10);
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", 6, 0);
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isAssign(node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isExprCall(node17);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isGet(node17);
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        com.google.javascript.rhino.Node node29 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isAssign(node29);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isExprCall(node29);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isGet(node29);
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newName("^", node29);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isLhs(node24, node33);
        com.google.javascript.rhino.Node node38 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node38);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node38, (int) (short) 0);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node33, node38);
        com.google.javascript.rhino.Node node46 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node46);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isAssign(node46);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node46, "hi!");
        com.google.javascript.rhino.Node node55 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean56 = com.google.javascript.jscomp.NodeUtil.isAssign(node55);
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.isExprCall(node55);
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.isGet(node55);
        com.google.javascript.rhino.Node node59 = com.google.javascript.jscomp.NodeUtil.newName("^", node55);
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node46, node59);
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.referencesThis(node46);
        boolean boolean62 = com.google.javascript.jscomp.NodeUtil.isAssign(node46);
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.referencesThis(node46);
        com.google.javascript.rhino.Node node67 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean68 = com.google.javascript.jscomp.NodeUtil.isAssign(node67);
        boolean boolean69 = com.google.javascript.jscomp.NodeUtil.isExprCall(node67);
        java.lang.String[] strArray71 = new java.lang.String[] { "^" };
        java.util.LinkedHashSet<java.lang.String> strSet72 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet72, strArray71);
        boolean boolean74 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node67, (java.util.Set<java.lang.String>) strSet72);
        boolean boolean75 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node46, (java.util.Set<java.lang.String>) strSet72);
        boolean boolean76 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node38, (java.util.Set<java.lang.String>) strSet72);
        boolean boolean77 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node17, (java.util.Set<java.lang.String>) strSet72);
        boolean boolean78 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node13, (java.util.Set<java.lang.String>) strSet72);
        boolean boolean79 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node3, (java.util.Set<java.lang.String>) strSet72);
        boolean boolean80 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertArrayEquals(strArray71, new java.lang.String[] { "^" });
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isName(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isConstantName(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.referencesThis(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = com.google.javascript.jscomp.NodeUtil.tryMergeBlock(node3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.containsFunctionDeclaration(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isNodeTypeReferenced(node3, (int) (byte) -1);
        java.lang.String str9 = com.google.javascript.jscomp.NodeUtil.getSourceName(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunction(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node3, "hi!");
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isAssign(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isExprCall(node12);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isGet(node12);
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newName("^", node12);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node3, node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node3);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isNodeTypeReferenced(node3, 10);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node5);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getSourceName(node5);
        java.lang.String str8 = com.google.javascript.jscomp.NodeUtil.getStringValue(node5);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", node5, "");
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isConstantName(node5);
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node15);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isAssign(node15);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(node15);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isName(node15);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node5, node15);
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node15);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node15);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isFunction(node15);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssign(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExprCall(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isFunction(node4);
        int int9 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node4, (int) (byte) 10);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isVar(node4);
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newName("$$constant", node4, "$$constant");
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node12);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node3);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType11 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 0);
        int int12 = matchNodeType11.type;
        int int13 = com.google.javascript.jscomp.NodeUtil.getCount(node3, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType11);
        int int15 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node3, "$$constant");
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isCall(node3);
        com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isAssign(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isName(node4);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isConstantName(node4);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newName("$$constant", node4);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isThis(node9);
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node16);
        java.lang.String str18 = com.google.javascript.jscomp.NodeUtil.getSourceName(node16);
        java.lang.String str19 = com.google.javascript.jscomp.NodeUtil.getStringValue(node16);
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", node16, "");
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isConstantName(node16);
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node26);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isAssign(node26);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(node26);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isName(node26);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node16, node26);
        com.google.javascript.rhino.Node node32 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node26);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isStatement(node26);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isLhs(node9, node26);
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newExpr(node9);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node9);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isExprCall(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isGet(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isNew(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node3);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection8 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(nodeCollection8);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("|", (int) '#', (int) '4');
        org.junit.Assert.assertNotNull(node3);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node5);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getSourceName(node5);
        java.lang.String str8 = com.google.javascript.jscomp.NodeUtil.getStringValue(node5);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", node5, "");
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isNodeTypeReferenced(node5, (int) (short) 100);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node5);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node5);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isVar(node5);
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newVarNode("^", node5);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isLabelName(node5);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssign(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExprCall(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isFunction(node4);
        int int9 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node4, (int) (byte) 10);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isVar(node4);
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newName("$$constant", node4, "$$constant");
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node4);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isFunction(node4);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = com.google.javascript.jscomp.NodeUtil.functionCallHasSideEffects(node4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected CALL node, got NAME");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isAssign(node4);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node4, "hi!");
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isAssign(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isExprCall(node13);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isGet(node13);
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newName("^", node13);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node4, node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isNew(node4);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isName(node4);
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isAssign(node24);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isName(node24);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node24);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node4, node24, "");
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node4);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isForIn(node4);
        com.google.javascript.rhino.Node node34 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", node4, "||");
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node4);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isNew(node4);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node4);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isVar(node4);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isName(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isConstantName(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.referencesThis(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node3);
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node15);
        java.lang.String str17 = com.google.javascript.jscomp.NodeUtil.getSourceName(node15);
        java.lang.String str18 = com.google.javascript.jscomp.NodeUtil.getStringValue(node15);
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", node15, "");
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newVarNode("$$constant", node15);
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isAssign(node26);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isExprCall(node26);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isFunction(node26);
        int int31 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node26, (int) (byte) 10);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isVar(node26);
        com.google.javascript.rhino.Node node34 = com.google.javascript.jscomp.NodeUtil.newName("$$constant", node26, "$$constant");
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node26);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node15, node26);
        com.google.javascript.rhino.Node node41 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node41);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isAssign(node41);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node41, "hi!");
        com.google.javascript.rhino.Node node50 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isAssign(node50);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isExprCall(node50);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.isGet(node50);
        com.google.javascript.rhino.Node node54 = com.google.javascript.jscomp.NodeUtil.newName("^", node50);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node41, node54);
        boolean boolean56 = com.google.javascript.jscomp.NodeUtil.referencesThis(node41);
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.isAssign(node41);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType60 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType(1);
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.isNodeTypeReferenced(node41, 6, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType60);
        int int62 = matchNodeType60.type;
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node15, "undefined", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType60);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.NodeUtil.removeChild(node3, node15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Invalid attempt to remove node: NAME  97 of NAME  97");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        com.google.javascript.rhino.Node node0 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode();
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isAssign(node5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isExprCall(node5);
        com.google.javascript.rhino.JSDocInfo jSDocInfo8 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node5);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node5);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isFunction(node5);
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node15);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node15);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node15);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node15);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node15);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node15);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType23 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 0);
        int int24 = matchNodeType23.type;
        int int25 = com.google.javascript.jscomp.NodeUtil.getCount(node15, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType23);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node5, "%=", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType23);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node0, "%=", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType23);
        java.lang.String str28 = com.google.javascript.jscomp.NodeUtil.getSourceName(node0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isStatement(node0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node0);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSDocInfo8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isExprCall(node3);
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node3);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isCall(node3);
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newExpr(node3);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node11);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSDocInfo6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.DefinitionProvider definitionProvider2 = null;
        com.google.javascript.jscomp.PureFunctionIdentifier pureFunctionIdentifier3 = new com.google.javascript.jscomp.PureFunctionIdentifier(abstractCompiler1, definitionProvider2);
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isAssign(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isExprCall(node12);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isGet(node12);
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newName("^", node12);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isLhs(node7, node16);
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node21);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isAssign(node21);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node21, "hi!");
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node21);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isThis(node21);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(node21);
        pureFunctionIdentifier3.process(node7, node21);
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newVarNode("||", node7);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node7);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("Pure functions:\n\n", 0, (int) (byte) 100);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType6 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType(1);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.containsType(node3, (-1), (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType6);
        int int9 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node3, "");
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node3, "hi!");
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isAssign(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isExprCall(node12);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isGet(node12);
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newName("^", node12);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node3, node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isNew(node3);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isName(node3);
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node23);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isAssign(node23);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isName(node23);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node23);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node3, node23, "");
        java.lang.String str30 = com.google.javascript.jscomp.NodeUtil.getSourceName(node23);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node23);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isAssign(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isExprCall(node8);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isGet(node8);
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newName("^", node8);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isLhs(node3, node12);
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node17);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node17, (int) (short) 0);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node12, node17);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isThis(node12);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(node12);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(node12);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.containsType(node12, (-1));
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssign(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExprCall(node4);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getSourceName(node4);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node4);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newName("%=", node4);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node6);
        java.lang.String str8 = com.google.javascript.jscomp.NodeUtil.getSourceName(node6);
        java.lang.String str9 = com.google.javascript.jscomp.NodeUtil.getStringValue(node6);
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", node6, "");
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newVarNode("$$constant", node6);
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isAssign(node16);
        com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(node16);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node6, node16);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType22 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (byte) -1);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node16, "", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType22);
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newName("Pure functions:\n\n", node16);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(node24);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isAssign(node5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isExprCall(node5);
        com.google.javascript.rhino.JSDocInfo jSDocInfo8 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node5);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node5);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType12 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType(1);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node5, "hi!", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType12);
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newVarNode("%=", node5);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isNew(node14);
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("Pure functions:\n\n", node14, "");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.getCatchBlock(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSDocInfo8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isName(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isThis(node3);
        int int10 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node3, "Pure functions:\n\n");
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node3);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection12 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(nodeCollection12);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node3, "hi!");
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isAssign(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isExprCall(node12);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isGet(node12);
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newName("^", node12);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node3, node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isNew(node3);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isName(node3);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.containsCall(node3);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node3);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.getConditionExpression(node3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: NAME  97 does not have a condition.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isExprCall(node3);
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isNew(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.referencesThis(node3);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node3);
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node14);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node14);
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node14, (java.util.Set<java.lang.String>) strSet19);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node3, (java.util.Set<java.lang.String>) strSet19);
        com.google.javascript.rhino.JSDocInfo jSDocInfo23 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSDocInfo6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(jSDocInfo23);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssign(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExprCall(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isGet(node4);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newName("^", node4);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isString(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node8);
        int int12 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node8, "hi!");
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isAnonymousFunction(node8);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node8);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.DefinitionProvider definitionProvider1 = null;
        com.google.javascript.jscomp.PureFunctionIdentifier pureFunctionIdentifier2 = new com.google.javascript.jscomp.PureFunctionIdentifier(abstractCompiler0, definitionProvider1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isAssign(node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isExprCall(node7);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isFunction(node7);
        int int12 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node7, (int) (byte) 10);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isVar(node7);
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newName("$$constant", node7, "$$constant");
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node7);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isFunction(node7);
        com.google.javascript.rhino.JSDocInfo jSDocInfo18 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node7);
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node23);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isAssign(node23);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node23, "hi!");
        com.google.javascript.rhino.Node node32 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isAssign(node32);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isExprCall(node32);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isGet(node32);
        com.google.javascript.rhino.Node node36 = com.google.javascript.jscomp.NodeUtil.newName("^", node32);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node23, node36);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isNew(node23);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isName(node23);
        com.google.javascript.rhino.Node node43 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node43);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isAssign(node43);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isName(node43);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node43);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node23, node43, "");
        com.google.javascript.rhino.Node node51 = com.google.javascript.jscomp.NodeUtil.newName("hi!", node23, "^");
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isLhs(node7, node51);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType55 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) '4');
        com.google.javascript.rhino.Node node59 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(node59);
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node59);
        boolean boolean62 = matchNodeType55.apply(node59);
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node7, "hi!", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType55);
        com.google.javascript.rhino.Node node67 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean68 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node67);
        boolean boolean69 = com.google.javascript.jscomp.NodeUtil.isAssign(node67);
        boolean boolean70 = com.google.javascript.jscomp.NodeUtil.isName(node67);
        boolean boolean71 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node67);
        boolean boolean72 = com.google.javascript.jscomp.NodeUtil.isThis(node67);
        pureFunctionIdentifier2.process(node7, node67);
        boolean boolean74 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node67);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(jSDocInfo18);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node3, "hi!");
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isAssign(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isExprCall(node12);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isGet(node12);
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newName("^", node12);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node3, node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.referencesThis(node3);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.referencesThis(node3);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node3);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node3, "typeof");
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node3, "hi!");
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isAssign(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isExprCall(node12);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isGet(node12);
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newName("^", node12);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node3, node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isNew(node3);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isName(node3);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.containsCall(node3);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isString(node3);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.containsCall(node3);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node3);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node3);
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node28);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isAssign(node28);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node28, "hi!");
        com.google.javascript.rhino.Node node37 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isAssign(node37);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isExprCall(node37);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isGet(node37);
        com.google.javascript.rhino.Node node41 = com.google.javascript.jscomp.NodeUtil.newName("^", node37);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node28, node41);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isConstantName(node28);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isLhs(node3, node28);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node28);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node4);
        java.lang.String str6 = com.google.javascript.jscomp.NodeUtil.getSourceName(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node4);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newExpr(node4);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newName("", node4);
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node9, node13);
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isAssign(node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isExprCall(node18);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isGet(node18);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node18, (int) (byte) 0);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node18);
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node28);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isAssign(node28);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node28, "hi!");
        com.google.javascript.rhino.Node node37 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isAssign(node37);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isExprCall(node37);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isGet(node37);
        com.google.javascript.rhino.Node node41 = com.google.javascript.jscomp.NodeUtil.newName("^", node37);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node28, node41);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.referencesThis(node28);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isAssign(node28);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.referencesThis(node28);
        com.google.javascript.rhino.Node node49 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isAssign(node49);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isExprCall(node49);
        java.lang.String[] strArray53 = new java.lang.String[] { "^" };
        java.util.LinkedHashSet<java.lang.String> strSet54 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet54, strArray53);
        boolean boolean56 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node49, (java.util.Set<java.lang.String>) strSet54);
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node28, (java.util.Set<java.lang.String>) strSet54);
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node18, (java.util.Set<java.lang.String>) strSet54);
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node9, (java.util.Set<java.lang.String>) strSet54);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "^" });
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node3);
        java.lang.String str5 = com.google.javascript.jscomp.NodeUtil.getSourceName(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isGetProp(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", 1, (int) (byte) 0);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isString(node3);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node9);
        java.lang.String str11 = com.google.javascript.jscomp.NodeUtil.getSourceName(node9);
        java.lang.String str12 = com.google.javascript.jscomp.NodeUtil.getStringValue(node9);
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isAssign(node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isExprCall(node17);
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", node17, "^");
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node9, node21);
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("typeof", node9, "%=");
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node28);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isAssign(node28);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node28, "hi!");
        com.google.javascript.rhino.Node node37 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isAssign(node37);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isExprCall(node37);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isGet(node37);
        com.google.javascript.rhino.Node node41 = com.google.javascript.jscomp.NodeUtil.newName("^", node37);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node28, node41);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.referencesThis(node28);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isAssign(node28);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.referencesThis(node28);
        com.google.javascript.rhino.Node node49 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isAssign(node49);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isExprCall(node49);
        java.lang.String[] strArray53 = new java.lang.String[] { "^" };
        java.util.LinkedHashSet<java.lang.String> strSet54 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet54, strArray53);
        boolean boolean56 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node49, (java.util.Set<java.lang.String>) strSet54);
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node28, (java.util.Set<java.lang.String>) strSet54);
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node24, (java.util.Set<java.lang.String>) strSet54);
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node3, (java.util.Set<java.lang.String>) strSet54);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "^" });
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.DefinitionProvider definitionProvider1 = null;
        com.google.javascript.jscomp.PureFunctionIdentifier pureFunctionIdentifier2 = new com.google.javascript.jscomp.PureFunctionIdentifier(abstractCompiler0, definitionProvider1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isAssign(node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isExprCall(node7);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isFunction(node7);
        int int12 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node7, (int) (byte) 10);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isVar(node7);
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newName("$$constant", node7, "$$constant");
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node7);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isFunction(node7);
        com.google.javascript.rhino.JSDocInfo jSDocInfo18 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node7);
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node23);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isAssign(node23);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node23, "hi!");
        com.google.javascript.rhino.Node node32 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isAssign(node32);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isExprCall(node32);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isGet(node32);
        com.google.javascript.rhino.Node node36 = com.google.javascript.jscomp.NodeUtil.newName("^", node32);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node23, node36);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isNew(node23);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isName(node23);
        com.google.javascript.rhino.Node node43 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node43);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isAssign(node43);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isName(node43);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node43);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node23, node43, "");
        com.google.javascript.rhino.Node node51 = com.google.javascript.jscomp.NodeUtil.newName("hi!", node23, "^");
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isLhs(node7, node51);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType55 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) '4');
        com.google.javascript.rhino.Node node59 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(node59);
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node59);
        boolean boolean62 = matchNodeType55.apply(node59);
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node7, "hi!", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType55);
        com.google.javascript.rhino.Node node67 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean68 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node67);
        boolean boolean69 = com.google.javascript.jscomp.NodeUtil.isAssign(node67);
        boolean boolean70 = com.google.javascript.jscomp.NodeUtil.isName(node67);
        boolean boolean71 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node67);
        boolean boolean72 = com.google.javascript.jscomp.NodeUtil.isThis(node67);
        pureFunctionIdentifier2.process(node7, node67);
        com.google.javascript.rhino.Node node78 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean79 = com.google.javascript.jscomp.NodeUtil.isAssign(node78);
        boolean boolean80 = com.google.javascript.jscomp.NodeUtil.isExprCall(node78);
        java.lang.String str81 = com.google.javascript.jscomp.NodeUtil.getSourceName(node78);
        boolean boolean82 = com.google.javascript.jscomp.NodeUtil.containsCall(node78);
        boolean boolean84 = com.google.javascript.jscomp.NodeUtil.containsType(node78, 0);
        com.google.javascript.rhino.Node node86 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", node78, "$$constant");
        boolean boolean87 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node78);
        boolean boolean88 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node7, node78);
        boolean boolean89 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node78);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(jSDocInfo18);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNull(str81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(node86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node5);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getSourceName(node5);
        java.lang.String str8 = com.google.javascript.jscomp.NodeUtil.getStringValue(node5);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", node5, "");
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newVarNode("$$constant", node5);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isFunctionAnonymous(node5);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node5);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.referencesThis(node5);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isFunction(node5);
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isAssign(node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isExprCall(node24);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isGet(node24);
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newName("^", node24);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isLhs(node19, node28);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node28);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isLhs(node5, node28);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node28);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node4, (int) (short) 0);
        com.google.javascript.rhino.JSDocInfo jSDocInfo8 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node4);
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node14);
        java.lang.String str16 = com.google.javascript.jscomp.NodeUtil.getSourceName(node14);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node14);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isGetProp(node14);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node14);
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", node14, "||");
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isAssign(node25);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isExprCall(node25);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isFunction(node25);
        int int30 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node25, (int) (byte) 10);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node25);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node25);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node14, node25, "^");
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newVarNode("$$constant", node14);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node4, node14, "^");
        com.google.javascript.rhino.Node node38 = com.google.javascript.jscomp.NodeUtil.newName("hi!", node4);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSDocInfo8);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node38);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isAssign(node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isExprCall(node9);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isGet(node9);
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newName("^", node9);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isLhs(node4, node13);
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node18);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node18, (int) (short) 0);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node13, node18);
        int int24 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node13, "Pure functions:\n\n");
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isFunction(node13);
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newVarNode("||", node13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Non-literal value: NAME ^ 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isVar(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isVar(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.containsFunctionDeclaration(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isExprCall(node3);
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSDocInfo6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node3, "hi!");
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isAssign(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isExprCall(node12);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isGet(node12);
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newName("^", node12);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node3, node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isNew(node3);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isName(node3);
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node23);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isAssign(node23);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isName(node23);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node23);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node3, node23, "");
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node3);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isForIn(node3);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node3);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.containsFunctionDeclaration(node3);
        java.lang.String str34 = com.google.javascript.jscomp.NodeUtil.getStringValue(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node10);
        java.lang.String str12 = com.google.javascript.jscomp.NodeUtil.getSourceName(node10);
        java.lang.String str13 = com.google.javascript.jscomp.NodeUtil.getStringValue(node10);
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", node10, "");
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newVarNode("$$constant", node10);
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isAssign(node20);
        com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(node20);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node10, node20);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node20);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node3, node20);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isFunction(node20);
        com.google.javascript.rhino.Node node31 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node31);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isAssign(node31);
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newName("", node31, "");
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node31);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node31, 10);
        com.google.javascript.rhino.Node node42 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node42);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isAssign(node42);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node42, "hi!");
        com.google.javascript.rhino.Node node51 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isAssign(node51);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.isExprCall(node51);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.isGet(node51);
        com.google.javascript.rhino.Node node55 = com.google.javascript.jscomp.NodeUtil.newName("^", node51);
        boolean boolean56 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node42, node55);
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.isNew(node42);
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.isName(node42);
        com.google.javascript.rhino.Node node62 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node62);
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.isAssign(node62);
        boolean boolean65 = com.google.javascript.jscomp.NodeUtil.isName(node62);
        boolean boolean66 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node62);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node42, node62, "");
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node31, node62);
        boolean boolean70 = com.google.javascript.jscomp.NodeUtil.isLhs(node20, node62);
        boolean boolean71 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(node20);
        boolean boolean72 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node20);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node5);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getSourceName(node5);
        java.lang.String str8 = com.google.javascript.jscomp.NodeUtil.getStringValue(node5);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", node5, "");
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newVarNode("$$constant", node5);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node5);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node5);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.containsFunctionDeclaration(node5);
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node18);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node18);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node18);
        int int24 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node18, 0);
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node28);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isAssign(node28);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node28, "hi!");
        com.google.javascript.rhino.Node node37 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isAssign(node37);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isExprCall(node37);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isGet(node37);
        com.google.javascript.rhino.Node node41 = com.google.javascript.jscomp.NodeUtil.newName("^", node37);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node28, node41);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.referencesThis(node28);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isAssign(node28);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.referencesThis(node28);
        com.google.javascript.rhino.Node node49 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isAssign(node49);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isExprCall(node49);
        java.lang.String[] strArray53 = new java.lang.String[] { "^" };
        java.util.LinkedHashSet<java.lang.String> strSet54 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet54, strArray53);
        boolean boolean56 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node49, (java.util.Set<java.lang.String>) strSet54);
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node28, (java.util.Set<java.lang.String>) strSet54);
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node18, (java.util.Set<java.lang.String>) strSet54);
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.isConstantName(node18);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean60 = com.google.javascript.jscomp.NodeUtil.isControlStructureCodeBlock(node5, node18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "^" });
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        com.google.javascript.rhino.Node node0 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode();
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node0);
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isAssign(node5);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node5, "hi!");
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isAssign(node14);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isExprCall(node14);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isGet(node14);
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newName("^", node14);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node5, node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isNew(node5);
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node25);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node25);
        com.google.javascript.rhino.Node node31 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        com.google.javascript.rhino.Node node36 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isAssign(node36);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isExprCall(node36);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isGet(node36);
        com.google.javascript.rhino.Node node40 = com.google.javascript.jscomp.NodeUtil.newName("^", node36);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isLhs(node31, node40);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node25, node40);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node40, (int) (byte) 10);
        com.google.javascript.rhino.Node node49 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node49);
        java.lang.String str51 = com.google.javascript.jscomp.NodeUtil.getSourceName(node49);
        java.lang.String str52 = com.google.javascript.jscomp.NodeUtil.getStringValue(node49);
        com.google.javascript.rhino.Node node57 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.isAssign(node57);
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.isExprCall(node57);
        com.google.javascript.rhino.Node node61 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", node57, "^");
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node49, node61);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType65 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 0);
        boolean boolean66 = com.google.javascript.jscomp.NodeUtil.containsType(node61, 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType65);
        boolean boolean67 = com.google.javascript.jscomp.NodeUtil.containsType(node40, (int) (byte) 10, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType65);
        boolean boolean68 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node5, "Pure functions:\n\n", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType65);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node0, node5, "%=");
        boolean boolean71 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node0);
        boolean boolean72 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node0);
        org.junit.Assert.assertNotNull(node0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node6);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newName("", node6);
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node13);
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isAssign(node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isExprCall(node24);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isGet(node24);
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newName("^", node24);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isLhs(node19, node28);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node13, node28);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node28, (int) (byte) 10);
        com.google.javascript.rhino.Node node37 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node37);
        java.lang.String str39 = com.google.javascript.jscomp.NodeUtil.getSourceName(node37);
        java.lang.String str40 = com.google.javascript.jscomp.NodeUtil.getStringValue(node37);
        com.google.javascript.rhino.Node node45 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isAssign(node45);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isExprCall(node45);
        com.google.javascript.rhino.Node node49 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", node45, "^");
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node37, node49);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType53 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 0);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.containsType(node49, 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType53);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.containsType(node28, (int) (byte) 10, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType53);
        int int56 = matchNodeType53.type;
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType58 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (byte) 0);
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.has(node9, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType53, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType58);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean60 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node0, "%=", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isAssign(node4);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node4, "hi!");
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isAssign(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isExprCall(node13);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isGet(node13);
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newName("^", node13);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node4, node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isNew(node4);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isName(node4);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.referencesThis(node4);
        int int23 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node4, (int) (short) 0);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.referencesThis(node4);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node4);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isString(node4);
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node4);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node27);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node3, "hi!");
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isAssign(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isExprCall(node12);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isGet(node12);
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newName("^", node12);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node3, node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isThis(node3);
        com.google.javascript.jscomp.NodeUtil.Visitor visitor19 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isAssign(node28);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isExprCall(node28);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isGet(node28);
        com.google.javascript.rhino.Node node32 = com.google.javascript.jscomp.NodeUtil.newName("^", node28);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isLhs(node23, node32);
        com.google.javascript.rhino.Node node37 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node37);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node37, (int) (short) 0);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node32, node37);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isThis(node32);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(node32);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(node32);
        com.google.javascript.rhino.Node node49 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node49);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isAssign(node49);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node49, "hi!");
        com.google.javascript.rhino.Node node58 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.isAssign(node58);
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.isExprCall(node58);
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.isGet(node58);
        com.google.javascript.rhino.Node node62 = com.google.javascript.jscomp.NodeUtil.newName("^", node58);
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node49, node62);
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.referencesThis(node49);
        boolean boolean65 = com.google.javascript.jscomp.NodeUtil.isAssign(node49);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType68 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType(1);
        boolean boolean69 = com.google.javascript.jscomp.NodeUtil.isNodeTypeReferenced(node49, 6, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType68);
        int int70 = matchNodeType68.type;
        boolean boolean71 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node32, "Pure functions:\n\n", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType68);
        int int72 = matchNodeType68.type;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.NodeUtil.visitPreOrder(node3, visitor19, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node3, (int) (short) 0);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node3, (int) 'a');
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isAssign(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isExprCall(node13);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isFunction(node13);
        int int18 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node13, (int) (byte) 10);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isForIn(node13);
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node13);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node3, node13);
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isAssign(node25);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isExprCall(node25);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isFunction(node25);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node25);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node13, node25, "Pure functions:\n\n");
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node25);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isNew(node25);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        com.google.javascript.rhino.Node node0 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode();
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node0, "");
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node0);
        org.junit.Assert.assertNotNull(node0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isAssign(node4);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node4, "hi!");
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node4);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isThis(node4);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(node4);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isString(node4);
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newName("^", node4);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node3, "hi!");
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isAssign(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isExprCall(node12);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isGet(node12);
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newName("^", node12);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node3, node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isNew(node3);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isName(node3);
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node23);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isAssign(node23);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isName(node23);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node23);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node3, node23, "");
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node3);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isName(node3);
        java.lang.String str32 = com.google.javascript.jscomp.NodeUtil.getSourceName(node3);
        com.google.javascript.rhino.Node node36 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node36);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isAssign(node36);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node36, "hi!");
        com.google.javascript.rhino.Node node45 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isAssign(node45);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isExprCall(node45);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isGet(node45);
        com.google.javascript.rhino.Node node49 = com.google.javascript.jscomp.NodeUtil.newName("^", node45);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node36, node49);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.containsType(node49, (int) ' ');
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.isLhs(node3, node49);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node49);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node5);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getSourceName(node5);
        java.lang.String str8 = com.google.javascript.jscomp.NodeUtil.getStringValue(node5);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", node5, "");
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newVarNode("$$constant", node5);
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newExpr(node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isGet(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isForIn(node12);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node3, "hi!");
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isAssign(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isExprCall(node12);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isGet(node12);
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newName("^", node12);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node3, node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isConstantName(node3);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isAnonymousFunction(node3);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node3);
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node25);
        java.lang.String str27 = com.google.javascript.jscomp.NodeUtil.getSourceName(node25);
        com.google.javascript.rhino.Node node29 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", node25, "^");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isControlStructureCodeBlock(node3, node29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(node29);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidPropertyName("instanceof");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node3, "hi!");
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isAssign(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isExprCall(node12);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isGet(node12);
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newName("^", node12);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node3, node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isNew(node3);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isName(node3);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.referencesThis(node3);
        int int22 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node3, (int) (short) 0);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.referencesThis(node3);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node3, "|");
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isVar(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node3);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isAssign(node15);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isExprCall(node15);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isGet(node15);
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newName("^", node15);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isLhs(node10, node19);
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node24);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node24, (int) (short) 0);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node19, node24);
        com.google.javascript.rhino.Node node32 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node32);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isAssign(node32);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node32, "hi!");
        com.google.javascript.rhino.Node node41 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isAssign(node41);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isExprCall(node41);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isGet(node41);
        com.google.javascript.rhino.Node node45 = com.google.javascript.jscomp.NodeUtil.newName("^", node41);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node32, node45);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.referencesThis(node32);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isAssign(node32);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.referencesThis(node32);
        com.google.javascript.rhino.Node node53 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.isAssign(node53);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.isExprCall(node53);
        java.lang.String[] strArray57 = new java.lang.String[] { "^" };
        java.util.LinkedHashSet<java.lang.String> strSet58 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet58, strArray57);
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node53, (java.util.Set<java.lang.String>) strSet58);
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node32, (java.util.Set<java.lang.String>) strSet58);
        boolean boolean62 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node24, (java.util.Set<java.lang.String>) strSet58);
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node3, (java.util.Set<java.lang.String>) strSet58);
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node3);
        boolean boolean65 = com.google.javascript.jscomp.NodeUtil.referencesThis(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "^" });
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node5);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node5, (int) (short) 0);
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isAssign(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isExprCall(node12);
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node18);
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isAssign(node27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isExprCall(node27);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isFunction(node27);
        int int32 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node27, (int) (byte) 10);
        com.google.javascript.rhino.Node[] nodeArray33 = new com.google.javascript.rhino.Node[] { node5, node12, node18, node23, node27 };
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList34 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList34, nodeArray33);
        com.google.javascript.rhino.Node node39 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node39);
        java.lang.String str41 = com.google.javascript.jscomp.NodeUtil.getSourceName(node39);
        com.google.javascript.rhino.FunctionNode functionNode44 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", (java.util.List<com.google.javascript.rhino.Node>) nodeList34, node39, (int) '#', 6);
        com.google.javascript.rhino.Node node49 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node49);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isAssign(node49);
        com.google.javascript.rhino.Node node53 = com.google.javascript.jscomp.NodeUtil.newName("", node49, "");
        java.lang.String str54 = com.google.javascript.jscomp.NodeUtil.getFunctionName((com.google.javascript.rhino.Node) functionNode44, node49);
        com.google.javascript.rhino.Node node56 = com.google.javascript.jscomp.NodeUtil.newName("^", (com.google.javascript.rhino.Node) functionNode44, "$$constant");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean57 = com.google.javascript.jscomp.NodeUtil.hasCatchHandler((com.google.javascript.rhino.Node) functionNode44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(nodeArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(functionNode44);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(node56);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        java.lang.String str1 = com.google.javascript.jscomp.NodeUtil.opToStr(8);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isExprCall(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isFunction(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.containsCall(node3);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node3);
        com.google.javascript.jscomp.NodeUtil.Visitor visitor9 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isAssign(node13);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node13, "hi!");
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isAssign(node22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isExprCall(node22);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isGet(node22);
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newName("^", node22);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node13, node26);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isNew(node13);
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node33);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node33);
        com.google.javascript.rhino.Node node39 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        com.google.javascript.rhino.Node node44 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isAssign(node44);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isExprCall(node44);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isGet(node44);
        com.google.javascript.rhino.Node node48 = com.google.javascript.jscomp.NodeUtil.newName("^", node44);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.isLhs(node39, node48);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node33, node48);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node48, (int) (byte) 10);
        com.google.javascript.rhino.Node node57 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node57);
        java.lang.String str59 = com.google.javascript.jscomp.NodeUtil.getSourceName(node57);
        java.lang.String str60 = com.google.javascript.jscomp.NodeUtil.getStringValue(node57);
        com.google.javascript.rhino.Node node65 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean66 = com.google.javascript.jscomp.NodeUtil.isAssign(node65);
        boolean boolean67 = com.google.javascript.jscomp.NodeUtil.isExprCall(node65);
        com.google.javascript.rhino.Node node69 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", node65, "^");
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node57, node69);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType73 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 0);
        boolean boolean74 = com.google.javascript.jscomp.NodeUtil.containsType(node69, 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType73);
        boolean boolean75 = com.google.javascript.jscomp.NodeUtil.containsType(node48, (int) (byte) 10, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType73);
        boolean boolean76 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node13, "Pure functions:\n\n", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType73);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.NodeUtil.visitPostOrder(node8, visitor9, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node4);
        java.lang.String str6 = com.google.javascript.jscomp.NodeUtil.getSourceName(node4);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getStringValue(node4);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", node4, "");
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node9);
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.getLoopCodeBlock(node9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node3, "hi!");
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isAssign(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isExprCall(node12);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isGet(node12);
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newName("^", node12);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node3, node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isNew(node3);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isName(node3);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.containsCall(node3);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isString(node3);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.containsCall(node3);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node3);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node3);
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node30);
        java.lang.String str32 = com.google.javascript.jscomp.NodeUtil.getSourceName(node30);
        java.lang.String str33 = com.google.javascript.jscomp.NodeUtil.getStringValue(node30);
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", node30, "");
        com.google.javascript.rhino.Node node36 = com.google.javascript.jscomp.NodeUtil.newVarNode("$$constant", node30);
        com.google.javascript.rhino.Node node37 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node36);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node3, node37);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType1 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType(15);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssign(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExprCall(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isGet(node4);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newName("^", node4);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.containsFunctionDeclaration(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node8);
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node16);
        java.lang.String str18 = com.google.javascript.jscomp.NodeUtil.getSourceName(node16);
        java.lang.String str19 = com.google.javascript.jscomp.NodeUtil.getStringValue(node16);
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", node16, "");
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newVarNode("$$constant", node16);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node8, node22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node22);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node22);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node3, "hi!");
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isAssign(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isExprCall(node12);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isGet(node12);
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newName("^", node12);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node3, node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isNew(node3);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isName(node3);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.containsCall(node3);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isString(node3);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.containsCall(node3);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node3);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node3);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.containsFunctionDeclaration(node3);
        com.google.javascript.rhino.Node node31 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node31);
        java.lang.String str33 = com.google.javascript.jscomp.NodeUtil.getSourceName(node31);
        java.lang.String str34 = com.google.javascript.jscomp.NodeUtil.getStringValue(node31);
        com.google.javascript.rhino.Node node36 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", node31, "");
        com.google.javascript.rhino.Node node37 = com.google.javascript.jscomp.NodeUtil.newVarNode("$$constant", node31);
        com.google.javascript.rhino.Node node42 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isAssign(node42);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isExprCall(node42);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isFunction(node42);
        int int47 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node42, (int) (byte) 10);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isVar(node42);
        com.google.javascript.rhino.Node node50 = com.google.javascript.jscomp.NodeUtil.newName("$$constant", node42, "$$constant");
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node42);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node31, node42);
        java.lang.String str53 = com.google.javascript.jscomp.NodeUtil.getStringValue(node42);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.isThis(node42);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.isName(node42);
        boolean boolean56 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node42);
        com.google.javascript.rhino.Node node61 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        com.google.javascript.rhino.Node node66 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean67 = com.google.javascript.jscomp.NodeUtil.isAssign(node66);
        boolean boolean68 = com.google.javascript.jscomp.NodeUtil.isExprCall(node66);
        boolean boolean69 = com.google.javascript.jscomp.NodeUtil.isGet(node66);
        com.google.javascript.rhino.Node node70 = com.google.javascript.jscomp.NodeUtil.newName("^", node66);
        boolean boolean71 = com.google.javascript.jscomp.NodeUtil.isLhs(node61, node70);
        boolean boolean72 = com.google.javascript.jscomp.NodeUtil.isForIn(node70);
        boolean boolean74 = com.google.javascript.jscomp.NodeUtil.isNodeTypeReferenced(node70, 0);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType76 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) '4');
        int int77 = com.google.javascript.jscomp.NodeUtil.getCount(node70, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType76);
        com.google.javascript.rhino.Node node81 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean82 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node81);
        boolean boolean83 = com.google.javascript.jscomp.NodeUtil.isAssign(node81);
        boolean boolean85 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node81, "hi!");
        com.google.javascript.rhino.Node node90 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean91 = com.google.javascript.jscomp.NodeUtil.isAssign(node90);
        boolean boolean92 = com.google.javascript.jscomp.NodeUtil.isExprCall(node90);
        boolean boolean93 = com.google.javascript.jscomp.NodeUtil.isGet(node90);
        com.google.javascript.rhino.Node node94 = com.google.javascript.jscomp.NodeUtil.newName("^", node90);
        boolean boolean95 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node81, node94);
        boolean boolean96 = matchNodeType76.apply(node81);
        boolean boolean97 = com.google.javascript.jscomp.NodeUtil.isNodeTypeReferenced(node42, 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType76);
        boolean boolean98 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node3, node42);
        boolean boolean99 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(node90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(node94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode();
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node1, "");
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node1);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType7 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 0);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isNodeTypeReferenced(node1, 10, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node1);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isForIn(node1);
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newVarNode("instanceof", node1);
        java.lang.Class<?> wildcardClass12 = node11.getClass();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node4);
        java.lang.String str6 = com.google.javascript.jscomp.NodeUtil.getSourceName(node4);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getStringValue(node4);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", node4, "");
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isConstantName(node4);
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node14);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isAssign(node14);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(node14);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isName(node14);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node4, node14);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.referencesThis(node4);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssign(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExprCall(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isFunction(node4);
        int int9 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node4, (int) (byte) 10);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isVar(node4);
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newName("$$constant", node4, "$$constant");
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isGet(node4);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node4);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isExprCall(node3);
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isGetProp(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isForIn(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSDocInfo6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        com.google.javascript.rhino.Node node0 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode();
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node0);
        org.junit.Assert.assertNotNull(node0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node3);
        java.lang.String str5 = com.google.javascript.jscomp.NodeUtil.getSourceName(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node3);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isAssign(node15);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isExprCall(node15);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isGet(node15);
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newName("^", node15);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isLhs(node10, node19);
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node24);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node24, (int) (short) 0);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node19, node24);
        com.google.javascript.rhino.Node node32 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node32);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isAssign(node32);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node32, "hi!");
        com.google.javascript.rhino.Node node41 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isAssign(node41);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isExprCall(node41);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isGet(node41);
        com.google.javascript.rhino.Node node45 = com.google.javascript.jscomp.NodeUtil.newName("^", node41);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node32, node45);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.referencesThis(node32);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isAssign(node32);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.referencesThis(node32);
        com.google.javascript.rhino.Node node53 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.isAssign(node53);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.isExprCall(node53);
        java.lang.String[] strArray57 = new java.lang.String[] { "^" };
        java.util.LinkedHashSet<java.lang.String> strSet58 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet58, strArray57);
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node53, (java.util.Set<java.lang.String>) strSet58);
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node32, (java.util.Set<java.lang.String>) strSet58);
        boolean boolean62 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node24, (java.util.Set<java.lang.String>) strSet58);
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node3, (java.util.Set<java.lang.String>) strSet58);
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node3);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler66 = null;
        com.google.javascript.jscomp.DefinitionProvider definitionProvider67 = null;
        com.google.javascript.jscomp.PureFunctionIdentifier pureFunctionIdentifier68 = new com.google.javascript.jscomp.PureFunctionIdentifier(abstractCompiler66, definitionProvider67);
        com.google.javascript.rhino.Node node72 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        com.google.javascript.rhino.Node node77 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean78 = com.google.javascript.jscomp.NodeUtil.isAssign(node77);
        boolean boolean79 = com.google.javascript.jscomp.NodeUtil.isExprCall(node77);
        boolean boolean80 = com.google.javascript.jscomp.NodeUtil.isGet(node77);
        com.google.javascript.rhino.Node node81 = com.google.javascript.jscomp.NodeUtil.newName("^", node77);
        boolean boolean82 = com.google.javascript.jscomp.NodeUtil.isLhs(node72, node81);
        com.google.javascript.rhino.Node node86 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean87 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node86);
        boolean boolean88 = com.google.javascript.jscomp.NodeUtil.isAssign(node86);
        boolean boolean90 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node86, "hi!");
        boolean boolean91 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node86);
        boolean boolean92 = com.google.javascript.jscomp.NodeUtil.isThis(node86);
        boolean boolean93 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(node86);
        pureFunctionIdentifier68.process(node72, node86);
        com.google.javascript.rhino.Node node96 = com.google.javascript.jscomp.NodeUtil.newName("", node72, "undefined");
        boolean boolean97 = com.google.javascript.jscomp.NodeUtil.isExprCall(node72);
        boolean boolean98 = com.google.javascript.jscomp.NodeUtil.isLhs(node3, node72);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "^" });
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(node86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(node96);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isExprCall(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isFunction(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.containsCall(node3);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node3);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node3);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.getLoopCodeBlock(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node3, "hi!");
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isAssign(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isExprCall(node12);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isGet(node12);
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newName("^", node12);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node3, node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.referencesThis(node3);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node3);
        java.lang.String str20 = com.google.javascript.jscomp.NodeUtil.getSourceName(node3);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node3);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isAssign(node4);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node4, "hi!");
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isAssign(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isExprCall(node13);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isGet(node13);
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newName("^", node13);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node4, node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isNew(node4);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isName(node4);
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isAssign(node24);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isName(node24);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node24);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node4, node24, "");
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node4);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isForIn(node4);
        com.google.javascript.rhino.Node node34 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", node4, "||");
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node4);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isAssign(node4);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node5);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getSourceName(node5);
        java.lang.String str8 = com.google.javascript.jscomp.NodeUtil.getStringValue(node5);
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isAssign(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isExprCall(node13);
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", node13, "^");
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node5, node17);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType21 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 0);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.containsType(node17, 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType21);
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isAssign(node26);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isExprCall(node26);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isGet(node26);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node26, (int) (byte) 0);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node26);
        com.google.javascript.rhino.Node node36 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node36);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isAssign(node36);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node36, "hi!");
        com.google.javascript.rhino.Node node45 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isAssign(node45);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isExprCall(node45);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isGet(node45);
        com.google.javascript.rhino.Node node49 = com.google.javascript.jscomp.NodeUtil.newName("^", node45);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node36, node49);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.referencesThis(node36);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isAssign(node36);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.referencesThis(node36);
        com.google.javascript.rhino.Node node57 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.isAssign(node57);
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.isExprCall(node57);
        java.lang.String[] strArray61 = new java.lang.String[] { "^" };
        java.util.LinkedHashSet<java.lang.String> strSet62 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet62, strArray61);
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node57, (java.util.Set<java.lang.String>) strSet62);
        boolean boolean65 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node36, (java.util.Set<java.lang.String>) strSet62);
        boolean boolean66 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node26, (java.util.Set<java.lang.String>) strSet62);
        boolean boolean67 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node17, (java.util.Set<java.lang.String>) strSet62);
        com.google.javascript.rhino.Node node68 = com.google.javascript.jscomp.NodeUtil.newName("||", node17);
        com.google.javascript.rhino.Node node69 = com.google.javascript.jscomp.NodeUtil.newVarNode("||", node17);
        boolean boolean70 = com.google.javascript.jscomp.NodeUtil.isGet(node17);
        boolean boolean71 = com.google.javascript.jscomp.NodeUtil.isConstantName(node17);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertArrayEquals(strArray61, new java.lang.String[] { "^" });
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isExprCall(node3);
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isNew(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.referencesThis(node3);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node3);
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node14);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node14);
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node14, (java.util.Set<java.lang.String>) strSet19);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node3, (java.util.Set<java.lang.String>) strSet19);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSDocInfo6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        com.google.javascript.rhino.Node node0 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode();
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node0, "");
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node0);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType6 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 0);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isNodeTypeReferenced(node0, 10, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType6);
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isAssign(node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isExprCall(node11);
        java.lang.String str14 = com.google.javascript.jscomp.NodeUtil.getSourceName(node11);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.containsCall(node11);
        boolean boolean16 = matchNodeType6.apply(node11);
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isAssign(node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isExprCall(node20);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node20);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node11, node20);
        int int26 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node11, (int) (short) 0);
        org.junit.Assert.assertNotNull(node0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssign(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExprCall(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isFunction(node4);
        int int9 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node4, (int) (byte) 10);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newVarNode("$$constant", node4);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node10);
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isAssign(node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isExprCall(node17);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isGet(node17);
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newName("^", node17);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.containsFunctionDeclaration(node21);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node21);
        com.google.javascript.rhino.Node node29 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node29);
        java.lang.String str31 = com.google.javascript.jscomp.NodeUtil.getSourceName(node29);
        java.lang.String str32 = com.google.javascript.jscomp.NodeUtil.getStringValue(node29);
        com.google.javascript.rhino.Node node34 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", node29, "");
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newVarNode("$$constant", node29);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node21, node35);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node21);
        com.google.javascript.rhino.Node node42 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isAssign(node42);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isExprCall(node42);
        java.lang.String str45 = com.google.javascript.jscomp.NodeUtil.getSourceName(node42);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.containsCall(node42);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.containsType(node42, 0);
        com.google.javascript.rhino.Node node50 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", node42, "$$constant");
        com.google.javascript.rhino.Node node54 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node54);
        boolean boolean56 = com.google.javascript.jscomp.NodeUtil.isAssign(node54);
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node54, "hi!");
        com.google.javascript.rhino.Node node63 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.isAssign(node63);
        boolean boolean65 = com.google.javascript.jscomp.NodeUtil.isExprCall(node63);
        boolean boolean66 = com.google.javascript.jscomp.NodeUtil.isGet(node63);
        com.google.javascript.rhino.Node node67 = com.google.javascript.jscomp.NodeUtil.newName("^", node63);
        boolean boolean68 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node54, node67);
        boolean boolean69 = com.google.javascript.jscomp.NodeUtil.isConstantName(node54);
        boolean boolean70 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node54);
        boolean boolean71 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node50, node54);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node21, node50, "%=");
        boolean boolean74 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node10, node50);
        boolean boolean75 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node50);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssign(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExprCall(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isGet(node4);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newName("^", node4);
        com.google.javascript.jscomp.NodeUtil.Visitor visitor9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode();
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType13 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) '4');
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node17);
        boolean boolean20 = matchNodeType13.apply(node17);
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isAssign(node25);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isExprCall(node25);
        com.google.javascript.rhino.JSDocInfo jSDocInfo28 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node25);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node25);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType32 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType(1);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node25, "hi!", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType32);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node17, "", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType32);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node10, "undefined", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType32);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.NodeUtil.visitPostOrder(node8, visitor9, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(jSDocInfo28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssign(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExprCall(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isGet(node4);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newName("^", node4);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.containsFunctionDeclaration(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node8);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isNodeTypeReferenced(node8, (int) '4');
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = com.google.javascript.jscomp.NodeUtil.constructorCallHasSideEffects(node8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected NEW node, got NAME");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node4);
        java.lang.String str6 = com.google.javascript.jscomp.NodeUtil.getSourceName(node4);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getStringValue(node4);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", node4, "");
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isNew(node9);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isFunction(node9);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssign(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExprCall(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isGet(node4);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newName("^", node4);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isString(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node8);
        int int12 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node8, "hi!");
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isAnonymousFunction(node8);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node8);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node4);
        java.lang.String str6 = com.google.javascript.jscomp.NodeUtil.getSourceName(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node4);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isGetProp(node4);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node4);
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", node4, "||");
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isAssign(node15);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isExprCall(node15);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isFunction(node15);
        int int20 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node15, (int) (byte) 10);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node15);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node15);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node4, node15, "^");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = com.google.javascript.jscomp.NodeUtil.tryMergeBlock(node15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isAssign(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isName(node4);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isConstantName(node4);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newName("$$constant", node4);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.referencesThis(node4);
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node14);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isAssign(node14);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node14, "hi!");
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isAssign(node23);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isExprCall(node23);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isGet(node23);
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newName("^", node23);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node14, node27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isNew(node14);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isName(node14);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.referencesThis(node14);
        int int33 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node14, (int) (short) 0);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.referencesThis(node14);
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newExpr(node14);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node35);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isVar(node35);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node4, node35);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isAssign(node4);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node4, "hi!");
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isAssign(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isExprCall(node13);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isGet(node13);
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newName("^", node13);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node4, node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isNew(node4);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isName(node4);
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isAssign(node24);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isName(node24);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node24);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node4, node24, "");
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node4);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isForIn(node4);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node4);
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("%=", node4, "hi!");
        com.google.javascript.jscomp.NodeUtil.Visitor visitor36 = null;
        com.google.javascript.rhino.Node node40 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node40);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node40);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node40);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node40);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node40);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node40);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType48 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 0);
        int int49 = matchNodeType48.type;
        int int50 = com.google.javascript.jscomp.NodeUtil.getCount(node40, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType48);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType53 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) -1);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.isNodeTypeReferenced(node40, 8, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType53);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.NodeUtil.visitPreOrder(node35, visitor36, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        com.google.javascript.rhino.Node node0 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode();
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isAssign(node5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isExprCall(node5);
        com.google.javascript.rhino.JSDocInfo jSDocInfo8 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node5);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node5);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isFunction(node5);
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node15);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node15);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node15);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node15);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node15);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node15);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType23 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 0);
        int int24 = matchNodeType23.type;
        int int25 = com.google.javascript.jscomp.NodeUtil.getCount(node15, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType23);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node5, "%=", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType23);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node0, "%=", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType23);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.getAssignedValue(node0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node0);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSDocInfo8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isAssign(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isExprCall(node8);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isGet(node8);
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newName("^", node8);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isLhs(node3, node12);
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node17);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node17, (int) (short) 0);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node12, node17);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isThis(node12);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(node12);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(node12);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.containsType(node12, 5);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node6);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node6, (int) (short) 0);
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isAssign(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isExprCall(node13);
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node19);
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isAssign(node28);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isExprCall(node28);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isFunction(node28);
        int int33 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node28, (int) (byte) 10);
        com.google.javascript.rhino.Node[] nodeArray34 = new com.google.javascript.rhino.Node[] { node6, node13, node19, node24, node28 };
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList35 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList35, nodeArray34);
        com.google.javascript.rhino.Node node40 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node40);
        java.lang.String str42 = com.google.javascript.jscomp.NodeUtil.getSourceName(node40);
        com.google.javascript.rhino.FunctionNode functionNode45 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", (java.util.List<com.google.javascript.rhino.Node>) nodeList35, node40, (int) '#', 6);
        com.google.javascript.rhino.Node node49 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isAssign(node49);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isExprCall(node49);
        com.google.javascript.rhino.JSDocInfo jSDocInfo52 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node49);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node49);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node49);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey((com.google.javascript.rhino.Node) functionNode45, node49);
        com.google.javascript.rhino.Node node57 = com.google.javascript.jscomp.NodeUtil.newName("||", (com.google.javascript.rhino.Node) functionNode45, "hi!");
        com.google.javascript.rhino.Node node59 = com.google.javascript.jscomp.NodeUtil.newName("||", (com.google.javascript.rhino.Node) functionNode45, "instanceof");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean60 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node59);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Non-literal value: NAME || 35 [originalname: instanceof]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(nodeArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(functionNode45);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(jSDocInfo52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(node59);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node4);
        java.lang.String str6 = com.google.javascript.jscomp.NodeUtil.getSourceName(node4);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getStringValue(node4);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", node4, "");
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isNodeTypeReferenced(node4, (int) (short) 100);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node4);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node4);
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node17);
        java.lang.String str19 = com.google.javascript.jscomp.NodeUtil.getSourceName(node17);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node17);
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        com.google.javascript.rhino.Node node29 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isAssign(node29);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isExprCall(node29);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isGet(node29);
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newName("^", node29);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isLhs(node24, node33);
        com.google.javascript.rhino.Node node38 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node38);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node38, (int) (short) 0);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node33, node38);
        com.google.javascript.rhino.Node node46 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node46);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isAssign(node46);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node46, "hi!");
        com.google.javascript.rhino.Node node55 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean56 = com.google.javascript.jscomp.NodeUtil.isAssign(node55);
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.isExprCall(node55);
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.isGet(node55);
        com.google.javascript.rhino.Node node59 = com.google.javascript.jscomp.NodeUtil.newName("^", node55);
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node46, node59);
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.referencesThis(node46);
        boolean boolean62 = com.google.javascript.jscomp.NodeUtil.isAssign(node46);
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.referencesThis(node46);
        com.google.javascript.rhino.Node node67 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean68 = com.google.javascript.jscomp.NodeUtil.isAssign(node67);
        boolean boolean69 = com.google.javascript.jscomp.NodeUtil.isExprCall(node67);
        java.lang.String[] strArray71 = new java.lang.String[] { "^" };
        java.util.LinkedHashSet<java.lang.String> strSet72 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet72, strArray71);
        boolean boolean74 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node67, (java.util.Set<java.lang.String>) strSet72);
        boolean boolean75 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node46, (java.util.Set<java.lang.String>) strSet72);
        boolean boolean76 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node38, (java.util.Set<java.lang.String>) strSet72);
        boolean boolean77 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node17, (java.util.Set<java.lang.String>) strSet72);
        boolean boolean78 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node4, (java.util.Set<java.lang.String>) strSet72);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType81 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (byte) -1);
        boolean boolean82 = com.google.javascript.jscomp.NodeUtil.containsType(node4, (int) ' ', (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType81);
        int int84 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node4, "<=");
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertArrayEquals(strArray71, new java.lang.String[] { "^" });
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        com.google.javascript.rhino.Node node0 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode();
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isGet(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isAssign(node0);
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isAssign(node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isExprCall(node6);
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node6);
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isAssign(node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isExprCall(node18);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isGet(node18);
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newName("^", node18);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isLhs(node13, node22);
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode();
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node24, "");
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node24);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType30 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 0);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isNodeTypeReferenced(node24, 10, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType30);
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node35);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node35);
        com.google.javascript.rhino.Node node41 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        com.google.javascript.rhino.Node node46 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isAssign(node46);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isExprCall(node46);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.isGet(node46);
        com.google.javascript.rhino.Node node50 = com.google.javascript.jscomp.NodeUtil.newName("^", node46);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isLhs(node41, node50);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node35, node50);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node50, (int) (byte) 10);
        com.google.javascript.rhino.Node node59 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node59);
        java.lang.String str61 = com.google.javascript.jscomp.NodeUtil.getSourceName(node59);
        java.lang.String str62 = com.google.javascript.jscomp.NodeUtil.getStringValue(node59);
        com.google.javascript.rhino.Node node67 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean68 = com.google.javascript.jscomp.NodeUtil.isAssign(node67);
        boolean boolean69 = com.google.javascript.jscomp.NodeUtil.isExprCall(node67);
        com.google.javascript.rhino.Node node71 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", node67, "^");
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node59, node71);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType75 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 0);
        boolean boolean76 = com.google.javascript.jscomp.NodeUtil.containsType(node71, 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType75);
        boolean boolean77 = com.google.javascript.jscomp.NodeUtil.containsType(node50, (int) (byte) 10, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType75);
        boolean boolean78 = com.google.javascript.jscomp.NodeUtil.has(node13, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType30, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType75);
        int int79 = com.google.javascript.jscomp.NodeUtil.getCount(node6, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType75);
        int int80 = com.google.javascript.jscomp.NodeUtil.getCount(node0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType75);
        boolean boolean81 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node0);
        boolean boolean82 = com.google.javascript.jscomp.NodeUtil.isVar(node0);
        com.google.javascript.rhino.JSDocInfo jSDocInfo83 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node0);
        boolean boolean84 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node0);
        org.junit.Assert.assertNotNull(node0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSDocInfo9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNull(jSDocInfo83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node4, (int) (short) 0);
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isAssign(node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isExprCall(node11);
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node17);
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isAssign(node26);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isExprCall(node26);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isFunction(node26);
        int int31 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node26, (int) (byte) 10);
        com.google.javascript.rhino.Node[] nodeArray32 = new com.google.javascript.rhino.Node[] { node4, node11, node17, node22, node26 };
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList33 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList33, nodeArray32);
        com.google.javascript.rhino.Node node38 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node38);
        java.lang.String str40 = com.google.javascript.jscomp.NodeUtil.getSourceName(node38);
        com.google.javascript.rhino.FunctionNode functionNode43 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", (java.util.List<com.google.javascript.rhino.Node>) nodeList33, node38, (int) '#', 6);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isForIn(node38);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isFunctionAnonymous(node38);
        int int47 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node38, "hi!");
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(nodeArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(functionNode43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssign(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExprCall(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isFunction(node4);
        int int9 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node4, (int) (byte) 10);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isVar(node4);
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newName("$$constant", node4, "$$constant");
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node4);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isFunction(node4);
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node4);
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isAssign(node20);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node20, "hi!");
        com.google.javascript.rhino.Node node29 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isAssign(node29);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isExprCall(node29);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isGet(node29);
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newName("^", node29);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node20, node33);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isNew(node20);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isName(node20);
        com.google.javascript.rhino.Node node40 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node40);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isAssign(node40);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isName(node40);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node40);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node20, node40, "");
        com.google.javascript.rhino.Node node48 = com.google.javascript.jscomp.NodeUtil.newName("hi!", node20, "^");
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.isLhs(node4, node48);
        com.google.javascript.rhino.Node node53 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        com.google.javascript.rhino.Node node58 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.isAssign(node58);
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.isExprCall(node58);
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.isGet(node58);
        com.google.javascript.rhino.Node node62 = com.google.javascript.jscomp.NodeUtil.newName("^", node58);
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.isLhs(node53, node62);
        com.google.javascript.rhino.Node node67 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean68 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node67);
        boolean boolean70 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node67, (int) (short) 0);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node62, node67);
        boolean boolean72 = com.google.javascript.jscomp.NodeUtil.isThis(node62);
        boolean boolean73 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node62);
        boolean boolean74 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node62);
        boolean boolean75 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node4, node62);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(jSDocInfo15);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssign(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExprCall(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isFunction(node4);
        int int9 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node4, (int) (byte) 10);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isVar(node4);
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newName("$$constant", node4, "$$constant");
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node4);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isFunction(node4);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node4);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isAssign(node4);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isName(node4);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node4, (int) (short) 0);
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isAssign(node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isExprCall(node11);
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node17);
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isAssign(node26);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isExprCall(node26);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isFunction(node26);
        int int31 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node26, (int) (byte) 10);
        com.google.javascript.rhino.Node[] nodeArray32 = new com.google.javascript.rhino.Node[] { node4, node11, node17, node22, node26 };
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList33 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList33, nodeArray32);
        com.google.javascript.rhino.Node node38 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node38);
        java.lang.String str40 = com.google.javascript.jscomp.NodeUtil.getSourceName(node38);
        com.google.javascript.rhino.FunctionNode functionNode43 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", (java.util.List<com.google.javascript.rhino.Node>) nodeList33, node38, (int) '#', 6);
        com.google.javascript.rhino.Node node48 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node48);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isAssign(node48);
        com.google.javascript.rhino.Node node52 = com.google.javascript.jscomp.NodeUtil.newName("", node48, "");
        java.lang.String str53 = com.google.javascript.jscomp.NodeUtil.getFunctionName((com.google.javascript.rhino.Node) functionNode43, node48);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean54 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration((com.google.javascript.rhino.Node) functionNode43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(nodeArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(functionNode43);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isAssign(node5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isExprCall(node5);
        java.lang.String str8 = com.google.javascript.jscomp.NodeUtil.getSourceName(node5);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.containsCall(node5);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.containsType(node5, 0);
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", node5, "$$constant");
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isExprCall(node13);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.containsCall(node13);
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isAssign(node20);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node20);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node20);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node13, node20);
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node13);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node5);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getSourceName(node5);
        java.lang.String str8 = com.google.javascript.jscomp.NodeUtil.getStringValue(node5);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", node5, "");
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newVarNode("$$constant", node5);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node11);
        int int14 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node11, "Pure functions:\n\n");
        com.google.javascript.jscomp.NodeUtil.Visitor visitor15 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node19);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node19, (int) (short) 0);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node19);
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node28);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isAssign(node28);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node28, "hi!");
        com.google.javascript.rhino.Node node37 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isAssign(node37);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isExprCall(node37);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isGet(node37);
        com.google.javascript.rhino.Node node41 = com.google.javascript.jscomp.NodeUtil.newName("^", node37);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node28, node41);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.referencesThis(node28);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isAssign(node28);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType47 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType(1);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isNodeTypeReferenced(node28, 6, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType47);
        int int49 = matchNodeType47.type;
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isNodeTypeReferenced(node19, 15, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType47);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.NodeUtil.visitPostOrder(node11, visitor15, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isVar(node3);
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isNew(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isFunction(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isExprCall(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isGet(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node3, (int) (byte) 0);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node3);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isFunction(node3);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node3, "^");
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node5);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node5, (int) (short) 0);
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isAssign(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isExprCall(node12);
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node18);
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isAssign(node27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isExprCall(node27);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isFunction(node27);
        int int32 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node27, (int) (byte) 10);
        com.google.javascript.rhino.Node[] nodeArray33 = new com.google.javascript.rhino.Node[] { node5, node12, node18, node23, node27 };
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList34 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList34, nodeArray33);
        com.google.javascript.rhino.Node node39 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node39);
        java.lang.String str41 = com.google.javascript.jscomp.NodeUtil.getSourceName(node39);
        com.google.javascript.rhino.FunctionNode functionNode44 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", (java.util.List<com.google.javascript.rhino.Node>) nodeList34, node39, (int) '#', 6);
        com.google.javascript.rhino.Node node46 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("typeof", node39, "typeof");
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node46);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(nodeArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(functionNode44);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isExprCall(node3);
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node3);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isString(node3);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.containsCall(node3);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.containsFunctionDeclaration(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSDocInfo6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isAssign(node4);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node4, "hi!");
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isAssign(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isExprCall(node13);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isGet(node13);
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newName("^", node13);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node4, node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isNew(node4);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isName(node4);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.containsCall(node4);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isString(node4);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.containsCall(node4);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isCall(node4);
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("instanceof", node4, "%=");
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node26);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node5);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getSourceName(node5);
        java.lang.String str8 = com.google.javascript.jscomp.NodeUtil.getStringValue(node5);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", node5, "");
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newVarNode("$$constant", node5);
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isAssign(node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isExprCall(node16);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isFunction(node16);
        int int21 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node16, (int) (byte) 10);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isVar(node16);
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newName("$$constant", node16, "$$constant");
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node16);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node5, node16);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node16);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.containsFunctionDeclaration(node16);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node4);
        java.lang.String str6 = com.google.javascript.jscomp.NodeUtil.getSourceName(node4);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getStringValue(node4);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", node4, "");
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node9, "^");
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isAnonymousFunction(node9);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node9);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node9);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection15 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node9);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(nodeCollection15);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isExprCall(node3);
        java.lang.String str6 = com.google.javascript.jscomp.NodeUtil.getSourceName(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.containsFunctionDeclaration(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssign(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExprCall(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isFunction(node4);
        int int9 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node4, (int) (byte) 10);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newVarNode("$$constant", node4);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node10);
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newExpr(node10);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node13);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node3);
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isAssign(node14);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isExprCall(node14);
        java.lang.String str17 = com.google.javascript.jscomp.NodeUtil.getSourceName(node14);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.containsCall(node14);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.containsType(node14, 0);
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", node14, "$$constant");
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isExprCall(node22);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node3, node22);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.containsCall(node22);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("Pure functions:\n\n", (int) (byte) 0, (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node3);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate6 = null;
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node3, "Pure functions:\n\n", nodePredicate6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType1 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) '4');
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(node5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node5);
        boolean boolean8 = matchNodeType1.apply(node5);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node5);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node3, "hi!");
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isAssign(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isExprCall(node12);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isGet(node12);
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newName("^", node12);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node3, node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.referencesThis(node3);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType22 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType(1);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isNodeTypeReferenced(node3, 6, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType22);
        int int24 = matchNodeType22.type;
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isAssign(node28);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isExprCall(node28);
        com.google.javascript.rhino.JSDocInfo jSDocInfo31 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node28);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node28);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType35 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType(1);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node28, "hi!", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType35);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node28);
        boolean boolean38 = matchNodeType22.apply(node28);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.containsType(node28, 3);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node28);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(jSDocInfo31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) (short) 0, (int) (short) -1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isNew(node3);
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(jSDocInfo5);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", 9, 6);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isGet(node3);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isAssign(node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isExprCall(node10);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isFunction(node10);
        int int15 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node10, (int) (byte) 10);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isVar(node10);
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newName("$$constant", node10, "$$constant");
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node10);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isGetProp(node10);
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node24);
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isAssign(node35);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isExprCall(node35);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isGet(node35);
        com.google.javascript.rhino.Node node39 = com.google.javascript.jscomp.NodeUtil.newName("^", node35);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isLhs(node30, node39);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node24, node39);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node39, (int) (byte) 10);
        com.google.javascript.rhino.Node node48 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node48);
        java.lang.String str50 = com.google.javascript.jscomp.NodeUtil.getSourceName(node48);
        java.lang.String str51 = com.google.javascript.jscomp.NodeUtil.getStringValue(node48);
        com.google.javascript.rhino.Node node56 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.isAssign(node56);
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.isExprCall(node56);
        com.google.javascript.rhino.Node node60 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", node56, "^");
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node48, node60);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType64 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 0);
        boolean boolean65 = com.google.javascript.jscomp.NodeUtil.containsType(node60, 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType64);
        boolean boolean66 = com.google.javascript.jscomp.NodeUtil.containsType(node39, (int) (byte) 10, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType64);
        com.google.javascript.rhino.Node node73 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean74 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node73);
        java.lang.String str75 = com.google.javascript.jscomp.NodeUtil.getSourceName(node73);
        java.lang.String str76 = com.google.javascript.jscomp.NodeUtil.getStringValue(node73);
        com.google.javascript.rhino.Node node78 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", node73, "");
        com.google.javascript.rhino.Node node79 = com.google.javascript.jscomp.NodeUtil.newVarNode("$$constant", node73);
        com.google.javascript.rhino.Node node83 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean84 = com.google.javascript.jscomp.NodeUtil.isAssign(node83);
        com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(node83);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node73, node83);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType89 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (byte) -1);
        boolean boolean90 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node83, "", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType89);
        boolean boolean91 = com.google.javascript.jscomp.NodeUtil.containsType(node39, (int) '#', (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType89);
        int int92 = com.google.javascript.jscomp.NodeUtil.getCount(node10, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType89);
        boolean boolean93 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node3, "^", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType89);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNull(str75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node3, "hi!");
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isAssign(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isExprCall(node12);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isGet(node12);
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newName("^", node12);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node3, node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node16);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isString(node16);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node16);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isVar(node16);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node16);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isAssign(node5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isExprCall(node5);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", node5, "^");
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("<=", node5, "$$constant");
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node15);
        java.lang.String str17 = com.google.javascript.jscomp.NodeUtil.getSourceName(node15);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node15);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isGetProp(node15);
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.getLoopCodeBlock(node15);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node15, "||");
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node26);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isAssign(node26);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node26, "hi!");
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isAssign(node35);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isExprCall(node35);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isGet(node35);
        com.google.javascript.rhino.Node node39 = com.google.javascript.jscomp.NodeUtil.newName("^", node35);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node26, node39);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isNew(node26);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isName(node26);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.containsCall(node26);
        com.google.javascript.rhino.Node node47 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isAssign(node47);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.isExprCall(node47);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isGet(node47);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node47, (int) (byte) 0);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node47);
        com.google.javascript.rhino.Node node57 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node57);
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.isAssign(node57);
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node57, "hi!");
        com.google.javascript.rhino.Node node66 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean67 = com.google.javascript.jscomp.NodeUtil.isAssign(node66);
        boolean boolean68 = com.google.javascript.jscomp.NodeUtil.isExprCall(node66);
        boolean boolean69 = com.google.javascript.jscomp.NodeUtil.isGet(node66);
        com.google.javascript.rhino.Node node70 = com.google.javascript.jscomp.NodeUtil.newName("^", node66);
        boolean boolean71 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node57, node70);
        boolean boolean72 = com.google.javascript.jscomp.NodeUtil.referencesThis(node57);
        boolean boolean73 = com.google.javascript.jscomp.NodeUtil.isAssign(node57);
        boolean boolean74 = com.google.javascript.jscomp.NodeUtil.referencesThis(node57);
        com.google.javascript.rhino.Node node78 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean79 = com.google.javascript.jscomp.NodeUtil.isAssign(node78);
        boolean boolean80 = com.google.javascript.jscomp.NodeUtil.isExprCall(node78);
        java.lang.String[] strArray82 = new java.lang.String[] { "^" };
        java.util.LinkedHashSet<java.lang.String> strSet83 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet83, strArray82);
        boolean boolean85 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node78, (java.util.Set<java.lang.String>) strSet83);
        boolean boolean86 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node57, (java.util.Set<java.lang.String>) strSet83);
        boolean boolean87 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node47, (java.util.Set<java.lang.String>) strSet83);
        boolean boolean88 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node26, (java.util.Set<java.lang.String>) strSet83);
        boolean boolean89 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node15, (java.util.Set<java.lang.String>) strSet83);
        boolean boolean90 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node11, (java.util.Set<java.lang.String>) strSet83);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertArrayEquals(strArray82, new java.lang.String[] { "^" });
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node5);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getSourceName(node5);
        java.lang.String str8 = com.google.javascript.jscomp.NodeUtil.getStringValue(node5);
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isAssign(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isExprCall(node13);
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", node13, "^");
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node5, node17);
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("typeof", node5, "%=");
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isAssign(node24);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node24, "hi!");
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isAssign(node33);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isExprCall(node33);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isGet(node33);
        com.google.javascript.rhino.Node node37 = com.google.javascript.jscomp.NodeUtil.newName("^", node33);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node24, node37);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.referencesThis(node24);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isAssign(node24);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.referencesThis(node24);
        com.google.javascript.rhino.Node node45 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isAssign(node45);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isExprCall(node45);
        java.lang.String[] strArray49 = new java.lang.String[] { "^" };
        java.util.LinkedHashSet<java.lang.String> strSet50 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet50, strArray49);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node45, (java.util.Set<java.lang.String>) strSet50);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node24, (java.util.Set<java.lang.String>) strSet50);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node20, (java.util.Set<java.lang.String>) strSet50);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean55 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node0, (java.util.Set<java.lang.String>) strSet50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "^" });
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", 1, 6);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isCall(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = com.google.javascript.jscomp.NodeUtil.precedence(3);
            org.junit.Assert.fail("Expected exception of type java.lang.Error; message: Unknown precedence for leavewith (type 3)");
        } catch (java.lang.Error e) {
            // Expected exception.
        }
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isAssign(node4);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node4, "hi!");
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isAssign(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isExprCall(node13);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isGet(node13);
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newName("^", node13);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node4, node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node17);
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newName("||", node17, "%=");
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node17);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isAssign(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isExprCall(node8);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isGet(node8);
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newName("^", node8);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isLhs(node3, node12);
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node17);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node17, (int) (short) 0);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node12, node17);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isCall(node12);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isNew(node12);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = com.google.javascript.jscomp.NodeUtil.functionCallHasSideEffects(node12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected CALL node, got NAME");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node5);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getSourceName(node5);
        java.lang.String str8 = com.google.javascript.jscomp.NodeUtil.getStringValue(node5);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", node5, "");
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isConstantName(node5);
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node16);
        java.lang.String str18 = com.google.javascript.jscomp.NodeUtil.getSourceName(node16);
        java.lang.String str19 = com.google.javascript.jscomp.NodeUtil.getStringValue(node16);
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isAssign(node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isExprCall(node24);
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", node24, "^");
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node16, node28);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType32 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 0);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.containsType(node28, 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType32);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isNodeTypeReferenced(node5, (int) (byte) 1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType32);
        com.google.javascript.rhino.Node node38 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node38);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isAssign(node38);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node38, "hi!");
        com.google.javascript.rhino.Node node47 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isAssign(node47);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.isExprCall(node47);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isGet(node47);
        com.google.javascript.rhino.Node node51 = com.google.javascript.jscomp.NodeUtil.newName("^", node47);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node38, node51);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.isNew(node38);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.isName(node38);
        boolean boolean55 = matchNodeType32.apply(node38);
        boolean boolean56 = com.google.javascript.jscomp.NodeUtil.isExprCall(node38);
        com.google.javascript.rhino.Node node58 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("%=", node38, "^");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean59 = com.google.javascript.jscomp.NodeUtil.isFunctionAnonymous(node58);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(node58);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node4);
        java.lang.String str6 = com.google.javascript.jscomp.NodeUtil.getSourceName(node4);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getStringValue(node4);
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isAssign(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isExprCall(node12);
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", node12, "^");
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node4, node16);
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("typeof", node4, "%=");
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node4);
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isAssign(node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isExprCall(node24);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isGet(node24);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node24, (int) (byte) 0);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node24);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isFunction(node24);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node24, "^");
        com.google.javascript.rhino.JSDocInfo jSDocInfo34 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node24);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isName(node24);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node4, node24);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node24);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node24);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(jSDocInfo34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isAssign(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isExprCall(node8);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isGet(node8);
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newName("^", node8);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isLhs(node3, node12);
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node17);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node17, (int) (short) 0);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node12, node17);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node17);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node17);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node5);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getSourceName(node5);
        java.lang.String str8 = com.google.javascript.jscomp.NodeUtil.getStringValue(node5);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", node5, "");
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isNodeTypeReferenced(node5, (int) (short) 100);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node5);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node5);
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newName("^", node5);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node5, (int) (short) 1);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node5);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssign(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExprCall(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isGet(node4);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newName("^", node4);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isString(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node8);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isGet(node8);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType1 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType(1);
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isAssign(node5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isExprCall(node5);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isGet(node5);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node5, (int) (byte) 0);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node5);
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node15);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isAssign(node15);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node15, "hi!");
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isAssign(node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isExprCall(node24);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isGet(node24);
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newName("^", node24);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node15, node28);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.referencesThis(node15);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isAssign(node15);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.referencesThis(node15);
        com.google.javascript.rhino.Node node36 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isAssign(node36);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isExprCall(node36);
        java.lang.String[] strArray40 = new java.lang.String[] { "^" };
        java.util.LinkedHashSet<java.lang.String> strSet41 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet41, strArray40);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node36, (java.util.Set<java.lang.String>) strSet41);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node15, (java.util.Set<java.lang.String>) strSet41);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node5, (java.util.Set<java.lang.String>) strSet41);
        boolean boolean46 = matchNodeType1.apply(node5);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.containsType(node5, 1);
        com.google.javascript.rhino.Node node52 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        com.google.javascript.rhino.Node node57 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.isAssign(node57);
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.isExprCall(node57);
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.isGet(node57);
        com.google.javascript.rhino.Node node61 = com.google.javascript.jscomp.NodeUtil.newName("^", node57);
        boolean boolean62 = com.google.javascript.jscomp.NodeUtil.isLhs(node52, node61);
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.isForIn(node61);
        boolean boolean65 = com.google.javascript.jscomp.NodeUtil.isNodeTypeReferenced(node61, 0);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType67 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) '4');
        int int68 = com.google.javascript.jscomp.NodeUtil.getCount(node61, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType67);
        com.google.javascript.rhino.Node node72 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean73 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node72);
        boolean boolean74 = com.google.javascript.jscomp.NodeUtil.isAssign(node72);
        boolean boolean76 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node72, "hi!");
        com.google.javascript.rhino.Node node81 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean82 = com.google.javascript.jscomp.NodeUtil.isAssign(node81);
        boolean boolean83 = com.google.javascript.jscomp.NodeUtil.isExprCall(node81);
        boolean boolean84 = com.google.javascript.jscomp.NodeUtil.isGet(node81);
        com.google.javascript.rhino.Node node85 = com.google.javascript.jscomp.NodeUtil.newName("^", node81);
        boolean boolean86 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node72, node85);
        boolean boolean87 = matchNodeType67.apply(node72);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate88 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean89 = com.google.javascript.jscomp.NodeUtil.has(node5, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType67, nodePredicate88);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "^" });
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isName(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node3, (int) (short) 1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node3, "hi!");
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isAssign(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isExprCall(node12);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isGet(node12);
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newName("^", node12);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node3, node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isNew(node3);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isName(node3);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.containsCall(node3);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node3);
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node26);
        java.lang.String str28 = com.google.javascript.jscomp.NodeUtil.getSourceName(node26);
        java.lang.String str29 = com.google.javascript.jscomp.NodeUtil.getStringValue(node26);
        com.google.javascript.rhino.Node node34 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isAssign(node34);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isExprCall(node34);
        com.google.javascript.rhino.Node node38 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", node34, "^");
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node26, node38);
        com.google.javascript.rhino.Node node41 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("typeof", node26, "%=");
        com.google.javascript.rhino.Node node45 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node45);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isAssign(node45);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node45, "hi!");
        com.google.javascript.rhino.Node node54 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.isAssign(node54);
        boolean boolean56 = com.google.javascript.jscomp.NodeUtil.isExprCall(node54);
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.isGet(node54);
        com.google.javascript.rhino.Node node58 = com.google.javascript.jscomp.NodeUtil.newName("^", node54);
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node45, node58);
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.referencesThis(node45);
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.isAssign(node45);
        boolean boolean62 = com.google.javascript.jscomp.NodeUtil.referencesThis(node45);
        com.google.javascript.rhino.Node node66 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean67 = com.google.javascript.jscomp.NodeUtil.isAssign(node66);
        boolean boolean68 = com.google.javascript.jscomp.NodeUtil.isExprCall(node66);
        java.lang.String[] strArray70 = new java.lang.String[] { "^" };
        java.util.LinkedHashSet<java.lang.String> strSet71 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet71, strArray70);
        boolean boolean73 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node66, (java.util.Set<java.lang.String>) strSet71);
        boolean boolean74 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node45, (java.util.Set<java.lang.String>) strSet71);
        boolean boolean75 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node41, (java.util.Set<java.lang.String>) strSet71);
        boolean boolean76 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node3, (java.util.Set<java.lang.String>) strSet71);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertArrayEquals(strArray70, new java.lang.String[] { "^" });
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isAssign(node4);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node4, "hi!");
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isAssign(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isExprCall(node13);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isGet(node13);
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newName("^", node13);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node4, node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isNew(node4);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isName(node4);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.containsCall(node4);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isString(node4);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(node4);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node4);
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("%=", node4, "%=");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.getFunctionBody(node4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node26);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) ' ', 13);
        org.junit.Assert.assertNotNull(node3);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isExprCall(node3);
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isExprCall(node3);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node3);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.getFnParameters(node3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSDocInfo6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node3, "hi!");
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isAssign(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isExprCall(node12);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isGet(node12);
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newName("^", node12);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node3, node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.referencesThis(node3);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType22 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType(1);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isNodeTypeReferenced(node3, 6, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isAssign(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isExprCall(node8);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isGet(node8);
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newName("^", node8);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isLhs(node3, node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isForIn(node12);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isNodeTypeReferenced(node12, 0);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType18 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) '4');
        int int19 = com.google.javascript.jscomp.NodeUtil.getCount(node12, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType18);
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node23);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isAssign(node23);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node23, "hi!");
        com.google.javascript.rhino.Node node32 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isAssign(node32);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isExprCall(node32);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isGet(node32);
        com.google.javascript.rhino.Node node36 = com.google.javascript.jscomp.NodeUtil.newName("^", node32);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node23, node36);
        boolean boolean38 = matchNodeType18.apply(node23);
        int int39 = matchNodeType18.type;
        com.google.javascript.rhino.Node node44 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isAssign(node44);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isExprCall(node44);
        com.google.javascript.rhino.Node node48 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", node44, "^");
        boolean boolean49 = matchNodeType18.apply(node48);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType52 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 0);
        int int53 = matchNodeType52.type;
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.isNodeTypeReferenced(node48, (int) (short) -1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType52);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 52 + "'", int39 == 52);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isAssign(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isName(node4);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isConstantName(node4);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newName("$$constant", node4);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isGetProp(node9);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("||", (int) ' ', 1);
        org.junit.Assert.assertNotNull(node3);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssign(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExprCall(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isFunction(node4);
        int int9 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node4, (int) (byte) 10);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newVarNode("$$constant", node4);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isFunction(node4);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection12 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node4);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(nodeCollection12);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node4);
        java.lang.String str6 = com.google.javascript.jscomp.NodeUtil.getSourceName(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node4);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isGetProp(node4);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node4);
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", node4, "||");
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isAssign(node15);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isExprCall(node15);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isFunction(node15);
        int int20 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node15, (int) (byte) 10);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node15);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node15);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node4, node15, "^");
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node30);
        java.lang.String str32 = com.google.javascript.jscomp.NodeUtil.getSourceName(node30);
        java.lang.String str33 = com.google.javascript.jscomp.NodeUtil.getStringValue(node30);
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", node30, "");
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isConstantName(node30);
        com.google.javascript.rhino.Node node40 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node40);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isAssign(node40);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(node40);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isName(node40);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node30, node40);
        com.google.javascript.rhino.Node node46 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node40);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isStatement(node40);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node15, node40);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.isForIn(node15);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node15);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.containsType(node15, (int) ' ');
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.containsCall(node15);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        com.google.javascript.rhino.Node node0 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode();
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isAssign(node5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isExprCall(node5);
        com.google.javascript.rhino.JSDocInfo jSDocInfo8 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node5);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node5);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isFunction(node5);
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node15);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node15);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node15);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node15);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node15);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node15);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType23 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 0);
        int int24 = matchNodeType23.type;
        int int25 = com.google.javascript.jscomp.NodeUtil.getCount(node15, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType23);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node5, "%=", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType23);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node0, "%=", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType23);
        java.lang.String str28 = com.google.javascript.jscomp.NodeUtil.getSourceName(node0);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isLabelName(node0);
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", (int) (byte) -1, (int) (short) 100);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isFunction(node33);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.NodeUtil.removeChild(node0, node33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Invalid attempt to remove node: NAME ^ of VOID");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node0);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSDocInfo8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isThis(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("||", (int) '#', 9);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.google.javascript.jscomp.NodeUtil.tryMergeBlock(node3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node10);
        java.lang.String str12 = com.google.javascript.jscomp.NodeUtil.getSourceName(node10);
        java.lang.String str13 = com.google.javascript.jscomp.NodeUtil.getStringValue(node10);
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", node10, "");
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newVarNode("$$constant", node10);
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isAssign(node20);
        com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(node20);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node10, node20);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node20);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node3, node20);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(node20);
        java.lang.String str27 = com.google.javascript.jscomp.NodeUtil.getSourceName(node20);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = com.google.javascript.jscomp.NodeUtil.tryMergeBlock(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node3);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isAssign(node14);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isExprCall(node14);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isGet(node14);
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newName("^", node14);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isLhs(node9, node18);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node3, node18);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node18, (int) (byte) 10);
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node27);
        java.lang.String str29 = com.google.javascript.jscomp.NodeUtil.getSourceName(node27);
        java.lang.String str30 = com.google.javascript.jscomp.NodeUtil.getStringValue(node27);
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isAssign(node35);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isExprCall(node35);
        com.google.javascript.rhino.Node node39 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", node35, "^");
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node27, node39);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType43 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 0);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.containsType(node39, 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType43);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.containsType(node18, (int) (byte) 10, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType43);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node18);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean47 = com.google.javascript.jscomp.NodeUtil.constructorCallHasSideEffects(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected NEW node, got NAME");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node3);
        com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node4);
        java.lang.String str6 = com.google.javascript.jscomp.NodeUtil.getSourceName(node4);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getStringValue(node4);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", node4, "");
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isNodeTypeReferenced(node4, (int) (short) 100);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node4);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node4);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isVar(node4);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node4);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node4, "%=");
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.getLoopCodeBlock(node4);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isAssign(node4);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newName("", node4, "");
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node4);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node4, 10);
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node15);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isAssign(node15);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node15, "hi!");
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isAssign(node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isExprCall(node24);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isGet(node24);
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newName("^", node24);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node15, node28);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isNew(node15);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isName(node15);
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node35);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isAssign(node35);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isName(node35);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node35);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node15, node35, "");
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node4, node35);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node4);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isFunction(node4);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isAssign(node4);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newName("", node4, "");
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node4);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node4);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node4);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.DefinitionProvider definitionProvider1 = null;
        com.google.javascript.jscomp.PureFunctionIdentifier pureFunctionIdentifier2 = new com.google.javascript.jscomp.PureFunctionIdentifier(abstractCompiler0, definitionProvider1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isAssign(node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isExprCall(node7);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isFunction(node7);
        int int12 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node7, (int) (byte) 10);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isVar(node7);
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newName("$$constant", node7, "$$constant");
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node7);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isFunction(node7);
        com.google.javascript.rhino.JSDocInfo jSDocInfo18 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node7);
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node23);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isAssign(node23);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node23, "hi!");
        com.google.javascript.rhino.Node node32 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isAssign(node32);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isExprCall(node32);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isGet(node32);
        com.google.javascript.rhino.Node node36 = com.google.javascript.jscomp.NodeUtil.newName("^", node32);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node23, node36);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isNew(node23);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isName(node23);
        com.google.javascript.rhino.Node node43 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node43);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isAssign(node43);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isName(node43);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node43);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node23, node43, "");
        com.google.javascript.rhino.Node node51 = com.google.javascript.jscomp.NodeUtil.newName("hi!", node23, "^");
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isLhs(node7, node51);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType55 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) '4');
        com.google.javascript.rhino.Node node59 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(node59);
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node59);
        boolean boolean62 = matchNodeType55.apply(node59);
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node7, "hi!", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType55);
        com.google.javascript.rhino.Node node67 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean68 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node67);
        boolean boolean69 = com.google.javascript.jscomp.NodeUtil.isAssign(node67);
        boolean boolean70 = com.google.javascript.jscomp.NodeUtil.isName(node67);
        boolean boolean71 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node67);
        boolean boolean72 = com.google.javascript.jscomp.NodeUtil.isThis(node67);
        pureFunctionIdentifier2.process(node7, node67);
        java.lang.String str74 = pureFunctionIdentifier2.getDebugReport();
        java.lang.String str75 = pureFunctionIdentifier2.getDebugReport();
        java.lang.String str76 = pureFunctionIdentifier2.getDebugReport();
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(jSDocInfo18);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "Pure functions:\n\n" + "'", str74, "Pure functions:\n\n");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "Pure functions:\n\n" + "'", str75, "Pure functions:\n\n");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "Pure functions:\n\n" + "'", str76, "Pure functions:\n\n");
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isAssign(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isExprCall(node8);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isGet(node8);
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newName("^", node8);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isLhs(node3, node12);
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node3);
        java.lang.String str15 = com.google.javascript.jscomp.NodeUtil.getSourceName(node14);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssign(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExprCall(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isFunction(node4);
        int int9 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node4, (int) (byte) 10);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isForIn(node4);
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node4);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(node4);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.referencesThis(node4);
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isLhs(node4, node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node4);
        java.lang.String str6 = com.google.javascript.jscomp.NodeUtil.getSourceName(node4);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getStringValue(node4);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", node4, "");
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isNodeTypeReferenced(node4, (int) (short) 100);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node4);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node4);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isVar(node4);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node4);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node4, "%=");
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node4);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isAssign(node5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isExprCall(node5);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", node5, "^");
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isExprCall(node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node9);
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("Pure functions:\n\n", node9, "<=");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isExprCall(node3);
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node3);
        com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(node3);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection10 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Non-literal value: NAME  97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSDocInfo6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeCollection10);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node4);
        java.lang.String str6 = com.google.javascript.jscomp.NodeUtil.getSourceName(node4);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getStringValue(node4);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", node4, "");
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node9);
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node14);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node14);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node14);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node14);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node14);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.containsFunctionDeclaration(node14);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node9, node14);
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isAssign(node26);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isExprCall(node26);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isFunction(node26);
        int int31 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node26, (int) (byte) 10);
        com.google.javascript.rhino.Node node32 = com.google.javascript.jscomp.NodeUtil.newVarNode("$$constant", node26);
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.getAssignedValue(node26);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.NodeUtil.removeChild(node14, node26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Invalid attempt to remove node: NAME  97 of NAME  97");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNull(node33);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node5);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getSourceName(node5);
        java.lang.String str8 = com.google.javascript.jscomp.NodeUtil.getStringValue(node5);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", node5, "");
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newVarNode("$$constant", node5);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isFunctionAnonymous(node5);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node5);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.referencesThis(node5);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isFunction(node5);
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isAssign(node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isExprCall(node24);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isGet(node24);
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newName("^", node24);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isLhs(node19, node28);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node28);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isLhs(node5, node28);
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node35);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isAssign(node35);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node35, "hi!");
        com.google.javascript.rhino.Node node44 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isAssign(node44);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isExprCall(node44);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isGet(node44);
        com.google.javascript.rhino.Node node48 = com.google.javascript.jscomp.NodeUtil.newName("^", node44);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node35, node48);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isNew(node35);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isName(node35);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.referencesThis(node35);
        int int54 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node35, (int) (short) 0);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.referencesThis(node35);
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node35, "|");
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.isLhs(node28, node35);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType1 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) '4');
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node7);
        java.lang.String str9 = com.google.javascript.jscomp.NodeUtil.getSourceName(node7);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node7);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isGetProp(node7);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node7);
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", node7, "||");
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isAssign(node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isExprCall(node18);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isFunction(node18);
        int int23 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node18, (int) (byte) 10);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node18);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node18);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node7, node18, "^");
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newVarNode("$$constant", node7);
        boolean boolean29 = matchNodeType1.apply(node28);
        int int30 = matchNodeType1.type;
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssign(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExprCall(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isGet(node4);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node4);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node4);
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("<=", node4, "typeof");
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(node4);
        com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(node4);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newName("<=", node4, "typeof");
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isExprCall(node3);
        java.lang.String[] strArray7 = new java.lang.String[] { "^" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node3, (java.util.Set<java.lang.String>) strSet8);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "^" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isAssign(node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isExprCall(node9);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isGet(node9);
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newName("^", node9);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isLhs(node4, node13);
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node18);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node18, (int) (short) 0);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node13, node18);
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newName("", node13, "$$constant");
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node28);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isAssign(node28);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isAnonymousFunction(node28);
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("||", 100, (int) (byte) -1);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isNodeTypeReferenced(node35, 100);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isLhs(node28, node35);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node24, node35);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isForIn(node35);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isVar(node3);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node9);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node9);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node3, node9);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node3, "||");
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isExprCall(node3);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node3, (int) (short) 10);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Non-literal value: NAME  97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", 6, 0);
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isAssign(node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isExprCall(node7);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isGet(node7);
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isAssign(node19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isExprCall(node19);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isGet(node19);
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newName("^", node19);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isLhs(node14, node23);
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node28);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node28, (int) (short) 0);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node23, node28);
        com.google.javascript.rhino.Node node36 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node36);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isAssign(node36);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node36, "hi!");
        com.google.javascript.rhino.Node node45 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isAssign(node45);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isExprCall(node45);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isGet(node45);
        com.google.javascript.rhino.Node node49 = com.google.javascript.jscomp.NodeUtil.newName("^", node45);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node36, node49);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.referencesThis(node36);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isAssign(node36);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.referencesThis(node36);
        com.google.javascript.rhino.Node node57 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.isAssign(node57);
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.isExprCall(node57);
        java.lang.String[] strArray61 = new java.lang.String[] { "^" };
        java.util.LinkedHashSet<java.lang.String> strSet62 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet62, strArray61);
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node57, (java.util.Set<java.lang.String>) strSet62);
        boolean boolean65 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node36, (java.util.Set<java.lang.String>) strSet62);
        boolean boolean66 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node28, (java.util.Set<java.lang.String>) strSet62);
        boolean boolean67 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node7, (java.util.Set<java.lang.String>) strSet62);
        boolean boolean68 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node3, (java.util.Set<java.lang.String>) strSet62);
        boolean boolean69 = com.google.javascript.jscomp.NodeUtil.isThis(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertArrayEquals(strArray61, new java.lang.String[] { "^" });
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        java.lang.String str1 = com.google.javascript.jscomp.NodeUtil.opToStrNoFail((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "||" + "'", str1, "||");
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isAssign(node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isExprCall(node9);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isGet(node9);
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newName("^", node9);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isLhs(node4, node13);
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node18);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node18, (int) (short) 0);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node13, node18);
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newName("", node13, "$$constant");
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node28);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isAssign(node28);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isAnonymousFunction(node28);
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("||", 100, (int) (byte) -1);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isNodeTypeReferenced(node35, 100);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isLhs(node28, node35);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node24, node35);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node24);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.containsType(node24, 9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean43 = com.google.javascript.jscomp.NodeUtil.hasFinally(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node3, (int) (short) 0);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node3, (int) 'a');
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isAssign(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isExprCall(node13);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isFunction(node13);
        int int18 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node13, (int) (byte) 10);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isForIn(node13);
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node13);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node3, node13);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node13);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node13, "");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isAssign(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isName(node4);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isConstantName(node4);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newName("$$constant", node4);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isThis(node9);
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node16);
        java.lang.String str18 = com.google.javascript.jscomp.NodeUtil.getSourceName(node16);
        java.lang.String str19 = com.google.javascript.jscomp.NodeUtil.getStringValue(node16);
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", node16, "");
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isConstantName(node16);
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node26);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isAssign(node26);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(node26);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isName(node26);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node16, node26);
        com.google.javascript.rhino.Node node32 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node26);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isStatement(node26);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isLhs(node9, node26);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node26);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node26);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.containsType(node26, (int) (short) 1);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node26);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node3, "hi!");
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isAssign(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isExprCall(node12);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isGet(node12);
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newName("^", node12);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node3, node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isNew(node3);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isName(node3);
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node23);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isAssign(node23);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isName(node23);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node23);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node3, node23, "");
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(node3);
        java.lang.String str31 = com.google.javascript.jscomp.NodeUtil.getStringValue(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node3);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType10 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (byte) -1);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isNodeTypeReferenced(node3, (int) (short) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType10);
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(node15);
        com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(node15);
        boolean boolean18 = matchNodeType10.apply(node15);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isForIn(node15);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node15);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssign(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExprCall(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isFunction(node4);
        int int9 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node4, (int) (byte) 10);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isVar(node4);
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newName("$$constant", node4, "$$constant");
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node4);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node4);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node4, (int) (byte) 100);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isExprCall(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isFunction(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isGetProp(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node3);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType12 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType(52);
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isAssign(node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isExprCall(node17);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isGet(node17);
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newName("^", node17);
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node26);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isAssign(node26);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node26, "hi!");
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isAssign(node35);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isExprCall(node35);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isGet(node35);
        com.google.javascript.rhino.Node node39 = com.google.javascript.jscomp.NodeUtil.newName("^", node35);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node26, node39);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.referencesThis(node26);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isAssign(node26);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType45 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType(1);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isNodeTypeReferenced(node26, 6, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType45);
        int int47 = matchNodeType45.type;
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isNodeTypeReferenced(node21, (int) (byte) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType45);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.has(node3, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType12, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType45);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node3);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.containsType(node3, 0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node5);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getSourceName(node5);
        java.lang.String str8 = com.google.javascript.jscomp.NodeUtil.getStringValue(node5);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", node5, "");
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newVarNode("$$constant", node5);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isThis(node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node11);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isAssign(node5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isExprCall(node5);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isGet(node5);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newName("^", node5);
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node14);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isAssign(node14);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node14, "hi!");
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isAssign(node23);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isExprCall(node23);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isGet(node23);
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newName("^", node23);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node14, node27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.referencesThis(node14);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isAssign(node14);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType33 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType(1);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isNodeTypeReferenced(node14, 6, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType33);
        int int35 = matchNodeType33.type;
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isNodeTypeReferenced(node9, (int) (byte) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType33);
        com.google.javascript.rhino.Node node38 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", node9, "");
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node9);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssign(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExprCall(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isFunction(node4);
        int int9 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node4, (int) (byte) 10);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isVar(node4);
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newName("$$constant", node4, "$$constant");
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node4);
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node4);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node4);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isAssign(node4);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isAssign(node5);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node5, "hi!");
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isAssign(node14);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isExprCall(node14);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isGet(node14);
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newName("^", node14);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node5, node18);
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", node5, "undefined");
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node21);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.google.javascript.jscomp.NodeUtil.tryMergeBlock(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isAssign(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isExprCall(node8);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isGet(node8);
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newName("^", node8);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isLhs(node3, node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isForIn(node12);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isNodeTypeReferenced(node12, 0);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node12);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isExprCall(node3);
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node3);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isString(node3);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isFunction(node3);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isVar(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSDocInfo6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node3);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType10 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (byte) -1);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isNodeTypeReferenced(node3, (int) (short) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType10);
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(node15);
        com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(node15);
        boolean boolean18 = matchNodeType10.apply(node15);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isForIn(node15);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isCall(node15);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node5);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getSourceName(node5);
        java.lang.String str8 = com.google.javascript.jscomp.NodeUtil.getStringValue(node5);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", node5, "");
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isNodeTypeReferenced(node5, (int) (short) 100);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node5);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node5);
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newName("^", node5);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(node15);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isAssign(node15);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node15);
        com.google.javascript.jscomp.NodeUtil.Visitor visitor19 = null;
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        com.google.javascript.rhino.Node node29 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isAssign(node29);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isExprCall(node29);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isGet(node29);
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newName("^", node29);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isLhs(node24, node33);
        com.google.javascript.rhino.Node node38 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node38);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node38, (int) (short) 0);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node33, node38);
        com.google.javascript.rhino.Node node44 = com.google.javascript.jscomp.NodeUtil.newName("", node33, "$$constant");
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType47 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType(100);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node44, "$$constant", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType47);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.NodeUtil.visitPreOrder(node15, visitor19, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node6);
        java.lang.String str8 = com.google.javascript.jscomp.NodeUtil.getSourceName(node6);
        java.lang.String str9 = com.google.javascript.jscomp.NodeUtil.getStringValue(node6);
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", node6, "");
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isNodeTypeReferenced(node6, (int) (short) 100);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node6);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node6);
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newName("^", node6);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(node16);
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newVarNode("Pure functions:\n\n", node16);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node5);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getSourceName(node5);
        java.lang.String str8 = com.google.javascript.jscomp.NodeUtil.getStringValue(node5);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", node5, "");
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newVarNode("$$constant", node5);
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isAssign(node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isExprCall(node16);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isFunction(node16);
        int int21 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node16, (int) (byte) 10);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isVar(node16);
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newName("$$constant", node16, "$$constant");
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node16);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node5, node16);
        java.lang.String str27 = com.google.javascript.jscomp.NodeUtil.getStringValue(node16);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler28 = null;
        com.google.javascript.jscomp.DefinitionProvider definitionProvider29 = null;
        com.google.javascript.jscomp.PureFunctionIdentifier pureFunctionIdentifier30 = new com.google.javascript.jscomp.PureFunctionIdentifier(abstractCompiler28, definitionProvider29);
        com.google.javascript.rhino.Node node34 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        com.google.javascript.rhino.Node node39 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isAssign(node39);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isExprCall(node39);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isGet(node39);
        com.google.javascript.rhino.Node node43 = com.google.javascript.jscomp.NodeUtil.newName("^", node39);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isLhs(node34, node43);
        com.google.javascript.rhino.Node node48 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node48);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isAssign(node48);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node48, "hi!");
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node48);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.isThis(node48);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(node48);
        pureFunctionIdentifier30.process(node34, node48);
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.isLhs(node16, node48);
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node16);
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.isCall(node16);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssign(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExprCall(node4);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getSourceName(node4);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.containsCall(node4);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.containsType(node4, 0);
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", node4, "$$constant");
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isExprCall(node12);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType16 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) '4');
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node20);
        boolean boolean23 = matchNodeType16.apply(node20);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node20);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node12, node20);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node3);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType11 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 0);
        int int12 = matchNodeType11.type;
        int int13 = com.google.javascript.jscomp.NodeUtil.getCount(node3, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType11);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType16 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) -1);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isNodeTypeReferenced(node3, 8, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType16);
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node23);
        java.lang.String str25 = com.google.javascript.jscomp.NodeUtil.getSourceName(node23);
        java.lang.String str26 = com.google.javascript.jscomp.NodeUtil.getStringValue(node23);
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", node23, "");
        com.google.javascript.rhino.Node node29 = com.google.javascript.jscomp.NodeUtil.newVarNode("$$constant", node23);
        int int31 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node29, "%=");
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isLhs(node3, node29);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isExprCall(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isFunction(node3);
        int int8 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node3, (int) (byte) 10);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node3);
        java.lang.String str10 = com.google.javascript.jscomp.NodeUtil.getStringValue(node3);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isGetProp(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", (int) (byte) -1, (int) (short) 100);
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node5);
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.getLoopCodeBlock(node5);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssign(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExprCall(node4);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", node4, "^");
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node4);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isForIn(node4);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isString(node4);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isAssign(node4);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newName("", node4, "");
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node4);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node4, 10);
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node15);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isAssign(node15);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node15, "hi!");
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isAssign(node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isExprCall(node24);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isGet(node24);
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newName("^", node24);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node15, node28);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isNew(node15);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isName(node15);
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node35);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isAssign(node35);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isName(node35);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node35);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node15, node35, "");
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node4, node35);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.containsType(node35, 3);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isFunction(node35);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.DefinitionProvider definitionProvider1 = null;
        com.google.javascript.jscomp.PureFunctionIdentifier pureFunctionIdentifier2 = new com.google.javascript.jscomp.PureFunctionIdentifier(abstractCompiler0, definitionProvider1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isAssign(node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isExprCall(node7);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isFunction(node7);
        int int12 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node7, (int) (byte) 10);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isVar(node7);
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newName("$$constant", node7, "$$constant");
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node7);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isFunction(node7);
        com.google.javascript.rhino.JSDocInfo jSDocInfo18 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node7);
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node23);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isAssign(node23);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node23, "hi!");
        com.google.javascript.rhino.Node node32 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isAssign(node32);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isExprCall(node32);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isGet(node32);
        com.google.javascript.rhino.Node node36 = com.google.javascript.jscomp.NodeUtil.newName("^", node32);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node23, node36);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isNew(node23);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isName(node23);
        com.google.javascript.rhino.Node node43 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node43);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isAssign(node43);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isName(node43);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node43);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node23, node43, "");
        com.google.javascript.rhino.Node node51 = com.google.javascript.jscomp.NodeUtil.newName("hi!", node23, "^");
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isLhs(node7, node51);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType55 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) '4');
        com.google.javascript.rhino.Node node59 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(node59);
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node59);
        boolean boolean62 = matchNodeType55.apply(node59);
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node7, "hi!", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType55);
        com.google.javascript.rhino.Node node67 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean68 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node67);
        boolean boolean69 = com.google.javascript.jscomp.NodeUtil.isAssign(node67);
        boolean boolean70 = com.google.javascript.jscomp.NodeUtil.isName(node67);
        boolean boolean71 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node67);
        boolean boolean72 = com.google.javascript.jscomp.NodeUtil.isThis(node67);
        pureFunctionIdentifier2.process(node7, node67);
        boolean boolean74 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node67);
        boolean boolean75 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node67);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(jSDocInfo18);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode();
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", node1, "$$constant");
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isVar(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isVar(node3);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node5);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getSourceName(node5);
        java.lang.String str8 = com.google.javascript.jscomp.NodeUtil.getStringValue(node5);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", node5, "");
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newVarNode("$$constant", node5);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isFunctionAnonymous(node5);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node5);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.referencesThis(node5);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isFunction(node5);
        com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(node5);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isVar(node5);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isVar(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isVar(node3);
        int int8 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node3, "instanceof");
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node6);
        java.lang.String str8 = com.google.javascript.jscomp.NodeUtil.getSourceName(node6);
        java.lang.String str9 = com.google.javascript.jscomp.NodeUtil.getStringValue(node6);
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", node6, "");
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newVarNode("$$constant", node6);
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isAssign(node16);
        com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(node16);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node6, node16);
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newName("||", node16, "");
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node16);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isVarArgsFunction(node3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isExprCall(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isGet(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node3, (int) (byte) 0);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node3);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node3);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isName(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isAssign(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isExprCall(node8);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isGet(node8);
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newName("^", node8);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isLhs(node3, node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isForIn(node12);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isNodeTypeReferenced(node12, 0);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isStatement(node12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isAssign(node5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isExprCall(node5);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", node5, "^");
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isExprCall(node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node9);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.containsFunctionDeclaration(node9);
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", node9, "|");
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node14);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssign(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExprCall(node4);
        com.google.javascript.rhino.JSDocInfo jSDocInfo7 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node4);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node4);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType11 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType(1);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node4, "hi!", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node4);
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newName("hi!", node4, "^");
        java.lang.String str16 = com.google.javascript.jscomp.NodeUtil.getSourceName(node15);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(jSDocInfo7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssign(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExprCall(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isFunction(node4);
        int int9 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node4, (int) (byte) 10);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newVarNode("$$constant", node4);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node10);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node10);
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node19);
        java.lang.String str21 = com.google.javascript.jscomp.NodeUtil.getSourceName(node19);
        java.lang.String str22 = com.google.javascript.jscomp.NodeUtil.getStringValue(node19);
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", node19, "");
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newVarNode("$$constant", node19);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isFunctionAnonymous(node19);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node19);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.referencesThis(node19);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isFunction(node19);
        java.lang.String str30 = com.google.javascript.jscomp.NodeUtil.getFunctionName(node10, node19);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.containsCall(node10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isVarArgsFunction(node10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node5);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getSourceName(node5);
        java.lang.String str8 = com.google.javascript.jscomp.NodeUtil.getStringValue(node5);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", node5, "");
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newVarNode("$$constant", node5);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node11);
        int int14 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node11, "Pure functions:\n\n");
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node11, "instanceof");
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isCall(node11);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssign(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExprCall(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isFunction(node4);
        int int9 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node4, (int) (byte) 10);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isForIn(node4);
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node4);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(node4);
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.getAssignedValue(node4);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        com.google.javascript.rhino.Node node0 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode();
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node0, "");
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node0);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node0, "$$constant");
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isGet(node0);
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node12);
        java.lang.String str14 = com.google.javascript.jscomp.NodeUtil.getSourceName(node12);
        java.lang.String str15 = com.google.javascript.jscomp.NodeUtil.getStringValue(node12);
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", node12, "");
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newVarNode("$$constant", node12);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isFunctionAnonymous(node12);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node0, node12);
        org.junit.Assert.assertNotNull(node0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node5);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getSourceName(node5);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node5);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isGetProp(node5);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node5);
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", node5, "||");
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isAssign(node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isExprCall(node16);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isFunction(node16);
        int int21 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node16, (int) (byte) 10);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node16);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node16);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node5, node16, "^");
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newVarNode("$$constant", node5);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isString(node5);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", (int) (byte) 0, 10);
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) 10, 0);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.containsCall(node7);
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", 6, 0);
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isAssign(node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isExprCall(node16);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isGet(node16);
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isAssign(node28);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isExprCall(node28);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isGet(node28);
        com.google.javascript.rhino.Node node32 = com.google.javascript.jscomp.NodeUtil.newName("^", node28);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isLhs(node23, node32);
        com.google.javascript.rhino.Node node37 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node37);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node37, (int) (short) 0);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node32, node37);
        com.google.javascript.rhino.Node node45 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node45);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isAssign(node45);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node45, "hi!");
        com.google.javascript.rhino.Node node54 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.isAssign(node54);
        boolean boolean56 = com.google.javascript.jscomp.NodeUtil.isExprCall(node54);
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.isGet(node54);
        com.google.javascript.rhino.Node node58 = com.google.javascript.jscomp.NodeUtil.newName("^", node54);
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node45, node58);
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.referencesThis(node45);
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.isAssign(node45);
        boolean boolean62 = com.google.javascript.jscomp.NodeUtil.referencesThis(node45);
        com.google.javascript.rhino.Node node66 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean67 = com.google.javascript.jscomp.NodeUtil.isAssign(node66);
        boolean boolean68 = com.google.javascript.jscomp.NodeUtil.isExprCall(node66);
        java.lang.String[] strArray70 = new java.lang.String[] { "^" };
        java.util.LinkedHashSet<java.lang.String> strSet71 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet71, strArray70);
        boolean boolean73 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node66, (java.util.Set<java.lang.String>) strSet71);
        boolean boolean74 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node45, (java.util.Set<java.lang.String>) strSet71);
        boolean boolean75 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node37, (java.util.Set<java.lang.String>) strSet71);
        boolean boolean76 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node16, (java.util.Set<java.lang.String>) strSet71);
        boolean boolean77 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node12, (java.util.Set<java.lang.String>) strSet71);
        boolean boolean78 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node7, (java.util.Set<java.lang.String>) strSet71);
        com.google.javascript.rhino.Node node79 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean80 = com.google.javascript.jscomp.NodeUtil.isLhs(node3, node79);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertArrayEquals(strArray70, new java.lang.String[] { "^" });
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNull(node79);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isAssign(node5);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node5, "hi!");
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isAssign(node14);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isExprCall(node14);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isGet(node14);
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newName("^", node14);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node5, node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node18);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isString(node18);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node18);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isVar(node18);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isThis(node18);
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("$$constant", node18, "$$constant");
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newVarNode("|", node26);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node27);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node5);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getSourceName(node5);
        java.lang.String str8 = com.google.javascript.jscomp.NodeUtil.getStringValue(node5);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", node5, "");
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newVarNode("$$constant", node5);
        int int13 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node11, "%=");
        java.lang.String str14 = com.google.javascript.jscomp.NodeUtil.getStringValue(node11);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node11);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssign(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExprCall(node4);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getSourceName(node4);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.containsCall(node4);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.containsType(node4, 0);
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", node4, "$$constant");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.google.javascript.jscomp.NodeUtil.functionCallHasSideEffects(node4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected CALL node, got NAME");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node4);
        java.lang.String str6 = com.google.javascript.jscomp.NodeUtil.getSourceName(node4);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getStringValue(node4);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", node4, "");
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node4, "Pure functions:\n\n");
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isFunction(node4);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isFunction(node4);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection14 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node4);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(nodeCollection14);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isAssign(node5);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node5, "hi!");
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isAssign(node14);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isExprCall(node14);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isGet(node14);
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newName("^", node14);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node5, node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isNew(node5);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isName(node5);
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node25);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isAssign(node25);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isName(node25);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node25);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node5, node25, "");
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newName("hi!", node5, "^");
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isGet(node5);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isForIn(node5);
        com.google.javascript.rhino.Node node36 = com.google.javascript.jscomp.NodeUtil.newVarNode("instanceof", node5);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node36);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        com.google.javascript.rhino.Node node0 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode();
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isGet(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isAssign(node0);
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isAssign(node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isExprCall(node6);
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node6);
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isAssign(node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isExprCall(node18);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isGet(node18);
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newName("^", node18);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isLhs(node13, node22);
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode();
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node24, "");
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node24);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType30 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 0);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isNodeTypeReferenced(node24, 10, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType30);
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node35);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node35);
        com.google.javascript.rhino.Node node41 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        com.google.javascript.rhino.Node node46 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isAssign(node46);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isExprCall(node46);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.isGet(node46);
        com.google.javascript.rhino.Node node50 = com.google.javascript.jscomp.NodeUtil.newName("^", node46);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isLhs(node41, node50);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node35, node50);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node50, (int) (byte) 10);
        com.google.javascript.rhino.Node node59 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node59);
        java.lang.String str61 = com.google.javascript.jscomp.NodeUtil.getSourceName(node59);
        java.lang.String str62 = com.google.javascript.jscomp.NodeUtil.getStringValue(node59);
        com.google.javascript.rhino.Node node67 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean68 = com.google.javascript.jscomp.NodeUtil.isAssign(node67);
        boolean boolean69 = com.google.javascript.jscomp.NodeUtil.isExprCall(node67);
        com.google.javascript.rhino.Node node71 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", node67, "^");
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node59, node71);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType75 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 0);
        boolean boolean76 = com.google.javascript.jscomp.NodeUtil.containsType(node71, 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType75);
        boolean boolean77 = com.google.javascript.jscomp.NodeUtil.containsType(node50, (int) (byte) 10, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType75);
        boolean boolean78 = com.google.javascript.jscomp.NodeUtil.has(node13, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType30, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType75);
        int int79 = com.google.javascript.jscomp.NodeUtil.getCount(node6, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType75);
        int int80 = com.google.javascript.jscomp.NodeUtil.getCount(node0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType75);
        boolean boolean81 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node0);
        boolean boolean82 = com.google.javascript.jscomp.NodeUtil.isVar(node0);
        boolean boolean83 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node0);
        org.junit.Assert.assertNotNull(node0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSDocInfo9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) ' ', 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Non-literal value: NAME  32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("undefined", (int) (byte) 10, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = com.google.javascript.jscomp.NodeUtil.tryMergeBlock(node3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssign(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExprCall(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isGet(node4);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newName("^", node4);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.containsCall(node4);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isAssign(node4);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(node4);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node5);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getSourceName(node5);
        java.lang.String str8 = com.google.javascript.jscomp.NodeUtil.getStringValue(node5);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", node5, "");
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newVarNode("$$constant", node5);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isFunctionAnonymous(node5);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node5);
        com.google.javascript.rhino.JSDocInfo jSDocInfo14 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node5);
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isAssign(node19);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node19, "hi!");
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isAssign(node28);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isExprCall(node28);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isGet(node28);
        com.google.javascript.rhino.Node node32 = com.google.javascript.jscomp.NodeUtil.newName("^", node28);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node19, node32);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.referencesThis(node19);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node19);
        java.lang.String str36 = com.google.javascript.jscomp.NodeUtil.getSourceName(node19);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node19);
        com.google.javascript.rhino.Node node42 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node42);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node42, (int) (short) 0);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node42);
        com.google.javascript.rhino.Node node51 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node51);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.isAssign(node51);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node51, "hi!");
        com.google.javascript.rhino.Node node60 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.isAssign(node60);
        boolean boolean62 = com.google.javascript.jscomp.NodeUtil.isExprCall(node60);
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.isGet(node60);
        com.google.javascript.rhino.Node node64 = com.google.javascript.jscomp.NodeUtil.newName("^", node60);
        boolean boolean65 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node51, node64);
        boolean boolean66 = com.google.javascript.jscomp.NodeUtil.referencesThis(node51);
        boolean boolean67 = com.google.javascript.jscomp.NodeUtil.isAssign(node51);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType70 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType(1);
        boolean boolean71 = com.google.javascript.jscomp.NodeUtil.isNodeTypeReferenced(node51, 6, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType70);
        int int72 = matchNodeType70.type;
        boolean boolean73 = com.google.javascript.jscomp.NodeUtil.isNodeTypeReferenced(node42, 15, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType70);
        boolean boolean74 = com.google.javascript.jscomp.NodeUtil.isNodeTypeReferenced(node19, 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType70);
        boolean boolean75 = com.google.javascript.jscomp.NodeUtil.isNodeTypeReferenced(node5, 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType70);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(jSDocInfo14);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isExprCall(node3);
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isGetProp(node3);
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node15);
        java.lang.String str17 = com.google.javascript.jscomp.NodeUtil.getSourceName(node15);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node15);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isGetProp(node15);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node15);
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", node15, "||");
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isAssign(node26);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isExprCall(node26);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isFunction(node26);
        int int31 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node26, (int) (byte) 10);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node26);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node26);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node15, node26, "^");
        com.google.javascript.rhino.Node node36 = com.google.javascript.jscomp.NodeUtil.newVarNode("$$constant", node15);
        com.google.javascript.rhino.Node node37 = com.google.javascript.jscomp.NodeUtil.newName("", node15);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node3, node37);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node37);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSDocInfo6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node5);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node5, (int) (short) 0);
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isAssign(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isExprCall(node12);
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node18);
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isAssign(node27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isExprCall(node27);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isFunction(node27);
        int int32 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node27, (int) (byte) 10);
        com.google.javascript.rhino.Node[] nodeArray33 = new com.google.javascript.rhino.Node[] { node5, node12, node18, node23, node27 };
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList34 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList34, nodeArray33);
        com.google.javascript.rhino.Node node39 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node39);
        java.lang.String str41 = com.google.javascript.jscomp.NodeUtil.getSourceName(node39);
        com.google.javascript.rhino.FunctionNode functionNode44 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", (java.util.List<com.google.javascript.rhino.Node>) nodeList34, node39, (int) '#', 6);
        com.google.javascript.rhino.Node node49 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node49);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isAssign(node49);
        com.google.javascript.rhino.Node node53 = com.google.javascript.jscomp.NodeUtil.newName("", node49, "");
        java.lang.String str54 = com.google.javascript.jscomp.NodeUtil.getFunctionName((com.google.javascript.rhino.Node) functionNode44, node49);
        com.google.javascript.rhino.Node node56 = com.google.javascript.jscomp.NodeUtil.newName("^", (com.google.javascript.rhino.Node) functionNode44, "$$constant");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean57 = com.google.javascript.jscomp.NodeUtil.functionCallHasSideEffects(node56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected CALL node, got NAME");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(nodeArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(functionNode44);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(node56);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", 0, 0);
        org.junit.Assert.assertNotNull(node3);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node3);
        java.lang.String str5 = com.google.javascript.jscomp.NodeUtil.getSourceName(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isFunction(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isThis(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isName(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isAssign(node4);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node4, "hi!");
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isAssign(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isExprCall(node13);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isGet(node13);
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newName("^", node13);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node4, node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isNew(node4);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isName(node4);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.containsCall(node4);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isString(node4);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(node4);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node4);
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("%=", node4, "%=");
        com.google.javascript.rhino.Node node32 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node32);
        java.lang.String str34 = com.google.javascript.jscomp.NodeUtil.getSourceName(node32);
        java.lang.String str35 = com.google.javascript.jscomp.NodeUtil.getStringValue(node32);
        com.google.javascript.rhino.Node node37 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", node32, "");
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isNodeTypeReferenced(node32, (int) (short) 100);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node32);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node32);
        com.google.javascript.rhino.Node node42 = com.google.javascript.jscomp.NodeUtil.newName("^", node32);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node32, (int) (short) 1);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isGet(node32);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node26, node32);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node3, "hi!");
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isAssign(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isExprCall(node12);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isGet(node12);
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newName("^", node12);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node3, node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.referencesThis(node3);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node3);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isString(node3);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isThis(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isExprCall(node3);
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isExprCall(node3);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node3);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isForIn(node3);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSDocInfo6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isAssign(node4);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node4, "hi!");
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isAssign(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isExprCall(node13);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isGet(node13);
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newName("^", node13);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node4, node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isNew(node4);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isName(node4);
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isAssign(node24);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isName(node24);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node24);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node4, node24, "");
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node4);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isForIn(node4);
        com.google.javascript.rhino.Node node34 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", node4, "||");
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node4);
        com.google.javascript.rhino.Node node36 = com.google.javascript.jscomp.NodeUtil.getLoopCodeBlock(node4);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(node36);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node3, "hi!");
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isAssign(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isExprCall(node12);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isGet(node12);
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newName("^", node12);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node3, node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node16);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isString(node16);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node16);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isVar(node16);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.referencesThis(node16);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node3, "hi!");
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isAssign(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isExprCall(node12);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isGet(node12);
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newName("^", node12);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node3, node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.referencesThis(node3);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.referencesThis(node3);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node3);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node3, "typeof");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Non-literal value: NAME  97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        com.google.javascript.rhino.Node node0 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode();
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node0, "");
        com.google.javascript.rhino.JSDocInfo jSDocInfo3 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node0);
        org.junit.Assert.assertNotNull(node0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(jSDocInfo3);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) 10, 0);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.containsCall(node3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isFunctionAnonymous(node3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node3);
        java.lang.String str5 = com.google.javascript.jscomp.NodeUtil.getSourceName(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.referencesThis(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node3);
        java.util.Set<java.lang.String> strSet9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node3, strSet9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node3);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType10 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (byte) -1);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isNodeTypeReferenced(node3, (int) (short) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType10);
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(node15);
        com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(node15);
        boolean boolean18 = matchNodeType10.apply(node15);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isAnonymousFunction(node15);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node15);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssign(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExprCall(node4);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", node4, "^");
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isExprCall(node8);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node8, "Pure functions:\n\n");
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node8);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = com.google.javascript.jscomp.NodeUtil.getOpFromAssignmentOp(node8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Not an assiment op");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isExprCall(node3);
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isGetProp(node3);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.getConditionExpression(node3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: NAME  97 does not have a condition.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSDocInfo6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node3, "hi!");
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isAssign(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isExprCall(node12);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isGet(node12);
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newName("^", node12);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node3, node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isConstantName(node3);
        com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(node3);
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isAssign(node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isExprCall(node24);
        com.google.javascript.rhino.JSDocInfo jSDocInfo27 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node24);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType29 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType(100);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType31 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 0);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.has(node24, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType29, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType31);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node3, "%=", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType29);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isName(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(jSDocInfo27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node5);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getSourceName(node5);
        java.lang.String str8 = com.google.javascript.jscomp.NodeUtil.getStringValue(node5);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", node5, "");
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isConstantName(node5);
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node16);
        java.lang.String str18 = com.google.javascript.jscomp.NodeUtil.getSourceName(node16);
        java.lang.String str19 = com.google.javascript.jscomp.NodeUtil.getStringValue(node16);
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isAssign(node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isExprCall(node24);
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", node24, "^");
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node16, node28);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType32 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 0);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.containsType(node28, 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType32);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isNodeTypeReferenced(node5, (int) (byte) 1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType32);
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newName("<=", node5);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node35);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        com.google.javascript.rhino.Node node0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node3);
        java.lang.String str5 = com.google.javascript.jscomp.NodeUtil.getSourceName(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node4);
        java.lang.String str6 = com.google.javascript.jscomp.NodeUtil.getSourceName(node4);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getStringValue(node4);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", node4, "");
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node9);
        int int13 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node9, "|");
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node4, (int) (short) 0);
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isAssign(node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isExprCall(node11);
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node17);
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isAssign(node26);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isExprCall(node26);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isFunction(node26);
        int int31 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node26, (int) (byte) 10);
        com.google.javascript.rhino.Node[] nodeArray32 = new com.google.javascript.rhino.Node[] { node4, node11, node17, node22, node26 };
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList33 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList33, nodeArray32);
        com.google.javascript.rhino.Node node38 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node38);
        java.lang.String str40 = com.google.javascript.jscomp.NodeUtil.getSourceName(node38);
        com.google.javascript.rhino.FunctionNode functionNode43 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", (java.util.List<com.google.javascript.rhino.Node>) nodeList33, node38, (int) '#', 6);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isForIn(node38);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isString(node38);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isVar(node38);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node47 = com.google.javascript.jscomp.NodeUtil.newExpr(node38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: new child has existing parent");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(nodeArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(functionNode43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node4);
        java.lang.String str6 = com.google.javascript.jscomp.NodeUtil.getSourceName(node4);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getStringValue(node4);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", node4, "");
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isNodeTypeReferenced(node4, (int) (short) 100);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node4);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node4);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isNew(node4);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node4);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("undefined", 1, (int) '#');
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isVar(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssign(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExprCall(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isFunction(node4);
        int int9 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node4, (int) (byte) 10);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newVarNode("$$constant", node4);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node10);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node3, (int) (short) 0);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.containsType(node3, (int) (short) 100);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node5);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getSourceName(node5);
        java.lang.String str8 = com.google.javascript.jscomp.NodeUtil.getStringValue(node5);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", node5, "");
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isNodeTypeReferenced(node5, (int) (short) 100);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node5);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node5);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isVar(node5);
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newVarNode("^", node5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = com.google.javascript.jscomp.NodeUtil.functionCallHasSideEffects(node5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected CALL node, got NAME");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isAssign(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isExprCall(node8);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isGet(node8);
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newName("^", node8);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isLhs(node3, node12);
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node12);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isConstantName(node12);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.containsCall(node12);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssign(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExprCall(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isFunction(node4);
        int int9 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node4, (int) (byte) 10);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newVarNode("$$constant", node4);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node10);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node10);
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node19);
        java.lang.String str21 = com.google.javascript.jscomp.NodeUtil.getSourceName(node19);
        java.lang.String str22 = com.google.javascript.jscomp.NodeUtil.getStringValue(node19);
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", node19, "");
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newVarNode("$$constant", node19);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isFunctionAnonymous(node19);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node19);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.referencesThis(node19);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isFunction(node19);
        java.lang.String str30 = com.google.javascript.jscomp.NodeUtil.getFunctionName(node10, node19);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.containsCall(node10);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = com.google.javascript.jscomp.NodeUtil.getOpFromAssignmentOp(node10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Not an assiment op");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        com.google.javascript.rhino.Node node0 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode();
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node0, "");
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isAssign(node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isExprCall(node6);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunction(node6);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.containsCall(node6);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isCall(node6);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType14 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType(1);
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isAssign(node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isExprCall(node18);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isGet(node18);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node18, (int) (byte) 0);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node18);
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node28);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isAssign(node28);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node28, "hi!");
        com.google.javascript.rhino.Node node37 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isAssign(node37);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isExprCall(node37);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isGet(node37);
        com.google.javascript.rhino.Node node41 = com.google.javascript.jscomp.NodeUtil.newName("^", node37);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node28, node41);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.referencesThis(node28);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isAssign(node28);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.referencesThis(node28);
        com.google.javascript.rhino.Node node49 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isAssign(node49);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isExprCall(node49);
        java.lang.String[] strArray53 = new java.lang.String[] { "^" };
        java.util.LinkedHashSet<java.lang.String> strSet54 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet54, strArray53);
        boolean boolean56 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node49, (java.util.Set<java.lang.String>) strSet54);
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node28, (java.util.Set<java.lang.String>) strSet54);
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node18, (java.util.Set<java.lang.String>) strSet54);
        boolean boolean59 = matchNodeType14.apply(node18);
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.isNodeTypeReferenced(node6, (-1), (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType14);
        int int61 = com.google.javascript.jscomp.NodeUtil.getCount(node0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType14);
        org.junit.Assert.assertNotNull(node0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "^" });
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node5);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getSourceName(node5);
        java.lang.String str8 = com.google.javascript.jscomp.NodeUtil.getStringValue(node5);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", node5, "");
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isConstantName(node5);
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node15);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isAssign(node15);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(node15);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isName(node15);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node5, node15);
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node15);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node21);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isAssign(node5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isExprCall(node5);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isGet(node5);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newName("^", node5);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.containsFunctionDeclaration(node9);
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("%=", node9, "");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isVar(node3);
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isNew(node3);
        com.google.javascript.rhino.JSDocInfo jSDocInfo7 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(jSDocInfo7);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.DefinitionProvider definitionProvider1 = null;
        com.google.javascript.jscomp.PureFunctionIdentifier pureFunctionIdentifier2 = new com.google.javascript.jscomp.PureFunctionIdentifier(abstractCompiler0, definitionProvider1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isAssign(node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isExprCall(node7);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isFunction(node7);
        int int12 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node7, (int) (byte) 10);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isVar(node7);
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newName("$$constant", node7, "$$constant");
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node7);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isFunction(node7);
        com.google.javascript.rhino.JSDocInfo jSDocInfo18 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node7);
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node23);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isAssign(node23);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node23, "hi!");
        com.google.javascript.rhino.Node node32 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isAssign(node32);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isExprCall(node32);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isGet(node32);
        com.google.javascript.rhino.Node node36 = com.google.javascript.jscomp.NodeUtil.newName("^", node32);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node23, node36);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isNew(node23);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isName(node23);
        com.google.javascript.rhino.Node node43 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node43);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isAssign(node43);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isName(node43);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node43);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node23, node43, "");
        com.google.javascript.rhino.Node node51 = com.google.javascript.jscomp.NodeUtil.newName("hi!", node23, "^");
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isLhs(node7, node51);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType55 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) '4');
        com.google.javascript.rhino.Node node59 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(node59);
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node59);
        boolean boolean62 = matchNodeType55.apply(node59);
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node7, "hi!", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType55);
        com.google.javascript.rhino.Node node67 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean68 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node67);
        boolean boolean69 = com.google.javascript.jscomp.NodeUtil.isAssign(node67);
        boolean boolean70 = com.google.javascript.jscomp.NodeUtil.isName(node67);
        boolean boolean71 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node67);
        boolean boolean72 = com.google.javascript.jscomp.NodeUtil.isThis(node67);
        pureFunctionIdentifier2.process(node7, node67);
        boolean boolean74 = com.google.javascript.jscomp.NodeUtil.isAssign(node67);
        boolean boolean75 = com.google.javascript.jscomp.NodeUtil.isAssign(node67);
        boolean boolean76 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node67);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(jSDocInfo18);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        com.google.javascript.rhino.Node node0 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode();
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isGet(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isAssign(node0);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isAssign(node0);
        org.junit.Assert.assertNotNull(node0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node5);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getSourceName(node5);
        java.lang.String str8 = com.google.javascript.jscomp.NodeUtil.getStringValue(node5);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", node5, "");
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newVarNode("$$constant", node5);
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isAssign(node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isExprCall(node16);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isFunction(node16);
        int int21 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node16, (int) (byte) 10);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isVar(node16);
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newName("$$constant", node16, "$$constant");
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node16);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node5, node16);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node5);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node5);
        com.google.javascript.rhino.Node node29 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node5);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(node29);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isExprCall(node3);
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isCall(node3);
        java.lang.String str10 = com.google.javascript.jscomp.NodeUtil.getSourceName(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSDocInfo6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssign(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExprCall(node4);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", node4, "^");
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node4);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isGetProp(node4);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.containsCall(node4);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection12 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node4);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.getFunctionBody(node4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(nodeCollection12);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isExprCall(node3);
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node3);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.getFunctionBody(node3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSDocInfo6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node3);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isAssign(node14);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isExprCall(node14);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isGet(node14);
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newName("^", node14);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isLhs(node9, node18);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node3, node18);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node18, (int) (byte) 10);
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node27);
        java.lang.String str29 = com.google.javascript.jscomp.NodeUtil.getSourceName(node27);
        java.lang.String str30 = com.google.javascript.jscomp.NodeUtil.getStringValue(node27);
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isAssign(node35);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isExprCall(node35);
        com.google.javascript.rhino.Node node39 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", node35, "^");
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node27, node39);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType43 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 0);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.containsType(node39, 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType43);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.containsType(node18, (int) (byte) 10, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType43);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(node18);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.containsCall(node18);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("$$constant", (int) (short) -1, 9);
        org.junit.Assert.assertNotNull(node3);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node3, (int) (short) 0);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node3, (int) 'a');
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node3, "hi!");
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isAssign(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isExprCall(node12);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isGet(node12);
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newName("^", node12);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node3, node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isNew(node3);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isName(node3);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.referencesThis(node3);
        int int22 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node3, (int) (short) 0);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.referencesThis(node3);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node3);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isString(node3);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node3);
        java.lang.String str27 = com.google.javascript.jscomp.NodeUtil.getSourceName(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node4);
        java.lang.String str6 = com.google.javascript.jscomp.NodeUtil.getSourceName(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node4);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newExpr(node4);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newName("", node4);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node4);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("Pure functions:\n\n", 3, (int) 'a');
        org.junit.Assert.assertNotNull(node3);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node5);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getSourceName(node5);
        java.lang.String str8 = com.google.javascript.jscomp.NodeUtil.getStringValue(node5);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", node5, "");
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isConstantName(node5);
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node15);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isAssign(node15);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(node15);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isName(node15);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node5, node15);
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node15);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node15);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node15);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(node15);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) (byte) 100, (-1));
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node3);
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newExpr(node3);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = com.google.javascript.jscomp.NodeUtil.getOpFromAssignmentOp(node5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Not an assiment op");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node3);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node3, (java.util.Set<java.lang.String>) strSet8);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isNew(node3);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isStatement(node3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", (int) (byte) -1, (int) (short) 100);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isName(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isVar(node3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.google.javascript.jscomp.NodeUtil.tryMergeBlock(node3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node4, (int) (short) 0);
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isAssign(node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isExprCall(node11);
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node17);
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isAssign(node26);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isExprCall(node26);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isFunction(node26);
        int int31 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node26, (int) (byte) 10);
        com.google.javascript.rhino.Node[] nodeArray32 = new com.google.javascript.rhino.Node[] { node4, node11, node17, node22, node26 };
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList33 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList33, nodeArray32);
        com.google.javascript.rhino.Node node38 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node38);
        java.lang.String str40 = com.google.javascript.jscomp.NodeUtil.getSourceName(node38);
        com.google.javascript.rhino.FunctionNode functionNode43 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", (java.util.List<com.google.javascript.rhino.Node>) nodeList33, node38, (int) '#', 6);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isString(node38);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(nodeArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(functionNode43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node4);
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newName("$$constant", node4);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isConstantName(node4);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.containsCall(node4);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node4);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node4);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node4);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node4);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType12 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 0);
        int int13 = matchNodeType12.type;
        int int14 = com.google.javascript.jscomp.NodeUtil.getCount(node4, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType12);
        int int16 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node4, "$$constant");
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isAssign(node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isExprCall(node20);
        java.lang.String[] strArray24 = new java.lang.String[] { "^" };
        java.util.LinkedHashSet<java.lang.String> strSet25 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet25, strArray24);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node20, (java.util.Set<java.lang.String>) strSet25);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node4, node20);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node4);
        com.google.javascript.rhino.Node node31 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", node4, "typeof");
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node4);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "^" });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isAssign(node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isExprCall(node10);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isGet(node10);
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newName("^", node10);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isLhs(node5, node14);
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", node5, "||");
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isLhs(node0, node5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isVarArgsFunction(node0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isValidPropertyName("$$constant");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        java.lang.String str1 = com.google.javascript.jscomp.NodeUtil.opToStrNoFail(15);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<=" + "'", str1, "<=");
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isExprCall(node3);
        java.lang.String str6 = com.google.javascript.jscomp.NodeUtil.getSourceName(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.containsCall(node3);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.getLoopCodeBlock(node3);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = com.google.javascript.jscomp.NodeUtil.getOpFromAssignmentOp(node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) (byte) 100, (-1));
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isString(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssign(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExprCall(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isGet(node4);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newName("^", node4);
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isAssign(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isExprCall(node12);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isGet(node12);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node12, (int) (byte) 0);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isExprCall(node12);
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node24);
        java.lang.String str26 = com.google.javascript.jscomp.NodeUtil.getSourceName(node24);
        java.lang.String str27 = com.google.javascript.jscomp.NodeUtil.getStringValue(node24);
        com.google.javascript.rhino.Node node29 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", node24, "");
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newVarNode("$$constant", node24);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isFunctionAnonymous(node24);
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node35);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isAssign(node35);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node35, "hi!");
        com.google.javascript.rhino.Node node44 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isAssign(node44);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isExprCall(node44);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isGet(node44);
        com.google.javascript.rhino.Node node48 = com.google.javascript.jscomp.NodeUtil.newName("^", node44);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node35, node48);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.referencesThis(node35);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isAssign(node35);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.referencesThis(node35);
        com.google.javascript.rhino.Node node56 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.isAssign(node56);
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.isExprCall(node56);
        java.lang.String[] strArray60 = new java.lang.String[] { "^" };
        java.util.LinkedHashSet<java.lang.String> strSet61 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet61, strArray60);
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node56, (java.util.Set<java.lang.String>) strSet61);
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node35, (java.util.Set<java.lang.String>) strSet61);
        boolean boolean65 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node24, (java.util.Set<java.lang.String>) strSet61);
        boolean boolean66 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node12, (java.util.Set<java.lang.String>) strSet61);
        boolean boolean67 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node4, (java.util.Set<java.lang.String>) strSet61);
        boolean boolean68 = com.google.javascript.jscomp.NodeUtil.isConstantName(node4);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertArrayEquals(strArray60, new java.lang.String[] { "^" });
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isAssign(node4);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node4, "hi!");
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isAssign(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isExprCall(node13);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isGet(node13);
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newName("^", node13);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node4, node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isNew(node4);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isName(node4);
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isAssign(node24);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isName(node24);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node24);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node4, node24, "");
        com.google.javascript.rhino.Node node32 = com.google.javascript.jscomp.NodeUtil.newName("hi!", node4, "^");
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node32);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node32);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node32);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isFunction(node32);
        com.google.javascript.rhino.Node node42 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node42);
        java.lang.String str44 = com.google.javascript.jscomp.NodeUtil.getSourceName(node42);
        java.lang.String str45 = com.google.javascript.jscomp.NodeUtil.getStringValue(node42);
        com.google.javascript.rhino.Node node47 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", node42, "");
        com.google.javascript.rhino.Node node48 = com.google.javascript.jscomp.NodeUtil.newVarNode("$$constant", node42);
        com.google.javascript.rhino.Node node53 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.isAssign(node53);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.isExprCall(node53);
        boolean boolean56 = com.google.javascript.jscomp.NodeUtil.isFunction(node53);
        int int58 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node53, (int) (byte) 10);
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.isVar(node53);
        com.google.javascript.rhino.Node node61 = com.google.javascript.jscomp.NodeUtil.newName("$$constant", node53, "$$constant");
        boolean boolean62 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node53);
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node42, node53);
        java.lang.String str64 = com.google.javascript.jscomp.NodeUtil.getStringValue(node53);
        boolean boolean65 = com.google.javascript.jscomp.NodeUtil.isThis(node53);
        boolean boolean66 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node32, node53);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node3, "hi!");
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isAssign(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isExprCall(node12);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isGet(node12);
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newName("^", node12);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node3, node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node16);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node16);
        int int21 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node16, (int) (short) -1);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node16);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node16);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isAssign(node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isExprCall(node9);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isGet(node9);
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newName("^", node9);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isLhs(node4, node13);
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", node4, "||");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = com.google.javascript.jscomp.NodeUtil.hasFinally(node4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node5);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getSourceName(node5);
        java.lang.String str8 = com.google.javascript.jscomp.NodeUtil.getStringValue(node5);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", node5, "");
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newVarNode("$$constant", node5);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isFunctionAnonymous(node5);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node5);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.referencesThis(node5);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isFunction(node5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = com.google.javascript.jscomp.NodeUtil.tryMergeBlock(node5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node5);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getSourceName(node5);
        java.lang.String str8 = com.google.javascript.jscomp.NodeUtil.getStringValue(node5);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", node5, "");
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newVarNode("$$constant", node5);
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isAssign(node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isExprCall(node16);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isFunction(node16);
        int int21 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node16, (int) (byte) 10);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isVar(node16);
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newName("$$constant", node16, "$$constant");
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node16);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node5, node16);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isNodeTypeReferenced(node16, 100);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node16);
        com.google.javascript.jscomp.NodeUtil.Visitor visitor30 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode();
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType34 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) '4');
        com.google.javascript.rhino.Node node38 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(node38);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node38);
        boolean boolean41 = matchNodeType34.apply(node38);
        com.google.javascript.rhino.Node node46 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isAssign(node46);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isExprCall(node46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo49 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node46);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node46);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType53 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType(1);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node46, "hi!", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType53);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node38, "", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType53);
        boolean boolean56 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node31, "undefined", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType53);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.NodeUtil.visitPostOrder(node16, visitor30, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(jSDocInfo49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node4);
        java.lang.String str6 = com.google.javascript.jscomp.NodeUtil.getSourceName(node4);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getStringValue(node4);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", node4, "");
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isNodeTypeReferenced(node4, (int) (short) 100);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node4);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node4);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node4);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node4);
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isAssign(node19);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node19, "hi!");
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isAssign(node28);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isExprCall(node28);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isGet(node28);
        com.google.javascript.rhino.Node node32 = com.google.javascript.jscomp.NodeUtil.newName("^", node28);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node19, node32);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.referencesThis(node19);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isAssign(node19);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType38 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType(1);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isNodeTypeReferenced(node19, 6, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType38);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection40 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node19);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isLhs(node4, node19);
        int int43 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node19, "undefined");
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(nodeCollection40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isExprCall(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isFunction(node3);
        int int8 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node3, (int) (byte) 10);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isVar(node3);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node3);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isName(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node5);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node5, (int) (short) 0);
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isAssign(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isExprCall(node12);
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node18);
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isAssign(node27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isExprCall(node27);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isFunction(node27);
        int int32 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node27, (int) (byte) 10);
        com.google.javascript.rhino.Node[] nodeArray33 = new com.google.javascript.rhino.Node[] { node5, node12, node18, node23, node27 };
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList34 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList34, nodeArray33);
        com.google.javascript.rhino.Node node39 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node39);
        java.lang.String str41 = com.google.javascript.jscomp.NodeUtil.getSourceName(node39);
        com.google.javascript.rhino.FunctionNode functionNode44 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", (java.util.List<com.google.javascript.rhino.Node>) nodeList34, node39, (int) '#', 6);
        com.google.javascript.rhino.Node node50 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node50);
        java.lang.String str52 = com.google.javascript.jscomp.NodeUtil.getSourceName(node50);
        java.lang.String str53 = com.google.javascript.jscomp.NodeUtil.getStringValue(node50);
        com.google.javascript.rhino.Node node55 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", node50, "");
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.isNodeTypeReferenced(node50, (int) (short) 100);
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node50);
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node50);
        com.google.javascript.rhino.Node node60 = com.google.javascript.jscomp.NodeUtil.newName("^", node50);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.FunctionNode functionNode63 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("", (java.util.List<com.google.javascript.rhino.Node>) nodeList34, node50, 1, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(nodeArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(functionNode44);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(node60);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssign(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExprCall(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isGet(node4);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newName("^", node4);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.containsFunctionDeclaration(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node8);
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node16);
        java.lang.String str18 = com.google.javascript.jscomp.NodeUtil.getSourceName(node16);
        java.lang.String str19 = com.google.javascript.jscomp.NodeUtil.getStringValue(node16);
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", node16, "");
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newVarNode("$$constant", node16);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node8, node22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node8);
        com.google.javascript.rhino.Node node29 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isAssign(node29);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isExprCall(node29);
        java.lang.String str32 = com.google.javascript.jscomp.NodeUtil.getSourceName(node29);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.containsCall(node29);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.containsType(node29, 0);
        com.google.javascript.rhino.Node node37 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", node29, "$$constant");
        com.google.javascript.rhino.Node node41 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node41);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isAssign(node41);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node41, "hi!");
        com.google.javascript.rhino.Node node50 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isAssign(node50);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isExprCall(node50);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.isGet(node50);
        com.google.javascript.rhino.Node node54 = com.google.javascript.jscomp.NodeUtil.newName("^", node50);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node41, node54);
        boolean boolean56 = com.google.javascript.jscomp.NodeUtil.isConstantName(node41);
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node41);
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node37, node41);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node8, node37, "%=");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean61 = com.google.javascript.jscomp.NodeUtil.constructorCallHasSideEffects(node8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected NEW node, got NAME");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node4);
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newName("", node4);
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node11);
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isAssign(node22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isExprCall(node22);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isGet(node22);
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newName("^", node22);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isLhs(node17, node26);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node11, node26);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node26, (int) (byte) 10);
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node35);
        java.lang.String str37 = com.google.javascript.jscomp.NodeUtil.getSourceName(node35);
        java.lang.String str38 = com.google.javascript.jscomp.NodeUtil.getStringValue(node35);
        com.google.javascript.rhino.Node node43 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isAssign(node43);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isExprCall(node43);
        com.google.javascript.rhino.Node node47 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", node43, "^");
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node35, node47);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType51 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 0);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.containsType(node47, 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType51);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.containsType(node26, (int) (byte) 10, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType51);
        int int54 = matchNodeType51.type;
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType56 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (byte) 0);
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.has(node7, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType51, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType56);
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(node7);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }
}

