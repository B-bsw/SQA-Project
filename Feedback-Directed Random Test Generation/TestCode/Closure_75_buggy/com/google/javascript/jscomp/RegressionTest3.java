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
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate0 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node3);
        int int8 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node3, "");
        boolean boolean9 = mayBeStringResultPredicate0.apply(node3);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node3);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType jSType7 = com.google.javascript.jscomp.NodeUtil.getObjectLitKeyTypeFromValueType(node2, jSType6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node2);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newVarNode("JSCompiler_renameProperty", node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isNumericResultHelper(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.mayBeStringHelper(node12);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate15 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isLabelName(node18);
        boolean boolean20 = booleanResultPredicate15.apply(node18);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node18);
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node18);
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newExpr(node22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isName(node22);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate25 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isLabelName(node28);
        boolean boolean30 = booleanResultPredicate25.apply(node28);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node28);
        com.google.javascript.rhino.Node node32 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node28);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate34 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int35 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node32, (int) (byte) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate34);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isCall(node32);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate37 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.rhino.Node node40 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node39);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isLabelName(node40);
        boolean boolean42 = booleanResultPredicate37.apply(node40);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.rhino.Node node45 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node44);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node45);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isLhs(node40, node45);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node45);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node32, node45, "");
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate51 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.rhino.Node node54 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node53);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.isLabelName(node54);
        boolean boolean56 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node54);
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node54);
        int int59 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node54, "");
        boolean boolean60 = mayBeStringResultPredicate51.apply(node54);
        com.google.javascript.rhino.Node node62 = null;
        com.google.javascript.rhino.Node node63 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node62);
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.isLabelName(node63);
        boolean boolean65 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node63);
        boolean boolean66 = mayBeStringResultPredicate51.apply(node63);
        boolean boolean67 = com.google.javascript.jscomp.NodeUtil.valueCheck(node32, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate51);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate68 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node70 = null;
        com.google.javascript.rhino.Node node71 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node70);
        boolean boolean72 = com.google.javascript.jscomp.NodeUtil.isLabelName(node71);
        boolean boolean73 = booleanResultPredicate68.apply(node71);
        boolean boolean74 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node71);
        com.google.javascript.rhino.Node node75 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node71);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate77 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int78 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node75, (int) (byte) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate77);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement80 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        int int81 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node75, 15, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement80);
        boolean boolean82 = com.google.javascript.jscomp.NodeUtil.has(node22, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate51, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement80);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType84 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) 'a');
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate85 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node87 = null;
        com.google.javascript.rhino.Node node88 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node87);
        boolean boolean89 = com.google.javascript.jscomp.NodeUtil.isLabelName(node88);
        boolean boolean90 = booleanResultPredicate85.apply(node88);
        boolean boolean91 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node88);
        com.google.javascript.rhino.Node node92 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node88);
        boolean boolean93 = matchNodeType84.apply(node88);
        int int94 = com.google.javascript.jscomp.NodeUtil.getCount(node12, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement80, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType84);
        boolean boolean95 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node2, "JSCompiler_renameProperty", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement80);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(booleanResultPredicate15);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(booleanResultPredicate34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate37);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate51);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate68);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertNotNull(booleanResultPredicate77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate85);
        org.junit.Assert.assertNotNull(node88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(node92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 1 + "'", int94 == 1);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement0 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate1 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isLabelName(node4);
        boolean boolean6 = booleanResultPredicate1.apply(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isNumericResult(node4);
        boolean boolean8 = matchShallowStatement0.apply(node4);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newExpr(node4);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node9, "undefined");
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.containsFunction(node9);
        org.junit.Assert.assertNotNull(booleanResultPredicate1);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate1 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isLabelName(node4);
        boolean boolean6 = booleanResultPredicate1.apply(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node4);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node4);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node4);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate10 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isLabelName(node13);
        boolean boolean15 = booleanResultPredicate10.apply(node13);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node13, node18);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node9, node13);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node13);
        com.google.javascript.rhino.JSDocInfo jSDocInfo23 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node13);
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node13);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isExprCall(node24);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node24);
        org.junit.Assert.assertNotNull(booleanResultPredicate1);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(booleanResultPredicate10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(jSDocInfo23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node2);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue4 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isNew(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(ternaryValue4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration0 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate1 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isLabelName(node4);
        boolean boolean6 = booleanResultPredicate1.apply(node4);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isLhs(node4, node9);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isString(node4);
        boolean boolean13 = matchDeclaration0.apply(node4);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node15);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isLabelName(node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node16);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node16);
        boolean boolean20 = matchDeclaration0.apply(node16);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement21 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate22 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isLabelName(node25);
        boolean boolean27 = booleanResultPredicate22.apply(node25);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isNumericResult(node25);
        boolean boolean29 = matchShallowStatement21.apply(node25);
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newExpr(node25);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue31 = com.google.javascript.jscomp.NodeUtil.getPureBooleanValue(node30);
        java.lang.String str32 = com.google.javascript.jscomp.NodeUtil.getSourceName(node30);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.rhino.Node node36 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node35);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isLabelName(node36);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node36);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isUndefined(node36);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate40 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.rhino.Node node43 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node42);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isLabelName(node43);
        boolean boolean45 = booleanResultPredicate40.apply(node43);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node43);
        com.google.javascript.rhino.Node node47 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node43);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType49 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) 'a');
        com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate numbericResultPredicate50 = new com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate();
        int int51 = com.google.javascript.jscomp.NodeUtil.getCount(node47, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType49, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) numbericResultPredicate50);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate52 = new com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate();
        int int53 = com.google.javascript.jscomp.NodeUtil.getCount(node36, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) numbericResultPredicate50, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate52);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate55 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        com.google.javascript.rhino.Node node57 = null;
        com.google.javascript.rhino.Node node58 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node57);
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.isLabelName(node58);
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node58);
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node58);
        int int63 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node58, "");
        boolean boolean64 = mayBeStringResultPredicate55.apply(node58);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate65 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node67 = null;
        com.google.javascript.rhino.Node node68 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node67);
        boolean boolean69 = com.google.javascript.jscomp.NodeUtil.isLabelName(node68);
        boolean boolean70 = booleanResultPredicate65.apply(node68);
        com.google.javascript.rhino.Node node72 = null;
        com.google.javascript.rhino.Node node73 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node72);
        boolean boolean74 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node73);
        boolean boolean75 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node68, node73);
        boolean boolean76 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node73);
        boolean boolean77 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node73);
        java.lang.String str78 = com.google.javascript.jscomp.NodeUtil.getStringValue(node73);
        boolean boolean79 = com.google.javascript.jscomp.NodeUtil.isBooleanResult(node73);
        boolean boolean80 = mayBeStringResultPredicate55.apply(node73);
        com.google.javascript.rhino.Node node81 = com.google.javascript.jscomp.NodeUtil.newVarNode("JSCompiler_renameProperty", node73);
        boolean boolean82 = mayBeStringResultPredicate52.apply(node73);
        int int83 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node30, (int) (byte) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate52);
        boolean boolean84 = com.google.javascript.jscomp.NodeUtil.containsFunction(node30);
        boolean boolean85 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node16, node30);
        boolean boolean86 = com.google.javascript.jscomp.NodeUtil.isGetProp(node30);
        org.junit.Assert.assertNotNull(booleanResultPredicate1);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(booleanResultPredicate22);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(ternaryValue31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate40);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate55);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(booleanResultPredicate65);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNull(str78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node2);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue4 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node2);
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newExpr(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node6);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(ternaryValue4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = booleanResultPredicate0.apply(node3);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node3, node8);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node8);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node8);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate13 = new com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate();
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.valueCheck(node8, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate13);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate15 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isLabelName(node18);
        boolean boolean20 = booleanResultPredicate15.apply(node18);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node23);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node18, node23);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node23);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node23);
        java.lang.String str28 = com.google.javascript.jscomp.NodeUtil.getStringValue(node23);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node23, "JSCompiler_renameProperty");
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isNumericResult(node23);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isUndefined(node23);
        boolean boolean33 = mayBeStringResultPredicate13.apply(node23);
        java.lang.String str34 = com.google.javascript.jscomp.NodeUtil.getSourceName(node23);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node23);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.referencesThis(node23);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate38 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.rhino.Node node41 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node40);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isLabelName(node41);
        boolean boolean43 = booleanResultPredicate38.apply(node41);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node41);
        com.google.javascript.rhino.Node node45 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node41);
        com.google.javascript.rhino.Node node46 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node41);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate47 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.rhino.Node node50 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node49);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isLabelName(node50);
        boolean boolean52 = booleanResultPredicate47.apply(node50);
        com.google.javascript.rhino.Node node54 = null;
        com.google.javascript.rhino.Node node55 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node54);
        boolean boolean56 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node55);
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node50, node55);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node46, node50);
        com.google.javascript.rhino.Node node59 = com.google.javascript.jscomp.NodeUtil.newExpr(node46);
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.isExprCall(node59);
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node59);
        com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate numbericResultPredicate63 = com.google.javascript.jscomp.NodeUtil.NUMBERIC_RESULT_PREDICATE;
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node59, "", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) numbericResultPredicate63);
        boolean boolean65 = com.google.javascript.jscomp.NodeUtil.valueCheck(node23, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) numbericResultPredicate63);
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(booleanResultPredicate15);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate38);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(booleanResultPredicate47);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(numbericResultPredicate63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = booleanResultPredicate0.apply(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(node3);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.getLoopCodeBlock(node3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isString(node10);
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
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = booleanResultPredicate0.apply(node3);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node3, node8);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node3);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node3);
        java.lang.String str13 = com.google.javascript.jscomp.NodeUtil.getStringValue(node3);
        java.lang.Class<?> wildcardClass14 = node3.getClass();
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = booleanResultPredicate0.apply(node3);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isLhs(node3, node8);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration12 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        int int13 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node3, 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration12);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate14 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isLabelName(node17);
        boolean boolean19 = booleanResultPredicate14.apply(node17);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node17);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node17);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node17);
        boolean boolean23 = matchDeclaration12.apply(node17);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node25);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isLabelName(node26);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node26);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node26);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node31);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node32);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue34 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node32);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node32);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isUndefined(node32);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node26, node32);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.mayBeStringHelper(node32);
        boolean boolean39 = matchDeclaration12.apply(node32);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str40 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(booleanResultPredicate14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(ternaryValue34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = booleanResultPredicate0.apply(node3);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node3, node8);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node8);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isNumericResultHelper(node8);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isLabelName(node8);
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = booleanResultPredicate0.apply(node3);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isLhs(node3, node8);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node8, abstractCompiler11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node8);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node8);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node8);
        com.google.javascript.jscomp.NodeUtil.MatchNotFunction matchNotFunction16 = new com.google.javascript.jscomp.NodeUtil.MatchNotFunction();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate17 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isLabelName(node20);
        boolean boolean22 = booleanResultPredicate17.apply(node20);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node25);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isLhs(node20, node25);
        boolean boolean28 = matchNotFunction16.apply(node20);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate29 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate30 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node32);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isLabelName(node33);
        boolean boolean35 = booleanResultPredicate30.apply(node33);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.rhino.Node node38 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node37);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node38);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node33, node38);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node38);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node38);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate43 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.rhino.Node node46 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node45);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isLabelName(node46);
        boolean boolean48 = booleanResultPredicate43.apply(node46);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.rhino.Node node51 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node50);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node51);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node46, node51);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node51);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.isArrayLiteral(node51);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node38, node51, "hi!");
        boolean boolean58 = booleanResultPredicate29.apply(node38);
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.has(node8, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNotFunction16, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate29);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue60 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node8);
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate17);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(booleanResultPredicate29);
        org.junit.Assert.assertNotNull(booleanResultPredicate30);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
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
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(ternaryValue60);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = booleanResultPredicate0.apply(node3);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isLhs(node3, node8);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node8, abstractCompiler11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isString(node8);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node8, abstractCompiler14);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isBooleanResult(node8);
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newExpr(node8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: VAR is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node2);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isLabelName(node7);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate9 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isLabelName(node12);
        boolean boolean14 = booleanResultPredicate9.apply(node12);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node12, node17);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate20 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isLabelName(node23);
        boolean boolean25 = booleanResultPredicate20.apply(node23);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node23);
        com.google.javascript.rhino.Node[] nodeArray27 = new com.google.javascript.rhino.Node[] { node7, node12, node23 };
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newCallNode(node2, nodeArray27);
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.getArgumentForCallOrNew(node28, 1);
        java.lang.String str31 = com.google.javascript.jscomp.NodeUtil.getSourceName(node30);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(nodeArray27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node2);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate6 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isLabelName(node9);
        boolean boolean11 = booleanResultPredicate6.apply(node9);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node14);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isLhs(node9, node14);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration18 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        int int19 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node9, 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.valueCheck(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration18);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate21 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node23);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isLabelName(node24);
        boolean boolean26 = booleanResultPredicate21.apply(node24);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node24);
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node24);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isThis(node24);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node24);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isGetProp(node24);
        boolean boolean32 = matchDeclaration18.apply(node24);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isNumericResultHelper(node24);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(booleanResultPredicate21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate1 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isLabelName(node4);
        boolean boolean6 = booleanResultPredicate1.apply(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node4);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node4);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node4);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate10 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isLabelName(node13);
        boolean boolean15 = booleanResultPredicate10.apply(node13);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node13, node18);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node9, node13);
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newExpr(node9);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isLabelName(node22);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node22);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.getArgumentForFunction(node22, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanResultPredicate1);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(booleanResultPredicate10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = booleanResultPredicate0.apply(node3);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isLhs(node3, node8);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node8, abstractCompiler11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node8);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node8);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node8);
        com.google.javascript.jscomp.NodeUtil.MatchNotFunction matchNotFunction16 = new com.google.javascript.jscomp.NodeUtil.MatchNotFunction();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate17 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isLabelName(node20);
        boolean boolean22 = booleanResultPredicate17.apply(node20);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node25);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isLhs(node20, node25);
        boolean boolean28 = matchNotFunction16.apply(node20);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate29 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate30 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node32);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isLabelName(node33);
        boolean boolean35 = booleanResultPredicate30.apply(node33);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.rhino.Node node38 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node37);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node38);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node33, node38);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node38);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node38);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate43 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.rhino.Node node46 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node45);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isLabelName(node46);
        boolean boolean48 = booleanResultPredicate43.apply(node46);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.rhino.Node node51 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node50);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node51);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node46, node51);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node51);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.isArrayLiteral(node51);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node38, node51, "hi!");
        boolean boolean58 = booleanResultPredicate29.apply(node38);
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.has(node8, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNotFunction16, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate29);
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node8);
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node8);
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate17);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(booleanResultPredicate29);
        org.junit.Assert.assertNotNull(booleanResultPredicate30);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
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
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("JSCompiler_renameProperty", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isNumericResultHelper(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.mayBeStringHelper(node2);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate5 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isLabelName(node8);
        boolean boolean10 = booleanResultPredicate5.apply(node8);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node8);
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node8);
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newExpr(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isName(node12);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate15 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isLabelName(node18);
        boolean boolean20 = booleanResultPredicate15.apply(node18);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node18);
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node18);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate24 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int25 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node22, (int) (byte) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isCall(node22);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate27 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node29);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isLabelName(node30);
        boolean boolean32 = booleanResultPredicate27.apply(node30);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node34);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node35);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isLhs(node30, node35);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node35);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node22, node35, "");
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate41 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node43);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isLabelName(node44);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node44);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node44);
        int int49 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node44, "");
        boolean boolean50 = mayBeStringResultPredicate41.apply(node44);
        com.google.javascript.rhino.Node node52 = null;
        com.google.javascript.rhino.Node node53 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node52);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.isLabelName(node53);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node53);
        boolean boolean56 = mayBeStringResultPredicate41.apply(node53);
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.valueCheck(node22, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate41);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate58 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node60 = null;
        com.google.javascript.rhino.Node node61 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node60);
        boolean boolean62 = com.google.javascript.jscomp.NodeUtil.isLabelName(node61);
        boolean boolean63 = booleanResultPredicate58.apply(node61);
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node61);
        com.google.javascript.rhino.Node node65 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node61);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate67 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int68 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node65, (int) (byte) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate67);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement70 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        int int71 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node65, 15, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement70);
        boolean boolean72 = com.google.javascript.jscomp.NodeUtil.has(node12, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate41, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement70);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType74 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) 'a');
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate75 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node77 = null;
        com.google.javascript.rhino.Node node78 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node77);
        boolean boolean79 = com.google.javascript.jscomp.NodeUtil.isLabelName(node78);
        boolean boolean80 = booleanResultPredicate75.apply(node78);
        boolean boolean81 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node78);
        com.google.javascript.rhino.Node node82 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node78);
        boolean boolean83 = matchNodeType74.apply(node78);
        int int84 = com.google.javascript.jscomp.NodeUtil.getCount(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement70, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType74);
        com.google.javascript.rhino.Node node86 = null;
        com.google.javascript.rhino.Node node87 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node86);
        boolean boolean88 = com.google.javascript.jscomp.NodeUtil.isLabelName(node87);
        boolean boolean89 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node87);
        boolean boolean90 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node87);
        int int92 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node87, "");
        boolean boolean93 = com.google.javascript.jscomp.NodeUtil.isGet(node87);
        boolean boolean94 = com.google.javascript.jscomp.NodeUtil.containsFunction(node87);
        boolean boolean95 = matchNodeType74.apply(node87);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node96 = com.google.javascript.jscomp.NodeUtil.getAssignedValue(node87);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(booleanResultPredicate5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate15);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(booleanResultPredicate24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate27);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate41);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate58);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNotNull(booleanResultPredicate67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate75);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 1 + "'", int84 == 1);
        org.junit.Assert.assertNotNull(node87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 1 + "'", int92 == 1);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue1 = com.google.javascript.jscomp.NodeUtil.isStrWhiteSpaceChar((int) (byte) 1);
        org.junit.Assert.assertNotNull(ternaryValue1);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node2);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isLabelName(node7);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate9 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isLabelName(node12);
        boolean boolean14 = booleanResultPredicate9.apply(node12);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node12, node17);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate20 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isLabelName(node23);
        boolean boolean25 = booleanResultPredicate20.apply(node23);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node23);
        com.google.javascript.rhino.Node[] nodeArray27 = new com.google.javascript.rhino.Node[] { node7, node12, node23 };
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newCallNode(node2, nodeArray27);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node30);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isLabelName(node31);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node31);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isUndefined(node31);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node31);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isNull(node31);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node2, node31, "^");
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isCall(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(nodeArray27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node2);
        java.lang.String str5 = com.google.javascript.jscomp.NodeUtil.arrayToString(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isNumericResultHelper(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("JSCompiler_renameProperty", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isNumericResultHelper(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.mayBeStringHelper(node2);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate5 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isLabelName(node8);
        boolean boolean10 = booleanResultPredicate5.apply(node8);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node8);
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node8);
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newExpr(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isName(node12);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate15 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isLabelName(node18);
        boolean boolean20 = booleanResultPredicate15.apply(node18);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node18);
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node18);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate24 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int25 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node22, (int) (byte) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isCall(node22);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate27 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node29);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isLabelName(node30);
        boolean boolean32 = booleanResultPredicate27.apply(node30);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node34);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node35);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isLhs(node30, node35);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node35);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node22, node35, "");
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate41 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node43);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isLabelName(node44);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node44);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node44);
        int int49 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node44, "");
        boolean boolean50 = mayBeStringResultPredicate41.apply(node44);
        com.google.javascript.rhino.Node node52 = null;
        com.google.javascript.rhino.Node node53 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node52);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.isLabelName(node53);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node53);
        boolean boolean56 = mayBeStringResultPredicate41.apply(node53);
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.valueCheck(node22, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate41);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate58 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node60 = null;
        com.google.javascript.rhino.Node node61 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node60);
        boolean boolean62 = com.google.javascript.jscomp.NodeUtil.isLabelName(node61);
        boolean boolean63 = booleanResultPredicate58.apply(node61);
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node61);
        com.google.javascript.rhino.Node node65 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node61);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate67 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int68 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node65, (int) (byte) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate67);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement70 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        int int71 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node65, 15, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement70);
        boolean boolean72 = com.google.javascript.jscomp.NodeUtil.has(node12, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate41, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement70);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType74 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) 'a');
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate75 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node77 = null;
        com.google.javascript.rhino.Node node78 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node77);
        boolean boolean79 = com.google.javascript.jscomp.NodeUtil.isLabelName(node78);
        boolean boolean80 = booleanResultPredicate75.apply(node78);
        boolean boolean81 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node78);
        com.google.javascript.rhino.Node node82 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node78);
        boolean boolean83 = matchNodeType74.apply(node78);
        int int84 = com.google.javascript.jscomp.NodeUtil.getCount(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement70, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType74);
        com.google.javascript.rhino.Node node86 = null;
        com.google.javascript.rhino.Node node87 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node86);
        boolean boolean88 = com.google.javascript.jscomp.NodeUtil.isLabelName(node87);
        boolean boolean89 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node87);
        boolean boolean90 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node87);
        int int92 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node87, "");
        boolean boolean93 = com.google.javascript.jscomp.NodeUtil.isGet(node87);
        boolean boolean94 = com.google.javascript.jscomp.NodeUtil.containsFunction(node87);
        boolean boolean95 = matchNodeType74.apply(node87);
        boolean boolean96 = com.google.javascript.jscomp.NodeUtil.isArrayLiteral(node87);
        boolean boolean97 = com.google.javascript.jscomp.NodeUtil.isUndefined(node87);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(booleanResultPredicate5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate15);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(booleanResultPredicate24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate27);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate41);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate58);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNotNull(booleanResultPredicate67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate75);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 1 + "'", int84 == 1);
        org.junit.Assert.assertNotNull(node87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 1 + "'", int92 == 1);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node2);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node10);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue12 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node10);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node10);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate14 = new com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate();
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isLabelName(node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node17);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node21);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isLabelName(node22);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate24 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node26);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isLabelName(node27);
        boolean boolean29 = booleanResultPredicate24.apply(node27);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node31);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node32);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node27, node32);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate35 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.rhino.Node node38 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node37);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isLabelName(node38);
        boolean boolean40 = booleanResultPredicate35.apply(node38);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node38);
        com.google.javascript.rhino.Node[] nodeArray42 = new com.google.javascript.rhino.Node[] { node22, node27, node38 };
        com.google.javascript.rhino.Node node43 = com.google.javascript.jscomp.NodeUtil.newCallNode(node17, nodeArray42);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler44 = null;
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node43, abstractCompiler44);
        boolean boolean46 = mayBeStringResultPredicate14.apply(node43);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.valueCheck(node10, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate14);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate48 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.rhino.Node node51 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node50);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isLabelName(node51);
        boolean boolean53 = booleanResultPredicate48.apply(node51);
        com.google.javascript.rhino.Node node55 = null;
        com.google.javascript.rhino.Node node56 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node55);
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node56);
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node51, node56);
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node51);
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node51);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue61 = com.google.javascript.jscomp.NodeUtil.getPureBooleanValue(node51);
        boolean boolean62 = mayBeStringResultPredicate14.apply(node51);
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.valueCheck(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate14);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(ternaryValue12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate24);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate35);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(nodeArray42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(booleanResultPredicate48);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(ternaryValue61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = booleanResultPredicate0.apply(node3);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isLhs(node3, node8);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node8);
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.rhino.jstype.JSType jSType13 = com.google.javascript.jscomp.NodeUtil.getObjectLitKeyTypeFromValueType(node8, jSType12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isNew(node8);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node8);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate16 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isLabelName(node19);
        boolean boolean21 = booleanResultPredicate16.apply(node19);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node23);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node19, node24);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node24);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node24);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate29 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node31);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isLabelName(node32);
        boolean boolean34 = booleanResultPredicate29.apply(node32);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.rhino.Node node37 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node36);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node37);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node32, node37);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node37);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isArrayLiteral(node37);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node24, node37, "hi!");
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node37);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node37);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node8, node37, "undefined");
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node8);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate50 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node52 = null;
        com.google.javascript.rhino.Node node53 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node52);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.isLabelName(node53);
        boolean boolean55 = booleanResultPredicate50.apply(node53);
        boolean boolean56 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node53);
        com.google.javascript.rhino.Node node57 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node53);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate59 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int60 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node57, (int) (byte) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate59);
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.containsType(node8, 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate59);
        com.google.javascript.rhino.JSDocInfo jSDocInfo62 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node8);
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(jSType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate16);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate29);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate50);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(booleanResultPredicate59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(jSDocInfo62);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = booleanResultPredicate0.apply(node3);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node3, node8);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node8);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node8);
        java.lang.String str13 = com.google.javascript.jscomp.NodeUtil.getStringValue(node8);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isBooleanResult(node8);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.containsType(node8, (int) ' ');
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isBooleanResultHelper(node8);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate19 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node21);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isLabelName(node22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node22);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node22);
        int int27 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node22, "");
        boolean boolean28 = mayBeStringResultPredicate19.apply(node22);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node30);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isLabelName(node31);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node31);
        boolean boolean34 = mayBeStringResultPredicate19.apply(node31);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate35 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate36 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.rhino.Node node39 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node38);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isLabelName(node39);
        boolean boolean41 = booleanResultPredicate36.apply(node39);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node43);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node44);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node39, node44);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node44);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node44);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate49 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.rhino.Node node52 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node51);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.isLabelName(node52);
        boolean boolean54 = booleanResultPredicate49.apply(node52);
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.rhino.Node node57 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node56);
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node57);
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node52, node57);
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node57);
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.isArrayLiteral(node57);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node44, node57, "hi!");
        boolean boolean64 = booleanResultPredicate35.apply(node44);
        boolean boolean65 = com.google.javascript.jscomp.NodeUtil.valueCheck(node31, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate35);
        boolean boolean66 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node8, "||", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate35);
        boolean boolean68 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node8, false);
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate19);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(booleanResultPredicate35);
        org.junit.Assert.assertNotNull(booleanResultPredicate36);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate49);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate1 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isLabelName(node4);
        boolean boolean6 = booleanResultPredicate1.apply(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node4);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node4);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node4);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate10 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isLabelName(node13);
        boolean boolean15 = booleanResultPredicate10.apply(node13);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node13, node18);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node9, node13);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node13);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node13);
        org.junit.Assert.assertNotNull(booleanResultPredicate1);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(booleanResultPredicate10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node2);
        int int7 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node2, "");
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType9 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) 'a');
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate10 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isLabelName(node13);
        boolean boolean15 = booleanResultPredicate10.apply(node13);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node13);
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node13);
        boolean boolean18 = matchNodeType9.apply(node13);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.valueCheck(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType9);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node21);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isLabelName(node22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node22);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node22);
        int int27 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node22, "");
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType29 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) 'a');
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate30 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node32);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isLabelName(node33);
        boolean boolean35 = booleanResultPredicate30.apply(node33);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node33);
        com.google.javascript.rhino.Node node37 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node33);
        boolean boolean38 = matchNodeType29.apply(node33);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.valueCheck(node22, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType29);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate40 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.rhino.Node node43 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node42);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isLabelName(node43);
        boolean boolean45 = booleanResultPredicate40.apply(node43);
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.rhino.Node node48 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node47);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node48);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isLhs(node43, node48);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler51 = null;
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node48, abstractCompiler51);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.isString(node48);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate54 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.rhino.Node node57 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node56);
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.isLabelName(node57);
        boolean boolean59 = booleanResultPredicate54.apply(node57);
        com.google.javascript.rhino.Node node61 = null;
        com.google.javascript.rhino.Node node62 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node61);
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node62);
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node57, node62);
        boolean boolean66 = com.google.javascript.jscomp.NodeUtil.mayBeString(node62, false);
        java.lang.String[] strArray70 = new java.lang.String[] { "hi!", "hi!", "JSCompiler_renameProperty" };
        java.util.LinkedHashSet<java.lang.String> strSet71 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet71, strArray70);
        boolean boolean73 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node62, (java.util.Set<java.lang.String>) strSet71);
        boolean boolean74 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node48, (java.util.Set<java.lang.String>) strSet71);
        boolean boolean75 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node22, (java.util.Set<java.lang.String>) strSet71);
        boolean boolean76 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node2, (java.util.Set<java.lang.String>) strSet71);
        com.google.javascript.rhino.jstype.JSType jSType77 = null;
        com.google.javascript.rhino.jstype.JSType jSType78 = com.google.javascript.jscomp.NodeUtil.getObjectLitKeyTypeFromValueType(node2, jSType77);
        com.google.javascript.rhino.Node node79 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(booleanResultPredicate10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(booleanResultPredicate30);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate40);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate54);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertArrayEquals(strArray70, new java.lang.String[] { "hi!", "hi!", "JSCompiler_renameProperty" });
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNull(jSType78);
        org.junit.Assert.assertNotNull(node79);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isUndefined(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isNull(node2);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.mayBeString(node2);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isLabelName(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node12);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node12);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate16 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isLabelName(node19);
        boolean boolean21 = booleanResultPredicate16.apply(node19);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node23);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isLhs(node19, node24);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration28 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        int int29 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node19, 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration28);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.valueCheck(node12, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration28);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate31 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.rhino.Node node34 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node33);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isLabelName(node34);
        boolean boolean36 = booleanResultPredicate31.apply(node34);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node34);
        com.google.javascript.rhino.Node node38 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node34);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isThis(node34);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node34);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isGetProp(node34);
        boolean boolean42 = matchDeclaration28.apply(node34);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node2, "^", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration28);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate16);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(booleanResultPredicate31);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = booleanResultPredicate0.apply(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node3);
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node3);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate9 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int10 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node7, (int) (byte) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate9);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType12 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) 'a');
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration13 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.has(node7, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType12, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration13);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.getFunctionBody(node7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(booleanResultPredicate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = booleanResultPredicate0.apply(node3);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node3, node8);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node8);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue12 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node8);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node8);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isExprCall(node8);
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(ternaryValue12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate2 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isLabelName(node5);
        boolean boolean7 = booleanResultPredicate2.apply(node5);
        java.lang.String[] strArray9 = new java.lang.String[] { "||" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node5, (java.util.Set<java.lang.String>) strSet10);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node5);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isAssign(node5);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isLabelName(node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node17);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node21);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isLabelName(node22);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate24 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node26);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isLabelName(node27);
        boolean boolean29 = booleanResultPredicate24.apply(node27);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node31);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node32);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node27, node32);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate35 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.rhino.Node node38 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node37);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isLabelName(node38);
        boolean boolean40 = booleanResultPredicate35.apply(node38);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node38);
        com.google.javascript.rhino.Node[] nodeArray42 = new com.google.javascript.rhino.Node[] { node22, node27, node38 };
        com.google.javascript.rhino.Node node43 = com.google.javascript.jscomp.NodeUtil.newCallNode(node17, nodeArray42);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler44 = null;
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node17, abstractCompiler44);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue46 = com.google.javascript.jscomp.NodeUtil.getPureBooleanValue(node17);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.rhino.Node node49 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node48);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isLabelName(node49);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node49);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node49);
        int int54 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node49, "");
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node17, node49, "||");
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node5, node17);
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.isAssign(node5);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node59 = com.google.javascript.jscomp.NodeUtil.newName(codingConvention0, "hi!", node5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanResultPredicate2);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "||" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate24);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate35);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(nodeArray42);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(ternaryValue46);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isTryCatchNodeContainer(node2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.containsFunction(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.containsType(node2, (int) (byte) 100);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node2, abstractCompiler8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isUndefined(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isNull(node2);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isNew(node2);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node2);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(node2);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isLabelName(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node13);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isLabelName(node18);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate20 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isLabelName(node23);
        boolean boolean25 = booleanResultPredicate20.apply(node23);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node28);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node23, node28);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate31 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.rhino.Node node34 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node33);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isLabelName(node34);
        boolean boolean36 = booleanResultPredicate31.apply(node34);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node34);
        com.google.javascript.rhino.Node[] nodeArray38 = new com.google.javascript.rhino.Node[] { node18, node23, node34 };
        com.google.javascript.rhino.Node node39 = com.google.javascript.jscomp.NodeUtil.newCallNode(node13, nodeArray38);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler40 = null;
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node13, abstractCompiler40);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue42 = com.google.javascript.jscomp.NodeUtil.getPureBooleanValue(node13);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isNumericResult(node13);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isArrayLiteral(node13);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node2, node13, "instanceof");
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate31);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(nodeArray38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(ternaryValue42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = booleanResultPredicate0.apply(node3);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node3, node8);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node8);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isArrayLiteral(node8);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isNullOrUndefined(node8);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node8);
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node2);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isLabelName(node7);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate9 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isLabelName(node12);
        boolean boolean14 = booleanResultPredicate9.apply(node12);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node12, node17);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate20 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isLabelName(node23);
        boolean boolean25 = booleanResultPredicate20.apply(node23);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node23);
        com.google.javascript.rhino.Node[] nodeArray27 = new com.google.javascript.rhino.Node[] { node7, node12, node23 };
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newCallNode(node2, nodeArray27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(node2);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newExpr(node2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: new child has existing parent");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(nodeArray27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        com.google.javascript.jscomp.NodeUtil.MatchNotFunction matchNotFunction0 = new com.google.javascript.jscomp.NodeUtil.MatchNotFunction();
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node3);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate7 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isLabelName(node10);
        boolean boolean12 = booleanResultPredicate7.apply(node10);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isNumericResult(node10);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isVar(node10);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node3, node10);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node3);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isExprCall(node3);
        boolean boolean18 = matchNotFunction0.apply(node3);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node3);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isUndefined(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node2);
        com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate numbericResultPredicate7 = new com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate();
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isLabelName(node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node10);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node14);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isLabelName(node15);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate17 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isLabelName(node20);
        boolean boolean22 = booleanResultPredicate17.apply(node20);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node25);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node20, node25);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate28 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node30);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isLabelName(node31);
        boolean boolean33 = booleanResultPredicate28.apply(node31);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node31);
        com.google.javascript.rhino.Node[] nodeArray35 = new com.google.javascript.rhino.Node[] { node15, node20, node31 };
        com.google.javascript.rhino.Node node36 = com.google.javascript.jscomp.NodeUtil.newCallNode(node10, nodeArray35);
        boolean boolean37 = numbericResultPredicate7.apply(node10);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration38 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.has(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) numbericResultPredicate7, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration38);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isExprCall(node2);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node2);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isNull(node2);
        com.google.javascript.rhino.Node node43 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node44 = com.google.javascript.jscomp.NodeUtil.getCatchBlock(node2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate17);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate28);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(nodeArray35);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node43);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = booleanResultPredicate0.apply(node3);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isLhs(node3, node8);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node8);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate12 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node14);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isLabelName(node15);
        boolean boolean17 = booleanResultPredicate12.apply(node15);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node15, node20);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node20);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node20);
        java.lang.String str25 = com.google.javascript.jscomp.NodeUtil.getStringValue(node20);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node20, "JSCompiler_renameProperty");
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isConstantName(node20);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isLhs(node8, node20);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate30 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node32);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isLabelName(node33);
        boolean boolean35 = booleanResultPredicate30.apply(node33);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.rhino.Node node38 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node37);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node38);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node33, node38);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node38);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node38);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate43 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.rhino.Node node46 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node45);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isLabelName(node46);
        boolean boolean48 = booleanResultPredicate43.apply(node46);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.rhino.Node node51 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node50);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node51);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node46, node51);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node51);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.isArrayLiteral(node51);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node38, node51, "hi!");
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node51);
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.isVar(node51);
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node8, node51);
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node51);
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(booleanResultPredicate30);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
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
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node2);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue4 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isUndefined(node2);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node2, false);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isLabelName(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node12);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isUndefined(node12);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node12);
        com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate numbericResultPredicate17 = new com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate();
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isLabelName(node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node20);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isLabelName(node25);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate27 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node29);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isLabelName(node30);
        boolean boolean32 = booleanResultPredicate27.apply(node30);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node34);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node35);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node30, node35);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate38 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.rhino.Node node41 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node40);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isLabelName(node41);
        boolean boolean43 = booleanResultPredicate38.apply(node41);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node41);
        com.google.javascript.rhino.Node[] nodeArray45 = new com.google.javascript.rhino.Node[] { node25, node30, node41 };
        com.google.javascript.rhino.Node node46 = com.google.javascript.jscomp.NodeUtil.newCallNode(node20, nodeArray45);
        boolean boolean47 = numbericResultPredicate17.apply(node20);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration48 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.has(node12, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) numbericResultPredicate17, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration48);
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.rhino.Node node52 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node51);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.isLabelName(node52);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node52);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node52);
        boolean boolean56 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(node52);
        boolean boolean57 = matchDeclaration48.apply(node52);
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.containsType(node2, 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration48);
        java.lang.String str59 = com.google.javascript.jscomp.NodeUtil.getSourceName(node2);
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(ternaryValue4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate27);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate38);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(nodeArray45);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate1 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isLabelName(node4);
        boolean boolean6 = booleanResultPredicate1.apply(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node4);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node4);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newExpr(node8);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newVarNode("instanceof", node8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanResultPredicate1);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node8);
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
        boolean boolean6 = booleanResultPredicate1.apply(node4);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isLhs(node4, node9);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node9, abstractCompiler12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isString(node9);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = null;
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node9, abstractCompiler15);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isBooleanResult(node9);
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newVarNode("^", node9);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node18);
        org.junit.Assert.assertNotNull(booleanResultPredicate1);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node2);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate6 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isLabelName(node9);
        boolean boolean11 = booleanResultPredicate6.apply(node9);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isNumericResult(node9);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isVar(node9);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node2, node9);
        com.google.javascript.jscomp.NodeUtil.MatchNotFunction matchNotFunction16 = new com.google.javascript.jscomp.NodeUtil.MatchNotFunction();
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node9, "undefined", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNotFunction16);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement18 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate19 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node21);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isLabelName(node22);
        boolean boolean24 = booleanResultPredicate19.apply(node22);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isNumericResult(node22);
        boolean boolean26 = matchShallowStatement18.apply(node22);
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newExpr(node22);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue28 = com.google.javascript.jscomp.NodeUtil.getPureBooleanValue(node27);
        java.lang.String str29 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node27);
        boolean boolean30 = matchNotFunction16.apply(node27);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue31 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node27);
        java.lang.String str32 = com.google.javascript.jscomp.NodeUtil.getStringValue(node27);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.google.javascript.jscomp.NodeUtil.newHasLocalResult(node27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate19);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(ternaryValue28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(ternaryValue31);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue1 = com.google.javascript.jscomp.NodeUtil.isStrWhiteSpaceChar((int) (short) 1);
        org.junit.Assert.assertNotNull(ternaryValue1);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate1 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isLabelName(node4);
        boolean boolean6 = booleanResultPredicate1.apply(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node4);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node4);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node4);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate10 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isLabelName(node13);
        boolean boolean15 = booleanResultPredicate10.apply(node13);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node13, node18);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node9, node13);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.referencesThis(node9);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node9);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node9);
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.getLoopCodeBlock(node9);
        org.junit.Assert.assertNotNull(booleanResultPredicate1);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(booleanResultPredicate10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = booleanResultPredicate0.apply(node3);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node3, node8);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node8);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue12 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node8);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node8);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.google.javascript.jscomp.NodeUtil.getOpFromAssignmentOp(node8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Not an assiment op");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(ternaryValue12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = booleanResultPredicate0.apply(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node3);
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node3);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isString(node3);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node3);
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = booleanResultPredicate0.apply(node3);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node3, node8);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node3);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node3);
        com.google.javascript.rhino.JSDocInfo jSDocInfo13 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node3);
        java.lang.String str14 = com.google.javascript.jscomp.NodeUtil.getStringValue(node3);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(node3);
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(jSDocInfo13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("JSCompiler_renameProperty", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isNumericResultHelper(node2);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate6 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isLabelName(node9);
        boolean boolean11 = booleanResultPredicate6.apply(node9);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node9);
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node9);
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node9);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate15 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isLabelName(node18);
        boolean boolean20 = booleanResultPredicate15.apply(node18);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node23);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node18, node23);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node14, node18);
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newExpr(node14);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isExprCall(node27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node27);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate30 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node32);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isLabelName(node33);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node33);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node33);
        int int38 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node33, "");
        boolean boolean39 = mayBeStringResultPredicate30.apply(node33);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.valueCheck(node27, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate30);
        int int41 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node2, (int) 'a', (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate30);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(booleanResultPredicate15);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate30);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node2);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isLabelName(node7);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate9 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isLabelName(node12);
        boolean boolean14 = booleanResultPredicate9.apply(node12);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node12, node17);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate20 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isLabelName(node23);
        boolean boolean25 = booleanResultPredicate20.apply(node23);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node23);
        com.google.javascript.rhino.Node[] nodeArray27 = new com.google.javascript.rhino.Node[] { node7, node12, node23 };
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newCallNode(node2, nodeArray27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node2);
        java.lang.String str30 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node2);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.containsCall(node2);
        com.google.javascript.jscomp.NodeUtil.MatchNotFunction matchNotFunction32 = new com.google.javascript.jscomp.NodeUtil.MatchNotFunction();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate33 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.rhino.Node node36 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node35);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isLabelName(node36);
        boolean boolean38 = booleanResultPredicate33.apply(node36);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.rhino.Node node41 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node40);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node41);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node36, node41);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node41);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node41);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate46 = new com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate();
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.valueCheck(node41, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate46);
        int int48 = com.google.javascript.jscomp.NodeUtil.getCount(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNotFunction32, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate46);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.isArrayLiteral(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(nodeArray27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate33);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2 + "'", int48 == 2);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isSimpleOperatorType((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate1 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isLabelName(node4);
        boolean boolean6 = booleanResultPredicate1.apply(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node4);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node4);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node4);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate10 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isLabelName(node13);
        boolean boolean15 = booleanResultPredicate10.apply(node13);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node13, node18);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node9, node13);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node13);
        com.google.javascript.rhino.JSDocInfo jSDocInfo23 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node13);
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node13);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isExprCall(node24);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.getCatchBlock(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanResultPredicate1);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(booleanResultPredicate10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(jSDocInfo23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isUndefined(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.referencesThis(node2);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection8 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node2);
        com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate numbericResultPredicate9 = new com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate();
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isLabelName(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node12);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isLabelName(node17);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate19 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node21);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isLabelName(node22);
        boolean boolean24 = booleanResultPredicate19.apply(node22);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node26);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node22, node27);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate30 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node32);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isLabelName(node33);
        boolean boolean35 = booleanResultPredicate30.apply(node33);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node33);
        com.google.javascript.rhino.Node[] nodeArray37 = new com.google.javascript.rhino.Node[] { node17, node22, node33 };
        com.google.javascript.rhino.Node node38 = com.google.javascript.jscomp.NodeUtil.newCallNode(node12, nodeArray37);
        boolean boolean39 = numbericResultPredicate9.apply(node12);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.valueCheck(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) numbericResultPredicate9);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.rhino.Node node43 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node42);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isLabelName(node43);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node43);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.containsFunction(node43);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.containsType(node43, (int) (byte) 100);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler49 = null;
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node43, abstractCompiler49);
        boolean boolean51 = numbericResultPredicate9.apply(node43);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node43);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(nodeCollection8);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate19);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate30);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(nodeArray37);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isUndefined(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.mayBeStringHelper(node2);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node2, "||");
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate2 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isLabelName(node5);
        boolean boolean7 = booleanResultPredicate2.apply(node5);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node5, node10);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.mayBeString(node10, false);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node10, true);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(codingConvention0, "hi!", node10, "||");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanResultPredicate2);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = booleanResultPredicate0.apply(node3);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node3, node8);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node8);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node8);
        java.lang.String str13 = com.google.javascript.jscomp.NodeUtil.getStringValue(node8);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isBooleanResult(node8);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node8);
        java.lang.String str16 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node8);
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate1 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isLabelName(node4);
        boolean boolean6 = booleanResultPredicate1.apply(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node4);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node4);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate10 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int11 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node8, (int) (byte) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate10);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement13 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        int int14 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node8, 15, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement13);
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node8);
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node8);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.google.javascript.jscomp.NodeUtil.functionCallHasSideEffects(node8, abstractCompiler17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected CALL node, got VOID");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanResultPredicate1);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(booleanResultPredicate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("JSCompiler_renameProperty", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isNumericResultHelper(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.mayBeStringHelper(node2);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate5 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isLabelName(node8);
        boolean boolean10 = booleanResultPredicate5.apply(node8);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node8);
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node8);
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newExpr(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isName(node12);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate15 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isLabelName(node18);
        boolean boolean20 = booleanResultPredicate15.apply(node18);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node18);
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node18);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate24 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int25 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node22, (int) (byte) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isCall(node22);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate27 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node29);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isLabelName(node30);
        boolean boolean32 = booleanResultPredicate27.apply(node30);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node34);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node35);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isLhs(node30, node35);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node35);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node22, node35, "");
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate41 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node43);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isLabelName(node44);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node44);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node44);
        int int49 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node44, "");
        boolean boolean50 = mayBeStringResultPredicate41.apply(node44);
        com.google.javascript.rhino.Node node52 = null;
        com.google.javascript.rhino.Node node53 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node52);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.isLabelName(node53);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node53);
        boolean boolean56 = mayBeStringResultPredicate41.apply(node53);
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.valueCheck(node22, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate41);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate58 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node60 = null;
        com.google.javascript.rhino.Node node61 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node60);
        boolean boolean62 = com.google.javascript.jscomp.NodeUtil.isLabelName(node61);
        boolean boolean63 = booleanResultPredicate58.apply(node61);
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node61);
        com.google.javascript.rhino.Node node65 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node61);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate67 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int68 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node65, (int) (byte) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate67);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement70 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        int int71 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node65, 15, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement70);
        boolean boolean72 = com.google.javascript.jscomp.NodeUtil.has(node12, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate41, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement70);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType74 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) 'a');
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate75 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node77 = null;
        com.google.javascript.rhino.Node node78 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node77);
        boolean boolean79 = com.google.javascript.jscomp.NodeUtil.isLabelName(node78);
        boolean boolean80 = booleanResultPredicate75.apply(node78);
        boolean boolean81 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node78);
        com.google.javascript.rhino.Node node82 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node78);
        boolean boolean83 = matchNodeType74.apply(node78);
        int int84 = com.google.javascript.jscomp.NodeUtil.getCount(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement70, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType74);
        com.google.javascript.rhino.Node node86 = null;
        com.google.javascript.rhino.Node node87 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node86);
        boolean boolean88 = com.google.javascript.jscomp.NodeUtil.isLabelName(node87);
        boolean boolean89 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node87);
        boolean boolean90 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node87);
        int int92 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node87, "");
        boolean boolean93 = com.google.javascript.jscomp.NodeUtil.isGet(node87);
        boolean boolean94 = com.google.javascript.jscomp.NodeUtil.containsFunction(node87);
        boolean boolean95 = matchNodeType74.apply(node87);
        boolean boolean96 = com.google.javascript.jscomp.NodeUtil.isArrayLiteral(node87);
        com.google.javascript.rhino.Node node97 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node87);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(booleanResultPredicate5);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate15);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(booleanResultPredicate24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate27);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate41);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate58);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNotNull(booleanResultPredicate67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate75);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 1 + "'", int84 == 1);
        org.junit.Assert.assertNotNull(node87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 1 + "'", int92 == 1);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertNull(node97);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate1 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isLabelName(node4);
        boolean boolean6 = booleanResultPredicate1.apply(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node4);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node4);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate10 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int11 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node8, (int) (byte) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate10);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement13 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        int int14 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node8, 15, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement13);
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node8);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node8);
        com.google.javascript.rhino.Node node17 = null;
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node8, node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node8);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isName(node8);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate22 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isLabelName(node25);
        boolean boolean27 = booleanResultPredicate22.apply(node25);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node25);
        com.google.javascript.rhino.Node node29 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node25);
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node25);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate31 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.rhino.Node node34 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node33);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isLabelName(node34);
        boolean boolean36 = booleanResultPredicate31.apply(node34);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.rhino.Node node39 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node38);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node39);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node34, node39);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node30, node34);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node34);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node34);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isGet(node34);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node8, node34);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isFunction(node34);
        org.junit.Assert.assertNotNull(booleanResultPredicate1);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(booleanResultPredicate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate22);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(booleanResultPredicate31);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType1 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) '4');
        int int2 = matchNodeType1.type;
        int int3 = matchNodeType1.type;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.containsFunction(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.containsType(node2, (int) (byte) 100);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue8 = com.google.javascript.jscomp.NodeUtil.getPureBooleanValue(node2);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node2);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isBooleanResult(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(ternaryValue8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = booleanResultPredicate0.apply(node3);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isLhs(node3, node8);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration12 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        int int13 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node3, 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration12);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate14 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isLabelName(node17);
        boolean boolean19 = booleanResultPredicate14.apply(node17);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node17);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node17);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node17);
        boolean boolean23 = matchDeclaration12.apply(node17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = com.google.javascript.jscomp.NodeUtil.getFunctionName(node17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(booleanResultPredicate14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node2);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isLabelName(node7);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate9 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isLabelName(node12);
        boolean boolean14 = booleanResultPredicate9.apply(node12);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node12, node17);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate20 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isLabelName(node23);
        boolean boolean25 = booleanResultPredicate20.apply(node23);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node23);
        com.google.javascript.rhino.Node[] nodeArray27 = new com.google.javascript.rhino.Node[] { node7, node12, node23 };
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newCallNode(node2, nodeArray27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node2);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.referencesThis(node2);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node2);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.referencesThis(node2);
        com.google.javascript.rhino.jstype.JSType jSType33 = null;
        com.google.javascript.rhino.jstype.JSType jSType34 = com.google.javascript.jscomp.NodeUtil.getObjectLitKeyTypeFromValueType(node2, jSType33);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(nodeArray27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(jSType34);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = booleanResultPredicate0.apply(node3);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node3, node8);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node8);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isArrayLiteral(node8);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node8);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isLabelName(node8);
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.containsCall(node6);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isLhs(node2, node6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = com.google.javascript.jscomp.NodeUtil.newHasLocalResult(node6);
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
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isUndefined(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.referencesThis(node2);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection8 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node2);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.containsType(node2, 15);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isLabelName(node14);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node14);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isUndefined(node14);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node14);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.referencesThis(node14);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection20 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node14);
        com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate numbericResultPredicate21 = new com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate();
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node23);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isLabelName(node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node24);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node28);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isLabelName(node29);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate31 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.rhino.Node node34 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node33);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isLabelName(node34);
        boolean boolean36 = booleanResultPredicate31.apply(node34);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.rhino.Node node39 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node38);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node39);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node34, node39);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate42 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.rhino.Node node45 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node44);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isLabelName(node45);
        boolean boolean47 = booleanResultPredicate42.apply(node45);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node45);
        com.google.javascript.rhino.Node[] nodeArray49 = new com.google.javascript.rhino.Node[] { node29, node34, node45 };
        com.google.javascript.rhino.Node node50 = com.google.javascript.jscomp.NodeUtil.newCallNode(node24, nodeArray49);
        boolean boolean51 = numbericResultPredicate21.apply(node24);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.valueCheck(node14, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) numbericResultPredicate21);
        int int53 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node2, (int) (short) -1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) numbericResultPredicate21);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.containsCall(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(nodeCollection8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(nodeCollection20);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate31);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate42);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(nodeArray49);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isUndefined(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node2);
        com.google.javascript.rhino.JSDocInfo jSDocInfo7 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node2);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node2);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = com.google.javascript.jscomp.NodeUtil.functionCallHasSideEffects(node2, abstractCompiler9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected CALL node, got VAR");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(jSDocInfo7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = booleanResultPredicate0.apply(node3);
        java.lang.String[] strArray7 = new java.lang.String[] { "||" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node3, (java.util.Set<java.lang.String>) strSet8);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node3);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "||" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(codingConvention0, "||", (-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate1 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isLabelName(node4);
        boolean boolean6 = booleanResultPredicate1.apply(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node4);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node4);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node4);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate10 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isLabelName(node13);
        boolean boolean15 = booleanResultPredicate10.apply(node13);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node13, node18);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node9, node13);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue22 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node9);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node9);
        org.junit.Assert.assertNotNull(booleanResultPredicate1);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(booleanResultPredicate10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(ternaryValue22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = booleanResultPredicate0.apply(node3);
        java.lang.String[] strArray7 = new java.lang.String[] { "||" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node3, (java.util.Set<java.lang.String>) strSet8);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node3);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node3);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isCall(node3);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isExprCall(node3);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate16 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isLabelName(node19);
        boolean boolean21 = booleanResultPredicate16.apply(node19);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node23);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node19, node24);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node24);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node24);
        java.lang.String str29 = com.google.javascript.jscomp.NodeUtil.getStringValue(node24);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate31 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.rhino.Node node34 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node33);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isLabelName(node34);
        boolean boolean36 = booleanResultPredicate31.apply(node34);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node34);
        com.google.javascript.rhino.Node node38 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node34);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate40 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int41 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node38, (int) (byte) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate40);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.containsType(node24, (int) (short) 1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate40);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node3, node24);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isNull(node24);
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "||" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate16);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(booleanResultPredicate31);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(booleanResultPredicate40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = booleanResultPredicate0.apply(node3);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node3, node8);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node8);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isArrayLiteral(node8);
        java.lang.Double double13 = com.google.javascript.jscomp.NodeUtil.getNumberValue(node8);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node8);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node8, false);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.mayBeStringHelper(node8);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node8);
        java.lang.String str19 = com.google.javascript.jscomp.NodeUtil.arrayToString(node8);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node8);
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(double13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = booleanResultPredicate0.apply(node3);
        java.lang.String[] strArray7 = new java.lang.String[] { "||" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node3, (java.util.Set<java.lang.String>) strSet8);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node3);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node3);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isCall(node3);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isExprCall(node3);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate16 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isLabelName(node19);
        boolean boolean21 = booleanResultPredicate16.apply(node19);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node23);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node19, node24);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node24);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node24);
        java.lang.String str29 = com.google.javascript.jscomp.NodeUtil.getStringValue(node24);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate31 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.rhino.Node node34 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node33);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isLabelName(node34);
        boolean boolean36 = booleanResultPredicate31.apply(node34);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node34);
        com.google.javascript.rhino.Node node38 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node34);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate40 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int41 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node38, (int) (byte) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate40);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.containsType(node24, (int) (short) 1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate40);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node3, node24);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate44 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.rhino.Node node47 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node46);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isLabelName(node47);
        boolean boolean49 = booleanResultPredicate44.apply(node47);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isNumericResult(node47);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node47);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node47);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.isNumericResult(node47);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node47, false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.NodeUtil.removeChild(node24, node47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "||" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate16);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(booleanResultPredicate31);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(booleanResultPredicate40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate44);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate0 = new com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate();
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node3);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isLabelName(node8);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate10 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isLabelName(node13);
        boolean boolean15 = booleanResultPredicate10.apply(node13);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node13, node18);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate21 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node23);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isLabelName(node24);
        boolean boolean26 = booleanResultPredicate21.apply(node24);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node24);
        com.google.javascript.rhino.Node[] nodeArray28 = new com.google.javascript.rhino.Node[] { node8, node13, node24 };
        com.google.javascript.rhino.Node node29 = com.google.javascript.jscomp.NodeUtil.newCallNode(node3, nodeArray28);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node29, "hi!");
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isForIn(node29);
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.getLoopCodeBlock(node29);
        boolean boolean34 = mayBeStringResultPredicate0.apply(node29);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.NodeUtil.maybeAddFinally(node29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(nodeArray28);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate1 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isLabelName(node4);
        boolean boolean6 = booleanResultPredicate1.apply(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node4);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node4);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node8);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newVarNode("JSCompiler_renameProperty", node8);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node8);
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.getLoopCodeBlock(node8);
        org.junit.Assert.assertNotNull(booleanResultPredicate1);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = booleanResultPredicate0.apply(node3);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node3, node8);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node8);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node8);
        java.lang.String str13 = com.google.javascript.jscomp.NodeUtil.getStringValue(node8);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node8, "JSCompiler_renameProperty");
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isNumericResult(node8);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node8);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.containsCall(node8);
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node2);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue4 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isNew(node2);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement6 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate7 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isLabelName(node10);
        boolean boolean12 = booleanResultPredicate7.apply(node10);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isNumericResult(node10);
        boolean boolean14 = matchShallowStatement6.apply(node10);
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newExpr(node10);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue16 = com.google.javascript.jscomp.NodeUtil.getPureBooleanValue(node15);
        java.lang.String str17 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node15);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node15);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler19 = null;
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node15, abstractCompiler19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isLhs(node2, node15);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.containsFunction(node15);
        java.lang.String str23 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node15);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(ternaryValue4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(ternaryValue16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node2);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isLabelName(node7);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate9 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isLabelName(node12);
        boolean boolean14 = booleanResultPredicate9.apply(node12);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node12, node17);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate20 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isLabelName(node23);
        boolean boolean25 = booleanResultPredicate20.apply(node23);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node23);
        com.google.javascript.rhino.Node[] nodeArray27 = new com.google.javascript.rhino.Node[] { node7, node12, node23 };
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newCallNode(node2, nodeArray27);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node28, "hi!");
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isForIn(node28);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isNumericResultHelper(node28);
        java.lang.String[] strArray36 = new java.lang.String[] { "undefined", "undefined", "^" };
        java.util.LinkedHashSet<java.lang.String> strSet37 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet37, strArray36);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node28, (java.util.Set<java.lang.String>) strSet37);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(nodeArray27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "undefined", "undefined", "^" });
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node2);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue4 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isUndefined(node2);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node2, abstractCompiler7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(node2);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isFunction(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(ternaryValue4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        com.google.javascript.rhino.Node node0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate1 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isLabelName(node4);
        boolean boolean6 = booleanResultPredicate1.apply(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node4);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node4);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate10 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int11 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node8, (int) (byte) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate10);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement13 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        int int14 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node8, 15, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement13);
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node8);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node8);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node8);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node8);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate20 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isLabelName(node23);
        boolean boolean25 = booleanResultPredicate20.apply(node23);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node23);
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node23);
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node23);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate29 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node31);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isLabelName(node32);
        boolean boolean34 = booleanResultPredicate29.apply(node32);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.rhino.Node node37 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node36);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node37);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node32, node37);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node28, node32);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node8, node32);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.NodeUtil.maybeAddFinally(node32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanResultPredicate1);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(booleanResultPredicate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(booleanResultPredicate29);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        com.google.javascript.jscomp.NodeUtil.MatchNotFunction matchNotFunction0 = new com.google.javascript.jscomp.NodeUtil.MatchNotFunction();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate1 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isLabelName(node4);
        boolean boolean6 = booleanResultPredicate1.apply(node4);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node4, node9);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node9);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node9);
        java.lang.String str14 = com.google.javascript.jscomp.NodeUtil.getStringValue(node9);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node9, "JSCompiler_renameProperty");
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isConstantName(node9);
        boolean boolean18 = matchNotFunction0.apply(node9);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node21);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue23 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node21);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node21);
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newExpr(node21);
        boolean boolean26 = matchNotFunction0.apply(node21);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate27 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node29);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isLabelName(node30);
        boolean boolean32 = booleanResultPredicate27.apply(node30);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node34);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node35);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isLhs(node30, node35);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node35);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node35);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node35);
        boolean boolean41 = matchNotFunction0.apply(node35);
        org.junit.Assert.assertNotNull(booleanResultPredicate1);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(ternaryValue23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(booleanResultPredicate27);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isUndefined(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isNull(node2);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isNew(node2);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node2);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isNumericResultHelper(node2);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node2, false);
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = booleanResultPredicate0.apply(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node3);
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node3);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate9 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int10 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node7, (int) (byte) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate9);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType12 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) 'a');
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration13 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.has(node7, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType12, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node7);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node7);
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(booleanResultPredicate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node2);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isLabelName(node7);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate9 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isLabelName(node12);
        boolean boolean14 = booleanResultPredicate9.apply(node12);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node12, node17);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate20 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isLabelName(node23);
        boolean boolean25 = booleanResultPredicate20.apply(node23);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node23);
        com.google.javascript.rhino.Node[] nodeArray27 = new com.google.javascript.rhino.Node[] { node7, node12, node23 };
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newCallNode(node2, nodeArray27);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node28, "hi!");
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isForIn(node28);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isNumericResultHelper(node28);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node28);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(nodeArray27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = booleanResultPredicate0.apply(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node3);
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isThis(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node3);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node12);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isLabelName(node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node17);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isUndefined(node17);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node17);
        com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate numbericResultPredicate22 = new com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate();
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isLabelName(node25);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node25);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node29);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isLabelName(node30);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate32 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node34);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isLabelName(node35);
        boolean boolean37 = booleanResultPredicate32.apply(node35);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.rhino.Node node40 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node39);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node40);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node35, node40);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate43 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.rhino.Node node46 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node45);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isLabelName(node46);
        boolean boolean48 = booleanResultPredicate43.apply(node46);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node46);
        com.google.javascript.rhino.Node[] nodeArray50 = new com.google.javascript.rhino.Node[] { node30, node35, node46 };
        com.google.javascript.rhino.Node node51 = com.google.javascript.jscomp.NodeUtil.newCallNode(node25, nodeArray50);
        boolean boolean52 = numbericResultPredicate22.apply(node25);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration53 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.has(node17, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) numbericResultPredicate22, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration53);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node12, node17, "");
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCallOrApply(node17);
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.isGet(node17);
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node3, node17);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler60 = null;
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node17, abstractCompiler60);
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate32);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate43);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(nodeArray50);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = booleanResultPredicate0.apply(node3);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node3, node8);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node8);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isArrayLiteral(node8);
        java.lang.Double double13 = com.google.javascript.jscomp.NodeUtil.getNumberValue(node8);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isVar(node8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.google.javascript.jscomp.NodeUtil.hasFinally(node8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(double13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        com.google.javascript.rhino.Node node0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = booleanResultPredicate0.apply(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node3);
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node3);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate9 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int10 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node7, (int) (byte) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = com.google.javascript.jscomp.NodeUtil.getFunctionName(node7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: NUMBER 0.0 is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(booleanResultPredicate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node2);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate6 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isLabelName(node9);
        boolean boolean11 = booleanResultPredicate6.apply(node9);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isNumericResult(node9);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isVar(node9);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node2, node9);
        java.lang.String str15 = com.google.javascript.jscomp.NodeUtil.arrayToString(node2);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isLabelName(node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node18);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isUndefined(node18);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node18);
        com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate numbericResultPredicate23 = new com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate();
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node25);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isLabelName(node26);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node26);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node30);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isLabelName(node31);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate33 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.rhino.Node node36 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node35);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isLabelName(node36);
        boolean boolean38 = booleanResultPredicate33.apply(node36);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.rhino.Node node41 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node40);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node41);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node36, node41);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate44 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.rhino.Node node47 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node46);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isLabelName(node47);
        boolean boolean49 = booleanResultPredicate44.apply(node47);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node47);
        com.google.javascript.rhino.Node[] nodeArray51 = new com.google.javascript.rhino.Node[] { node31, node36, node47 };
        com.google.javascript.rhino.Node node52 = com.google.javascript.jscomp.NodeUtil.newCallNode(node26, nodeArray51);
        boolean boolean53 = numbericResultPredicate23.apply(node26);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration54 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.has(node18, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) numbericResultPredicate23, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration54);
        boolean boolean56 = com.google.javascript.jscomp.NodeUtil.isExprCall(node18);
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node18);
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.isNull(node18);
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node18);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate60 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        com.google.javascript.rhino.Node node62 = null;
        com.google.javascript.rhino.Node node63 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node62);
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.isLabelName(node63);
        boolean boolean65 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node63);
        boolean boolean66 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node63);
        int int68 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node63, "");
        boolean boolean69 = mayBeStringResultPredicate60.apply(node63);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue70 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node63);
        com.google.javascript.rhino.Node[] nodeArray71 = new com.google.javascript.rhino.Node[] { node18, node63 };
        com.google.javascript.rhino.Node node72 = com.google.javascript.jscomp.NodeUtil.newCallNode(node2, nodeArray71);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node73 = com.google.javascript.jscomp.NodeUtil.getAssignedValue(node2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate33);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate44);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(nodeArray51);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate60);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(ternaryValue70);
        org.junit.Assert.assertNotNull(nodeArray71);
        org.junit.Assert.assertNotNull(node72);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = booleanResultPredicate0.apply(node3);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node3, node8);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.mayBeString(node8, false);
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "JSCompiler_renameProperty" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node8, (java.util.Set<java.lang.String>) strSet17);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node8);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node8);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node23);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isLabelName(node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node24);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node28);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isLabelName(node29);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate31 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.rhino.Node node34 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node33);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isLabelName(node34);
        boolean boolean36 = booleanResultPredicate31.apply(node34);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.rhino.Node node39 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node38);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node39);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node34, node39);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate42 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.rhino.Node node45 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node44);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isLabelName(node45);
        boolean boolean47 = booleanResultPredicate42.apply(node45);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node45);
        com.google.javascript.rhino.Node[] nodeArray49 = new com.google.javascript.rhino.Node[] { node29, node34, node45 };
        com.google.javascript.rhino.Node node50 = com.google.javascript.jscomp.NodeUtil.newCallNode(node24, nodeArray49);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isConstantName(node50);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node8, node50);
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!", "JSCompiler_renameProperty" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate31);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate42);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(nodeArray49);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType jSType7 = com.google.javascript.jscomp.NodeUtil.getObjectLitKeyTypeFromValueType(node2, jSType6);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.getLoopCodeBlock(node2);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isLabelName(node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node11);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node11);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(node11);
        java.lang.String str16 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node11);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isThis(node11);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node2, node11);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = booleanResultPredicate0.apply(node3);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isLhs(node3, node8);
        java.lang.Double double11 = com.google.javascript.jscomp.NodeUtil.getNumberValue(node8);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isBooleanResultHelper(node8);
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(double11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = booleanResultPredicate0.apply(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node3);
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node3);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newExpr(node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node7);
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate2 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isLabelName(node5);
        boolean boolean7 = booleanResultPredicate2.apply(node5);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node5);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node5);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node5);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate11 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isLabelName(node14);
        boolean boolean16 = booleanResultPredicate11.apply(node14);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node14, node19);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node10, node14);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node14);
        com.google.javascript.rhino.JSDocInfo jSDocInfo24 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node14);
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newVarNode("undefined", node14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = com.google.javascript.jscomp.NodeUtil.hasFinally(node25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanResultPredicate2);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(booleanResultPredicate11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(jSDocInfo24);
        org.junit.Assert.assertNotNull(node25);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isUndefined(node2);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate6 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isLabelName(node9);
        boolean boolean11 = booleanResultPredicate6.apply(node9);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node9);
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node9);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType15 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) 'a');
        com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate numbericResultPredicate16 = new com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate();
        int int17 = com.google.javascript.jscomp.NodeUtil.getCount(node13, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType15, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) numbericResultPredicate16);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate18 = new com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate();
        int int19 = com.google.javascript.jscomp.NodeUtil.getCount(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) numbericResultPredicate16, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate18);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate21 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node23);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isLabelName(node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node24);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node24);
        int int29 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node24, "");
        boolean boolean30 = mayBeStringResultPredicate21.apply(node24);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate31 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.rhino.Node node34 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node33);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isLabelName(node34);
        boolean boolean36 = booleanResultPredicate31.apply(node34);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.rhino.Node node39 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node38);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node39);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node34, node39);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node39);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node39);
        java.lang.String str44 = com.google.javascript.jscomp.NodeUtil.getStringValue(node39);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isBooleanResult(node39);
        boolean boolean46 = mayBeStringResultPredicate21.apply(node39);
        com.google.javascript.rhino.Node node47 = com.google.javascript.jscomp.NodeUtil.newVarNode("JSCompiler_renameProperty", node39);
        boolean boolean48 = mayBeStringResultPredicate18.apply(node39);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.isNew(node39);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isBooleanResultHelper(node39);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(booleanResultPredicate31);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate1 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isLabelName(node4);
        boolean boolean6 = booleanResultPredicate1.apply(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node4);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node4);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node4);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate10 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isLabelName(node13);
        boolean boolean15 = booleanResultPredicate10.apply(node13);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node13, node18);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node9, node13);
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newExpr(node9);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isBooleanResultHelper(node22);
        java.lang.Double double24 = com.google.javascript.jscomp.NodeUtil.getNumberValue(node22);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node22, "||");
        org.junit.Assert.assertNotNull(booleanResultPredicate1);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(booleanResultPredicate10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(double24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        com.google.javascript.jscomp.NodeUtil.MatchNotFunction matchNotFunction1 = new com.google.javascript.jscomp.NodeUtil.MatchNotFunction();
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isLabelName(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node4);
        boolean boolean8 = matchNotFunction1.apply(node4);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node4);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isLabelName(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node12);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isUndefined(node12);
        com.google.javascript.rhino.JSDocInfo jSDocInfo16 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node12);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate17 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isLabelName(node20);
        boolean boolean22 = booleanResultPredicate17.apply(node20);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node20);
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node20);
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node20);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node12, node20);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.containsType(node12, (int) (short) 0);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(node12);
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node12);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isLhs(node4, node12);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isBooleanResult(node12);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node12);
        java.lang.String str34 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node12);
        java.lang.String str35 = com.google.javascript.jscomp.NodeUtil.arrayToString(node12);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(jSDocInfo16);
        org.junit.Assert.assertNotNull(booleanResultPredicate17);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.containsCall(node6);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isLhs(node2, node6);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node2);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node2, "||");
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = com.google.javascript.jscomp.NodeUtil.containsCall(node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate1 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isLabelName(node4);
        boolean boolean6 = booleanResultPredicate1.apply(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node4);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node4);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node4);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate10 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isLabelName(node13);
        boolean boolean15 = booleanResultPredicate10.apply(node13);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node13, node18);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node9, node13);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node13);
        com.google.javascript.rhino.JSDocInfo jSDocInfo23 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node13);
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node13);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate25 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isLabelName(node28);
        boolean boolean30 = booleanResultPredicate25.apply(node28);
        java.lang.String[] strArray32 = new java.lang.String[] { "||" };
        java.util.LinkedHashSet<java.lang.String> strSet33 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet33, strArray32);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node28, (java.util.Set<java.lang.String>) strSet33);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node24, (java.util.Set<java.lang.String>) strSet33);
        com.google.javascript.rhino.JSDocInfo jSDocInfo37 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node24);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node24, "instanceof");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler40 = null;
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node24, abstractCompiler40);
        org.junit.Assert.assertNotNull(booleanResultPredicate1);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(booleanResultPredicate10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(jSDocInfo23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(booleanResultPredicate25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "||" });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(jSDocInfo37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate1 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isLabelName(node4);
        boolean boolean6 = booleanResultPredicate1.apply(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node4);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node4);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node4);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate10 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isLabelName(node13);
        boolean boolean15 = booleanResultPredicate10.apply(node13);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node13, node18);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node9, node13);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node9);
        org.junit.Assert.assertNotNull(booleanResultPredicate1);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(booleanResultPredicate10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node2);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node8);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue10 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node8);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node8);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isUndefined(node8);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node2, node8);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isFunction(node8);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isBooleanResult(node8);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(ternaryValue10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate0 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node3);
        int int8 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node3, "");
        boolean boolean9 = mayBeStringResultPredicate0.apply(node3);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isLabelName(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node12);
        boolean boolean15 = mayBeStringResultPredicate0.apply(node12);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate16 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate17 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isLabelName(node20);
        boolean boolean22 = booleanResultPredicate17.apply(node20);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node25);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node20, node25);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node25);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node25);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate30 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node32);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isLabelName(node33);
        boolean boolean35 = booleanResultPredicate30.apply(node33);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.rhino.Node node38 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node37);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node38);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node33, node38);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node38);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isArrayLiteral(node38);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node25, node38, "hi!");
        boolean boolean45 = booleanResultPredicate16.apply(node25);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.valueCheck(node12, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate16);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isBooleanResultHelper(node12);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.NodeUtil.maybeAddFinally(node12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(booleanResultPredicate16);
        org.junit.Assert.assertNotNull(booleanResultPredicate17);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate30);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = booleanResultPredicate0.apply(node3);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node3, node8);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node8);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node8);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate13 = new com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate();
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.valueCheck(node8, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate13);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate15 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isLabelName(node18);
        boolean boolean20 = booleanResultPredicate15.apply(node18);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node23);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node18, node23);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node23);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node23);
        java.lang.String str28 = com.google.javascript.jscomp.NodeUtil.getStringValue(node23);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node23, "JSCompiler_renameProperty");
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isNumericResult(node23);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isUndefined(node23);
        boolean boolean33 = mayBeStringResultPredicate13.apply(node23);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isBooleanResult(node23);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node23);
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(booleanResultPredicate15);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = booleanResultPredicate0.apply(node3);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node3, node8);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node8);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node8);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate13 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node15);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isLabelName(node16);
        boolean boolean18 = booleanResultPredicate13.apply(node16);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node21);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node16, node21);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node21);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isArrayLiteral(node21);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node8, node21, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = com.google.javascript.jscomp.NodeUtil.newHasLocalResult(node21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = booleanResultPredicate0.apply(node3);
        java.lang.String[] strArray7 = new java.lang.String[] { "||" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node3, (java.util.Set<java.lang.String>) strSet8);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node3);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node3);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node3, "%=");
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node3);
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "||" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = booleanResultPredicate0.apply(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node3);
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node3);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate9 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int10 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node7, (int) (byte) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node7);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isVar(node7);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node7);
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(booleanResultPredicate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        java.lang.Double double1 = com.google.javascript.jscomp.NodeUtil.getStringNumberValue("typeof");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = booleanResultPredicate0.apply(node3);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node3, node8);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node8);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isArrayLiteral(node8);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node8, abstractCompiler13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.containsFunction(node8);
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement0 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate1 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isLabelName(node4);
        boolean boolean6 = booleanResultPredicate1.apply(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isNumericResult(node4);
        boolean boolean8 = matchShallowStatement0.apply(node4);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newExpr(node4);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue10 = com.google.javascript.jscomp.NodeUtil.getPureBooleanValue(node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node9);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isBooleanResult(node9);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isAssign(node9);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node9);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.containsType(node9, 15);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isCall(node9);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node9);
        org.junit.Assert.assertNotNull(booleanResultPredicate1);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(ternaryValue10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node2);
        int int7 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node2, "");
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType9 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) 'a');
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate10 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isLabelName(node13);
        boolean boolean15 = booleanResultPredicate10.apply(node13);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node13);
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node13);
        boolean boolean18 = matchNodeType9.apply(node13);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.valueCheck(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType9);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node21);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isLabelName(node22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node22);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node22);
        int int27 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node22, "");
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType29 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) 'a');
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate30 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node32);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isLabelName(node33);
        boolean boolean35 = booleanResultPredicate30.apply(node33);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node33);
        com.google.javascript.rhino.Node node37 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node33);
        boolean boolean38 = matchNodeType29.apply(node33);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.valueCheck(node22, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType29);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate40 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.rhino.Node node43 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node42);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isLabelName(node43);
        boolean boolean45 = booleanResultPredicate40.apply(node43);
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.rhino.Node node48 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node47);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node48);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isLhs(node43, node48);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler51 = null;
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node48, abstractCompiler51);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.isString(node48);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate54 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.rhino.Node node57 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node56);
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.isLabelName(node57);
        boolean boolean59 = booleanResultPredicate54.apply(node57);
        com.google.javascript.rhino.Node node61 = null;
        com.google.javascript.rhino.Node node62 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node61);
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node62);
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node57, node62);
        boolean boolean66 = com.google.javascript.jscomp.NodeUtil.mayBeString(node62, false);
        java.lang.String[] strArray70 = new java.lang.String[] { "hi!", "hi!", "JSCompiler_renameProperty" };
        java.util.LinkedHashSet<java.lang.String> strSet71 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet71, strArray70);
        boolean boolean73 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node62, (java.util.Set<java.lang.String>) strSet71);
        boolean boolean74 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node48, (java.util.Set<java.lang.String>) strSet71);
        boolean boolean75 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node22, (java.util.Set<java.lang.String>) strSet71);
        boolean boolean76 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node2, (java.util.Set<java.lang.String>) strSet71);
        com.google.javascript.rhino.jstype.JSType jSType77 = null;
        com.google.javascript.rhino.jstype.JSType jSType78 = com.google.javascript.jscomp.NodeUtil.getObjectLitKeyTypeFromValueType(node2, jSType77);
        boolean boolean80 = com.google.javascript.jscomp.NodeUtil.mayBeString(node2, true);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(booleanResultPredicate10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(booleanResultPredicate30);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate40);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate54);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertArrayEquals(strArray70, new java.lang.String[] { "hi!", "hi!", "JSCompiler_renameProperty" });
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNull(jSType78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node2);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate6 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isLabelName(node9);
        boolean boolean11 = booleanResultPredicate6.apply(node9);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isNumericResult(node9);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isVar(node9);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node2, node9);
        com.google.javascript.jscomp.NodeUtil.MatchNotFunction matchNotFunction16 = new com.google.javascript.jscomp.NodeUtil.MatchNotFunction();
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node9, "undefined", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNotFunction16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isConstantName(node9);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node9);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = booleanResultPredicate0.apply(node3);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isLhs(node3, node8);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node3, abstractCompiler11);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue13 = com.google.javascript.jscomp.NodeUtil.getPureBooleanValue(node3);
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(ternaryValue13);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.containsCall(node6);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isLhs(node2, node6);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        com.google.javascript.jscomp.NodeUtil.MatchNotFunction matchNotFunction0 = new com.google.javascript.jscomp.NodeUtil.MatchNotFunction();
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node3);
        boolean boolean7 = matchNotFunction0.apply(node3);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isLabelName(node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node10);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isUndefined(node10);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node10);
        boolean boolean15 = matchNotFunction0.apply(node10);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isLabelName(node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node18);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isUndefined(node18);
        com.google.javascript.rhino.JSDocInfo jSDocInfo22 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node18);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate23 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node25);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isLabelName(node26);
        boolean boolean28 = booleanResultPredicate23.apply(node26);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node26);
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node26);
        com.google.javascript.rhino.Node node31 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node26);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node18, node26);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isGet(node18);
        boolean boolean34 = matchNotFunction0.apply(node18);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate35 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate36 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.rhino.Node node39 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node38);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isLabelName(node39);
        boolean boolean41 = booleanResultPredicate36.apply(node39);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node43);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node44);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node39, node44);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node44);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node44);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate49 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.rhino.Node node52 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node51);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.isLabelName(node52);
        boolean boolean54 = booleanResultPredicate49.apply(node52);
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.rhino.Node node57 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node56);
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node57);
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node52, node57);
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node57);
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.isArrayLiteral(node57);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node44, node57, "hi!");
        boolean boolean64 = booleanResultPredicate35.apply(node44);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler65 = null;
        boolean boolean66 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node44, abstractCompiler65);
        boolean boolean67 = matchNotFunction0.apply(node44);
        boolean boolean68 = com.google.javascript.jscomp.NodeUtil.isCall(node44);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(jSDocInfo22);
        org.junit.Assert.assertNotNull(booleanResultPredicate23);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(booleanResultPredicate35);
        org.junit.Assert.assertNotNull(booleanResultPredicate36);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate49);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = booleanResultPredicate0.apply(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node3);
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node3);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate9 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int10 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node7, (int) (byte) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isConstantName(node7);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node7);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isString(node7);
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(booleanResultPredicate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isUndefined(node2);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate6 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isLabelName(node9);
        boolean boolean11 = booleanResultPredicate6.apply(node9);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node9);
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node9);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType15 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) 'a');
        com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate numbericResultPredicate16 = new com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate();
        int int17 = com.google.javascript.jscomp.NodeUtil.getCount(node13, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType15, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) numbericResultPredicate16);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate18 = new com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate();
        int int19 = com.google.javascript.jscomp.NodeUtil.getCount(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) numbericResultPredicate16, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate18);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate20 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isLabelName(node23);
        boolean boolean25 = booleanResultPredicate20.apply(node23);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node23);
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node23);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isThis(node23);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node23);
        boolean boolean30 = mayBeStringResultPredicate18.apply(node23);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement31 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate32 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node34);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isLabelName(node35);
        boolean boolean37 = booleanResultPredicate32.apply(node35);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isNumericResult(node35);
        boolean boolean39 = matchShallowStatement31.apply(node35);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.mayBeString(node35, true);
        boolean boolean42 = mayBeStringResultPredicate18.apply(node35);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isUndefined(node35);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate44 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.rhino.Node node47 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node46);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isLabelName(node47);
        boolean boolean49 = booleanResultPredicate44.apply(node47);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isNumericResult(node47);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node47);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node47);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.isNumericResult(node47);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node47);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node35, node47);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(booleanResultPredicate20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(booleanResultPredicate32);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate44);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = booleanResultPredicate0.apply(node3);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node3, node8);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node8);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isArrayLiteral(node8);
        java.lang.Double double13 = com.google.javascript.jscomp.NodeUtil.getNumberValue(node8);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isVar(node8);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node8, true);
        java.lang.String str17 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node8);
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(double13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.containsFunction(node2);
        java.lang.String str6 = com.google.javascript.jscomp.NodeUtil.getStringValue(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node2);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node10);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue12 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node10);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node10);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isUndefined(node10);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = null;
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node10, abstractCompiler15);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(node10);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isLabelName(node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node20);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isUndefined(node20);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node20);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.mayBeStringHelper(node20);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node20);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isThis(node20);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isNullOrUndefined(node20);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node30);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isLabelName(node31);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node31);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node31);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.rhino.Node node37 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node36);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node37);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue39 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node37);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node37);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isUndefined(node37);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node31, node37);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.mayBeStringHelper(node37);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate44 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.rhino.Node node47 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node46);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isLabelName(node47);
        boolean boolean49 = booleanResultPredicate44.apply(node47);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isGet(node47);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate51 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.rhino.Node node54 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node53);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.isLabelName(node54);
        boolean boolean56 = booleanResultPredicate51.apply(node54);
        com.google.javascript.rhino.Node node58 = null;
        com.google.javascript.rhino.Node node59 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node58);
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node59);
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node54, node59);
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.mayBeString(node59, false);
        java.lang.String[] strArray67 = new java.lang.String[] { "hi!", "hi!", "JSCompiler_renameProperty" };
        java.util.LinkedHashSet<java.lang.String> strSet68 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet68, strArray67);
        boolean boolean70 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node59, (java.util.Set<java.lang.String>) strSet68);
        boolean boolean71 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node47, (java.util.Set<java.lang.String>) strSet68);
        boolean boolean72 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node37, (java.util.Set<java.lang.String>) strSet68);
        boolean boolean73 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node20, (java.util.Set<java.lang.String>) strSet68);
        boolean boolean74 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node10, (java.util.Set<java.lang.String>) strSet68);
        boolean boolean75 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node2, (java.util.Set<java.lang.String>) strSet68);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(ternaryValue12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(ternaryValue39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(booleanResultPredicate44);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate51);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertArrayEquals(strArray67, new java.lang.String[] { "hi!", "hi!", "JSCompiler_renameProperty" });
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = booleanResultPredicate0.apply(node3);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isLhs(node3, node8);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration12 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        int int13 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node3, 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node3);
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = booleanResultPredicate0.apply(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node3);
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node7);
        java.lang.String str9 = com.google.javascript.jscomp.NodeUtil.getSourceName(node7);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newExpr(node7);
        int int12 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node10, "undefined");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.google.javascript.jscomp.NodeUtil.functionCallHasSideEffects(node10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected CALL node, got EXPR_RESULT");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isUndefined(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.mayBeStringHelper(node2);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        java.lang.String str9 = com.google.javascript.jscomp.NodeUtil.getStringValue(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.containsCall(node6);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isLhs(node2, node6);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate10 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate11 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isLabelName(node14);
        boolean boolean16 = booleanResultPredicate11.apply(node14);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node14, node19);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node19);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node19);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate24 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node26);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isLabelName(node27);
        boolean boolean29 = booleanResultPredicate24.apply(node27);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node31);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node32);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node27, node32);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node32);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isArrayLiteral(node32);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node19, node32, "hi!");
        boolean boolean39 = booleanResultPredicate10.apply(node19);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler40 = null;
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node19, abstractCompiler40);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.NodeUtil.removeChild(node2, node19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(booleanResultPredicate10);
        org.junit.Assert.assertNotNull(booleanResultPredicate11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate24);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node2);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue4 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node2);
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isNew(node2);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.referencesThis(node2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = com.google.javascript.jscomp.NodeUtil.hasFinally(node2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(ternaryValue4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSDocInfo6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node2);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isLabelName(node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node7);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isUndefined(node7);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node7);
        com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate numbericResultPredicate12 = new com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate();
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node14);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isLabelName(node15);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node15);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isLabelName(node20);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate22 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isLabelName(node25);
        boolean boolean27 = booleanResultPredicate22.apply(node25);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node29);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node30);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node25, node30);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate33 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.rhino.Node node36 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node35);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isLabelName(node36);
        boolean boolean38 = booleanResultPredicate33.apply(node36);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node36);
        com.google.javascript.rhino.Node[] nodeArray40 = new com.google.javascript.rhino.Node[] { node20, node25, node36 };
        com.google.javascript.rhino.Node node41 = com.google.javascript.jscomp.NodeUtil.newCallNode(node15, nodeArray40);
        boolean boolean42 = numbericResultPredicate12.apply(node15);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration43 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.has(node7, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) numbericResultPredicate12, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration43);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node2, node7, "");
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node2);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isFunction(node2);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler49 = null;
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node2, abstractCompiler49);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate22);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate33);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(nodeArray40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = booleanResultPredicate0.apply(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node3);
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node3);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node3);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate10 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isLabelName(node13);
        boolean boolean15 = booleanResultPredicate10.apply(node13);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node13, node18);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.mayBeString(node18, false);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "hi!", "JSCompiler_renameProperty" };
        java.util.LinkedHashSet<java.lang.String> strSet27 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet27, strArray26);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node18, (java.util.Set<java.lang.String>) strSet27);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node31);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isLabelName(node32);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node32);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isUndefined(node32);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate36 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.rhino.Node node39 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node38);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isLabelName(node39);
        boolean boolean41 = booleanResultPredicate36.apply(node39);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node39);
        com.google.javascript.rhino.Node node43 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node39);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType45 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) 'a');
        com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate numbericResultPredicate46 = new com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate();
        int int47 = com.google.javascript.jscomp.NodeUtil.getCount(node43, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType45, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) numbericResultPredicate46);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate48 = new com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate();
        int int49 = com.google.javascript.jscomp.NodeUtil.getCount(node32, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) numbericResultPredicate46, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate48);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.valueCheck(node18, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate48);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node3, "hi!", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate48);
        com.google.javascript.rhino.jstype.JSType jSType52 = null;
        com.google.javascript.rhino.jstype.JSType jSType53 = com.google.javascript.jscomp.NodeUtil.getObjectLitKeyTypeFromValueType(node3, jSType52);
        com.google.javascript.rhino.Node node54 = com.google.javascript.jscomp.NodeUtil.newExpr(node3);
        java.lang.Double double55 = com.google.javascript.jscomp.NodeUtil.getNumberValue(node3);
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(booleanResultPredicate10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "hi!", "hi!", "JSCompiler_renameProperty" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate36);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(jSType53);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNull(double55);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate2 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isLabelName(node5);
        boolean boolean7 = booleanResultPredicate2.apply(node5);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node5);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node5);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node5);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate11 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isLabelName(node14);
        boolean boolean16 = booleanResultPredicate11.apply(node14);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node14, node19);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node10, node14);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate23 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node25);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isLabelName(node26);
        boolean boolean28 = booleanResultPredicate23.apply(node26);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node30);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node31);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node26, node31);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node31);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isArrayLiteral(node31);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node31);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node14, node31);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate39 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.rhino.Node node42 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node41);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isLabelName(node42);
        boolean boolean44 = booleanResultPredicate39.apply(node42);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.rhino.Node node47 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node46);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node47);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node42, node47);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node47);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node47);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate52 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node54 = null;
        com.google.javascript.rhino.Node node55 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node54);
        boolean boolean56 = com.google.javascript.jscomp.NodeUtil.isLabelName(node55);
        boolean boolean57 = booleanResultPredicate52.apply(node55);
        com.google.javascript.rhino.Node node59 = null;
        com.google.javascript.rhino.Node node60 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node59);
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node60);
        boolean boolean62 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node55, node60);
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node60);
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.isArrayLiteral(node60);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node47, node60, "hi!");
        boolean boolean67 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node47);
        com.google.javascript.rhino.Node node68 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node47);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node14, node68, "");
        com.google.javascript.rhino.Node node71 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node14);
        org.junit.Assert.assertNotNull(booleanResultPredicate2);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(booleanResultPredicate11);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate23);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate39);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate52);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertNotNull(node71);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node3);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue5 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node3);
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newVarNode("JSCompiler_renameProperty", node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.mayBeString(node3);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType jSType10 = com.google.javascript.jscomp.NodeUtil.getObjectLitKeyTypeFromValueType(node3, jSType9);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(ternaryValue5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(jSType10);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate0 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node3);
        int int8 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node3, "");
        boolean boolean9 = mayBeStringResultPredicate0.apply(node3);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isLabelName(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node12);
        boolean boolean15 = mayBeStringResultPredicate0.apply(node12);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate16 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate17 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isLabelName(node20);
        boolean boolean22 = booleanResultPredicate17.apply(node20);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node25);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node20, node25);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node25);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node25);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate30 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node32);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isLabelName(node33);
        boolean boolean35 = booleanResultPredicate30.apply(node33);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.rhino.Node node38 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node37);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node38);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node33, node38);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node38);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isArrayLiteral(node38);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node25, node38, "hi!");
        boolean boolean45 = booleanResultPredicate16.apply(node25);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.valueCheck(node12, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate16);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node12);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isExprCall(node12);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(booleanResultPredicate16);
        org.junit.Assert.assertNotNull(booleanResultPredicate17);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate30);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = booleanResultPredicate0.apply(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node3);
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node3);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node3);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isBooleanResultHelper(node3);
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType1 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType(2);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate2 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isLabelName(node5);
        boolean boolean7 = booleanResultPredicate2.apply(node5);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node5);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node5);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isThis(node5);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node5);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isConstantName(node5);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isVar(node5);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node5);
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node5);
        boolean boolean16 = matchNodeType1.apply(node5);
        org.junit.Assert.assertNotNull(booleanResultPredicate2);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(jSDocInfo15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement0 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate1 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isLabelName(node4);
        boolean boolean6 = booleanResultPredicate1.apply(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isNumericResult(node4);
        boolean boolean8 = matchShallowStatement0.apply(node4);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newExpr(node4);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue10 = com.google.javascript.jscomp.NodeUtil.getPureBooleanValue(node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node9);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node9);
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newExpr(node9);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node13, abstractCompiler14);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isForIn(node13);
        org.junit.Assert.assertNotNull(booleanResultPredicate1);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(ternaryValue10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate0 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node3);
        int int8 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node3, "");
        boolean boolean9 = mayBeStringResultPredicate0.apply(node3);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isLabelName(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node12);
        boolean boolean15 = mayBeStringResultPredicate0.apply(node12);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate16 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate17 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isLabelName(node20);
        boolean boolean22 = booleanResultPredicate17.apply(node20);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node25);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node20, node25);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node25);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node25);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate30 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node32);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isLabelName(node33);
        boolean boolean35 = booleanResultPredicate30.apply(node33);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.rhino.Node node38 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node37);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node38);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node33, node38);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node38);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isArrayLiteral(node38);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node25, node38, "hi!");
        boolean boolean45 = booleanResultPredicate16.apply(node25);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.valueCheck(node12, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate16);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isString(node12);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(booleanResultPredicate16);
        org.junit.Assert.assertNotNull(booleanResultPredicate17);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate30);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate1 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isLabelName(node4);
        boolean boolean6 = booleanResultPredicate1.apply(node4);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node4, node9);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node9);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node9);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate14 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isLabelName(node17);
        boolean boolean19 = booleanResultPredicate14.apply(node17);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node21);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node17, node22);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node22);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isArrayLiteral(node22);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node9, node22, "hi!");
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node9);
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node9);
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.rhino.jstype.JSType jSType32 = com.google.javascript.jscomp.NodeUtil.getObjectLitKeyTypeFromValueType(node9, jSType31);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isGetProp(node9);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isGetProp(node9);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate36 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.rhino.Node node39 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node38);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isLabelName(node39);
        boolean boolean41 = booleanResultPredicate36.apply(node39);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node39);
        com.google.javascript.rhino.Node node43 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node39);
        com.google.javascript.rhino.Node node44 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node39);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate45 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.rhino.Node node48 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node47);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.isLabelName(node48);
        boolean boolean50 = booleanResultPredicate45.apply(node48);
        com.google.javascript.rhino.Node node52 = null;
        com.google.javascript.rhino.Node node53 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node52);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node53);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node48, node53);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node44, node48);
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node48);
        com.google.javascript.rhino.JSDocInfo jSDocInfo58 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node48);
        com.google.javascript.rhino.Node node59 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node48);
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.referencesThis(node59);
        boolean boolean62 = com.google.javascript.jscomp.NodeUtil.containsType(node59, (int) ' ');
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node59);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node9, node59);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean65 = com.google.javascript.jscomp.NodeUtil.isVarArgsFunction(node9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanResultPredicate1);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNull(jSType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate36);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(booleanResultPredicate45);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(jSDocInfo58);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = booleanResultPredicate0.apply(node3);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isLhs(node3, node8);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration12 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        int int13 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node3, 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration12);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate14 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isLabelName(node17);
        boolean boolean19 = booleanResultPredicate14.apply(node17);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node17);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node17);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node17);
        boolean boolean23 = matchDeclaration12.apply(node17);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node17);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isExprCall(node17);
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(booleanResultPredicate14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = booleanResultPredicate0.apply(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isNumericResult(node3);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate8 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isLabelName(node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node11);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node11);
        int int16 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node11, "");
        boolean boolean17 = mayBeStringResultPredicate8.apply(node11);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.containsType(node3, (int) (short) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate8);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isNumericResultHelper(node3);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isName(node3);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isFunction(node3);
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate0 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node3);
        int int8 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node3, "");
        boolean boolean9 = mayBeStringResultPredicate0.apply(node3);
        java.lang.String str10 = com.google.javascript.jscomp.NodeUtil.getStringValue(node3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isVarArgsFunction(node3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node2);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isLabelName(node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node7);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isUndefined(node7);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node7);
        com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate numbericResultPredicate12 = new com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate();
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node14);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isLabelName(node15);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node15);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isLabelName(node20);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate22 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isLabelName(node25);
        boolean boolean27 = booleanResultPredicate22.apply(node25);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node29);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node30);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node25, node30);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate33 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.rhino.Node node36 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node35);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isLabelName(node36);
        boolean boolean38 = booleanResultPredicate33.apply(node36);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node36);
        com.google.javascript.rhino.Node[] nodeArray40 = new com.google.javascript.rhino.Node[] { node20, node25, node36 };
        com.google.javascript.rhino.Node node41 = com.google.javascript.jscomp.NodeUtil.newCallNode(node15, nodeArray40);
        boolean boolean42 = numbericResultPredicate12.apply(node15);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration43 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.has(node7, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) numbericResultPredicate12, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration43);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node2, node7, "");
        java.lang.Double double47 = com.google.javascript.jscomp.NodeUtil.getNumberValue(node7);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate48 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.rhino.Node node51 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node50);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isLabelName(node51);
        boolean boolean53 = booleanResultPredicate48.apply(node51);
        com.google.javascript.rhino.Node node55 = null;
        com.google.javascript.rhino.Node node56 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node55);
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node56);
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node51, node56);
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.mayBeString(node56, false);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node7, node56, "");
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node7);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate22);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate33);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(nodeArray40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(double47);
        org.junit.Assert.assertNotNull(booleanResultPredicate48);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node3);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node9);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue11 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node9);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node9);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isUndefined(node9);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node3, node9);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isFunction(node9);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.mayBeString(node9);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate17 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isLabelName(node20);
        boolean boolean22 = booleanResultPredicate17.apply(node20);
        java.lang.String[] strArray24 = new java.lang.String[] { "||" };
        java.util.LinkedHashSet<java.lang.String> strSet25 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet25, strArray24);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node20, (java.util.Set<java.lang.String>) strSet25);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node20);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isAssign(node20);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node20);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isCall(node20);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isExprCall(node20);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isConstantByConvention(codingConvention0, node9, node20);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: VAR is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(ternaryValue11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(booleanResultPredicate17);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "||" });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement0 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate1 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isLabelName(node4);
        boolean boolean6 = booleanResultPredicate1.apply(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isNumericResult(node4);
        boolean boolean8 = matchShallowStatement0.apply(node4);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newExpr(node4);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.containsType(node4, (-1));
        java.lang.String str12 = com.google.javascript.jscomp.NodeUtil.getSourceName(node4);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.containsFunction(node4);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node4);
        org.junit.Assert.assertNotNull(booleanResultPredicate1);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node2);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isLabelName(node7);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate9 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isLabelName(node12);
        boolean boolean14 = booleanResultPredicate9.apply(node12);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node12, node17);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate20 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isLabelName(node23);
        boolean boolean25 = booleanResultPredicate20.apply(node23);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node23);
        com.google.javascript.rhino.Node[] nodeArray27 = new com.google.javascript.rhino.Node[] { node7, node12, node23 };
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newCallNode(node2, nodeArray27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node2);
        java.lang.String str30 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node2);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.containsCall(node2);
        com.google.javascript.jscomp.NodeUtil.MatchNotFunction matchNotFunction32 = new com.google.javascript.jscomp.NodeUtil.MatchNotFunction();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate33 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.rhino.Node node36 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node35);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isLabelName(node36);
        boolean boolean38 = booleanResultPredicate33.apply(node36);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.rhino.Node node41 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node40);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node41);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node36, node41);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node41);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node41);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate46 = new com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate();
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.valueCheck(node41, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate46);
        int int48 = com.google.javascript.jscomp.NodeUtil.getCount(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNotFunction32, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate46);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.containsCall(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(nodeArray27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate33);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2 + "'", int48 == 2);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isConstantName(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node2);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node2);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isLabelName(node7);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate9 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isLabelName(node12);
        boolean boolean14 = booleanResultPredicate9.apply(node12);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node12, node17);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate20 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isLabelName(node23);
        boolean boolean25 = booleanResultPredicate20.apply(node23);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node23);
        com.google.javascript.rhino.Node[] nodeArray27 = new com.google.javascript.rhino.Node[] { node7, node12, node23 };
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newCallNode(node2, nodeArray27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node2);
        java.lang.String str30 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node2);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.containsCall(node2);
        java.lang.Double double32 = com.google.javascript.jscomp.NodeUtil.getNumberValue(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(nodeArray27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(double32);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newVarNode("JSCompiler_renameProperty", node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isNumericResultHelper(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.mayBeStringHelper(node4);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate7 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isLabelName(node10);
        boolean boolean12 = booleanResultPredicate7.apply(node10);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node10);
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node10);
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newExpr(node14);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isName(node14);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate17 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isLabelName(node20);
        boolean boolean22 = booleanResultPredicate17.apply(node20);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node20);
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node20);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate26 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int27 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node24, (int) (byte) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate26);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isCall(node24);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate29 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node31);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isLabelName(node32);
        boolean boolean34 = booleanResultPredicate29.apply(node32);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.rhino.Node node37 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node36);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node37);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isLhs(node32, node37);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node37);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node24, node37, "");
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate43 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.rhino.Node node46 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node45);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isLabelName(node46);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node46);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node46);
        int int51 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node46, "");
        boolean boolean52 = mayBeStringResultPredicate43.apply(node46);
        com.google.javascript.rhino.Node node54 = null;
        com.google.javascript.rhino.Node node55 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node54);
        boolean boolean56 = com.google.javascript.jscomp.NodeUtil.isLabelName(node55);
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node55);
        boolean boolean58 = mayBeStringResultPredicate43.apply(node55);
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.valueCheck(node24, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate43);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate60 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node62 = null;
        com.google.javascript.rhino.Node node63 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node62);
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.isLabelName(node63);
        boolean boolean65 = booleanResultPredicate60.apply(node63);
        boolean boolean66 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node63);
        com.google.javascript.rhino.Node node67 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node63);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate69 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int70 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node67, (int) (byte) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate69);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement72 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        int int73 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node67, 15, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement72);
        boolean boolean74 = com.google.javascript.jscomp.NodeUtil.has(node14, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate43, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement72);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType76 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) 'a');
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate77 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node79 = null;
        com.google.javascript.rhino.Node node80 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node79);
        boolean boolean81 = com.google.javascript.jscomp.NodeUtil.isLabelName(node80);
        boolean boolean82 = booleanResultPredicate77.apply(node80);
        boolean boolean83 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node80);
        com.google.javascript.rhino.Node node84 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node80);
        boolean boolean85 = matchNodeType76.apply(node80);
        int int86 = com.google.javascript.jscomp.NodeUtil.getCount(node4, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement72, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType76);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node88 = com.google.javascript.jscomp.NodeUtil.newName(codingConvention0, "||", node4, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(booleanResultPredicate7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate17);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(booleanResultPredicate26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate29);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate43);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate60);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(booleanResultPredicate69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate77);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 1 + "'", int86 == 1);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isAssign(node2);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node2, abstractCompiler5);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isLabelName(node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node9);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node9);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate13 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node15);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isLabelName(node16);
        boolean boolean18 = booleanResultPredicate13.apply(node16);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isNumericResult(node16);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isVar(node16);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node9, node16);
        java.lang.String str22 = com.google.javascript.jscomp.NodeUtil.arrayToString(node9);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isLabelName(node25);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node25);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isUndefined(node25);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node25);
        com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate numbericResultPredicate30 = new com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate();
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node32);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isLabelName(node33);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node33);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.rhino.Node node38 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node37);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isLabelName(node38);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate40 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.rhino.Node node43 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node42);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isLabelName(node43);
        boolean boolean45 = booleanResultPredicate40.apply(node43);
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.rhino.Node node48 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node47);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node48);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node43, node48);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate51 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.rhino.Node node54 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node53);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.isLabelName(node54);
        boolean boolean56 = booleanResultPredicate51.apply(node54);
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node54);
        com.google.javascript.rhino.Node[] nodeArray58 = new com.google.javascript.rhino.Node[] { node38, node43, node54 };
        com.google.javascript.rhino.Node node59 = com.google.javascript.jscomp.NodeUtil.newCallNode(node33, nodeArray58);
        boolean boolean60 = numbericResultPredicate30.apply(node33);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration61 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        boolean boolean62 = com.google.javascript.jscomp.NodeUtil.has(node25, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) numbericResultPredicate30, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration61);
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.isExprCall(node25);
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node25);
        boolean boolean65 = com.google.javascript.jscomp.NodeUtil.isNull(node25);
        boolean boolean66 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node25);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate67 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        com.google.javascript.rhino.Node node69 = null;
        com.google.javascript.rhino.Node node70 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node69);
        boolean boolean71 = com.google.javascript.jscomp.NodeUtil.isLabelName(node70);
        boolean boolean72 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node70);
        boolean boolean73 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node70);
        int int75 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node70, "");
        boolean boolean76 = mayBeStringResultPredicate67.apply(node70);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue77 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node70);
        com.google.javascript.rhino.Node[] nodeArray78 = new com.google.javascript.rhino.Node[] { node25, node70 };
        com.google.javascript.rhino.Node node79 = com.google.javascript.jscomp.NodeUtil.newCallNode(node9, nodeArray78);
        boolean boolean80 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node79);
        boolean boolean81 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node2, node79);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate40);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate51);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(nodeArray58);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate67);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 1 + "'", int75 == 1);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(ternaryValue77);
        org.junit.Assert.assertNotNull(nodeArray78);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement0 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate1 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isLabelName(node4);
        boolean boolean6 = booleanResultPredicate1.apply(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isNumericResult(node4);
        boolean boolean8 = matchShallowStatement0.apply(node4);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newExpr(node4);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node9, "undefined");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate13 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node15);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isLabelName(node16);
        boolean boolean18 = booleanResultPredicate13.apply(node16);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node16);
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node16);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate22 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int23 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node20, (int) (byte) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.containsCall(node20);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType27 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        int int28 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node20, 15, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node9, "^", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType27);
        org.junit.Assert.assertNotNull(booleanResultPredicate1);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(booleanResultPredicate22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = booleanResultPredicate0.apply(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node3);
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node3);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node3);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isLabelName(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node13);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isUndefined(node13);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node13);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.referencesThis(node13);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection19 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node13);
        com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate numbericResultPredicate20 = new com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate();
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isLabelName(node23);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node23);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isLabelName(node28);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate30 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node32);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isLabelName(node33);
        boolean boolean35 = booleanResultPredicate30.apply(node33);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.rhino.Node node38 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node37);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node38);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node33, node38);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate41 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node43);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isLabelName(node44);
        boolean boolean46 = booleanResultPredicate41.apply(node44);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node44);
        com.google.javascript.rhino.Node[] nodeArray48 = new com.google.javascript.rhino.Node[] { node28, node33, node44 };
        com.google.javascript.rhino.Node node49 = com.google.javascript.jscomp.NodeUtil.newCallNode(node23, nodeArray48);
        boolean boolean50 = numbericResultPredicate20.apply(node23);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.valueCheck(node13, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) numbericResultPredicate20);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node3, "%=", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) numbericResultPredicate20);
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(nodeCollection19);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate30);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate41);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(nodeArray48);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.referencesThis(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isNull(node3);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.mayBeString(node3);
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node3);
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newVarNode("instanceof", node11);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = booleanResultPredicate0.apply(node3);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node3, node8);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node8);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isArrayLiteral(node8);
        java.lang.Double double13 = com.google.javascript.jscomp.NodeUtil.getNumberValue(node8);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node8);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue15 = com.google.javascript.jscomp.NodeUtil.getPureBooleanValue(node8);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node8);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection17 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node8);
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(double13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(ternaryValue15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(nodeCollection17);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        java.lang.String str1 = com.google.javascript.jscomp.NodeUtil.trimJsWhiteSpace("undefined");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "undefined" + "'", str1, "undefined");
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = booleanResultPredicate0.apply(node3);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node3, node8);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.mayBeString(node8, false);
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "JSCompiler_renameProperty" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node8, (java.util.Set<java.lang.String>) strSet17);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node8);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isName(node8);
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.getLoopCodeBlock(node8);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.getAssignedValue(node8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!", "JSCompiler_renameProperty" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(node22);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isUndefined(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isNull(node2);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node2);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isBooleanResultHelper(node2);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node2);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate6 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isLabelName(node9);
        boolean boolean11 = booleanResultPredicate6.apply(node9);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isNumericResult(node9);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isVar(node9);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node2, node9);
        java.lang.String str15 = com.google.javascript.jscomp.NodeUtil.arrayToString(node2);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isLabelName(node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node18);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isUndefined(node18);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node18);
        com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate numbericResultPredicate23 = new com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate();
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node25);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isLabelName(node26);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node26);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node30);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isLabelName(node31);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate33 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.rhino.Node node36 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node35);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isLabelName(node36);
        boolean boolean38 = booleanResultPredicate33.apply(node36);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.rhino.Node node41 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node40);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node41);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node36, node41);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate44 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.rhino.Node node47 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node46);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isLabelName(node47);
        boolean boolean49 = booleanResultPredicate44.apply(node47);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node47);
        com.google.javascript.rhino.Node[] nodeArray51 = new com.google.javascript.rhino.Node[] { node31, node36, node47 };
        com.google.javascript.rhino.Node node52 = com.google.javascript.jscomp.NodeUtil.newCallNode(node26, nodeArray51);
        boolean boolean53 = numbericResultPredicate23.apply(node26);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration54 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.has(node18, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) numbericResultPredicate23, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration54);
        boolean boolean56 = com.google.javascript.jscomp.NodeUtil.isExprCall(node18);
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node18);
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.isNull(node18);
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node18);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate60 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        com.google.javascript.rhino.Node node62 = null;
        com.google.javascript.rhino.Node node63 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node62);
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.isLabelName(node63);
        boolean boolean65 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node63);
        boolean boolean66 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node63);
        int int68 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node63, "");
        boolean boolean69 = mayBeStringResultPredicate60.apply(node63);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue70 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node63);
        com.google.javascript.rhino.Node[] nodeArray71 = new com.google.javascript.rhino.Node[] { node18, node63 };
        com.google.javascript.rhino.Node node72 = com.google.javascript.jscomp.NodeUtil.newCallNode(node2, nodeArray71);
        boolean boolean73 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate33);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate44);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(nodeArray51);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate60);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(ternaryValue70);
        org.junit.Assert.assertNotNull(nodeArray71);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node2);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isLabelName(node7);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate9 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isLabelName(node12);
        boolean boolean14 = booleanResultPredicate9.apply(node12);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node12, node17);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate20 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isLabelName(node23);
        boolean boolean25 = booleanResultPredicate20.apply(node23);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node23);
        com.google.javascript.rhino.Node[] nodeArray27 = new com.google.javascript.rhino.Node[] { node7, node12, node23 };
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newCallNode(node2, nodeArray27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node2);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.referencesThis(node2);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isVarArgsFunction(node2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(nodeArray27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = booleanResultPredicate0.apply(node3);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isLhs(node3, node8);
        java.lang.Double double11 = com.google.javascript.jscomp.NodeUtil.getNumberValue(node8);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node8);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.getArgumentForFunction(node8, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(double11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = booleanResultPredicate0.apply(node3);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isLhs(node3, node8);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node8, abstractCompiler11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node8);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node8);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node8);
        com.google.javascript.jscomp.NodeUtil.MatchNotFunction matchNotFunction16 = new com.google.javascript.jscomp.NodeUtil.MatchNotFunction();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate17 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isLabelName(node20);
        boolean boolean22 = booleanResultPredicate17.apply(node20);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node25);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isLhs(node20, node25);
        boolean boolean28 = matchNotFunction16.apply(node20);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate29 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate30 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node32);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isLabelName(node33);
        boolean boolean35 = booleanResultPredicate30.apply(node33);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.rhino.Node node38 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node37);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node38);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node33, node38);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node38);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node38);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate43 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.rhino.Node node46 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node45);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isLabelName(node46);
        boolean boolean48 = booleanResultPredicate43.apply(node46);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.rhino.Node node51 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node50);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node51);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node46, node51);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node51);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.isArrayLiteral(node51);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node38, node51, "hi!");
        boolean boolean58 = booleanResultPredicate29.apply(node38);
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.has(node8, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNotFunction16, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate29);
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node8);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue61 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node8);
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate17);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(booleanResultPredicate29);
        org.junit.Assert.assertNotNull(booleanResultPredicate30);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
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
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(ternaryValue61);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node2);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isLabelName(node7);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate9 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isLabelName(node12);
        boolean boolean14 = booleanResultPredicate9.apply(node12);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node12, node17);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate20 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isLabelName(node23);
        boolean boolean25 = booleanResultPredicate20.apply(node23);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node23);
        com.google.javascript.rhino.Node[] nodeArray27 = new com.google.javascript.rhino.Node[] { node7, node12, node23 };
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newCallNode(node2, nodeArray27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node2);
        java.lang.String str30 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node2);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.containsCall(node2);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.rhino.Node node34 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node33);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isLabelName(node34);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node34);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isUndefined(node34);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node34);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isNull(node34);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.mayBeString(node34);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate42 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.rhino.Node node45 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node44);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isLabelName(node45);
        boolean boolean47 = booleanResultPredicate42.apply(node45);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.rhino.Node node50 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node49);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node50);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node45, node50);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node50);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node50);
        java.lang.String str55 = com.google.javascript.jscomp.NodeUtil.getStringValue(node50);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate57 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node59 = null;
        com.google.javascript.rhino.Node node60 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node59);
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.isLabelName(node60);
        boolean boolean62 = booleanResultPredicate57.apply(node60);
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node60);
        com.google.javascript.rhino.Node node64 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node60);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate66 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int67 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node64, (int) (byte) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate66);
        boolean boolean68 = com.google.javascript.jscomp.NodeUtil.containsType(node50, (int) (short) 1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate66);
        int int69 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node34, 15, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate66);
        boolean boolean70 = com.google.javascript.jscomp.NodeUtil.valueCheck(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate66);
        boolean boolean71 = com.google.javascript.jscomp.NodeUtil.isBooleanResultHelper(node2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean72 = com.google.javascript.jscomp.NodeUtil.functionCallHasSideEffects(node2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected CALL node, got VAR");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(nodeArray27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(booleanResultPredicate42);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNotNull(booleanResultPredicate57);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNotNull(booleanResultPredicate66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = booleanResultPredicate0.apply(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node3);
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node3);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate8 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isLabelName(node11);
        boolean boolean13 = booleanResultPredicate8.apply(node11);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node15);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node11, node16);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node16);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node16);
        java.lang.String str21 = com.google.javascript.jscomp.NodeUtil.getStringValue(node16);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isBooleanResultHelper(node16);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node16);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate25 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isLabelName(node28);
        boolean boolean30 = booleanResultPredicate25.apply(node28);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node32);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node33);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node28, node33);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node33);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node33);
        java.lang.String str38 = com.google.javascript.jscomp.NodeUtil.getStringValue(node33);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate40 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.rhino.Node node43 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node42);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isLabelName(node43);
        boolean boolean45 = booleanResultPredicate40.apply(node43);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node43);
        com.google.javascript.rhino.Node node47 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node43);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate49 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int50 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node47, (int) (byte) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate49);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.containsType(node33, (int) (short) 1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate49);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node16, "JSCompiler_renameProperty", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate49);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.isLhs(node7, node16);
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(booleanResultPredicate8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(booleanResultPredicate40);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(booleanResultPredicate49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node2);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isLabelName(node7);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate9 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isLabelName(node12);
        boolean boolean14 = booleanResultPredicate9.apply(node12);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node12, node17);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate20 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isLabelName(node23);
        boolean boolean25 = booleanResultPredicate20.apply(node23);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node23);
        com.google.javascript.rhino.Node[] nodeArray27 = new com.google.javascript.rhino.Node[] { node7, node12, node23 };
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newCallNode(node2, nodeArray27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node2);
        java.lang.String str30 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node2);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.containsCall(node2);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isAssign(node2);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.getFunctionBody(node2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(nodeArray27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate1 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isLabelName(node4);
        boolean boolean6 = booleanResultPredicate1.apply(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node4);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node4);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node8);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newVarNode("JSCompiler_renameProperty", node8);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node8);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node8);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(node8);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.getCatchBlock(node8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanResultPredicate1);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate numbericResultPredicate0 = com.google.javascript.jscomp.NodeUtil.NUMBERIC_RESULT_PREDICATE;
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate1 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isLabelName(node4);
        boolean boolean6 = booleanResultPredicate1.apply(node4);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node4, node9);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node9);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isArrayLiteral(node9);
        java.lang.Double double14 = com.google.javascript.jscomp.NodeUtil.getNumberValue(node9);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node9);
        boolean boolean16 = numbericResultPredicate0.apply(node9);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement17 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate18 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isLabelName(node21);
        boolean boolean23 = booleanResultPredicate18.apply(node21);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isNumericResult(node21);
        boolean boolean25 = matchShallowStatement17.apply(node21);
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newExpr(node21);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue27 = com.google.javascript.jscomp.NodeUtil.getPureBooleanValue(node26);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isFunction(node26);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node26);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node9, node26);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = com.google.javascript.jscomp.NodeUtil.hasCatchHandler(node26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numbericResultPredicate0);
        org.junit.Assert.assertNotNull(booleanResultPredicate1);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(double14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate18);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(ternaryValue27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isUndefined(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node2);
        com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate numbericResultPredicate7 = new com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate();
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isLabelName(node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node10);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node14);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isLabelName(node15);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate17 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isLabelName(node20);
        boolean boolean22 = booleanResultPredicate17.apply(node20);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node25);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node20, node25);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate28 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node30);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isLabelName(node31);
        boolean boolean33 = booleanResultPredicate28.apply(node31);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node31);
        com.google.javascript.rhino.Node[] nodeArray35 = new com.google.javascript.rhino.Node[] { node15, node20, node31 };
        com.google.javascript.rhino.Node node36 = com.google.javascript.jscomp.NodeUtil.newCallNode(node10, nodeArray35);
        boolean boolean37 = numbericResultPredicate7.apply(node10);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration38 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.has(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) numbericResultPredicate7, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration38);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isExprCall(node2);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node43);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isLabelName(node44);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node44);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node44);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate48 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.rhino.Node node51 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node50);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isLabelName(node51);
        boolean boolean53 = booleanResultPredicate48.apply(node51);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.isNumericResult(node51);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.isVar(node51);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node44, node51);
        com.google.javascript.jscomp.NodeUtil.MatchNotFunction matchNotFunction58 = new com.google.javascript.jscomp.NodeUtil.MatchNotFunction();
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node51, "undefined", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNotFunction58);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate60 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node62 = null;
        com.google.javascript.rhino.Node node63 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node62);
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.isLabelName(node63);
        boolean boolean65 = booleanResultPredicate60.apply(node63);
        com.google.javascript.rhino.Node node67 = null;
        com.google.javascript.rhino.Node node68 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node67);
        boolean boolean69 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node68);
        boolean boolean70 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node63, node68);
        boolean boolean71 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node68);
        boolean boolean72 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node68);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate73 = new com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate();
        boolean boolean74 = com.google.javascript.jscomp.NodeUtil.valueCheck(node68, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate73);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate75 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node77 = null;
        com.google.javascript.rhino.Node node78 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node77);
        boolean boolean79 = com.google.javascript.jscomp.NodeUtil.isLabelName(node78);
        boolean boolean80 = booleanResultPredicate75.apply(node78);
        com.google.javascript.rhino.Node node82 = null;
        com.google.javascript.rhino.Node node83 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node82);
        boolean boolean84 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node83);
        boolean boolean85 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node78, node83);
        boolean boolean86 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node83);
        boolean boolean87 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node83);
        java.lang.String str88 = com.google.javascript.jscomp.NodeUtil.getStringValue(node83);
        boolean boolean90 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node83, "JSCompiler_renameProperty");
        boolean boolean91 = com.google.javascript.jscomp.NodeUtil.isNumericResult(node83);
        boolean boolean92 = com.google.javascript.jscomp.NodeUtil.isUndefined(node83);
        boolean boolean93 = mayBeStringResultPredicate73.apply(node83);
        java.lang.String str94 = com.google.javascript.jscomp.NodeUtil.getSourceName(node83);
        boolean boolean95 = matchNotFunction58.apply(node83);
        int int96 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node2, 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNotFunction58);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate17);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate28);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(nodeArray35);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate48);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate60);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(booleanResultPredicate75);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNull(str88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertNull(str94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 0 + "'", int96 == 0);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isUndefined(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isNull(node2);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isNew(node2);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node2);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isNumericResultHelper(node2);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node2, false);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isUndefined(node2);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate6 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isLabelName(node9);
        boolean boolean11 = booleanResultPredicate6.apply(node9);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node9);
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node9);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType15 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) 'a');
        com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate numbericResultPredicate16 = new com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate();
        int int17 = com.google.javascript.jscomp.NodeUtil.getCount(node13, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType15, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) numbericResultPredicate16);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate18 = new com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate();
        int int19 = com.google.javascript.jscomp.NodeUtil.getCount(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) numbericResultPredicate16, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate18);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate20 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isLabelName(node23);
        boolean boolean25 = booleanResultPredicate20.apply(node23);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node23);
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node23);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isThis(node23);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node23);
        boolean boolean30 = mayBeStringResultPredicate18.apply(node23);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement31 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate32 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node34);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isLabelName(node35);
        boolean boolean37 = booleanResultPredicate32.apply(node35);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isNumericResult(node35);
        boolean boolean39 = matchShallowStatement31.apply(node35);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.mayBeString(node35, true);
        boolean boolean42 = mayBeStringResultPredicate18.apply(node35);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.containsType(node35, (int) '4');
        java.lang.String[] strArray51 = new java.lang.String[] { "typeof", "undefined", "||", "typeof", "%=", "^" };
        java.util.LinkedHashSet<java.lang.String> strSet52 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet52, strArray51);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node35, (java.util.Set<java.lang.String>) strSet52);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(booleanResultPredicate20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(booleanResultPredicate32);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "typeof", "undefined", "||", "typeof", "%=", "^" });
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isUndefined(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isNull(node2);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.mayBeString(node2);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node2, abstractCompiler9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isBooleanResultHelper(node2);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isNew(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = booleanResultPredicate0.apply(node3);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node3, node8);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node3);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node3);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate13 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node15);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isLabelName(node16);
        boolean boolean18 = booleanResultPredicate13.apply(node16);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node16);
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node16);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isThis(node16);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node16);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isConstantName(node16);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node3, node16);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.containsType(node3, 0);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node3);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isNullOrUndefined(node3);
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(booleanResultPredicate13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = booleanResultPredicate0.apply(node3);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isLhs(node3, node8);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate12 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node8, "^", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate12);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node15);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isLabelName(node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node16);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isUndefined(node16);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate20 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isLabelName(node23);
        boolean boolean25 = booleanResultPredicate20.apply(node23);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node23);
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node23);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType29 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) 'a');
        com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate numbericResultPredicate30 = new com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate();
        int int31 = com.google.javascript.jscomp.NodeUtil.getCount(node27, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType29, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) numbericResultPredicate30);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate32 = new com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate();
        int int33 = com.google.javascript.jscomp.NodeUtil.getCount(node16, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) numbericResultPredicate30, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate32);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate34 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.rhino.Node node37 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node36);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isLabelName(node37);
        boolean boolean39 = booleanResultPredicate34.apply(node37);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node37);
        com.google.javascript.rhino.Node node41 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node37);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isThis(node37);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node37);
        boolean boolean44 = mayBeStringResultPredicate32.apply(node37);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement45 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate46 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.rhino.Node node49 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node48);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isLabelName(node49);
        boolean boolean51 = booleanResultPredicate46.apply(node49);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isNumericResult(node49);
        boolean boolean53 = matchShallowStatement45.apply(node49);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.mayBeString(node49, true);
        boolean boolean56 = mayBeStringResultPredicate32.apply(node49);
        boolean boolean57 = booleanResultPredicate12.apply(node49);
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(booleanResultPredicate12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(booleanResultPredicate34);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(booleanResultPredicate46);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = booleanResultPredicate0.apply(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node3);
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node3);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate9 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int10 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node7, (int) (byte) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate9);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement12 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        int int13 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node7, 15, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement12);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node7, "^");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = com.google.javascript.jscomp.NodeUtil.functionCallHasSideEffects(node7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected CALL node, got VOID");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(booleanResultPredicate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = booleanResultPredicate0.apply(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node3);
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node3);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate9 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int10 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node7, (int) (byte) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.containsCall(node7);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node7);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.containsFunction(node7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: NUMBER 0.0 is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(booleanResultPredicate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node2);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isLabelName(node7);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate9 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isLabelName(node12);
        boolean boolean14 = booleanResultPredicate9.apply(node12);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node12, node17);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate20 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isLabelName(node23);
        boolean boolean25 = booleanResultPredicate20.apply(node23);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node23);
        com.google.javascript.rhino.Node[] nodeArray27 = new com.google.javascript.rhino.Node[] { node7, node12, node23 };
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newCallNode(node2, nodeArray27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node2);
        java.lang.String str30 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node2);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.containsCall(node2);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isAssign(node2);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isForIn(node2);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isNullOrUndefined(node2);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isTryCatchNodeContainer(node2);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(nodeArray27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node2);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isLabelName(node7);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate9 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isLabelName(node12);
        boolean boolean14 = booleanResultPredicate9.apply(node12);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node12, node17);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate20 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isLabelName(node23);
        boolean boolean25 = booleanResultPredicate20.apply(node23);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node23);
        com.google.javascript.rhino.Node[] nodeArray27 = new com.google.javascript.rhino.Node[] { node7, node12, node23 };
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newCallNode(node2, nodeArray27);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node28, "hi!");
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isForIn(node28);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isNumericResultHelper(node28);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node28);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(nodeArray27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate1 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isLabelName(node4);
        boolean boolean6 = booleanResultPredicate1.apply(node4);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node4, node9);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node9);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node9);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate14 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isLabelName(node17);
        boolean boolean19 = booleanResultPredicate14.apply(node17);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node21);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node17, node22);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node22);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isArrayLiteral(node22);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node9, node22, "hi!");
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node9);
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node9);
        com.google.javascript.rhino.jstype.JSType jSType31 = null;
        com.google.javascript.rhino.jstype.JSType jSType32 = com.google.javascript.jscomp.NodeUtil.getObjectLitKeyTypeFromValueType(node9, jSType31);
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node9);
        java.lang.String str34 = com.google.javascript.jscomp.NodeUtil.getStringValue(node33);
        java.lang.Double double35 = com.google.javascript.jscomp.NodeUtil.getNumberValue(node33);
        org.junit.Assert.assertNotNull(booleanResultPredicate1);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNull(jSType32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "undefined" + "'", str34, "undefined");
        org.junit.Assert.assertTrue(Double.isNaN(double35));
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        java.lang.String str1 = com.google.javascript.jscomp.NodeUtil.opToStrNoFail(15);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<=" + "'", str1, "<=");
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = booleanResultPredicate0.apply(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node3);
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node3);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node3);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate10 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isLabelName(node13);
        boolean boolean15 = booleanResultPredicate10.apply(node13);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node13, node18);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.mayBeString(node18, false);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "hi!", "JSCompiler_renameProperty" };
        java.util.LinkedHashSet<java.lang.String> strSet27 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet27, strArray26);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node18, (java.util.Set<java.lang.String>) strSet27);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node31);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isLabelName(node32);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node32);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isUndefined(node32);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate36 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.rhino.Node node39 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node38);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isLabelName(node39);
        boolean boolean41 = booleanResultPredicate36.apply(node39);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node39);
        com.google.javascript.rhino.Node node43 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node39);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType45 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) 'a');
        com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate numbericResultPredicate46 = new com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate();
        int int47 = com.google.javascript.jscomp.NodeUtil.getCount(node43, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType45, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) numbericResultPredicate46);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate48 = new com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate();
        int int49 = com.google.javascript.jscomp.NodeUtil.getCount(node32, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) numbericResultPredicate46, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate48);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.valueCheck(node18, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate48);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node3, "hi!", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate48);
        com.google.javascript.rhino.jstype.JSType jSType52 = null;
        com.google.javascript.rhino.jstype.JSType jSType53 = com.google.javascript.jscomp.NodeUtil.getObjectLitKeyTypeFromValueType(node3, jSType52);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue54 = com.google.javascript.jscomp.NodeUtil.getPureBooleanValue(node3);
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(booleanResultPredicate10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "hi!", "hi!", "JSCompiler_renameProperty" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate36);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(jSType53);
        org.junit.Assert.assertNotNull(ternaryValue54);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = booleanResultPredicate0.apply(node3);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node3, node8);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node8);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node8);
        java.lang.String str13 = com.google.javascript.jscomp.NodeUtil.getStringValue(node8);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isBooleanResultHelper(node8);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node8);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate17 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isLabelName(node20);
        boolean boolean22 = booleanResultPredicate17.apply(node20);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node25);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node20, node25);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node25);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node25);
        java.lang.String str30 = com.google.javascript.jscomp.NodeUtil.getStringValue(node25);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate32 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node34);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isLabelName(node35);
        boolean boolean37 = booleanResultPredicate32.apply(node35);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node35);
        com.google.javascript.rhino.Node node39 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node35);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate41 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int42 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node39, (int) (byte) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate41);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.containsType(node25, (int) (short) 1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate41);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node8, "JSCompiler_renameProperty", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate41);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node8, "");
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate17);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(booleanResultPredicate32);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(booleanResultPredicate41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node2);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue4 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isUndefined(node2);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node2, abstractCompiler7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(node2);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isLabelName(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node12);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isUndefined(node12);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node12);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.referencesThis(node12);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection18 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node12);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.containsType(node12, 15);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node2, node12, "hi!");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate23 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node25);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isLabelName(node26);
        boolean boolean28 = booleanResultPredicate23.apply(node26);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node30);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node31);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node26, node31);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node26);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node26);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate36 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.rhino.Node node39 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node38);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isLabelName(node39);
        boolean boolean41 = booleanResultPredicate36.apply(node39);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isGet(node39);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate43 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.rhino.Node node46 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node45);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isLabelName(node46);
        boolean boolean48 = booleanResultPredicate43.apply(node46);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.rhino.Node node51 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node50);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node51);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node46, node51);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.mayBeString(node51, false);
        java.lang.String[] strArray59 = new java.lang.String[] { "hi!", "hi!", "JSCompiler_renameProperty" };
        java.util.LinkedHashSet<java.lang.String> strSet60 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet60, strArray59);
        boolean boolean62 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node51, (java.util.Set<java.lang.String>) strSet60);
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node39, (java.util.Set<java.lang.String>) strSet60);
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node26, (java.util.Set<java.lang.String>) strSet60);
        boolean boolean65 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node12, (java.util.Set<java.lang.String>) strSet60);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(ternaryValue4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(nodeCollection18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate23);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate36);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate43);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertArrayEquals(strArray59, new java.lang.String[] { "hi!", "hi!", "JSCompiler_renameProperty" });
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = booleanResultPredicate0.apply(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node3);
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node3);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node3);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node3);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node3);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(node3);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.getCatchBlock(node3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = booleanResultPredicate0.apply(node3);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node3, node8);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.mayBeString(node8, false);
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "JSCompiler_renameProperty" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node8, (java.util.Set<java.lang.String>) strSet17);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node8);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isName(node8);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node23);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isLabelName(node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node24);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node24);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate28 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node30);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isLabelName(node31);
        boolean boolean33 = booleanResultPredicate28.apply(node31);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.rhino.Node node36 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node35);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node36);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isLhs(node31, node36);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration40 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        int int41 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node31, 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration40);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.valueCheck(node24, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration40);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate43 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.rhino.Node node46 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node45);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isLabelName(node46);
        boolean boolean48 = booleanResultPredicate43.apply(node46);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node46);
        com.google.javascript.rhino.Node node50 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node46);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate52 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int53 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node50, (int) (byte) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate52);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType55 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) 'a');
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration56 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.has(node50, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType55, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration56);
        int int58 = com.google.javascript.jscomp.NodeUtil.getCount(node8, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration40, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration56);
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.isConstantName(node8);
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node8);
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node8);
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "hi!", "JSCompiler_renameProperty" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate28);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(booleanResultPredicate43);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(booleanResultPredicate52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate1 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isLabelName(node4);
        boolean boolean6 = booleanResultPredicate1.apply(node4);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node4, node9);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node9);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node9);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate14 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isLabelName(node17);
        boolean boolean19 = booleanResultPredicate14.apply(node17);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node21);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node17, node22);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node22);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isArrayLiteral(node22);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node9, node22, "hi!");
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node9);
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node9);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node9);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.rhino.Node node34 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node33);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node34);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue36 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node34);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node34);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isUndefined(node34);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node34, false);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node43);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isLabelName(node44);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node44);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isUndefined(node44);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node44);
        com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate numbericResultPredicate49 = new com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate();
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.rhino.Node node52 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node51);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.isLabelName(node52);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node52);
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.rhino.Node node57 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node56);
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.isLabelName(node57);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate59 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node61 = null;
        com.google.javascript.rhino.Node node62 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node61);
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.isLabelName(node62);
        boolean boolean64 = booleanResultPredicate59.apply(node62);
        com.google.javascript.rhino.Node node66 = null;
        com.google.javascript.rhino.Node node67 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node66);
        boolean boolean68 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node67);
        boolean boolean69 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node62, node67);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate70 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node72 = null;
        com.google.javascript.rhino.Node node73 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node72);
        boolean boolean74 = com.google.javascript.jscomp.NodeUtil.isLabelName(node73);
        boolean boolean75 = booleanResultPredicate70.apply(node73);
        boolean boolean76 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node73);
        com.google.javascript.rhino.Node[] nodeArray77 = new com.google.javascript.rhino.Node[] { node57, node62, node73 };
        com.google.javascript.rhino.Node node78 = com.google.javascript.jscomp.NodeUtil.newCallNode(node52, nodeArray77);
        boolean boolean79 = numbericResultPredicate49.apply(node52);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration80 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        boolean boolean81 = com.google.javascript.jscomp.NodeUtil.has(node44, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) numbericResultPredicate49, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration80);
        com.google.javascript.rhino.Node node83 = null;
        com.google.javascript.rhino.Node node84 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node83);
        boolean boolean85 = com.google.javascript.jscomp.NodeUtil.isLabelName(node84);
        boolean boolean86 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node84);
        boolean boolean87 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node84);
        boolean boolean88 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(node84);
        boolean boolean89 = matchDeclaration80.apply(node84);
        boolean boolean90 = com.google.javascript.jscomp.NodeUtil.containsType(node34, 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration80);
        boolean boolean91 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node9, node34);
        boolean boolean92 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node9);
        org.junit.Assert.assertNotNull(booleanResultPredicate1);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(ternaryValue36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate59);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate70);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(nodeArray77);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node2);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isLabelName(node7);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate9 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isLabelName(node12);
        boolean boolean14 = booleanResultPredicate9.apply(node12);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node12, node17);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate20 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isLabelName(node23);
        boolean boolean25 = booleanResultPredicate20.apply(node23);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node23);
        com.google.javascript.rhino.Node[] nodeArray27 = new com.google.javascript.rhino.Node[] { node7, node12, node23 };
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newCallNode(node2, nodeArray27);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler29 = null;
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node2, abstractCompiler29);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node2);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isStatement(node2);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.mayBeString(node2, false);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(nodeArray27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = booleanResultPredicate0.apply(node3);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node3, node8);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node3);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node3);
        com.google.javascript.rhino.JSDocInfo jSDocInfo13 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node3);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isNumericResult(node3);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate16 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isLabelName(node19);
        boolean boolean21 = booleanResultPredicate16.apply(node19);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node19);
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node19);
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node19);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate25 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isLabelName(node28);
        boolean boolean30 = booleanResultPredicate25.apply(node28);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node32);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node33);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node28, node33);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node24, node28);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node28);
        com.google.javascript.rhino.JSDocInfo jSDocInfo38 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node28);
        com.google.javascript.rhino.Node node39 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node28);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate40 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.rhino.Node node43 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node42);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isLabelName(node43);
        boolean boolean45 = booleanResultPredicate40.apply(node43);
        java.lang.String[] strArray47 = new java.lang.String[] { "||" };
        java.util.LinkedHashSet<java.lang.String> strSet48 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet48, strArray47);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node43, (java.util.Set<java.lang.String>) strSet48);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node39, (java.util.Set<java.lang.String>) strSet48);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node3, (java.util.Set<java.lang.String>) strSet48);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.containsCall(node3);
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(jSDocInfo13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate16);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(booleanResultPredicate25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(jSDocInfo38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(booleanResultPredicate40);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "||" });
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isUndefined(node3);
        com.google.javascript.rhino.JSDocInfo jSDocInfo7 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node3);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate8 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isLabelName(node11);
        boolean boolean13 = booleanResultPredicate8.apply(node11);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node11);
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node11);
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node11);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node3, node11);
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node11);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node18);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.getArgumentForFunction(node18, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(jSDocInfo7);
        org.junit.Assert.assertNotNull(booleanResultPredicate8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate numbericResultPredicate0 = com.google.javascript.jscomp.NodeUtil.NUMBERIC_RESULT_PREDICATE;
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate1 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isLabelName(node4);
        boolean boolean6 = booleanResultPredicate1.apply(node4);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node4, node9);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node9);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isArrayLiteral(node9);
        java.lang.Double double14 = com.google.javascript.jscomp.NodeUtil.getNumberValue(node9);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node9);
        boolean boolean16 = numbericResultPredicate0.apply(node9);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement17 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate18 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isLabelName(node21);
        boolean boolean23 = booleanResultPredicate18.apply(node21);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isNumericResult(node21);
        boolean boolean25 = matchShallowStatement17.apply(node21);
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newExpr(node21);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue27 = com.google.javascript.jscomp.NodeUtil.getPureBooleanValue(node26);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isFunction(node26);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node26);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node9, node26);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = com.google.javascript.jscomp.NodeUtil.hasFinally(node9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numbericResultPredicate0);
        org.junit.Assert.assertNotNull(booleanResultPredicate1);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(double14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate18);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(ternaryValue27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = booleanResultPredicate0.apply(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node3);
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node3);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newExpr(node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isName(node7);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate10 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isLabelName(node13);
        boolean boolean15 = booleanResultPredicate10.apply(node13);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node13);
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node13);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate19 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int20 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node17, (int) (byte) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isCall(node17);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate22 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isLabelName(node25);
        boolean boolean27 = booleanResultPredicate22.apply(node25);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node29);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node30);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isLhs(node25, node30);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node30);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node17, node30, "");
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate36 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.rhino.Node node39 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node38);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isLabelName(node39);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node39);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node39);
        int int44 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node39, "");
        boolean boolean45 = mayBeStringResultPredicate36.apply(node39);
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.rhino.Node node48 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node47);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.isLabelName(node48);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node48);
        boolean boolean51 = mayBeStringResultPredicate36.apply(node48);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.valueCheck(node17, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate36);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate53 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node55 = null;
        com.google.javascript.rhino.Node node56 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node55);
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.isLabelName(node56);
        boolean boolean58 = booleanResultPredicate53.apply(node56);
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node56);
        com.google.javascript.rhino.Node node60 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node56);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate62 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int63 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node60, (int) (byte) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate62);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement65 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        int int66 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node60, 15, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement65);
        boolean boolean67 = com.google.javascript.jscomp.NodeUtil.has(node7, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate36, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement65);
        int int69 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node7, "hi!");
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(booleanResultPredicate19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate22);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate36);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate53);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(booleanResultPredicate62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = booleanResultPredicate0.apply(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node3);
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node3);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate9 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int10 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node7, (int) (byte) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isCall(node7);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate12 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node14);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isLabelName(node15);
        boolean boolean17 = booleanResultPredicate12.apply(node15);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isLhs(node15, node20);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node20);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node7, node20, "");
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node20);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node20);
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(booleanResultPredicate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node2);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isLabelName(node7);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate9 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isLabelName(node12);
        boolean boolean14 = booleanResultPredicate9.apply(node12);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node12, node17);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate20 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isLabelName(node23);
        boolean boolean25 = booleanResultPredicate20.apply(node23);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node23);
        com.google.javascript.rhino.Node[] nodeArray27 = new com.google.javascript.rhino.Node[] { node7, node12, node23 };
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newCallNode(node2, nodeArray27);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler29 = null;
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node2, abstractCompiler29);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node2);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isBooleanResult(node2);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(nodeArray27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = booleanResultPredicate0.apply(node3);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node3, node8);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node8);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue12 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node8);
        java.lang.String str13 = com.google.javascript.jscomp.NodeUtil.getSourceName(node8);
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(ternaryValue12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isUndefined(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node2);
        com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate numbericResultPredicate7 = new com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate();
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isLabelName(node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node10);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node14);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isLabelName(node15);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate17 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isLabelName(node20);
        boolean boolean22 = booleanResultPredicate17.apply(node20);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node25);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node20, node25);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate28 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node30);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isLabelName(node31);
        boolean boolean33 = booleanResultPredicate28.apply(node31);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node31);
        com.google.javascript.rhino.Node[] nodeArray35 = new com.google.javascript.rhino.Node[] { node15, node20, node31 };
        com.google.javascript.rhino.Node node36 = com.google.javascript.jscomp.NodeUtil.newCallNode(node10, nodeArray35);
        boolean boolean37 = numbericResultPredicate7.apply(node10);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration38 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.has(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) numbericResultPredicate7, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration38);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate40 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.rhino.Node node43 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node42);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isLabelName(node43);
        boolean boolean45 = booleanResultPredicate40.apply(node43);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node43);
        com.google.javascript.rhino.Node node47 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node43);
        com.google.javascript.rhino.Node node48 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node43);
        boolean boolean49 = matchDeclaration38.apply(node43);
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.rhino.Node node52 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node51);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.isLabelName(node52);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node52);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node52);
        boolean boolean56 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(node52);
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.referencesThis(node52);
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.isNull(node52);
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.mayBeString(node52);
        boolean boolean60 = matchDeclaration38.apply(node52);
        com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate numbericResultPredicate61 = new com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate();
        com.google.javascript.rhino.Node node63 = null;
        com.google.javascript.rhino.Node node64 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node63);
        boolean boolean65 = com.google.javascript.jscomp.NodeUtil.isLabelName(node64);
        boolean boolean66 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node64);
        com.google.javascript.rhino.Node node68 = null;
        com.google.javascript.rhino.Node node69 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node68);
        boolean boolean70 = com.google.javascript.jscomp.NodeUtil.isLabelName(node69);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate71 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node73 = null;
        com.google.javascript.rhino.Node node74 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node73);
        boolean boolean75 = com.google.javascript.jscomp.NodeUtil.isLabelName(node74);
        boolean boolean76 = booleanResultPredicate71.apply(node74);
        com.google.javascript.rhino.Node node78 = null;
        com.google.javascript.rhino.Node node79 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node78);
        boolean boolean80 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node79);
        boolean boolean81 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node74, node79);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate82 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node84 = null;
        com.google.javascript.rhino.Node node85 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node84);
        boolean boolean86 = com.google.javascript.jscomp.NodeUtil.isLabelName(node85);
        boolean boolean87 = booleanResultPredicate82.apply(node85);
        boolean boolean88 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node85);
        com.google.javascript.rhino.Node[] nodeArray89 = new com.google.javascript.rhino.Node[] { node69, node74, node85 };
        com.google.javascript.rhino.Node node90 = com.google.javascript.jscomp.NodeUtil.newCallNode(node64, nodeArray89);
        boolean boolean91 = numbericResultPredicate61.apply(node64);
        boolean boolean92 = matchDeclaration38.apply(node64);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate17);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate28);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(nodeArray35);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate40);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate71);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate82);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(nodeArray89);
        org.junit.Assert.assertNotNull(node90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isUndefined(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.referencesThis(node2);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection8 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node2);
        com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate numbericResultPredicate9 = new com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate();
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isLabelName(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node12);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isLabelName(node17);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate19 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node21);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isLabelName(node22);
        boolean boolean24 = booleanResultPredicate19.apply(node22);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node26);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node22, node27);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate30 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node32);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isLabelName(node33);
        boolean boolean35 = booleanResultPredicate30.apply(node33);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node33);
        com.google.javascript.rhino.Node[] nodeArray37 = new com.google.javascript.rhino.Node[] { node17, node22, node33 };
        com.google.javascript.rhino.Node node38 = com.google.javascript.jscomp.NodeUtil.newCallNode(node12, nodeArray37);
        boolean boolean39 = numbericResultPredicate9.apply(node12);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.valueCheck(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) numbericResultPredicate9);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.rhino.Node node43 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node42);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isLabelName(node43);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node43);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.containsFunction(node43);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.containsType(node43, (int) (byte) 100);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler49 = null;
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node43, abstractCompiler49);
        boolean boolean51 = numbericResultPredicate9.apply(node43);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isBooleanResultHelper(node43);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.isNew(node43);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.isBooleanResultHelper(node43);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.isGetProp(node43);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(nodeCollection8);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate19);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate30);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(nodeArray37);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = booleanResultPredicate0.apply(node3);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isLhs(node3, node8);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node8, abstractCompiler11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isString(node8);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.containsCall(node8);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate16 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isLabelName(node19);
        boolean boolean21 = booleanResultPredicate16.apply(node19);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node19);
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node19);
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node19);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate25 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isLabelName(node28);
        boolean boolean30 = booleanResultPredicate25.apply(node28);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node32);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node33);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node28, node33);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node24, node28);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node28);
        com.google.javascript.rhino.JSDocInfo jSDocInfo38 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node28);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.referencesThis(node28);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node8, node28);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isString(node8);
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate16);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(booleanResultPredicate25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(jSDocInfo38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        boolean boolean5 = booleanResultPredicate0.apply(node3);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node3, node8);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node8);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.mayBeStringHelper(node8);
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        com.google.javascript.jscomp.NodeUtil.MatchNotFunction matchNotFunction1 = new com.google.javascript.jscomp.NodeUtil.MatchNotFunction();
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isLabelName(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node4);
        boolean boolean8 = matchNotFunction1.apply(node4);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node4);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isLabelName(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node12);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isUndefined(node12);
        com.google.javascript.rhino.JSDocInfo jSDocInfo16 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node12);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate17 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isLabelName(node20);
        boolean boolean22 = booleanResultPredicate17.apply(node20);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node20);
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node20);
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node20);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node12, node20);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.containsType(node12, (int) (short) 0);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(node12);
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node12);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isLhs(node4, node12);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isBooleanResult(node12);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isNew(node12);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(jSDocInfo16);
        org.junit.Assert.assertNotNull(booleanResultPredicate17);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }
}

