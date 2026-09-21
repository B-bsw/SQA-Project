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
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node1);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node6);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node5, node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node1, node5);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node1);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node1);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node1, abstractCompiler12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node1);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isExprCall(node1);
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node1);
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.getLoopCodeBlock(node1);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node1);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node6);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node5, node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node1, node5);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node1);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node1);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node1, abstractCompiler12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node1);
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node1);
        java.lang.Double double16 = com.google.javascript.jscomp.NodeUtil.getNumberValue(node15);
        java.lang.String str17 = com.google.javascript.jscomp.NodeUtil.getStringValue(node15);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isFunction(node15);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "undefined" + "'", str17, "undefined");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isVar(node1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isNew(node1);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node1);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node1);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newExpr(node1);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isLabelName(node1);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node1);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node1);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node7);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node12);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node11, node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node7, node11);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node7);
        com.google.javascript.jscomp.NodeUtil.MatchNotFunction matchNotFunction18 = new com.google.javascript.jscomp.NodeUtil.MatchNotFunction();
        int int19 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node1, (int) (byte) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNotFunction18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node21);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection23 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node21);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node21);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isThis(node21);
        boolean boolean26 = matchNotFunction18.apply(node21);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node27);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node29);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node28, node30);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node28);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.rhino.Node node34 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node33);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node34);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node34);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.rhino.Node node38 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node37);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.rhino.Node node40 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node39);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node38, node40);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node34, node38);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node28, node34);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.rhino.Node node45 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node44);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.rhino.Node node47 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node46);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node45, node47);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.isVar(node45);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isNew(node45);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node45);
        int int53 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node45, "undefined");
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node28, node45);
        com.google.javascript.rhino.Node node55 = null;
        com.google.javascript.rhino.Node node56 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node55);
        com.google.javascript.rhino.Node node57 = null;
        com.google.javascript.rhino.Node node58 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node57);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node56, node58);
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node56);
        com.google.javascript.rhino.Node node61 = null;
        com.google.javascript.rhino.Node node62 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node61);
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node62);
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node62);
        com.google.javascript.rhino.Node node65 = null;
        com.google.javascript.rhino.Node node66 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node65);
        com.google.javascript.rhino.Node node67 = null;
        com.google.javascript.rhino.Node node68 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node67);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node66, node68);
        boolean boolean70 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node62, node66);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node56, node62);
        com.google.javascript.rhino.Node node72 = null;
        com.google.javascript.rhino.Node node73 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node72);
        com.google.javascript.rhino.Node node74 = null;
        com.google.javascript.rhino.Node node75 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node74);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node73, node75);
        boolean boolean77 = com.google.javascript.jscomp.NodeUtil.isVar(node73);
        boolean boolean78 = com.google.javascript.jscomp.NodeUtil.isNew(node73);
        boolean boolean79 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node73);
        int int81 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node73, "undefined");
        boolean boolean82 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node56, node73);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node45, node73);
        boolean boolean84 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node73);
        boolean boolean85 = matchNotFunction18.apply(node73);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue86 = com.google.javascript.jscomp.NodeUtil.getExpressionBooleanValue(node73);
        boolean boolean88 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node73, "hi!");
        boolean boolean89 = com.google.javascript.jscomp.NodeUtil.isName(node73);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str90 = com.google.javascript.jscomp.NodeUtil.getFunctionName(node73);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: NUMBER 0.0 is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(nodeCollection23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(ternaryValue86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isVar(node1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isNew(node1);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isExprCall(node1);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.containsFunction(node1);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node1, abstractCompiler9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isNew(node1);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isGetProp(node1);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node14);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node14);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node19);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node18, node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node14, node18);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node23);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node25);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node24, node26);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate28 = null;
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node26, nodePredicate28);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node26);
        com.google.javascript.rhino.Node node31 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node26);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue32 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node26);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType34 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) ' ');
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node26, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType34);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node14, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType34);
        int int37 = matchNodeType34.type;
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType34);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node1, "hi!");
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node1);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNotNull(ternaryValue32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 32 + "'", int37 == 32);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isAssign(node1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node1);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node7);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node6, node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node6);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node12);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node17);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node16, node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node12, node16);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node6, node12);
        com.google.javascript.jscomp.NodeUtil.MatchNotFunction matchNotFunction23 = new com.google.javascript.jscomp.NodeUtil.MatchNotFunction();
        int int24 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node6, (int) (byte) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNotFunction23);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node25);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node26);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection28 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node26);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node26);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isThis(node26);
        boolean boolean31 = matchNotFunction23.apply(node26);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isLhs(node1, node26);
        java.lang.String str33 = com.google.javascript.jscomp.NodeUtil.getSourceName(node1);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node1);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node1);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(nodeCollection28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection5 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node3);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node3, abstractCompiler6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCallOrApply(node3);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node12);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node11, node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node11);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node17);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node22);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node21, node23);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node17, node21);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node11, node17);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node27);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node29);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node28, node30);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isVar(node28);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isNew(node28);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node28);
        int int36 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node28, "undefined");
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node11, node28);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node3, node11);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isNew(node11);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.rhino.Node node41 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node40);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.rhino.Node node43 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node42);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.rhino.Node node45 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node44);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node43, node45);
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.rhino.Node node48 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node47);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.rhino.Node node50 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node49);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node48, node50);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isVar(node48);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.isLhs(node43, node48);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.isLhs(node40, node48);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.isCall(node48);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node11, node48);
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node48);
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.isGetProp(node48);
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.containsCall(node48);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeCollection5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isVar(node1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isNew(node1);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isExprCall(node1);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node1, abstractCompiler8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node1);
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node1);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.google.javascript.jscomp.NodeUtil.functionCallHasSideEffects(node11, abstractCompiler12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected CALL node, got VOID");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection5 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node3);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration6 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node8);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node13);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node12, node14);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate16 = null;
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node14, nodePredicate16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node14);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node20);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler22 = null;
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node20, abstractCompiler22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isVar(node20);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node27);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node26, node28);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isVar(node26);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isNew(node26);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node26);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node26);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.rhino.Node node37 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node36);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node35, node37);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.rhino.Node node40 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node39);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.rhino.Node node42 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node41);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node40, node42);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isVar(node40);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isLhs(node35, node40);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.rhino.Node node47 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node46);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.rhino.Node node49 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node48);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node47, node49);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isVar(node47);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isNew(node47);
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.rhino.Node node54 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node53);
        com.google.javascript.rhino.Node node55 = null;
        com.google.javascript.rhino.Node node56 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node55);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node54, node56);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate58 = null;
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node56, nodePredicate58);
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node56);
        boolean boolean62 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node56, false);
        com.google.javascript.rhino.Node[] nodeArray63 = new com.google.javascript.rhino.Node[] { node14, node20, node26, node35, node47, node56 };
        com.google.javascript.rhino.Node node64 = com.google.javascript.jscomp.NodeUtil.newCallNode(node8, nodeArray63);
        com.google.javascript.rhino.Node node65 = null;
        com.google.javascript.rhino.Node node66 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node65);
        com.google.javascript.rhino.Node node67 = null;
        com.google.javascript.rhino.Node node68 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node67);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node66, node68);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate70 = null;
        boolean boolean71 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node68, nodePredicate70);
        boolean boolean72 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node68);
        com.google.javascript.rhino.Node node73 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node68);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue74 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node68);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType76 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) ' ');
        boolean boolean77 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node68, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType76);
        boolean boolean78 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node8, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType76);
        boolean boolean79 = com.google.javascript.jscomp.NodeUtil.isGet(node8);
        java.lang.String str80 = com.google.javascript.jscomp.NodeUtil.getStringValue(node8);
        boolean boolean81 = matchDeclaration6.apply(node8);
        boolean boolean82 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node3, node8);
        boolean boolean83 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node3);
        com.google.javascript.rhino.Node node84 = com.google.javascript.jscomp.NodeUtil.getLoopCodeBlock(node3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean85 = com.google.javascript.jscomp.NodeUtil.isStatement(node84);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeCollection5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(nodeArray63);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNull(node73);
        org.junit.Assert.assertNotNull(ternaryValue74);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "undefined" + "'", str80, "undefined");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNull(node84);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node1);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node7);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node12);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node11, node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node7, node11);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node7);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node19);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node18, node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isVar(node18);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isNew(node18);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node18);
        int int26 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node18, "undefined");
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node1, node18);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node30);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node29, node31);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node29);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node34);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node35);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node35);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.rhino.Node node39 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.rhino.Node node41 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node40);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node39, node41);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node35, node39);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node29, node35);
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.rhino.Node node46 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node45);
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.rhino.Node node48 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node47);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node46, node48);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isVar(node46);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isNew(node46);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node46);
        int int54 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node46, "undefined");
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node29, node46);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node18, node46);
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node18);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node1);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node7);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node12);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node11, node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node7, node11);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node7);
        com.google.javascript.jscomp.NodeUtil.MatchNotFunction matchNotFunction18 = new com.google.javascript.jscomp.NodeUtil.MatchNotFunction();
        int int19 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node1, (int) (byte) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNotFunction18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node21);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node21);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node26);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node25, node27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node21, node25);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node25);
        java.lang.String[] strArray33 = new java.lang.String[] { "undefined", "" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node25, (java.util.Set<java.lang.String>) strSet34);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType38 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 100);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType40 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) ' ');
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.rhino.Node node42 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node41);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node43);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node42, node44);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate46 = null;
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node44, nodePredicate46);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node44);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node44, false);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isLabelName(node44);
        int int53 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node44, "undefined");
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node44);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node44);
        boolean boolean56 = matchNodeType40.apply(node44);
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.has(node25, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType38, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType40);
        boolean boolean58 = matchNotFunction18.apply(node25);
        com.google.javascript.rhino.Node node59 = null;
        com.google.javascript.rhino.Node node60 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node59);
        com.google.javascript.rhino.Node node61 = null;
        com.google.javascript.rhino.Node node62 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node61);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node60, node62);
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node60);
        com.google.javascript.rhino.Node node65 = null;
        com.google.javascript.rhino.Node node66 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node65);
        boolean boolean67 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node66);
        boolean boolean68 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node66);
        com.google.javascript.rhino.Node node69 = null;
        com.google.javascript.rhino.Node node70 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node69);
        com.google.javascript.rhino.Node node71 = null;
        com.google.javascript.rhino.Node node72 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node71);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node70, node72);
        boolean boolean74 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node66, node70);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node60, node66);
        boolean boolean76 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node66);
        boolean boolean77 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node66);
        boolean boolean78 = matchNotFunction18.apply(node66);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node80 = com.google.javascript.jscomp.NodeUtil.getArgumentForCallOrNew(node66, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "undefined", "" });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node1);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node6);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node5, node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node1, node5);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node5);
        java.lang.String[] strArray13 = new java.lang.String[] { "undefined", "" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node5, (java.util.Set<java.lang.String>) strSet14);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node5);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node5);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node5, "typeof");
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newExpr(node5);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isGet(node5);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node5);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "undefined", "" });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node3);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node2, node4);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate6 = null;
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node4, nodePredicate6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node4);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node4, false);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isLabelName(node4);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.referencesThis(node4);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node4);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node16);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node15, node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isVar(node15);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isNew(node15);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node15);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node15);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node15);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isLhs(node4, node15);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.containsFunction(node4);
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node4);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node26);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node1);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node7);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node12);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node11, node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node7, node11);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node7);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node19);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node18, node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isVar(node18);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isNew(node18);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node18);
        int int26 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node18, "undefined");
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node1, node18);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node1);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.containsCall(node1);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node30);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node31);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler33 = null;
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node31, abstractCompiler33);
        java.lang.String str35 = com.google.javascript.jscomp.NodeUtil.getStringValue(node31);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.rhino.Node node37 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node36);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.rhino.Node node39 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node38);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node37, node39);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isVar(node37);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isNew(node37);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isExprCall(node37);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node31, node37);
        java.lang.String str45 = com.google.javascript.jscomp.NodeUtil.getStringValue(node37);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node1, node37);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler47 = null;
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node1, abstractCompiler47);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "undefined" + "'", str35, "undefined");
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "undefined" + "'", str45, "undefined");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node1);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node1, abstractCompiler3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isString(node1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node1);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = com.google.javascript.jscomp.NodeUtil.getExpressionBooleanValue(node1);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node1);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(node1);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isAssign(node1);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node1);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node7);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node12);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node11, node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node7, node11);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node7);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node19);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node18, node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isVar(node18);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isNew(node18);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node18);
        int int26 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node18, "undefined");
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node1, node18);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node1);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.containsCall(node1);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node32);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node31, node33);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate35 = null;
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node33, nodePredicate35);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node33);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node33, false);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isLabelName(node33);
        int int42 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node33, "undefined");
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isGetProp(node33);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.rhino.Node node45 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node44);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node45);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node45);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.rhino.Node node49 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node48);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.rhino.Node node51 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node50);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node49, node51);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node45, node49);
        com.google.javascript.rhino.Node node54 = null;
        com.google.javascript.rhino.Node node55 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node54);
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.rhino.Node node57 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node56);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node55, node57);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate59 = null;
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node57, nodePredicate59);
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node57);
        com.google.javascript.rhino.Node node62 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node57);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue63 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node57);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType65 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) ' ');
        boolean boolean66 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node57, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType65);
        boolean boolean67 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node45, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType65);
        boolean boolean68 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node33, node45);
        boolean boolean69 = com.google.javascript.jscomp.NodeUtil.isLhs(node1, node33);
        com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(node1);
        boolean boolean71 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node1);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNull(node62);
        org.junit.Assert.assertNotNull(ternaryValue63);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node1);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node7);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node12);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node11, node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node7, node11);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node7);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node19);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node18, node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isVar(node18);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isNew(node18);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node18);
        int int26 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node18, "undefined");
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node1, node18);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node1);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.containsCall(node1);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node30);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node31);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler33 = null;
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node31, abstractCompiler33);
        java.lang.String str35 = com.google.javascript.jscomp.NodeUtil.getStringValue(node31);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.rhino.Node node37 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node36);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.rhino.Node node39 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node38);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node37, node39);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isVar(node37);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isNew(node37);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isExprCall(node37);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node31, node37);
        java.lang.String str45 = com.google.javascript.jscomp.NodeUtil.getStringValue(node37);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node1, node37);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler47 = null;
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node37, abstractCompiler47);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.isName(node37);
        java.lang.String str50 = com.google.javascript.jscomp.NodeUtil.getStringValue(node37);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "undefined" + "'", str35, "undefined");
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "undefined" + "'", str45, "undefined");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "undefined" + "'", str50, "undefined");
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        com.google.javascript.rhino.Node node0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.getArgumentForCallOrNew(node0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node2);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node2, abstractCompiler4);
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isExprCall(node6);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node1);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node7);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node12);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node11, node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node7, node11);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node7);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node19);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node18, node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isVar(node18);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isNew(node18);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node18);
        int int26 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node18, "undefined");
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node1, node18);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node30);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node29, node31);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node29);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node34);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node35);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node35);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.rhino.Node node39 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.rhino.Node node41 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node40);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node39, node41);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node35, node39);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node29, node35);
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.rhino.Node node46 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node45);
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.rhino.Node node48 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node47);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node46, node48);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isVar(node46);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isNew(node46);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node46);
        int int54 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node46, "undefined");
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node29, node46);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node18, node46);
        com.google.javascript.rhino.JSDocInfo jSDocInfo57 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node46);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(jSDocInfo57);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate5 = null;
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node3, nodePredicate5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node3, false);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        int int12 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node3, "undefined");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue13 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node3);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType15 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType(3);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node3, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType15);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isName(node3);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(ternaryValue13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node3);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node2, node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node4);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection7 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node4);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node4);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isLhs(node0, node4);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node4);
        com.google.javascript.rhino.Node node11 = null;
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node4, node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node4);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(nodeCollection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node1, false);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node6);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node5, node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isVar(node5);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isNew(node5);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue11 = com.google.javascript.jscomp.NodeUtil.getExpressionBooleanValue(node5);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node5);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node1, node5);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node5);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(ternaryValue11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node3);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection6 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isFunction(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isForIn(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunction(node3);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.getCatchBlock(node3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(nodeCollection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node7);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node6, node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isVar(node6);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isLhs(node1, node6);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node16);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node15, node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node21);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node20, node22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isVar(node20);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isLhs(node15, node20);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isLhs(node12, node20);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isThis(node20);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node20);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler29 = null;
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node20, abstractCompiler29);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isLhs(node1, node20);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.containsType(node20, 13);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isGet(node20);
        java.lang.Double double35 = com.google.javascript.jscomp.NodeUtil.getNumberValue(node20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: NUMBER 0.0 is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isVar(node1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isNew(node1);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isExprCall(node1);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.containsFunction(node1);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCallOrApply(node1);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node1);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node1, "|");
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.containsFunction(node1);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node1);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node1, abstractCompiler3);
        java.lang.String str5 = com.google.javascript.jscomp.NodeUtil.getStringValue(node1);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node8);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node7, node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isVar(node7);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isNew(node7);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isExprCall(node7);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node7);
        java.lang.String str15 = com.google.javascript.jscomp.NodeUtil.getStringValue(node7);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isFunction(node7);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node19);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node18, node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isVar(node18);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isNew(node18);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue24 = com.google.javascript.jscomp.NodeUtil.getExpressionBooleanValue(node18);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node18);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node28);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node27, node29);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isVar(node27);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isNew(node27);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isExprCall(node27);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.containsFunction(node27);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCallOrApply(node27);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node27);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isLhs(node18, node27);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isLabelName(node27);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node27, "^");
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node7, node27);
        java.lang.String[] strArray43 = new java.lang.String[] { "undefined" };
        java.util.LinkedHashSet<java.lang.String> strSet44 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet44, strArray43);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node7, (java.util.Set<java.lang.String>) strSet44);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType49 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType(15);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.containsType(node7, (int) '4', (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType49);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "undefined" + "'", str5, "undefined");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "undefined" + "'", str15, "undefined");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(ternaryValue24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "undefined" });
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isString(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isExprCall(node3);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node10);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection12 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node10);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.containsCall(node10);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isLhs(node3, node10);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node17);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node16, node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isVar(node16);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isNew(node16);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node16);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node16);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node26);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node25, node27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node25);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node30);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node31);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node31);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.rhino.Node node37 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node36);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node35, node37);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node31, node35);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node25, node31);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isNew(node31);
        com.google.javascript.rhino.Node[] nodeArray42 = new com.google.javascript.rhino.Node[] { node31 };
        com.google.javascript.rhino.Node node43 = com.google.javascript.jscomp.NodeUtil.newCallNode(node16, nodeArray42);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node43);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node3, node43);
        com.google.javascript.rhino.Node node46 = com.google.javascript.jscomp.NodeUtil.getLoopCodeBlock(node3);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(nodeCollection12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(nodeArray42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(node46);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isString(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node3);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.referencesThis(node3);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.containsFunction(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node13);
        java.lang.Double double16 = com.google.javascript.jscomp.NodeUtil.getNumberValue(node13);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.containsCall(node13);
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node13);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node3, node13);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node13);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler21 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = com.google.javascript.jscomp.NodeUtil.functionCallHasSideEffects(node13, abstractCompiler21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected CALL node, got VOID");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isAssign(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isExprCall(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node2, true);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node2);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newVarNode("undefined", node2);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isVar(node2);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.getFnParameters(node2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isVar(node1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isNew(node1);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node1);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node1);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection9 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node1);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node11);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node14);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node15);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node15);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node20);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node19, node21);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node15, node19);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node26);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node25, node27);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate29 = null;
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node27, nodePredicate29);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node27);
        com.google.javascript.rhino.Node node32 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node27);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue33 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node27);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType35 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) ' ');
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node27, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType35);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node15, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType35);
        int int38 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node11, (int) (byte) 1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType35);
        java.lang.String str39 = com.google.javascript.jscomp.NodeUtil.getStringValue(node11);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.rhino.Node node41 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node40);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node41);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.rhino.Node node45 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node44);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node45);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node45);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.rhino.Node node49 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node48);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.rhino.Node node51 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node50);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node49, node51);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node45, node49);
        com.google.javascript.rhino.Node node54 = null;
        com.google.javascript.rhino.Node node55 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node54);
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.rhino.Node node57 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node56);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node55, node57);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate59 = null;
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node57, nodePredicate59);
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node57);
        com.google.javascript.rhino.Node node62 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node57);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue63 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node57);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType65 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) ' ');
        boolean boolean66 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node57, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType65);
        boolean boolean67 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node45, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType65);
        int int68 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node41, (int) (byte) 1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType65);
        boolean boolean69 = com.google.javascript.jscomp.NodeUtil.isLhs(node11, node41);
        boolean boolean70 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node1, node41);
        java.lang.String[] strArray77 = new java.lang.String[] { "hi!", "JSCompiler_renameProperty", "typeof", "hi!", "hi!", "JSCompiler_renameProperty" };
        java.util.LinkedHashSet<java.lang.String> strSet78 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet78, strArray77);
        boolean boolean80 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node1, (java.util.Set<java.lang.String>) strSet78);
        boolean boolean81 = com.google.javascript.jscomp.NodeUtil.isLabelName(node1);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeCollection9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNotNull(ternaryValue33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "undefined" + "'", str39, "undefined");
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNull(node62);
        org.junit.Assert.assertNotNull(ternaryValue63);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertArrayEquals(strArray77, new java.lang.String[] { "hi!", "JSCompiler_renameProperty", "typeof", "hi!", "hi!", "JSCompiler_renameProperty" });
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isAssign(node1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isExprCall(node1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node1, true);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isAssign(node1);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node1);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node1);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node7);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node12);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node11, node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node7, node11);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node7);
        com.google.javascript.jscomp.NodeUtil.MatchNotFunction matchNotFunction18 = new com.google.javascript.jscomp.NodeUtil.MatchNotFunction();
        int int19 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node1, (int) (byte) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNotFunction18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node21);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node21);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node26);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node25, node27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node21, node25);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node25);
        java.lang.String[] strArray33 = new java.lang.String[] { "undefined", "" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node25, (java.util.Set<java.lang.String>) strSet34);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType38 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 100);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType40 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) ' ');
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.rhino.Node node42 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node41);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node43);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node42, node44);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate46 = null;
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node44, nodePredicate46);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node44);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node44, false);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isLabelName(node44);
        int int53 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node44, "undefined");
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node44);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node44);
        boolean boolean56 = matchNodeType40.apply(node44);
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.has(node25, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType38, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType40);
        boolean boolean58 = matchNotFunction18.apply(node25);
        com.google.javascript.rhino.Node node59 = null;
        com.google.javascript.rhino.Node node60 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node59);
        com.google.javascript.rhino.Node node61 = null;
        com.google.javascript.rhino.Node node62 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node61);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node60, node62);
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.isVar(node60);
        boolean boolean65 = com.google.javascript.jscomp.NodeUtil.isNew(node60);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue66 = com.google.javascript.jscomp.NodeUtil.getExpressionBooleanValue(node60);
        boolean boolean67 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node60);
        com.google.javascript.rhino.Node node68 = null;
        com.google.javascript.rhino.Node node69 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node68);
        com.google.javascript.rhino.Node node70 = null;
        com.google.javascript.rhino.Node node71 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node70);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node69, node71);
        boolean boolean73 = com.google.javascript.jscomp.NodeUtil.isVar(node69);
        boolean boolean74 = com.google.javascript.jscomp.NodeUtil.isNew(node69);
        boolean boolean75 = com.google.javascript.jscomp.NodeUtil.isExprCall(node69);
        boolean boolean76 = com.google.javascript.jscomp.NodeUtil.containsFunction(node69);
        boolean boolean77 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCallOrApply(node69);
        boolean boolean78 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node69);
        boolean boolean79 = com.google.javascript.jscomp.NodeUtil.isLhs(node60, node69);
        boolean boolean80 = matchNotFunction18.apply(node69);
        java.lang.String str81 = com.google.javascript.jscomp.NodeUtil.getSourceName(node69);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection82 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node69);
        boolean boolean83 = com.google.javascript.jscomp.NodeUtil.isCall(node69);
        boolean boolean84 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node69);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "undefined", "" });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(ternaryValue66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNull(str81);
        org.junit.Assert.assertNotNull(nodeCollection82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType1 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) ' ');
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node4);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node3, node5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node5);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection8 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node5);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunction(node5);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isForIn(node5);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isFunction(node5);
        boolean boolean12 = matchNodeType1.apply(node5);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node15);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node14, node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node19);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler21 = null;
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node19, abstractCompiler21);
        java.lang.String str23 = com.google.javascript.jscomp.NodeUtil.getStringValue(node19);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node26);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node25, node27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isVar(node25);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isNew(node25);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isExprCall(node25);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node19, node25);
        java.lang.String[] strArray39 = new java.lang.String[] { "^", "JSCompiler_renameProperty", "", "typeof", "", "^" };
        java.util.LinkedHashSet<java.lang.String> strSet40 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet40, strArray39);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node25, (java.util.Set<java.lang.String>) strSet40);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node14, (java.util.Set<java.lang.String>) strSet40);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isForIn(node14);
        boolean boolean45 = matchNodeType1.apply(node14);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(nodeCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "undefined" + "'", str23, "undefined");
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "^", "JSCompiler_renameProperty", "", "typeof", "", "^" });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isString(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node3);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node12);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node11, node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node17);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node16, node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isVar(node16);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isLhs(node11, node16);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node11);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node3, node11);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node26);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node25, node27);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate29 = null;
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node27, nodePredicate29);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node27);
        com.google.javascript.rhino.Node node32 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node27);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue33 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node27);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node27);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isCall(node27);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.rhino.Node node38 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node37);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.rhino.Node node40 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node39);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node38, node40);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isVar(node38);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isNew(node38);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isExprCall(node38);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.containsFunction(node38);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCallOrApply(node38);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node38);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement49 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        int int50 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node38, (int) (byte) -1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement49);
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.rhino.Node node52 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node51);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node52);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler54 = null;
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node52, abstractCompiler54);
        java.lang.String str56 = com.google.javascript.jscomp.NodeUtil.getStringValue(node52);
        boolean boolean57 = matchShallowStatement49.apply(node52);
        int int58 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node27, 10, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement49);
        java.lang.String str59 = com.google.javascript.jscomp.NodeUtil.getStringValue(node27);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node3, node27, "<=");
        boolean boolean62 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node27);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNotNull(ternaryValue33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "undefined" + "'", str56, "undefined");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "undefined" + "'", str59, "undefined");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate5 = null;
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node3, nodePredicate5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node3, false);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        int int12 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node3, "undefined");
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isGetProp(node3);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node14);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node15);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node15);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node20);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node19, node21);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node15, node19);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node26);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node25, node27);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate29 = null;
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node27, nodePredicate29);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node27);
        com.google.javascript.rhino.Node node32 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node27);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue33 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node27);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType35 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) ' ');
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node27, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType35);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node15, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType35);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node3, node15);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isConstantName(node3);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isVar(node3);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNotNull(ternaryValue33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isString(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node3);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node3);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isConstantName(node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.referencesThis(node10);
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newExpr(node10);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue14 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node13);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(ternaryValue14);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isString(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isConstantName(node3);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue9 = com.google.javascript.jscomp.NodeUtil.getExpressionBooleanValue(node3);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node12);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node11, node13);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate15 = null;
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node13, nodePredicate15);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node13);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node13, false);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isLabelName(node13);
        int int22 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node13, "undefined");
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node13);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node13, "|");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isControlStructureCodeBlock(node3, node13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(ternaryValue9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isString(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isExprCall(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = com.google.javascript.jscomp.NodeUtil.functionCallHasSideEffects(node3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected CALL node, got VOID");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration0 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node2);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node7);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node6, node8);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate10 = null;
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node8, nodePredicate10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node8);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node14);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler16 = null;
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node14, abstractCompiler16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isVar(node14);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node21);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node20, node22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isVar(node20);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isNew(node20);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node20);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node20);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node30);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node29, node31);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.rhino.Node node34 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node33);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.rhino.Node node36 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node35);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node34, node36);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isVar(node34);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isLhs(node29, node34);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.rhino.Node node41 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node40);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.rhino.Node node43 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node42);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node41, node43);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isVar(node41);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isNew(node41);
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.rhino.Node node48 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node47);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.rhino.Node node50 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node49);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node48, node50);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate52 = null;
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node50, nodePredicate52);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node50);
        boolean boolean56 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node50, false);
        com.google.javascript.rhino.Node[] nodeArray57 = new com.google.javascript.rhino.Node[] { node8, node14, node20, node29, node41, node50 };
        com.google.javascript.rhino.Node node58 = com.google.javascript.jscomp.NodeUtil.newCallNode(node2, nodeArray57);
        com.google.javascript.rhino.Node node59 = null;
        com.google.javascript.rhino.Node node60 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node59);
        com.google.javascript.rhino.Node node61 = null;
        com.google.javascript.rhino.Node node62 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node61);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node60, node62);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate64 = null;
        boolean boolean65 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node62, nodePredicate64);
        boolean boolean66 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node62);
        com.google.javascript.rhino.Node node67 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node62);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue68 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node62);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType70 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) ' ');
        boolean boolean71 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node62, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType70);
        boolean boolean72 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType70);
        boolean boolean73 = com.google.javascript.jscomp.NodeUtil.isGet(node2);
        java.lang.String str74 = com.google.javascript.jscomp.NodeUtil.getStringValue(node2);
        boolean boolean75 = matchDeclaration0.apply(node2);
        com.google.javascript.rhino.Node node76 = null;
        com.google.javascript.rhino.Node node77 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node76);
        com.google.javascript.rhino.Node node78 = null;
        com.google.javascript.rhino.Node node79 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node78);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node77, node79);
        boolean boolean81 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node79);
        boolean boolean82 = com.google.javascript.jscomp.NodeUtil.isString(node79);
        boolean boolean83 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node79);
        boolean boolean84 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node79);
        boolean boolean85 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node79);
        boolean boolean86 = matchDeclaration0.apply(node79);
        com.google.javascript.rhino.Node node87 = null;
        com.google.javascript.rhino.Node node88 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node87);
        com.google.javascript.rhino.Node node89 = null;
        com.google.javascript.rhino.Node node90 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node89);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node88, node90);
        boolean boolean92 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node88);
        boolean boolean93 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node88);
        boolean boolean94 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node88);
        boolean boolean95 = matchDeclaration0.apply(node88);
        boolean boolean96 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node88);
        boolean boolean97 = com.google.javascript.jscomp.NodeUtil.isVar(node88);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(nodeArray57);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNull(node67);
        org.junit.Assert.assertNotNull(ternaryValue68);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "undefined" + "'", str74, "undefined");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(node88);
        org.junit.Assert.assertNotNull(node90);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate5 = null;
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node3, nodePredicate5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node3, false);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        int int12 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node3, "undefined");
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node3);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node3);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate5 = null;
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node3, nodePredicate5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node3, false);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        int int12 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node3, "undefined");
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node3);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node3);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node3, "JSCompiler_renameProperty");
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node3);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node3);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node21);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node21);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node26);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node25, node27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node21, node25);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node21);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node21);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node21);
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node21);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.rhino.Node node37 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node36);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node35, node37);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isVar(node35);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isNew(node35);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node35);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.containsFunction(node35);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node21, node35, "");
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node35);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node3, node35, "||");
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.rhino.Node node49 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node48);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.rhino.Node node51 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node50);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node49, node51);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.isVar(node49);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.isNew(node49);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.isExprCall(node49);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler56 = null;
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node49, abstractCompiler56);
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node49);
        com.google.javascript.rhino.Node node59 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node49);
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.isLhs(node3, node49);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isString(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node3);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node3);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node13);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node12, node14);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate16 = null;
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node14, nodePredicate16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node14);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node14, false);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isLabelName(node14);
        int int23 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node14, "undefined");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue24 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node14);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node14);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node3, node14);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: NUMBER 0.0 is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(ternaryValue24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node1);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node6);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node5, node7);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate9 = null;
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node7, nodePredicate9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node7);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node13);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = null;
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node13, abstractCompiler15);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isVar(node13);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node20);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node19, node21);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isVar(node19);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isNew(node19);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node19);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node19);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node27);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node29);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node28, node30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node32);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node34);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node33, node35);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isVar(node33);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isLhs(node28, node33);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.rhino.Node node40 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node39);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.rhino.Node node42 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node41);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node40, node42);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isVar(node40);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isNew(node40);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.rhino.Node node47 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node46);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.rhino.Node node49 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node48);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node47, node49);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate51 = null;
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node49, nodePredicate51);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node49);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node49, false);
        com.google.javascript.rhino.Node[] nodeArray56 = new com.google.javascript.rhino.Node[] { node7, node13, node19, node28, node40, node49 };
        com.google.javascript.rhino.Node node57 = com.google.javascript.jscomp.NodeUtil.newCallNode(node1, nodeArray56);
        com.google.javascript.rhino.Node node58 = null;
        com.google.javascript.rhino.Node node59 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node58);
        com.google.javascript.rhino.Node node60 = null;
        com.google.javascript.rhino.Node node61 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node60);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node59, node61);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate63 = null;
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node61, nodePredicate63);
        boolean boolean65 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node61);
        com.google.javascript.rhino.Node node66 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node61);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue67 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node61);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType69 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) ' ');
        boolean boolean70 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node61, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType69);
        boolean boolean71 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType69);
        java.lang.Double double72 = com.google.javascript.jscomp.NodeUtil.getNumberValue(node1);
        boolean boolean73 = com.google.javascript.jscomp.NodeUtil.isExprCall(node1);
        boolean boolean74 = com.google.javascript.jscomp.NodeUtil.isThis(node1);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(nodeArray56);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNull(node66);
        org.junit.Assert.assertNotNull(ternaryValue67);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double72));
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isVar(node1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isNew(node1);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isExprCall(node1);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.containsFunction(node1);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCallOrApply(node1);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node1);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement12 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        int int13 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node1, (int) (byte) -1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement12);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType16 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 100);
        int int17 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node1, (int) (short) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType16);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler18 = null;
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node1, abstractCompiler18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node1);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType1 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType(10);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node3);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node8);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node7, node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node3, node7);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node7);
        java.lang.String[] strArray15 = new java.lang.String[] { "undefined", "" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node7, (java.util.Set<java.lang.String>) strSet16);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node7);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node7);
        boolean boolean21 = matchNodeType1.apply(node7);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "undefined", "" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isString(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node3);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node3);
        int int12 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node3, "JSCompiler_renameProperty");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.google.javascript.jscomp.NodeUtil.tryMergeBlock(node3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node1);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection3 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node1);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.getConditionExpression(node1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: VOID does not have a condition.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(nodeCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection5 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node3);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node3, abstractCompiler6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node3);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.getArgumentForCallOrNew(node3, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeCollection5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isVar(node1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isNew(node1);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isExprCall(node1);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.containsFunction(node1);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCallOrApply(node1);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node1);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement12 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        int int13 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node1, (int) (byte) -1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement12);
        com.google.javascript.rhino.JSDocInfo jSDocInfo14 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node1);
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newExpr(node1);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(jSDocInfo14);
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate5 = null;
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node3, nodePredicate5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node3);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node3);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue9 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node3);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node3);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isCall(node3);
        com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(node3);
        com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(node3);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.google.javascript.jscomp.NodeUtil.hasFinally(node3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(ternaryValue9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isVar(node1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isNew(node1);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isExprCall(node1);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.containsFunction(node1);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node1, abstractCompiler9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isNew(node1);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isGetProp(node1);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node14);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node14);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node19);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node18, node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node14, node18);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node23);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node25);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node24, node26);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate28 = null;
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node26, nodePredicate28);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node26);
        com.google.javascript.rhino.Node node31 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node26);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue32 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node26);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType34 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) ' ');
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node26, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType34);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node14, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType34);
        int int37 = matchNodeType34.type;
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType34);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node1, "hi!");
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node1);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.rhino.Node node43 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node42);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.rhino.Node node45 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node44);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node43, node45);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node43);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.rhino.Node node49 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node48);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node49);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node49);
        com.google.javascript.rhino.Node node52 = null;
        com.google.javascript.rhino.Node node53 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node52);
        com.google.javascript.rhino.Node node54 = null;
        com.google.javascript.rhino.Node node55 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node54);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node53, node55);
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node49, node53);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node43, node49);
        com.google.javascript.rhino.Node node59 = null;
        com.google.javascript.rhino.Node node60 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node59);
        com.google.javascript.rhino.Node node61 = null;
        com.google.javascript.rhino.Node node62 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node61);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node60, node62);
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.isVar(node60);
        boolean boolean65 = com.google.javascript.jscomp.NodeUtil.isNew(node60);
        boolean boolean66 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node60);
        int int68 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node60, "undefined");
        boolean boolean69 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node43, node60);
        boolean boolean70 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node43);
        boolean boolean71 = com.google.javascript.jscomp.NodeUtil.containsCall(node43);
        com.google.javascript.rhino.Node node72 = null;
        com.google.javascript.rhino.Node node73 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node72);
        boolean boolean74 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node73);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler75 = null;
        boolean boolean76 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node73, abstractCompiler75);
        java.lang.String str77 = com.google.javascript.jscomp.NodeUtil.getStringValue(node73);
        com.google.javascript.rhino.Node node78 = null;
        com.google.javascript.rhino.Node node79 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node78);
        com.google.javascript.rhino.Node node80 = null;
        com.google.javascript.rhino.Node node81 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node80);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node79, node81);
        boolean boolean83 = com.google.javascript.jscomp.NodeUtil.isVar(node79);
        boolean boolean84 = com.google.javascript.jscomp.NodeUtil.isNew(node79);
        boolean boolean85 = com.google.javascript.jscomp.NodeUtil.isExprCall(node79);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node73, node79);
        java.lang.String str87 = com.google.javascript.jscomp.NodeUtil.getStringValue(node79);
        boolean boolean88 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node43, node79);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler89 = null;
        boolean boolean90 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node79, abstractCompiler89);
        boolean boolean91 = com.google.javascript.jscomp.NodeUtil.containsCall(node79);
        boolean boolean92 = com.google.javascript.jscomp.NodeUtil.isString(node79);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType95 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (byte) 0);
        boolean boolean96 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node79, "", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType95);
        int int97 = matchNodeType95.type;
        boolean boolean98 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType95);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNotNull(ternaryValue32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 32 + "'", int37 == 32);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "undefined" + "'", str77, "undefined");
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "undefined" + "'", str87, "undefined");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 0 + "'", int97 == 0);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection5 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node3);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration6 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node8);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node13);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node12, node14);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate16 = null;
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node14, nodePredicate16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node14);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node20);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler22 = null;
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node20, abstractCompiler22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isVar(node20);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node27);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node26, node28);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isVar(node26);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isNew(node26);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node26);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node26);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.rhino.Node node37 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node36);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node35, node37);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.rhino.Node node40 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node39);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.rhino.Node node42 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node41);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node40, node42);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isVar(node40);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isLhs(node35, node40);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.rhino.Node node47 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node46);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.rhino.Node node49 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node48);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node47, node49);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isVar(node47);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isNew(node47);
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.rhino.Node node54 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node53);
        com.google.javascript.rhino.Node node55 = null;
        com.google.javascript.rhino.Node node56 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node55);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node54, node56);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate58 = null;
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node56, nodePredicate58);
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node56);
        boolean boolean62 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node56, false);
        com.google.javascript.rhino.Node[] nodeArray63 = new com.google.javascript.rhino.Node[] { node14, node20, node26, node35, node47, node56 };
        com.google.javascript.rhino.Node node64 = com.google.javascript.jscomp.NodeUtil.newCallNode(node8, nodeArray63);
        com.google.javascript.rhino.Node node65 = null;
        com.google.javascript.rhino.Node node66 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node65);
        com.google.javascript.rhino.Node node67 = null;
        com.google.javascript.rhino.Node node68 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node67);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node66, node68);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate70 = null;
        boolean boolean71 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node68, nodePredicate70);
        boolean boolean72 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node68);
        com.google.javascript.rhino.Node node73 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node68);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue74 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node68);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType76 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) ' ');
        boolean boolean77 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node68, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType76);
        boolean boolean78 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node8, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType76);
        boolean boolean79 = com.google.javascript.jscomp.NodeUtil.isGet(node8);
        java.lang.String str80 = com.google.javascript.jscomp.NodeUtil.getStringValue(node8);
        boolean boolean81 = matchDeclaration6.apply(node8);
        boolean boolean82 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node3, node8);
        boolean boolean83 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node8);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration85 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        int int86 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node8, (int) (short) -1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration85);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeCollection5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(nodeArray63);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNull(node73);
        org.junit.Assert.assertNotNull(ternaryValue74);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "undefined" + "'", str80, "undefined");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.containsCall(node3);
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.getLoopCodeBlock(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node3);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.google.javascript.jscomp.NodeUtil.constructorCallHasSideEffects(node3, abstractCompiler8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected NEW node, got VOID");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isName(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node3);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node1);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node6);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node5, node7);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate9 = null;
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node7, nodePredicate9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node7);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node13);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = null;
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node13, abstractCompiler15);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isVar(node13);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node20);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node19, node21);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isVar(node19);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isNew(node19);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node19);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node19);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node27);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node29);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node28, node30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node32);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node34);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node33, node35);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isVar(node33);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isLhs(node28, node33);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.rhino.Node node40 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node39);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.rhino.Node node42 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node41);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node40, node42);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isVar(node40);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isNew(node40);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.rhino.Node node47 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node46);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.rhino.Node node49 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node48);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node47, node49);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate51 = null;
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node49, nodePredicate51);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node49);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node49, false);
        com.google.javascript.rhino.Node[] nodeArray56 = new com.google.javascript.rhino.Node[] { node7, node13, node19, node28, node40, node49 };
        com.google.javascript.rhino.Node node57 = com.google.javascript.jscomp.NodeUtil.newCallNode(node1, nodeArray56);
        com.google.javascript.rhino.Node node58 = null;
        com.google.javascript.rhino.Node node59 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node58);
        com.google.javascript.rhino.Node node60 = null;
        com.google.javascript.rhino.Node node61 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node60);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node59, node61);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate63 = null;
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node61, nodePredicate63);
        boolean boolean65 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node61);
        com.google.javascript.rhino.Node node66 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node61);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue67 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node61);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType69 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) ' ');
        boolean boolean70 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node61, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType69);
        boolean boolean71 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType69);
        boolean boolean72 = com.google.javascript.jscomp.NodeUtil.isGet(node1);
        java.lang.String str73 = com.google.javascript.jscomp.NodeUtil.getStringValue(node1);
        com.google.javascript.rhino.Node node74 = null;
        com.google.javascript.rhino.Node node75 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node74);
        boolean boolean76 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node75);
        boolean boolean77 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node75);
        com.google.javascript.rhino.Node node78 = null;
        com.google.javascript.rhino.Node node79 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node78);
        com.google.javascript.rhino.Node node80 = null;
        com.google.javascript.rhino.Node node81 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node80);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node79, node81);
        boolean boolean83 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node75, node79);
        boolean boolean84 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node79);
        java.lang.String[] strArray87 = new java.lang.String[] { "undefined", "" };
        java.util.LinkedHashSet<java.lang.String> strSet88 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet88, strArray87);
        boolean boolean90 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node79, (java.util.Set<java.lang.String>) strSet88);
        boolean boolean91 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node1, (java.util.Set<java.lang.String>) strSet88);
        boolean boolean92 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node1);
        boolean boolean93 = com.google.javascript.jscomp.NodeUtil.isString(node1);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(nodeArray56);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNull(node66);
        org.junit.Assert.assertNotNull(ternaryValue67);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "undefined" + "'", str73, "undefined");
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertArrayEquals(strArray87, new java.lang.String[] { "undefined", "" });
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate5 = null;
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node3, nodePredicate5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node3, false);
        java.lang.String str10 = com.google.javascript.jscomp.NodeUtil.getSourceName(node3);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node3);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node3, "hi!");
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        com.google.javascript.rhino.Node node0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = com.google.javascript.jscomp.NodeUtil.containsCall(node0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node1);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node7);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node12);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node11, node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node7, node11);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node7);
        com.google.javascript.jscomp.NodeUtil.MatchNotFunction matchNotFunction18 = new com.google.javascript.jscomp.NodeUtil.MatchNotFunction();
        int int19 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node1, (int) (byte) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNotFunction18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node21);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection23 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node21);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node21);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isThis(node21);
        boolean boolean26 = matchNotFunction18.apply(node21);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node27);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node29);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node28, node30);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node28);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.rhino.Node node34 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node33);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node34);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node34);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.rhino.Node node38 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node37);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.rhino.Node node40 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node39);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node38, node40);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node34, node38);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node28, node34);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.rhino.Node node45 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node44);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.rhino.Node node47 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node46);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node45, node47);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.isVar(node45);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isNew(node45);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node45);
        int int53 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node45, "undefined");
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node28, node45);
        com.google.javascript.rhino.Node node55 = null;
        com.google.javascript.rhino.Node node56 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node55);
        com.google.javascript.rhino.Node node57 = null;
        com.google.javascript.rhino.Node node58 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node57);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node56, node58);
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node56);
        com.google.javascript.rhino.Node node61 = null;
        com.google.javascript.rhino.Node node62 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node61);
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node62);
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node62);
        com.google.javascript.rhino.Node node65 = null;
        com.google.javascript.rhino.Node node66 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node65);
        com.google.javascript.rhino.Node node67 = null;
        com.google.javascript.rhino.Node node68 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node67);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node66, node68);
        boolean boolean70 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node62, node66);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node56, node62);
        com.google.javascript.rhino.Node node72 = null;
        com.google.javascript.rhino.Node node73 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node72);
        com.google.javascript.rhino.Node node74 = null;
        com.google.javascript.rhino.Node node75 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node74);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node73, node75);
        boolean boolean77 = com.google.javascript.jscomp.NodeUtil.isVar(node73);
        boolean boolean78 = com.google.javascript.jscomp.NodeUtil.isNew(node73);
        boolean boolean79 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node73);
        int int81 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node73, "undefined");
        boolean boolean82 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node56, node73);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node45, node73);
        boolean boolean84 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node73);
        boolean boolean85 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node73);
        boolean boolean86 = matchNotFunction18.apply(node73);
        com.google.javascript.rhino.Node node87 = null;
        com.google.javascript.rhino.Node node88 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node87);
        com.google.javascript.rhino.Node node89 = null;
        com.google.javascript.rhino.Node node90 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node89);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node88, node90);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate92 = null;
        boolean boolean93 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node90, nodePredicate92);
        boolean boolean94 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node90);
        com.google.javascript.rhino.Node node95 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node90);
        boolean boolean96 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node90);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue97 = com.google.javascript.jscomp.NodeUtil.getExpressionBooleanValue(node90);
        boolean boolean98 = matchNotFunction18.apply(node90);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(nodeCollection23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(node88);
        org.junit.Assert.assertNotNull(node90);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertNull(node95);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertNotNull(ternaryValue97);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isVar(node1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isNew(node1);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isExprCall(node1);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node10);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node9, node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isVar(node9);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isNew(node9);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node9);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node9);
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.getLoopCodeBlock(node9);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node20);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node19, node21);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isVar(node19);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isNew(node19);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isExprCall(node19);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.containsFunction(node19);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isLhs(node9, node19);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue28 = com.google.javascript.jscomp.NodeUtil.getExpressionBooleanValue(node9);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.NodeUtil.removeChild(node1, node9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Invalid attempt to remove node: VOID of VOID");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(ternaryValue28);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate5 = null;
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node3, nodePredicate5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node3, false);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node11);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node16);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node15, node17);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate19 = null;
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node17, nodePredicate19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node17);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node23);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler25 = null;
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node23, abstractCompiler25);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isVar(node23);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node30);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node29, node31);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isVar(node29);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isNew(node29);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node29);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node29);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.rhino.Node node38 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node37);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.rhino.Node node40 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node39);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node38, node40);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.rhino.Node node43 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node42);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.rhino.Node node45 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node44);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node43, node45);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isVar(node43);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isLhs(node38, node43);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.rhino.Node node50 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node49);
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.rhino.Node node52 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node51);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node50, node52);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.isVar(node50);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.isNew(node50);
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.rhino.Node node57 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node56);
        com.google.javascript.rhino.Node node58 = null;
        com.google.javascript.rhino.Node node59 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node58);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node57, node59);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate61 = null;
        boolean boolean62 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node59, nodePredicate61);
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node59);
        boolean boolean65 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node59, false);
        com.google.javascript.rhino.Node[] nodeArray66 = new com.google.javascript.rhino.Node[] { node17, node23, node29, node38, node50, node59 };
        com.google.javascript.rhino.Node node67 = com.google.javascript.jscomp.NodeUtil.newCallNode(node11, nodeArray66);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node68 = com.google.javascript.jscomp.NodeUtil.newCallNode(node3, nodeArray66);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(nodeArray66);
        org.junit.Assert.assertNotNull(node67);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate5 = null;
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node3, nodePredicate5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node3, false);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        int int12 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node3, "undefined");
        java.lang.Double double13 = com.google.javascript.jscomp.NodeUtil.getNumberValue(node3);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node3, "JSCompiler_renameProperty");
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node3);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node3);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node3);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection19 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node3);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(nodeCollection19);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isAssign(node1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node1);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node7);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node6, node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node6);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node12);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node17);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node16, node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node12, node16);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node6, node12);
        com.google.javascript.jscomp.NodeUtil.MatchNotFunction matchNotFunction23 = new com.google.javascript.jscomp.NodeUtil.MatchNotFunction();
        int int24 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node6, (int) (byte) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNotFunction23);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node25);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node26);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection28 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node26);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node26);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isThis(node26);
        boolean boolean31 = matchNotFunction23.apply(node26);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isLhs(node1, node26);
        java.lang.String str33 = com.google.javascript.jscomp.NodeUtil.getSourceName(node1);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node1);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node1, "^");
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isFunction(node1);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(nodeCollection28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node1);
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isFunction(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.containsType(node3, (int) (short) 10);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isVar(node1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isNew(node1);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isExprCall(node1);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node1, abstractCompiler8);
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node1);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node13);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node12, node14);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate16 = null;
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node14, nodePredicate16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node14);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node14, false);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node14);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.containsCall(node14);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isLhs(node1, node14);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node14, false);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node1);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node6);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node5, node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node1, node5);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node1);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node1);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node1, abstractCompiler12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node1);
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node1);
        java.lang.Double double16 = com.google.javascript.jscomp.NodeUtil.getNumberValue(node15);
        java.lang.String str17 = com.google.javascript.jscomp.NodeUtil.getStringValue(node15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.google.javascript.jscomp.NodeUtil.callHasLocalResult(node15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "undefined" + "'", str17, "undefined");
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node1);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node1, abstractCompiler3);
        java.lang.String str5 = com.google.javascript.jscomp.NodeUtil.getStringValue(node1);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node8);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node7, node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isVar(node7);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isNew(node7);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isExprCall(node7);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node7);
        java.lang.String[] strArray21 = new java.lang.String[] { "^", "JSCompiler_renameProperty", "", "typeof", "", "^" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node7, (java.util.Set<java.lang.String>) strSet22);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node25);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node26);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node26);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node31);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node30, node32);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate34 = null;
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node32, nodePredicate34);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node32);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.rhino.Node node38 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node37);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node38);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler40 = null;
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node38, abstractCompiler40);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isVar(node38);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node43);
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.rhino.Node node46 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node45);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node44, node46);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isVar(node44);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.isNew(node44);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node44);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node44);
        com.google.javascript.rhino.Node node52 = null;
        com.google.javascript.rhino.Node node53 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node52);
        com.google.javascript.rhino.Node node54 = null;
        com.google.javascript.rhino.Node node55 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node54);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node53, node55);
        com.google.javascript.rhino.Node node57 = null;
        com.google.javascript.rhino.Node node58 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node57);
        com.google.javascript.rhino.Node node59 = null;
        com.google.javascript.rhino.Node node60 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node59);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node58, node60);
        boolean boolean62 = com.google.javascript.jscomp.NodeUtil.isVar(node58);
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.isLhs(node53, node58);
        com.google.javascript.rhino.Node node64 = null;
        com.google.javascript.rhino.Node node65 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node64);
        com.google.javascript.rhino.Node node66 = null;
        com.google.javascript.rhino.Node node67 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node66);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node65, node67);
        boolean boolean69 = com.google.javascript.jscomp.NodeUtil.isVar(node65);
        boolean boolean70 = com.google.javascript.jscomp.NodeUtil.isNew(node65);
        com.google.javascript.rhino.Node node71 = null;
        com.google.javascript.rhino.Node node72 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node71);
        com.google.javascript.rhino.Node node73 = null;
        com.google.javascript.rhino.Node node74 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node73);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node72, node74);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate76 = null;
        boolean boolean77 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node74, nodePredicate76);
        boolean boolean78 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node74);
        boolean boolean80 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node74, false);
        com.google.javascript.rhino.Node[] nodeArray81 = new com.google.javascript.rhino.Node[] { node32, node38, node44, node53, node65, node74 };
        com.google.javascript.rhino.Node node82 = com.google.javascript.jscomp.NodeUtil.newCallNode(node26, nodeArray81);
        com.google.javascript.rhino.Node node83 = null;
        com.google.javascript.rhino.Node node84 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node83);
        com.google.javascript.rhino.Node node85 = null;
        com.google.javascript.rhino.Node node86 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node85);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node84, node86);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate88 = null;
        boolean boolean89 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node86, nodePredicate88);
        boolean boolean90 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node86);
        com.google.javascript.rhino.Node node91 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node86);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue92 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node86);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType94 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) ' ');
        boolean boolean95 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node86, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType94);
        boolean boolean96 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node26, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType94);
        boolean boolean97 = com.google.javascript.jscomp.NodeUtil.isLhs(node7, node26);
        boolean boolean98 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node26);
        boolean boolean99 = com.google.javascript.jscomp.NodeUtil.isConstantName(node26);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "undefined" + "'", str5, "undefined");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "^", "JSCompiler_renameProperty", "", "typeof", "", "^" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(nodeArray81);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertNotNull(node86);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNull(node91);
        org.junit.Assert.assertNotNull(ternaryValue92);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration0 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node2);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node7);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node6, node8);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate10 = null;
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node8, nodePredicate10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node8);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node14);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler16 = null;
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node14, abstractCompiler16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isVar(node14);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node21);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node20, node22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isVar(node20);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isNew(node20);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node20);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node20);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node30);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node29, node31);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.rhino.Node node34 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node33);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.rhino.Node node36 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node35);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node34, node36);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isVar(node34);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isLhs(node29, node34);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.rhino.Node node41 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node40);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.rhino.Node node43 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node42);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node41, node43);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isVar(node41);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isNew(node41);
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.rhino.Node node48 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node47);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.rhino.Node node50 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node49);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node48, node50);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate52 = null;
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node50, nodePredicate52);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node50);
        boolean boolean56 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node50, false);
        com.google.javascript.rhino.Node[] nodeArray57 = new com.google.javascript.rhino.Node[] { node8, node14, node20, node29, node41, node50 };
        com.google.javascript.rhino.Node node58 = com.google.javascript.jscomp.NodeUtil.newCallNode(node2, nodeArray57);
        com.google.javascript.rhino.Node node59 = null;
        com.google.javascript.rhino.Node node60 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node59);
        com.google.javascript.rhino.Node node61 = null;
        com.google.javascript.rhino.Node node62 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node61);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node60, node62);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate64 = null;
        boolean boolean65 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node62, nodePredicate64);
        boolean boolean66 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node62);
        com.google.javascript.rhino.Node node67 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node62);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue68 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node62);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType70 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) ' ');
        boolean boolean71 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node62, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType70);
        boolean boolean72 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType70);
        boolean boolean73 = com.google.javascript.jscomp.NodeUtil.isGet(node2);
        java.lang.String str74 = com.google.javascript.jscomp.NodeUtil.getStringValue(node2);
        boolean boolean75 = matchDeclaration0.apply(node2);
        com.google.javascript.rhino.Node node76 = null;
        com.google.javascript.rhino.Node node77 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node76);
        com.google.javascript.rhino.Node node78 = null;
        com.google.javascript.rhino.Node node79 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node78);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node77, node79);
        boolean boolean81 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node79);
        boolean boolean82 = com.google.javascript.jscomp.NodeUtil.isString(node79);
        boolean boolean83 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node79);
        boolean boolean84 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node79);
        boolean boolean85 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node79);
        boolean boolean86 = matchDeclaration0.apply(node79);
        com.google.javascript.rhino.Node node87 = null;
        com.google.javascript.rhino.Node node88 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node87);
        boolean boolean89 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node88);
        boolean boolean90 = matchDeclaration0.apply(node88);
        boolean boolean91 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node88);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(nodeArray57);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNull(node67);
        org.junit.Assert.assertNotNull(ternaryValue68);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "undefined" + "'", str74, "undefined");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(node88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration2 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node0, "JSCompiler_renameProperty", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        com.google.javascript.rhino.Node node0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isConstantName(node0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isString(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node3);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue9 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node3);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection10 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node3);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node3);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node3, "undefined");
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node3);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node17);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node16, node18);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate20 = null;
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node18, nodePredicate20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node18);
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node18);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue24 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node18);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType26 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) ' ');
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node18, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType26);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue28 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node18);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isLabelName(node18);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node18);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isString(node18);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node18, "");
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isLhs(node3, node18);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node18);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(ternaryValue9);
        org.junit.Assert.assertNotNull(nodeCollection10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(ternaryValue24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(ternaryValue28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isVar(node1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isNew(node1);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node1);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node1);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isGet(node1);
        java.lang.String str10 = com.google.javascript.jscomp.NodeUtil.getStringValue(node1);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node1, "|");
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "undefined" + "'", str10, "undefined");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate5 = null;
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node3, nodePredicate5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node3, false);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node3, "undefined");
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node3);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isAssociative(13);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.containsFunction(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo4 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node1);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node6);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node10);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node15);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node14, node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node10, node14);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node21);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node20, node22);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate24 = null;
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node22, nodePredicate24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node22);
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node22);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue28 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node22);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType30 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) ' ');
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node22, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType30);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node10, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType30);
        int int33 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node6, (int) (byte) 1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType30);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node6);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.rhino.Node node36 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node35);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node36);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler38 = null;
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node36, abstractCompiler38);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isVar(node36);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node6, node36);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node1, node36);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node1);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler44 = null;
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node1, abstractCompiler44);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jSDocInfo4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNotNull(ternaryValue28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node1);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node6);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node5, node7);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate9 = null;
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node7, nodePredicate9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node7);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node13);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = null;
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node13, abstractCompiler15);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isVar(node13);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node20);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node19, node21);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isVar(node19);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isNew(node19);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node19);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node19);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node27);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node29);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node28, node30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node32);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node34);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node33, node35);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isVar(node33);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isLhs(node28, node33);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.rhino.Node node40 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node39);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.rhino.Node node42 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node41);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node40, node42);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isVar(node40);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isNew(node40);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.rhino.Node node47 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node46);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.rhino.Node node49 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node48);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node47, node49);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate51 = null;
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node49, nodePredicate51);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node49);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node49, false);
        com.google.javascript.rhino.Node[] nodeArray56 = new com.google.javascript.rhino.Node[] { node7, node13, node19, node28, node40, node49 };
        com.google.javascript.rhino.Node node57 = com.google.javascript.jscomp.NodeUtil.newCallNode(node1, nodeArray56);
        com.google.javascript.rhino.Node node58 = null;
        com.google.javascript.rhino.Node node59 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node58);
        com.google.javascript.rhino.Node node60 = null;
        com.google.javascript.rhino.Node node61 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node60);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node59, node61);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate63 = null;
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node61, nodePredicate63);
        boolean boolean65 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node61);
        com.google.javascript.rhino.Node node66 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node61);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue67 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node61);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType69 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) ' ');
        boolean boolean70 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node61, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType69);
        boolean boolean71 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType69);
        boolean boolean72 = com.google.javascript.jscomp.NodeUtil.isGet(node1);
        java.lang.String str73 = com.google.javascript.jscomp.NodeUtil.getStringValue(node1);
        boolean boolean75 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node1, "");
        boolean boolean76 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean77 = com.google.javascript.jscomp.NodeUtil.isVarArgsFunction(node1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(nodeArray56);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNull(node66);
        org.junit.Assert.assertNotNull(ternaryValue67);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "undefined" + "'", str73, "undefined");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.containsFunction(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isVar(node1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node1);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue5 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = com.google.javascript.jscomp.NodeUtil.callHasLocalResult(node1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(ternaryValue5);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node3);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node2, node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node2);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node8);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node13);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node12, node14);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node8, node12);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node2, node8);
        com.google.javascript.jscomp.NodeUtil.MatchNotFunction matchNotFunction19 = new com.google.javascript.jscomp.NodeUtil.MatchNotFunction();
        int int20 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node2, (int) (byte) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNotFunction19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node21);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node22);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node27);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node26, node28);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node22, node26);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node26);
        java.lang.String[] strArray34 = new java.lang.String[] { "undefined", "" };
        java.util.LinkedHashSet<java.lang.String> strSet35 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet35, strArray34);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node26, (java.util.Set<java.lang.String>) strSet35);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType39 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 100);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType41 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) ' ');
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.rhino.Node node43 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node42);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.rhino.Node node45 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node44);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node43, node45);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate47 = null;
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node45, nodePredicate47);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node45);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node45, false);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isLabelName(node45);
        int int54 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node45, "undefined");
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node45);
        boolean boolean56 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node45);
        boolean boolean57 = matchNodeType41.apply(node45);
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.has(node26, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType39, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType41);
        boolean boolean59 = matchNotFunction19.apply(node26);
        com.google.javascript.rhino.Node node60 = null;
        com.google.javascript.rhino.Node node61 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node60);
        com.google.javascript.rhino.Node node62 = null;
        com.google.javascript.rhino.Node node63 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node62);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node61, node63);
        boolean boolean65 = com.google.javascript.jscomp.NodeUtil.isVar(node61);
        boolean boolean66 = com.google.javascript.jscomp.NodeUtil.isNew(node61);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue67 = com.google.javascript.jscomp.NodeUtil.getExpressionBooleanValue(node61);
        boolean boolean68 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node61);
        com.google.javascript.rhino.Node node69 = null;
        com.google.javascript.rhino.Node node70 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node69);
        com.google.javascript.rhino.Node node71 = null;
        com.google.javascript.rhino.Node node72 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node71);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node70, node72);
        boolean boolean74 = com.google.javascript.jscomp.NodeUtil.isVar(node70);
        boolean boolean75 = com.google.javascript.jscomp.NodeUtil.isNew(node70);
        boolean boolean76 = com.google.javascript.jscomp.NodeUtil.isExprCall(node70);
        boolean boolean77 = com.google.javascript.jscomp.NodeUtil.containsFunction(node70);
        boolean boolean78 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCallOrApply(node70);
        boolean boolean79 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node70);
        boolean boolean80 = com.google.javascript.jscomp.NodeUtil.isLhs(node61, node70);
        boolean boolean81 = matchNotFunction19.apply(node70);
        java.lang.String str82 = com.google.javascript.jscomp.NodeUtil.getSourceName(node70);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection83 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node70);
        boolean boolean84 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node70);
        java.lang.String str85 = com.google.javascript.jscomp.NodeUtil.getSourceName(node70);
        com.google.javascript.rhino.Node node86 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node70);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "undefined", "" });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(ternaryValue67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNull(str82);
        org.junit.Assert.assertNotNull(nodeCollection83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNull(str85);
        org.junit.Assert.assertNotNull(node86);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node3);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node2, node4);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate6 = null;
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node4, nodePredicate6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node4);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node4);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue10 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node4);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType12 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) ' ');
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node4, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType12);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue14 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node4);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        int int17 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node4, 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement16);
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node4);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node20);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node23);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node25);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node24, node26);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node20, node24);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node20);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node20);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler31 = null;
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node20, abstractCompiler31);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node20);
        com.google.javascript.rhino.Node node34 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node20);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node4, node34);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isName(node4);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(ternaryValue10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(ternaryValue14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isString(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node3);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue9 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node3);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node11);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node16);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node15, node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node11, node15);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node22);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node21, node23);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate25 = null;
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node23, nodePredicate25);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node23);
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node23);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue29 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node23);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType31 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) ' ');
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node23, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType31);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node11, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType31);
        int int34 = matchNodeType31.type;
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.rhino.Node node36 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node35);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.rhino.Node node38 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node37);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node36, node38);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isVar(node36);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isNew(node36);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isExprCall(node36);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.containsFunction(node36);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCallOrApply(node36);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node36);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement47 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        int int48 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node36, (int) (byte) -1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement47);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType51 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 100);
        int int52 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node36, (int) (short) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType51);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.has(node3, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType31, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType51);
        com.google.javascript.rhino.Node node54 = null;
        com.google.javascript.rhino.Node node55 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node54);
        boolean boolean56 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node55);
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node55);
        com.google.javascript.rhino.Node node58 = null;
        com.google.javascript.rhino.Node node59 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node58);
        com.google.javascript.rhino.Node node60 = null;
        com.google.javascript.rhino.Node node61 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node60);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node59, node61);
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node55, node59);
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node59);
        java.lang.String[] strArray67 = new java.lang.String[] { "undefined", "" };
        java.util.LinkedHashSet<java.lang.String> strSet68 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet68, strArray67);
        boolean boolean70 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node59, (java.util.Set<java.lang.String>) strSet68);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType72 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 100);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType74 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) ' ');
        com.google.javascript.rhino.Node node75 = null;
        com.google.javascript.rhino.Node node76 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node75);
        com.google.javascript.rhino.Node node77 = null;
        com.google.javascript.rhino.Node node78 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node77);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node76, node78);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate80 = null;
        boolean boolean81 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node78, nodePredicate80);
        boolean boolean82 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node78);
        boolean boolean84 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node78, false);
        boolean boolean85 = com.google.javascript.jscomp.NodeUtil.isLabelName(node78);
        int int87 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node78, "undefined");
        boolean boolean88 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node78);
        boolean boolean89 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node78);
        boolean boolean90 = matchNodeType74.apply(node78);
        boolean boolean91 = com.google.javascript.jscomp.NodeUtil.has(node59, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType72, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType74);
        boolean boolean92 = matchNodeType51.apply(node59);
        boolean boolean93 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node59);
        boolean boolean94 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node59);
        boolean boolean95 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node59);
        boolean boolean96 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node59);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(ternaryValue9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(ternaryValue29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 32 + "'", int34 == 32);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertArrayEquals(strArray67, new java.lang.String[] { "undefined", "" });
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node4);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node3, node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node9);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node8, node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isVar(node8);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isLhs(node3, node8);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isLhs(node0, node8);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isCall(node8);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isAssign(node8);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isGetProp(node8);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node20);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node19, node21);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate23 = null;
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node21, nodePredicate23);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node21);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCallOrApply(node21);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node21);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isControlStructureCodeBlock(node8, node21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(codingConvention0, "JSCompiler_renameProperty", 32, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node1);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node1, abstractCompiler3);
        java.lang.String str5 = com.google.javascript.jscomp.NodeUtil.getStringValue(node1);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node8);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node7, node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isVar(node7);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isNew(node7);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isExprCall(node7);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node7);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node17);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node16, node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isVar(node16);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isNew(node16);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isExprCall(node16);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.containsFunction(node16);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCallOrApply(node16);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node16);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement27 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        int int28 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node16, (int) (byte) -1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement27);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: NUMBER 0.0 is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "undefined" + "'", str5, "undefined");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.containsFunction(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node1);
        java.lang.Double double4 = com.google.javascript.jscomp.NodeUtil.getNumberValue(node1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.containsCall(node1);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node1, false);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isSimpleOperatorType((int) '#');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node3);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node2, node4);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate6 = null;
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node4, nodePredicate6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node4);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node4, false);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isLabelName(node4);
        int int13 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node4, "undefined");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue14 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node4);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node4);
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newVarNode("undefined", node4);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(ternaryValue14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node3);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node2, node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isString(node4);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node4);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isExprCall(node4);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node4);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node4);
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newVarNode("typeof", node4);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isCall(node12);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue15 = com.google.javascript.jscomp.NodeUtil.getExpressionBooleanValue(node12);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.containsType(node12, (int) ' ');
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(ternaryValue15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = com.google.javascript.jscomp.NodeUtil.functionCallHasSideEffects(node0, abstractCompiler1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node1);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node6);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node5, node7);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate9 = null;
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node7, nodePredicate9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node7);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node13);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = null;
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node13, abstractCompiler15);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isVar(node13);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node20);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node19, node21);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isVar(node19);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isNew(node19);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node19);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node19);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node27);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node29);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node28, node30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node32);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node34);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node33, node35);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isVar(node33);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isLhs(node28, node33);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.rhino.Node node40 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node39);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.rhino.Node node42 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node41);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node40, node42);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isVar(node40);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isNew(node40);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.rhino.Node node47 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node46);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.rhino.Node node49 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node48);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node47, node49);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate51 = null;
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node49, nodePredicate51);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node49);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node49, false);
        com.google.javascript.rhino.Node[] nodeArray56 = new com.google.javascript.rhino.Node[] { node7, node13, node19, node28, node40, node49 };
        com.google.javascript.rhino.Node node57 = com.google.javascript.jscomp.NodeUtil.newCallNode(node1, nodeArray56);
        com.google.javascript.rhino.Node node58 = null;
        com.google.javascript.rhino.Node node59 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node58);
        com.google.javascript.rhino.Node node60 = null;
        com.google.javascript.rhino.Node node61 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node60);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node59, node61);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate63 = null;
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node61, nodePredicate63);
        boolean boolean65 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node61);
        com.google.javascript.rhino.Node node66 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node61);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue67 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node61);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType69 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) ' ');
        boolean boolean70 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node61, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType69);
        boolean boolean71 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType69);
        boolean boolean72 = com.google.javascript.jscomp.NodeUtil.isGet(node1);
        boolean boolean73 = com.google.javascript.jscomp.NodeUtil.isCall(node1);
        java.lang.Double double74 = com.google.javascript.jscomp.NodeUtil.getNumberValue(node1);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(nodeArray56);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNull(node66);
        org.junit.Assert.assertNotNull(ternaryValue67);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double74));
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate5 = null;
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node3, nodePredicate5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node3);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.getConditionExpression(node3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: VOID does not have a condition.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.JSDocInfo jSDocInfo2 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node1);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node6);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node5, node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node7);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node7);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node1, node7, "||");
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node15);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node14, node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node14);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node20);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node23);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node25);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node24, node26);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node20, node24);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node14, node20);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node32);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node31, node33);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isVar(node31);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isNew(node31);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node31);
        int int39 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node31, "undefined");
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node14, node31);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node14);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node14, true);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isAssign(node14);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isLhs(node7, node14);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNull(jSDocInfo2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node4);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node3, node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node9);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node8, node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isVar(node8);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isLhs(node3, node8);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isLhs(node0, node8);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isThis(node8);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.containsFunction(node8);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node8);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node8);
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newExpr(node8);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node22);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node21, node23);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node23);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection26 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node23);
        com.google.javascript.rhino.JSDocInfo jSDocInfo27 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node23);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isGet(node23);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node31);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node30, node32);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate34 = null;
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node32, nodePredicate34);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node32);
        com.google.javascript.rhino.Node node37 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node32);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue38 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node32);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node32);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isCall(node32);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.rhino.Node node43 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node42);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.rhino.Node node45 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node44);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node43, node45);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isVar(node43);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isNew(node43);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.isExprCall(node43);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.containsFunction(node43);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCallOrApply(node43);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node43);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement54 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        int int55 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node43, (int) (byte) -1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement54);
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.rhino.Node node57 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node56);
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node57);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler59 = null;
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node57, abstractCompiler59);
        java.lang.String str61 = com.google.javascript.jscomp.NodeUtil.getStringValue(node57);
        boolean boolean62 = matchShallowStatement54.apply(node57);
        int int63 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node32, 10, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement54);
        com.google.javascript.rhino.Node node64 = null;
        com.google.javascript.rhino.Node node65 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node64);
        com.google.javascript.rhino.Node node66 = null;
        com.google.javascript.rhino.Node node67 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node66);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node65, node67);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate69 = null;
        boolean boolean70 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node67, nodePredicate69);
        boolean boolean71 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node67);
        com.google.javascript.rhino.Node node72 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node67);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue73 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node67);
        boolean boolean74 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node67);
        boolean boolean75 = com.google.javascript.jscomp.NodeUtil.isCall(node67);
        boolean boolean76 = matchShallowStatement54.apply(node67);
        boolean boolean77 = com.google.javascript.jscomp.NodeUtil.isLhs(node23, node67);
        java.lang.String[] strArray79 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet80 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet80, strArray79);
        boolean boolean82 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node67, (java.util.Set<java.lang.String>) strSet80);
        boolean boolean83 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node19, (java.util.Set<java.lang.String>) strSet80);
        boolean boolean84 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node19);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(nodeCollection26);
        org.junit.Assert.assertNull(jSDocInfo27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNotNull(ternaryValue38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "undefined" + "'", str61, "undefined");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNull(node72);
        org.junit.Assert.assertNotNull(ternaryValue73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertArrayEquals(strArray79, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node1);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node7);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node12);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node11, node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node7, node11);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node7);
        com.google.javascript.jscomp.NodeUtil.MatchNotFunction matchNotFunction18 = new com.google.javascript.jscomp.NodeUtil.MatchNotFunction();
        int int19 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node1, (int) (byte) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNotFunction18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node1);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node23);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node23);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node28);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node27, node29);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node23, node27);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node27);
        java.lang.String[] strArray35 = new java.lang.String[] { "undefined", "" };
        java.util.LinkedHashSet<java.lang.String> strSet36 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet36, strArray35);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node27, (java.util.Set<java.lang.String>) strSet36);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType40 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 100);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType42 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) ' ');
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node43);
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.rhino.Node node46 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node45);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node44, node46);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate48 = null;
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node46, nodePredicate48);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node46);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node46, false);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.isLabelName(node46);
        int int55 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node46, "undefined");
        boolean boolean56 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node46);
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node46);
        boolean boolean58 = matchNodeType42.apply(node46);
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.has(node27, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType40, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType42);
        int int60 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node1, 15, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType42);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "undefined", "" });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isVar(node1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isNew(node1);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isExprCall(node1);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.containsFunction(node1);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCallOrApply(node1);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node1);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node14);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node13, node15);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isVar(node13);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isNew(node13);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isExprCall(node13);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.containsFunction(node13);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCallOrApply(node13);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node13);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement24 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        int int25 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node13, (int) (byte) -1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement24);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType28 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 100);
        int int29 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node13, (int) (short) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType28);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.containsType(node1, 32, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType28);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node1);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.google.javascript.jscomp.NodeUtil.tryMergeBlock(node1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isVar(node1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isNew(node1);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node1);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isLabelName(node1);
        java.lang.Double double9 = com.google.javascript.jscomp.NodeUtil.getNumberValue(node1);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isVar(node1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isNew(node1);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isExprCall(node1);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node10);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node9, node11);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate13 = null;
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node11, nodePredicate13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node11);
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node11);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue17 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node11);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler18 = null;
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node11, abstractCompiler18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node1, node11);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue21 = com.google.javascript.jscomp.NodeUtil.getExpressionBooleanValue(node11);
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.getLoopCodeBlock(node11);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(ternaryValue17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(ternaryValue21);
        org.junit.Assert.assertNull(node22);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node4);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node3, node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node9);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node8, node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isVar(node8);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isLhs(node3, node8);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isLhs(node0, node8);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isThis(node8);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node8);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node8);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.getArgumentForCallOrNew(node8, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node1);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node1, abstractCompiler3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isString(node1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isForIn(node1);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate5 = null;
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node3, nodePredicate5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node3);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node3);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue9 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node3);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType11 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) ' ');
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node3, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType11);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue13 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node3);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node17);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node16, node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isVar(node16);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isNew(node16);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isExprCall(node16);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.containsFunction(node16);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCallOrApply(node16);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node16);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement27 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        int int28 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node16, (int) (byte) -1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.containsType(node3, 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement27);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node3);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isForIn(node3);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(ternaryValue9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(ternaryValue13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node3);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node2, node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isVar(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isNew(node2);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isExprCall(node2);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.containsFunction(node2);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCallOrApply(node2);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node2);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement13 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        int int14 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node2, (int) (byte) -1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement13);
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node2);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler16 = null;
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node2, abstractCompiler16);
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newVarNode("instanceof", node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(jSDocInfo15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.containsFunction(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node1);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node7);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node6, node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isVar(node6);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isNew(node6);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isExprCall(node6);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.containsFunction(node6);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node6, abstractCompiler14);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isNew(node6);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isGetProp(node6);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node19);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node24);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node23, node25);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node19, node23);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node30);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node29, node31);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate33 = null;
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node31, nodePredicate33);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node31);
        com.google.javascript.rhino.Node node36 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node31);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue37 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node31);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType39 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) ' ');
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node31, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType39);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node19, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType39);
        int int42 = matchNodeType39.type;
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node6, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType39);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node1, "JSCompiler_renameProperty", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType39);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler45 = null;
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node1, abstractCompiler45);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler47 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean48 = com.google.javascript.jscomp.NodeUtil.constructorCallHasSideEffects(node1, abstractCompiler47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected NEW node, got VOID");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNotNull(ternaryValue37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 32 + "'", int42 == 32);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node1);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node6);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node5, node7);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate9 = null;
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node7, nodePredicate9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node7);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node13);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = null;
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node13, abstractCompiler15);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isVar(node13);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node20);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node19, node21);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isVar(node19);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isNew(node19);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node19);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node19);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node27);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node29);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node28, node30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node32);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node34);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node33, node35);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isVar(node33);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isLhs(node28, node33);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.rhino.Node node40 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node39);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.rhino.Node node42 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node41);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node40, node42);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isVar(node40);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isNew(node40);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.rhino.Node node47 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node46);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.rhino.Node node49 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node48);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node47, node49);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate51 = null;
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node49, nodePredicate51);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node49);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node49, false);
        com.google.javascript.rhino.Node[] nodeArray56 = new com.google.javascript.rhino.Node[] { node7, node13, node19, node28, node40, node49 };
        com.google.javascript.rhino.Node node57 = com.google.javascript.jscomp.NodeUtil.newCallNode(node1, nodeArray56);
        com.google.javascript.rhino.Node node58 = null;
        com.google.javascript.rhino.Node node59 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node58);
        com.google.javascript.rhino.Node node60 = null;
        com.google.javascript.rhino.Node node61 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node60);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node59, node61);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate63 = null;
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node61, nodePredicate63);
        boolean boolean65 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node61);
        com.google.javascript.rhino.Node node66 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node61);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue67 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node61);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType69 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) ' ');
        boolean boolean70 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node61, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType69);
        boolean boolean71 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType69);
        boolean boolean72 = com.google.javascript.jscomp.NodeUtil.isGet(node1);
        java.lang.Double double73 = com.google.javascript.jscomp.NodeUtil.getNumberValue(node1);
        boolean boolean74 = com.google.javascript.jscomp.NodeUtil.containsFunction(node1);
        boolean boolean75 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node1);
        boolean boolean76 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node1);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(nodeArray56);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNull(node66);
        org.junit.Assert.assertNotNull(ternaryValue67);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double73));
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate5 = null;
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node3, nodePredicate5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node3, false);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        int int12 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node3, "undefined");
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node3);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node3);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node1);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node7);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node12);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node11, node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node7, node11);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node7);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node19);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node18, node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isVar(node18);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isNew(node18);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node18);
        int int26 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node18, "undefined");
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node1, node18);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node1);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.containsCall(node1);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node30);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node31);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler33 = null;
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node31, abstractCompiler33);
        java.lang.String str35 = com.google.javascript.jscomp.NodeUtil.getStringValue(node31);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.rhino.Node node37 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node36);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.rhino.Node node39 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node38);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node37, node39);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isVar(node37);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isNew(node37);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isExprCall(node37);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node31, node37);
        java.lang.String str45 = com.google.javascript.jscomp.NodeUtil.getStringValue(node37);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node1, node37);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler47 = null;
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node37, abstractCompiler47);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.containsCall(node37);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isString(node37);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType53 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (byte) 0);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node37, "", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType53);
        int int55 = matchNodeType53.type;
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.rhino.Node node57 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node56);
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node57);
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.isAssign(node57);
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node57);
        com.google.javascript.rhino.Node node61 = null;
        com.google.javascript.rhino.Node node62 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node61);
        com.google.javascript.rhino.Node node63 = null;
        com.google.javascript.rhino.Node node64 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node63);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node62, node64);
        boolean boolean66 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node62);
        com.google.javascript.rhino.Node node67 = null;
        com.google.javascript.rhino.Node node68 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node67);
        boolean boolean69 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node68);
        boolean boolean70 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node68);
        com.google.javascript.rhino.Node node71 = null;
        com.google.javascript.rhino.Node node72 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node71);
        com.google.javascript.rhino.Node node73 = null;
        com.google.javascript.rhino.Node node74 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node73);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node72, node74);
        boolean boolean76 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node68, node72);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node62, node68);
        com.google.javascript.jscomp.NodeUtil.MatchNotFunction matchNotFunction79 = new com.google.javascript.jscomp.NodeUtil.MatchNotFunction();
        int int80 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node62, (int) (byte) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNotFunction79);
        com.google.javascript.rhino.Node node81 = null;
        com.google.javascript.rhino.Node node82 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node81);
        boolean boolean83 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node82);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection84 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node82);
        boolean boolean85 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node82);
        boolean boolean86 = com.google.javascript.jscomp.NodeUtil.isThis(node82);
        boolean boolean87 = matchNotFunction79.apply(node82);
        boolean boolean88 = com.google.javascript.jscomp.NodeUtil.isLhs(node57, node82);
        com.google.javascript.rhino.Node node89 = com.google.javascript.jscomp.NodeUtil.getLoopCodeBlock(node57);
        boolean boolean90 = matchNodeType53.apply(node57);
        boolean boolean91 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node57);
        com.google.javascript.rhino.Node node92 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node57);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "undefined" + "'", str35, "undefined");
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "undefined" + "'", str45, "undefined");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(nodeCollection84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNull(node89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(node92);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection5 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node3);
        com.google.javascript.rhino.JSDocInfo jSDocInfo8 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.containsCall(node3);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node3);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeCollection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSDocInfo8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isString(node1);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node1, abstractCompiler5);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        com.google.javascript.rhino.Node node0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isName(node0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node1);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node1, abstractCompiler3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isString(node1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node1);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node9);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node8, node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node10);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node1, node10, "instanceof");
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isThis(node10);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node18);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node17, node19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isVar(node17);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isNew(node17);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isExprCall(node17);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.containsFunction(node17);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCallOrApply(node17);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node17);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement28 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        int int29 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node17, (int) (byte) -1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement28);
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newExpr(node17);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isLhs(node10, node17);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node17, true);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node17);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate5 = null;
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node3, nodePredicate5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node3, false);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node3, "undefined");
        java.lang.Double double12 = com.google.javascript.jscomp.NodeUtil.getNumberValue(node3);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue13 = com.google.javascript.jscomp.NodeUtil.getExpressionBooleanValue(node3);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node3);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node17);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node16, node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node18);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isString(node18);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node18);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node18);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue24 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node18);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node25);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node26);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node26);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node31);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node30, node32);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node26, node30);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.rhino.Node node36 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node35);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.rhino.Node node38 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node37);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node36, node38);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate40 = null;
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node38, nodePredicate40);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node38);
        com.google.javascript.rhino.Node node43 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node38);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue44 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node38);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType46 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) ' ');
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node38, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType46);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node26, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType46);
        int int49 = matchNodeType46.type;
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.rhino.Node node51 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node50);
        com.google.javascript.rhino.Node node52 = null;
        com.google.javascript.rhino.Node node53 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node52);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node51, node53);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.isVar(node51);
        boolean boolean56 = com.google.javascript.jscomp.NodeUtil.isNew(node51);
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.isExprCall(node51);
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.containsFunction(node51);
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCallOrApply(node51);
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node51);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement62 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        int int63 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node51, (int) (byte) -1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement62);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType66 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 100);
        int int67 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node51, (int) (short) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType66);
        boolean boolean68 = com.google.javascript.jscomp.NodeUtil.has(node18, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType46, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType66);
        boolean boolean69 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node3, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType66);
        boolean boolean70 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node3);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(ternaryValue13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(ternaryValue24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNotNull(ternaryValue44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 32 + "'", int49 == 32);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        java.lang.String str1 = com.google.javascript.jscomp.NodeUtil.opToStr((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "||" + "'", str1, "||");
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node1);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue4 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node1, "");
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(ternaryValue4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node1);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node6);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node5, node7);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate9 = null;
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node7, nodePredicate9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node7);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node13);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = null;
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node13, abstractCompiler15);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isVar(node13);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node20);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node19, node21);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isVar(node19);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isNew(node19);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node19);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node19);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node27);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node29);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node28, node30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node32);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node34);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node33, node35);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isVar(node33);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isLhs(node28, node33);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.rhino.Node node40 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node39);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.rhino.Node node42 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node41);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node40, node42);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isVar(node40);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isNew(node40);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.rhino.Node node47 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node46);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.rhino.Node node49 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node48);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node47, node49);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate51 = null;
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node49, nodePredicate51);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node49);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node49, false);
        com.google.javascript.rhino.Node[] nodeArray56 = new com.google.javascript.rhino.Node[] { node7, node13, node19, node28, node40, node49 };
        com.google.javascript.rhino.Node node57 = com.google.javascript.jscomp.NodeUtil.newCallNode(node1, nodeArray56);
        com.google.javascript.rhino.Node node58 = null;
        com.google.javascript.rhino.Node node59 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node58);
        com.google.javascript.rhino.Node node60 = null;
        com.google.javascript.rhino.Node node61 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node60);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node59, node61);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate63 = null;
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node61, nodePredicate63);
        boolean boolean65 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node61);
        com.google.javascript.rhino.Node node66 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node61);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue67 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node61);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType69 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) ' ');
        boolean boolean70 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node61, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType69);
        boolean boolean71 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType69);
        boolean boolean72 = com.google.javascript.jscomp.NodeUtil.isGet(node1);
        java.lang.String str73 = com.google.javascript.jscomp.NodeUtil.getStringValue(node1);
        com.google.javascript.rhino.Node node74 = null;
        com.google.javascript.rhino.Node node75 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node74);
        boolean boolean76 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node75);
        boolean boolean77 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node75);
        com.google.javascript.rhino.Node node78 = null;
        com.google.javascript.rhino.Node node79 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node78);
        com.google.javascript.rhino.Node node80 = null;
        com.google.javascript.rhino.Node node81 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node80);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node79, node81);
        boolean boolean83 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node75, node79);
        boolean boolean84 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node79);
        java.lang.String[] strArray87 = new java.lang.String[] { "undefined", "" };
        java.util.LinkedHashSet<java.lang.String> strSet88 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet88, strArray87);
        boolean boolean90 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node79, (java.util.Set<java.lang.String>) strSet88);
        boolean boolean91 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node1, (java.util.Set<java.lang.String>) strSet88);
        boolean boolean92 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node1);
        boolean boolean93 = com.google.javascript.jscomp.NodeUtil.isNew(node1);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(nodeArray56);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNull(node66);
        org.junit.Assert.assertNotNull(ternaryValue67);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "undefined" + "'", str73, "undefined");
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertArrayEquals(strArray87, new java.lang.String[] { "undefined", "" });
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isVar(node1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isNew(node1);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node1);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node1);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection9 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node1);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node11);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node14);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node15);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node15);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node20);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node19, node21);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node15, node19);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node26);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node25, node27);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate29 = null;
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node27, nodePredicate29);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node27);
        com.google.javascript.rhino.Node node32 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node27);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue33 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node27);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType35 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) ' ');
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node27, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType35);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node15, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType35);
        int int38 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node11, (int) (byte) 1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType35);
        java.lang.String str39 = com.google.javascript.jscomp.NodeUtil.getStringValue(node11);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.rhino.Node node41 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node40);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node41);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.rhino.Node node45 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node44);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node45);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node45);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.rhino.Node node49 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node48);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.rhino.Node node51 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node50);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node49, node51);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node45, node49);
        com.google.javascript.rhino.Node node54 = null;
        com.google.javascript.rhino.Node node55 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node54);
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.rhino.Node node57 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node56);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node55, node57);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate59 = null;
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node57, nodePredicate59);
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node57);
        com.google.javascript.rhino.Node node62 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node57);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue63 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node57);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType65 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) ' ');
        boolean boolean66 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node57, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType65);
        boolean boolean67 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node45, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType65);
        int int68 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node41, (int) (byte) 1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType65);
        boolean boolean69 = com.google.javascript.jscomp.NodeUtil.isLhs(node11, node41);
        boolean boolean70 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node1, node41);
        boolean boolean71 = com.google.javascript.jscomp.NodeUtil.isVar(node1);
        boolean boolean72 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node1);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node73 = com.google.javascript.jscomp.NodeUtil.getFnParameters(node1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeCollection9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNotNull(ternaryValue33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "undefined" + "'", str39, "undefined");
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNull(node62);
        org.junit.Assert.assertNotNull(ternaryValue63);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate5 = null;
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node3, nodePredicate5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node3);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node3);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue9 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node3);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node3);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isCall(node3);
        com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(node3);
        com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(node3);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node3);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue15 = com.google.javascript.jscomp.NodeUtil.getExpressionBooleanValue(node3);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(ternaryValue9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(ternaryValue15);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType1 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType(15);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node4);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node3, node5);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate7 = null;
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node5, nodePredicate7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node5);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node5);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue11 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node5);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType13 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) ' ');
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node5, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType13);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue15 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node5);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement17 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        int int18 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node5, 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node20);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler22 = null;
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node20, abstractCompiler22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isString(node20);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node20);
        boolean boolean26 = matchShallowStatement17.apply(node20);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node20, false);
        boolean boolean29 = matchNodeType1.apply(node20);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(ternaryValue11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(ternaryValue15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node1);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node7);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node12);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node11, node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node7, node11);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node7);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node19);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node18, node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isVar(node18);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isNew(node18);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node18);
        int int26 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node18, "undefined");
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node1, node18);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node30);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node29, node31);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node29);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node34);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node35);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node35);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.rhino.Node node39 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.rhino.Node node41 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node40);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node39, node41);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node35, node39);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node29, node35);
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.rhino.Node node46 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node45);
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.rhino.Node node48 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node47);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node46, node48);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isVar(node46);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isNew(node46);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node46);
        int int54 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node46, "undefined");
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node29, node46);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node18, node46);
        com.google.javascript.rhino.Node node57 = null;
        com.google.javascript.rhino.Node node58 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node57);
        com.google.javascript.rhino.Node node59 = null;
        com.google.javascript.rhino.Node node60 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node59);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node58, node60);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate62 = null;
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node60, nodePredicate62);
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node60);
        com.google.javascript.rhino.Node node65 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node60);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue66 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node60);
        boolean boolean67 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node60);
        boolean boolean68 = com.google.javascript.jscomp.NodeUtil.isCall(node60);
        com.google.javascript.rhino.Node node70 = null;
        com.google.javascript.rhino.Node node71 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node70);
        com.google.javascript.rhino.Node node72 = null;
        com.google.javascript.rhino.Node node73 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node72);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node71, node73);
        boolean boolean75 = com.google.javascript.jscomp.NodeUtil.isVar(node71);
        boolean boolean76 = com.google.javascript.jscomp.NodeUtil.isNew(node71);
        boolean boolean77 = com.google.javascript.jscomp.NodeUtil.isExprCall(node71);
        boolean boolean78 = com.google.javascript.jscomp.NodeUtil.containsFunction(node71);
        boolean boolean79 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCallOrApply(node71);
        boolean boolean80 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node71);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement82 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        int int83 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node71, (int) (byte) -1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement82);
        com.google.javascript.rhino.Node node84 = null;
        com.google.javascript.rhino.Node node85 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node84);
        boolean boolean86 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node85);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler87 = null;
        boolean boolean88 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node85, abstractCompiler87);
        java.lang.String str89 = com.google.javascript.jscomp.NodeUtil.getStringValue(node85);
        boolean boolean90 = matchShallowStatement82.apply(node85);
        int int91 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node60, 10, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement82);
        java.lang.String str92 = com.google.javascript.jscomp.NodeUtil.getStringValue(node60);
        boolean boolean93 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node18, node60);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNull(node65);
        org.junit.Assert.assertNotNull(ternaryValue66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "undefined" + "'", str89, "undefined");
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "undefined" + "'", str92, "undefined");
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection5 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node3);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration6 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node8);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node13);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node12, node14);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate16 = null;
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node14, nodePredicate16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node14);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node20);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler22 = null;
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node20, abstractCompiler22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isVar(node20);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node27);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node26, node28);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isVar(node26);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isNew(node26);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node26);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node26);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.rhino.Node node37 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node36);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node35, node37);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.rhino.Node node40 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node39);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.rhino.Node node42 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node41);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node40, node42);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isVar(node40);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isLhs(node35, node40);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.rhino.Node node47 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node46);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.rhino.Node node49 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node48);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node47, node49);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isVar(node47);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isNew(node47);
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.rhino.Node node54 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node53);
        com.google.javascript.rhino.Node node55 = null;
        com.google.javascript.rhino.Node node56 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node55);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node54, node56);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate58 = null;
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node56, nodePredicate58);
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node56);
        boolean boolean62 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node56, false);
        com.google.javascript.rhino.Node[] nodeArray63 = new com.google.javascript.rhino.Node[] { node14, node20, node26, node35, node47, node56 };
        com.google.javascript.rhino.Node node64 = com.google.javascript.jscomp.NodeUtil.newCallNode(node8, nodeArray63);
        com.google.javascript.rhino.Node node65 = null;
        com.google.javascript.rhino.Node node66 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node65);
        com.google.javascript.rhino.Node node67 = null;
        com.google.javascript.rhino.Node node68 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node67);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node66, node68);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate70 = null;
        boolean boolean71 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node68, nodePredicate70);
        boolean boolean72 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node68);
        com.google.javascript.rhino.Node node73 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node68);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue74 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node68);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType76 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) ' ');
        boolean boolean77 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node68, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType76);
        boolean boolean78 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node8, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType76);
        boolean boolean79 = com.google.javascript.jscomp.NodeUtil.isGet(node8);
        java.lang.String str80 = com.google.javascript.jscomp.NodeUtil.getStringValue(node8);
        boolean boolean81 = matchDeclaration6.apply(node8);
        boolean boolean82 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node3, node8);
        boolean boolean83 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node3);
        boolean boolean84 = com.google.javascript.jscomp.NodeUtil.isThis(node3);
        boolean boolean85 = com.google.javascript.jscomp.NodeUtil.isNew(node3);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler86 = null;
        boolean boolean87 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node3, abstractCompiler86);
        boolean boolean88 = com.google.javascript.jscomp.NodeUtil.isGet(node3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str89 = com.google.javascript.jscomp.NodeUtil.getPrototypePropertyName(node3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeCollection5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(nodeArray63);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNull(node73);
        org.junit.Assert.assertNotNull(ternaryValue74);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "undefined" + "'", str80, "undefined");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node2);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node7);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node6, node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node2, node6);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node2);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node2);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node2);
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node2);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node17);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node16, node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isVar(node16);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isNew(node16);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node16);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.containsFunction(node16);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node2, node16, "");
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node16);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node16);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isVarArgsFunction(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node1);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node7);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node12);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node11, node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node7, node11);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node7);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node19);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node18, node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isVar(node18);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isNew(node18);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node18);
        int int26 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node18, "undefined");
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node1, node18);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node30);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node29, node31);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node29);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node34);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node35);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node35);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.rhino.Node node39 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.rhino.Node node41 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node40);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node39, node41);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node35, node39);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node29, node35);
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.rhino.Node node46 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node45);
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.rhino.Node node48 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node47);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node46, node48);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isVar(node46);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isNew(node46);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node46);
        int int54 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node46, "undefined");
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node29, node46);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node18, node46);
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node46);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node58 = com.google.javascript.jscomp.NodeUtil.getConditionExpression(node46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: VOID does not have a condition.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node1);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node5);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node10);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node9, node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node5, node9);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node16);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node15, node17);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate19 = null;
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node17, nodePredicate19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node17);
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node17);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue23 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node17);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType25 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) ' ');
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node17, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType25);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node5, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType25);
        int int28 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node1, (int) (byte) 1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType25);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node1);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node1);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node1);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.getArgumentForCallOrNew(node1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(ternaryValue23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node4);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node3, node5);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate7 = null;
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node5, nodePredicate7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node5);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node5);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue11 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node5);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType13 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) ' ');
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node5, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType13);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue15 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node5);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node5);
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node5);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(codingConvention0, "JSCompiler_renameProperty", node17, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(ternaryValue11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(ternaryValue15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node4);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node3, node5);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate7 = null;
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node5, nodePredicate7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node5);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node5, false);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isLabelName(node5);
        int int14 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node5, "undefined");
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isGetProp(node5);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node17);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node22);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node21, node23);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node17, node21);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node28);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node27, node29);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate31 = null;
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node29, nodePredicate31);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node29);
        com.google.javascript.rhino.Node node34 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node29);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue35 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node29);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType37 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) ' ');
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node29, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType37);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node17, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType37);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node5, node17);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node5);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.rhino.Node node43 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node42);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.containsFunction(node43);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node43);
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.rhino.Node node48 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node47);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.rhino.Node node50 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node49);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node48, node50);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isVar(node48);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.isNew(node48);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.isExprCall(node48);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.containsFunction(node48);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler56 = null;
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node48, abstractCompiler56);
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.isNew(node48);
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.isGetProp(node48);
        com.google.javascript.rhino.Node node60 = null;
        com.google.javascript.rhino.Node node61 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node60);
        boolean boolean62 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node61);
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node61);
        com.google.javascript.rhino.Node node64 = null;
        com.google.javascript.rhino.Node node65 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node64);
        com.google.javascript.rhino.Node node66 = null;
        com.google.javascript.rhino.Node node67 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node66);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node65, node67);
        boolean boolean69 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node61, node65);
        com.google.javascript.rhino.Node node70 = null;
        com.google.javascript.rhino.Node node71 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node70);
        com.google.javascript.rhino.Node node72 = null;
        com.google.javascript.rhino.Node node73 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node72);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node71, node73);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate75 = null;
        boolean boolean76 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node73, nodePredicate75);
        boolean boolean77 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node73);
        com.google.javascript.rhino.Node node78 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node73);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue79 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node73);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType81 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) ' ');
        boolean boolean82 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node73, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType81);
        boolean boolean83 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node61, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType81);
        int int84 = matchNodeType81.type;
        boolean boolean85 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node48, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType81);
        boolean boolean86 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node43, "JSCompiler_renameProperty", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType81);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler87 = null;
        boolean boolean88 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node43, abstractCompiler87);
        boolean boolean89 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node43);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node5, node43, "<=");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node93 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(codingConvention0, "undefined", node43, "^");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNotNull(ternaryValue35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNull(node78);
        org.junit.Assert.assertNotNull(ternaryValue79);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 32 + "'", int84 == 32);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node1);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node6);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node5, node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node1, node5);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node1);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node1);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node1, "undefined");
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node1);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node5);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node10);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node9, node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node5, node9);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node16);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node15, node17);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate19 = null;
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node17, nodePredicate19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node17);
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node17);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue23 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node17);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType25 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) ' ');
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node17, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType25);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node5, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType25);
        int int28 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node1, (int) (byte) 1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType25);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node1);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node1);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node1, true);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(ternaryValue23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node7);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node6, node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isVar(node6);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isLhs(node1, node6);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isString(node1);
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node1);
        com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(node13);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isString(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node3);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue9 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node3);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection10 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node3);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isCall(node3);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node3);
        com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(node3);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node3, abstractCompiler14);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node3, "");
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(ternaryValue9);
        org.junit.Assert.assertNotNull(nodeCollection10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node1);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node6);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node5, node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node1, node5);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node12);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node11, node13);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate15 = null;
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node13, nodePredicate15);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node13);
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node13);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue19 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node13);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType21 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) ' ');
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node13, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType21);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType21);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.containsFunction(node1);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isGetProp(node1);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node1);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node28);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node31);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node32);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node32);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.rhino.Node node36 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node35);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.rhino.Node node38 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node37);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node36, node38);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node32, node36);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.rhino.Node node42 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node41);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node43);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node42, node44);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate46 = null;
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node44, nodePredicate46);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node44);
        com.google.javascript.rhino.Node node49 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node44);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue50 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node44);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType52 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) ' ');
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node44, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType52);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node32, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType52);
        int int55 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node28, (int) (byte) 1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType52);
        boolean boolean56 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node28);
        com.google.javascript.rhino.Node node57 = null;
        com.google.javascript.rhino.Node node58 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node57);
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node58);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler60 = null;
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node58, abstractCompiler60);
        boolean boolean62 = com.google.javascript.jscomp.NodeUtil.isVar(node58);
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node28, node58);
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node28);
        boolean boolean65 = com.google.javascript.jscomp.NodeUtil.isThis(node28);
        boolean boolean66 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node1, node28);
        com.google.javascript.rhino.Node node67 = null;
        com.google.javascript.rhino.Node node68 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node67);
        boolean boolean69 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node68);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection70 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node68);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node1, node68, "typeof");
        boolean boolean73 = com.google.javascript.jscomp.NodeUtil.isGetProp(node68);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(ternaryValue19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNotNull(ternaryValue50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(nodeCollection70);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isVar(node1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isNew(node1);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node1);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node1);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection9 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node1);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isNew(node1);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node13);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node12, node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node18);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node17, node19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isVar(node17);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isLhs(node12, node17);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isString(node12);
        java.lang.String str24 = com.google.javascript.jscomp.NodeUtil.getSourceName(node12);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node12);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = com.google.javascript.jscomp.NodeUtil.getPrototypePropertyName(node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeCollection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isVar(node1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isNew(node1);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node1);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node1);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node1);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node1);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCallOrApply(node1);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node1, abstractCompiler12);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isVar(node1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isNew(node1);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = com.google.javascript.jscomp.NodeUtil.getExpressionBooleanValue(node1);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node1);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node11);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node10, node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isVar(node10);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isNew(node10);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isExprCall(node10);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.containsFunction(node10);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCallOrApply(node10);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node10);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isLhs(node1, node10);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node10, "^");
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node3);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node2, node4);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate6 = null;
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node4, nodePredicate6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node4);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node4);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue10 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node4);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType12 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) ' ');
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node4, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType12);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue14 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node4);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node18);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node17, node19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isVar(node17);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isNew(node17);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isExprCall(node17);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.containsFunction(node17);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCallOrApply(node17);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node17);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement28 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        int int29 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node17, (int) (byte) -1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement28);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.containsType(node4, 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement28);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isCall(node4);
        com.google.javascript.rhino.Node node32 = com.google.javascript.jscomp.NodeUtil.newVarNode("typeof", node4);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node4);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(ternaryValue10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(ternaryValue14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isSimpleOperatorType(32);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node3);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node2, node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isVar(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isNew(node2);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node2);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node2);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection10 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node2);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node12);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node15);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node16);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node21);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node20, node22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node16, node20);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node27);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node26, node28);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate30 = null;
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node28, nodePredicate30);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node28);
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node28);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue34 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node28);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType36 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) ' ');
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node28, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType36);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node16, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType36);
        int int39 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node12, (int) (byte) 1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType36);
        java.lang.String str40 = com.google.javascript.jscomp.NodeUtil.getStringValue(node12);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.rhino.Node node42 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node41);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node42);
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.rhino.Node node46 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node45);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node46);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node46);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.rhino.Node node50 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node49);
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.rhino.Node node52 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node51);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node50, node52);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node46, node50);
        com.google.javascript.rhino.Node node55 = null;
        com.google.javascript.rhino.Node node56 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node55);
        com.google.javascript.rhino.Node node57 = null;
        com.google.javascript.rhino.Node node58 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node57);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node56, node58);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate60 = null;
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node58, nodePredicate60);
        boolean boolean62 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node58);
        com.google.javascript.rhino.Node node63 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node58);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue64 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node58);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType66 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) ' ');
        boolean boolean67 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node58, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType66);
        boolean boolean68 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node46, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType66);
        int int69 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node42, (int) (byte) 1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType66);
        boolean boolean70 = com.google.javascript.jscomp.NodeUtil.isLhs(node12, node42);
        boolean boolean71 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node2, node42);
        boolean boolean72 = com.google.javascript.jscomp.NodeUtil.isVar(node2);
        boolean boolean73 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node2);
        com.google.javascript.rhino.Node node74 = com.google.javascript.jscomp.NodeUtil.newVarNode("undefined", node2);
        com.google.javascript.rhino.Node node75 = null;
        com.google.javascript.rhino.Node node76 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node75);
        com.google.javascript.rhino.JSDocInfo jSDocInfo77 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node76);
        boolean boolean78 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node76);
        com.google.javascript.rhino.Node node79 = null;
        com.google.javascript.rhino.Node node80 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node79);
        com.google.javascript.rhino.Node node81 = null;
        com.google.javascript.rhino.Node node82 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node81);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node80, node82);
        boolean boolean84 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node82);
        boolean boolean85 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node82);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node76, node82, "||");
        boolean boolean88 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node74, node82);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeCollection10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(ternaryValue34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "undefined" + "'", str40, "undefined");
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNull(node63);
        org.junit.Assert.assertNotNull(ternaryValue64);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertNull(jSDocInfo77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node1);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node1, abstractCompiler3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isString(node1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node1);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node9);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node8, node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node10);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node1, node10, "instanceof");
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node1);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node18);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node17, node19);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate21 = null;
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node19, nodePredicate21);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node19);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node19, false);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node19, "undefined");
        java.lang.Double double28 = com.google.javascript.jscomp.NodeUtil.getNumberValue(node19);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue29 = com.google.javascript.jscomp.NodeUtil.getExpressionBooleanValue(node19);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node19);
        com.google.javascript.rhino.Node node31 = com.google.javascript.jscomp.NodeUtil.newExpr(node19);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node15, node31);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.containsCall(node15);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertNotNull(ternaryValue29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType1 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (byte) 10);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node1);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node1, abstractCompiler3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isString(node1);
        com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(node1);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isVar(node1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isNew(node1);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isNew(node1);
        com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(node1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isVarArgsFunction(node1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node4);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node3, node5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node5);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isString(node5);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node5);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node5);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.containsType(node5, 32);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newName(codingConvention0, "^", node5, "instanceof");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate5 = null;
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node3, nodePredicate5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node3, false);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        int int12 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node3, "undefined");
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node3);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node3, abstractCompiler14);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType18 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType(0);
        int int19 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node3, 6, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isCall(node3);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isName(node3);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node1);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node5);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node10);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node9, node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node5, node9);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node16);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node15, node17);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate19 = null;
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node17, nodePredicate19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node17);
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node17);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue23 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node17);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType25 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) ' ');
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node17, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType25);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node5, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType25);
        int int28 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node1, (int) (byte) 1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType25);
        java.lang.String str29 = com.google.javascript.jscomp.NodeUtil.getStringValue(node1);
        int int31 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node1, "<=");
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(ternaryValue23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "undefined" + "'", str29, "undefined");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        int int6 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node3, "hi!");
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node3, false);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node11);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node10, node12);
        int int15 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node12, "hi!");
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isCall(node12);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node12);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node19);
        com.google.javascript.rhino.Node[] nodeArray21 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newCallNode(node19, nodeArray21);
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newCallNode(node12, nodeArray21);
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newCallNode(node3, nodeArray21);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(nodeArray21);
        org.junit.Assert.assertArrayEquals(nodeArray21, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node24);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isVar(node1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isNew(node1);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node1);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node1);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection9 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node1);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isNew(node1);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node1);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeCollection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node1);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node7);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node12);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node11, node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node7, node11);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node7);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node19);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node18, node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isVar(node18);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isNew(node18);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node18);
        int int26 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node18, "undefined");
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node1, node18);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node1);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.containsCall(node1);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node32);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node31, node33);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate35 = null;
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node33, nodePredicate35);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node33);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node33, false);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isLabelName(node33);
        int int42 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node33, "undefined");
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isGetProp(node33);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.rhino.Node node45 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node44);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node45);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node45);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.rhino.Node node49 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node48);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.rhino.Node node51 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node50);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node49, node51);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node45, node49);
        com.google.javascript.rhino.Node node54 = null;
        com.google.javascript.rhino.Node node55 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node54);
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.rhino.Node node57 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node56);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node55, node57);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate59 = null;
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node57, nodePredicate59);
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node57);
        com.google.javascript.rhino.Node node62 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node57);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue63 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node57);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType65 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) ' ');
        boolean boolean66 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node57, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType65);
        boolean boolean67 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node45, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType65);
        boolean boolean68 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node33, node45);
        boolean boolean69 = com.google.javascript.jscomp.NodeUtil.isLhs(node1, node33);
        com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(node1);
        com.google.javascript.rhino.Node node71 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node1);
        boolean boolean72 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node71);
        boolean boolean73 = com.google.javascript.jscomp.NodeUtil.isThis(node71);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node74 = com.google.javascript.jscomp.NodeUtil.getFunctionBody(node71);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNull(node62);
        org.junit.Assert.assertNotNull(ternaryValue63);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node7);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node6, node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isVar(node6);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isLhs(node1, node6);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isForIn(node6);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node6);
        java.lang.Double double14 = com.google.javascript.jscomp.NodeUtil.getNumberValue(node6);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate5 = null;
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node3, nodePredicate5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node3);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node3);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue9 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node3);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node3);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.getArgumentForCallOrNew(node3, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(ternaryValue9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node1);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection3 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.containsCall(node1);
        int int6 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node1, "");
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isFunction(node1);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.getCatchBlock(node1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(nodeCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = com.google.javascript.jscomp.NodeUtil.precedence((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.Error; message: Unknown precedence for error (type -1)");
        } catch (java.lang.Error e) {
            // Expected exception.
        }
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node1);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isVar(node1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isNew(node1);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isExprCall(node1);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.containsFunction(node1);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCallOrApply(node1);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node1);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement12 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        int int13 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node1, (int) (byte) -1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node14);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node15);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler17 = null;
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node15, abstractCompiler17);
        java.lang.String str19 = com.google.javascript.jscomp.NodeUtil.getStringValue(node15);
        boolean boolean20 = matchShallowStatement12.apply(node15);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection21 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node15);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node15, "hi!");
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node27);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node26, node28);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node26);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node31);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node32);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node32);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.rhino.Node node36 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node35);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.rhino.Node node38 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node37);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node36, node38);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node32, node36);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node26, node32);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.rhino.Node node43 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node42);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.rhino.Node node45 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node44);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node43, node45);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isVar(node43);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isNew(node43);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node43);
        int int51 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node43, "undefined");
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node26, node43);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node26);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node26);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node26);
        com.google.javascript.rhino.Node node57 = null;
        com.google.javascript.rhino.Node node58 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node57);
        com.google.javascript.rhino.Node node59 = null;
        com.google.javascript.rhino.Node node60 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node59);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node58, node60);
        boolean boolean62 = com.google.javascript.jscomp.NodeUtil.isVar(node58);
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.isNew(node58);
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.isExprCall(node58);
        boolean boolean65 = com.google.javascript.jscomp.NodeUtil.containsFunction(node58);
        boolean boolean66 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCallOrApply(node58);
        boolean boolean67 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node58);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement69 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        int int70 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node58, (int) (byte) -1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement69);
        com.google.javascript.rhino.Node node71 = null;
        com.google.javascript.rhino.Node node72 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node71);
        boolean boolean73 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node72);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection74 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node72);
        boolean boolean75 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node72);
        com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(node72);
        boolean boolean77 = matchShallowStatement69.apply(node72);
        boolean boolean78 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node26, "typeof", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement69);
        boolean boolean79 = com.google.javascript.jscomp.NodeUtil.containsType(node15, 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement69);
        com.google.javascript.rhino.Node node80 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node15);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "undefined" + "'", str19, "undefined");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(nodeCollection21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(nodeCollection74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNull(node80);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node1);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node6);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node5, node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node1, node5);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isVarArgsFunction(node1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection5 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node3);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration6 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node8);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node13);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node12, node14);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate16 = null;
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node14, nodePredicate16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node14);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node20);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler22 = null;
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node20, abstractCompiler22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isVar(node20);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node27);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node26, node28);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isVar(node26);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isNew(node26);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node26);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node26);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.rhino.Node node37 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node36);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node35, node37);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.rhino.Node node40 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node39);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.rhino.Node node42 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node41);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node40, node42);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isVar(node40);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isLhs(node35, node40);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.rhino.Node node47 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node46);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.rhino.Node node49 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node48);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node47, node49);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isVar(node47);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isNew(node47);
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.rhino.Node node54 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node53);
        com.google.javascript.rhino.Node node55 = null;
        com.google.javascript.rhino.Node node56 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node55);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node54, node56);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate58 = null;
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node56, nodePredicate58);
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node56);
        boolean boolean62 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node56, false);
        com.google.javascript.rhino.Node[] nodeArray63 = new com.google.javascript.rhino.Node[] { node14, node20, node26, node35, node47, node56 };
        com.google.javascript.rhino.Node node64 = com.google.javascript.jscomp.NodeUtil.newCallNode(node8, nodeArray63);
        com.google.javascript.rhino.Node node65 = null;
        com.google.javascript.rhino.Node node66 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node65);
        com.google.javascript.rhino.Node node67 = null;
        com.google.javascript.rhino.Node node68 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node67);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node66, node68);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate70 = null;
        boolean boolean71 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node68, nodePredicate70);
        boolean boolean72 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node68);
        com.google.javascript.rhino.Node node73 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node68);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue74 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node68);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType76 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) ' ');
        boolean boolean77 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node68, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType76);
        boolean boolean78 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node8, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType76);
        boolean boolean79 = com.google.javascript.jscomp.NodeUtil.isGet(node8);
        java.lang.String str80 = com.google.javascript.jscomp.NodeUtil.getStringValue(node8);
        boolean boolean81 = matchDeclaration6.apply(node8);
        boolean boolean82 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node3, node8);
        boolean boolean83 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node3);
        boolean boolean84 = com.google.javascript.jscomp.NodeUtil.isThis(node3);
        boolean boolean85 = com.google.javascript.jscomp.NodeUtil.isNew(node3);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler86 = null;
        boolean boolean87 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node3, abstractCompiler86);
        boolean boolean88 = com.google.javascript.jscomp.NodeUtil.isGet(node3);
        boolean boolean89 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node3);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeCollection5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(nodeArray63);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNull(node73);
        org.junit.Assert.assertNotNull(ternaryValue74);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "undefined" + "'", str80, "undefined");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        int int6 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node3, "hi!");
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node3, false);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node3);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection10 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node3);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node3);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node3);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeCollection10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration0 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node2);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node7);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node6, node8);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate10 = null;
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node8, nodePredicate10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node8);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node14);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler16 = null;
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node14, abstractCompiler16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isVar(node14);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node21);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node20, node22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isVar(node20);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isNew(node20);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node20);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node20);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node30);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node29, node31);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.rhino.Node node34 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node33);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.rhino.Node node36 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node35);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node34, node36);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isVar(node34);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isLhs(node29, node34);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.rhino.Node node41 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node40);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.rhino.Node node43 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node42);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node41, node43);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isVar(node41);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isNew(node41);
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.rhino.Node node48 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node47);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.rhino.Node node50 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node49);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node48, node50);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate52 = null;
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node50, nodePredicate52);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node50);
        boolean boolean56 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node50, false);
        com.google.javascript.rhino.Node[] nodeArray57 = new com.google.javascript.rhino.Node[] { node8, node14, node20, node29, node41, node50 };
        com.google.javascript.rhino.Node node58 = com.google.javascript.jscomp.NodeUtil.newCallNode(node2, nodeArray57);
        com.google.javascript.rhino.Node node59 = null;
        com.google.javascript.rhino.Node node60 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node59);
        com.google.javascript.rhino.Node node61 = null;
        com.google.javascript.rhino.Node node62 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node61);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node60, node62);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate64 = null;
        boolean boolean65 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node62, nodePredicate64);
        boolean boolean66 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node62);
        com.google.javascript.rhino.Node node67 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node62);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue68 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node62);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType70 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) ' ');
        boolean boolean71 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node62, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType70);
        boolean boolean72 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType70);
        boolean boolean73 = com.google.javascript.jscomp.NodeUtil.isGet(node2);
        java.lang.String str74 = com.google.javascript.jscomp.NodeUtil.getStringValue(node2);
        boolean boolean75 = matchDeclaration0.apply(node2);
        com.google.javascript.rhino.Node node76 = null;
        com.google.javascript.rhino.Node node77 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node76);
        com.google.javascript.rhino.Node node78 = null;
        com.google.javascript.rhino.Node node79 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node78);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node77, node79);
        boolean boolean81 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node79);
        boolean boolean82 = com.google.javascript.jscomp.NodeUtil.isString(node79);
        boolean boolean83 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node79);
        boolean boolean84 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node79);
        boolean boolean85 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node79);
        boolean boolean86 = matchDeclaration0.apply(node79);
        com.google.javascript.rhino.Node node87 = null;
        com.google.javascript.rhino.Node node88 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node87);
        com.google.javascript.rhino.Node node89 = null;
        com.google.javascript.rhino.Node node90 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node89);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node88, node90);
        boolean boolean92 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node88);
        boolean boolean93 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node88);
        boolean boolean94 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node88);
        boolean boolean95 = matchDeclaration0.apply(node88);
        com.google.javascript.rhino.Node node96 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node88);
        boolean boolean97 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCallOrApply(node96);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(nodeArray57);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNull(node67);
        org.junit.Assert.assertNotNull(ternaryValue68);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "undefined" + "'", str74, "undefined");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(node88);
        org.junit.Assert.assertNotNull(node90);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertNotNull(node96);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.containsFunction(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node1);
        java.lang.Double double4 = com.google.javascript.jscomp.NodeUtil.getNumberValue(node1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.containsCall(node1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node1);
        com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(node1);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node1);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node7);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node6, node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isVar(node6);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isLhs(node1, node6);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCallOrApply(node1);
        java.lang.String str13 = com.google.javascript.jscomp.NodeUtil.getStringValue(node1);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node1);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCallOrApply(node1);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "undefined" + "'", str13, "undefined");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node1);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection3 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node1);
        java.lang.Double double5 = com.google.javascript.jscomp.NodeUtil.getNumberValue(node1);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(nodeCollection3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isVar(node1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isNew(node1);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isExprCall(node1);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.containsFunction(node1);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node1, abstractCompiler9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isNew(node1);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isGetProp(node1);
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newExpr(node1);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node1);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node4);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node3, node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node9);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node8, node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isVar(node8);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isLhs(node3, node8);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isLhs(node0, node8);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isThis(node8);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node8);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler17 = null;
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node8, abstractCompiler17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isGetProp(node8);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection5 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node3);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration6 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node8);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node13);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node12, node14);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate16 = null;
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node14, nodePredicate16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node14);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node20);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler22 = null;
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node20, abstractCompiler22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isVar(node20);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node27);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node26, node28);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isVar(node26);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isNew(node26);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node26);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node26);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.rhino.Node node37 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node36);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node35, node37);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.rhino.Node node40 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node39);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.rhino.Node node42 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node41);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node40, node42);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isVar(node40);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isLhs(node35, node40);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.rhino.Node node47 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node46);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.rhino.Node node49 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node48);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node47, node49);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isVar(node47);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isNew(node47);
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.rhino.Node node54 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node53);
        com.google.javascript.rhino.Node node55 = null;
        com.google.javascript.rhino.Node node56 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node55);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node54, node56);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate58 = null;
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node56, nodePredicate58);
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node56);
        boolean boolean62 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node56, false);
        com.google.javascript.rhino.Node[] nodeArray63 = new com.google.javascript.rhino.Node[] { node14, node20, node26, node35, node47, node56 };
        com.google.javascript.rhino.Node node64 = com.google.javascript.jscomp.NodeUtil.newCallNode(node8, nodeArray63);
        com.google.javascript.rhino.Node node65 = null;
        com.google.javascript.rhino.Node node66 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node65);
        com.google.javascript.rhino.Node node67 = null;
        com.google.javascript.rhino.Node node68 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node67);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node66, node68);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate70 = null;
        boolean boolean71 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node68, nodePredicate70);
        boolean boolean72 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node68);
        com.google.javascript.rhino.Node node73 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node68);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue74 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node68);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType76 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) ' ');
        boolean boolean77 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node68, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType76);
        boolean boolean78 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node8, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType76);
        boolean boolean79 = com.google.javascript.jscomp.NodeUtil.isGet(node8);
        java.lang.String str80 = com.google.javascript.jscomp.NodeUtil.getStringValue(node8);
        boolean boolean81 = matchDeclaration6.apply(node8);
        boolean boolean82 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node3, node8);
        boolean boolean83 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node8);
        boolean boolean84 = com.google.javascript.jscomp.NodeUtil.isVar(node8);
        boolean boolean85 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node8);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeCollection5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(nodeArray63);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNull(node73);
        org.junit.Assert.assertNotNull(ternaryValue74);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "undefined" + "'", str80, "undefined");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection5 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node3);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration6 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node8);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node13);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node12, node14);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate16 = null;
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node14, nodePredicate16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node14);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node20);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler22 = null;
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node20, abstractCompiler22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isVar(node20);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node27);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node26, node28);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isVar(node26);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isNew(node26);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node26);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node26);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.rhino.Node node37 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node36);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node35, node37);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.rhino.Node node40 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node39);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.rhino.Node node42 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node41);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node40, node42);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isVar(node40);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isLhs(node35, node40);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.rhino.Node node47 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node46);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.rhino.Node node49 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node48);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node47, node49);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isVar(node47);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isNew(node47);
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.rhino.Node node54 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node53);
        com.google.javascript.rhino.Node node55 = null;
        com.google.javascript.rhino.Node node56 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node55);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node54, node56);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate58 = null;
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node56, nodePredicate58);
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node56);
        boolean boolean62 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node56, false);
        com.google.javascript.rhino.Node[] nodeArray63 = new com.google.javascript.rhino.Node[] { node14, node20, node26, node35, node47, node56 };
        com.google.javascript.rhino.Node node64 = com.google.javascript.jscomp.NodeUtil.newCallNode(node8, nodeArray63);
        com.google.javascript.rhino.Node node65 = null;
        com.google.javascript.rhino.Node node66 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node65);
        com.google.javascript.rhino.Node node67 = null;
        com.google.javascript.rhino.Node node68 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node67);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node66, node68);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate70 = null;
        boolean boolean71 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node68, nodePredicate70);
        boolean boolean72 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node68);
        com.google.javascript.rhino.Node node73 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node68);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue74 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node68);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType76 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) ' ');
        boolean boolean77 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node68, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType76);
        boolean boolean78 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node8, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType76);
        boolean boolean79 = com.google.javascript.jscomp.NodeUtil.isGet(node8);
        java.lang.String str80 = com.google.javascript.jscomp.NodeUtil.getStringValue(node8);
        boolean boolean81 = matchDeclaration6.apply(node8);
        boolean boolean82 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node3, node8);
        boolean boolean83 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node3);
        boolean boolean84 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node3);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(nodeCollection5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(nodeArray63);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNull(node73);
        org.junit.Assert.assertNotNull(ternaryValue74);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "undefined" + "'", str80, "undefined");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node1);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node7);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node12);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node11, node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node7, node11);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node7);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.getArgumentForCallOrNew(node7, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node1);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node5);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node10);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node9, node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node5, node9);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node16);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node15, node17);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate19 = null;
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node17, nodePredicate19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node17);
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node17);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue23 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node17);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType25 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) ' ');
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node17, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType25);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node5, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType25);
        int int28 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node1, (int) (byte) 1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType25);
        java.lang.String str29 = com.google.javascript.jscomp.NodeUtil.getStringValue(node1);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node30);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node31);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node34);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node35);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node35);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.rhino.Node node39 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.rhino.Node node41 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node40);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node39, node41);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node35, node39);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.rhino.Node node45 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node44);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.rhino.Node node47 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node46);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node45, node47);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate49 = null;
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node47, nodePredicate49);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node47);
        com.google.javascript.rhino.Node node52 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node47);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue53 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node47);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType55 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) ' ');
        boolean boolean56 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node47, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType55);
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node35, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType55);
        int int58 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node31, (int) (byte) 1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType55);
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.isLhs(node1, node31);
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(node31);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(ternaryValue23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "undefined" + "'", str29, "undefined");
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertNotNull(ternaryValue53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node0, abstractCompiler1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node2);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node7);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node6, node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node2, node6);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node2);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node2);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node2);
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node2);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node17);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node16, node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isVar(node16);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isNew(node16);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node16);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.containsFunction(node16);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node2, node16, "");
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.containsCall(node16);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.getFunctionBody(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node2);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node7);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node6, node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node2, node6);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node2);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node2);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node2);
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node2);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCallOrApply(node14);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isGetProp(node14);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isString(node14);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate5 = null;
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node3, nodePredicate5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node3, false);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node3);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node3);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node3);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node3);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.referencesThis(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node3);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isVar(node1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isNew(node1);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = com.google.javascript.jscomp.NodeUtil.getExpressionBooleanValue(node1);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isVarArgsFunction(node1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node1);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node1, abstractCompiler3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node7);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node6, node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node6);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node12);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node17);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node16, node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node12, node16);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node6, node12);
        com.google.javascript.jscomp.NodeUtil.MatchNotFunction matchNotFunction23 = new com.google.javascript.jscomp.NodeUtil.MatchNotFunction();
        int int24 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node6, (int) (byte) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNotFunction23);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node25);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node26);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node26);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node31);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node30, node32);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node26, node30);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node30);
        java.lang.String[] strArray38 = new java.lang.String[] { "undefined", "" };
        java.util.LinkedHashSet<java.lang.String> strSet39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node30, (java.util.Set<java.lang.String>) strSet39);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType43 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 100);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType45 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) ' ');
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.rhino.Node node47 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node46);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.rhino.Node node49 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node48);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node47, node49);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate51 = null;
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node49, nodePredicate51);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node49);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node49, false);
        boolean boolean56 = com.google.javascript.jscomp.NodeUtil.isLabelName(node49);
        int int58 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node49, "undefined");
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node49);
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node49);
        boolean boolean61 = matchNodeType45.apply(node49);
        boolean boolean62 = com.google.javascript.jscomp.NodeUtil.has(node30, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType43, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType45);
        boolean boolean63 = matchNotFunction23.apply(node30);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration65 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        int int66 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node30, (int) (short) 1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration65);
        boolean boolean67 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration65);
        boolean boolean68 = com.google.javascript.jscomp.NodeUtil.isVar(node1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean69 = com.google.javascript.jscomp.NodeUtil.callHasLocalResult(node1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "undefined", "" });
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate5 = null;
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node3, nodePredicate5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node3, false);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        int int12 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node3, "undefined");
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node3);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node1);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node1, abstractCompiler3);
        java.lang.String str5 = com.google.javascript.jscomp.NodeUtil.getStringValue(node1);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node8);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node7, node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isVar(node7);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isNew(node7);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isExprCall(node7);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node7);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node17);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node16, node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isVar(node16);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isNew(node16);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isExprCall(node16);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.containsFunction(node16);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCallOrApply(node16);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node16);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement27 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        int int28 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node16, (int) (byte) -1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement27);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node32);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node31, node33);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection35 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node33);
        boolean boolean36 = matchShallowStatement27.apply(node33);
        com.google.javascript.rhino.JSDocInfo jSDocInfo37 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node33);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node33);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isCall(node33);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "undefined" + "'", str5, "undefined");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(nodeCollection35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(jSDocInfo37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate5 = null;
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node3, nodePredicate5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node3, false);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        int int12 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node3, "undefined");
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node3);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node3);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node3, "JSCompiler_renameProperty");
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node3);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node3);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node21);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node21);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node26);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node25, node27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node21, node25);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node21);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node21);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node21);
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node21);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.rhino.Node node37 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node36);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node35, node37);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isVar(node35);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isNew(node35);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node35);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.containsFunction(node35);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node21, node35, "");
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node35);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node3, node35, "||");
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node3);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate5 = null;
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node3, nodePredicate5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node3);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node3);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue9 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node3);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType11 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) ' ');
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node3, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType11);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue13 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node3);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement15 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        int int16 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node3, 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement15);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node3, "hi!");
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node22);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node21, node23);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection25 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node23);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node23);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node23);
        com.google.javascript.rhino.JSDocInfo jSDocInfo28 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node23);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node29);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node30);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node30);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.rhino.Node node34 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node33);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.rhino.Node node36 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node35);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node34, node36);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node30, node34);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node34);
        java.lang.String[] strArray42 = new java.lang.String[] { "undefined", "" };
        java.util.LinkedHashSet<java.lang.String> strSet43 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet43, strArray42);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node34, (java.util.Set<java.lang.String>) strSet43);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType47 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 100);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType49 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) ' ');
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.rhino.Node node51 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node50);
        com.google.javascript.rhino.Node node52 = null;
        com.google.javascript.rhino.Node node53 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node52);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node51, node53);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate55 = null;
        boolean boolean56 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node53, nodePredicate55);
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node53);
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node53, false);
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.isLabelName(node53);
        int int62 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node53, "undefined");
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node53);
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node53);
        boolean boolean65 = matchNodeType49.apply(node53);
        boolean boolean66 = com.google.javascript.jscomp.NodeUtil.has(node34, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType47, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType49);
        boolean boolean67 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node23, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType49);
        int int68 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node3, 10, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType49);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node70 = com.google.javascript.jscomp.NodeUtil.getArgumentForFunction(node3, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(ternaryValue9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(ternaryValue13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(nodeCollection25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(jSDocInfo28);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertArrayEquals(strArray42, new java.lang.String[] { "undefined", "" });
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node3);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection6 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node3);
        com.google.javascript.rhino.JSDocInfo jSDocInfo7 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isGet(node3);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node11);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node10, node12);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate14 = null;
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node12, nodePredicate14);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node12);
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node12);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue18 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node12);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node12);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isCall(node12);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node24);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node23, node25);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isVar(node23);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isNew(node23);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isExprCall(node23);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.containsFunction(node23);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCallOrApply(node23);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node23);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement34 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        int int35 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node23, (int) (byte) -1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.rhino.Node node37 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node36);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node37);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler39 = null;
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node37, abstractCompiler39);
        java.lang.String str41 = com.google.javascript.jscomp.NodeUtil.getStringValue(node37);
        boolean boolean42 = matchShallowStatement34.apply(node37);
        int int43 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node12, 10, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement34);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.rhino.Node node45 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node44);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.rhino.Node node47 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node46);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node45, node47);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate49 = null;
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node47, nodePredicate49);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node47);
        com.google.javascript.rhino.Node node52 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node47);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue53 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node47);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node47);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.isCall(node47);
        boolean boolean56 = matchShallowStatement34.apply(node47);
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.isLhs(node3, node47);
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.referencesThis(node3);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection59 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node3);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(nodeCollection6);
        org.junit.Assert.assertNull(jSDocInfo7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(ternaryValue18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "undefined" + "'", str41, "undefined");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertNotNull(ternaryValue53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(nodeCollection59);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate5 = null;
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node3, nodePredicate5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node3);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.getLoopCodeBlock(node3);
        com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(node3);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node4);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node3, node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node9);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node8, node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isVar(node8);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isLhs(node3, node8);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isLhs(node0, node8);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isThis(node8);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node8);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node20);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node19, node21);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isVar(node19);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isNew(node19);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isExprCall(node19);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.containsFunction(node19);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCallOrApply(node19);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node19);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement30 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        int int31 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node19, (int) (byte) -1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node32);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node33);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler35 = null;
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node33, abstractCompiler35);
        java.lang.String str37 = com.google.javascript.jscomp.NodeUtil.getStringValue(node33);
        boolean boolean38 = matchShallowStatement30.apply(node33);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.containsType(node8, 10, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement30);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.rhino.Node node41 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node40);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.rhino.Node node43 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node42);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node41, node43);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection45 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node43);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node43);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node43);
        com.google.javascript.rhino.JSDocInfo jSDocInfo48 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node43);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.rhino.Node node50 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node49);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node50);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node50);
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.rhino.Node node54 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node53);
        com.google.javascript.rhino.Node node55 = null;
        com.google.javascript.rhino.Node node56 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node55);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node54, node56);
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node50, node54);
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node54);
        java.lang.String[] strArray62 = new java.lang.String[] { "undefined", "" };
        java.util.LinkedHashSet<java.lang.String> strSet63 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet63, strArray62);
        boolean boolean65 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node54, (java.util.Set<java.lang.String>) strSet63);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType67 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 100);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType69 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) ' ');
        com.google.javascript.rhino.Node node70 = null;
        com.google.javascript.rhino.Node node71 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node70);
        com.google.javascript.rhino.Node node72 = null;
        com.google.javascript.rhino.Node node73 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node72);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node71, node73);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate75 = null;
        boolean boolean76 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node73, nodePredicate75);
        boolean boolean77 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node73);
        boolean boolean79 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node73, false);
        boolean boolean80 = com.google.javascript.jscomp.NodeUtil.isLabelName(node73);
        int int82 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node73, "undefined");
        boolean boolean83 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node73);
        boolean boolean84 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node73);
        boolean boolean85 = matchNodeType69.apply(node73);
        boolean boolean86 = com.google.javascript.jscomp.NodeUtil.has(node54, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType67, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType69);
        boolean boolean87 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node43, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType69);
        boolean boolean88 = matchShallowStatement30.apply(node43);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.JSDocInfo jSDocInfo89 = com.google.javascript.jscomp.NodeUtil.getFunctionInfo(node43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "undefined" + "'", str37, "undefined");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(nodeCollection45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(jSDocInfo48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertArrayEquals(strArray62, new java.lang.String[] { "undefined", "" });
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isVar(node1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isNew(node1);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node1);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node1);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSDocInfo9);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node1);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node1, abstractCompiler3);
        java.lang.String str5 = com.google.javascript.jscomp.NodeUtil.getStringValue(node1);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node8);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node7, node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isVar(node7);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isNew(node7);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isExprCall(node7);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node7);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node17);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node16, node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isVar(node16);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isNew(node16);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isExprCall(node16);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.containsFunction(node16);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCallOrApply(node16);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node16);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement27 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        int int28 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node16, (int) (byte) -1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement27);
        java.lang.String str30 = com.google.javascript.jscomp.NodeUtil.getStringValue(node1);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node31);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.rhino.Node node34 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node33);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node32, node34);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isVar(node32);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isNew(node32);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isExprCall(node32);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler39 = null;
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node32, abstractCompiler39);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node1, node32);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isCall(node32);
        com.google.javascript.jscomp.NodeUtil.Visitor visitor43 = null;
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.rhino.Node node45 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node44);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.rhino.Node node47 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node46);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.rhino.Node node49 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node48);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node47, node49);
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.rhino.Node node52 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node51);
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.rhino.Node node54 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node53);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node52, node54);
        boolean boolean56 = com.google.javascript.jscomp.NodeUtil.isVar(node52);
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.isLhs(node47, node52);
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.isLhs(node44, node52);
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.isThis(node52);
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node52);
        com.google.javascript.rhino.Node node62 = null;
        com.google.javascript.rhino.Node node63 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node62);
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node63);
        boolean boolean65 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node63);
        com.google.javascript.rhino.Node node66 = null;
        com.google.javascript.rhino.Node node67 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node66);
        com.google.javascript.rhino.Node node68 = null;
        com.google.javascript.rhino.Node node69 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node68);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node67, node69);
        boolean boolean71 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node63, node67);
        com.google.javascript.rhino.Node node72 = null;
        com.google.javascript.rhino.Node node73 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node72);
        com.google.javascript.rhino.Node node74 = null;
        com.google.javascript.rhino.Node node75 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node74);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node73, node75);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate77 = null;
        boolean boolean78 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node75, nodePredicate77);
        boolean boolean79 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node75);
        com.google.javascript.rhino.Node node80 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node75);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue81 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node75);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType83 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) ' ');
        boolean boolean84 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node75, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType83);
        boolean boolean85 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node63, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType83);
        int int86 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node52, 13, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType83);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.NodeUtil.visitPostOrder(node32, visitor43, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType83);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "undefined" + "'", str5, "undefined");
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "undefined" + "'", str30, "undefined");
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNull(node80);
        org.junit.Assert.assertNotNull(ternaryValue81);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node7);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node6, node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isVar(node6);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isLhs(node1, node6);
        com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(node1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: NUMBER 0.0 is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isVar(node1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isNew(node1);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node1);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node1);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.getLoopCodeBlock(node1);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node12);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node11, node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isVar(node11);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isNew(node11);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isExprCall(node11);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.containsFunction(node11);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isLhs(node1, node11);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.referencesThis(node11);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node11);
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node11);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue23 = com.google.javascript.jscomp.NodeUtil.getExpressionBooleanValue(node22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(node22);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node27);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node26, node28);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node26);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node31);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node32);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node32);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.rhino.Node node36 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node35);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.rhino.Node node38 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node37);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node36, node38);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node32, node36);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node26, node32);
        com.google.javascript.jscomp.NodeUtil.MatchNotFunction matchNotFunction43 = new com.google.javascript.jscomp.NodeUtil.MatchNotFunction();
        int int44 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node26, (int) (byte) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNotFunction43);
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.rhino.Node node46 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node45);
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.rhino.Node node48 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node47);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node46, node48);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node48);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.referencesThis(node48);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node48);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node48);
        boolean boolean54 = matchNotFunction43.apply(node48);
        com.google.javascript.rhino.Node node55 = null;
        com.google.javascript.rhino.Node node56 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node55);
        com.google.javascript.rhino.Node node57 = null;
        com.google.javascript.rhino.Node node58 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node57);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node56, node58);
        com.google.javascript.rhino.Node node60 = null;
        com.google.javascript.rhino.Node node61 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node60);
        com.google.javascript.rhino.Node node62 = null;
        com.google.javascript.rhino.Node node63 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node62);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node61, node63);
        boolean boolean65 = com.google.javascript.jscomp.NodeUtil.isVar(node61);
        boolean boolean66 = com.google.javascript.jscomp.NodeUtil.isLhs(node56, node61);
        boolean boolean67 = matchNotFunction43.apply(node61);
        boolean boolean68 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node22, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNotFunction43);
        com.google.javascript.rhino.Node node69 = null;
        com.google.javascript.rhino.Node node70 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node69);
        boolean boolean71 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node70);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler72 = null;
        boolean boolean73 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node70, abstractCompiler72);
        boolean boolean74 = com.google.javascript.jscomp.NodeUtil.isString(node70);
        boolean boolean75 = matchNotFunction43.apply(node70);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(ternaryValue23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node1);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node6);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node5, node7);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate9 = null;
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node7, nodePredicate9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node7);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node13);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = null;
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node13, abstractCompiler15);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isVar(node13);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node20);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node19, node21);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isVar(node19);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isNew(node19);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node19);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node19);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node27);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node29);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node28, node30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node32);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node34);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node33, node35);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isVar(node33);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isLhs(node28, node33);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.rhino.Node node40 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node39);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.rhino.Node node42 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node41);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node40, node42);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isVar(node40);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isNew(node40);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.rhino.Node node47 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node46);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.rhino.Node node49 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node48);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node47, node49);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate51 = null;
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node49, nodePredicate51);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node49);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node49, false);
        com.google.javascript.rhino.Node[] nodeArray56 = new com.google.javascript.rhino.Node[] { node7, node13, node19, node28, node40, node49 };
        com.google.javascript.rhino.Node node57 = com.google.javascript.jscomp.NodeUtil.newCallNode(node1, nodeArray56);
        com.google.javascript.rhino.Node node58 = null;
        com.google.javascript.rhino.Node node59 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node58);
        com.google.javascript.rhino.Node node60 = null;
        com.google.javascript.rhino.Node node61 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node60);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node59, node61);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate63 = null;
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node61, nodePredicate63);
        boolean boolean65 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node61);
        com.google.javascript.rhino.Node node66 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node61);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue67 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node61);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType69 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) ' ');
        boolean boolean70 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node61, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType69);
        boolean boolean71 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType69);
        boolean boolean72 = com.google.javascript.jscomp.NodeUtil.isStatement(node1);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler73 = null;
        boolean boolean74 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node1, abstractCompiler73);
        boolean boolean75 = com.google.javascript.jscomp.NodeUtil.isNew(node1);
        boolean boolean76 = com.google.javascript.jscomp.NodeUtil.isNew(node1);
        com.google.javascript.rhino.Node node77 = null;
        com.google.javascript.rhino.Node node78 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node77);
        com.google.javascript.rhino.Node node79 = null;
        com.google.javascript.rhino.Node node80 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node79);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node78, node80);
        boolean boolean82 = com.google.javascript.jscomp.NodeUtil.isVar(node78);
        boolean boolean83 = com.google.javascript.jscomp.NodeUtil.isNew(node78);
        boolean boolean84 = com.google.javascript.jscomp.NodeUtil.isExprCall(node78);
        boolean boolean85 = com.google.javascript.jscomp.NodeUtil.containsFunction(node78);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler86 = null;
        boolean boolean87 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node78, abstractCompiler86);
        boolean boolean88 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node78);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.NodeUtil.removeChild(node1, node78);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Invalid attempt to remove node: VOID of VOID");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(nodeArray56);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNull(node66);
        org.junit.Assert.assertNotNull(ternaryValue67);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isString(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node3);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node3);
        int int12 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node3, "JSCompiler_renameProperty");
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node3);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node3, abstractCompiler14);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node3);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.containsFunction(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node1);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.getCatchBlock(node1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isVar(node1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isNew(node1);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node1);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node1);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node1);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.getLoopCodeBlock(node1);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node6);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node6, abstractCompiler8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isVar(node6);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node6);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isLabelName(node1);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node1);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node1);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isCommutative((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isVar(node1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isNew(node1);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isExprCall(node1);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isExprCall(node1);
        com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(node1);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection10 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node1);
        int int12 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node1, "JSCompiler_renameProperty");
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeCollection10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        com.google.javascript.rhino.Node node0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = com.google.javascript.jscomp.NodeUtil.constructorCallHasSideEffects(node0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isVar(node1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isNew(node1);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node1);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node1);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection9 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node1);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node11);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node16);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node15, node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node11, node15);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node1, node11);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node11);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node11, "<=");
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeCollection9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node1);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node6);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node5, node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node1, node5);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node5);
        java.lang.String[] strArray13 = new java.lang.String[] { "undefined", "" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node5, (java.util.Set<java.lang.String>) strSet14);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node5);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node5);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node5, "typeof");
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node23);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node22, node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node24);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isString(node24);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node24);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node24);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue30 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node24);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node31);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node32);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node32);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.rhino.Node node36 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node35);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.rhino.Node node38 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node37);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node36, node38);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node32, node36);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.rhino.Node node42 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node41);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node43);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node42, node44);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate46 = null;
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node44, nodePredicate46);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node44);
        com.google.javascript.rhino.Node node49 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node44);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue50 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node44);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType52 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) ' ');
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node44, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType52);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node32, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType52);
        int int55 = matchNodeType52.type;
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.rhino.Node node57 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node56);
        com.google.javascript.rhino.Node node58 = null;
        com.google.javascript.rhino.Node node59 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node58);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node57, node59);
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.isVar(node57);
        boolean boolean62 = com.google.javascript.jscomp.NodeUtil.isNew(node57);
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.isExprCall(node57);
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.containsFunction(node57);
        boolean boolean65 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCallOrApply(node57);
        boolean boolean66 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node57);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement68 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        int int69 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node57, (int) (byte) -1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement68);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType72 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 100);
        int int73 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node57, (int) (short) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType72);
        boolean boolean74 = com.google.javascript.jscomp.NodeUtil.has(node24, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType52, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType72);
        boolean boolean75 = com.google.javascript.jscomp.NodeUtil.isLhs(node5, node24);
        boolean boolean76 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node5);
        boolean boolean77 = com.google.javascript.jscomp.NodeUtil.isExprCall(node5);
        boolean boolean78 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node5);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "undefined", "" });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(ternaryValue30);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNotNull(ternaryValue50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 32 + "'", int55 == 32);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }
}

