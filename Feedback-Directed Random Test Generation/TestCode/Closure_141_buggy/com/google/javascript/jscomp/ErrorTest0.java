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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(node3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.getAssignedValue(node3);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", (int) (byte) -1, (int) (short) 100);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isFunction(node3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node3);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node3);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isAssign(node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isExprCall(node10);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isGet(node10);
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newName("^", node10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = com.google.javascript.jscomp.NodeUtil.getFunctionName(node3, node14);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isAssign(node9);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node9, "hi!");
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isAssign(node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isExprCall(node18);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isGet(node18);
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newName("^", node18);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node9, node22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isConstantName(node9);
        com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(node9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str26 = com.google.javascript.jscomp.NodeUtil.getFunctionName(node3, node9);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node3);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", (int) (byte) -1, (int) (short) 100);
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.getLoopCodeBlock(node3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.getAssignedValue(node3);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isExprCall(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isGet(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node3, (int) (byte) 0);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node3);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isFunction(node3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.getAssignedValue(node3);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.getAssignedValue(node12);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node5);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getSourceName(node5);
        java.lang.String str8 = com.google.javascript.jscomp.NodeUtil.getStringValue(node5);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", node5, "");
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newVarNode("$$constant", node5);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isFunctionAnonymous(node5);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node5);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.referencesThis(node5);
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isAssign(node19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isExprCall(node19);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isFunction(node19);
        int int24 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node19, (int) (byte) 10);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isVar(node19);
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newName("$$constant", node19, "$$constant");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str28 = com.google.javascript.jscomp.NodeUtil.getFunctionName(node5, node27);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node4);
        java.lang.String str6 = com.google.javascript.jscomp.NodeUtil.getSourceName(node4);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", node4, "^");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.getAssignedValue(node8);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("||", 100, (int) (byte) -1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isAnonymousFunction(node3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node3);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
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
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(node3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.getAssignedValue(node3);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
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
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isThis(node16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node29 = com.google.javascript.jscomp.NodeUtil.getAssignedValue(node16);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
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
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node12, "^");
        com.google.javascript.rhino.Node node29 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node29);
        java.lang.String str31 = com.google.javascript.jscomp.NodeUtil.getSourceName(node29);
        java.lang.String str32 = com.google.javascript.jscomp.NodeUtil.getStringValue(node29);
        com.google.javascript.rhino.Node node34 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", node29, "");
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isNodeTypeReferenced(node29, (int) (short) 100);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str38 = com.google.javascript.jscomp.NodeUtil.getFunctionName(node12, node29);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node4);
        java.lang.String str6 = com.google.javascript.jscomp.NodeUtil.getSourceName(node4);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getStringValue(node4);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", node4, "");
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node9, "^");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node9);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
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
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.containsType(node16, (int) ' ');
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.containsType(node16, (int) '4');
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node25);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isAssign(node25);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node25, "hi!");
        com.google.javascript.rhino.Node node34 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isAssign(node34);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isExprCall(node34);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isGet(node34);
        com.google.javascript.rhino.Node node38 = com.google.javascript.jscomp.NodeUtil.newName("^", node34);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node25, node38);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.referencesThis(node25);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node25);
        java.lang.String str42 = com.google.javascript.jscomp.NodeUtil.getSourceName(node25);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str44 = com.google.javascript.jscomp.NodeUtil.getFunctionName(node16, node25);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssign(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExprCall(node4);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getSourceName(node4);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.containsCall(node4);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.containsType(node4, 0);
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", node4, "$$constant");
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isAssign(node16);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node16, "hi!");
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isAssign(node25);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isExprCall(node25);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isGet(node25);
        com.google.javascript.rhino.Node node29 = com.google.javascript.jscomp.NodeUtil.newName("^", node25);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node16, node29);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isConstantName(node16);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node16);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node12, node16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node12);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node3);
        java.lang.String str5 = com.google.javascript.jscomp.NodeUtil.getSourceName(node3);
        java.lang.String str6 = com.google.javascript.jscomp.NodeUtil.getStringValue(node3);
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isAssign(node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isExprCall(node11);
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", node11, "^");
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node3, node15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.getAssignedValue(node15);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isExprCall(node3);
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.getAssignedValue(node3);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isExprCall(node3);
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.getAssignedValue(node3);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isExprCall(node3);
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.containsType(node3, 1);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node3);
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isAssign(node15);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isExprCall(node15);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isGet(node15);
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newName("^", node15);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isString(node19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = com.google.javascript.jscomp.NodeUtil.getFunctionName(node3, node19);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
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
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node25);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isAssign(node25);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node25, "hi!");
        com.google.javascript.rhino.Node node34 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isAssign(node34);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isExprCall(node34);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isGet(node34);
        com.google.javascript.rhino.Node node38 = com.google.javascript.jscomp.NodeUtil.newName("^", node34);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node25, node38);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.referencesThis(node25);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isAssign(node25);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.referencesThis(node25);
        com.google.javascript.rhino.Node node46 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isAssign(node46);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isExprCall(node46);
        java.lang.String[] strArray50 = new java.lang.String[] { "^" };
        java.util.LinkedHashSet<java.lang.String> strSet51 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet51, strArray50);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node46, (java.util.Set<java.lang.String>) strSet51);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node25, (java.util.Set<java.lang.String>) strSet51);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node17, (java.util.Set<java.lang.String>) strSet51);
        boolean boolean56 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node57 = com.google.javascript.jscomp.NodeUtil.getAssignedValue(node17);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
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
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isThis(node16);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isName(node16);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node16);
        com.google.javascript.rhino.Node node34 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        com.google.javascript.rhino.Node node39 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isAssign(node39);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isExprCall(node39);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isGet(node39);
        com.google.javascript.rhino.Node node43 = com.google.javascript.jscomp.NodeUtil.newName("^", node39);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isLhs(node34, node43);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.containsCall(node43);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node16, node43);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node47 = com.google.javascript.jscomp.NodeUtil.getAssignedValue(node43);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.getAssignedValue(node16);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node5);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getSourceName(node5);
        java.lang.String str8 = com.google.javascript.jscomp.NodeUtil.getStringValue(node5);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", node5, "");
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isNodeTypeReferenced(node5, (int) (short) 100);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node5);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node5);
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newName("^", node5);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.getAssignedValue(node15);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssign(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExprCall(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isFunction(node4);
        int int9 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node4, (int) (byte) 10);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node4);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node4);
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newName("", node4, "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isLabelName(node13);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node3);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isName(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isConstantName(node3);
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isAssign(node11);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node11, "hi!");
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isAssign(node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isExprCall(node20);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isGet(node20);
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newName("^", node20);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node11, node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isNew(node11);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isName(node11);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.referencesThis(node11);
        int int30 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node11, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str31 = com.google.javascript.jscomp.NodeUtil.getFunctionName(node3, node11);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node13);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isExprCall(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isGet(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node3, (int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isAssign(node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isExprCall(node9);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isGet(node9);
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newName("^", node9);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isLhs(node4, node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isForIn(node13);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isNodeTypeReferenced(node13, 0);
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newName("^", node13, "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node13);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isLabelName(node12);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isExprCall(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isFunction(node3);
        int int8 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node3, (int) (byte) 10);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunction(node3);
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("||", (int) '#', 9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str14 = com.google.javascript.jscomp.NodeUtil.getFunctionName(node3, node13);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isExprCall(node3);
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node3);
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isAssign(node12);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node12, "hi!");
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isAssign(node21);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isExprCall(node21);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isGet(node21);
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newName("^", node21);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node12, node25);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.referencesThis(node12);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isAssign(node12);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isLhs(node3, node12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.getAssignedValue(node3);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isName(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isThis(node3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.getAssignedValue(node3);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) 10, 0);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.containsCall(node3);
        int int6 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node3, "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node5);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getSourceName(node5);
        java.lang.String str8 = com.google.javascript.jscomp.NodeUtil.getStringValue(node5);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", node5, "");
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isNodeTypeReferenced(node5, (int) (short) 100);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node5);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node5);
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newName("^", node5);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isCall(node5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isLabelName(node5);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isExprCall(node3);
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node3);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType10 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType(1);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node3, "hi!", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType10);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node3, "$$constant");
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isExprCall(node3);
        java.lang.String[] strArray7 = new java.lang.String[] { "^" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node3, (java.util.Set<java.lang.String>) strSet8);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.containsFunctionDeclaration(node3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.getAssignedValue(node3);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isAssign(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isExprCall(node8);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isGet(node8);
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newName("^", node8);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isLhs(node3, node12);
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node12);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isConstantName(node12);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node12);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
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
        com.google.javascript.rhino.Node node63 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node63);
        boolean boolean65 = com.google.javascript.jscomp.NodeUtil.isAssign(node63);
        boolean boolean66 = com.google.javascript.jscomp.NodeUtil.isName(node63);
        boolean boolean67 = com.google.javascript.jscomp.NodeUtil.isConstantName(node63);
        com.google.javascript.rhino.Node node68 = com.google.javascript.jscomp.NodeUtil.newName("$$constant", node63);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str69 = com.google.javascript.jscomp.NodeUtil.getFunctionName(node38, node68);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isName(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isConstantName(node3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.getAssignedValue(node3);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
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
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isAssign(node28);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isExprCall(node28);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isGet(node28);
        com.google.javascript.rhino.Node node32 = com.google.javascript.jscomp.NodeUtil.newName("^", node28);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isLhs(node23, node32);
        com.google.javascript.rhino.Node node34 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node32);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isConstantName(node32);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node3, node32, "hi!");
        com.google.javascript.rhino.Node node43 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node43);
        java.lang.String str45 = com.google.javascript.jscomp.NodeUtil.getSourceName(node43);
        java.lang.String str46 = com.google.javascript.jscomp.NodeUtil.getStringValue(node43);
        com.google.javascript.rhino.Node node48 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", node43, "");
        com.google.javascript.rhino.Node node49 = com.google.javascript.jscomp.NodeUtil.newVarNode("$$constant", node43);
        com.google.javascript.rhino.Node node53 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.isAssign(node53);
        com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(node53);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node43, node53);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str57 = com.google.javascript.jscomp.NodeUtil.getFunctionName(node32, node53);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isName(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isConstantName(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.referencesThis(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node3);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isGet(node3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node3);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isVar(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.getAssignedValue(node3);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssign(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExprCall(node4);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", node4, "^");
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isExprCall(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node8);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.containsFunctionDeclaration(node8);
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node8);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node3);
        java.lang.String str5 = com.google.javascript.jscomp.NodeUtil.getSourceName(node3);
        java.lang.String str6 = com.google.javascript.jscomp.NodeUtil.getStringValue(node3);
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isAssign(node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isExprCall(node11);
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", node11, "^");
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node3, node15);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node15);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType20 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType(52);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.containsType(node15, (int) '#', (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType20);
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node26);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node26);
        com.google.javascript.rhino.Node node29 = com.google.javascript.jscomp.NodeUtil.newName("$$constant", node26);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node26);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isAssign(node26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str32 = com.google.javascript.jscomp.NodeUtil.getFunctionName(node15, node26);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node3);
        java.lang.String str5 = com.google.javascript.jscomp.NodeUtil.getSourceName(node3);
        java.lang.String str6 = com.google.javascript.jscomp.NodeUtil.getStringValue(node3);
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isAssign(node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isExprCall(node11);
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", node11, "^");
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node3, node15);
        com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(node3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isName(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isThis(node3);
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isAssign(node14);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isExprCall(node14);
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", node14, "^");
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node14);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isGetProp(node14);
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newName("", node14, "undefined");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = com.google.javascript.jscomp.NodeUtil.getFunctionName(node3, node14);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isName(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node3, "^");
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node3);
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node13);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node13, (int) (short) 0);
        com.google.javascript.rhino.JSDocInfo jSDocInfo17 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = com.google.javascript.jscomp.NodeUtil.getFunctionName(node3, node13);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssign(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExprCall(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isFunction(node4);
        int int9 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node4, (int) (byte) 10);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isVar(node4);
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newName("$$constant", node4, "$$constant");
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node4);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isGetProp(node4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.getAssignedValue(node4);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node43 = com.google.javascript.jscomp.NodeUtil.getAssignedValue(node4);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node3);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType10 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (byte) -1);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isNodeTypeReferenced(node3, (int) (short) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node3);
        com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(node3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node3);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType10 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (byte) -1);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isNodeTypeReferenced(node3, (int) (short) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node3);
        com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(node3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node3);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isExprCall(node3);
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node3);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType8 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType(100);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType10 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 0);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.has(node3, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType8, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node3);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node5);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getSourceName(node5);
        java.lang.String str8 = com.google.javascript.jscomp.NodeUtil.getStringValue(node5);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", node5, "");
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isConstantName(node5);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node5);
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", node5, "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isLabelName(node14);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssign(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExprCall(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isGet(node4);
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isAssign(node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isExprCall(node16);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isGet(node16);
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newName("^", node16);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isLhs(node11, node20);
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node25);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node25, (int) (short) 0);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node20, node25);
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node33);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isAssign(node33);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node33, "hi!");
        com.google.javascript.rhino.Node node42 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isAssign(node42);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isExprCall(node42);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isGet(node42);
        com.google.javascript.rhino.Node node46 = com.google.javascript.jscomp.NodeUtil.newName("^", node42);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node33, node46);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.referencesThis(node33);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.isAssign(node33);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.referencesThis(node33);
        com.google.javascript.rhino.Node node54 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.isAssign(node54);
        boolean boolean56 = com.google.javascript.jscomp.NodeUtil.isExprCall(node54);
        java.lang.String[] strArray58 = new java.lang.String[] { "^" };
        java.util.LinkedHashSet<java.lang.String> strSet59 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet59, strArray58);
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node54, (java.util.Set<java.lang.String>) strSet59);
        boolean boolean62 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node33, (java.util.Set<java.lang.String>) strSet59);
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node25, (java.util.Set<java.lang.String>) strSet59);
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node4, (java.util.Set<java.lang.String>) strSet59);
        com.google.javascript.rhino.Node node65 = com.google.javascript.jscomp.NodeUtil.newName("^", node4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node66 = com.google.javascript.jscomp.NodeUtil.getAssignedValue(node65);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test64");
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
        com.google.javascript.rhino.Node node47 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isAssign(node47);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.isExprCall(node47);
        com.google.javascript.rhino.JSDocInfo jSDocInfo50 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node47);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node47);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node47);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey((com.google.javascript.rhino.Node) functionNode43, node47);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node54 = com.google.javascript.jscomp.NodeUtil.getAssignedValue(node47);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test65");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node3, "hi!");
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isThis(node3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test66");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isExprCall(node3);
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isVar(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isVar(node3);
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isAssign(node14);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isExprCall(node14);
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", node14, "^");
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node14);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isGetProp(node14);
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node24);
        java.lang.String str26 = com.google.javascript.jscomp.NodeUtil.getSourceName(node24);
        java.lang.String str27 = com.google.javascript.jscomp.NodeUtil.getStringValue(node24);
        com.google.javascript.rhino.Node node32 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isAssign(node32);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isExprCall(node32);
        com.google.javascript.rhino.Node node36 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", node32, "^");
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node24, node36);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType40 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 0);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.containsType(node36, 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType40);
        com.google.javascript.rhino.Node node45 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isAssign(node45);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isExprCall(node45);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isGet(node45);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node45, (int) (byte) 0);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node45);
        com.google.javascript.rhino.Node node55 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean56 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node55);
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.isAssign(node55);
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node55, "hi!");
        com.google.javascript.rhino.Node node64 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean65 = com.google.javascript.jscomp.NodeUtil.isAssign(node64);
        boolean boolean66 = com.google.javascript.jscomp.NodeUtil.isExprCall(node64);
        boolean boolean67 = com.google.javascript.jscomp.NodeUtil.isGet(node64);
        com.google.javascript.rhino.Node node68 = com.google.javascript.jscomp.NodeUtil.newName("^", node64);
        boolean boolean69 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node55, node68);
        boolean boolean70 = com.google.javascript.jscomp.NodeUtil.referencesThis(node55);
        boolean boolean71 = com.google.javascript.jscomp.NodeUtil.isAssign(node55);
        boolean boolean72 = com.google.javascript.jscomp.NodeUtil.referencesThis(node55);
        com.google.javascript.rhino.Node node76 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean77 = com.google.javascript.jscomp.NodeUtil.isAssign(node76);
        boolean boolean78 = com.google.javascript.jscomp.NodeUtil.isExprCall(node76);
        java.lang.String[] strArray80 = new java.lang.String[] { "^" };
        java.util.LinkedHashSet<java.lang.String> strSet81 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet81, strArray80);
        boolean boolean83 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node76, (java.util.Set<java.lang.String>) strSet81);
        boolean boolean84 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node55, (java.util.Set<java.lang.String>) strSet81);
        boolean boolean85 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node45, (java.util.Set<java.lang.String>) strSet81);
        boolean boolean86 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node36, (java.util.Set<java.lang.String>) strSet81);
        boolean boolean87 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node14, (java.util.Set<java.lang.String>) strSet81);
        boolean boolean88 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node3, (java.util.Set<java.lang.String>) strSet81);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean89 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test67");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssign(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExprCall(node4);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", node4, "^");
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.containsFunctionDeclaration(node8);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isFunction(node8);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.referencesThis(node8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node8);
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test68");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node3, (int) (byte) -1);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test69");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isExprCall(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isGet(node3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test70");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssign(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExprCall(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isFunction(node4);
        int int9 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node4, (int) (byte) 10);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isVar(node4);
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newName("$$constant", node4, "$$constant");
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isGet(node4);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isAssign(node4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node4);
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test71");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isVar(node4);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node10);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node10);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node4, node10);
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newName("||", node4, "^");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.getAssignedValue(node16);
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test72");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isExprCall(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isFunction(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.containsCall(node3);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isConstantName(node3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node3);
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test73");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isExprCall(node3);
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node3);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node3);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.referencesThis(node3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test74");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node3, (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test75");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssign(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExprCall(node4);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", node4, "^");
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isExprCall(node8);
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
        com.google.javascript.rhino.Node node34 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node34);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node34);
        com.google.javascript.rhino.Node node40 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        com.google.javascript.rhino.Node node45 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isAssign(node45);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isExprCall(node45);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isGet(node45);
        com.google.javascript.rhino.Node node49 = com.google.javascript.jscomp.NodeUtil.newName("^", node45);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isLhs(node40, node49);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node34, node49);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node49, (int) (byte) 10);
        com.google.javascript.rhino.Node node58 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node58);
        java.lang.String str60 = com.google.javascript.jscomp.NodeUtil.getSourceName(node58);
        java.lang.String str61 = com.google.javascript.jscomp.NodeUtil.getStringValue(node58);
        com.google.javascript.rhino.Node node66 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean67 = com.google.javascript.jscomp.NodeUtil.isAssign(node66);
        boolean boolean68 = com.google.javascript.jscomp.NodeUtil.isExprCall(node66);
        com.google.javascript.rhino.Node node70 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", node66, "^");
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node58, node70);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType74 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 0);
        boolean boolean75 = com.google.javascript.jscomp.NodeUtil.containsType(node70, 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType74);
        boolean boolean76 = com.google.javascript.jscomp.NodeUtil.containsType(node49, (int) (byte) 10, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType74);
        boolean boolean77 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node14, "Pure functions:\n\n", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType74);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType80 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType(1);
        boolean boolean81 = com.google.javascript.jscomp.NodeUtil.containsType(node14, (int) (byte) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType80);
        boolean boolean82 = com.google.javascript.jscomp.NodeUtil.containsType(node8, (int) (byte) -1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType80);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node83 = com.google.javascript.jscomp.NodeUtil.getAssignedValue(node8);
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test76");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssign(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExprCall(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isFunction(node4);
        int int9 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node4, (int) (byte) 10);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isVar(node4);
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newName("$$constant", node4, "$$constant");
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node4);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isFunction(node4);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.containsFunctionDeclaration(node4);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isNodeTypeReferenced(node4, 15);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node4);
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(node23);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isVar(node23);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node23);
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("%=", node23, "%=");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str29 = com.google.javascript.jscomp.NodeUtil.getFunctionName(node4, node23);
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test77");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node4);
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newName("", node4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.getAssignedValue(node4);
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test78");
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
        com.google.javascript.rhino.Node node49 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node49);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node49);
        com.google.javascript.rhino.Node node52 = com.google.javascript.jscomp.NodeUtil.newName("", node49);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str53 = com.google.javascript.jscomp.NodeUtil.getFunctionName(node35, node49);
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test79");
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
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.referencesThis(node4);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isAssign(node4);
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("$$constant", node4, "instanceof");
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node22);
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isAssign(node27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isExprCall(node27);
        com.google.javascript.rhino.JSDocInfo jSDocInfo30 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node27);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node27);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isGetProp(node27);
        com.google.javascript.rhino.Node node39 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node39);
        java.lang.String str41 = com.google.javascript.jscomp.NodeUtil.getSourceName(node39);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node39);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isGetProp(node39);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node39);
        com.google.javascript.rhino.Node node46 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", node39, "||");
        com.google.javascript.rhino.Node node50 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isAssign(node50);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isExprCall(node50);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.isFunction(node50);
        int int55 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node50, (int) (byte) 10);
        boolean boolean56 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node50);
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node50);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node39, node50, "^");
        com.google.javascript.rhino.Node node60 = com.google.javascript.jscomp.NodeUtil.newVarNode("$$constant", node39);
        com.google.javascript.rhino.Node node61 = com.google.javascript.jscomp.NodeUtil.newName("", node39);
        boolean boolean62 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node27, node61);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str63 = com.google.javascript.jscomp.NodeUtil.getFunctionName(node22, node27);
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test80");
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
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.getAssignedValue(node3);
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test81");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(node69);
    }

    @Test
    public void test82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test82");
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
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isName(node4);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isAnonymousFunction(node4);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node4);
        com.google.javascript.rhino.Node node36 = com.google.javascript.jscomp.NodeUtil.newName("$$constant", node4, "undefined");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node36);
    }

    @Test
    public void test83() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test83");
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
        com.google.javascript.rhino.Node node52 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node52);
        java.lang.String str54 = com.google.javascript.jscomp.NodeUtil.getSourceName(node52);
        java.lang.String str55 = com.google.javascript.jscomp.NodeUtil.getStringValue(node52);
        com.google.javascript.rhino.Node node57 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", node52, "");
        com.google.javascript.rhino.Node node58 = com.google.javascript.jscomp.NodeUtil.newVarNode("$$constant", node52);
        com.google.javascript.rhino.Node node62 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.isAssign(node62);
        com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(node62);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node52, node62);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType68 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (byte) -1);
        boolean boolean69 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node62, "", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType68);
        boolean boolean70 = com.google.javascript.jscomp.NodeUtil.containsType(node18, (int) '#', (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType68);
        boolean boolean71 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean72 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node18);
    }

    @Test
    public void test84() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test84");
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
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.isNew(node56);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node56);
    }

    @Test
    public void test85() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test85");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isExprCall(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isGet(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node3, (int) (byte) 0);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node3);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isFunction(node3);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node3, "^");
        com.google.javascript.rhino.JSDocInfo jSDocInfo13 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node3);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isGetProp(node3);
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node19);
        java.lang.String str21 = com.google.javascript.jscomp.NodeUtil.getSourceName(node19);
        java.lang.String str22 = com.google.javascript.jscomp.NodeUtil.getStringValue(node19);
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", node19, "");
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isNodeTypeReferenced(node19, (int) (short) 100);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node19);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node19);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node19);
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isAssign(node33);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isExprCall(node33);
        com.google.javascript.rhino.JSDocInfo jSDocInfo36 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node33);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node33);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType40 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType(1);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node33, "hi!", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType40);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node33, "$$constant");
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node19, node33);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str45 = com.google.javascript.jscomp.NodeUtil.getFunctionName(node3, node33);
    }

    @Test
    public void test86() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test86");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.getAssignedValue(node4);
    }

    @Test
    public void test87() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test87");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssign(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExprCall(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isFunction(node4);
        int int9 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node4, (int) (byte) 10);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isVar(node4);
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newName("$$constant", node4, "$$constant");
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isAssign(node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isExprCall(node16);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isGet(node16);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node16, (int) (byte) 0);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isExprCall(node16);
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node28);
        java.lang.String str30 = com.google.javascript.jscomp.NodeUtil.getSourceName(node28);
        java.lang.String str31 = com.google.javascript.jscomp.NodeUtil.getStringValue(node28);
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", node28, "");
        com.google.javascript.rhino.Node node34 = com.google.javascript.jscomp.NodeUtil.newVarNode("$$constant", node28);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isFunctionAnonymous(node28);
        com.google.javascript.rhino.Node node39 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node39);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isAssign(node39);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node39, "hi!");
        com.google.javascript.rhino.Node node48 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.isAssign(node48);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isExprCall(node48);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isGet(node48);
        com.google.javascript.rhino.Node node52 = com.google.javascript.jscomp.NodeUtil.newName("^", node48);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node39, node52);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.referencesThis(node39);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.isAssign(node39);
        boolean boolean56 = com.google.javascript.jscomp.NodeUtil.referencesThis(node39);
        com.google.javascript.rhino.Node node60 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.isAssign(node60);
        boolean boolean62 = com.google.javascript.jscomp.NodeUtil.isExprCall(node60);
        java.lang.String[] strArray64 = new java.lang.String[] { "^" };
        java.util.LinkedHashSet<java.lang.String> strSet65 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet65, strArray64);
        boolean boolean67 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node60, (java.util.Set<java.lang.String>) strSet65);
        boolean boolean68 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node39, (java.util.Set<java.lang.String>) strSet65);
        boolean boolean69 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node28, (java.util.Set<java.lang.String>) strSet65);
        boolean boolean70 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node16, (java.util.Set<java.lang.String>) strSet65);
        boolean boolean71 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node12, (java.util.Set<java.lang.String>) strSet65);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean72 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node12);
    }

    @Test
    public void test88() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test88");
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
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isGetProp(node38);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node38, "hi!");
        com.google.javascript.rhino.Node node50 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        com.google.javascript.rhino.Node node55 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean56 = com.google.javascript.jscomp.NodeUtil.isAssign(node55);
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.isExprCall(node55);
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.isGet(node55);
        com.google.javascript.rhino.Node node59 = com.google.javascript.jscomp.NodeUtil.newName("^", node55);
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.isLhs(node50, node59);
        com.google.javascript.rhino.Node node64 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean65 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node64);
        boolean boolean67 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node64, (int) (short) 0);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node59, node64);
        boolean boolean69 = com.google.javascript.jscomp.NodeUtil.isThis(node59);
        boolean boolean70 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(node59);
        boolean boolean71 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(node59);
        com.google.javascript.rhino.Node node76 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean77 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node76);
        boolean boolean78 = com.google.javascript.jscomp.NodeUtil.isAssign(node76);
        boolean boolean80 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node76, "hi!");
        com.google.javascript.rhino.Node node85 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean86 = com.google.javascript.jscomp.NodeUtil.isAssign(node85);
        boolean boolean87 = com.google.javascript.jscomp.NodeUtil.isExprCall(node85);
        boolean boolean88 = com.google.javascript.jscomp.NodeUtil.isGet(node85);
        com.google.javascript.rhino.Node node89 = com.google.javascript.jscomp.NodeUtil.newName("^", node85);
        boolean boolean90 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node76, node89);
        boolean boolean91 = com.google.javascript.jscomp.NodeUtil.referencesThis(node76);
        boolean boolean92 = com.google.javascript.jscomp.NodeUtil.isAssign(node76);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType95 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType(1);
        boolean boolean96 = com.google.javascript.jscomp.NodeUtil.isNodeTypeReferenced(node76, 6, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType95);
        int int97 = matchNodeType95.type;
        boolean boolean98 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node59, "Pure functions:\n\n", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType95);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str99 = com.google.javascript.jscomp.NodeUtil.getFunctionName(node38, node59);
    }

    @Test
    public void test89() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test89");
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node5);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getSourceName(node5);
        java.lang.String str8 = com.google.javascript.jscomp.NodeUtil.getStringValue(node5);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", node5, "");
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newVarNode("$$constant", node5);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isFunctionAnonymous(node5);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node5);
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isAssign(node18);
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newName("", node18, "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str23 = com.google.javascript.jscomp.NodeUtil.getFunctionName(node5, node18);
    }

    @Test
    public void test90() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test90");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssign(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExprCall(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isGet(node4);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newName("^", node4);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.containsCall(node4);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isThis(node4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node4);
    }

    @Test
    public void test91() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test91");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isName(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isConstantName(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.referencesThis(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node3);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isGet(node3);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
    }

    @Test
    public void test92() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test92");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isLabelName(node12);
    }

    @Test
    public void test93() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test93");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isExprCall(node3);
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isNew(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node3);
    }

    @Test
    public void test94() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test94");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", (int) 'a', (int) (byte) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node3);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isVar(node3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node3);
    }
}

