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
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate6 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int7 = com.google.javascript.jscomp.NodeUtil.getCount(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement5, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate6);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isLabelName(node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node10);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isUndefined(node10);
        boolean boolean14 = matchShallowStatement5.apply(node10);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isLabelName(node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node17);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isNullOrUndefined(node17);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isString(node17);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node17);
        boolean boolean23 = matchShallowStatement5.apply(node17);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node26);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isLabelName(node27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node27);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement30 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate31 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int32 = com.google.javascript.jscomp.NodeUtil.getCount(node27, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement30, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate31);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node27);
        com.google.javascript.rhino.Node node34 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node27);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate36 = new com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate();
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node34, "hi!", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate36);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node34);
        boolean boolean39 = matchShallowStatement5.apply(node34);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate40 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.rhino.Node node43 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node42);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isLabelName(node43);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node43);
        boolean boolean46 = booleanResultPredicate40.apply(node43);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.rhino.Node node49 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node48);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isLabelName(node49);
        com.google.javascript.rhino.Node node52 = null;
        com.google.javascript.rhino.Node node53 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node52);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.isLabelName(node53);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node53);
        boolean boolean56 = com.google.javascript.jscomp.NodeUtil.isLhs(node49, node53);
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node43, node49);
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.isCall(node43);
        com.google.javascript.rhino.Node node60 = null;
        com.google.javascript.rhino.Node node61 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node60);
        boolean boolean62 = com.google.javascript.jscomp.NodeUtil.isLabelName(node61);
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node61);
        java.lang.String str64 = com.google.javascript.jscomp.NodeUtil.getSourceName(node61);
        boolean boolean65 = com.google.javascript.jscomp.NodeUtil.containsCall(node61);
        boolean boolean66 = com.google.javascript.jscomp.NodeUtil.isBooleanResult(node61);
        boolean boolean67 = com.google.javascript.jscomp.NodeUtil.isNumericResultHelper(node61);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node43, node61, "");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate71 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node73 = null;
        com.google.javascript.rhino.Node node74 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node73);
        boolean boolean75 = com.google.javascript.jscomp.NodeUtil.isLabelName(node74);
        boolean boolean76 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node74);
        boolean boolean77 = booleanResultPredicate71.apply(node74);
        boolean boolean78 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node74);
        boolean boolean79 = com.google.javascript.jscomp.NodeUtil.isFunction(node74);
        java.lang.String str80 = com.google.javascript.jscomp.NodeUtil.arrayToString(node74);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler81 = null;
        boolean boolean82 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node74, abstractCompiler81);
        boolean boolean83 = com.google.javascript.jscomp.NodeUtil.isForIn(node74);
        com.google.javascript.rhino.Node node84 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node74);
        java.lang.String str85 = com.google.javascript.jscomp.NodeUtil.getSourceName(node84);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate86 = new com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate();
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType88 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (byte) 10);
        boolean boolean89 = com.google.javascript.jscomp.NodeUtil.has(node84, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate86, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType88);
        boolean boolean90 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node43, node84);
        boolean boolean91 = matchShallowStatement5.apply(node43);
        boolean boolean92 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node43);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(booleanResultPredicate40);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate71);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNull(str80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertNull(str85);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node3);
        boolean boolean6 = booleanResultPredicate0.apply(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node3);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.mayBeStringHelper(node3);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.mayBeString(node3);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isGetProp(node3);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node3);
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isCall(node2);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node2, abstractCompiler7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node2);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isLabelName(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node12);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isUndefined(node12);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isLabelName(node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node18);
        java.lang.String str21 = com.google.javascript.jscomp.NodeUtil.getSourceName(node18);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.containsCall(node18);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node12, node18);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node12);
        java.lang.String str25 = com.google.javascript.jscomp.NodeUtil.arrayToString(node12);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate28 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node30);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isLabelName(node31);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node31);
        boolean boolean34 = booleanResultPredicate28.apply(node31);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node31);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isFunction(node31);
        java.lang.String str37 = com.google.javascript.jscomp.NodeUtil.arrayToString(node31);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler38 = null;
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node31, abstractCompiler38);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isForIn(node31);
        com.google.javascript.rhino.Node node41 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node31);
        java.lang.String str42 = com.google.javascript.jscomp.NodeUtil.getSourceName(node41);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate43 = new com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate();
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType45 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (byte) 10);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.has(node41, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate43, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType45);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node12, "", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType45);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.rhino.Node node50 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node49);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isLabelName(node50);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isConstantName(node50);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate53 = new com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate();
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.valueCheck(node50, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate53);
        int int55 = com.google.javascript.jscomp.NodeUtil.getCount(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType45, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate53);
        com.google.javascript.rhino.Node node57 = null;
        com.google.javascript.rhino.Node node58 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node57);
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.isLabelName(node58);
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node58);
        java.lang.String str61 = com.google.javascript.jscomp.NodeUtil.getSourceName(node58);
        boolean boolean62 = com.google.javascript.jscomp.NodeUtil.containsCall(node58);
        java.lang.String str63 = com.google.javascript.jscomp.NodeUtil.getStringValue(node58);
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.isArrayLiteral(node58);
        boolean boolean65 = mayBeStringResultPredicate53.apply(node58);
        boolean boolean66 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node58);
        boolean boolean67 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node58);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(booleanResultPredicate28);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate1 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isLabelName(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node4);
        boolean boolean7 = booleanResultPredicate1.apply(node4);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node4);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node4);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node4);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node4);
        com.google.javascript.jscomp.NodeUtil.MatchNotFunction matchNotFunction12 = new com.google.javascript.jscomp.NodeUtil.MatchNotFunction();
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node14);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isLabelName(node15);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isLabelName(node19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node19);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isLhs(node15, node19);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.containsCall(node15);
        boolean boolean24 = matchNotFunction12.apply(node15);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node26);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isLabelName(node27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node27);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement30 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate31 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int32 = com.google.javascript.jscomp.NodeUtil.getCount(node27, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement30, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate31);
        boolean boolean33 = matchNotFunction12.apply(node27);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration34 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.rhino.Node node37 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node36);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isLabelName(node37);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node37);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node37);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isCall(node37);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate42 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.rhino.Node node45 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node44);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isLabelName(node45);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node45);
        boolean boolean48 = booleanResultPredicate42.apply(node45);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node45);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node45);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node37, node45);
        boolean boolean52 = matchDeclaration34.apply(node37);
        boolean boolean53 = matchNotFunction12.apply(node37);
        com.google.javascript.rhino.Node node55 = null;
        com.google.javascript.rhino.Node node56 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node55);
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.isLabelName(node56);
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node56);
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.isUndefined(node56);
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.isUndefined(node56);
        com.google.javascript.rhino.Node node62 = null;
        com.google.javascript.rhino.Node node63 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node62);
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.isLabelName(node63);
        boolean boolean65 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node63);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement66 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate67 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int68 = com.google.javascript.jscomp.NodeUtil.getCount(node63, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement66, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate67);
        com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate numbericResultPredicate69 = com.google.javascript.jscomp.NodeUtil.NUMBERIC_RESULT_PREDICATE;
        int int70 = com.google.javascript.jscomp.NodeUtil.getCount(node56, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate67, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) numbericResultPredicate69);
        java.lang.String str71 = com.google.javascript.jscomp.NodeUtil.arrayToString(node56);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue72 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node56);
        boolean boolean73 = matchNotFunction12.apply(node56);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean74 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node4, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNotFunction12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unexpected expression nodeVAR? parent:NAME ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanResultPredicate1);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate42);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertNotNull(numbericResultPredicate69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertNotNull(ternaryValue72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate1 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isLabelName(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node4);
        boolean boolean7 = booleanResultPredicate1.apply(node4);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node4);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunction(node4);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate10 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isLabelName(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node13);
        boolean boolean16 = booleanResultPredicate10.apply(node13);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node13);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isGet(node13);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node13);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isConstantByConvention(codingConvention0, node4, node13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: VAR is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanResultPredicate1);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isLabelName(node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node6);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isLhs(node2, node6);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.containsCall(node2);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node2);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate12 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node14);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isLabelName(node15);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node15);
        boolean boolean18 = booleanResultPredicate12.apply(node15);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node15);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node15);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate21 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node23);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isLabelName(node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node24);
        boolean boolean27 = booleanResultPredicate21.apply(node24);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isNullOrUndefined(node24);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node24, (java.util.Set<java.lang.String>) strSet32);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node15, (java.util.Set<java.lang.String>) strSet32);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node2, (java.util.Set<java.lang.String>) strSet32);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isThis(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node3);
        boolean boolean6 = booleanResultPredicate0.apply(node3);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isLabelName(node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node9);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement12 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate13 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int14 = com.google.javascript.jscomp.NodeUtil.getCount(node9, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement12, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isNumericResultHelper(node9);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node9);
        java.lang.String str17 = com.google.javascript.jscomp.NodeUtil.arrayToString(node9);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isLabelName(node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node20);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node20);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node9, node20, "");
        boolean boolean26 = booleanResultPredicate0.apply(node20);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node29);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isLabelName(node30);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node30);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isNullOrUndefined(node30);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node30, true);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate36 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.rhino.Node node39 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node38);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isLabelName(node39);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node39);
        boolean boolean42 = booleanResultPredicate36.apply(node39);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node39);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node39);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node39);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isBooleanResultHelper(node39);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node39);
        com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate numbericResultPredicate48 = com.google.javascript.jscomp.NodeUtil.NUMBERIC_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.rhino.Node node51 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node50);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isLabelName(node51);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node51);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.isNullOrUndefined(node51);
        boolean boolean55 = numbericResultPredicate48.apply(node51);
        com.google.javascript.rhino.Node node57 = null;
        com.google.javascript.rhino.Node node58 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node57);
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.isLabelName(node58);
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node58);
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.isUndefined(node58);
        boolean boolean62 = com.google.javascript.jscomp.NodeUtil.isUndefined(node58);
        com.google.javascript.rhino.Node node64 = null;
        com.google.javascript.rhino.Node node65 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node64);
        boolean boolean66 = com.google.javascript.jscomp.NodeUtil.isLabelName(node65);
        boolean boolean67 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node65);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement68 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate69 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int70 = com.google.javascript.jscomp.NodeUtil.getCount(node65, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement68, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate69);
        com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate numbericResultPredicate71 = com.google.javascript.jscomp.NodeUtil.NUMBERIC_RESULT_PREDICATE;
        int int72 = com.google.javascript.jscomp.NodeUtil.getCount(node58, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate69, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) numbericResultPredicate71);
        int int73 = com.google.javascript.jscomp.NodeUtil.getCount(node39, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) numbericResultPredicate48, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate69);
        boolean boolean74 = com.google.javascript.jscomp.NodeUtil.valueCheck(node30, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate69);
        boolean boolean75 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node20, "hi!", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate69);
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate36);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(numbericResultPredicate48);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertNotNull(numbericResultPredicate71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isNumericResult(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isString(node2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = com.google.javascript.jscomp.NodeUtil.constructorCallHasSideEffects(node2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected NEW node, got VAR");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.JSType jSType5 = com.google.javascript.jscomp.NodeUtil.getObjectLitKeyTypeFromValueType(node2, jSType4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isName(node2);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.mayBeStringHelper(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isLatin("||");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate2 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate4 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isLabelName(node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node7);
        boolean boolean10 = booleanResultPredicate4.apply(node7);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node7);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isFunction(node7);
        java.lang.String str13 = com.google.javascript.jscomp.NodeUtil.arrayToString(node7);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node7, abstractCompiler14);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isForIn(node7);
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node7);
        java.lang.String str18 = com.google.javascript.jscomp.NodeUtil.getSourceName(node17);
        boolean boolean19 = mayBeStringResultPredicate2.apply(node17);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node21);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isLabelName(node22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node22);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isUndefined(node22);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isUndefined(node22);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node28);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isLabelName(node29);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node29);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement32 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate33 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int34 = com.google.javascript.jscomp.NodeUtil.getCount(node29, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement32, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate33);
        com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate numbericResultPredicate35 = com.google.javascript.jscomp.NodeUtil.NUMBERIC_RESULT_PREDICATE;
        int int36 = com.google.javascript.jscomp.NodeUtil.getCount(node22, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate33, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) numbericResultPredicate35);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node22);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate39 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.rhino.Node node42 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node41);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isLabelName(node42);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node42);
        boolean boolean45 = booleanResultPredicate39.apply(node42);
        com.google.javascript.rhino.Node node46 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node42);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node22, node46, "");
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.rhino.Node node51 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node50);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isLabelName(node51);
        com.google.javascript.rhino.Node node54 = null;
        com.google.javascript.rhino.Node node55 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node54);
        boolean boolean56 = com.google.javascript.jscomp.NodeUtil.isLabelName(node55);
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node55);
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.isLhs(node51, node55);
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.containsCall(node51);
        com.google.javascript.rhino.Node node61 = null;
        com.google.javascript.rhino.Node node62 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node61);
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.isLabelName(node62);
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node62);
        boolean boolean65 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node62);
        boolean boolean66 = com.google.javascript.jscomp.NodeUtil.isCall(node62);
        com.google.javascript.rhino.Node node67 = com.google.javascript.jscomp.NodeUtil.newExpr(node62);
        boolean boolean68 = com.google.javascript.jscomp.NodeUtil.isAssign(node62);
        boolean boolean69 = com.google.javascript.jscomp.NodeUtil.referencesThis(node62);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node51, node62, "");
        boolean boolean72 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node51);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node22, node51, "JSCompiler_renameProperty");
        boolean boolean75 = mayBeStringResultPredicate2.apply(node51);
        com.google.javascript.rhino.Node node77 = null;
        com.google.javascript.rhino.Node node78 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node77);
        boolean boolean79 = com.google.javascript.jscomp.NodeUtil.isLabelName(node78);
        boolean boolean80 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node78);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement81 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate82 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int83 = com.google.javascript.jscomp.NodeUtil.getCount(node78, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement81, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate82);
        boolean boolean84 = com.google.javascript.jscomp.NodeUtil.isNumericResultHelper(node78);
        boolean boolean85 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node78);
        boolean boolean86 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node78);
        java.lang.String str87 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node78);
        boolean boolean88 = mayBeStringResultPredicate2.apply(node78);
        com.google.javascript.rhino.Node node90 = null;
        com.google.javascript.rhino.Node node91 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node90);
        boolean boolean92 = com.google.javascript.jscomp.NodeUtil.isLabelName(node91);
        boolean boolean93 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node91);
        boolean boolean94 = com.google.javascript.jscomp.NodeUtil.isUndefined(node91);
        boolean boolean95 = com.google.javascript.jscomp.NodeUtil.isUndefined(node91);
        boolean boolean96 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node91);
        boolean boolean97 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node78, node91);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node99 = com.google.javascript.jscomp.NodeUtil.newName(codingConvention0, "|", node78, "^");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate2);
        org.junit.Assert.assertNotNull(booleanResultPredicate4);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(numbericResultPredicate35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate39);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 1 + "'", int83 == 1);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNull(str87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(node91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(codingConvention0, "|", node2, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node3);
        boolean boolean6 = booleanResultPredicate0.apply(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isGet(node3);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate9 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isLabelName(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node12);
        boolean boolean15 = booleanResultPredicate9.apply(node12);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isNullOrUndefined(node12);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isLhs(node3, node12);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isLabelName(node12);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue19 = com.google.javascript.jscomp.NodeUtil.getExpressionBooleanValue(node12);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isLabelName(node12);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType23 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 1);
        int int24 = matchNodeType23.type;
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node26);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isLabelName(node27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node27);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node27);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isCall(node27);
        com.google.javascript.rhino.Node node32 = com.google.javascript.jscomp.NodeUtil.newExpr(node27);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isAssign(node27);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCallOrApply(node27);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node27);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node27);
        boolean boolean37 = matchNodeType23.apply(node27);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node12, "hi!", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType23);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node12);
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(ternaryValue19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        com.google.javascript.jscomp.NodeUtil.MatchNotFunction matchNotFunction0 = new com.google.javascript.jscomp.NodeUtil.MatchNotFunction();
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isLabelName(node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node7);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isLhs(node3, node7);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.containsCall(node3);
        boolean boolean12 = matchNotFunction0.apply(node3);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node14);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isLabelName(node15);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node15);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement18 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate19 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int20 = com.google.javascript.jscomp.NodeUtil.getCount(node15, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement18, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate19);
        boolean boolean21 = matchNotFunction0.apply(node15);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration22 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isLabelName(node25);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node25);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node25);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isCall(node25);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate30 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node32);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isLabelName(node33);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node33);
        boolean boolean36 = booleanResultPredicate30.apply(node33);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node33);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node33);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node25, node33);
        boolean boolean40 = matchDeclaration22.apply(node25);
        boolean boolean41 = matchNotFunction0.apply(node25);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node43);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isLabelName(node44);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node44);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node44);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isCall(node44);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler49 = null;
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node44, abstractCompiler49);
        boolean boolean51 = matchNotFunction0.apply(node44);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection52 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node44);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate30);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(nodeCollection52);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node3);
        boolean boolean6 = booleanResultPredicate0.apply(node3);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate7 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isLabelName(node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node10);
        boolean boolean13 = booleanResultPredicate7.apply(node10);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isLhs(node3, node10);
        com.google.javascript.jscomp.NodeUtil.MatchNotFunction matchNotFunction15 = new com.google.javascript.jscomp.NodeUtil.MatchNotFunction();
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isLabelName(node18);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node21);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isLabelName(node22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node22);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isLhs(node18, node22);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.containsCall(node18);
        boolean boolean27 = matchNotFunction15.apply(node18);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node29);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isLabelName(node30);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node30);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement33 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate34 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int35 = com.google.javascript.jscomp.NodeUtil.getCount(node30, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement33, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate34);
        boolean boolean36 = matchNotFunction15.apply(node30);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration37 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.rhino.Node node40 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node39);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isLabelName(node40);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node40);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node40);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isCall(node40);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate45 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.rhino.Node node48 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node47);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.isLabelName(node48);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node48);
        boolean boolean51 = booleanResultPredicate45.apply(node48);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node48);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node48);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node40, node48);
        boolean boolean55 = matchDeclaration37.apply(node40);
        boolean boolean56 = matchNotFunction15.apply(node40);
        com.google.javascript.rhino.Node node58 = null;
        com.google.javascript.rhino.Node node59 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node58);
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.isLabelName(node59);
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node59);
        boolean boolean62 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node59);
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.isCall(node59);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler64 = null;
        boolean boolean65 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node59, abstractCompiler64);
        boolean boolean66 = matchNotFunction15.apply(node59);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node10, node59);
        boolean boolean69 = com.google.javascript.jscomp.NodeUtil.containsType(node59, (int) (short) 0);
        boolean boolean70 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node59);
        boolean boolean71 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node59);
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate45);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node2, "hi!");
        com.google.javascript.rhino.JSDocInfo jSDocInfo7 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node2);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node2, "typeof");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate11 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isLabelName(node14);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node14);
        boolean boolean17 = booleanResultPredicate11.apply(node14);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType19 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType(3);
        int int20 = matchNodeType19.type;
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.has(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate11, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType19);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isNumericResult(node2);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(node2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(jSDocInfo7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node2);
        java.lang.String str5 = com.google.javascript.jscomp.NodeUtil.getSourceName(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.containsCall(node2);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getStringValue(node2);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isArrayLiteral(node2);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.mayBeString(node2, true);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.containsFunction(node2);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isName(node2);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isExprCall(node2);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node15);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isLabelName(node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node16);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isNumericResult(node16);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isString(node16);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler21 = null;
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node16, abstractCompiler21);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node2, node16);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isBooleanResultHelper(node2);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.mayBeString(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isLabelName(node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node6);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isLhs(node2, node6);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.containsCall(node2);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isLabelName(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node13);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node13);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isCall(node13);
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newExpr(node13);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isAssign(node13);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.referencesThis(node13);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node2, node13, "");
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.mayBeStringHelper(node13);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node13);
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node13);
        com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate numbericResultPredicate27 = com.google.javascript.jscomp.NodeUtil.NUMBERIC_RESULT_PREDICATE;
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate28 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node30);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isLabelName(node31);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node31);
        boolean boolean34 = booleanResultPredicate28.apply(node31);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isNullOrUndefined(node31);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.referencesThis(node31);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isCall(node31);
        boolean boolean38 = numbericResultPredicate27.apply(node31);
        int int39 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node25, (int) (short) -1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) numbericResultPredicate27);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean40 = com.google.javascript.jscomp.NodeUtil.callHasLocalResult(node25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(numbericResultPredicate27);
        org.junit.Assert.assertNotNull(booleanResultPredicate28);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isNullOrUndefined(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node2);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType9 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 1);
        int int10 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node2, (int) (byte) -1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType9);
        int int11 = matchNodeType9.type;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isLabelName(node14);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node14);
        java.lang.String str17 = com.google.javascript.jscomp.NodeUtil.getSourceName(node14);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.containsCall(node14);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isGetProp(node14);
        boolean boolean20 = matchNodeType9.apply(node14);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isConstantName(node14);
        com.google.javascript.rhino.JSDocInfo jSDocInfo22 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node14);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(jSDocInfo22);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node3);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement6 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate7 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int8 = com.google.javascript.jscomp.NodeUtil.getCount(node3, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement6, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node3);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node3);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate12 = new com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate();
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node10, "hi!", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate12);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate14 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isLabelName(node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node17);
        boolean boolean20 = booleanResultPredicate14.apply(node17);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isLabelName(node23);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node26);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isLabelName(node27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node27);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isLhs(node23, node27);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node17, node23);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node23);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node23);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isLhs(node10, node23);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node23);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(booleanResultPredicate14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node2);
        java.lang.String str5 = com.google.javascript.jscomp.NodeUtil.getSourceName(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.containsCall(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isBooleanResult(node2);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isNumericResultHelper(node2);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isNew(node2);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isLabelName(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node13);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate17 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int18 = com.google.javascript.jscomp.NodeUtil.getCount(node13, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement16, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate17);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isLabelName(node21);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node21);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isUndefined(node21);
        boolean boolean25 = matchShallowStatement16.apply(node21);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isLabelName(node28);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node28);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isNullOrUndefined(node28);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isString(node28);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node28);
        boolean boolean34 = matchShallowStatement16.apply(node28);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.containsType(node2, (int) (short) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement16);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.rhino.Node node38 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node37);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isLabelName(node38);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node38);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node38);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isCall(node38);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate43 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.rhino.Node node46 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node45);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isLabelName(node46);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node46);
        boolean boolean49 = booleanResultPredicate43.apply(node46);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node46);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node46);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node38, node46);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node46);
        java.lang.String str54 = com.google.javascript.jscomp.NodeUtil.getSourceName(node46);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.mayBeStringHelper(node46);
        boolean boolean56 = matchShallowStatement16.apply(node46);
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node46, "JSCompiler_renameProperty");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate59 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node61 = null;
        com.google.javascript.rhino.Node node62 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node61);
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.isLabelName(node62);
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node62);
        boolean boolean65 = booleanResultPredicate59.apply(node62);
        boolean boolean66 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node62);
        boolean boolean67 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node62);
        boolean boolean68 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node62);
        boolean boolean69 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node62);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType72 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 1);
        boolean boolean73 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node62, "hi!", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType72);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate74 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node76 = null;
        com.google.javascript.rhino.Node node77 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node76);
        boolean boolean78 = com.google.javascript.jscomp.NodeUtil.isLabelName(node77);
        boolean boolean79 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node77);
        boolean boolean80 = booleanResultPredicate74.apply(node77);
        boolean boolean81 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node77);
        boolean boolean82 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node77);
        boolean boolean83 = matchNodeType72.apply(node77);
        boolean boolean84 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node46, node77);
        boolean boolean86 = com.google.javascript.jscomp.NodeUtil.containsType(node77, 0);
        java.lang.Class<?> wildcardClass87 = node77.getClass();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate43);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate59);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate74);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(wildcardClass87);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node2);
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getObjectLitKeyName(node2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unexpected node type: VAR");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node3);
        boolean boolean6 = booleanResultPredicate0.apply(node3);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node3);
        java.lang.String str8 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node3);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(node3);
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate6 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int7 = com.google.javascript.jscomp.NodeUtil.getCount(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement5, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isNumericResultHelper(node2);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node2);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node2, "%=");
        java.lang.String str12 = com.google.javascript.jscomp.NodeUtil.getStringValue(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node3);
        boolean boolean6 = booleanResultPredicate0.apply(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isGet(node3);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newExpr(node3);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isNull(node3);
        int int12 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node3, "");
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate6 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int7 = com.google.javascript.jscomp.NodeUtil.getCount(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement5, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate6);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isLabelName(node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node10);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isUndefined(node10);
        boolean boolean14 = matchShallowStatement5.apply(node10);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isLabelName(node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node17);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isNullOrUndefined(node17);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isString(node17);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node17);
        boolean boolean23 = matchShallowStatement5.apply(node17);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node26);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isLabelName(node27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node27);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement30 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate31 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int32 = com.google.javascript.jscomp.NodeUtil.getCount(node27, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement30, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate31);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node27);
        com.google.javascript.rhino.Node node34 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node27);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate36 = new com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate();
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node34, "hi!", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate36);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node34);
        boolean boolean39 = matchShallowStatement5.apply(node34);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.rhino.Node node42 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node41);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isLabelName(node42);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node42);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node42);
        com.google.javascript.rhino.Node node46 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node42);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate47 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.rhino.Node node50 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node49);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isLabelName(node50);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node50);
        boolean boolean53 = booleanResultPredicate47.apply(node50);
        com.google.javascript.rhino.Node node55 = null;
        com.google.javascript.rhino.Node node56 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node55);
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.isLabelName(node56);
        com.google.javascript.rhino.Node node59 = null;
        com.google.javascript.rhino.Node node60 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node59);
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.isLabelName(node60);
        boolean boolean62 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node60);
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.isLhs(node56, node60);
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node50, node56);
        boolean boolean65 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node56);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node42, node56);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate68 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node70 = null;
        com.google.javascript.rhino.Node node71 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node70);
        boolean boolean72 = com.google.javascript.jscomp.NodeUtil.isLabelName(node71);
        boolean boolean73 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node71);
        boolean boolean74 = booleanResultPredicate68.apply(node71);
        com.google.javascript.rhino.Node node75 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node71);
        boolean boolean76 = com.google.javascript.jscomp.NodeUtil.isGet(node75);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node56, node75, "");
        com.google.javascript.rhino.Node node79 = com.google.javascript.jscomp.NodeUtil.newExpr(node56);
        boolean boolean80 = matchShallowStatement5.apply(node79);
        boolean boolean81 = com.google.javascript.jscomp.NodeUtil.isForIn(node79);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNotNull(booleanResultPredicate47);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate68);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isUndefined(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isUndefined(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isGet(node2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = com.google.javascript.jscomp.NodeUtil.getFunctionName(node2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node3);
        boolean boolean6 = booleanResultPredicate0.apply(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node3);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isLabelName(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node12);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node12);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isCall(node12);
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newExpr(node12);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isAssign(node12);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCallOrApply(node12);
        com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate numbericResultPredicate21 = com.google.javascript.jscomp.NodeUtil.NUMBERIC_RESULT_PREDICATE;
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.containsType(node12, (int) (byte) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) numbericResultPredicate21);
        int int23 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node3, (int) ' ', (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) numbericResultPredicate21);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.mayBeString(node3, true);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.containsType(node3, 0);
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(numbericResultPredicate21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node3);
        boolean boolean6 = booleanResultPredicate0.apply(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node3);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node3);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate12 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node14);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isLabelName(node15);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node15);
        boolean boolean18 = booleanResultPredicate12.apply(node15);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node3, "", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate12);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isVar(node3);
        int int22 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node3, "");
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node3);
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node2);
        java.lang.String str5 = com.google.javascript.jscomp.NodeUtil.getSourceName(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.containsCall(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.containsFunction(node2);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isNumericResult(node2);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate9 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isLabelName(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node12);
        boolean boolean15 = booleanResultPredicate9.apply(node12);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isLabelName(node18);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node21);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isLabelName(node22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node22);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isLhs(node18, node22);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node12, node18);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isCall(node12);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.containsFunction(node12);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isAssign(node12);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node12);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node2, node12, "|");
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node3);
        boolean boolean6 = booleanResultPredicate0.apply(node3);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isLabelName(node9);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isLabelName(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node13);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isLhs(node9, node13);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node3, node9);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isCall(node3);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isLabelName(node21);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node21);
        java.lang.String str24 = com.google.javascript.jscomp.NodeUtil.getSourceName(node21);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.containsCall(node21);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isBooleanResult(node21);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isNumericResultHelper(node21);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node3, node21, "");
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node21);
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node3);
        boolean boolean6 = booleanResultPredicate0.apply(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isGet(node3);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newExpr(node3);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isGet(node9);
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node3);
        boolean boolean6 = booleanResultPredicate0.apply(node3);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isLabelName(node9);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isLabelName(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node13);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isLhs(node9, node13);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node3, node9);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isCall(node3);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.containsFunction(node3);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node3);
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newExpr(node3);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate22 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isLabelName(node25);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node25);
        boolean boolean28 = booleanResultPredicate22.apply(node25);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isNullOrUndefined(node25);
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!", "" };
        java.util.LinkedHashSet<java.lang.String> strSet33 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet33, strArray32);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node25, (java.util.Set<java.lang.String>) strSet33);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node21, (java.util.Set<java.lang.String>) strSet33);
        java.lang.String str37 = com.google.javascript.jscomp.NodeUtil.arrayToString(node21);
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(booleanResultPredicate22);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(str37);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate6 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int7 = com.google.javascript.jscomp.NodeUtil.getCount(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement5, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate6);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate9 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isLabelName(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node12);
        boolean boolean15 = booleanResultPredicate9.apply(node12);
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node12);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isGet(node16);
        boolean boolean18 = matchShallowStatement5.apply(node16);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isLabelName(node21);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node21);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isUndefined(node21);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isUndefined(node21);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isGet(node21);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate27 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node29);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isLabelName(node30);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node30);
        boolean boolean33 = booleanResultPredicate27.apply(node30);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node30);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isFunction(node30);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler36 = null;
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node30, abstractCompiler36);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node21, node30, "hi!");
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node21, "^");
        boolean boolean42 = matchShallowStatement5.apply(node21);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(booleanResultPredicate9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate27);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate1 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isLabelName(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node4);
        boolean boolean7 = booleanResultPredicate1.apply(node4);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node4);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunction(node4);
        java.lang.String str10 = com.google.javascript.jscomp.NodeUtil.arrayToString(node4);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node4, abstractCompiler11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isForIn(node4);
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node4);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate15 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isLabelName(node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node18);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node18, "hi!");
        com.google.javascript.rhino.JSDocInfo jSDocInfo23 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node18);
        boolean boolean24 = booleanResultPredicate15.apply(node18);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.valueCheck(node4, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate15);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isLabelName(node28);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node28);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isUndefined(node28);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.rhino.Node node34 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node33);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isLabelName(node34);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node34);
        java.lang.String str37 = com.google.javascript.jscomp.NodeUtil.getSourceName(node34);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.containsCall(node34);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node28, node34);
        boolean boolean40 = booleanResultPredicate15.apply(node28);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isArrayLiteral(node28);
        org.junit.Assert.assertNotNull(booleanResultPredicate1);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(booleanResultPredicate15);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(jSDocInfo23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node3);
        boolean boolean6 = booleanResultPredicate0.apply(node3);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isLabelName(node9);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isLabelName(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node13);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isLhs(node9, node13);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node3, node9);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isUndefined(node3);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isThis(node3);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node3);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node3);
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node2);
        java.lang.String str5 = com.google.javascript.jscomp.NodeUtil.getSourceName(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.containsCall(node2);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getStringValue(node2);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isGetProp(node2);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node2, false);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node3);
        boolean boolean6 = booleanResultPredicate0.apply(node3);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isLabelName(node9);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isLabelName(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node13);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isLhs(node9, node13);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node3, node9);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isUndefined(node3);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isThis(node3);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node3);
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node3);
        boolean boolean6 = booleanResultPredicate0.apply(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isNullOrUndefined(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.referencesThis(node3);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate10 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isLabelName(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node13);
        boolean boolean16 = booleanResultPredicate10.apply(node13);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node13);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isFunction(node13);
        java.lang.String str19 = com.google.javascript.jscomp.NodeUtil.arrayToString(node13);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler20 = null;
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node13, abstractCompiler20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isForIn(node13);
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node13);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node13, "^");
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isLhs(node3, node13);
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isCall(node2);
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newExpr(node2);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isAssign(node2);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCallOrApply(node2);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node2);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate12 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node14);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isLabelName(node15);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node15);
        boolean boolean18 = booleanResultPredicate12.apply(node15);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isLabelName(node21);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node21);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement24 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate25 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int26 = com.google.javascript.jscomp.NodeUtil.getCount(node21, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement24, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate25);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isNumericResultHelper(node21);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node21);
        java.lang.String str29 = com.google.javascript.jscomp.NodeUtil.arrayToString(node21);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node31);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isLabelName(node32);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node32);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node32);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node21, node32, "");
        boolean boolean38 = booleanResultPredicate12.apply(node32);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node2, "", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate12);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isLabelName(node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node6);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isLhs(node2, node6);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.containsCall(node2);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isLabelName(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node13);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node13);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isCall(node13);
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newExpr(node13);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isAssign(node13);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.referencesThis(node13);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node2, node13, "");
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.mayBeStringHelper(node13);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node13);
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node13);
        com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate numbericResultPredicate27 = com.google.javascript.jscomp.NodeUtil.NUMBERIC_RESULT_PREDICATE;
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate28 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node30);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isLabelName(node31);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node31);
        boolean boolean34 = booleanResultPredicate28.apply(node31);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isNullOrUndefined(node31);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.referencesThis(node31);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isCall(node31);
        boolean boolean38 = numbericResultPredicate27.apply(node31);
        int int39 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node25, (int) (short) -1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) numbericResultPredicate27);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.mayBeString(node25);
        com.google.javascript.rhino.jstype.JSType jSType41 = null;
        com.google.javascript.rhino.jstype.JSType jSType42 = com.google.javascript.jscomp.NodeUtil.getObjectLitKeyTypeFromValueType(node25, jSType41);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler43 = null;
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node25, abstractCompiler43);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(numbericResultPredicate27);
        org.junit.Assert.assertNotNull(booleanResultPredicate28);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(jSType42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node2);
        java.lang.String str5 = com.google.javascript.jscomp.NodeUtil.getSourceName(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isGetProp(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node2);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.mayBeString(node2);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate1 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isLabelName(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node4);
        boolean boolean7 = booleanResultPredicate1.apply(node4);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node4);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isGet(node8);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node8, abstractCompiler10);
        org.junit.Assert.assertNotNull(booleanResultPredicate1);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate6 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int7 = com.google.javascript.jscomp.NodeUtil.getCount(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement5, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isNumericResultHelper(node2);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node2);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate10 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isLabelName(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node13);
        boolean boolean16 = booleanResultPredicate10.apply(node13);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node13);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node13);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isLhs(node2, node13);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType21 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 1);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node23);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isLabelName(node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node24);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement27 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate28 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int29 = com.google.javascript.jscomp.NodeUtil.getCount(node24, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement27, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate28);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.has(node13, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType21, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate28);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection31 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node13);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(nodeCollection31);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node3);
        boolean boolean6 = booleanResultPredicate0.apply(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunction(node3);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node3);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isLabelName(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node13);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node13, "hi!");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler18 = null;
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node13, abstractCompiler18);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node3, node13, "instanceof");
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node3);
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isUndefined(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isUndefined(node2);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isLabelName(node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node9);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement12 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate13 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int14 = com.google.javascript.jscomp.NodeUtil.getCount(node9, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement12, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate13);
        com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate numbericResultPredicate15 = com.google.javascript.jscomp.NodeUtil.NUMBERIC_RESULT_PREDICATE;
        int int16 = com.google.javascript.jscomp.NodeUtil.getCount(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate13, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) numbericResultPredicate15);
        java.lang.String str17 = com.google.javascript.jscomp.NodeUtil.arrayToString(node2);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue18 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node2);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler19 = null;
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node2, abstractCompiler19);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler21 = null;
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node2, abstractCompiler21);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(numbericResultPredicate15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(ternaryValue18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node3);
        boolean boolean6 = booleanResultPredicate0.apply(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isGet(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node3);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node3);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isExprCall(node3);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isConstantName(node3);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node3);
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate0 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate2 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isLabelName(node5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node5);
        boolean boolean8 = booleanResultPredicate2.apply(node5);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node5);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isFunction(node5);
        java.lang.String str11 = com.google.javascript.jscomp.NodeUtil.arrayToString(node5);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node5, abstractCompiler12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isForIn(node5);
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node5);
        java.lang.String str16 = com.google.javascript.jscomp.NodeUtil.getSourceName(node15);
        boolean boolean17 = mayBeStringResultPredicate0.apply(node15);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isLabelName(node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node20);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isUndefined(node20);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isUndefined(node20);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node26);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isLabelName(node27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node27);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement30 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate31 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int32 = com.google.javascript.jscomp.NodeUtil.getCount(node27, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement30, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate31);
        com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate numbericResultPredicate33 = com.google.javascript.jscomp.NodeUtil.NUMBERIC_RESULT_PREDICATE;
        int int34 = com.google.javascript.jscomp.NodeUtil.getCount(node20, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate31, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) numbericResultPredicate33);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node20);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate37 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.rhino.Node node40 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node39);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isLabelName(node40);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node40);
        boolean boolean43 = booleanResultPredicate37.apply(node40);
        com.google.javascript.rhino.Node node44 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node40);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node20, node44, "");
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.rhino.Node node49 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node48);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isLabelName(node49);
        com.google.javascript.rhino.Node node52 = null;
        com.google.javascript.rhino.Node node53 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node52);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.isLabelName(node53);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node53);
        boolean boolean56 = com.google.javascript.jscomp.NodeUtil.isLhs(node49, node53);
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.containsCall(node49);
        com.google.javascript.rhino.Node node59 = null;
        com.google.javascript.rhino.Node node60 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node59);
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.isLabelName(node60);
        boolean boolean62 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node60);
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node60);
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.isCall(node60);
        com.google.javascript.rhino.Node node65 = com.google.javascript.jscomp.NodeUtil.newExpr(node60);
        boolean boolean66 = com.google.javascript.jscomp.NodeUtil.isAssign(node60);
        boolean boolean67 = com.google.javascript.jscomp.NodeUtil.referencesThis(node60);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node49, node60, "");
        boolean boolean70 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node49);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node20, node49, "JSCompiler_renameProperty");
        boolean boolean73 = mayBeStringResultPredicate0.apply(node49);
        com.google.javascript.rhino.Node node75 = null;
        com.google.javascript.rhino.Node node76 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node75);
        boolean boolean77 = com.google.javascript.jscomp.NodeUtil.isLabelName(node76);
        boolean boolean78 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node76);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement79 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate80 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int81 = com.google.javascript.jscomp.NodeUtil.getCount(node76, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement79, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate80);
        boolean boolean82 = com.google.javascript.jscomp.NodeUtil.isNumericResultHelper(node76);
        boolean boolean83 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node76);
        boolean boolean84 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node76);
        java.lang.String str85 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node76);
        boolean boolean86 = mayBeStringResultPredicate0.apply(node76);
        java.lang.String str87 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node76);
        boolean boolean88 = com.google.javascript.jscomp.NodeUtil.isString(node76);
        boolean boolean89 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node76);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate0);
        org.junit.Assert.assertNotNull(booleanResultPredicate2);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(numbericResultPredicate33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate37);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 1 + "'", int81 == 1);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNull(str85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNull(str87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node3);
        boolean boolean6 = booleanResultPredicate0.apply(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isNullOrUndefined(node3);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isLabelName(node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node10);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node10);
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node10);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate15 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isLabelName(node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node18);
        boolean boolean21 = booleanResultPredicate15.apply(node18);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node23);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isLabelName(node24);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isLabelName(node28);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node28);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isLhs(node24, node28);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node18, node24);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node24);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node10, node24);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node3, node24);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isGetProp(node3);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isBooleanResultHelper(node3);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node3);
        com.google.javascript.rhino.jstype.JSType jSType39 = null;
        com.google.javascript.rhino.jstype.JSType jSType40 = com.google.javascript.jscomp.NodeUtil.getObjectLitKeyTypeFromValueType(node3, jSType39);
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(booleanResultPredicate15);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNull(jSType40);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node2);
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node2);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate7 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isLabelName(node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node10);
        boolean boolean13 = booleanResultPredicate7.apply(node10);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node15);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isLabelName(node16);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isLabelName(node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node20);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isLhs(node16, node20);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node10, node16);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node16);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node2, node16);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate28 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node30);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isLabelName(node31);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node31);
        boolean boolean34 = booleanResultPredicate28.apply(node31);
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node31);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isGet(node35);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node16, node35, "");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate39 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.rhino.Node node42 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node41);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isLabelName(node42);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node42);
        boolean boolean45 = booleanResultPredicate39.apply(node42);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isNullOrUndefined(node42);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.rhino.Node node49 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node48);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isLabelName(node49);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node49);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node49);
        com.google.javascript.rhino.Node node53 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node49);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate54 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.rhino.Node node57 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node56);
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.isLabelName(node57);
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node57);
        boolean boolean60 = booleanResultPredicate54.apply(node57);
        com.google.javascript.rhino.Node node62 = null;
        com.google.javascript.rhino.Node node63 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node62);
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.isLabelName(node63);
        com.google.javascript.rhino.Node node66 = null;
        com.google.javascript.rhino.Node node67 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node66);
        boolean boolean68 = com.google.javascript.jscomp.NodeUtil.isLabelName(node67);
        boolean boolean69 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node67);
        boolean boolean70 = com.google.javascript.jscomp.NodeUtil.isLhs(node63, node67);
        boolean boolean71 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node57, node63);
        boolean boolean72 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node63);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node49, node63);
        boolean boolean74 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node42, node63);
        boolean boolean75 = com.google.javascript.jscomp.NodeUtil.isGetProp(node42);
        boolean boolean76 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node42);
        java.lang.String str77 = com.google.javascript.jscomp.NodeUtil.getSourceName(node42);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.NodeUtil.removeChild(node35, node42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(booleanResultPredicate7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate28);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate39);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertNotNull(booleanResultPredicate54);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNull(str77);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node3);
        boolean boolean6 = booleanResultPredicate0.apply(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunction(node3);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isForIn(node3);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isLabelName(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node13);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate17 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int18 = com.google.javascript.jscomp.NodeUtil.getCount(node13, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement16, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isNumericResultHelper(node13);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node13);
        java.lang.String str21 = com.google.javascript.jscomp.NodeUtil.arrayToString(node13);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node23);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isLabelName(node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node24);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node24);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node13, node24, "");
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node24);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isLhs(node3, node24);
        com.google.javascript.rhino.jstype.JSType jSType32 = null;
        com.google.javascript.rhino.jstype.JSType jSType33 = com.google.javascript.jscomp.NodeUtil.getObjectLitKeyTypeFromValueType(node24, jSType32);
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(jSType33);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node2);
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node2);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate7 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isLabelName(node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node10);
        boolean boolean13 = booleanResultPredicate7.apply(node10);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node15);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isLabelName(node16);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isLabelName(node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node20);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isLhs(node16, node20);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node10, node16);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node16);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node2, node16);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.containsCall(node2);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.referencesThis(node2);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = com.google.javascript.jscomp.NodeUtil.newHasLocalResult(node2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(booleanResultPredicate7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isUndefined(node2);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isLabelName(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node8);
        java.lang.String str11 = com.google.javascript.jscomp.NodeUtil.getSourceName(node8);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.containsCall(node8);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node2, node8);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration15 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate16 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isLabelName(node19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node19);
        boolean boolean22 = booleanResultPredicate16.apply(node19);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isLabelName(node25);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node28);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isLabelName(node29);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node29);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isLhs(node25, node29);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node19, node25);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isBooleanResultHelper(node25);
        boolean boolean35 = matchDeclaration15.apply(node25);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.containsType(node8, (int) '4', (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration15);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.rhino.Node node39 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node38);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isLabelName(node39);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node39);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node39);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isCall(node39);
        com.google.javascript.rhino.Node node44 = com.google.javascript.jscomp.NodeUtil.newExpr(node39);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isAssign(node39);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCallOrApply(node39);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isFunction(node39);
        boolean boolean48 = matchDeclaration15.apply(node39);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate16);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isConstantName(node2);
        com.google.javascript.jscomp.NodeUtil.MatchNotFunction matchNotFunction6 = new com.google.javascript.jscomp.NodeUtil.MatchNotFunction();
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isLabelName(node9);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isLabelName(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node13);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isLhs(node9, node13);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.containsCall(node9);
        boolean boolean18 = matchNotFunction6.apply(node9);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isLabelName(node21);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node21);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement24 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate25 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int26 = com.google.javascript.jscomp.NodeUtil.getCount(node21, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement24, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate25);
        boolean boolean27 = matchNotFunction6.apply(node21);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType29 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 1);
        com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate numbericResultPredicate30 = com.google.javascript.jscomp.NodeUtil.NUMBERIC_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node32);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isLabelName(node33);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node33);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isNullOrUndefined(node33);
        boolean boolean37 = numbericResultPredicate30.apply(node33);
        boolean boolean38 = matchNodeType29.apply(node33);
        com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate numbericResultPredicate39 = new com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate();
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.has(node21, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType29, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) numbericResultPredicate39);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node2, "", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType29);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node2);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node2);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node2);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.mayBeStringHelper(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(numbericResultPredicate30);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate2 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isLabelName(node5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node5);
        boolean boolean8 = booleanResultPredicate2.apply(node5);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node5);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isFunction(node5);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node5, abstractCompiler11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node5);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node5);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(codingConvention0, "^", node5, "||");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanResultPredicate2);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node3);
        boolean boolean6 = booleanResultPredicate0.apply(node3);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isLabelName(node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node9);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement12 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate13 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int14 = com.google.javascript.jscomp.NodeUtil.getCount(node9, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement12, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isNumericResultHelper(node9);
        boolean boolean16 = booleanResultPredicate0.apply(node9);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isNumericResult(node9);
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        com.google.javascript.jscomp.NodeUtil.MatchNotFunction matchNotFunction0 = new com.google.javascript.jscomp.NodeUtil.MatchNotFunction();
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isLabelName(node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node7);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isLhs(node3, node7);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.containsCall(node3);
        boolean boolean12 = matchNotFunction0.apply(node3);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node14);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isLabelName(node15);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node15);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement18 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate19 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int20 = com.google.javascript.jscomp.NodeUtil.getCount(node15, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement18, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate19);
        boolean boolean21 = matchNotFunction0.apply(node15);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration22 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isLabelName(node25);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node25);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node25);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isCall(node25);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate30 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node32);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isLabelName(node33);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node33);
        boolean boolean36 = booleanResultPredicate30.apply(node33);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node33);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node33);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node25, node33);
        boolean boolean40 = matchDeclaration22.apply(node25);
        boolean boolean41 = matchNotFunction0.apply(node25);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate42 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.rhino.Node node45 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node44);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isLabelName(node45);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node45);
        boolean boolean48 = booleanResultPredicate42.apply(node45);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node45);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isExprCall(node45);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler51 = null;
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node45, abstractCompiler51);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate55 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node57 = null;
        com.google.javascript.rhino.Node node58 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node57);
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.isLabelName(node58);
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node58);
        boolean boolean61 = booleanResultPredicate55.apply(node58);
        boolean boolean62 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node58);
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.isFunction(node58);
        java.lang.String str64 = com.google.javascript.jscomp.NodeUtil.arrayToString(node58);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler65 = null;
        boolean boolean66 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node58, abstractCompiler65);
        boolean boolean67 = com.google.javascript.jscomp.NodeUtil.isForIn(node58);
        com.google.javascript.rhino.Node node68 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node58);
        java.lang.String str69 = com.google.javascript.jscomp.NodeUtil.getSourceName(node68);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate70 = new com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate();
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType72 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (byte) 10);
        boolean boolean73 = com.google.javascript.jscomp.NodeUtil.has(node68, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate70, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType72);
        boolean boolean74 = com.google.javascript.jscomp.NodeUtil.containsType(node45, 3, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate70);
        boolean boolean75 = matchNotFunction0.apply(node45);
        com.google.javascript.rhino.Node node77 = null;
        com.google.javascript.rhino.Node node78 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node77);
        boolean boolean79 = com.google.javascript.jscomp.NodeUtil.isLabelName(node78);
        boolean boolean80 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node78);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement81 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate82 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int83 = com.google.javascript.jscomp.NodeUtil.getCount(node78, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement81, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate82);
        boolean boolean84 = com.google.javascript.jscomp.NodeUtil.isNumericResultHelper(node78);
        boolean boolean85 = matchNotFunction0.apply(node78);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate30);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(booleanResultPredicate42);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(booleanResultPredicate55);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 1 + "'", int83 == 1);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.referencesThis(node2);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node2, abstractCompiler7);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.getFnParameters(node9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType1 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType(6);
        int int2 = matchNodeType1.type;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        com.google.javascript.jscomp.NodeUtil.MatchNotFunction matchNotFunction0 = new com.google.javascript.jscomp.NodeUtil.MatchNotFunction();
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isLabelName(node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node7);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isLhs(node3, node7);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.containsCall(node3);
        boolean boolean12 = matchNotFunction0.apply(node3);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node14);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isLabelName(node15);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node15);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement18 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate19 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int20 = com.google.javascript.jscomp.NodeUtil.getCount(node15, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement18, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate19);
        boolean boolean21 = matchNotFunction0.apply(node15);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration22 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isLabelName(node25);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node25);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node25);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isCall(node25);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate30 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node32);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isLabelName(node33);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node33);
        boolean boolean36 = booleanResultPredicate30.apply(node33);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node33);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node33);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node25, node33);
        boolean boolean40 = matchDeclaration22.apply(node25);
        boolean boolean41 = matchNotFunction0.apply(node25);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node25);
        com.google.javascript.rhino.Node node43 = com.google.javascript.jscomp.NodeUtil.newExpr(node25);
        java.lang.String str44 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node43);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isGet(node43);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate30);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node3);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement6 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate7 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int8 = com.google.javascript.jscomp.NodeUtil.getCount(node3, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement6, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isNumericResultHelper(node3);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node3);
        java.lang.String str11 = com.google.javascript.jscomp.NodeUtil.arrayToString(node3);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isLabelName(node14);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node14);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node14);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node3, node14, "");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler20 = null;
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node14, abstractCompiler20);
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newVarNode("^", node14);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node22, "");
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.mayBeStringHelper(node22);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node2);
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isBooleanResultHelper(node2);
        java.lang.String str8 = com.google.javascript.jscomp.NodeUtil.getSourceName(node2);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isNull(node2);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isUndefined(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isUndefined(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isUndefined(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isGet(node2);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node2);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node2, abstractCompiler9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node3);
        boolean boolean6 = booleanResultPredicate0.apply(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isNullOrUndefined(node3);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isLabelName(node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node10);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node10);
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node10);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate15 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isLabelName(node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node18);
        boolean boolean21 = booleanResultPredicate15.apply(node18);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node23);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isLabelName(node24);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isLabelName(node28);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node28);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isLhs(node24, node28);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node18, node24);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node24);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node10, node24);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node3, node24);
        java.lang.Double double36 = com.google.javascript.jscomp.NodeUtil.getNumberValue(node3);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node3);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.referencesThis(node3);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.mayBeStringHelper(node3);
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(booleanResultPredicate15);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(double36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node3);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement6 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate7 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int8 = com.google.javascript.jscomp.NodeUtil.getCount(node3, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement6, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node3);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node3);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate12 = new com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate();
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node10, "hi!", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node10);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isNumericResultHelper(node10);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isCall(node2);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate7 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isLabelName(node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node10);
        boolean boolean13 = booleanResultPredicate7.apply(node10);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node10);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node10);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node2, node10);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node10);
        java.lang.String str18 = com.google.javascript.jscomp.NodeUtil.getSourceName(node10);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.mayBeStringHelper(node10);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.referencesThis(node10);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node2);
        java.lang.String str5 = com.google.javascript.jscomp.NodeUtil.getSourceName(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.containsCall(node2);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getStringValue(node2);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node2);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node2);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.containsType(node2, (int) '4');
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate6 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int7 = com.google.javascript.jscomp.NodeUtil.getCount(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement5, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isNumericResultHelper(node2);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node2);
        java.lang.String str10 = com.google.javascript.jscomp.NodeUtil.arrayToString(node2);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isLabelName(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node13);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node13);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node2, node13, "");
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node13);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isNullOrUndefined(node13);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isBooleanResultHelper(node13);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node3);
        boolean boolean6 = booleanResultPredicate0.apply(node3);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isLabelName(node9);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isLabelName(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node13);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isLhs(node9, node13);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node3, node9);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node9);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isConstantName(node9);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate20 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isLabelName(node23);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node23);
        boolean boolean26 = booleanResultPredicate20.apply(node23);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue27 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node23);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isControlStructureCodeBlock(node9, node23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(ternaryValue27);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate1 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isLabelName(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node4);
        boolean boolean7 = booleanResultPredicate1.apply(node4);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node4);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunction(node4);
        java.lang.String str10 = com.google.javascript.jscomp.NodeUtil.arrayToString(node4);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node4, abstractCompiler11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isForIn(node4);
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node4);
        java.lang.String str15 = com.google.javascript.jscomp.NodeUtil.getSourceName(node14);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate16 = new com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate();
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType18 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (byte) 10);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.has(node14, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate16, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType18);
        java.lang.String str20 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node14);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node14);
        org.junit.Assert.assertNotNull(booleanResultPredicate1);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate6 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int7 = com.google.javascript.jscomp.NodeUtil.getCount(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement5, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isNumericResultHelper(node2);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node2);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node2);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate11 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isLabelName(node14);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.jstype.JSType jSType17 = com.google.javascript.jscomp.NodeUtil.getObjectLitKeyTypeFromValueType(node14, jSType16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isBooleanResult(node14);
        boolean boolean19 = booleanResultPredicate11.apply(node14);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node14);
        java.lang.Double double21 = com.google.javascript.jscomp.NodeUtil.getNumberValue(node14);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isGet(node14);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue23 = com.google.javascript.jscomp.NodeUtil.getExpressionBooleanValue(node14);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isUndefined(node14);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node2, node14, "%=");
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(double21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(ternaryValue23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate6 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int7 = com.google.javascript.jscomp.NodeUtil.getCount(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement5, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isNumericResultHelper(node2);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node2);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isUndefined(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isUndefined(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isArrayLiteral(node2);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node2, "hi!");
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newExpr(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node3);
        boolean boolean6 = booleanResultPredicate0.apply(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isNullOrUndefined(node3);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isLabelName(node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node10);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node10);
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node10);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate15 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isLabelName(node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node18);
        boolean boolean21 = booleanResultPredicate15.apply(node18);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node23);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isLabelName(node24);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isLabelName(node28);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node28);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isLhs(node24, node28);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node18, node24);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node24);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node10, node24);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node3, node24);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isGetProp(node3);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node3);
        java.lang.String str38 = com.google.javascript.jscomp.NodeUtil.getSourceName(node3);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node3);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.JSDocInfo jSDocInfo40 = com.google.javascript.jscomp.NodeUtil.getFunctionInfo(node3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(booleanResultPredicate15);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        com.google.javascript.jscomp.NodeUtil.MatchNotFunction matchNotFunction0 = new com.google.javascript.jscomp.NodeUtil.MatchNotFunction();
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isLabelName(node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node7);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isLhs(node3, node7);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.containsCall(node3);
        boolean boolean12 = matchNotFunction0.apply(node3);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node14);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isLabelName(node15);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node15);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement18 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate19 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int20 = com.google.javascript.jscomp.NodeUtil.getCount(node15, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement18, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate19);
        boolean boolean21 = matchNotFunction0.apply(node15);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration22 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isLabelName(node25);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node25);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node25);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isCall(node25);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate30 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node32);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isLabelName(node33);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node33);
        boolean boolean36 = booleanResultPredicate30.apply(node33);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node33);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node33);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node25, node33);
        boolean boolean40 = matchDeclaration22.apply(node25);
        boolean boolean41 = matchNotFunction0.apply(node25);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate42 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.rhino.Node node45 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node44);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isLabelName(node45);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node45);
        boolean boolean48 = booleanResultPredicate42.apply(node45);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.isNullOrUndefined(node45);
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.rhino.Node node52 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node51);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.isLabelName(node52);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node52);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node52);
        com.google.javascript.rhino.Node node56 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node52);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate57 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node59 = null;
        com.google.javascript.rhino.Node node60 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node59);
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.isLabelName(node60);
        boolean boolean62 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node60);
        boolean boolean63 = booleanResultPredicate57.apply(node60);
        com.google.javascript.rhino.Node node65 = null;
        com.google.javascript.rhino.Node node66 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node65);
        boolean boolean67 = com.google.javascript.jscomp.NodeUtil.isLabelName(node66);
        com.google.javascript.rhino.Node node69 = null;
        com.google.javascript.rhino.Node node70 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node69);
        boolean boolean71 = com.google.javascript.jscomp.NodeUtil.isLabelName(node70);
        boolean boolean72 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node70);
        boolean boolean73 = com.google.javascript.jscomp.NodeUtil.isLhs(node66, node70);
        boolean boolean74 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node60, node66);
        boolean boolean75 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node66);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node52, node66);
        boolean boolean77 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node45, node66);
        boolean boolean78 = matchNotFunction0.apply(node45);
        com.google.javascript.rhino.Node node79 = com.google.javascript.jscomp.NodeUtil.newExpr(node45);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean80 = com.google.javascript.jscomp.NodeUtil.tryMergeBlock(node79);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate30);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(booleanResultPredicate42);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertNotNull(booleanResultPredicate57);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(node79);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node3);
        boolean boolean6 = booleanResultPredicate0.apply(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isFunction(node3);
        java.lang.String str9 = com.google.javascript.jscomp.NodeUtil.arrayToString(node3);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node3, abstractCompiler10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isForIn(node3);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isString(node3);
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node3);
        boolean boolean6 = booleanResultPredicate0.apply(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isNullOrUndefined(node3);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isLabelName(node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node10);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node10);
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node10);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate15 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isLabelName(node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node18);
        boolean boolean21 = booleanResultPredicate15.apply(node18);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node23);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isLabelName(node24);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isLabelName(node28);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node28);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isLhs(node24, node28);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node18, node24);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node24);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node10, node24);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node3, node24);
        java.lang.Double double36 = com.google.javascript.jscomp.NodeUtil.getNumberValue(node3);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler37 = null;
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node3, abstractCompiler37);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCallOrApply(node3);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node3);
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(booleanResultPredicate15);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(double36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isLabelName(node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node6);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isLhs(node2, node6);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.containsCall(node2);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isLabelName(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node13);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node13);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isCall(node13);
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newExpr(node13);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isAssign(node13);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.referencesThis(node13);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node2, node13, "");
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.mayBeStringHelper(node13);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node13);
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node13);
        com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate numbericResultPredicate27 = com.google.javascript.jscomp.NodeUtil.NUMBERIC_RESULT_PREDICATE;
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate28 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node30);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isLabelName(node31);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node31);
        boolean boolean34 = booleanResultPredicate28.apply(node31);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isNullOrUndefined(node31);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.referencesThis(node31);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isCall(node31);
        boolean boolean38 = numbericResultPredicate27.apply(node31);
        int int39 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node25, (int) (short) -1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) numbericResultPredicate27);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.mayBeString(node25);
        com.google.javascript.rhino.jstype.JSType jSType41 = null;
        com.google.javascript.rhino.jstype.JSType jSType42 = com.google.javascript.jscomp.NodeUtil.getObjectLitKeyTypeFromValueType(node25, jSType41);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node25, false);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node25);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(numbericResultPredicate27);
        org.junit.Assert.assertNotNull(booleanResultPredicate28);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(jSType42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node2);
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node2);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate7 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isLabelName(node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node10);
        boolean boolean13 = booleanResultPredicate7.apply(node10);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node15);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isLabelName(node16);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isLabelName(node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node20);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isLhs(node16, node20);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node10, node16);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node16);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node2, node16);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate28 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node30);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isLabelName(node31);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node31);
        boolean boolean34 = booleanResultPredicate28.apply(node31);
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node31);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isGet(node35);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node16, node35, "");
        com.google.javascript.rhino.Node node39 = com.google.javascript.jscomp.NodeUtil.newExpr(node16);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isAssign(node39);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.rhino.Node node43 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node42);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isLabelName(node43);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node43);
        java.lang.String str46 = com.google.javascript.jscomp.NodeUtil.getSourceName(node43);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node43);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node43);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.isNull(node43);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate50 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node52 = null;
        com.google.javascript.rhino.Node node53 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node52);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.isLabelName(node53);
        com.google.javascript.rhino.jstype.JSType jSType55 = null;
        com.google.javascript.rhino.jstype.JSType jSType56 = com.google.javascript.jscomp.NodeUtil.getObjectLitKeyTypeFromValueType(node53, jSType55);
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.isBooleanResult(node53);
        boolean boolean58 = booleanResultPredicate50.apply(node53);
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node53);
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.isThis(node53);
        java.lang.String str61 = com.google.javascript.jscomp.NodeUtil.getSourceName(node53);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType64 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 100);
        int int65 = matchNodeType64.type;
        boolean boolean66 = com.google.javascript.jscomp.NodeUtil.containsType(node53, (int) (byte) 1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType64);
        com.google.javascript.rhino.Node[] nodeArray67 = new com.google.javascript.rhino.Node[] { node43, node53 };
        com.google.javascript.rhino.Node node68 = com.google.javascript.jscomp.NodeUtil.newCallNode(node39, nodeArray67);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(booleanResultPredicate7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate28);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate50);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(jSType56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 100 + "'", int65 == 100);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(nodeArray67);
        org.junit.Assert.assertNotNull(node68);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isUndefined(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.mayBeString(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isNullOrUndefined(node2);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isNull(node2);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isUndefined(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node3);
        boolean boolean6 = booleanResultPredicate0.apply(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isGet(node3);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate9 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isLabelName(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node12);
        boolean boolean15 = booleanResultPredicate9.apply(node12);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isNullOrUndefined(node12);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isLhs(node3, node12);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isLabelName(node12);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue19 = com.google.javascript.jscomp.NodeUtil.getExpressionBooleanValue(node12);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isLabelName(node12);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node23);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isLabelName(node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node24);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement27 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate28 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int29 = com.google.javascript.jscomp.NodeUtil.getCount(node24, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement27, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate28);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node24);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration32 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.containsType(node24, 1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration32);
        int int34 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node12, (-1), (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration32);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.rhino.Node node37 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node36);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isLabelName(node37);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node37);
        java.lang.String str40 = com.google.javascript.jscomp.NodeUtil.getSourceName(node37);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.containsCall(node37);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isGetProp(node37);
        java.lang.String str43 = com.google.javascript.jscomp.NodeUtil.getSourceName(node37);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node12, node37, "typeof");
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node12);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node47 = com.google.javascript.jscomp.NodeUtil.getAssignedValue(node12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(ternaryValue19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isLabelName(node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node6);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isLhs(node2, node6);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.containsCall(node2);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isLabelName(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node13);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node13);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isCall(node13);
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newExpr(node13);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isAssign(node13);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.referencesThis(node13);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node2, node13, "");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue23 = com.google.javascript.jscomp.NodeUtil.getExpressionBooleanValue(node13);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node25);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isLabelName(node26);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node26);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement29 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate30 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int31 = com.google.javascript.jscomp.NodeUtil.getCount(node26, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement29, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate30);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isNumericResultHelper(node26);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node26);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node26);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node26);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isExprCall(node26);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node13, node26, "");
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isConstantName(node13);
        com.google.javascript.rhino.Node node40 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node13);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(ternaryValue23);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node40);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node3);
        boolean boolean6 = booleanResultPredicate0.apply(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isGet(node3);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate9 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isLabelName(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node12);
        boolean boolean15 = booleanResultPredicate9.apply(node12);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isNullOrUndefined(node12);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isLhs(node3, node12);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isLabelName(node12);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node12);
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newExpr(node12);
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node20);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        java.lang.String str1 = com.google.javascript.jscomp.NodeUtil.opToStrNoFail(100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "||" + "'", str1, "||");
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate numbericResultPredicate0 = new com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate();
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node3);
        java.lang.String str6 = com.google.javascript.jscomp.NodeUtil.getSourceName(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.containsCall(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isBooleanResult(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node3);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue10 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node3);
        boolean boolean11 = numbericResultPredicate0.apply(node3);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node3);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node3, abstractCompiler13);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(ternaryValue10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate0 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate2 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isLabelName(node5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node5);
        boolean boolean8 = booleanResultPredicate2.apply(node5);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node5);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isFunction(node5);
        java.lang.String str11 = com.google.javascript.jscomp.NodeUtil.arrayToString(node5);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node5, abstractCompiler12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isForIn(node5);
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node5);
        java.lang.String str16 = com.google.javascript.jscomp.NodeUtil.getSourceName(node15);
        boolean boolean17 = mayBeStringResultPredicate0.apply(node15);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isLabelName(node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node20);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isUndefined(node20);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isUndefined(node20);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node26);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isLabelName(node27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node27);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement30 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate31 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int32 = com.google.javascript.jscomp.NodeUtil.getCount(node27, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement30, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate31);
        com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate numbericResultPredicate33 = com.google.javascript.jscomp.NodeUtil.NUMBERIC_RESULT_PREDICATE;
        int int34 = com.google.javascript.jscomp.NodeUtil.getCount(node20, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate31, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) numbericResultPredicate33);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node20);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate37 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.rhino.Node node40 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node39);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isLabelName(node40);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node40);
        boolean boolean43 = booleanResultPredicate37.apply(node40);
        com.google.javascript.rhino.Node node44 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node40);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node20, node44, "");
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.rhino.Node node49 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node48);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isLabelName(node49);
        com.google.javascript.rhino.Node node52 = null;
        com.google.javascript.rhino.Node node53 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node52);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.isLabelName(node53);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node53);
        boolean boolean56 = com.google.javascript.jscomp.NodeUtil.isLhs(node49, node53);
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.containsCall(node49);
        com.google.javascript.rhino.Node node59 = null;
        com.google.javascript.rhino.Node node60 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node59);
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.isLabelName(node60);
        boolean boolean62 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node60);
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node60);
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.isCall(node60);
        com.google.javascript.rhino.Node node65 = com.google.javascript.jscomp.NodeUtil.newExpr(node60);
        boolean boolean66 = com.google.javascript.jscomp.NodeUtil.isAssign(node60);
        boolean boolean67 = com.google.javascript.jscomp.NodeUtil.referencesThis(node60);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node49, node60, "");
        boolean boolean70 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node49);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node20, node49, "JSCompiler_renameProperty");
        boolean boolean73 = mayBeStringResultPredicate0.apply(node49);
        com.google.javascript.rhino.Node node75 = null;
        com.google.javascript.rhino.Node node76 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node75);
        boolean boolean77 = com.google.javascript.jscomp.NodeUtil.isLabelName(node76);
        boolean boolean78 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node76);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement79 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate80 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int81 = com.google.javascript.jscomp.NodeUtil.getCount(node76, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement79, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate80);
        boolean boolean82 = com.google.javascript.jscomp.NodeUtil.isNumericResultHelper(node76);
        boolean boolean83 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node76);
        boolean boolean84 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node76);
        java.lang.String str85 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node76);
        boolean boolean86 = mayBeStringResultPredicate0.apply(node76);
        java.lang.String str87 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node76);
        boolean boolean88 = com.google.javascript.jscomp.NodeUtil.isString(node76);
        boolean boolean89 = com.google.javascript.jscomp.NodeUtil.isCall(node76);
        boolean boolean90 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node76);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate0);
        org.junit.Assert.assertNotNull(booleanResultPredicate2);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(numbericResultPredicate33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate37);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 1 + "'", int81 == 1);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNull(str85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNull(str87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate0 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate2 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isLabelName(node5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node5);
        boolean boolean8 = booleanResultPredicate2.apply(node5);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node5);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isFunction(node5);
        java.lang.String str11 = com.google.javascript.jscomp.NodeUtil.arrayToString(node5);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node5, abstractCompiler12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isForIn(node5);
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node5);
        java.lang.String str16 = com.google.javascript.jscomp.NodeUtil.getSourceName(node15);
        boolean boolean17 = mayBeStringResultPredicate0.apply(node15);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isLabelName(node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node20);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isUndefined(node20);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isUndefined(node20);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node26);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isLabelName(node27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node27);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement30 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate31 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int32 = com.google.javascript.jscomp.NodeUtil.getCount(node27, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement30, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate31);
        com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate numbericResultPredicate33 = com.google.javascript.jscomp.NodeUtil.NUMBERIC_RESULT_PREDICATE;
        int int34 = com.google.javascript.jscomp.NodeUtil.getCount(node20, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate31, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) numbericResultPredicate33);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node20);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate37 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.rhino.Node node40 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node39);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isLabelName(node40);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node40);
        boolean boolean43 = booleanResultPredicate37.apply(node40);
        com.google.javascript.rhino.Node node44 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node40);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node20, node44, "");
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.rhino.Node node49 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node48);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isLabelName(node49);
        com.google.javascript.rhino.Node node52 = null;
        com.google.javascript.rhino.Node node53 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node52);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.isLabelName(node53);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node53);
        boolean boolean56 = com.google.javascript.jscomp.NodeUtil.isLhs(node49, node53);
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.containsCall(node49);
        com.google.javascript.rhino.Node node59 = null;
        com.google.javascript.rhino.Node node60 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node59);
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.isLabelName(node60);
        boolean boolean62 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node60);
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node60);
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.isCall(node60);
        com.google.javascript.rhino.Node node65 = com.google.javascript.jscomp.NodeUtil.newExpr(node60);
        boolean boolean66 = com.google.javascript.jscomp.NodeUtil.isAssign(node60);
        boolean boolean67 = com.google.javascript.jscomp.NodeUtil.referencesThis(node60);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node49, node60, "");
        boolean boolean70 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node49);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node20, node49, "JSCompiler_renameProperty");
        boolean boolean73 = mayBeStringResultPredicate0.apply(node49);
        java.lang.String str74 = com.google.javascript.jscomp.NodeUtil.getStringValue(node49);
        boolean boolean75 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node49);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate0);
        org.junit.Assert.assertNotNull(booleanResultPredicate2);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(numbericResultPredicate33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate37);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNull(str74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        java.lang.Double double5 = com.google.javascript.jscomp.NodeUtil.getNumberValue(node2);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType jSType7 = com.google.javascript.jscomp.NodeUtil.getObjectLitKeyTypeFromValueType(node2, jSType6);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.getConditionExpression(node2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: VAR does not have a condition.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(double5);
        org.junit.Assert.assertNull(jSType7);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node3);
        boolean boolean6 = booleanResultPredicate0.apply(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node3);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isBooleanResultHelper(node3);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node3);
        com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate numbericResultPredicate12 = com.google.javascript.jscomp.NodeUtil.NUMBERIC_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node14);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isLabelName(node15);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node15);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isNullOrUndefined(node15);
        boolean boolean19 = numbericResultPredicate12.apply(node15);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node21);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isLabelName(node22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node22);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isUndefined(node22);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isUndefined(node22);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node28);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isLabelName(node29);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node29);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement32 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate33 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int34 = com.google.javascript.jscomp.NodeUtil.getCount(node29, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement32, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate33);
        com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate numbericResultPredicate35 = com.google.javascript.jscomp.NodeUtil.NUMBERIC_RESULT_PREDICATE;
        int int36 = com.google.javascript.jscomp.NodeUtil.getCount(node22, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate33, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) numbericResultPredicate35);
        int int37 = com.google.javascript.jscomp.NodeUtil.getCount(node3, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) numbericResultPredicate12, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate33);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.rhino.Node node40 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node39);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isLabelName(node40);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node40);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node40);
        boolean boolean44 = numbericResultPredicate12.apply(node40);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue45 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node40);
        com.google.javascript.rhino.jstype.JSType jSType46 = null;
        com.google.javascript.rhino.jstype.JSType jSType47 = com.google.javascript.jscomp.NodeUtil.getObjectLitKeyTypeFromValueType(node40, jSType46);
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(numbericResultPredicate12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(numbericResultPredicate35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(ternaryValue45);
        org.junit.Assert.assertNull(jSType47);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node2);
        java.lang.String str5 = com.google.javascript.jscomp.NodeUtil.getSourceName(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isGetProp(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node2);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate1 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isLabelName(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node4);
        boolean boolean7 = booleanResultPredicate1.apply(node4);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node4);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunction(node4);
        java.lang.String str10 = com.google.javascript.jscomp.NodeUtil.arrayToString(node4);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node4, abstractCompiler11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isForIn(node4);
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node4);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node4, "instanceof");
        org.junit.Assert.assertNotNull(booleanResultPredicate1);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate6 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int7 = com.google.javascript.jscomp.NodeUtil.getCount(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement5, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate6);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate9 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isLabelName(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node12);
        boolean boolean15 = booleanResultPredicate9.apply(node12);
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node12);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isGet(node16);
        boolean boolean18 = matchShallowStatement5.apply(node16);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isGetProp(node16);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node16);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node16);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isLabelName(node25);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node25);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isUndefined(node25);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node30);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isLabelName(node31);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node31);
        java.lang.String str34 = com.google.javascript.jscomp.NodeUtil.getSourceName(node31);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.containsCall(node31);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node25, node31);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration38 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate39 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.rhino.Node node42 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node41);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isLabelName(node42);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node42);
        boolean boolean45 = booleanResultPredicate39.apply(node42);
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.rhino.Node node48 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node47);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.isLabelName(node48);
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.rhino.Node node52 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node51);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.isLabelName(node52);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node52);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.isLhs(node48, node52);
        boolean boolean56 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node42, node48);
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.isBooleanResultHelper(node48);
        boolean boolean58 = matchDeclaration38.apply(node48);
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.containsType(node31, (int) '4', (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration38);
        com.google.javascript.rhino.Node node61 = null;
        com.google.javascript.rhino.Node node62 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node61);
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.isLabelName(node62);
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node62);
        boolean boolean65 = com.google.javascript.jscomp.NodeUtil.isUndefined(node62);
        com.google.javascript.rhino.Node node67 = null;
        com.google.javascript.rhino.Node node68 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node67);
        boolean boolean69 = com.google.javascript.jscomp.NodeUtil.isLabelName(node68);
        boolean boolean70 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node68);
        java.lang.String str71 = com.google.javascript.jscomp.NodeUtil.getSourceName(node68);
        boolean boolean72 = com.google.javascript.jscomp.NodeUtil.containsCall(node68);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node62, node68);
        boolean boolean74 = matchDeclaration38.apply(node62);
        int int75 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node16, (int) (byte) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration38);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(booleanResultPredicate9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate39);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isCall(node2);
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newExpr(node2);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isAssign(node2);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCallOrApply(node2);
        com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate numbericResultPredicate11 = com.google.javascript.jscomp.NodeUtil.NUMBERIC_RESULT_PREDICATE;
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.containsType(node2, (int) (byte) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) numbericResultPredicate11);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node14);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isLabelName(node15);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node15);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node15);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.mayBeString(node15, true);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isArrayLiteral(node15);
        boolean boolean22 = numbericResultPredicate11.apply(node15);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isConstantName(node15);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isForIn(node15);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isAssign(node15);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection26 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node15);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate29 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node31);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isLabelName(node32);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node32);
        boolean boolean35 = booleanResultPredicate29.apply(node32);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node32);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isFunction(node32);
        java.lang.String str38 = com.google.javascript.jscomp.NodeUtil.arrayToString(node32);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler39 = null;
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node32, abstractCompiler39);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isForIn(node32);
        com.google.javascript.rhino.Node node42 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node32);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate43 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.rhino.Node node46 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node45);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isLabelName(node46);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node46);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node46, "hi!");
        com.google.javascript.rhino.JSDocInfo jSDocInfo51 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node46);
        boolean boolean52 = booleanResultPredicate43.apply(node46);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.valueCheck(node32, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate43);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate54 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.rhino.Node node57 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node56);
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.isLabelName(node57);
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node57);
        boolean boolean60 = booleanResultPredicate54.apply(node57);
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node57);
        boolean boolean62 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node57);
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node57);
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node57);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType67 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 1);
        boolean boolean68 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node57, "hi!", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType67);
        boolean boolean69 = com.google.javascript.jscomp.NodeUtil.isBooleanResult(node57);
        boolean boolean70 = booleanResultPredicate43.apply(node57);
        boolean boolean71 = com.google.javascript.jscomp.NodeUtil.containsType(node15, (int) (byte) -1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate43);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(numbericResultPredicate11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(nodeCollection26);
        org.junit.Assert.assertNotNull(booleanResultPredicate29);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(booleanResultPredicate43);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(jSDocInfo51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate54);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isUndefined(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isUndefined(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isArrayLiteral(node2);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node2, "hi!");
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isCall(node2);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node2);
        java.lang.String str12 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node2);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node3);
        boolean boolean6 = booleanResultPredicate0.apply(node3);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate7 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isLabelName(node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node10);
        boolean boolean13 = booleanResultPredicate7.apply(node10);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isLhs(node3, node10);
        com.google.javascript.jscomp.NodeUtil.MatchNotFunction matchNotFunction15 = new com.google.javascript.jscomp.NodeUtil.MatchNotFunction();
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isLabelName(node18);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node21);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isLabelName(node22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node22);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isLhs(node18, node22);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.containsCall(node18);
        boolean boolean27 = matchNotFunction15.apply(node18);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node29);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isLabelName(node30);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node30);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement33 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate34 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int35 = com.google.javascript.jscomp.NodeUtil.getCount(node30, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement33, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate34);
        boolean boolean36 = matchNotFunction15.apply(node30);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration37 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.rhino.Node node40 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node39);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isLabelName(node40);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node40);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node40);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isCall(node40);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate45 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.rhino.Node node48 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node47);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.isLabelName(node48);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node48);
        boolean boolean51 = booleanResultPredicate45.apply(node48);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node48);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node48);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node40, node48);
        boolean boolean55 = matchDeclaration37.apply(node40);
        boolean boolean56 = matchNotFunction15.apply(node40);
        com.google.javascript.rhino.Node node58 = null;
        com.google.javascript.rhino.Node node59 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node58);
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.isLabelName(node59);
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node59);
        boolean boolean62 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node59);
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.isCall(node59);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler64 = null;
        boolean boolean65 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node59, abstractCompiler64);
        boolean boolean66 = matchNotFunction15.apply(node59);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node10, node59);
        java.lang.Double double68 = com.google.javascript.jscomp.NodeUtil.getNumberValue(node59);
        boolean boolean69 = com.google.javascript.jscomp.NodeUtil.isNumericResult(node59);
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate45);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNull(double68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate1 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isLabelName(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node4);
        boolean boolean7 = booleanResultPredicate1.apply(node4);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node4);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node8);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate11 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        com.google.javascript.jscomp.NodeUtil.MatchNotFunction matchNotFunction12 = new com.google.javascript.jscomp.NodeUtil.MatchNotFunction();
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node14);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isLabelName(node15);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isLabelName(node19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node19);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isLhs(node15, node19);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.containsCall(node15);
        boolean boolean24 = matchNotFunction12.apply(node15);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node26);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isLabelName(node27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node27);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement30 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate31 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int32 = com.google.javascript.jscomp.NodeUtil.getCount(node27, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement30, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate31);
        boolean boolean33 = matchNotFunction12.apply(node27);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration34 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.rhino.Node node37 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node36);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isLabelName(node37);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node37);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node37);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isCall(node37);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate42 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.rhino.Node node45 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node44);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isLabelName(node45);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node45);
        boolean boolean48 = booleanResultPredicate42.apply(node45);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node45);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node45);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node37, node45);
        boolean boolean52 = matchDeclaration34.apply(node37);
        boolean boolean53 = matchNotFunction12.apply(node37);
        com.google.javascript.rhino.Node node55 = null;
        com.google.javascript.rhino.Node node56 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node55);
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.isLabelName(node56);
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node56);
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node56);
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.isCall(node56);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler61 = null;
        boolean boolean62 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node56, abstractCompiler61);
        boolean boolean63 = matchNotFunction12.apply(node56);
        com.google.javascript.rhino.Node node65 = null;
        com.google.javascript.rhino.Node node66 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node65);
        boolean boolean67 = com.google.javascript.jscomp.NodeUtil.isLabelName(node66);
        boolean boolean68 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node66);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement69 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate70 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int71 = com.google.javascript.jscomp.NodeUtil.getCount(node66, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement69, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate70);
        boolean boolean72 = com.google.javascript.jscomp.NodeUtil.isNumericResultHelper(node66);
        boolean boolean73 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node66);
        boolean boolean74 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node66);
        boolean boolean75 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node66);
        boolean boolean76 = com.google.javascript.jscomp.NodeUtil.isExprCall(node66);
        com.google.javascript.rhino.Node node77 = com.google.javascript.jscomp.NodeUtil.newExpr(node66);
        boolean boolean78 = matchNotFunction12.apply(node77);
        boolean boolean79 = mayBeStringResultPredicate11.apply(node77);
        boolean boolean80 = com.google.javascript.jscomp.NodeUtil.containsType(node8, (int) (byte) 10, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate11);
        boolean boolean81 = com.google.javascript.jscomp.NodeUtil.mayBeStringHelper(node8);
        org.junit.Assert.assertNotNull(booleanResultPredicate1);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate11);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate42);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isCall(node2);
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newExpr(node2);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isAssign(node2);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCallOrApply(node2);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node2);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node2);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node2);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isGet(node2);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node2);
        java.lang.Double double15 = com.google.javascript.jscomp.NodeUtil.getNumberValue(node2);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isLabelName(node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node18);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement21 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate22 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int23 = com.google.javascript.jscomp.NodeUtil.getCount(node18, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement21, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isNumericResultHelper(node18);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node18);
        java.lang.String str26 = com.google.javascript.jscomp.NodeUtil.arrayToString(node18);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node18);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node18);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isLhs(node2, node18);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isNumericResultHelper(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(double15);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        com.google.javascript.jscomp.NodeUtil.MatchNotFunction matchNotFunction0 = new com.google.javascript.jscomp.NodeUtil.MatchNotFunction();
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isLabelName(node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node7);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isLhs(node3, node7);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.containsCall(node3);
        boolean boolean12 = matchNotFunction0.apply(node3);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node14);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isLabelName(node15);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node15);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement18 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate19 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int20 = com.google.javascript.jscomp.NodeUtil.getCount(node15, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement18, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate19);
        boolean boolean21 = matchNotFunction0.apply(node15);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration22 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isLabelName(node25);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node25);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node25);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isCall(node25);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate30 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node32);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isLabelName(node33);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node33);
        boolean boolean36 = booleanResultPredicate30.apply(node33);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node33);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node33);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node25, node33);
        boolean boolean40 = matchDeclaration22.apply(node25);
        boolean boolean41 = matchNotFunction0.apply(node25);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node25);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node43 = com.google.javascript.jscomp.NodeUtil.getConditionExpression(node25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: VAR does not have a condition.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate30);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node2);
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node2);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate7 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isLabelName(node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node10);
        boolean boolean13 = booleanResultPredicate7.apply(node10);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node15);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isLabelName(node16);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isLabelName(node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node20);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isLhs(node16, node20);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node10, node16);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node16);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node2, node16);
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newExpr(node2);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node27);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(booleanResultPredicate7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate1 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isLabelName(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node4);
        boolean boolean7 = booleanResultPredicate1.apply(node4);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node4);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunction(node4);
        java.lang.String str10 = com.google.javascript.jscomp.NodeUtil.arrayToString(node4);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node4, abstractCompiler11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isForIn(node4);
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node4);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate15 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isLabelName(node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node18);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node18, "hi!");
        com.google.javascript.rhino.JSDocInfo jSDocInfo23 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node18);
        boolean boolean24 = booleanResultPredicate15.apply(node18);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.valueCheck(node4, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate15);
        com.google.javascript.jscomp.NodeUtil.MatchNotFunction matchNotFunction26 = new com.google.javascript.jscomp.NodeUtil.MatchNotFunction();
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node28);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isLabelName(node29);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node32);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isLabelName(node33);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node33);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isLhs(node29, node33);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.containsCall(node29);
        boolean boolean38 = matchNotFunction26.apply(node29);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.rhino.Node node41 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node40);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isLabelName(node41);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node41);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement44 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate45 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int46 = com.google.javascript.jscomp.NodeUtil.getCount(node41, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement44, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate45);
        boolean boolean47 = matchNotFunction26.apply(node41);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration48 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.rhino.Node node51 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node50);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isLabelName(node51);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node51);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node51);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.isCall(node51);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate56 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node58 = null;
        com.google.javascript.rhino.Node node59 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node58);
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.isLabelName(node59);
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node59);
        boolean boolean62 = booleanResultPredicate56.apply(node59);
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node59);
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node59);
        boolean boolean65 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node51, node59);
        boolean boolean66 = matchDeclaration48.apply(node51);
        boolean boolean67 = matchNotFunction26.apply(node51);
        boolean boolean68 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node51);
        com.google.javascript.rhino.Node node69 = com.google.javascript.jscomp.NodeUtil.newExpr(node51);
        boolean boolean70 = booleanResultPredicate15.apply(node69);
        boolean boolean71 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node69);
        org.junit.Assert.assertNotNull(booleanResultPredicate1);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(booleanResultPredicate15);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(jSDocInfo23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate56);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node2);
        java.lang.String str5 = com.google.javascript.jscomp.NodeUtil.getSourceName(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.containsCall(node2);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node2);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.referencesThis(node2);
        java.lang.String str9 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node2);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node2);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = com.google.javascript.jscomp.NodeUtil.getOpFromAssignmentOp(node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate6 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int7 = com.google.javascript.jscomp.NodeUtil.getCount(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement5, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isNumericResultHelper(node2);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node2);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node2);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node2);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isExprCall(node2);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node2);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node2, "typeof");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = com.google.javascript.jscomp.NodeUtil.tryMergeBlock(node2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node3);
        boolean boolean6 = booleanResultPredicate0.apply(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunction(node3);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isForIn(node3);
        com.google.javascript.rhino.JSDocInfo jSDocInfo11 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node3);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node3, abstractCompiler12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = com.google.javascript.jscomp.NodeUtil.getPrototypePropertyName(node3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(jSDocInfo11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isUndefined(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isUndefined(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isArrayLiteral(node2);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node2, "hi!");
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(node2);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isConstantName(node2);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node2);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isStatement(node2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate6 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int7 = com.google.javascript.jscomp.NodeUtil.getCount(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement5, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isNumericResultHelper(node2);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node2);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node2);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node2);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isExprCall(node2);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isAssign(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate6 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int7 = com.google.javascript.jscomp.NodeUtil.getCount(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement5, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate6);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate9 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isLabelName(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node12);
        boolean boolean15 = booleanResultPredicate9.apply(node12);
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node12);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isGet(node16);
        boolean boolean18 = matchShallowStatement5.apply(node16);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isLabelName(node21);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node21);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement24 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate25 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int26 = com.google.javascript.jscomp.NodeUtil.getCount(node21, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement24, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate25);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isNumericResultHelper(node21);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node21);
        java.lang.String str29 = com.google.javascript.jscomp.NodeUtil.arrayToString(node21);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node21);
        boolean boolean31 = matchShallowStatement5.apply(node21);
        com.google.javascript.jscomp.NodeUtil.MatchNotFunction matchNotFunction32 = new com.google.javascript.jscomp.NodeUtil.MatchNotFunction();
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node34);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isLabelName(node35);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.rhino.Node node39 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node38);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isLabelName(node39);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node39);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isLhs(node35, node39);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.containsCall(node35);
        boolean boolean44 = matchNotFunction32.apply(node35);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.rhino.Node node47 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node46);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isLabelName(node47);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node47);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement50 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate51 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int52 = com.google.javascript.jscomp.NodeUtil.getCount(node47, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement50, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate51);
        boolean boolean53 = matchNotFunction32.apply(node47);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType55 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 1);
        com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate numbericResultPredicate56 = com.google.javascript.jscomp.NodeUtil.NUMBERIC_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node58 = null;
        com.google.javascript.rhino.Node node59 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node58);
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.isLabelName(node59);
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node59);
        boolean boolean62 = com.google.javascript.jscomp.NodeUtil.isNullOrUndefined(node59);
        boolean boolean63 = numbericResultPredicate56.apply(node59);
        boolean boolean64 = matchNodeType55.apply(node59);
        com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate numbericResultPredicate65 = new com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate();
        boolean boolean66 = com.google.javascript.jscomp.NodeUtil.has(node47, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType55, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) numbericResultPredicate65);
        com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate numbericResultPredicate67 = com.google.javascript.jscomp.NodeUtil.NUMBERIC_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node69 = null;
        com.google.javascript.rhino.Node node70 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node69);
        boolean boolean71 = com.google.javascript.jscomp.NodeUtil.isLabelName(node70);
        boolean boolean72 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node70);
        boolean boolean73 = com.google.javascript.jscomp.NodeUtil.isNullOrUndefined(node70);
        boolean boolean74 = numbericResultPredicate67.apply(node70);
        boolean boolean75 = com.google.javascript.jscomp.NodeUtil.has(node21, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType55, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) numbericResultPredicate67);
        boolean boolean76 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str77 = com.google.javascript.jscomp.NodeUtil.getFunctionName(node21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(booleanResultPredicate9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(numbericResultPredicate56);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(numbericResultPredicate67);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node3);
        boolean boolean6 = booleanResultPredicate0.apply(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunction(node3);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isForIn(node3);
        com.google.javascript.rhino.JSDocInfo jSDocInfo11 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node3);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection12 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node3);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node3, "hi!");
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isName(node3);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isFunction(node3);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node3);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.NodeUtil.maybeAddFinally(node3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(jSDocInfo11);
        org.junit.Assert.assertNotNull(nodeCollection12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isUndefined(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isUndefined(node2);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isLabelName(node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node9);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement12 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate13 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int14 = com.google.javascript.jscomp.NodeUtil.getCount(node9, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement12, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate13);
        com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate numbericResultPredicate15 = com.google.javascript.jscomp.NodeUtil.NUMBERIC_RESULT_PREDICATE;
        int int16 = com.google.javascript.jscomp.NodeUtil.getCount(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate13, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) numbericResultPredicate15);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate17 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isLabelName(node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node20);
        boolean boolean23 = booleanResultPredicate17.apply(node20);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node20);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node20);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node20);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node20);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate29 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node31);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isLabelName(node32);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node32);
        boolean boolean35 = booleanResultPredicate29.apply(node32);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node20, "", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate29);
        boolean boolean37 = numbericResultPredicate15.apply(node20);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.rhino.Node node40 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node39);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isLabelName(node40);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node40);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node40, "hi!");
        com.google.javascript.rhino.JSDocInfo jSDocInfo45 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node40);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.mayBeString(node40);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node20, node40);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType49 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 1);
        com.google.javascript.jscomp.NodeUtil.MatchNotFunction matchNotFunction50 = new com.google.javascript.jscomp.NodeUtil.MatchNotFunction();
        com.google.javascript.rhino.Node node52 = null;
        com.google.javascript.rhino.Node node53 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node52);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.isLabelName(node53);
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.rhino.Node node57 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node56);
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.isLabelName(node57);
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node57);
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.isLhs(node53, node57);
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.containsCall(node53);
        boolean boolean62 = matchNotFunction50.apply(node53);
        com.google.javascript.rhino.Node node64 = null;
        com.google.javascript.rhino.Node node65 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node64);
        boolean boolean66 = com.google.javascript.jscomp.NodeUtil.isLabelName(node65);
        boolean boolean67 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node65);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement68 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate69 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int70 = com.google.javascript.jscomp.NodeUtil.getCount(node65, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement68, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate69);
        boolean boolean71 = matchNotFunction50.apply(node65);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration72 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        com.google.javascript.rhino.Node node74 = null;
        com.google.javascript.rhino.Node node75 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node74);
        boolean boolean76 = com.google.javascript.jscomp.NodeUtil.isLabelName(node75);
        boolean boolean77 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node75);
        boolean boolean78 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node75);
        boolean boolean79 = com.google.javascript.jscomp.NodeUtil.isCall(node75);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate80 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node82 = null;
        com.google.javascript.rhino.Node node83 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node82);
        boolean boolean84 = com.google.javascript.jscomp.NodeUtil.isLabelName(node83);
        boolean boolean85 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node83);
        boolean boolean86 = booleanResultPredicate80.apply(node83);
        boolean boolean87 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node83);
        boolean boolean88 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node83);
        boolean boolean89 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node75, node83);
        boolean boolean90 = matchDeclaration72.apply(node75);
        boolean boolean91 = matchNotFunction50.apply(node75);
        boolean boolean92 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node75);
        boolean boolean93 = matchNodeType49.apply(node75);
        boolean boolean94 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node40, node75);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(numbericResultPredicate15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(booleanResultPredicate17);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate29);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(jSDocInfo45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate80);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isCall(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isNullOrUndefined(node2);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.getFunctionBody(node2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node3);
        boolean boolean6 = booleanResultPredicate0.apply(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isExprCall(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node3);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node3);
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node2);
        java.lang.String str5 = com.google.javascript.jscomp.NodeUtil.getSourceName(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.containsCall(node2);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getStringValue(node2);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isArrayLiteral(node2);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isGet(node2);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isBooleanResult(node2);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isConstantName(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node3);
        boolean boolean6 = booleanResultPredicate0.apply(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isFunction(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.mayBeString(node3);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isFunction(node3);
        java.lang.String str11 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node3);
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate6 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int7 = com.google.javascript.jscomp.NodeUtil.getCount(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement5, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isNumericResultHelper(node2);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node2);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node2);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = com.google.javascript.jscomp.NodeUtil.functionCallHasSideEffects(node2, abstractCompiler11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected CALL node, got VAR");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isCall(node2);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate7 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isLabelName(node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node10);
        boolean boolean13 = booleanResultPredicate7.apply(node10);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node10);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node10);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node2, node10);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node10);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node10);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate6 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int7 = com.google.javascript.jscomp.NodeUtil.getCount(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement5, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isNumericResultHelper(node2);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node2);
        java.lang.String str10 = com.google.javascript.jscomp.NodeUtil.arrayToString(node2);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node2);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node2);
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newExpr(node2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unexpected expression nodeEXPR_RESULT? parent:null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement0 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate1 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isLabelName(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node4);
        boolean boolean7 = booleanResultPredicate1.apply(node4);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isNullOrUndefined(node4);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isLabelName(node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node11);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node11);
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node11);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate16 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isLabelName(node19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node19);
        boolean boolean22 = booleanResultPredicate16.apply(node19);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isLabelName(node25);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node28);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isLabelName(node29);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node29);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isLhs(node25, node29);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node19, node25);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node25);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node11, node25);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node4, node25);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isGetProp(node4);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node4);
        com.google.javascript.rhino.JSDocInfo jSDocInfo39 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node4);
        boolean boolean40 = matchShallowStatement0.apply(node4);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isFunction(node4);
        org.junit.Assert.assertNotNull(booleanResultPredicate1);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(booleanResultPredicate16);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNull(jSDocInfo39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node2);
        java.lang.String str5 = com.google.javascript.jscomp.NodeUtil.getSourceName(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.containsCall(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isBooleanResult(node2);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node2);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue9 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node2);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isAssign(node10);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(ternaryValue9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.JSType jSType5 = com.google.javascript.jscomp.NodeUtil.getObjectLitKeyTypeFromValueType(node2, jSType4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isBooleanResult(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node2);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node2, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = com.google.javascript.jscomp.NodeUtil.tryMergeBlock(node2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node3);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement6 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate7 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int8 = com.google.javascript.jscomp.NodeUtil.getCount(node3, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement6, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node3);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node3);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate12 = new com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate();
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node10, "hi!", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate12);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate14 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isLabelName(node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node17);
        boolean boolean20 = booleanResultPredicate14.apply(node17);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node17);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node17);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isFunction(node17);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isForIn(node17);
        com.google.javascript.rhino.JSDocInfo jSDocInfo25 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node17);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node17);
        boolean boolean27 = mayBeStringResultPredicate12.apply(node17);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node29);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isLabelName(node30);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node30);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node30);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isCall(node30);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler35 = null;
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node30, abstractCompiler35);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node30);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.mayBeStringHelper(node30);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isLhs(node17, node30);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node30);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(booleanResultPredicate14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(jSDocInfo25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node3);
        boolean boolean6 = booleanResultPredicate0.apply(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isGet(node3);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate9 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isLabelName(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node12);
        boolean boolean15 = booleanResultPredicate9.apply(node12);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isNullOrUndefined(node12);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isLhs(node3, node12);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isLabelName(node12);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue19 = com.google.javascript.jscomp.NodeUtil.getExpressionBooleanValue(node12);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node12, "||");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.getRootOfQualifiedName(node12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(ternaryValue19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        com.google.javascript.jscomp.NodeUtil.MatchNotFunction matchNotFunction0 = new com.google.javascript.jscomp.NodeUtil.MatchNotFunction();
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isLabelName(node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node7);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isLhs(node3, node7);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.containsCall(node3);
        boolean boolean12 = matchNotFunction0.apply(node3);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node14);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isLabelName(node15);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node15);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement18 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate19 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int20 = com.google.javascript.jscomp.NodeUtil.getCount(node15, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement18, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate19);
        boolean boolean21 = matchNotFunction0.apply(node15);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node23);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isLabelName(node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node24);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement27 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate28 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int29 = com.google.javascript.jscomp.NodeUtil.getCount(node24, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement27, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate28);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node24);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node24);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isAssign(node24);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node24, "||");
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCallOrApply(node24);
        boolean boolean36 = matchNotFunction0.apply(node24);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node3);
        boolean boolean6 = booleanResultPredicate0.apply(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node3);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node3);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node3);
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate6 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int7 = com.google.javascript.jscomp.NodeUtil.getCount(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement5, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node2);
        java.lang.Double double9 = com.google.javascript.jscomp.NodeUtil.getNumberValue(node2);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate10 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isLabelName(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node13);
        boolean boolean16 = booleanResultPredicate10.apply(node13);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node13);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isGet(node13);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate19 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node21);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isLabelName(node22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node22);
        boolean boolean25 = booleanResultPredicate19.apply(node22);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isNullOrUndefined(node22);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isLhs(node13, node22);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isLabelName(node22);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue29 = com.google.javascript.jscomp.NodeUtil.getExpressionBooleanValue(node22);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isLabelName(node22);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.rhino.Node node34 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node33);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isLabelName(node34);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node34);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement37 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate38 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int39 = com.google.javascript.jscomp.NodeUtil.getCount(node34, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement37, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate38);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node34);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration42 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.containsType(node34, 1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration42);
        int int44 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node22, (-1), (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration42);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate45 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.rhino.Node node48 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node47);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.isLabelName(node48);
        com.google.javascript.rhino.jstype.JSType jSType50 = null;
        com.google.javascript.rhino.jstype.JSType jSType51 = com.google.javascript.jscomp.NodeUtil.getObjectLitKeyTypeFromValueType(node48, jSType50);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isBooleanResult(node48);
        boolean boolean53 = booleanResultPredicate45.apply(node48);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node48);
        boolean boolean55 = matchDeclaration42.apply(node48);
        com.google.javascript.rhino.Node node57 = null;
        com.google.javascript.rhino.Node node58 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node57);
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.isLabelName(node58);
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node58);
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node58);
        com.google.javascript.rhino.Node node62 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node58);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate63 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node65 = null;
        com.google.javascript.rhino.Node node66 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node65);
        boolean boolean67 = com.google.javascript.jscomp.NodeUtil.isLabelName(node66);
        boolean boolean68 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node66);
        boolean boolean69 = booleanResultPredicate63.apply(node66);
        com.google.javascript.rhino.Node node71 = null;
        com.google.javascript.rhino.Node node72 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node71);
        boolean boolean73 = com.google.javascript.jscomp.NodeUtil.isLabelName(node72);
        com.google.javascript.rhino.Node node75 = null;
        com.google.javascript.rhino.Node node76 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node75);
        boolean boolean77 = com.google.javascript.jscomp.NodeUtil.isLabelName(node76);
        boolean boolean78 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node76);
        boolean boolean79 = com.google.javascript.jscomp.NodeUtil.isLhs(node72, node76);
        boolean boolean80 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node66, node72);
        boolean boolean81 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node72);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node58, node72);
        boolean boolean83 = matchDeclaration42.apply(node58);
        boolean boolean84 = com.google.javascript.jscomp.NodeUtil.isLhs(node2, node58);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node86 = com.google.javascript.jscomp.NodeUtil.getArgumentForFunction(node58, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(double9);
        org.junit.Assert.assertNotNull(booleanResultPredicate10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate19);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(ternaryValue29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(booleanResultPredicate45);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(jSType51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(node62);
        org.junit.Assert.assertNotNull(booleanResultPredicate63);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node2);
        java.lang.String str5 = com.google.javascript.jscomp.NodeUtil.getSourceName(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.containsCall(node2);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getStringValue(node2);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isArrayLiteral(node2);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.mayBeString(node2, true);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.containsFunction(node2);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isName(node2);
        java.lang.String str13 = com.google.javascript.jscomp.NodeUtil.getStringValue(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node3);
        boolean boolean6 = booleanResultPredicate0.apply(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node3);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node3);
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node3, (java.util.Set<java.lang.String>) strSet14);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node3);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isLabelName(node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node20);
        java.lang.Double double23 = com.google.javascript.jscomp.NodeUtil.getNumberValue(node20);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType25 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 100);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate27 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node29);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isLabelName(node30);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node30);
        boolean boolean33 = booleanResultPredicate27.apply(node30);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node30);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isFunction(node30);
        java.lang.String str36 = com.google.javascript.jscomp.NodeUtil.arrayToString(node30);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler37 = null;
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node30, abstractCompiler37);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isForIn(node30);
        com.google.javascript.rhino.Node node40 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node30);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate41 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node43);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isLabelName(node44);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node44);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node44, "hi!");
        com.google.javascript.rhino.JSDocInfo jSDocInfo49 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node44);
        boolean boolean50 = booleanResultPredicate41.apply(node44);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.valueCheck(node30, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate41);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.has(node20, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType25, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate41);
        com.google.javascript.rhino.Node[] nodeArray53 = new com.google.javascript.rhino.Node[] { node20 };
        com.google.javascript.rhino.Node node54 = com.google.javascript.jscomp.NodeUtil.newCallNode(node3, nodeArray53);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.isNumericResult(node54);
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(double23);
        org.junit.Assert.assertNotNull(booleanResultPredicate27);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(booleanResultPredicate41);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(jSDocInfo49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(nodeArray53);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate6 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int7 = com.google.javascript.jscomp.NodeUtil.getCount(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement5, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isNumericResultHelper(node2);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node2);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate10 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isLabelName(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node13);
        boolean boolean16 = booleanResultPredicate10.apply(node13);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node13);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node13);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isLhs(node2, node13);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType21 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 1);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node23);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isLabelName(node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node24);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement27 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate28 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int29 = com.google.javascript.jscomp.NodeUtil.getCount(node24, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement27, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate28);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.has(node13, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType21, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate28);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isFunction(node13);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate6 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int7 = com.google.javascript.jscomp.NodeUtil.getCount(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement5, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate6);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate9 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isLabelName(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node12);
        boolean boolean15 = booleanResultPredicate9.apply(node12);
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node12);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isGet(node16);
        boolean boolean18 = matchShallowStatement5.apply(node16);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isLabelName(node21);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node21);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement24 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate25 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int26 = com.google.javascript.jscomp.NodeUtil.getCount(node21, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement24, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate25);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isNumericResultHelper(node21);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node21);
        java.lang.String str29 = com.google.javascript.jscomp.NodeUtil.arrayToString(node21);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node21);
        boolean boolean31 = matchShallowStatement5.apply(node21);
        com.google.javascript.jscomp.NodeUtil.MatchNotFunction matchNotFunction32 = new com.google.javascript.jscomp.NodeUtil.MatchNotFunction();
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node34);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isLabelName(node35);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.rhino.Node node39 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node38);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isLabelName(node39);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node39);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isLhs(node35, node39);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.containsCall(node35);
        boolean boolean44 = matchNotFunction32.apply(node35);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.rhino.Node node47 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node46);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isLabelName(node47);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node47);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement50 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate51 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int52 = com.google.javascript.jscomp.NodeUtil.getCount(node47, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement50, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate51);
        boolean boolean53 = matchNotFunction32.apply(node47);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType55 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 1);
        com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate numbericResultPredicate56 = com.google.javascript.jscomp.NodeUtil.NUMBERIC_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node58 = null;
        com.google.javascript.rhino.Node node59 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node58);
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.isLabelName(node59);
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node59);
        boolean boolean62 = com.google.javascript.jscomp.NodeUtil.isNullOrUndefined(node59);
        boolean boolean63 = numbericResultPredicate56.apply(node59);
        boolean boolean64 = matchNodeType55.apply(node59);
        com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate numbericResultPredicate65 = new com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate();
        boolean boolean66 = com.google.javascript.jscomp.NodeUtil.has(node47, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType55, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) numbericResultPredicate65);
        com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate numbericResultPredicate67 = com.google.javascript.jscomp.NodeUtil.NUMBERIC_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node69 = null;
        com.google.javascript.rhino.Node node70 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node69);
        boolean boolean71 = com.google.javascript.jscomp.NodeUtil.isLabelName(node70);
        boolean boolean72 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node70);
        boolean boolean73 = com.google.javascript.jscomp.NodeUtil.isNullOrUndefined(node70);
        boolean boolean74 = numbericResultPredicate67.apply(node70);
        boolean boolean75 = com.google.javascript.jscomp.NodeUtil.has(node21, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType55, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) numbericResultPredicate67);
        boolean boolean76 = com.google.javascript.jscomp.NodeUtil.isLabelName(node21);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(booleanResultPredicate9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(numbericResultPredicate56);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(numbericResultPredicate67);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isCall(node2);
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newExpr(node2);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isAssign(node2);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCallOrApply(node2);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node2);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate12 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node14);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isLabelName(node15);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node15);
        boolean boolean18 = booleanResultPredicate12.apply(node15);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isLabelName(node21);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node21);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement24 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate25 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int26 = com.google.javascript.jscomp.NodeUtil.getCount(node21, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement24, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate25);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isNumericResultHelper(node21);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node21);
        java.lang.String str29 = com.google.javascript.jscomp.NodeUtil.arrayToString(node21);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node31);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isLabelName(node32);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node32);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node32);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node21, node32, "");
        boolean boolean38 = booleanResultPredicate12.apply(node32);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node2, "", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate12);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node2, "|");
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node3);
        boolean boolean6 = booleanResultPredicate0.apply(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isNullOrUndefined(node3);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isLabelName(node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node10);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node10);
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node10);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate15 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isLabelName(node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node18);
        boolean boolean21 = booleanResultPredicate15.apply(node18);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node23);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isLabelName(node24);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isLabelName(node28);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node28);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isLhs(node24, node28);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node18, node24);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node24);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node10, node24);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node3, node24);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isGetProp(node3);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node3);
        java.lang.String str38 = com.google.javascript.jscomp.NodeUtil.getSourceName(node3);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isNull(node3);
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(booleanResultPredicate15);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isUndefined(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isUndefined(node3);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isLabelName(node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node10);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement13 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate14 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int15 = com.google.javascript.jscomp.NodeUtil.getCount(node10, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement13, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate14);
        com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate numbericResultPredicate16 = com.google.javascript.jscomp.NodeUtil.NUMBERIC_RESULT_PREDICATE;
        int int17 = com.google.javascript.jscomp.NodeUtil.getCount(node3, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate14, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) numbericResultPredicate16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node3);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate20 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isLabelName(node23);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node23);
        boolean boolean26 = booleanResultPredicate20.apply(node23);
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node23);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node3, node27, "");
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.containsCall(node3);
        com.google.javascript.rhino.Node node31 = com.google.javascript.jscomp.NodeUtil.newVarNode("||", node3);
        java.lang.Double double32 = com.google.javascript.jscomp.NodeUtil.getNumberValue(node3);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection33 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node3);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isForIn(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(numbericResultPredicate16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNull(double32);
        org.junit.Assert.assertNotNull(nodeCollection33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.rhino.jstype.JSType jSType6 = com.google.javascript.jscomp.NodeUtil.getObjectLitKeyTypeFromValueType(node3, jSType5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isBooleanResult(node3);
        boolean boolean8 = booleanResultPredicate0.apply(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node3);
        int int11 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node3, "hi!");
        java.lang.String str12 = com.google.javascript.jscomp.NodeUtil.arrayToString(node3);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isExprCall(node3);
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        com.google.javascript.rhino.jstype.JSType jSType5 = com.google.javascript.jscomp.NodeUtil.getObjectLitKeyTypeFromValueType(node2, jSType4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isBooleanResultHelper(node2);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node2, "hi!");
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jSType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate6 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int7 = com.google.javascript.jscomp.NodeUtil.getCount(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement5, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate6);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isLabelName(node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node10);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isUndefined(node10);
        boolean boolean14 = matchShallowStatement5.apply(node10);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isLabelName(node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node17);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isUndefined(node17);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isUndefined(node17);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isGet(node17);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate23 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node25);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isLabelName(node26);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node26);
        boolean boolean29 = booleanResultPredicate23.apply(node26);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node26);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isFunction(node26);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler32 = null;
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node26, abstractCompiler32);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node17, node26, "hi!");
        boolean boolean36 = matchShallowStatement5.apply(node17);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.rhino.Node node39 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node38);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isLabelName(node39);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node39);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isUndefined(node39);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isUndefined(node39);
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.rhino.Node node46 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node45);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isLabelName(node46);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node46);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement49 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate50 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int51 = com.google.javascript.jscomp.NodeUtil.getCount(node46, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement49, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate50);
        com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate numbericResultPredicate52 = com.google.javascript.jscomp.NodeUtil.NUMBERIC_RESULT_PREDICATE;
        int int53 = com.google.javascript.jscomp.NodeUtil.getCount(node39, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate50, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) numbericResultPredicate52);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate54 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.rhino.Node node57 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node56);
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.isLabelName(node57);
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node57);
        boolean boolean60 = booleanResultPredicate54.apply(node57);
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node57);
        boolean boolean62 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node57);
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node57);
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node57);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate66 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node68 = null;
        com.google.javascript.rhino.Node node69 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node68);
        boolean boolean70 = com.google.javascript.jscomp.NodeUtil.isLabelName(node69);
        boolean boolean71 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node69);
        boolean boolean72 = booleanResultPredicate66.apply(node69);
        boolean boolean73 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node57, "", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate66);
        boolean boolean74 = numbericResultPredicate52.apply(node57);
        com.google.javascript.rhino.Node node76 = null;
        com.google.javascript.rhino.Node node77 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node76);
        boolean boolean78 = com.google.javascript.jscomp.NodeUtil.isLabelName(node77);
        boolean boolean79 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node77);
        boolean boolean81 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node77, "hi!");
        com.google.javascript.rhino.JSDocInfo jSDocInfo82 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node77);
        boolean boolean83 = com.google.javascript.jscomp.NodeUtil.mayBeString(node77);
        boolean boolean84 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node57, node77);
        boolean boolean85 = matchShallowStatement5.apply(node77);
        com.google.javascript.rhino.Node node87 = null;
        com.google.javascript.rhino.Node node88 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node87);
        boolean boolean89 = com.google.javascript.jscomp.NodeUtil.isLabelName(node88);
        boolean boolean90 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node88);
        boolean boolean91 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node88);
        boolean boolean92 = com.google.javascript.jscomp.NodeUtil.isCall(node88);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler93 = null;
        boolean boolean94 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node88, abstractCompiler93);
        boolean boolean95 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node88);
        boolean boolean96 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node88);
        boolean boolean97 = matchShallowStatement5.apply(node88);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate23);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(numbericResultPredicate52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(booleanResultPredicate54);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate66);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNull(jSDocInfo82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(node88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
    }
}

