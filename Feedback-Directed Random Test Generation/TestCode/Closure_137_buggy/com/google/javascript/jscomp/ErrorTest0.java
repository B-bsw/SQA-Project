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
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node3, node7);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node3);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isConstantName(node3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node3);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node3, node7);
        int int10 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node3, "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType6 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.containsType(node3, (int) (short) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node3, node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node3);
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node13, node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isLhs(node3, node17);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.referencesThis(node17);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType23 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        int int24 = matchNodeType23.type;
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node17, "||", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType23);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isGet(node17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isLabelName(node17);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node3, node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node3);
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node13, node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isLhs(node3, node17);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isForIn(node17);
        int int22 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node17, (-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isLabelName(node17);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node3, node7);
        int int10 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node3, "");
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node3);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node3);
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node16, node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node16);
        int int24 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node16, "hi!");
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node16, (int) (byte) 0);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isAssign(node16);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isVar(node16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str29 = com.google.javascript.jscomp.NodeUtil.getFunctionName(node3, node16);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node3, node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node3);
        int int11 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node3, "hi!");
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType18 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.containsType(node15, (int) (short) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node3, node15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.getAssignedValue(node15);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node3, node7);
        int int10 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node3, "");
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node3);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection12 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node3, node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node3);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isNew(node3);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isThis(node3);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isFunction(node3);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node3);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isCall(node3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.getAssignedValue(node3);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node3, node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node3);
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node13, node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isLhs(node3, node17);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isVar(node3);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isGetProp(node3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node3, node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node3);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isNew(node3);
        java.lang.String str11 = com.google.javascript.jscomp.NodeUtil.getSourceName(node3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node3);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node3, node7);
        int int10 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node3, "");
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isCall(node3);
        java.lang.String str12 = com.google.javascript.jscomp.NodeUtil.getStringValue(node3);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(node3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.getAssignedValue(node3);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node3, node7);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node3);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isConstantName(node3);
        java.lang.String[] strArray12 = new java.lang.String[] { "||" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node3, (java.util.Set<java.lang.String>) strSet13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node3, node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node3);
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node13, node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isLhs(node3, node17);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isForIn(node3);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.containsFunctionDeclaration(node3);
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node29 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node25, node29);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node25);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isNew(node25);
        java.lang.String[] strArray34 = new java.lang.String[] { "||" };
        java.util.LinkedHashSet<java.lang.String> strSet35 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet35, strArray34);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node25, (java.util.Set<java.lang.String>) strSet35);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node3, (java.util.Set<java.lang.String>) strSet35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("instanceof", 32, (int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node3, node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node3);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isNew(node3);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isThis(node3);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isFunction(node3);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node3);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isCall(node3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node3);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node3, node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node3);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isNew(node3);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node3);
        com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(node3);
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("$$", (int) '#', (int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str17 = com.google.javascript.jscomp.NodeUtil.getFunctionName(node3, node16);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("||", (int) (short) -1, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node3, node7);
        int int10 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node3, "");
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node3);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.getAssignedValue(node3);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node3, node7);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType11 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.containsType(node7, (int) (short) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType11);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType14 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        int int15 = matchNodeType14.type;
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node19, node23);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType27 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.containsType(node23, (int) (short) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.has(node7, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType14, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node7);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node3);
        java.lang.String str5 = com.google.javascript.jscomp.NodeUtil.getStringValue(node3);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType12 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.containsType(node9, (int) (short) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node9);
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node18, node22);
        int int25 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node18, "");
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node34 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node30, node34);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType38 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.containsType(node34, (int) (short) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType38);
        com.google.javascript.rhino.Node node44 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType47 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.containsType(node44, (int) (short) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType47);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.containsType(node34, (int) 'a', (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType47);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.containsType(node18, (int) ' ', (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType47);
        com.google.javascript.rhino.Node node54 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType57 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.containsType(node54, (int) (short) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType57);
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node54);
        com.google.javascript.rhino.Node node63 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node67 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean68 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node63, node67);
        com.google.javascript.rhino.Node node69 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node63);
        boolean boolean70 = com.google.javascript.jscomp.NodeUtil.isConstantName(node63);
        java.lang.String[] strArray72 = new java.lang.String[] { "||" };
        java.util.LinkedHashSet<java.lang.String> strSet73 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet73, strArray72);
        boolean boolean75 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node63, (java.util.Set<java.lang.String>) strSet73);
        boolean boolean76 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node54, (java.util.Set<java.lang.String>) strSet73);
        boolean boolean77 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node18, (java.util.Set<java.lang.String>) strSet73);
        boolean boolean78 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node9, (java.util.Set<java.lang.String>) strSet73);
        boolean boolean79 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node3, (java.util.Set<java.lang.String>) strSet73);
        boolean boolean80 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node81 = com.google.javascript.jscomp.NodeUtil.getAssignedValue(node3);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node4, node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node4);
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node14, node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isLhs(node4, node18);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isForIn(node18);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isExprCall(node18);
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node26, node30);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType34 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.containsType(node30, (int) (short) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType34);
        com.google.javascript.rhino.Node node40 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType43 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.containsType(node40, (int) (short) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType43);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.containsType(node30, (int) 'a', (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType43);
        java.lang.String str46 = com.google.javascript.jscomp.NodeUtil.getStringValue(node30);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node18, node30);
        com.google.javascript.rhino.Node node49 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("typeof", node30, "hi!");
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node49, "^");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node49);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node4, node8);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node4);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isConstantName(node4);
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node16, node20);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType24 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.containsType(node20, (int) (short) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.containsType(node4, (int) '4', (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType24);
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newName("$$", node4);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isAssign(node27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isLabelName(node27);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node3);
        java.lang.String str5 = com.google.javascript.jscomp.NodeUtil.getStringValue(node3);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType12 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.containsType(node9, (int) (short) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node9);
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node18, node22);
        int int25 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node18, "");
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node34 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node30, node34);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType38 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.containsType(node34, (int) (short) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType38);
        com.google.javascript.rhino.Node node44 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType47 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.containsType(node44, (int) (short) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType47);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.containsType(node34, (int) 'a', (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType47);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.containsType(node18, (int) ' ', (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType47);
        com.google.javascript.rhino.Node node54 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType57 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.containsType(node54, (int) (short) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType57);
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node54);
        com.google.javascript.rhino.Node node63 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node67 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean68 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node63, node67);
        com.google.javascript.rhino.Node node69 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node63);
        boolean boolean70 = com.google.javascript.jscomp.NodeUtil.isConstantName(node63);
        java.lang.String[] strArray72 = new java.lang.String[] { "||" };
        java.util.LinkedHashSet<java.lang.String> strSet73 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet73, strArray72);
        boolean boolean75 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node63, (java.util.Set<java.lang.String>) strSet73);
        boolean boolean76 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node54, (java.util.Set<java.lang.String>) strSet73);
        boolean boolean77 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node18, (java.util.Set<java.lang.String>) strSet73);
        boolean boolean78 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node9, (java.util.Set<java.lang.String>) strSet73);
        boolean boolean79 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node3, (java.util.Set<java.lang.String>) strSet73);
        boolean boolean80 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node81 = com.google.javascript.jscomp.NodeUtil.getAssignedValue(node3);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node3, node7);
        int int10 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node3, "");
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isCall(node3);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isExprCall(node3);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node3);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node4, node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node4);
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node14, node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isLhs(node4, node18);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isForIn(node18);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isExprCall(node18);
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node26, node30);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType34 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.containsType(node30, (int) (short) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType34);
        com.google.javascript.rhino.Node node40 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType43 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.containsType(node40, (int) (short) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType43);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.containsType(node30, (int) 'a', (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType43);
        java.lang.String str46 = com.google.javascript.jscomp.NodeUtil.getStringValue(node30);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node18, node30);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node18);
        com.google.javascript.rhino.Node node50 = com.google.javascript.jscomp.NodeUtil.newName("hi!", node18, "$$");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isLabelName(node18);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node4, node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node4);
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newName("", node4);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isConstantName(node4);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isString(node4);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node4);
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode();
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.containsFunctionDeclaration(node15);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isString(node15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str18 = com.google.javascript.jscomp.NodeUtil.getFunctionName(node4, node15);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node5, node9);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType13 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.containsType(node9, (int) (short) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType13);
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType22 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.containsType(node19, (int) (short) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.containsType(node9, (int) 'a', (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType22);
        java.lang.String str25 = com.google.javascript.jscomp.NodeUtil.getStringValue(node9);
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node9);
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("instanceof", node26, "instanceof");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str29 = com.google.javascript.jscomp.NodeUtil.getPrototypePropertyName(node26);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node3);
        java.lang.String str5 = com.google.javascript.jscomp.NodeUtil.getStringValue(node3);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node9, node13);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType17 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.containsType(node13, (int) (short) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType17);
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType26 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.containsType(node23, (int) (short) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType26);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.containsType(node13, (int) 'a', (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType26);
        java.lang.String str29 = com.google.javascript.jscomp.NodeUtil.getStringValue(node13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str30 = com.google.javascript.jscomp.NodeUtil.getFunctionName(node3, node13);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node3, node7);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node3);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isConstantName(node3);
        java.lang.String[] strArray12 = new java.lang.String[] { "||" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node3, (java.util.Set<java.lang.String>) strSet13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node3);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node3, node7);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node3);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isConstantName(node3);
        java.lang.String[] strArray12 = new java.lang.String[] { "||" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node3, (java.util.Set<java.lang.String>) strSet13);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isAnonymousFunction(node3);
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node21, node25);
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node21);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isConstantName(node21);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.containsFunctionDeclaration(node21);
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newName("", node21);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isExprCall(node21);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node3, node21, "hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node3, node7);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node3);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isConstantName(node3);
        java.lang.String[] strArray12 = new java.lang.String[] { "||" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node3, (java.util.Set<java.lang.String>) strSet13);
        int int17 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node3, 52);
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node21);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str24 = com.google.javascript.jscomp.NodeUtil.getFunctionName(node3, node21);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType6 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.containsType(node3, (int) (short) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.getAssignedValue(node3);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node3, node7);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node3);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isConstantName(node3);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.containsFunctionDeclaration(node3);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.getAssignedValue(node3);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node3, node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node3);
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node13, node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isLhs(node3, node17);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isGet(node17);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(node17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.getAssignedValue(node17);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node3, node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.containsFunctionDeclaration(node3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node3, node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node3);
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node13, node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isLhs(node3, node17);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isForIn(node17);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isConstantName(node17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isLabelName(node17);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("instanceof", (int) (short) -1, 52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.getAssignedValue(node3);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("instanceof", (int) (short) -1, 52);
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newName("$$", node4, "");
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node4);
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node12, node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node12);
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newName("", node12);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node12);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType22 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) ' ');
        int int23 = com.google.javascript.jscomp.NodeUtil.getCount(node12, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType22);
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newExpr(node12);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isConstantName(node24);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.referencesThis(node24);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str29 = com.google.javascript.jscomp.NodeUtil.getFunctionName(node4, node24);
    }
}

