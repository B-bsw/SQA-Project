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
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "$$constant", false);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique4 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = inlineRenamer3.forChildScope();
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str9 = inlineRenamer3.getReplacementName("instanceof");
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.Normalize normalize2 = new com.google.javascript.jscomp.Normalize(abstractCompiler0, true);
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node6, node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node6);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isNew(node6);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isThis(node6);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node6);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler16 = null;
        com.google.javascript.jscomp.Normalize.NormalizeStatements normalizeStatements18 = new com.google.javascript.jscomp.Normalize.NormalizeStatements(abstractCompiler16, false);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal19 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node23, node27);
        int int30 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node23, "");
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isCall(node23);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isCall(node23);
        com.google.javascript.rhino.Node node36 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node40 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node36, node40);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node36);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node23, node36);
        com.google.javascript.rhino.Node node47 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node51 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node47, node51);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType55 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean56 = com.google.javascript.jscomp.NodeUtil.containsType(node51, (int) (short) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType55);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType58 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        int int59 = matchNodeType58.type;
        com.google.javascript.rhino.Node node63 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node67 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean68 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node63, node67);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType71 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean72 = com.google.javascript.jscomp.NodeUtil.containsType(node67, (int) (short) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType71);
        boolean boolean73 = com.google.javascript.jscomp.NodeUtil.has(node51, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType58, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType71);
        boolean boolean74 = normalizeStatements18.shouldTraverse(nodeTraversal19, node36, node51);
        int int76 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node51, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            normalize2.process(node6, node51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 10 + "'", int59 == 10);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node4, node8);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType12 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.containsType(node8, (int) (short) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType12);
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType21 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.containsType(node18, (int) (short) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType21);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.containsType(node8, (int) 'a', (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType21);
        java.lang.String str24 = com.google.javascript.jscomp.NodeUtil.getStringValue(node8);
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node8);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isThis(node8);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node8);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node8, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = com.google.javascript.jscomp.NodeUtil.getPrototypePropertyName(node8);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -7");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node4, node8);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType12 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.containsType(node8, (int) (short) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType12);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType15 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        int int16 = matchNodeType15.type;
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node20, node24);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType28 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.containsType(node24, (int) (short) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType28);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.has(node8, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType15, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType28);
        com.google.javascript.rhino.Node node32 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", node8, "||");
        // The following exception was thrown during execution in test generation
        try {
            int int33 = com.google.javascript.jscomp.NodeUtil.getOpFromAssignmentOp(node32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Not an assiment op");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node32);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.Normalize.NormalizeStatements normalizeStatements2 = new com.google.javascript.jscomp.Normalize.NormalizeStatements(abstractCompiler0, false);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique4 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal5 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node9, node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node9);
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node19, node23);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isLhs(node9, node23);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isVar(node9);
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node34 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node30, node34);
        com.google.javascript.rhino.Node node36 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node30);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isConstantName(node30);
        boolean boolean38 = makeDeclaredNamesUnique4.shouldTraverse(nodeTraversal5, node9, node30);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node9);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique40 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal41 = null;
        com.google.javascript.rhino.Node node45 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node49 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node45, node49);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node45);
        com.google.javascript.rhino.Node node55 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node59 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node55, node59);
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.isLhs(node45, node59);
        boolean boolean62 = com.google.javascript.jscomp.NodeUtil.isVar(node45);
        com.google.javascript.rhino.Node node66 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node70 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean71 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node66, node70);
        com.google.javascript.rhino.Node node72 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node66);
        boolean boolean73 = com.google.javascript.jscomp.NodeUtil.isConstantName(node66);
        boolean boolean74 = makeDeclaredNamesUnique40.shouldTraverse(nodeTraversal41, node45, node66);
        boolean boolean75 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node66);
        normalizeStatements2.visit(nodeTraversal3, node9, node66);
        boolean boolean77 = com.google.javascript.jscomp.NodeUtil.isExprCall(node9);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNull(node72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "%=", true);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str6 = inlineRenamer3.getReplacementName("instanceof");
        java.lang.String str8 = inlineRenamer3.getReplacementName("%=");
        java.lang.String str10 = inlineRenamer3.getReplacementName("$$");
        java.lang.String str12 = inlineRenamer3.getReplacementName("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node3, node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node3);
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node13, node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isLhs(node3, node17);
        int int21 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node3, "||");
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        java.lang.String str2 = contextualRenamer0.getReplacementName("||");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = contextualRenamer0.forChildScope();
        contextualRenamer0.addDeclaredName("||");
        java.lang.String str7 = contextualRenamer0.getReplacementName("||");
        java.lang.String str9 = contextualRenamer0.getReplacementName("typeof");
        boolean boolean10 = contextualRenamer0.stripConstIfReplaced();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.Normalize.NormalizeStatements normalizeStatements2 = new com.google.javascript.jscomp.Normalize.NormalizeStatements(abstractCompiler0, false);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node7, node11);
        int int14 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node7, "");
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isCall(node7);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isCall(node7);
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node20, node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node20);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node7, node20);
        com.google.javascript.rhino.Node node31 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node31, node35);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType39 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.containsType(node35, (int) (short) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType39);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType42 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        int int43 = matchNodeType42.type;
        com.google.javascript.rhino.Node node47 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node51 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node47, node51);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType55 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean56 = com.google.javascript.jscomp.NodeUtil.containsType(node51, (int) (short) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType55);
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.has(node35, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType42, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType55);
        boolean boolean58 = normalizeStatements2.shouldTraverse(nodeTraversal3, node20, node35);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal59 = null;
        com.google.javascript.rhino.Node node63 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node67 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean68 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node63, node67);
        boolean boolean69 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node63);
        boolean boolean70 = com.google.javascript.jscomp.NodeUtil.isNew(node63);
        boolean boolean71 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node63);
        boolean boolean72 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node63);
        boolean boolean74 = com.google.javascript.jscomp.NodeUtil.isNodeTypeReferenced(node63, 0);
        boolean boolean75 = com.google.javascript.jscomp.NodeUtil.isFunction(node63);
        boolean boolean76 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node63);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer77 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique78 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) contextualRenamer77);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal79 = null;
        com.google.javascript.rhino.Node node83 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean84 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node83);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate86 = null;
        boolean boolean87 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node83, "hi!", nodePredicate86);
        boolean boolean88 = com.google.javascript.jscomp.NodeUtil.containsCall(node83);
        boolean boolean89 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node83);
        com.google.javascript.rhino.Node node90 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode();
        boolean boolean91 = com.google.javascript.jscomp.NodeUtil.containsFunctionDeclaration(node90);
        makeDeclaredNamesUnique78.visit(nodeTraversal79, node83, node90);
        boolean boolean93 = normalizeStatements2.shouldTraverse(nodeTraversal59, node63, node83);
        boolean boolean94 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node83);
        boolean boolean95 = com.google.javascript.jscomp.NodeUtil.isAnonymousFunction(node83);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 10 + "'", int43 == 10);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(node90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType6 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.containsType(node3, (int) (short) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node3);
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node12, node16);
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node12);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isConstantName(node12);
        java.lang.String[] strArray21 = new java.lang.String[] { "||" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node12, (java.util.Set<java.lang.String>) strSet22);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node3, (java.util.Set<java.lang.String>) strSet22);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "||" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node3, node7);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node3);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isConstantName(node3);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isVar(node3);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node3);
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node16, node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node16);
        int int24 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node16, "hi!");
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType31 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.containsType(node28, (int) (short) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType31);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node16, node28);
        com.google.javascript.rhino.Node node37 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node41 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node37, node41);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node37);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isNew(node37);
        java.lang.String[] strArray46 = new java.lang.String[] { "||" };
        java.util.LinkedHashSet<java.lang.String> strSet47 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet47, strArray46);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node37, (java.util.Set<java.lang.String>) strSet47);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node16, (java.util.Set<java.lang.String>) strSet47);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node3, (java.util.Set<java.lang.String>) strSet47);
        com.google.javascript.rhino.Node node57 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node61 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean62 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node57, node61);
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node57);
        com.google.javascript.rhino.Node node64 = com.google.javascript.jscomp.NodeUtil.newName("", node57);
        boolean boolean65 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node57);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType67 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) ' ');
        int int68 = com.google.javascript.jscomp.NodeUtil.getCount(node57, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType67);
        boolean boolean69 = com.google.javascript.jscomp.NodeUtil.containsType(node3, (-1), (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType67);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "||" });
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node3, node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node3);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isNew(node3);
        java.lang.String[] strArray12 = new java.lang.String[] { "||" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node3, (java.util.Set<java.lang.String>) strSet13);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "||" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal1 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node7, node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node7);
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node17, node21);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isLhs(node7, node21);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isVar(node7);
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node32 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node28, node32);
        com.google.javascript.rhino.Node node34 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node28);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isConstantName(node28);
        boolean boolean36 = makeDeclaredNamesUnique2.shouldTraverse(nodeTraversal3, node7, node28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal37 = null;
        com.google.javascript.rhino.Node node41 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node41);
        com.google.javascript.rhino.Node node46 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node50 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node46, node50);
        makeDeclaredNamesUnique2.visit(nodeTraversal37, node41, node46);
        com.google.javascript.rhino.Node node56 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node60 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node56, node60);
        boolean boolean62 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node56);
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.isNew(node56);
        java.lang.String[] strArray65 = new java.lang.String[] { "||" };
        java.util.LinkedHashSet<java.lang.String> strSet66 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet66, strArray65);
        boolean boolean68 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node56, (java.util.Set<java.lang.String>) strSet66);
        makeDeclaredNamesUnique0.visit(nodeTraversal1, node41, node56);
        boolean boolean70 = com.google.javascript.jscomp.NodeUtil.containsCall(node41);
        java.lang.String str71 = com.google.javascript.jscomp.NodeUtil.getStringValue(node41);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertArrayEquals(strArray65, new java.lang.String[] { "||" });
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique1 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node6, node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node6);
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node16, node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isLhs(node6, node20);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isVar(node6);
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node31 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node27, node31);
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node27);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isConstantName(node27);
        boolean boolean35 = makeDeclaredNamesUnique1.shouldTraverse(nodeTraversal2, node6, node27);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isVar(node27);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isConstantName(node27);
        com.google.javascript.rhino.Node node39 = com.google.javascript.jscomp.NodeUtil.newName("", node27, "$$constant");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isStatement(node27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node39);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node3, node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node3);
        int int11 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node3, "hi!");
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType18 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.containsType(node15, (int) (short) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node3, node15);
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node24, node28);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node24);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isNew(node24);
        java.lang.String[] strArray33 = new java.lang.String[] { "||" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node24, (java.util.Set<java.lang.String>) strSet34);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node3, (java.util.Set<java.lang.String>) strSet34);
        com.google.javascript.rhino.Node node42 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node46 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node42, node46);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node42);
        com.google.javascript.rhino.Node node52 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node56 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node52, node56);
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.isLhs(node42, node56);
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.referencesThis(node56);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType62 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        int int63 = matchNodeType62.type;
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node56, "||", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType62);
        com.google.javascript.rhino.Node node68 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node72 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean73 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node68, node72);
        boolean boolean74 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node68);
        boolean boolean75 = com.google.javascript.jscomp.NodeUtil.isNew(node68);
        boolean boolean76 = com.google.javascript.jscomp.NodeUtil.isThis(node68);
        boolean boolean77 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node68);
        boolean boolean78 = matchNodeType62.apply(node68);
        boolean boolean79 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node3, "instanceof", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType62);
        com.google.javascript.rhino.Node node80 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node3);
        boolean boolean81 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "||" });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 10 + "'", int63 == 10);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNull(node80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.Normalize.NormalizeStatements normalizeStatements2 = new com.google.javascript.jscomp.Normalize.NormalizeStatements(abstractCompiler0, false);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique4 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal5 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node9, node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node9);
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node19, node23);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isLhs(node9, node23);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isVar(node9);
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node34 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node30, node34);
        com.google.javascript.rhino.Node node36 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node30);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isConstantName(node30);
        boolean boolean38 = makeDeclaredNamesUnique4.shouldTraverse(nodeTraversal5, node9, node30);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node9);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique40 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal41 = null;
        com.google.javascript.rhino.Node node45 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node49 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node45, node49);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node45);
        com.google.javascript.rhino.Node node55 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node59 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node55, node59);
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.isLhs(node45, node59);
        boolean boolean62 = com.google.javascript.jscomp.NodeUtil.isVar(node45);
        com.google.javascript.rhino.Node node66 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node70 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean71 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node66, node70);
        com.google.javascript.rhino.Node node72 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node66);
        boolean boolean73 = com.google.javascript.jscomp.NodeUtil.isConstantName(node66);
        boolean boolean74 = makeDeclaredNamesUnique40.shouldTraverse(nodeTraversal41, node45, node66);
        boolean boolean75 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node66);
        normalizeStatements2.visit(nodeTraversal3, node9, node66);
        boolean boolean77 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node9);
        boolean boolean78 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(node9);
        boolean boolean79 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node9);
        boolean boolean80 = com.google.javascript.jscomp.NodeUtil.isThis(node9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean81 = com.google.javascript.jscomp.NodeUtil.isFunctionAnonymous(node9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNull(node72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "%=", true);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique9 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique9.exitScope(nodeTraversal10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal1 = null;
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node5, node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node5);
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node15, node19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isLhs(node5, node19);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isVar(node5);
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node26, node30);
        com.google.javascript.rhino.Node node32 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node26);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isConstantName(node26);
        boolean boolean34 = makeDeclaredNamesUnique0.shouldTraverse(nodeTraversal1, node5, node26);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isVar(node26);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isAnonymousFunction(node26);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node26, "^");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node39 = com.google.javascript.jscomp.NodeUtil.getAssignedValue(node26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
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
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isNew(node3);
        java.lang.String str35 = com.google.javascript.jscomp.NodeUtil.getStringValue(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "||" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node3, node7);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType11 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.containsType(node7, (int) (short) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType11);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.Normalize.VerifyConstants verifyConstants15 = new com.google.javascript.jscomp.Normalize.VerifyConstants(abstractCompiler13, false);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node20, node24);
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node20);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isConstantName(node20);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.containsFunctionDeclaration(node20);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique29 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        com.google.javascript.rhino.Node node34 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node38 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node34, node38);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node34);
        com.google.javascript.rhino.Node node44 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node48 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node44, node48);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isLhs(node34, node48);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isVar(node34);
        com.google.javascript.rhino.Node node55 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node59 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node55, node59);
        com.google.javascript.rhino.Node node61 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node55);
        boolean boolean62 = com.google.javascript.jscomp.NodeUtil.isConstantName(node55);
        boolean boolean63 = makeDeclaredNamesUnique29.shouldTraverse(nodeTraversal30, node34, node55);
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node55);
        verifyConstants15.visit(nodeTraversal16, node20, node55);
        boolean boolean66 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node7, node55);
        com.google.javascript.rhino.Node node71 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node75 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean76 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node71, node75);
        boolean boolean77 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node71);
        com.google.javascript.rhino.Node node81 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node85 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean86 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node81, node85);
        boolean boolean87 = com.google.javascript.jscomp.NodeUtil.isLhs(node71, node85);
        boolean boolean88 = com.google.javascript.jscomp.NodeUtil.isForIn(node71);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType90 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) ' ');
        int int91 = com.google.javascript.jscomp.NodeUtil.getCount(node71, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType90);
        int int92 = matchNodeType90.type;
        boolean boolean93 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node55, "%=", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType90);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(node61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 32 + "'", int92 == 32);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        com.google.javascript.rhino.Node node0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node0, "$$constant");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node4, node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node4);
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newName("", node4);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node4);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isFunction(node4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isFunctionAnonymous(node4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node4);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate7 = null;
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node4, "hi!", nodePredicate7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node4);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node4);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isVar(node4);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node4);
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newName("||", node4);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node3, node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node3);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isNew(node3);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node3);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isExprCall(node3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isFunctionAnonymous(node3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique1 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node6, node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node6);
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node16, node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isLhs(node6, node20);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isVar(node6);
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node31 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node27, node31);
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node27);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isConstantName(node27);
        boolean boolean35 = makeDeclaredNamesUnique1.shouldTraverse(nodeTraversal2, node6, node27);
        com.google.javascript.rhino.Node node37 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", node27, "^");
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node37);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isFunctionAnonymous(node37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node4, node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node4);
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node14, node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isLhs(node4, node18);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.referencesThis(node18);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node18);
        java.lang.String[] strArray25 = new java.lang.String[] { "^", "" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node18, (java.util.Set<java.lang.String>) strSet26);
        java.lang.String str29 = com.google.javascript.jscomp.NodeUtil.getStringValue(node18);
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newName("instanceof", node18);
        com.google.javascript.rhino.Node node34 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node38 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node34, node38);
        int int41 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node34, "");
        com.google.javascript.rhino.Node node46 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node50 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node46, node50);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType54 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.containsType(node50, (int) (short) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType54);
        com.google.javascript.rhino.Node node60 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType63 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.containsType(node60, (int) (short) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType63);
        boolean boolean65 = com.google.javascript.jscomp.NodeUtil.containsType(node50, (int) 'a', (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType63);
        boolean boolean66 = com.google.javascript.jscomp.NodeUtil.containsType(node34, (int) ' ', (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType63);
        com.google.javascript.rhino.Node node67 = com.google.javascript.jscomp.NodeUtil.newExpr(node34);
        com.google.javascript.rhino.JSDocInfo jSDocInfo68 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node34);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node18, node34);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean70 = com.google.javascript.jscomp.NodeUtil.isVarArgsFunction(node34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "^", "" });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNull(jSDocInfo68);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node3, node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.containsFunctionDeclaration(node3);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique10 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal11 = null;
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node15, node19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node15);
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node29 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node25, node29);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isLhs(node15, node29);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isVar(node15);
        com.google.javascript.rhino.Node node36 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node40 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node36, node40);
        com.google.javascript.rhino.Node node42 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node36);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isConstantName(node36);
        boolean boolean44 = makeDeclaredNamesUnique10.shouldTraverse(nodeTraversal11, node15, node36);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isVar(node36);
        java.lang.String str46 = com.google.javascript.jscomp.NodeUtil.getStringValue(node36);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node3, node36);
        com.google.javascript.rhino.Node node51 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node55 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean56 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node51, node55);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType59 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.containsType(node55, (int) (short) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType59);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType62 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        int int63 = matchNodeType62.type;
        com.google.javascript.rhino.Node node67 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node71 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean72 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node67, node71);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType75 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean76 = com.google.javascript.jscomp.NodeUtil.containsType(node71, (int) (short) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType75);
        boolean boolean77 = com.google.javascript.jscomp.NodeUtil.has(node55, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType62, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType75);
        boolean boolean78 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node55);
        boolean boolean79 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node55);
        boolean boolean80 = com.google.javascript.jscomp.NodeUtil.isGet(node55);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node3, node55);
        java.lang.String str82 = com.google.javascript.jscomp.NodeUtil.getSourceName(node3);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node83 = com.google.javascript.jscomp.NodeUtil.getFunctionBody(node3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 10 + "'", int63 == 10);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNull(str82);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node3);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node10, node14);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType18 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.containsType(node14, (int) (short) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType18);
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType27 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.containsType(node24, (int) (short) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.containsType(node14, (int) 'a', (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType27);
        java.lang.String str30 = com.google.javascript.jscomp.NodeUtil.getStringValue(node14);
        com.google.javascript.rhino.Node node31 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node14);
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node39 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node35, node39);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node35);
        com.google.javascript.rhino.Node node45 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node49 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node45, node49);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isLhs(node35, node49);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.referencesThis(node49);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node49);
        java.lang.String[] strArray56 = new java.lang.String[] { "^", "" };
        java.util.LinkedHashSet<java.lang.String> strSet57 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet57, strArray56);
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node49, (java.util.Set<java.lang.String>) strSet57);
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node14, (java.util.Set<java.lang.String>) strSet57);
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node3, (java.util.Set<java.lang.String>) strSet57);
        com.google.javascript.rhino.JSDocInfo jSDocInfo62 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] { "^", "" });
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNull(jSDocInfo62);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node4, node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node4);
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newName("", node4);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node4);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType14 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) ' ');
        int int15 = com.google.javascript.jscomp.NodeUtil.getCount(node4, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType14);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique16 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal17 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node21, node25);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node21);
        com.google.javascript.rhino.Node node31 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node31, node35);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isLhs(node21, node35);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isVar(node21);
        com.google.javascript.rhino.Node node42 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node46 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node42, node46);
        com.google.javascript.rhino.Node node48 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node42);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.isConstantName(node42);
        boolean boolean50 = makeDeclaredNamesUnique16.shouldTraverse(nodeTraversal17, node21, node42);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node42);
        com.google.javascript.rhino.Node node55 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node59 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node55, node59);
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node55);
        boolean boolean62 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node42, node55);
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node55);
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node55);
        boolean boolean65 = com.google.javascript.jscomp.NodeUtil.isLhs(node4, node55);
        boolean boolean66 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node4);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.Normalize normalize2 = new com.google.javascript.jscomp.Normalize(abstractCompiler0, false);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node8, node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node8);
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node18, node22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isLhs(node8, node22);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isVar(node8);
        com.google.javascript.rhino.Node node29 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node29, node33);
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node29);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isConstantName(node29);
        boolean boolean37 = makeDeclaredNamesUnique3.shouldTraverse(nodeTraversal4, node8, node29);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isVar(node29);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isAnonymousFunction(node29);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node29, "^");
        com.google.javascript.rhino.Node node45 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node45);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate48 = null;
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node45, "hi!", nodePredicate48);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.containsCall(node45);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node45);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node45);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.containsCall(node45);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.isConstantName(node45);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.isGet(node45);
        boolean boolean56 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node45);
        // The following exception was thrown during execution in test generation
        try {
            normalize2.process(node29, node45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique1 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) contextualRenamer0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node6);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate9 = null;
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node6, "hi!", nodePredicate9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.containsCall(node6);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node6);
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode();
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.containsFunctionDeclaration(node13);
        makeDeclaredNamesUnique1.visit(nodeTraversal2, node6, node13);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler16 = null;
        com.google.javascript.jscomp.Normalize.VerifyConstants verifyConstants18 = new com.google.javascript.jscomp.Normalize.VerifyConstants(abstractCompiler16, true);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal19 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique20 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal21 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node29 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node25, node29);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node25);
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node39 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node35, node39);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isLhs(node25, node39);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isVar(node25);
        com.google.javascript.rhino.Node node46 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node50 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node46, node50);
        com.google.javascript.rhino.Node node52 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node46);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.isConstantName(node46);
        boolean boolean54 = makeDeclaredNamesUnique20.shouldTraverse(nodeTraversal21, node25, node46);
        com.google.javascript.rhino.Node node58 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType61 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean62 = com.google.javascript.jscomp.NodeUtil.containsType(node58, (int) (short) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType61);
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node58);
        boolean boolean64 = verifyConstants18.shouldTraverse(nodeTraversal19, node46, node58);
        boolean boolean65 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node6, node58);
        com.google.javascript.rhino.Node node66 = com.google.javascript.jscomp.NodeUtil.newExpr(node58);
        boolean boolean67 = com.google.javascript.jscomp.NodeUtil.containsCall(node66);
        boolean boolean68 = com.google.javascript.jscomp.NodeUtil.isNew(node66);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "%=", true);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = inlineRenamer3.forChildScope();
        java.lang.String str10 = renamer8.getReplacementName("%=");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType1 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (byte) 1);
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node5, node9);
        int int12 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node5, "");
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node17, node21);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType25 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.containsType(node21, (int) (short) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType25);
        com.google.javascript.rhino.Node node31 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType34 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.containsType(node31, (int) (short) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType34);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.containsType(node21, (int) 'a', (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType34);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.containsType(node5, (int) ' ', (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType34);
        com.google.javascript.rhino.Node node38 = com.google.javascript.jscomp.NodeUtil.newExpr(node5);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isAnonymousFunction(node5);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node5);
        boolean boolean41 = matchNodeType1.apply(node5);
        com.google.javascript.rhino.Node node42 = com.google.javascript.jscomp.NodeUtil.getLoopCodeBlock(node5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean43 = com.google.javascript.jscomp.NodeUtil.hasCatchHandler(node42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(node42);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType7 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.containsType(node4, (int) (short) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node4);
        int int11 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node4, "^");
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node4);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isExprCall(node4);
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("typeof", node4, "$$constant");
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node15);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique17 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node22, node26);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node22);
        com.google.javascript.rhino.Node node32 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node36 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node32, node36);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isLhs(node22, node36);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isVar(node22);
        com.google.javascript.rhino.Node node43 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node47 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node43, node47);
        com.google.javascript.rhino.Node node49 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node43);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isConstantName(node43);
        boolean boolean51 = makeDeclaredNamesUnique17.shouldTraverse(nodeTraversal18, node22, node43);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isVar(node43);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.isAnonymousFunction(node43);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node15, node43);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.Normalize.PropogateConstantAnnotations propogateConstantAnnotations3 = new com.google.javascript.jscomp.Normalize.PropogateConstantAnnotations(abstractCompiler1, true);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node8);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate11 = null;
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node8, "hi!", nodePredicate11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node8);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node8);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique15 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node20, node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node20);
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node34 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node30, node34);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isLhs(node20, node34);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isVar(node20);
        com.google.javascript.rhino.Node node41 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node45 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node41, node45);
        com.google.javascript.rhino.Node node47 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node41);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isConstantName(node41);
        boolean boolean49 = makeDeclaredNamesUnique15.shouldTraverse(nodeTraversal16, node20, node41);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal50 = null;
        com.google.javascript.rhino.Node node54 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node54);
        com.google.javascript.rhino.Node node59 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node63 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node59, node63);
        makeDeclaredNamesUnique15.visit(nodeTraversal50, node54, node59);
        boolean boolean66 = propogateConstantAnnotations3.shouldTraverse(nodeTraversal4, node8, node59);
        com.google.javascript.rhino.Node node67 = com.google.javascript.jscomp.NodeUtil.newVarNode("||", node59);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(node67);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "%=", true);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$constant");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer7);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "%=", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = inlineRenamer3.forChildScope();
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique9 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        inlineRenamer3.addDeclaredName("");
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node3, node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node3);
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node13, node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isLhs(node3, node17);
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node23, node27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node23);
        int int31 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node23, "hi!");
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node23, "");
        com.google.javascript.rhino.Node node38 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType41 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.containsType(node38, (int) (short) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType41);
        com.google.javascript.rhino.Node node47 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType50 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.containsType(node47, (int) (short) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType50);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node47);
        com.google.javascript.rhino.Node node56 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node60 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node56, node60);
        com.google.javascript.rhino.Node node62 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node56);
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.isConstantName(node56);
        java.lang.String[] strArray65 = new java.lang.String[] { "||" };
        java.util.LinkedHashSet<java.lang.String> strSet66 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet66, strArray65);
        boolean boolean68 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node56, (java.util.Set<java.lang.String>) strSet66);
        boolean boolean69 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node47, (java.util.Set<java.lang.String>) strSet66);
        com.google.javascript.rhino.Node node71 = com.google.javascript.jscomp.NodeUtil.newName("%=", node47, "instanceof");
        boolean boolean72 = matchNodeType41.apply(node47);
        boolean boolean73 = com.google.javascript.jscomp.NodeUtil.isNodeTypeReferenced(node23, (int) '#', (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType41);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.NodeUtil.removeChild(node17, node23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Invalid attempt to remove node: NAME hi! of NAME hi!");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(node62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertArrayEquals(strArray65, new java.lang.String[] { "||" });
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "%=", true);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str6 = inlineRenamer3.getReplacementName("instanceof");
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = inlineRenamer3.forChildScope();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(renamer8);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isSimpleOperatorType((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer1 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        java.lang.String str3 = contextualRenamer1.getReplacementName("||");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = contextualRenamer1.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.Normalize.VerifyConstants verifyConstants9 = new com.google.javascript.jscomp.Normalize.VerifyConstants(abstractCompiler7, false);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node14, node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node14);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isNew(node14);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isThis(node14);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node14);
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node31 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node27, node31);
        int int34 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node27, "");
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isCall(node27);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isAssign(node27);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isFunction(node27);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.containsCall(node27);
        verifyConstants9.visit(nodeTraversal10, node14, node27);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isConstantName(node27);
        com.google.javascript.rhino.Node node44 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node48 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node44, node48);
        int int51 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node44, "");
        com.google.javascript.rhino.Node node56 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node60 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node56, node60);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType64 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean65 = com.google.javascript.jscomp.NodeUtil.containsType(node60, (int) (short) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType64);
        com.google.javascript.rhino.Node node70 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType73 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean74 = com.google.javascript.jscomp.NodeUtil.containsType(node70, (int) (short) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType73);
        boolean boolean75 = com.google.javascript.jscomp.NodeUtil.containsType(node60, (int) 'a', (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType73);
        boolean boolean76 = com.google.javascript.jscomp.NodeUtil.containsType(node44, (int) ' ', (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType73);
        com.google.javascript.rhino.Node node77 = com.google.javascript.jscomp.NodeUtil.newExpr(node44);
        makeDeclaredNamesUnique5.visit(nodeTraversal6, node27, node44);
        boolean boolean79 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node27);
        com.google.javascript.rhino.Node node81 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("$$constant", node27, "^");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean82 = com.google.javascript.jscomp.NodeUtil.isFunctionAnonymous(node27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(node81);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node4, node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node4);
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newName("", node4);
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isForIn(node11);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        com.google.javascript.jscomp.Normalize.VerifyConstants verifyConstants16 = new com.google.javascript.jscomp.Normalize.VerifyConstants(abstractCompiler14, false);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal17 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node21, node25);
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node21);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isConstantName(node21);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.containsFunctionDeclaration(node21);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique30 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal31 = null;
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node39 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node35, node39);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node35);
        com.google.javascript.rhino.Node node45 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node49 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node45, node49);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isLhs(node35, node49);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isVar(node35);
        com.google.javascript.rhino.Node node56 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node60 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node56, node60);
        com.google.javascript.rhino.Node node62 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node56);
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.isConstantName(node56);
        boolean boolean64 = makeDeclaredNamesUnique30.shouldTraverse(nodeTraversal31, node35, node56);
        boolean boolean65 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node56);
        verifyConstants16.visit(nodeTraversal17, node21, node56);
        boolean boolean67 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node11, node56);
        com.google.javascript.rhino.JSDocInfo jSDocInfo68 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node56);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(node62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNull(jSDocInfo68);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node4);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node4, "%=");
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newName("instanceof", node4);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node3, node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node3);
        int int11 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node3, "hi!");
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node3, (int) (byte) 0);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        java.lang.String str2 = contextualRenamer0.getReplacementName("||");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = contextualRenamer0.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = contextualRenamer0.forChildScope();
        contextualRenamer0.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = contextualRenamer0.forChildScope();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer7);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node4, node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node4);
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newName("", node4);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node4);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType14 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) ' ');
        int int15 = com.google.javascript.jscomp.NodeUtil.getCount(node4, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType14);
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newExpr(node4);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isFunctionAnonymous(node4);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isGet(node4);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node4, node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node4);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isNew(node4);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isThis(node4);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isFunction(node4);
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newName("^", node4);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique15 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node20, node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node20);
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node34 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node30, node34);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isLhs(node20, node34);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isVar(node20);
        com.google.javascript.rhino.Node node41 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node45 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node41, node45);
        com.google.javascript.rhino.Node node47 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node41);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isConstantName(node41);
        boolean boolean49 = makeDeclaredNamesUnique15.shouldTraverse(nodeTraversal16, node20, node41);
        com.google.javascript.rhino.Node node54 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node58 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node54, node58);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType62 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.containsType(node58, (int) (short) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType62);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType65 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        int int66 = matchNodeType65.type;
        com.google.javascript.rhino.Node node70 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node74 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean75 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node70, node74);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType78 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean79 = com.google.javascript.jscomp.NodeUtil.containsType(node74, (int) (short) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType78);
        boolean boolean80 = com.google.javascript.jscomp.NodeUtil.has(node58, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType65, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType78);
        boolean boolean81 = com.google.javascript.jscomp.NodeUtil.isNodeTypeReferenced(node20, (int) (byte) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType78);
        com.google.javascript.rhino.Node node85 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node89 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean90 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node85, node89);
        boolean boolean91 = com.google.javascript.jscomp.NodeUtil.containsFunctionDeclaration(node85);
        boolean boolean92 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node20, node85);
        boolean boolean93 = com.google.javascript.jscomp.NodeUtil.isLhs(node4, node20);
        int int95 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node4, "");
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 10 + "'", int66 == 10);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertNotNull(node89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 0 + "'", int95 == 0);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node3);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate6 = null;
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node3, "hi!", nodePredicate6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.containsCall(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node3);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isForIn(node3);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node3);
        int int13 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node3, (-1));
        int int15 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node3, (int) (short) 10);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        contextualRenamer0.addDeclaredName("||");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = contextualRenamer0.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = contextualRenamer0.forChildScope();
        contextualRenamer0.addDeclaredName("instanceof");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = contextualRenamer0.forChildScope();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer7);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.Normalize.NormalizeStatements normalizeStatements2 = new com.google.javascript.jscomp.Normalize.NormalizeStatements(abstractCompiler0, false);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique4 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal5 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node9, node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node9);
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node19, node23);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isLhs(node9, node23);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isVar(node9);
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node34 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node30, node34);
        com.google.javascript.rhino.Node node36 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node30);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isConstantName(node30);
        boolean boolean38 = makeDeclaredNamesUnique4.shouldTraverse(nodeTraversal5, node9, node30);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node9);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique40 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal41 = null;
        com.google.javascript.rhino.Node node45 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node49 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node45, node49);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node45);
        com.google.javascript.rhino.Node node55 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node59 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node55, node59);
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.isLhs(node45, node59);
        boolean boolean62 = com.google.javascript.jscomp.NodeUtil.isVar(node45);
        com.google.javascript.rhino.Node node66 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node70 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean71 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node66, node70);
        com.google.javascript.rhino.Node node72 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node66);
        boolean boolean73 = com.google.javascript.jscomp.NodeUtil.isConstantName(node66);
        boolean boolean74 = makeDeclaredNamesUnique40.shouldTraverse(nodeTraversal41, node45, node66);
        boolean boolean75 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node66);
        normalizeStatements2.visit(nodeTraversal3, node9, node66);
        boolean boolean77 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node9);
        boolean boolean78 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node9);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNull(node72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.Normalize.VerifyConstants verifyConstants2 = new com.google.javascript.jscomp.Normalize.VerifyConstants(abstractCompiler0, false);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.Normalize.VerifyConstants verifyConstants6 = new com.google.javascript.jscomp.Normalize.VerifyConstants(abstractCompiler4, true);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique8 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node13, node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node13);
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node23, node27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isLhs(node13, node27);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isVar(node13);
        com.google.javascript.rhino.Node node34 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node38 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node34, node38);
        com.google.javascript.rhino.Node node40 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node34);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isConstantName(node34);
        boolean boolean42 = makeDeclaredNamesUnique8.shouldTraverse(nodeTraversal9, node13, node34);
        com.google.javascript.rhino.Node node46 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType49 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.containsType(node46, (int) (short) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType49);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node46);
        boolean boolean52 = verifyConstants6.shouldTraverse(nodeTraversal7, node34, node46);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique53 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal54 = null;
        com.google.javascript.rhino.Node node58 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node62 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node58, node62);
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node58);
        com.google.javascript.rhino.Node node68 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node72 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean73 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node68, node72);
        boolean boolean74 = com.google.javascript.jscomp.NodeUtil.isLhs(node58, node72);
        boolean boolean75 = com.google.javascript.jscomp.NodeUtil.isVar(node58);
        com.google.javascript.rhino.Node node79 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node83 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean84 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node79, node83);
        com.google.javascript.rhino.Node node85 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node79);
        boolean boolean86 = com.google.javascript.jscomp.NodeUtil.isConstantName(node79);
        boolean boolean87 = makeDeclaredNamesUnique53.shouldTraverse(nodeTraversal54, node58, node79);
        boolean boolean88 = com.google.javascript.jscomp.NodeUtil.isVar(node79);
        boolean boolean89 = com.google.javascript.jscomp.NodeUtil.isConstantName(node79);
        boolean boolean90 = verifyConstants2.shouldTraverse(nodeTraversal3, node34, node79);
        boolean boolean91 = com.google.javascript.jscomp.NodeUtil.isVar(node34);
        boolean boolean92 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node34);
        boolean boolean93 = com.google.javascript.jscomp.NodeUtil.isFunction(node34);
        boolean boolean94 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node34);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNull(node85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("instanceof", (int) (short) 0, 10);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isVar(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        java.lang.String str2 = contextualRenamer0.getReplacementName("||");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = contextualRenamer0.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique4 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.Normalize.VerifyConstants verifyConstants8 = new com.google.javascript.jscomp.Normalize.VerifyConstants(abstractCompiler6, false);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node13, node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node13);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isNew(node13);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isThis(node13);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node13);
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node26, node30);
        int int33 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node26, "");
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isCall(node26);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isAssign(node26);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isFunction(node26);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.containsCall(node26);
        verifyConstants8.visit(nodeTraversal9, node13, node26);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isConstantName(node26);
        com.google.javascript.rhino.Node node43 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node47 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node43, node47);
        int int50 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node43, "");
        com.google.javascript.rhino.Node node55 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node59 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node55, node59);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType63 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.containsType(node59, (int) (short) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType63);
        com.google.javascript.rhino.Node node69 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType72 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean73 = com.google.javascript.jscomp.NodeUtil.containsType(node69, (int) (short) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType72);
        boolean boolean74 = com.google.javascript.jscomp.NodeUtil.containsType(node59, (int) 'a', (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType72);
        boolean boolean75 = com.google.javascript.jscomp.NodeUtil.containsType(node43, (int) ' ', (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType72);
        com.google.javascript.rhino.Node node76 = com.google.javascript.jscomp.NodeUtil.newExpr(node43);
        makeDeclaredNamesUnique4.visit(nodeTraversal5, node26, node43);
        boolean boolean79 = com.google.javascript.jscomp.NodeUtil.containsType(node43, 0);
        boolean boolean80 = com.google.javascript.jscomp.NodeUtil.isName(node43);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "%=", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("^");
        inlineRenamer3.addDeclaredName("");
        java.lang.String str9 = inlineRenamer3.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique10 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal11 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique10.exitScope(nodeTraversal11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node3, node7);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node3);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isConstantName(node3);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.containsFunctionDeclaration(node3);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.Normalize.PropogateConstantAnnotations propogateConstantAnnotations14 = new com.google.javascript.jscomp.Normalize.PropogateConstantAnnotations(abstractCompiler12, true);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node19, node23);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node19);
        com.google.javascript.rhino.Node node29 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node29, node33);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isLhs(node19, node33);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isVar(node19);
        com.google.javascript.rhino.Node node40 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node44 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node40, node44);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node40);
        boolean boolean47 = propogateConstantAnnotations14.shouldTraverse(nodeTraversal15, node19, node40);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node3, node40);
        com.google.javascript.rhino.JSDocInfo jSDocInfo49 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node3);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node3);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isForIn(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNull(jSDocInfo49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        java.lang.String str2 = contextualRenamer0.getReplacementName("||");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = contextualRenamer0.forChildScope();
        boolean boolean4 = contextualRenamer0.stripConstIfReplaced();
        java.lang.String str6 = contextualRenamer0.getReplacementName("^");
        java.lang.String str8 = contextualRenamer0.getReplacementName("^");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node3);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate6 = null;
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node3, "hi!", nodePredicate6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.containsCall(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node3);
        int int11 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node3, "hi!");
        java.lang.String str12 = com.google.javascript.jscomp.NodeUtil.getStringValue(node3);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType14 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType(100);
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node18, node22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node18);
        int int26 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node18, "hi!");
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node18, (int) (byte) 0);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType30 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) ' ');
        com.google.javascript.rhino.Node node34 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node38 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node34, node38);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType42 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.containsType(node38, (int) (short) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType42);
        com.google.javascript.rhino.Node node48 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType51 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.containsType(node48, (int) (short) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType51);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.containsType(node38, (int) 'a', (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType51);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.has(node18, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType30, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType51);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.has(node3, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType14, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType51);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique56 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal57 = null;
        com.google.javascript.rhino.Node node61 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node65 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean66 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node61, node65);
        boolean boolean67 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node61);
        com.google.javascript.rhino.Node node71 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node75 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean76 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node71, node75);
        boolean boolean77 = com.google.javascript.jscomp.NodeUtil.isLhs(node61, node75);
        boolean boolean78 = com.google.javascript.jscomp.NodeUtil.isVar(node61);
        com.google.javascript.rhino.Node node82 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node86 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean87 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node82, node86);
        com.google.javascript.rhino.Node node88 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node82);
        boolean boolean89 = com.google.javascript.jscomp.NodeUtil.isConstantName(node82);
        boolean boolean90 = makeDeclaredNamesUnique56.shouldTraverse(nodeTraversal57, node61, node82);
        boolean boolean91 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node61);
        com.google.javascript.rhino.Node node92 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node61);
        boolean boolean93 = com.google.javascript.jscomp.NodeUtil.isString(node61);
        boolean boolean94 = matchNodeType51.apply(node61);
        boolean boolean95 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node61);
        boolean boolean96 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(node61);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean97 = com.google.javascript.jscomp.NodeUtil.isLabelName(node61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertNotNull(node86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNull(node88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNull(node92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        boolean boolean1 = contextualRenamer0.stripConstIfReplaced();
        boolean boolean2 = contextualRenamer0.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = contextualRenamer0.forChildScope();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(renamer3);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.Normalize.VerifyConstants verifyConstants3 = new com.google.javascript.jscomp.Normalize.VerifyConstants(abstractCompiler1, false);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node8, node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node8);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isNew(node8);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isThis(node8);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node8);
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node21, node25);
        int int28 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node21, "");
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isCall(node21);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isAssign(node21);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isFunction(node21);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.containsCall(node21);
        verifyConstants3.visit(nodeTraversal4, node8, node21);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isConstantName(node21);
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newName("hi!", node21);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node35);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.Normalize.PropogateConstantAnnotations propogateConstantAnnotations2 = new com.google.javascript.jscomp.Normalize.PropogateConstantAnnotations(abstractCompiler0, true);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node7);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique10 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal11 = null;
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node15, node19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node15);
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node29 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node25, node29);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isLhs(node15, node29);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isVar(node15);
        com.google.javascript.rhino.Node node36 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node40 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node36, node40);
        com.google.javascript.rhino.Node node42 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node36);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isConstantName(node36);
        boolean boolean44 = makeDeclaredNamesUnique10.shouldTraverse(nodeTraversal11, node15, node36);
        com.google.javascript.rhino.Node node46 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", node36, "^");
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isString(node46);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node46, "");
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isExprCall(node46);
        // The following exception was thrown during execution in test generation
        try {
            propogateConstantAnnotations2.visit(nodeTraversal3, node7, node46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "%=", true);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = inlineRenamer3.forChildScope();
        java.lang.String str11 = renamer9.getReplacementName("||");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal1 = null;
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("instanceof", (int) (short) 0, 10);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.Normalize.VerifyConstants verifyConstants8 = new com.google.javascript.jscomp.Normalize.VerifyConstants(abstractCompiler6, false);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node13, node17);
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node13);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isConstantName(node13);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.containsFunctionDeclaration(node13);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique22 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal23 = null;
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node31 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node27, node31);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node27);
        com.google.javascript.rhino.Node node37 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node41 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node37, node41);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isLhs(node27, node41);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isVar(node27);
        com.google.javascript.rhino.Node node48 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node52 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node48, node52);
        com.google.javascript.rhino.Node node54 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node48);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.isConstantName(node48);
        boolean boolean56 = makeDeclaredNamesUnique22.shouldTraverse(nodeTraversal23, node27, node48);
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node48);
        verifyConstants8.visit(nodeTraversal9, node13, node48);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal59 = null;
        com.google.javascript.rhino.Node node63 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node67 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean68 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node63, node67);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType71 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean72 = com.google.javascript.jscomp.NodeUtil.containsType(node67, (int) (short) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType71);
        com.google.javascript.rhino.Node node77 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node81 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean82 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node77, node81);
        com.google.javascript.rhino.Node node83 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node77);
        com.google.javascript.rhino.Node node84 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node83);
        boolean boolean85 = verifyConstants8.shouldTraverse(nodeTraversal59, node67, node84);
        com.google.javascript.rhino.Node node89 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean90 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node89);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate92 = null;
        boolean boolean93 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node89, "hi!", nodePredicate92);
        boolean boolean94 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node89);
        boolean boolean95 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node84, node89);
        boolean boolean96 = com.google.javascript.jscomp.NodeUtil.isNew(node84);
        makeDeclaredNamesUnique0.visit(nodeTraversal1, node5, node84);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal98 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique0.enterScope(nodeTraversal98);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNull(node83);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(node89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        java.lang.String str2 = contextualRenamer0.getReplacementName("||");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = contextualRenamer0.forChildScope();
        contextualRenamer0.addDeclaredName("||");
        boolean boolean6 = contextualRenamer0.stripConstIfReplaced();
        java.lang.String str8 = contextualRenamer0.getReplacementName("%=");
        contextualRenamer0.addDeclaredName("$$constant");
        boolean boolean11 = contextualRenamer0.stripConstIfReplaced();
        boolean boolean12 = contextualRenamer0.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = contextualRenamer0.forChildScope();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(renamer13);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.Normalize.PropogateConstantAnnotations propogateConstantAnnotations2 = new com.google.javascript.jscomp.Normalize.PropogateConstantAnnotations(abstractCompiler0, true);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node7, node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node7);
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node17, node21);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isLhs(node7, node21);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isVar(node7);
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node32 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node28, node32);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node28);
        boolean boolean35 = propogateConstantAnnotations2.shouldTraverse(nodeTraversal3, node7, node28);
        com.google.javascript.rhino.Node node39 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node43 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node39, node43);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node39);
        int int47 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node39, "hi!");
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node28, node39);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node28);
        com.google.javascript.rhino.Node node53 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType56 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.containsType(node53, (int) (short) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType56);
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node53);
        com.google.javascript.rhino.Node node62 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node66 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean67 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node62, node66);
        com.google.javascript.rhino.Node node68 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node62);
        boolean boolean69 = com.google.javascript.jscomp.NodeUtil.isConstantName(node62);
        java.lang.String[] strArray71 = new java.lang.String[] { "||" };
        java.util.LinkedHashSet<java.lang.String> strSet72 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet72, strArray71);
        boolean boolean74 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node62, (java.util.Set<java.lang.String>) strSet72);
        boolean boolean75 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node53, (java.util.Set<java.lang.String>) strSet72);
        boolean boolean77 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node53, (int) (byte) 0);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node28, node53, "$$");
        com.google.javascript.rhino.JSDocInfo jSDocInfo80 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node28);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNull(node68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertArrayEquals(strArray71, new java.lang.String[] { "||" });
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNull(jSDocInfo80);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node3);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node9, node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node9);
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newName("", node9);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isConstantName(node9);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isString(node9);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node3, node9);
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node23, node27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node23);
        int int31 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node23, "hi!");
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType38 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.containsType(node35, (int) (short) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType38);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node23, node35);
        com.google.javascript.rhino.Node node44 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node48 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node44, node48);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node44);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isNew(node44);
        java.lang.String[] strArray53 = new java.lang.String[] { "||" };
        java.util.LinkedHashSet<java.lang.String> strSet54 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet54, strArray53);
        boolean boolean56 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node44, (java.util.Set<java.lang.String>) strSet54);
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node23, (java.util.Set<java.lang.String>) strSet54);
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node9, (java.util.Set<java.lang.String>) strSet54);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertArrayEquals(strArray53, new java.lang.String[] { "||" });
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.Normalize.PropogateConstantAnnotations propogateConstantAnnotations2 = new com.google.javascript.jscomp.Normalize.PropogateConstantAnnotations(abstractCompiler0, true);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node7, node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node7);
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node17, node21);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isLhs(node7, node21);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isVar(node7);
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node32 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node28, node32);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node28);
        boolean boolean35 = propogateConstantAnnotations2.shouldTraverse(nodeTraversal3, node7, node28);
        com.google.javascript.rhino.Node node39 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node43 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node39, node43);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node39);
        int int47 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node39, "hi!");
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node28, node39);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node28);
        com.google.javascript.rhino.Node node53 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType56 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.containsType(node53, (int) (short) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType56);
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node53);
        com.google.javascript.rhino.Node node62 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node66 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean67 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node62, node66);
        com.google.javascript.rhino.Node node68 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node62);
        boolean boolean69 = com.google.javascript.jscomp.NodeUtil.isConstantName(node62);
        java.lang.String[] strArray71 = new java.lang.String[] { "||" };
        java.util.LinkedHashSet<java.lang.String> strSet72 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet72, strArray71);
        boolean boolean74 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node62, (java.util.Set<java.lang.String>) strSet72);
        boolean boolean75 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node53, (java.util.Set<java.lang.String>) strSet72);
        boolean boolean77 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node53, (int) (byte) 0);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node28, node53, "$$");
        boolean boolean80 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node28);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNull(node68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertArrayEquals(strArray71, new java.lang.String[] { "||" });
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        java.lang.String str2 = contextualRenamer0.getReplacementName("||");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = contextualRenamer0.forChildScope();
        contextualRenamer0.addDeclaredName("||");
        boolean boolean6 = contextualRenamer0.stripConstIfReplaced();
        java.lang.String str8 = contextualRenamer0.getReplacementName("%=");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique9 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) contextualRenamer0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node14, node18);
        int int21 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node14, "");
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isCall(node14);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isExprCall(node14);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node14);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.referencesThis(node14);
        com.google.javascript.rhino.Node node29 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(node29);
        makeDeclaredNamesUnique9.visit(nodeTraversal10, node14, node29);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique33 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = null;
        com.google.javascript.rhino.Node node38 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node42 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node38, node42);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node38);
        com.google.javascript.rhino.Node node48 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node52 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node48, node52);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.isLhs(node38, node52);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.isVar(node38);
        com.google.javascript.rhino.Node node59 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node63 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node59, node63);
        com.google.javascript.rhino.Node node65 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node59);
        boolean boolean66 = com.google.javascript.jscomp.NodeUtil.isConstantName(node59);
        boolean boolean67 = makeDeclaredNamesUnique33.shouldTraverse(nodeTraversal34, node38, node59);
        boolean boolean68 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node38);
        boolean boolean69 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node38);
        com.google.javascript.rhino.Node node73 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType76 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean77 = com.google.javascript.jscomp.NodeUtil.containsType(node73, (int) (short) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType76);
        java.lang.String str78 = com.google.javascript.jscomp.NodeUtil.getSourceName(node73);
        boolean boolean79 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node73);
        makeDeclaredNamesUnique9.visit(nodeTraversal32, node38, node73);
        boolean boolean81 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node38);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(node65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNull(str78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal1 = null;
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node5, node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node5);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isExprCall(node5);
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node16, node20);
        int int23 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node16, "");
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node32 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node28, node32);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType36 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.containsType(node32, (int) (short) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType36);
        com.google.javascript.rhino.Node node42 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType45 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.containsType(node42, (int) (short) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType45);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.containsType(node32, (int) 'a', (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType45);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.containsType(node16, (int) ' ', (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType45);
        com.google.javascript.rhino.Node node52 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType55 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean56 = com.google.javascript.jscomp.NodeUtil.containsType(node52, (int) (short) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType55);
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node52);
        com.google.javascript.rhino.Node node61 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node65 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean66 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node61, node65);
        com.google.javascript.rhino.Node node67 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node61);
        boolean boolean68 = com.google.javascript.jscomp.NodeUtil.isConstantName(node61);
        java.lang.String[] strArray70 = new java.lang.String[] { "||" };
        java.util.LinkedHashSet<java.lang.String> strSet71 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet71, strArray70);
        boolean boolean73 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node61, (java.util.Set<java.lang.String>) strSet71);
        boolean boolean74 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node52, (java.util.Set<java.lang.String>) strSet71);
        boolean boolean75 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node16, (java.util.Set<java.lang.String>) strSet71);
        boolean boolean76 = makeDeclaredNamesUnique0.shouldTraverse(nodeTraversal1, node5, node16);
        boolean boolean77 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node5);
        boolean boolean78 = com.google.javascript.jscomp.NodeUtil.isNew(node5);
        boolean boolean79 = com.google.javascript.jscomp.NodeUtil.isThis(node5);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNull(node67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertArrayEquals(strArray70, new java.lang.String[] { "||" });
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node3, node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node3);
        int int11 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node3, "hi!");
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node3, (int) (byte) 0);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isVar(node3);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node3);
        java.lang.String str17 = com.google.javascript.jscomp.NodeUtil.getStringValue(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        java.lang.String str2 = contextualRenamer0.getReplacementName("||");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = contextualRenamer0.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = contextualRenamer0.forChildScope();
        boolean boolean5 = contextualRenamer0.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) contextualRenamer0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique6.enterScope(nodeTraversal7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node3, node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node3);
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node13, node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isLhs(node3, node17);
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newExpr(node17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = com.google.javascript.jscomp.NodeUtil.hasCatchHandler(node17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node20);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", (int) (byte) 10, (int) '4');
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isCall(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal1 = null;
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node5, node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node5);
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node15, node19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isLhs(node5, node19);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isVar(node5);
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node26, node30);
        com.google.javascript.rhino.Node node32 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node26);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isConstantName(node26);
        boolean boolean34 = makeDeclaredNamesUnique0.shouldTraverse(nodeTraversal1, node5, node26);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node26);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(node26);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isCall(node26);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.containsFunctionDeclaration(node26);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = com.google.javascript.jscomp.NodeUtil.hasCatchHandler(node26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        java.lang.String str2 = contextualRenamer0.getReplacementName("||");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = contextualRenamer0.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = contextualRenamer0.forChildScope();
        renamer4.addDeclaredName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = renamer4.forChildScope();
        renamer4.addDeclaredName("$$");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer7);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique1 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) contextualRenamer0);
        boolean boolean2 = contextualRenamer0.stripConstIfReplaced();
        java.lang.String str4 = contextualRenamer0.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = contextualRenamer0.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) contextualRenamer0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node11);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate14 = null;
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node11, "hi!", nodePredicate14);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.containsCall(node11);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node11);
        int int19 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node11, "hi!");
        java.lang.String str20 = com.google.javascript.jscomp.NodeUtil.getStringValue(node11);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType22 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType(100);
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node26, node30);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node26);
        int int34 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node26, "hi!");
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node26, (int) (byte) 0);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType38 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) ' ');
        com.google.javascript.rhino.Node node42 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node46 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node42, node46);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType50 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.containsType(node46, (int) (short) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType50);
        com.google.javascript.rhino.Node node56 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType59 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.containsType(node56, (int) (short) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType59);
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.containsType(node46, (int) 'a', (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType59);
        boolean boolean62 = com.google.javascript.jscomp.NodeUtil.has(node26, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType38, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType59);
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.has(node11, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType22, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType59);
        com.google.javascript.rhino.Node node67 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node71 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean72 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node67, node71);
        boolean boolean73 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node67);
        boolean boolean74 = com.google.javascript.jscomp.NodeUtil.isNew(node67);
        boolean boolean75 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node67);
        boolean boolean76 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node67);
        boolean boolean78 = com.google.javascript.jscomp.NodeUtil.isNodeTypeReferenced(node67, 0);
        boolean boolean79 = com.google.javascript.jscomp.NodeUtil.isString(node67);
        boolean boolean80 = matchNodeType59.apply(node67);
        com.google.javascript.rhino.Node node84 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node88 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean89 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node84, node88);
        int int91 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node84, "");
        boolean boolean92 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node84);
        boolean boolean93 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node84);
        java.lang.String str94 = com.google.javascript.jscomp.NodeUtil.getStringValue(node84);
        boolean boolean95 = makeDeclaredNamesUnique6.shouldTraverse(nodeTraversal7, node67, node84);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertNotNull(node88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "hi!" + "'", str94, "hi!");
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "%=", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("^");
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("typeof");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node3, node7);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType11 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.containsType(node7, (int) (short) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType11);
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType20 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.containsType(node17, (int) (short) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.containsType(node7, (int) 'a', (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType20);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node7);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "%=", true);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str6 = inlineRenamer3.getReplacementName("instanceof");
        java.lang.String str8 = inlineRenamer3.getReplacementName("%=");
        java.lang.String str10 = inlineRenamer3.getReplacementName("^");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node4, node8);
        int int11 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node4, "");
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node4);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node4);
        java.lang.String str14 = com.google.javascript.jscomp.NodeUtil.getStringValue(node4);
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newVarNode("$$constant", node4);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node4);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.getConditionExpression(node4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: NAME hi! does not have a condition.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node3);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate6 = null;
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node3, "hi!", nodePredicate6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.containsCall(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node3, node7);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node3);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isConstantName(node3);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.containsFunctionDeclaration(node3);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.Normalize.PropogateConstantAnnotations propogateConstantAnnotations14 = new com.google.javascript.jscomp.Normalize.PropogateConstantAnnotations(abstractCompiler12, true);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node19, node23);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node19);
        com.google.javascript.rhino.Node node29 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node29, node33);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isLhs(node19, node33);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isVar(node19);
        com.google.javascript.rhino.Node node40 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node44 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node40, node44);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node40);
        boolean boolean47 = propogateConstantAnnotations14.shouldTraverse(nodeTraversal15, node19, node40);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node3, node40);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node40);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node40);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node40);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal1 = null;
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node5, node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node5);
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node15, node19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isLhs(node5, node19);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isVar(node5);
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node26, node30);
        com.google.javascript.rhino.Node node32 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node26);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isConstantName(node26);
        boolean boolean34 = makeDeclaredNamesUnique0.shouldTraverse(nodeTraversal1, node5, node26);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node5);
        java.lang.String str36 = com.google.javascript.jscomp.NodeUtil.getStringValue(node5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean37 = com.google.javascript.jscomp.NodeUtil.hasCatchHandler(node5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        java.lang.String str2 = contextualRenamer0.getReplacementName("||");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = contextualRenamer0.forChildScope();
        contextualRenamer0.addDeclaredName("||");
        boolean boolean6 = contextualRenamer0.stripConstIfReplaced();
        java.lang.String str8 = contextualRenamer0.getReplacementName("%=");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique9 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) contextualRenamer0);
        java.lang.String str11 = contextualRenamer0.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = contextualRenamer0.forChildScope();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(renamer12);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node4, node8);
        int int11 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node4, "");
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node4);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node4);
        java.lang.String str14 = com.google.javascript.jscomp.NodeUtil.getStringValue(node4);
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newVarNode("$$constant", node4);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node4);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isName(node4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = com.google.javascript.jscomp.NodeUtil.tryMergeBlock(node4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType6 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.containsType(node3, (int) (short) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType6);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newExpr(node3);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node3, "instanceof");
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isCall(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique1 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) contextualRenamer0);
        boolean boolean2 = contextualRenamer0.stripConstIfReplaced();
        java.lang.String str4 = contextualRenamer0.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) contextualRenamer0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique5.enterScope(nodeTraversal6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node4, node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node4);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isNew(node4);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node4);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isAssign(node4);
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("||", node4, "");
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isNodeTypeReferenced(node4, (int) 'a');
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.Normalize.PropogateConstantAnnotations propogateConstantAnnotations2 = new com.google.javascript.jscomp.Normalize.PropogateConstantAnnotations(abstractCompiler0, true);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique4 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal5 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node9, node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node9);
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node19, node23);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isLhs(node9, node23);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isVar(node9);
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node34 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node30, node34);
        com.google.javascript.rhino.Node node36 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node30);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isConstantName(node30);
        boolean boolean38 = makeDeclaredNamesUnique4.shouldTraverse(nodeTraversal5, node9, node30);
        com.google.javascript.rhino.Node node42 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node46 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node42, node46);
        int int49 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node42, "");
        boolean boolean50 = propogateConstantAnnotations2.shouldTraverse(nodeTraversal3, node9, node42);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node42);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.referencesThis(node42);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        contextualRenamer0.addDeclaredName("||");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) contextualRenamer0);
        contextualRenamer0.addDeclaredName("$$");
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal1 = null;
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node5, node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node5);
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node15, node19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isLhs(node5, node19);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isVar(node5);
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node26, node30);
        com.google.javascript.rhino.Node node32 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node26);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isConstantName(node26);
        boolean boolean34 = makeDeclaredNamesUnique0.shouldTraverse(nodeTraversal1, node5, node26);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node5);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node5);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node5);
        com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(node5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isFunctionAnonymous(node5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal1 = null;
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node5, node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node5);
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node15, node19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isLhs(node5, node19);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isVar(node5);
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node26, node30);
        com.google.javascript.rhino.Node node32 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node26);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isConstantName(node26);
        boolean boolean34 = makeDeclaredNamesUnique0.shouldTraverse(nodeTraversal1, node5, node26);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isVar(node26);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node26);
        com.google.javascript.rhino.Node node40 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node44 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node40, node44);
        com.google.javascript.rhino.Node node46 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node40);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isConstantName(node40);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isVar(node40);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.isLhs(node26, node40);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isNew(node40);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node40);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node3, node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node3);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isNew(node3);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node3);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node3);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isNodeTypeReferenced(node3, 0);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isString(node3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isStatement(node3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node3, node7);
        int int10 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node3, "");
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node3);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node3, (-1));
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node3);
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", (int) (byte) 10, (int) '4');
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = com.google.javascript.jscomp.NodeUtil.getPrototypePropertyName(node3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -9");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node3, node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node3);
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node13, node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isLhs(node3, node17);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.referencesThis(node17);
        java.lang.String str21 = com.google.javascript.jscomp.NodeUtil.getSourceName(node17);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.referencesThis(node17);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node17);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.referencesThis(node17);
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node17);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "%=", true);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        java.lang.String str8 = inlineRenamer3.getReplacementName("^");
        java.lang.String str10 = inlineRenamer3.getReplacementName("");
        java.lang.String str12 = inlineRenamer3.getReplacementName("||");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node3);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate6 = null;
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node3, "hi!", nodePredicate6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.containsCall(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node3);
        int int11 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node3, "hi!");
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isGet(node3);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isExprCall(node3);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node3);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node3, "^", nodePredicate16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node3, node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isVar(node3);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isForIn(node3);
        com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType6 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.containsType(node3, (int) (short) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node3);
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node12, node16);
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node12);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isConstantName(node12);
        java.lang.String[] strArray21 = new java.lang.String[] { "||" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node12, (java.util.Set<java.lang.String>) strSet22);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node3, (java.util.Set<java.lang.String>) strSet22);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node3);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node3);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isFunction(node3);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "||" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node3);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate6 = null;
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node3, "hi!", nodePredicate6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.containsCall(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node3);
        int int11 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node3, "hi!");
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isGet(node3);
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node17, node21);
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node17);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isConstantName(node17);
        com.google.javascript.rhino.Node node29 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node29, node33);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType37 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.containsType(node33, (int) (short) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType37);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.containsType(node17, (int) '4', (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType37);
        com.google.javascript.rhino.Node node40 = com.google.javascript.jscomp.NodeUtil.newName("$$", node17);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node3, node40);
        com.google.javascript.rhino.JSDocInfo jSDocInfo42 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node40);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node40);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node40);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(jSDocInfo42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("instanceof", (int) (short) 0, 10);
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newVarNode("^", node4);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node5);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique1 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node6, node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node6);
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node16, node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isLhs(node6, node20);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isVar(node6);
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node31 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node27, node31);
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node27);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isConstantName(node27);
        boolean boolean35 = makeDeclaredNamesUnique1.shouldTraverse(nodeTraversal2, node6, node27);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node27);
        com.google.javascript.rhino.Node node40 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node44 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node40, node44);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node40);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node27, node40);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isNew(node40);
        com.google.javascript.rhino.Node node52 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node56 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node52, node56);
        com.google.javascript.rhino.Node node58 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node52);
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.isConstantName(node52);
        java.lang.String[] strArray61 = new java.lang.String[] { "||" };
        java.util.LinkedHashSet<java.lang.String> strSet62 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet62, strArray61);
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node52, (java.util.Set<java.lang.String>) strSet62);
        boolean boolean65 = com.google.javascript.jscomp.NodeUtil.isAnonymousFunction(node52);
        com.google.javascript.rhino.Node node70 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node74 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean75 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node70, node74);
        boolean boolean76 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node70);
        com.google.javascript.rhino.Node node77 = com.google.javascript.jscomp.NodeUtil.newName("", node70);
        boolean boolean78 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node70);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType80 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) ' ');
        int int81 = com.google.javascript.jscomp.NodeUtil.getCount(node70, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType80);
        int int82 = matchNodeType80.type;
        int int83 = com.google.javascript.jscomp.NodeUtil.getCount(node52, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType80);
        boolean boolean84 = com.google.javascript.jscomp.NodeUtil.isLhs(node40, node52);
        boolean boolean85 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node40);
        com.google.javascript.rhino.Node node86 = com.google.javascript.jscomp.NodeUtil.newName("^", node40);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertArrayEquals(strArray61, new java.lang.String[] { "||" });
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 32 + "'", int82 == 32);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(node86);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.Normalize.NormalizeStatements normalizeStatements2 = new com.google.javascript.jscomp.Normalize.NormalizeStatements(abstractCompiler0, false);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.Normalize.PropogateConstantAnnotations propogateConstantAnnotations6 = new com.google.javascript.jscomp.Normalize.PropogateConstantAnnotations(abstractCompiler4, true);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique8 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node13, node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node13);
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node23, node27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isLhs(node13, node27);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isVar(node13);
        com.google.javascript.rhino.Node node34 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node38 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node34, node38);
        com.google.javascript.rhino.Node node40 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node34);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isConstantName(node34);
        boolean boolean42 = makeDeclaredNamesUnique8.shouldTraverse(nodeTraversal9, node13, node34);
        com.google.javascript.rhino.Node node46 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node50 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node46, node50);
        int int53 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node46, "");
        boolean boolean54 = propogateConstantAnnotations6.shouldTraverse(nodeTraversal7, node13, node46);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer55 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique56 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) contextualRenamer55);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal57 = null;
        com.google.javascript.rhino.Node node61 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean62 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node61);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate64 = null;
        boolean boolean65 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node61, "hi!", nodePredicate64);
        boolean boolean66 = com.google.javascript.jscomp.NodeUtil.containsCall(node61);
        boolean boolean67 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node61);
        com.google.javascript.rhino.Node node68 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode();
        boolean boolean69 = com.google.javascript.jscomp.NodeUtil.containsFunctionDeclaration(node68);
        makeDeclaredNamesUnique56.visit(nodeTraversal57, node61, node68);
        boolean boolean71 = normalizeStatements2.shouldTraverse(nodeTraversal3, node13, node61);
        boolean boolean72 = com.google.javascript.jscomp.NodeUtil.isThis(node61);
        boolean boolean73 = com.google.javascript.jscomp.NodeUtil.containsFunctionDeclaration(node61);
        com.google.javascript.rhino.Node node74 = com.google.javascript.jscomp.NodeUtil.newExpr(node61);
        boolean boolean75 = com.google.javascript.jscomp.NodeUtil.isExprCall(node61);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node3, node7);
        int int10 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node3, "");
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isCall(node3);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isGet(node3);
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node16, node20);
        int int23 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node16, "");
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node16);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isLhs(node3, node16);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.containsFunctionDeclaration(node16);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isAssign(node16);
        com.google.javascript.rhino.JSDocInfo jSDocInfo28 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node16);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(jSDocInfo28);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal1 = null;
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node5, node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node5);
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node15, node19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isLhs(node5, node19);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isVar(node5);
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node26, node30);
        com.google.javascript.rhino.Node node32 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node26);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isConstantName(node26);
        boolean boolean34 = makeDeclaredNamesUnique0.shouldTraverse(nodeTraversal1, node5, node26);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node26);
        com.google.javascript.rhino.Node node39 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node43 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node39, node43);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node39);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node26, node39);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node39);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isExprCall(node39);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.containsType(node39, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique1 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) contextualRenamer0);
        java.lang.String str3 = contextualRenamer0.getReplacementName("||");
        boolean boolean4 = contextualRenamer0.stripConstIfReplaced();
        java.lang.String str6 = contextualRenamer0.getReplacementName("||");
        contextualRenamer0.addDeclaredName("^");
        contextualRenamer0.addDeclaredName("typeof");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType6 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.containsType(node3, (int) (short) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType6);
        java.lang.String str8 = com.google.javascript.jscomp.NodeUtil.getSourceName(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node3);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node3, "$$constant");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("instanceof", (int) (short) -1, 52);
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newName("$$", node4, "");
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node4);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node4);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal1 = null;
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node5, node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node5);
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node15, node19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isLhs(node5, node19);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isVar(node5);
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node26, node30);
        com.google.javascript.rhino.Node node32 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node26);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isConstantName(node26);
        boolean boolean34 = makeDeclaredNamesUnique0.shouldTraverse(nodeTraversal1, node5, node26);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node26);
        com.google.javascript.rhino.Node node39 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node43 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node39, node43);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node39);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node26, node39);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node39);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isExprCall(node39);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node39);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node5, node9);
        int int12 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node5, "");
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isCall(node5);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isCall(node5);
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node18, node22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node18);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node5, node18);
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newName("hi!", node18);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isConstantName(node26);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.referencesThis(node26);
        com.google.javascript.rhino.Node node29 = com.google.javascript.jscomp.NodeUtil.newVarNode("instanceof", node26);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node29);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType6 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.containsType(node3, (int) (short) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType6);
        java.lang.String str8 = com.google.javascript.jscomp.NodeUtil.getSourceName(node3);
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node13, node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isConstantName(node13);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType21 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) ' ');
        int int22 = com.google.javascript.jscomp.NodeUtil.getCount(node13, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType21);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node3, "$$constant", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType21);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node4, node8);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node4);
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node10);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType14 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node18, node22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.containsFunctionDeclaration(node18);
        boolean boolean25 = matchNodeType14.apply(node18);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node11, "typeof", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType14);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.Normalize.NormalizeStatements normalizeStatements2 = new com.google.javascript.jscomp.Normalize.NormalizeStatements(abstractCompiler0, false);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node7, node11);
        int int14 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node7, "");
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isCall(node7);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isCall(node7);
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node20, node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node20);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node7, node20);
        com.google.javascript.rhino.Node node31 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node31, node35);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType39 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.containsType(node35, (int) (short) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType39);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType42 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        int int43 = matchNodeType42.type;
        com.google.javascript.rhino.Node node47 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node51 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node47, node51);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType55 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean56 = com.google.javascript.jscomp.NodeUtil.containsType(node51, (int) (short) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType55);
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.has(node35, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType42, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType55);
        boolean boolean58 = normalizeStatements2.shouldTraverse(nodeTraversal3, node20, node35);
        int int60 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node35, (int) (byte) 0);
        boolean boolean62 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node35, "");
        com.google.javascript.rhino.Node node66 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean67 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node66);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate69 = null;
        boolean boolean70 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node66, "hi!", nodePredicate69);
        boolean boolean71 = com.google.javascript.jscomp.NodeUtil.containsCall(node66);
        boolean boolean72 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node66);
        int int74 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node66, "hi!");
        boolean boolean75 = com.google.javascript.jscomp.NodeUtil.isGet(node66);
        boolean boolean76 = com.google.javascript.jscomp.NodeUtil.isNew(node66);
        boolean boolean77 = com.google.javascript.jscomp.NodeUtil.isLhs(node35, node66);
        boolean boolean78 = com.google.javascript.jscomp.NodeUtil.isGet(node35);
        boolean boolean79 = com.google.javascript.jscomp.NodeUtil.isExprCall(node35);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 10 + "'", int43 == 10);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("typeof", 0, 6);
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAnonymousFunction(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node3, node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node3);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isNew(node3);
        java.lang.String[] strArray12 = new java.lang.String[] { "||" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node3, (java.util.Set<java.lang.String>) strSet13);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isNew(node3);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isNew(node3);
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node21);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate24 = null;
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node21, "hi!", nodePredicate24);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isControlStructureCodeBlock(node3, node21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "||" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique1 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node8, node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node8);
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node18, node22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isLhs(node8, node22);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isVar(node8);
        com.google.javascript.rhino.Node node29 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node29, node33);
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node29);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isConstantName(node29);
        boolean boolean37 = makeDeclaredNamesUnique3.shouldTraverse(nodeTraversal4, node8, node29);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal38 = null;
        com.google.javascript.rhino.Node node42 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node42);
        com.google.javascript.rhino.Node node47 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node51 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node47, node51);
        makeDeclaredNamesUnique3.visit(nodeTraversal38, node42, node47);
        com.google.javascript.rhino.Node node57 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node61 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean62 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node57, node61);
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node57);
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.isNew(node57);
        java.lang.String[] strArray66 = new java.lang.String[] { "||" };
        java.util.LinkedHashSet<java.lang.String> strSet67 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet67, strArray66);
        boolean boolean69 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node57, (java.util.Set<java.lang.String>) strSet67);
        makeDeclaredNamesUnique1.visit(nodeTraversal2, node42, node57);
        com.google.javascript.rhino.Node node72 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("||", node42, "instanceof");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean73 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Non-literal value: NAME hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertArrayEquals(strArray66, new java.lang.String[] { "||" });
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(node72);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node4, node8);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node4);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isConstantName(node4);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.containsFunctionDeclaration(node4);
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newName("", node4);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isExprCall(node4);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isAssign(node4);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler16 = null;
        com.google.javascript.jscomp.Normalize.VerifyConstants verifyConstants18 = new com.google.javascript.jscomp.Normalize.VerifyConstants(abstractCompiler16, false);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal19 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node23, node27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node23);
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node37 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node33, node37);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isLhs(node23, node37);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.referencesThis(node37);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node37);
        com.google.javascript.rhino.Node node42 = com.google.javascript.jscomp.NodeUtil.getLoopCodeBlock(node37);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isGetProp(node37);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique44 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal45 = null;
        com.google.javascript.rhino.Node node49 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node53 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node49, node53);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node49);
        com.google.javascript.rhino.Node node59 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node63 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node59, node63);
        boolean boolean65 = com.google.javascript.jscomp.NodeUtil.isLhs(node49, node63);
        boolean boolean66 = com.google.javascript.jscomp.NodeUtil.isVar(node49);
        com.google.javascript.rhino.Node node70 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node74 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean75 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node70, node74);
        com.google.javascript.rhino.Node node76 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node70);
        boolean boolean77 = com.google.javascript.jscomp.NodeUtil.isConstantName(node70);
        boolean boolean78 = makeDeclaredNamesUnique44.shouldTraverse(nodeTraversal45, node49, node70);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal79 = null;
        com.google.javascript.rhino.Node node83 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean84 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node83);
        com.google.javascript.rhino.Node node88 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node92 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean93 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node88, node92);
        makeDeclaredNamesUnique44.visit(nodeTraversal79, node83, node88);
        boolean boolean95 = com.google.javascript.jscomp.NodeUtil.containsFunctionDeclaration(node88);
        verifyConstants18.visit(nodeTraversal19, node37, node88);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str97 = com.google.javascript.jscomp.NodeUtil.getFunctionName(node4, node88);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNull(node76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(node88);
        org.junit.Assert.assertNotNull(node92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        java.lang.String str2 = contextualRenamer0.getReplacementName("||");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = contextualRenamer0.forChildScope();
        boolean boolean4 = contextualRenamer0.stripConstIfReplaced();
        boolean boolean5 = contextualRenamer0.stripConstIfReplaced();
        boolean boolean6 = contextualRenamer0.stripConstIfReplaced();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique1 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) contextualRenamer0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node6);
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node12, node16);
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node12);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isConstantName(node12);
        java.lang.String str20 = com.google.javascript.jscomp.NodeUtil.getStringValue(node12);
        makeDeclaredNamesUnique1.visit(nodeTraversal2, node6, node12);
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node29 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node25, node29);
        int int32 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node25, "");
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isCall(node25);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isCall(node25);
        com.google.javascript.rhino.Node node38 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node42 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node38, node42);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node38);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node25, node38);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node12, node25);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node3, node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node3);
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node13, node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isLhs(node3, node17);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isForIn(node3);
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node24, node28);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node24);
        com.google.javascript.rhino.Node node34 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node38 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node34, node38);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isLhs(node24, node38);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isForIn(node24);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.containsFunctionDeclaration(node24);
        com.google.javascript.rhino.Node node46 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node50 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node46, node50);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node46);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.isNew(node46);
        java.lang.String[] strArray55 = new java.lang.String[] { "||" };
        java.util.LinkedHashSet<java.lang.String> strSet56 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet56, strArray55);
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node46, (java.util.Set<java.lang.String>) strSet56);
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node24, (java.util.Set<java.lang.String>) strSet56);
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node3, (java.util.Set<java.lang.String>) strSet56);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "||" });
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node3, node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node3);
        int int11 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node3, "hi!");
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType18 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.containsType(node15, (int) (short) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node3, node15);
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node24, node28);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node24);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isNew(node24);
        java.lang.String[] strArray33 = new java.lang.String[] { "||" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node24, (java.util.Set<java.lang.String>) strSet34);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node3, (java.util.Set<java.lang.String>) strSet34);
        com.google.javascript.rhino.Node node42 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node46 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node42, node46);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node42);
        com.google.javascript.rhino.Node node52 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node56 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node52, node56);
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.isLhs(node42, node56);
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.referencesThis(node56);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType62 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        int int63 = matchNodeType62.type;
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node56, "||", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType62);
        com.google.javascript.rhino.Node node68 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node72 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean73 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node68, node72);
        boolean boolean74 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node68);
        boolean boolean75 = com.google.javascript.jscomp.NodeUtil.isNew(node68);
        boolean boolean76 = com.google.javascript.jscomp.NodeUtil.isThis(node68);
        boolean boolean77 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node68);
        boolean boolean78 = matchNodeType62.apply(node68);
        boolean boolean79 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node3, "instanceof", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType62);
        com.google.javascript.rhino.Node node80 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean81 = com.google.javascript.jscomp.NodeUtil.isFunction(node80);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "||" });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 10 + "'", int63 == 10);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNull(node80);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal1 = null;
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node5, node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node5);
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node15, node19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isLhs(node5, node19);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isVar(node5);
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node26, node30);
        com.google.javascript.rhino.Node node32 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node26);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isConstantName(node26);
        boolean boolean34 = makeDeclaredNamesUnique0.shouldTraverse(nodeTraversal1, node5, node26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal35 = null;
        com.google.javascript.rhino.Node node39 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node39);
        com.google.javascript.rhino.Node node44 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node48 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node44, node48);
        makeDeclaredNamesUnique0.visit(nodeTraversal35, node39, node44);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal51 = null;
        com.google.javascript.rhino.Node node55 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("$$constant", 0, (int) (short) -1);
        com.google.javascript.rhino.Node node59 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node63 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node59, node63);
        boolean boolean65 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node59);
        com.google.javascript.rhino.Node node69 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node73 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean74 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node69, node73);
        boolean boolean75 = com.google.javascript.jscomp.NodeUtil.isLhs(node59, node73);
        boolean boolean76 = com.google.javascript.jscomp.NodeUtil.isForIn(node59);
        boolean boolean77 = com.google.javascript.jscomp.NodeUtil.containsFunctionDeclaration(node59);
        boolean boolean79 = com.google.javascript.jscomp.NodeUtil.isNodeTypeReferenced(node59, 0);
        boolean boolean80 = com.google.javascript.jscomp.NodeUtil.isFunction(node59);
        boolean boolean81 = makeDeclaredNamesUnique0.shouldTraverse(nodeTraversal51, node55, node59);
        boolean boolean82 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node55);
        boolean boolean83 = com.google.javascript.jscomp.NodeUtil.isCall(node55);
        boolean boolean84 = com.google.javascript.jscomp.NodeUtil.isGet(node55);
        int int86 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node55, (-1));
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType6 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.containsType(node3, (int) (short) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node3);
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node12, node16);
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node12);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isConstantName(node12);
        java.lang.String[] strArray21 = new java.lang.String[] { "||" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node12, (java.util.Set<java.lang.String>) strSet22);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node3, (java.util.Set<java.lang.String>) strSet22);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node3);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "||" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node3);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate6 = null;
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node3, "hi!", nodePredicate6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.containsCall(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node3);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node3);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.containsCall(node3);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.containsTypeInOuterScope(node3, (int) (short) -1);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isThis(node3);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isName(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node3, node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node3);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isNew(node3);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node3);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node3);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isNodeTypeReferenced(node3, 0);
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.getLoopCodeBlock(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isThis(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isThis(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isFunctionAnonymous(node3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node4, node8);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType12 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.containsType(node8, (int) (short) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType12);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType15 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        int int16 = matchNodeType15.type;
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node20, node24);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType28 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.containsType(node24, (int) (short) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType28);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.has(node8, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType15, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType28);
        com.google.javascript.rhino.Node node32 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", node8, "||");
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection33 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node32);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(nodeCollection33);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node3, node7);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node3);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isConstantName(node3);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.containsFunctionDeclaration(node3);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.Normalize.PropogateConstantAnnotations propogateConstantAnnotations14 = new com.google.javascript.jscomp.Normalize.PropogateConstantAnnotations(abstractCompiler12, true);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node19, node23);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node19);
        com.google.javascript.rhino.Node node29 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node29, node33);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isLhs(node19, node33);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isVar(node19);
        com.google.javascript.rhino.Node node40 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node44 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node40, node44);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node40);
        boolean boolean47 = propogateConstantAnnotations14.shouldTraverse(nodeTraversal15, node19, node40);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node3, node40);
        com.google.javascript.rhino.Node node52 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node56 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node52, node56);
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node3, node52);
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node3);
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.containsFunctionDeclaration(node3);
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.isNew(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.Normalize.VerifyConstants verifyConstants2 = new com.google.javascript.jscomp.Normalize.VerifyConstants(abstractCompiler0, true);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique4 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal5 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node9, node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node9);
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node19, node23);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isLhs(node9, node23);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isVar(node9);
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node34 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node30, node34);
        com.google.javascript.rhino.Node node36 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node30);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isConstantName(node30);
        boolean boolean38 = makeDeclaredNamesUnique4.shouldTraverse(nodeTraversal5, node9, node30);
        com.google.javascript.rhino.Node node42 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType45 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.containsType(node42, (int) (short) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType45);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node42);
        boolean boolean48 = verifyConstants2.shouldTraverse(nodeTraversal3, node30, node42);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal49 = null;
        com.google.javascript.rhino.Node node50 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode();
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isString(node50);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(node50);
        com.google.javascript.rhino.Node node56 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node60 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node56, node60);
        boolean boolean62 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node56);
        com.google.javascript.rhino.Node node66 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node70 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean71 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node66, node70);
        boolean boolean72 = com.google.javascript.jscomp.NodeUtil.isLhs(node56, node70);
        boolean boolean73 = com.google.javascript.jscomp.NodeUtil.isForIn(node56);
        boolean boolean74 = com.google.javascript.jscomp.NodeUtil.containsFunctionDeclaration(node56);
        boolean boolean75 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node56);
        boolean boolean77 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node56, "");
        verifyConstants2.visit(nodeTraversal49, node50, node56);
        java.lang.String str79 = com.google.javascript.jscomp.NodeUtil.getSourceName(node50);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNull(str79);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node5, node9);
        int int12 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node5, "");
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node5);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node5);
        java.lang.String str15 = com.google.javascript.jscomp.NodeUtil.getStringValue(node5);
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newVarNode("$$constant", node5);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType19 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType(100);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.containsType(node5, 32, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType19);
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newName("^", node5);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isString(node5);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isThis(node5);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node3, node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node3);
        int int11 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node3, "hi!");
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node3, "");
        java.lang.String str14 = com.google.javascript.jscomp.NodeUtil.getStringValue(node3);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique15 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node20, node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node20);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isExprCall(node20);
        com.google.javascript.rhino.Node node31 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node31, node35);
        int int38 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node31, "");
        com.google.javascript.rhino.Node node43 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node47 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node43, node47);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType51 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.containsType(node47, (int) (short) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType51);
        com.google.javascript.rhino.Node node57 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType60 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.containsType(node57, (int) (short) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType60);
        boolean boolean62 = com.google.javascript.jscomp.NodeUtil.containsType(node47, (int) 'a', (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType60);
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.containsType(node31, (int) ' ', (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType60);
        com.google.javascript.rhino.Node node67 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType70 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean71 = com.google.javascript.jscomp.NodeUtil.containsType(node67, (int) (short) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType70);
        boolean boolean72 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node67);
        com.google.javascript.rhino.Node node76 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node80 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean81 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node76, node80);
        com.google.javascript.rhino.Node node82 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node76);
        boolean boolean83 = com.google.javascript.jscomp.NodeUtil.isConstantName(node76);
        java.lang.String[] strArray85 = new java.lang.String[] { "||" };
        java.util.LinkedHashSet<java.lang.String> strSet86 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet86, strArray85);
        boolean boolean88 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node76, (java.util.Set<java.lang.String>) strSet86);
        boolean boolean89 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node67, (java.util.Set<java.lang.String>) strSet86);
        boolean boolean90 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node31, (java.util.Set<java.lang.String>) strSet86);
        boolean boolean91 = makeDeclaredNamesUnique15.shouldTraverse(nodeTraversal16, node20, node31);
        int int93 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node20, "||");
        boolean boolean94 = com.google.javascript.jscomp.NodeUtil.isLhs(node3, node20);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node95 = com.google.javascript.jscomp.NodeUtil.getFunctionBody(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNull(node82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertArrayEquals(strArray85, new java.lang.String[] { "||" });
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node5, node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node5);
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newName("", node5);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node5);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType15 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) ' ');
        int int16 = com.google.javascript.jscomp.NodeUtil.getCount(node5, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType15);
        java.lang.String str17 = com.google.javascript.jscomp.NodeUtil.getStringValue(node5);
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newName("hi!", node5, "$$constant");
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isGet(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node3, node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node3);
        int int11 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node3, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = com.google.javascript.jscomp.NodeUtil.tryMergeBlock(node3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        java.lang.String str2 = contextualRenamer0.getReplacementName("||");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = contextualRenamer0.forChildScope();
        boolean boolean4 = contextualRenamer0.stripConstIfReplaced();
        contextualRenamer0.addDeclaredName("instanceof");
        java.lang.String str8 = contextualRenamer0.getReplacementName("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique1 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) contextualRenamer0);
        java.lang.String str3 = contextualRenamer0.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = contextualRenamer0.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = contextualRenamer0.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = contextualRenamer0.forChildScope();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal1 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node7, node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node7);
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node17, node21);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isLhs(node7, node21);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isVar(node7);
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node32 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node28, node32);
        com.google.javascript.rhino.Node node34 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node28);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isConstantName(node28);
        boolean boolean36 = makeDeclaredNamesUnique2.shouldTraverse(nodeTraversal3, node7, node28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal37 = null;
        com.google.javascript.rhino.Node node41 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node41);
        com.google.javascript.rhino.Node node46 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node50 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node46, node50);
        makeDeclaredNamesUnique2.visit(nodeTraversal37, node41, node46);
        com.google.javascript.rhino.Node node56 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node60 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node56, node60);
        boolean boolean62 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node56);
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.isNew(node56);
        java.lang.String[] strArray65 = new java.lang.String[] { "||" };
        java.util.LinkedHashSet<java.lang.String> strSet66 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet66, strArray65);
        boolean boolean68 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node56, (java.util.Set<java.lang.String>) strSet66);
        makeDeclaredNamesUnique0.visit(nodeTraversal1, node41, node56);
        boolean boolean70 = com.google.javascript.jscomp.NodeUtil.containsCall(node41);
        java.lang.String str71 = com.google.javascript.jscomp.NodeUtil.getSourceName(node41);
        java.lang.Class<?> wildcardClass72 = node41.getClass();
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertArrayEquals(strArray65, new java.lang.String[] { "||" });
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertNotNull(wildcardClass72);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isThis(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isThis(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node3);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node3);
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
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node3, node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node3);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isNew(node3);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isThis(node3);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(node3);
        com.google.javascript.jscomp.NodeUtil.Visitor visitor13 = null;
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType15 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.NodeUtil.visitPreOrder(node3, visitor13, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node3, node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node3);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isNew(node3);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node3);
        com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(node3);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isForIn(node3);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
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
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node3);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node3, "$$constant");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.Normalize.VerifyConstants verifyConstants3 = new com.google.javascript.jscomp.Normalize.VerifyConstants(abstractCompiler1, false);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node8, node12);
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node8);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isConstantName(node8);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.containsFunctionDeclaration(node8);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique17 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node22, node26);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node22);
        com.google.javascript.rhino.Node node32 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node36 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node32, node36);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isLhs(node22, node36);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isVar(node22);
        com.google.javascript.rhino.Node node43 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node47 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node43, node47);
        com.google.javascript.rhino.Node node49 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node43);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isConstantName(node43);
        boolean boolean51 = makeDeclaredNamesUnique17.shouldTraverse(nodeTraversal18, node22, node43);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node43);
        verifyConstants3.visit(nodeTraversal4, node8, node43);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal54 = null;
        com.google.javascript.rhino.Node node58 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node62 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node58, node62);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType66 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean67 = com.google.javascript.jscomp.NodeUtil.containsType(node62, (int) (short) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType66);
        com.google.javascript.rhino.Node node72 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node76 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean77 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node72, node76);
        com.google.javascript.rhino.Node node78 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node72);
        com.google.javascript.rhino.Node node79 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node78);
        boolean boolean80 = verifyConstants3.shouldTraverse(nodeTraversal54, node62, node79);
        com.google.javascript.rhino.Node node81 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node62);
        boolean boolean82 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node62);
        com.google.javascript.rhino.Node node84 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("$$", node62, "instanceof");
        boolean boolean85 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node84);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNull(node78);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNull(node81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node3, node7);
        int int10 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node3, "");
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isCall(node3);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isCall(node3);
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node16, node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node16);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node3, node16);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.referencesThis(node3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = com.google.javascript.jscomp.NodeUtil.getPrototypePropertyName(node3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -7");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique1 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node6, node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node6);
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node16, node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isLhs(node6, node20);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isVar(node6);
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node31 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node27, node31);
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node27);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isConstantName(node27);
        boolean boolean35 = makeDeclaredNamesUnique1.shouldTraverse(nodeTraversal2, node6, node27);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isVar(node27);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isConstantName(node27);
        com.google.javascript.rhino.Node node39 = com.google.javascript.jscomp.NodeUtil.newName("", node27, "$$constant");
        com.google.javascript.rhino.Node node44 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node48 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node44, node48);
        com.google.javascript.rhino.Node node50 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node44);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isConstantName(node44);
        com.google.javascript.rhino.Node node56 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node60 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node56, node60);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType64 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean65 = com.google.javascript.jscomp.NodeUtil.containsType(node60, (int) (short) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType64);
        boolean boolean66 = com.google.javascript.jscomp.NodeUtil.containsType(node44, (int) '4', (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType64);
        com.google.javascript.rhino.Node node67 = com.google.javascript.jscomp.NodeUtil.newName("$$", node44);
        boolean boolean68 = com.google.javascript.jscomp.NodeUtil.isAssign(node67);
        boolean boolean69 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node67);
        boolean boolean70 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node67);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node39, node67);
        boolean boolean72 = com.google.javascript.jscomp.NodeUtil.containsFunctionDeclaration(node67);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node3, node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.containsFunctionDeclaration(node3);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique10 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal11 = null;
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node15, node19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node15);
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node29 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node25, node29);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isLhs(node15, node29);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isVar(node15);
        com.google.javascript.rhino.Node node36 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node40 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node36, node40);
        com.google.javascript.rhino.Node node42 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node36);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isConstantName(node36);
        boolean boolean44 = makeDeclaredNamesUnique10.shouldTraverse(nodeTraversal11, node15, node36);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isVar(node36);
        java.lang.String str46 = com.google.javascript.jscomp.NodeUtil.getStringValue(node36);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node3, node36);
        com.google.javascript.rhino.Node node51 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node55 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean56 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node51, node55);
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node51);
        int int59 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node51, "hi!");
        com.google.javascript.rhino.Node node63 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType66 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean67 = com.google.javascript.jscomp.NodeUtil.containsType(node63, (int) (short) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType66);
        boolean boolean68 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node51, node63);
        com.google.javascript.rhino.Node node72 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node76 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean77 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node72, node76);
        boolean boolean78 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node72);
        boolean boolean79 = com.google.javascript.jscomp.NodeUtil.isNew(node72);
        java.lang.String[] strArray81 = new java.lang.String[] { "||" };
        java.util.LinkedHashSet<java.lang.String> strSet82 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet82, strArray81);
        boolean boolean84 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node72, (java.util.Set<java.lang.String>) strSet82);
        boolean boolean85 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node51, (java.util.Set<java.lang.String>) strSet82);
        boolean boolean86 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node3, (java.util.Set<java.lang.String>) strSet82);
        boolean boolean87 = com.google.javascript.jscomp.NodeUtil.isName(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertArrayEquals(strArray81, new java.lang.String[] { "||" });
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.Normalize.NormalizeStatements normalizeStatements2 = new com.google.javascript.jscomp.Normalize.NormalizeStatements(abstractCompiler0, true);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node8, node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node8);
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newName("", node8);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isConstantName(node8);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isString(node8);
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("instanceof", (int) (short) 0, 10);
        boolean boolean22 = normalizeStatements2.shouldTraverse(nodeTraversal3, node8, node21);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node21);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isName(node21);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique1 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) contextualRenamer0);
        java.lang.String str3 = contextualRenamer0.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = contextualRenamer0.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) contextualRenamer0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node10, node14);
        int int17 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node10, "");
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isCall(node10);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isExprCall(node10);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node10);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.referencesThis(node10);
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node29 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node25, node29);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node25);
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node39 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node35, node39);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isLhs(node25, node39);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isForIn(node39);
        int int44 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node39, (-1));
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node39);
        boolean boolean46 = makeDeclaredNamesUnique5.shouldTraverse(nodeTraversal6, node10, node39);
        java.lang.String str47 = com.google.javascript.jscomp.NodeUtil.getStringValue(node39);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
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
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType33 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.containsType(node30, (int) (short) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType33);
        java.lang.String str35 = com.google.javascript.jscomp.NodeUtil.getSourceName(node30);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node30);
        com.google.javascript.rhino.Node node41 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node45 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node41, node45);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType49 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.containsType(node45, (int) (short) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType49);
        int int51 = matchNodeType49.type;
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.containsType(node30, 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType49);
        int int53 = com.google.javascript.jscomp.NodeUtil.getCount(node4, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType49);
        com.google.javascript.rhino.JSDocInfo jSDocInfo54 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node4);
        com.google.javascript.rhino.Node node55 = com.google.javascript.jscomp.NodeUtil.newName("||", node4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean56 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Non-literal value: NAME hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 10 + "'", int51 == 10);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNull(jSDocInfo54);
        org.junit.Assert.assertNotNull(node55);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node5, node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node5);
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newName("", node5);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node5);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType15 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) ' ');
        int int16 = com.google.javascript.jscomp.NodeUtil.getCount(node5, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType15);
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newExpr(node5);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node17);
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newVarNode("instanceof", node17);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
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
        com.google.javascript.rhino.Node node37 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node41 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node37, node41);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node37);
        int int45 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node37, "hi!");
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isLhs(node21, node37);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isName(node21);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isName(node21);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "||" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node4, node8);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType12 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.containsType(node8, (int) (short) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType12);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType15 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        int int16 = matchNodeType15.type;
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node20, node24);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType28 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.containsType(node24, (int) (short) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType28);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.has(node8, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType15, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType28);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node8);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node8);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isGet(node8);
        com.google.javascript.rhino.Node node34 = com.google.javascript.jscomp.NodeUtil.newVarNode("||", node8);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node8);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType1 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType(6);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.Normalize.NormalizeStatements normalizeStatements2 = new com.google.javascript.jscomp.Normalize.NormalizeStatements(abstractCompiler0, false);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node7);
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate10 = null;
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node7, "hi!", nodePredicate10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.containsCall(node7);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node7);
        int int15 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node7, "hi!");
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isGet(node7);
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node21, node25);
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node21);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isConstantName(node21);
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node37 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node33, node37);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType41 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.containsType(node37, (int) (short) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType41);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.containsType(node21, (int) '4', (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType41);
        com.google.javascript.rhino.Node node44 = com.google.javascript.jscomp.NodeUtil.newName("$$", node21);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node7, node44);
        com.google.javascript.rhino.JSDocInfo jSDocInfo46 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node44);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node44);
        com.google.javascript.rhino.Node node51 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType54 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 10);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.containsType(node51, (int) (short) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType54);
        boolean boolean56 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node51);
        com.google.javascript.rhino.Node node60 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node64 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean65 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node60, node64);
        int int67 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node60, "");
        boolean boolean68 = com.google.javascript.jscomp.NodeUtil.isCall(node60);
        boolean boolean69 = com.google.javascript.jscomp.NodeUtil.isCall(node60);
        com.google.javascript.rhino.Node node73 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        com.google.javascript.rhino.Node node77 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) -1, (int) 'a');
        boolean boolean78 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node73, node77);
        boolean boolean79 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node73);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node60, node73);
        boolean boolean81 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node51, node60);
        boolean boolean82 = com.google.javascript.jscomp.NodeUtil.referencesThis(node60);
        boolean boolean83 = normalizeStatements2.shouldTraverse(nodeTraversal3, node44, node60);
        boolean boolean84 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node60);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(jSDocInfo46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }
}

