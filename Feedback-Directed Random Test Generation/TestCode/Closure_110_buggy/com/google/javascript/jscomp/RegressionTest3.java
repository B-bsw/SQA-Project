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
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean4 = node3.isTry();
        boolean boolean5 = node3.isInc();
        boolean boolean6 = node3.isWith();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean11 = node10.isTry();
        boolean boolean12 = node10.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo13 = null;
        com.google.javascript.rhino.Node node14 = node10.setJSDocInfo(jSDocInfo13);
        node3.addChildrenToFront(node10);
        int int16 = node10.getLineno();
        boolean boolean17 = node10.isEmpty();
        boolean boolean18 = node10.isTrue();
        com.google.javascript.rhino.Node[] nodeArray20 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node(409601, nodeArray20);
        node10.addChildrenToBack(node21);
        node10.setSourceEncodedPosition(50);
        node10.removeProp(48);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(nodeArray20);
        org.junit.Assert.assertArrayEquals(nodeArray20, new com.google.javascript.rhino.Node[] {});
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString((int) (short) 1, "");
        boolean boolean4 = node3.hasChildren();
        node3.setWasEmptyNode(true);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(47, node3, 12, (int) '#');
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node4.putIntProp(0, (int) ' ');
        boolean boolean8 = node4.isSetterDef();
        int int9 = node4.getLength();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node13.putIntProp(0, (int) ' ');
        boolean boolean17 = node13.isSetterDef();
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean22 = node21.isTry();
        boolean boolean23 = node21.isInc();
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((-1), node4, node13, node21);
        boolean boolean25 = node13.isQualifiedName();
        boolean boolean26 = node13.isAnd();
        boolean boolean27 = node13.isTypeOf();
        boolean boolean28 = node13.isAssign();
        com.google.javascript.rhino.Node node29 = node13.cloneTree();
        boolean boolean30 = node29.hasChildren();
        boolean boolean31 = node29.isDefaultCase();
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node35.putIntProp(0, (int) ' ');
        boolean boolean39 = node35.isName();
        node35.addSuppression("ERROR 0");
        boolean boolean42 = node35.isTypeOf();
        boolean boolean43 = node35.isLabel();
        com.google.javascript.rhino.Node node44 = node29.copyInformationFromForTree(node35);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node44);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node4.putIntProp(0, (int) ' ');
        boolean boolean8 = node4.isSetterDef();
        int int9 = node4.getLength();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node13.putIntProp(0, (int) ' ');
        boolean boolean17 = node13.isSetterDef();
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean22 = node21.isTry();
        boolean boolean23 = node21.isInc();
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((-1), node4, node13, node21);
        boolean boolean25 = node24.isBlock();
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node30.putIntProp(0, (int) ' ');
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile34 = node30.getStaticSourceFile();
        boolean boolean35 = node30.isNull();
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean40 = node39.isTry();
        boolean boolean41 = node39.isInc();
        boolean boolean42 = node39.isWith();
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean47 = node46.isTry();
        boolean boolean48 = node46.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo49 = null;
        com.google.javascript.rhino.Node node50 = node46.setJSDocInfo(jSDocInfo49);
        node39.addChildrenToFront(node46);
        node39.setSourceEncodedPositionForTree((int) (short) 0);
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node((int) (byte) 10, node30, node39);
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node59.putIntProp(0, (int) ' ');
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile63 = node59.getStaticSourceFile();
        boolean boolean64 = node59.isNull();
        com.google.javascript.rhino.Node node68 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean69 = node68.isTry();
        boolean boolean70 = node68.isInc();
        boolean boolean71 = node68.isWith();
        com.google.javascript.rhino.Node node75 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean76 = node75.isTry();
        boolean boolean77 = node75.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo78 = null;
        com.google.javascript.rhino.Node node79 = node75.setJSDocInfo(jSDocInfo78);
        node68.addChildrenToFront(node75);
        node68.setSourceEncodedPositionForTree((int) (short) 0);
        com.google.javascript.rhino.Node node83 = new com.google.javascript.rhino.Node((int) (byte) 10, node59, node68);
        node59.detachChildren();
        com.google.javascript.rhino.Node node85 = node39.useSourceInfoFrom(node59);
        boolean boolean86 = node39.isTry();
        int int87 = node24.getIndexOfChild(node39);
        com.google.javascript.rhino.Node node91 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean92 = node91.isTry();
        boolean boolean93 = node91.isInc();
        boolean boolean94 = node91.isWhile();
        boolean boolean95 = node91.isLabelName();
        boolean boolean96 = node39.isEquivalentToShallow(node91);
        com.google.javascript.rhino.jstype.JSType jSType97 = null;
        node39.setJSType(jSType97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(staticSourceFile34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNull(staticSourceFile63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("ERROR 0", 54, (int) (short) 0);
        boolean boolean4 = node3.isArrayLit();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node3.putIntProp(0, (int) ' ');
        boolean boolean7 = node3.isSetterDef();
        int int8 = node3.getLength();
        boolean boolean9 = node3.isLabel();
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node14.putIntProp(0, (int) ' ');
        boolean boolean18 = node14.isSetterDef();
        int int19 = node14.getLength();
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node23.putIntProp(0, (int) ' ');
        boolean boolean27 = node23.isSetterDef();
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean32 = node31.isTry();
        boolean boolean33 = node31.isInc();
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node((-1), node14, node23, node31);
        boolean boolean35 = node23.isQualifiedName();
        boolean boolean36 = node23.isAnd();
        boolean boolean37 = node23.isWith();
        java.lang.String str38 = node3.checkTreeEquals(node23);
        boolean boolean39 = node3.isStringKey();
        boolean boolean40 = node3.isOr();
        boolean boolean41 = node3.isOr();
        java.util.Set<java.lang.String> strSet42 = node3.getDirectives();
        com.google.javascript.rhino.Node node45 = com.google.javascript.rhino.Node.newString((int) (short) 1, "");
        boolean boolean46 = node45.hasChildren();
        boolean boolean47 = node45.wasEmptyNode();
        boolean boolean48 = node45.isLocalResultCall();
        com.google.javascript.rhino.Node node49 = node3.useSourceInfoIfMissingFrom(node45);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder50 = node49.getJsDocBuilderForNode();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(strSet42);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder50);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean4 = node3.isTry();
        boolean boolean5 = node3.isInc();
        boolean boolean6 = node3.isWith();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean11 = node10.isTry();
        boolean boolean12 = node10.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo13 = null;
        com.google.javascript.rhino.Node node14 = node10.setJSDocInfo(jSDocInfo13);
        node3.addChildrenToFront(node10);
        int int16 = node10.getLineno();
        boolean boolean17 = node10.isEmpty();
        boolean boolean18 = node10.isTrue();
        com.google.javascript.rhino.Node[] nodeArray20 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node(409601, nodeArray20);
        node10.addChildrenToBack(node21);
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node27.putIntProp(0, (int) ' ');
        boolean boolean31 = node27.isSetterDef();
        int int32 = node27.getLength();
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node36.putIntProp(0, (int) ' ');
        boolean boolean40 = node36.isSetterDef();
        com.google.javascript.rhino.Node node44 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean45 = node44.isTry();
        boolean boolean46 = node44.isInc();
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node((-1), node27, node36, node44);
        node27.setOptionalArg(true);
        com.google.javascript.rhino.Node node50 = node10.copyInformationFromForTree(node27);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile51 = null;
        node27.setStaticSourceFile(staticSourceFile51);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(nodeArray20);
        org.junit.Assert.assertArrayEquals(nodeArray20, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node50);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = new com.google.javascript.rhino.Node.SideEffectFlags(32);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean4 = node3.isTry();
        boolean boolean5 = node3.isInc();
        boolean boolean6 = node3.isWith();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean11 = node10.isTry();
        boolean boolean12 = node10.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo13 = null;
        com.google.javascript.rhino.Node node14 = node10.setJSDocInfo(jSDocInfo13);
        node3.addChildrenToFront(node10);
        boolean boolean16 = node10.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node22.putIntProp(0, (int) ' ');
        boolean boolean26 = node22.isSetterDef();
        int int27 = node22.getLength();
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node31.putIntProp(0, (int) ' ');
        boolean boolean35 = node31.isSetterDef();
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean40 = node39.isTry();
        boolean boolean41 = node39.isInc();
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node((-1), node22, node31, node39);
        boolean boolean43 = node31.isNumber();
        com.google.javascript.rhino.Node node47 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean48 = node47.isTry();
        boolean boolean49 = node47.isInc();
        boolean boolean50 = node47.isWith();
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean55 = node54.isTry();
        boolean boolean56 = node54.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo57 = null;
        com.google.javascript.rhino.Node node58 = node54.setJSDocInfo(jSDocInfo57);
        node47.addChildrenToFront(node54);
        int int60 = node54.getLineno();
        node54.setOptionalArg(true);
        boolean boolean63 = node54.isOnlyModifiesArgumentsCall();
        boolean boolean64 = node31.isEquivalentToTyped(node54);
        node10.putProp((int) '4', (java.lang.Object) node54);
        com.google.javascript.rhino.Node node69 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node69.putIntProp(0, (int) ' ');
        boolean boolean73 = node69.isSetterDef();
        int int74 = node69.getLength();
        com.google.javascript.rhino.JSDocInfo jSDocInfo75 = node69.getJSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo76 = node69.getJSDocInfo();
        boolean boolean77 = node54.isEquivalentToTyped(node69);
        int int78 = node69.getChangeTime();
        boolean boolean79 = node69.isLabelName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 100 + "'", int60 == 100);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNull(jSDocInfo75);
        org.junit.Assert.assertNull(jSDocInfo76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (short) 1, "");
        boolean boolean3 = node2.hasChildren();
        boolean boolean4 = node2.wasEmptyNode();
        boolean boolean5 = node2.isLocalResultCall();
        com.google.javascript.rhino.Node node6 = node2.getNext();
        boolean boolean7 = node2.isHook();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node3.putIntProp(0, (int) ' ');
        boolean boolean7 = node3.isSetterDef();
        com.google.javascript.rhino.jstype.JSType jSType8 = node3.getJSType();
        boolean boolean9 = node3.isString();
        boolean boolean10 = node3.isNoSideEffectsCall();
        com.google.javascript.rhino.Node node11 = node3.getFirstChild();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node4.putIntProp(0, (int) ' ');
        boolean boolean8 = node4.isSetterDef();
        int int9 = node4.getLength();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node13.putIntProp(0, (int) ' ');
        boolean boolean17 = node13.isSetterDef();
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean22 = node21.isTry();
        boolean boolean23 = node21.isInc();
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((-1), node4, node13, node21);
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node29.putIntProp(0, (int) ' ');
        boolean boolean33 = node29.isSetterDef();
        int int34 = node29.getLength();
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node38.putIntProp(0, (int) ' ');
        boolean boolean42 = node38.isSetterDef();
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean47 = node46.isTry();
        boolean boolean48 = node46.isInc();
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node((-1), node29, node38, node46);
        boolean boolean50 = node38.isQualifiedName();
        boolean boolean51 = node38.isAnd();
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node55.putIntProp(0, (int) ' ');
        boolean boolean59 = node55.isVar();
        boolean boolean60 = node55.isNull();
        boolean boolean61 = node38.isEquivalentToShallow(node55);
        com.google.javascript.rhino.Node node62 = node21.copyInformationFrom(node38);
        boolean boolean63 = node21.isTrue();
        boolean boolean64 = node21.isEmpty();
        com.google.javascript.rhino.Node node69 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node69.putIntProp(0, (int) ' ');
        boolean boolean73 = node69.isSetterDef();
        int int74 = node69.getLength();
        com.google.javascript.rhino.Node node78 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node78.putIntProp(0, (int) ' ');
        boolean boolean82 = node78.isSetterDef();
        com.google.javascript.rhino.Node node86 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean87 = node86.isTry();
        boolean boolean88 = node86.isInc();
        com.google.javascript.rhino.Node node89 = new com.google.javascript.rhino.Node((-1), node69, node78, node86);
        boolean boolean90 = node78.isQualifiedName();
        boolean boolean91 = node78.isAnd();
        boolean boolean92 = node78.isTypeOf();
        boolean boolean93 = node78.isLabel();
        com.google.javascript.rhino.Node node94 = node21.copyInformationFrom(node78);
        boolean boolean95 = node78.isStringKey();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(node94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) (byte) 10, 36, 2);
        boolean boolean4 = node3.isQualifiedName();
        node3.setType(31);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node3.putIntProp(0, (int) ' ');
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile7 = node3.getStaticSourceFile();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = node3.getDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: unexpected prop id 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(staticSourceFile7);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node4.putIntProp(0, (int) ' ');
        boolean boolean8 = node4.isSetterDef();
        int int9 = node4.getLength();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node13.putIntProp(0, (int) ' ');
        boolean boolean17 = node13.isSetterDef();
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean22 = node21.isTry();
        boolean boolean23 = node21.isInc();
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((-1), node4, node13, node21);
        boolean boolean25 = node13.isQualifiedName();
        boolean boolean26 = node13.isSwitch();
        node13.setWasEmptyNode(false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString((int) '4', "goog.scope");
        node3.setVarArgs(false);
        boolean boolean6 = node3.isWith();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node10.putIntProp(0, (int) ' ');
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile14 = node10.getStaticSourceFile();
        com.google.javascript.rhino.Node node17 = com.google.javascript.rhino.Node.newString((int) (short) 1, "");
        int int18 = node17.getType();
        boolean boolean19 = node17.wasEmptyNode();
        boolean boolean20 = node17.isNumber();
        boolean boolean21 = node17.isString();
        boolean boolean22 = node17.wasEmptyNode();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newNumber((double) (short) 10, 30, 30);
        boolean boolean27 = node26.isVar();
        boolean boolean28 = node26.isAssign();
        boolean boolean29 = node26.isVarArgs();
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node(30, node3, node10, node17, node26);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(staticSourceFile14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.PreprocessorSymbolTable preprocessorSymbolTable1 = null;
        com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler aliasTransformationHandler2 = null;
        com.google.javascript.jscomp.ScopedAliases scopedAliases3 = new com.google.javascript.jscomp.ScopedAliases(abstractCompiler0, preprocessorSymbolTable1, aliasTransformationHandler2);
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean8 = node7.isTry();
        boolean boolean9 = node7.isInc();
        boolean boolean10 = node7.isWith();
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean15 = node14.isTry();
        boolean boolean16 = node14.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo17 = null;
        com.google.javascript.rhino.Node node18 = node14.setJSDocInfo(jSDocInfo17);
        node7.addChildrenToFront(node14);
        int int20 = node14.getLineno();
        boolean boolean21 = node14.isEmpty();
        boolean boolean22 = node14.isTrue();
        com.google.javascript.rhino.Node[] nodeArray24 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node(409601, nodeArray24);
        node14.addChildrenToBack(node25);
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean31 = node30.isTry();
        boolean boolean32 = node30.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo33 = null;
        com.google.javascript.rhino.Node node34 = node30.setJSDocInfo(jSDocInfo33);
        boolean boolean35 = node34.isStringKey();
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node40.putIntProp(0, (int) ' ');
        boolean boolean44 = node40.isSetterDef();
        int int45 = node40.getLength();
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node49.putIntProp(0, (int) ' ');
        boolean boolean53 = node49.isSetterDef();
        com.google.javascript.rhino.Node node57 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean58 = node57.isTry();
        boolean boolean59 = node57.isInc();
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node((-1), node40, node49, node57);
        boolean boolean61 = node49.isQualifiedName();
        boolean boolean62 = node49.isAnd();
        boolean boolean63 = node49.isWith();
        boolean boolean64 = node49.isNumber();
        boolean boolean65 = node34.hasChild(node49);
        boolean boolean67 = node34.getBooleanProp(2);
        boolean boolean68 = node34.isOnlyModifiesArgumentsCall();
        // The following exception was thrown during execution in test generation
        try {
            scopedAliases3.hotSwapScript(node14, node34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(nodeArray24);
        org.junit.Assert.assertArrayEquals(nodeArray24, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(29, 4, (int) (byte) -1);
        boolean boolean4 = node3.isDebugger();
        boolean boolean5 = node3.isComma();
        boolean boolean6 = node3.isOnlyModifiesArgumentsCall();
        boolean boolean7 = node3.isVar();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean4 = node3.isTry();
        boolean boolean5 = node3.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = null;
        com.google.javascript.rhino.Node node7 = node3.setJSDocInfo(jSDocInfo6);
        node7.setLineno(8);
        node7.removeProp(4095);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile12 = null;
        node7.setStaticSourceFile(staticSourceFile12);
        int int14 = node7.getLength();
        boolean boolean15 = node7.isFor();
        boolean boolean16 = node7.isCall();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags0 = new com.google.javascript.rhino.Node.SideEffectFlags();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = sideEffectFlags0.setThrows();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags2 = sideEffectFlags1.setReturnsTainted();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags3 = sideEffectFlags1.setMutatesGlobalState();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags4 = sideEffectFlags3.setMutatesThis();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags5 = sideEffectFlags3.setAllFlags();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags6 = sideEffectFlags5.clearAllFlags();
        org.junit.Assert.assertNotNull(sideEffectFlags1);
        org.junit.Assert.assertNotNull(sideEffectFlags2);
        org.junit.Assert.assertNotNull(sideEffectFlags3);
        org.junit.Assert.assertNotNull(sideEffectFlags4);
        org.junit.Assert.assertNotNull(sideEffectFlags5);
        org.junit.Assert.assertNotNull(sideEffectFlags6);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean5 = node4.isTry();
        boolean boolean6 = node4.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo7 = null;
        com.google.javascript.rhino.Node node8 = node4.setJSDocInfo(jSDocInfo7);
        boolean boolean9 = node8.isLabelName();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean14 = node13.isTry();
        boolean boolean15 = node13.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo16 = null;
        com.google.javascript.rhino.Node node17 = node13.setJSDocInfo(jSDocInfo16);
        boolean boolean18 = node17.isStringKey();
        boolean boolean19 = node17.isFromExterns();
        node8.addChildrenToFront(node17);
        boolean boolean21 = node8.isEmpty();
        boolean boolean22 = node8.isWhile();
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean27 = node26.isTry();
        boolean boolean28 = node26.isInc();
        boolean boolean29 = node26.isWith();
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean34 = node33.isTry();
        boolean boolean35 = node33.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo36 = null;
        com.google.javascript.rhino.Node node37 = node33.setJSDocInfo(jSDocInfo36);
        node26.addChildrenToFront(node33);
        node26.setSourceEncodedPositionForTree((int) (short) 0);
        com.google.javascript.rhino.Node node44 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean45 = node44.isTry();
        boolean boolean46 = node44.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo47 = null;
        com.google.javascript.rhino.Node node48 = node44.setJSDocInfo(jSDocInfo47);
        node26.addChildrenToBack(node44);
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean54 = node53.isTry();
        boolean boolean55 = node53.isInc();
        boolean boolean56 = node53.isWith();
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean61 = node60.isTry();
        boolean boolean62 = node60.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo63 = null;
        com.google.javascript.rhino.Node node64 = node60.setJSDocInfo(jSDocInfo63);
        node53.addChildrenToFront(node60);
        node53.setSourceEncodedPositionForTree((int) (short) 0);
        node26.addChildrenToFront(node53);
        com.google.javascript.rhino.Node node69 = node8.useSourceInfoFromForTree(node26);
        boolean boolean70 = node69.wasEmptyNode();
        boolean boolean71 = node69.isNumber();
        com.google.javascript.rhino.Node node75 = new com.google.javascript.rhino.Node(29, 4, (int) (byte) -1);
        boolean boolean76 = node75.isDebugger();
        boolean boolean77 = node75.isDec();
        com.google.javascript.rhino.Node node82 = com.google.javascript.rhino.Node.newString((int) (byte) 10, "ERROR 0\n    ERROR 0\n", 151551, (int) (byte) 1);
        com.google.javascript.rhino.Node node85 = new com.google.javascript.rhino.Node(47, node69, node75, node82, 31, 16);
        com.google.javascript.rhino.Node node87 = com.google.javascript.rhino.Node.newString("goog.scope");
        int int88 = node87.getChildCount();
        boolean boolean89 = node87.isBreak();
        node87.setCharno(48);
        boolean boolean92 = node87.isNE();
        boolean boolean93 = node87.isComma();
        boolean boolean94 = node87.isQualifiedName();
        node75.addChildToFront(node87);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertNotNull(node87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        com.google.javascript.rhino.Node[] nodeArray2 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(409601, nodeArray2);
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node(48, nodeArray2);
        org.junit.Assert.assertNotNull(nodeArray2);
        org.junit.Assert.assertArrayEquals(nodeArray2, new com.google.javascript.rhino.Node[] {});
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newNumber((double) 56, (int) '#', (int) (short) 0);
        boolean boolean5 = node4.isObjectLit();
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node(51, node4);
        boolean boolean7 = node6.isObjectLit();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        boolean boolean2 = node1.isCast();
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable3 = node1.getAncestors();
        java.util.Iterator<com.google.javascript.rhino.Node> nodeItor4 = ancestorIterable3.iterator();
        java.util.Iterator<com.google.javascript.rhino.Node> nodeItor5 = ancestorIterable3.iterator();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(ancestorIterable3);
        org.junit.Assert.assertNotNull(nodeItor4);
        org.junit.Assert.assertNotNull(nodeItor5);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean4 = node3.isTry();
        boolean boolean5 = node3.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = null;
        com.google.javascript.rhino.Node node7 = node3.setJSDocInfo(jSDocInfo6);
        boolean boolean8 = node7.isStringKey();
        boolean boolean9 = node7.isFromExterns();
        boolean boolean10 = node7.isNull();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable11 = node7.children();
        boolean boolean12 = node7.isIf();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(nodeIterable11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node4.putIntProp(0, (int) ' ');
        boolean boolean8 = node4.isSetterDef();
        int int9 = node4.getLength();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node13.putIntProp(0, (int) ' ');
        boolean boolean17 = node13.isSetterDef();
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean22 = node21.isTry();
        boolean boolean23 = node21.isInc();
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((-1), node4, node13, node21);
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node29.putIntProp(0, (int) ' ');
        boolean boolean33 = node29.isSetterDef();
        int int34 = node29.getLength();
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node38.putIntProp(0, (int) ' ');
        boolean boolean42 = node38.isSetterDef();
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean47 = node46.isTry();
        boolean boolean48 = node46.isInc();
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node((-1), node29, node38, node46);
        boolean boolean50 = node38.isQualifiedName();
        boolean boolean51 = node38.isAnd();
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node55.putIntProp(0, (int) ' ');
        boolean boolean59 = node55.isVar();
        boolean boolean60 = node55.isNull();
        boolean boolean61 = node38.isEquivalentToShallow(node55);
        com.google.javascript.rhino.Node node62 = node21.copyInformationFrom(node38);
        node21.setSourceEncodedPosition(50);
        java.lang.String str65 = node21.toString();
        boolean boolean66 = node21.hasMoreThanOneChild();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "ERROR 0" + "'", str65, "ERROR 0");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node4.putIntProp(0, (int) ' ');
        com.google.javascript.rhino.Node node11 = com.google.javascript.rhino.Node.newString("hi!", 53, 57);
        boolean boolean12 = node4.isEquivalentToShallow(node11);
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node((int) (short) -1, node4, (int) (short) 10, 53);
        boolean boolean16 = node15.isNumber();
        boolean boolean17 = node15.isString();
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((-1), "hi!");
        int int3 = node2.getSourceOffset();
        int int4 = node2.getSourceOffset();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = null;
        com.google.javascript.rhino.Node node6 = node2.setJSDocInfo(jSDocInfo5);
        boolean boolean7 = node2.isSwitch();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder8 = node2.new FileLevelJsDocBuilder();
        fileLevelJsDocBuilder8.append("hi!");
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        com.google.javascript.rhino.Node node5 = com.google.javascript.rhino.Node.newString((int) (short) 0, "NUMBER 0.0 100", (int) (byte) -1, 40);
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node(52, node5, (int) 'a', 409601);
        org.junit.Assert.assertNotNull(node5);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("Node tree inequality:\nTree1:\nSTRING goog.scope\n\n\nTree2:\nERROR 100\n\n\nSubtree1: STRING goog.scope\n\n\nSubtree2: ERROR 100\n", (int) (byte) 10, 52);
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node8.putIntProp(0, (int) ' ');
        boolean boolean12 = node8.isSetterDef();
        int int13 = node8.getLength();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node17.putIntProp(0, (int) ' ');
        boolean boolean21 = node17.isSetterDef();
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean26 = node25.isTry();
        boolean boolean27 = node25.isInc();
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((-1), node8, node17, node25);
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean33 = node32.isTry();
        boolean boolean34 = node32.isInc();
        boolean boolean35 = node32.isWith();
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean40 = node39.isTry();
        boolean boolean41 = node39.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo42 = null;
        com.google.javascript.rhino.Node node43 = node39.setJSDocInfo(jSDocInfo42);
        node32.addChildrenToFront(node39);
        node32.setSourceEncodedPositionForTree((int) (short) 0);
        boolean boolean47 = node32.hasChildren();
        boolean boolean48 = node32.isNot();
        boolean boolean49 = node32.isIn();
        com.google.javascript.rhino.Node node50 = node8.srcrefTree(node32);
        boolean boolean51 = node32.hasMoreThanOneChild();
        com.google.javascript.rhino.jstype.JSType jSType52 = node32.getJSType();
        boolean boolean53 = node32.isFor();
        boolean boolean54 = node32.isInc();
        boolean boolean55 = node32.isSetterDef();
        boolean boolean56 = node3.isEquivalentTo(node32);
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node60.putIntProp(0, (int) ' ');
        boolean boolean64 = node60.isSetterDef();
        int int65 = node60.getLength();
        boolean boolean66 = node60.isLabel();
        boolean boolean67 = node60.isFromExterns();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node68 = node3.removeChildAfter(node60);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: prev is not a child of this node.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(jSType52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean4 = node3.isTry();
        boolean boolean5 = node3.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = null;
        com.google.javascript.rhino.Node node7 = node3.setJSDocInfo(jSDocInfo6);
        node7.setLineno(8);
        node7.removeProp(4095);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile12 = null;
        node7.setStaticSourceFile(staticSourceFile12);
        node7.setCharno((int) (short) 10);
        boolean boolean16 = node7.isParamList();
        com.google.javascript.rhino.Node node19 = com.google.javascript.rhino.Node.newString((-1), "hi!");
        int int20 = node19.getSourceOffset();
        int int21 = node19.getSourceOffset();
        com.google.javascript.rhino.JSDocInfo jSDocInfo22 = null;
        com.google.javascript.rhino.Node node23 = node19.setJSDocInfo(jSDocInfo22);
        boolean boolean24 = node19.isSwitch();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder25 = node19.new FileLevelJsDocBuilder();
        int int26 = node7.getIndexOfChild(node19);
        boolean boolean27 = node7.isVarArgs();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean5 = node4.isTry();
        java.lang.String str6 = node4.getSourceFileName();
        int int7 = node4.getSideEffectFlags();
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node11.putIntProp(0, (int) ' ');
        boolean boolean15 = node11.isSetterDef();
        int int16 = node11.getLength();
        boolean boolean17 = node11.isLabel();
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node22.putIntProp(0, (int) ' ');
        boolean boolean26 = node22.isSetterDef();
        int int27 = node22.getLength();
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node31.putIntProp(0, (int) ' ');
        boolean boolean35 = node31.isSetterDef();
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean40 = node39.isTry();
        boolean boolean41 = node39.isInc();
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node((-1), node22, node31, node39);
        boolean boolean43 = node31.isQualifiedName();
        boolean boolean44 = node31.isAnd();
        boolean boolean45 = node31.isWith();
        java.lang.String str46 = node11.checkTreeEquals(node31);
        boolean boolean47 = node31.isIf();
        java.lang.String str48 = node31.getSourceFileName();
        boolean boolean49 = node4.isEquivalentToTyped(node31);
        boolean boolean50 = node4.isArrayLit();
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean56 = node55.isTry();
        boolean boolean57 = node55.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo58 = null;
        com.google.javascript.rhino.Node node59 = node55.setJSDocInfo(jSDocInfo58);
        boolean boolean60 = node55.isOr();
        com.google.javascript.rhino.Node node64 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node64.putIntProp(0, (int) ' ');
        boolean boolean68 = node64.isSetterDef();
        int int69 = node64.getLength();
        boolean boolean70 = node64.isLabel();
        boolean boolean71 = node64.isFromExterns();
        com.google.javascript.rhino.Node node75 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        com.google.javascript.rhino.Node node76 = node75.cloneTree();
        boolean boolean77 = node76.isNumber();
        node76.detachChildren();
        boolean boolean79 = node76.isLocalResultCall();
        com.google.javascript.rhino.Node node80 = new com.google.javascript.rhino.Node(29, node55, node64, node76);
        node55.detachChildren();
        com.google.javascript.rhino.Node node83 = com.google.javascript.rhino.Node.newString("goog.scope");
        node83.setIsSyntheticBlock(true);
        boolean boolean86 = node83.isFor();
        boolean boolean87 = node83.isSwitch();
        com.google.javascript.rhino.Node node88 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node89 = new com.google.javascript.rhino.Node((int) (byte) 100, node4, node55, node83, node88);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node3.putIntProp(0, (int) ' ');
        boolean boolean7 = node3.isName();
        node3.addSuppression("ERROR 0");
        boolean boolean10 = node3.isTypeOf();
        node3.setCharno((int) (byte) 0);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node17.putIntProp(0, (int) ' ');
        boolean boolean21 = node17.isSetterDef();
        int int22 = node17.getLength();
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node26.putIntProp(0, (int) ' ');
        boolean boolean30 = node26.isSetterDef();
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean35 = node34.isTry();
        boolean boolean36 = node34.isInc();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((-1), node17, node26, node34);
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node42.putIntProp(0, (int) ' ');
        boolean boolean46 = node42.isSetterDef();
        int int47 = node42.getLength();
        com.google.javascript.rhino.Node node51 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node51.putIntProp(0, (int) ' ');
        boolean boolean55 = node51.isSetterDef();
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean60 = node59.isTry();
        boolean boolean61 = node59.isInc();
        com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node((-1), node42, node51, node59);
        boolean boolean63 = node51.isQualifiedName();
        boolean boolean64 = node51.isAnd();
        com.google.javascript.rhino.Node node68 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node68.putIntProp(0, (int) ' ');
        boolean boolean72 = node68.isVar();
        boolean boolean73 = node68.isNull();
        boolean boolean74 = node51.isEquivalentToShallow(node68);
        com.google.javascript.rhino.Node node75 = node34.copyInformationFrom(node51);
        int int76 = node75.getChangeTime();
        com.google.javascript.rhino.Node node77 = node3.useSourceInfoFromForTree(node75);
        boolean boolean78 = node77.isCall();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node3.putIntProp(0, (int) ' ');
        boolean boolean7 = node3.isSetterDef();
        int int8 = node3.getLength();
        boolean boolean9 = node3.isLabel();
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node14.putIntProp(0, (int) ' ');
        boolean boolean18 = node14.isSetterDef();
        int int19 = node14.getLength();
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node23.putIntProp(0, (int) ' ');
        boolean boolean27 = node23.isSetterDef();
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean32 = node31.isTry();
        boolean boolean33 = node31.isInc();
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node((-1), node14, node23, node31);
        boolean boolean35 = node23.isQualifiedName();
        boolean boolean36 = node23.isAnd();
        boolean boolean37 = node23.isWith();
        java.lang.String str38 = node3.checkTreeEquals(node23);
        boolean boolean39 = node3.isStringKey();
        boolean boolean40 = node3.isOr();
        boolean boolean41 = node3.isOr();
        java.util.Set<java.lang.String> strSet42 = node3.getDirectives();
        boolean boolean43 = node3.isQuotedString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(strSet42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node4.putIntProp(0, (int) ' ');
        boolean boolean8 = node4.isSetterDef();
        int int9 = node4.getLength();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node13.putIntProp(0, (int) ' ');
        boolean boolean17 = node13.isSetterDef();
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean22 = node21.isTry();
        boolean boolean23 = node21.isInc();
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((-1), node4, node13, node21);
        boolean boolean25 = node24.isBlock();
        boolean boolean26 = node24.isFor();
        boolean boolean27 = node24.isInstanceOf();
        com.google.javascript.rhino.JSDocInfo jSDocInfo28 = null;
        com.google.javascript.rhino.Node node29 = node24.setJSDocInfo(jSDocInfo28);
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node34.putIntProp(0, (int) ' ');
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile38 = node34.getStaticSourceFile();
        boolean boolean39 = node34.isNull();
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean44 = node43.isTry();
        boolean boolean45 = node43.isInc();
        boolean boolean46 = node43.isWith();
        com.google.javascript.rhino.Node node50 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean51 = node50.isTry();
        boolean boolean52 = node50.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo53 = null;
        com.google.javascript.rhino.Node node54 = node50.setJSDocInfo(jSDocInfo53);
        node43.addChildrenToFront(node50);
        node43.setSourceEncodedPositionForTree((int) (short) 0);
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node((int) (byte) 10, node34, node43);
        com.google.javascript.rhino.Node node63 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node63.putIntProp(0, (int) ' ');
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile67 = node63.getStaticSourceFile();
        boolean boolean68 = node63.isNull();
        com.google.javascript.rhino.Node node72 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean73 = node72.isTry();
        boolean boolean74 = node72.isInc();
        boolean boolean75 = node72.isWith();
        com.google.javascript.rhino.Node node79 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean80 = node79.isTry();
        boolean boolean81 = node79.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo82 = null;
        com.google.javascript.rhino.Node node83 = node79.setJSDocInfo(jSDocInfo82);
        node72.addChildrenToFront(node79);
        node72.setSourceEncodedPositionForTree((int) (short) 0);
        com.google.javascript.rhino.Node node87 = new com.google.javascript.rhino.Node((int) (byte) 10, node63, node72);
        node63.detachChildren();
        com.google.javascript.rhino.Node node89 = node43.useSourceInfoFrom(node63);
        com.google.javascript.rhino.jstype.JSType jSType90 = node43.getJSType();
        com.google.javascript.rhino.Node node91 = node43.getLastSibling();
        boolean boolean92 = node91.isBreak();
        com.google.javascript.rhino.Node node93 = node24.copyInformationFromForTree(node91);
        boolean boolean94 = node24.hasChildren();
        com.google.javascript.rhino.Node node95 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node96 = node24.useSourceInfoIfMissingFrom(node95);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNull(staticSourceFile38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNull(staticSourceFile67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertNotNull(node89);
        org.junit.Assert.assertNull(jSType90);
        org.junit.Assert.assertNotNull(node91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(node93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean4 = node3.isTry();
        boolean boolean5 = node3.isInc();
        boolean boolean6 = node3.isWith();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean11 = node10.isTry();
        boolean boolean12 = node10.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo13 = null;
        com.google.javascript.rhino.Node node14 = node10.setJSDocInfo(jSDocInfo13);
        node3.addChildrenToFront(node10);
        node3.setSourceEncodedPositionForTree((int) (short) 0);
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean22 = node21.isTry();
        boolean boolean23 = node21.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo24 = null;
        com.google.javascript.rhino.Node node25 = node21.setJSDocInfo(jSDocInfo24);
        node3.addChildrenToBack(node21);
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean31 = node30.isTry();
        boolean boolean32 = node30.isInc();
        boolean boolean33 = node30.isWith();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean38 = node37.isTry();
        boolean boolean39 = node37.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo40 = null;
        com.google.javascript.rhino.Node node41 = node37.setJSDocInfo(jSDocInfo40);
        node30.addChildrenToFront(node37);
        node30.setSourceEncodedPositionForTree((int) (short) 0);
        node3.addChildrenToFront(node30);
        boolean boolean46 = node30.isIn();
        node30.putBooleanProp(0, true);
        node30.putBooleanProp(48, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str53 = node30.toStringTree();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: unexpected prop id 0");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean4 = node3.isTry();
        boolean boolean5 = node3.isInc();
        boolean boolean6 = node3.isWith();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean11 = node10.isTry();
        boolean boolean12 = node10.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo13 = null;
        com.google.javascript.rhino.Node node14 = node10.setJSDocInfo(jSDocInfo13);
        node3.addChildrenToFront(node10);
        node3.setSourceEncodedPositionForTree((int) (short) 0);
        boolean boolean18 = node3.hasChildren();
        boolean boolean19 = node3.isNot();
        boolean boolean20 = node3.isIn();
        boolean boolean21 = node3.isLabel();
        boolean boolean22 = node3.isAssignAdd();
        boolean boolean23 = node3.isOnlyModifiesThisCall();
        com.google.javascript.rhino.Node node26 = com.google.javascript.rhino.Node.newString((int) (short) 1, "");
        boolean boolean27 = node26.hasChildren();
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node32.putIntProp(0, (int) ' ');
        boolean boolean36 = node32.isSetterDef();
        int int37 = node32.getLength();
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node41.putIntProp(0, (int) ' ');
        boolean boolean45 = node41.isSetterDef();
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean50 = node49.isTry();
        boolean boolean51 = node49.isInc();
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node((-1), node32, node41, node49);
        boolean boolean53 = node41.isQualifiedName();
        boolean boolean54 = node41.isAnd();
        boolean boolean55 = node41.isWith();
        boolean boolean56 = node41.isNumber();
        boolean boolean57 = node41.isName();
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean62 = node61.isTry();
        boolean boolean63 = node61.isInc();
        boolean boolean64 = node61.isWhile();
        boolean boolean65 = node61.isLabelName();
        boolean boolean66 = node41.isEquivalentToTyped(node61);
        com.google.javascript.rhino.Node node67 = node26.srcref(node61);
        boolean boolean68 = node61.isGetElem();
        com.google.javascript.rhino.Node node69 = node3.srcrefTree(node61);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(node69);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags0 = new com.google.javascript.rhino.Node.SideEffectFlags();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = sideEffectFlags0.setThrows();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags2 = sideEffectFlags1.setReturnsTainted();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags3 = sideEffectFlags1.setMutatesThis();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags4 = sideEffectFlags1.setThrows();
        sideEffectFlags4.clearSideEffectFlags();
        int int6 = sideEffectFlags4.valueOf();
        org.junit.Assert.assertNotNull(sideEffectFlags1);
        org.junit.Assert.assertNotNull(sideEffectFlags2);
        org.junit.Assert.assertNotNull(sideEffectFlags3);
        org.junit.Assert.assertNotNull(sideEffectFlags4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) 0, "");
        com.google.javascript.rhino.Node node3 = node2.cloneTree();
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node8.putIntProp(0, (int) ' ');
        boolean boolean12 = node8.isSetterDef();
        int int13 = node8.getLength();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node17.putIntProp(0, (int) ' ');
        boolean boolean21 = node17.isSetterDef();
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean26 = node25.isTry();
        boolean boolean27 = node25.isInc();
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((-1), node8, node17, node25);
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean33 = node32.isTry();
        boolean boolean34 = node32.isInc();
        boolean boolean35 = node32.isWith();
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean40 = node39.isTry();
        boolean boolean41 = node39.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo42 = null;
        com.google.javascript.rhino.Node node43 = node39.setJSDocInfo(jSDocInfo42);
        node32.addChildrenToFront(node39);
        node32.setSourceEncodedPositionForTree((int) (short) 0);
        boolean boolean47 = node32.hasChildren();
        boolean boolean48 = node32.isNot();
        boolean boolean49 = node32.isIn();
        com.google.javascript.rhino.Node node50 = node8.srcrefTree(node32);
        boolean boolean51 = node3.isEquivalentToTyped(node8);
        java.lang.String str52 = node3.getQualifiedName();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(str52);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node4.putIntProp(0, (int) ' ');
        boolean boolean8 = node4.isSetterDef();
        int int9 = node4.getLength();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node13.putIntProp(0, (int) ' ');
        boolean boolean17 = node13.isSetterDef();
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean22 = node21.isTry();
        boolean boolean23 = node21.isInc();
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((-1), node4, node13, node21);
        boolean boolean25 = node13.isQualifiedName();
        boolean boolean26 = node13.isAnd();
        boolean boolean27 = node13.isWith();
        boolean boolean28 = node13.isNumber();
        boolean boolean29 = node13.isName();
        boolean boolean30 = node13.isGetterDef();
        boolean boolean31 = node13.isFalse();
        com.google.javascript.rhino.Node node33 = node13.getAncestor(36);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(node33);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags0 = new com.google.javascript.rhino.Node.SideEffectFlags();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags1 = sideEffectFlags0.setThrows();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags2 = sideEffectFlags1.setReturnsTainted();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags3 = sideEffectFlags1.setMutatesGlobalState();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags4 = sideEffectFlags3.setReturnsTainted();
        org.junit.Assert.assertNotNull(sideEffectFlags1);
        org.junit.Assert.assertNotNull(sideEffectFlags2);
        org.junit.Assert.assertNotNull(sideEffectFlags3);
        org.junit.Assert.assertNotNull(sideEffectFlags4);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node4.putIntProp(0, (int) ' ');
        boolean boolean8 = node4.isSetterDef();
        int int9 = node4.getLength();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node13.putIntProp(0, (int) ' ');
        boolean boolean17 = node13.isSetterDef();
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean22 = node21.isTry();
        boolean boolean23 = node21.isInc();
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((-1), node4, node13, node21);
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node29.putIntProp(0, (int) ' ');
        boolean boolean33 = node29.isSetterDef();
        int int34 = node29.getLength();
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node38.putIntProp(0, (int) ' ');
        boolean boolean42 = node38.isSetterDef();
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean47 = node46.isTry();
        boolean boolean48 = node46.isInc();
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node((-1), node29, node38, node46);
        boolean boolean50 = node38.isQualifiedName();
        boolean boolean51 = node38.isAnd();
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node55.putIntProp(0, (int) ' ');
        boolean boolean59 = node55.isVar();
        boolean boolean60 = node55.isNull();
        boolean boolean61 = node38.isEquivalentToShallow(node55);
        com.google.javascript.rhino.Node node62 = node21.copyInformationFrom(node38);
        node21.setSourceEncodedPosition(50);
        java.lang.String str65 = node21.toString();
        node21.detachChildren();
        int int67 = node21.getCharno();
        java.lang.String str68 = node21.toString();
        boolean boolean69 = node21.isScript();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "ERROR 0" + "'", str65, "ERROR 0");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 50 + "'", int67 == 50);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "ERROR 0" + "'", str68, "ERROR 0");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean4 = node3.isTry();
        boolean boolean5 = node3.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = null;
        com.google.javascript.rhino.Node node7 = node3.setJSDocInfo(jSDocInfo6);
        boolean boolean8 = node7.isNew();
        node7.setSourceEncodedPositionForTree(8);
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean15 = node14.isTry();
        boolean boolean16 = node14.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo17 = null;
        com.google.javascript.rhino.Node node18 = node14.setJSDocInfo(jSDocInfo17);
        boolean boolean19 = node18.isLabelName();
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean24 = node23.isTry();
        boolean boolean25 = node23.isInc();
        boolean boolean26 = node23.isWith();
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean31 = node30.isTry();
        boolean boolean32 = node30.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo33 = null;
        com.google.javascript.rhino.Node node34 = node30.setJSDocInfo(jSDocInfo33);
        node23.addChildrenToFront(node30);
        node23.setSourceEncodedPositionForTree((int) (short) 0);
        boolean boolean38 = node23.hasChildren();
        boolean boolean39 = node23.isNot();
        boolean boolean40 = node18.hasChild(node23);
        boolean boolean41 = node23.isFunction();
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node45.putIntProp(0, (int) ' ');
        boolean boolean49 = node45.isSetterDef();
        int int50 = node45.getLength();
        boolean boolean51 = node45.isLabel();
        com.google.javascript.rhino.Node node56 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node56.putIntProp(0, (int) ' ');
        boolean boolean60 = node56.isSetterDef();
        int int61 = node56.getLength();
        com.google.javascript.rhino.Node node65 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node65.putIntProp(0, (int) ' ');
        boolean boolean69 = node65.isSetterDef();
        com.google.javascript.rhino.Node node73 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean74 = node73.isTry();
        boolean boolean75 = node73.isInc();
        com.google.javascript.rhino.Node node76 = new com.google.javascript.rhino.Node((-1), node56, node65, node73);
        boolean boolean77 = node65.isQualifiedName();
        boolean boolean78 = node65.isAnd();
        boolean boolean79 = node65.isWith();
        java.lang.String str80 = node45.checkTreeEquals(node65);
        boolean boolean81 = node45.isStringKey();
        boolean boolean82 = node45.isOr();
        boolean boolean83 = node23.isEquivalentToShallow(node45);
        node7.addChildToBack(node45);
        boolean boolean85 = node45.isAdd();
        boolean boolean86 = node45.isThrow();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNull(str80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node3.putIntProp(0, (int) ' ');
        boolean boolean7 = node3.isSetterDef();
        int int8 = node3.getLength();
        boolean boolean9 = node3.isLabel();
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node14.putIntProp(0, (int) ' ');
        boolean boolean18 = node14.isSetterDef();
        int int19 = node14.getLength();
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node23.putIntProp(0, (int) ' ');
        boolean boolean27 = node23.isSetterDef();
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean32 = node31.isTry();
        boolean boolean33 = node31.isInc();
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node((-1), node14, node23, node31);
        boolean boolean35 = node23.isQualifiedName();
        boolean boolean36 = node23.isAnd();
        boolean boolean37 = node23.isWith();
        java.lang.String str38 = node3.checkTreeEquals(node23);
        boolean boolean39 = node3.isStringKey();
        boolean boolean40 = node3.isOr();
        boolean boolean41 = node3.isOr();
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean46 = node45.isTry();
        boolean boolean47 = node45.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo48 = null;
        com.google.javascript.rhino.Node node49 = node45.setJSDocInfo(jSDocInfo48);
        boolean boolean50 = node49.isStringKey();
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node55.putIntProp(0, (int) ' ');
        boolean boolean59 = node55.isSetterDef();
        int int60 = node55.getLength();
        com.google.javascript.rhino.Node node64 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node64.putIntProp(0, (int) ' ');
        boolean boolean68 = node64.isSetterDef();
        com.google.javascript.rhino.Node node72 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean73 = node72.isTry();
        boolean boolean74 = node72.isInc();
        com.google.javascript.rhino.Node node75 = new com.google.javascript.rhino.Node((-1), node55, node64, node72);
        boolean boolean76 = node64.isQualifiedName();
        boolean boolean77 = node64.isAnd();
        boolean boolean78 = node64.isWith();
        boolean boolean79 = node64.isNumber();
        boolean boolean80 = node49.hasChild(node64);
        java.lang.String str81 = node64.getSourceFileName();
        boolean boolean82 = node64.isThis();
        boolean boolean83 = node64.isDebugger();
        com.google.javascript.rhino.Node node84 = node3.srcref(node64);
        boolean boolean85 = node84.isOptionalArg();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNull(str81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node4.putIntProp(0, (int) ' ');
        boolean boolean8 = node4.isSetterDef();
        int int9 = node4.getLength();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node13.putIntProp(0, (int) ' ');
        boolean boolean17 = node13.isSetterDef();
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean22 = node21.isTry();
        boolean boolean23 = node21.isInc();
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((-1), node4, node13, node21);
        boolean boolean25 = node13.isQualifiedName();
        boolean boolean26 = node13.isAnd();
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node30.putIntProp(0, (int) ' ');
        boolean boolean34 = node30.isVar();
        boolean boolean35 = node30.isNull();
        boolean boolean36 = node13.isEquivalentToShallow(node30);
        boolean boolean37 = node30.isAnd();
        boolean boolean38 = node30.isTry();
        com.google.javascript.rhino.JSDocInfo jSDocInfo39 = null;
        com.google.javascript.rhino.Node node40 = node30.setJSDocInfo(jSDocInfo39);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = node40.getExistingIntProp((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: missing prop: 52");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node40);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean4 = node3.isTry();
        boolean boolean5 = node3.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = null;
        com.google.javascript.rhino.Node node7 = node3.setJSDocInfo(jSDocInfo6);
        boolean boolean8 = node7.isStringKey();
        boolean boolean9 = node7.isOr();
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = null;
        com.google.javascript.rhino.Node node11 = node7.setJSDocInfo(jSDocInfo10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = node11.getString();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: ERROR 100 is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean4 = node3.isTry();
        boolean boolean5 = node3.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = null;
        com.google.javascript.rhino.Node node7 = node3.setJSDocInfo(jSDocInfo6);
        boolean boolean8 = node3.isOr();
        com.google.javascript.rhino.Node node9 = node3.cloneNode();
        boolean boolean10 = node3.isRegExp();
        boolean boolean11 = node3.isSwitch();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("goog.scope");
        node1.setIsSyntheticBlock(true);
        boolean boolean4 = node1.isFor();
        boolean boolean5 = node1.isQuotedString();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean4 = node3.isTry();
        boolean boolean5 = node3.isInc();
        boolean boolean6 = node3.hasChildren();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean11 = node10.isTry();
        boolean boolean12 = node10.isInc();
        boolean boolean13 = node10.isWith();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean18 = node17.isTry();
        boolean boolean19 = node17.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo20 = null;
        com.google.javascript.rhino.Node node21 = node17.setJSDocInfo(jSDocInfo20);
        node10.addChildrenToFront(node17);
        node10.setSourceEncodedPositionForTree((int) (short) 0);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean29 = node28.isTry();
        boolean boolean30 = node28.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo31 = null;
        com.google.javascript.rhino.Node node32 = node28.setJSDocInfo(jSDocInfo31);
        node10.addChildrenToBack(node28);
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean38 = node37.isTry();
        boolean boolean39 = node37.isInc();
        boolean boolean40 = node37.isWith();
        com.google.javascript.rhino.Node node44 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean45 = node44.isTry();
        boolean boolean46 = node44.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo47 = null;
        com.google.javascript.rhino.Node node48 = node44.setJSDocInfo(jSDocInfo47);
        node37.addChildrenToFront(node44);
        node37.setSourceEncodedPositionForTree((int) (short) 0);
        node10.addChildrenToFront(node37);
        boolean boolean53 = node37.isIn();
        com.google.javascript.rhino.Node node54 = node3.useSourceInfoIfMissingFrom(node37);
        int int55 = node3.getChangeTime();
        int int56 = node3.getChildCount();
        boolean boolean57 = node3.isScript();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (short) 1, "");
        boolean boolean3 = node2.hasChildren();
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node8.putIntProp(0, (int) ' ');
        boolean boolean12 = node8.isSetterDef();
        int int13 = node8.getLength();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node17.putIntProp(0, (int) ' ');
        boolean boolean21 = node17.isSetterDef();
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean26 = node25.isTry();
        boolean boolean27 = node25.isInc();
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((-1), node8, node17, node25);
        boolean boolean29 = node17.isQualifiedName();
        boolean boolean30 = node17.isAnd();
        boolean boolean31 = node17.isWith();
        boolean boolean32 = node17.isNumber();
        boolean boolean33 = node17.isName();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean38 = node37.isTry();
        boolean boolean39 = node37.isInc();
        boolean boolean40 = node37.isWhile();
        boolean boolean41 = node37.isLabelName();
        boolean boolean42 = node17.isEquivalentToTyped(node37);
        com.google.javascript.rhino.Node node43 = node2.srcref(node37);
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node48.putIntProp(0, (int) ' ');
        boolean boolean52 = node48.isSetterDef();
        int int53 = node48.getLength();
        com.google.javascript.rhino.Node node57 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node57.putIntProp(0, (int) ' ');
        boolean boolean61 = node57.isSetterDef();
        com.google.javascript.rhino.Node node65 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean66 = node65.isTry();
        boolean boolean67 = node65.isInc();
        com.google.javascript.rhino.Node node68 = new com.google.javascript.rhino.Node((-1), node48, node57, node65);
        boolean boolean69 = node68.isBlock();
        boolean boolean70 = node68.isFor();
        boolean boolean71 = node68.mayMutateArguments();
        node43.addChildrenToFront(node68);
        com.google.javascript.rhino.Node node76 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean77 = node76.isTry();
        boolean boolean78 = node76.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo79 = null;
        com.google.javascript.rhino.Node node80 = node76.setJSDocInfo(jSDocInfo79);
        boolean boolean81 = node76.isOr();
        com.google.javascript.rhino.Node node82 = node76.cloneNode();
        node43.addChildrenToBack(node82);
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder84 = node82.getJsDocBuilderForNode();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder84);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node4.putIntProp(0, (int) ' ');
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile8 = node4.getStaticSourceFile();
        boolean boolean9 = node4.isNull();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean14 = node13.isTry();
        boolean boolean15 = node13.isInc();
        boolean boolean16 = node13.isWith();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean21 = node20.isTry();
        boolean boolean22 = node20.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo23 = null;
        com.google.javascript.rhino.Node node24 = node20.setJSDocInfo(jSDocInfo23);
        node13.addChildrenToFront(node20);
        node13.setSourceEncodedPositionForTree((int) (short) 0);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((int) (byte) 10, node4, node13);
        int int29 = node13.getSideEffectFlags();
        com.google.javascript.rhino.JSDocInfo jSDocInfo30 = null;
        com.google.javascript.rhino.Node node31 = node13.setJSDocInfo(jSDocInfo30);
        node13.setSourceFileForTesting("Node tree inequality:\nTree1:\nGETELEM hi! 1\n\n\nTree2:\nERROR 100\n\n\nSubtree1: GETELEM hi! 1\n\n\nSubtree2: ERROR 100\n");
        org.junit.Assert.assertNull(staticSourceFile8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(node31);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber(0.0d);
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node6.putIntProp(0, (int) ' ');
        boolean boolean10 = node6.isSetterDef();
        int int11 = node6.getLength();
        com.google.javascript.rhino.Node node15 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node15.putIntProp(0, (int) ' ');
        boolean boolean19 = node15.isSetterDef();
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean24 = node23.isTry();
        boolean boolean25 = node23.isInc();
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node((-1), node6, node15, node23);
        boolean boolean27 = node15.isQualifiedName();
        boolean boolean28 = node15.isAnd();
        boolean boolean29 = node15.isWith();
        boolean boolean30 = node15.isNumber();
        boolean boolean31 = node15.isName();
        boolean boolean32 = node15.isContinue();
        java.util.Set<java.lang.String> strSet33 = node15.getDirectives();
        com.google.javascript.rhino.Node node34 = node1.copyInformationFromForTree(node15);
        boolean boolean35 = node1.isObjectLit();
        boolean boolean36 = node1.isTypeOf();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(strSet33);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        boolean boolean2 = node1.isCast();
        node1.setVarArgs(false);
        boolean boolean5 = node1.isDebugger();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString((int) '#', "hi!", (int) (short) 1, 0);
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean9 = node8.isTry();
        boolean boolean10 = node8.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo11 = null;
        com.google.javascript.rhino.Node node12 = node8.setJSDocInfo(jSDocInfo11);
        boolean boolean13 = node12.isLabelName();
        com.google.javascript.rhino.Node node14 = node4.srcrefTree(node12);
        node4.putBooleanProp(49, false);
        boolean boolean18 = node4.isHook();
        // The following exception was thrown during execution in test generation
        try {
            node4.setDouble((double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: GETELEM hi! 100 is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node4.putIntProp(0, (int) ' ');
        boolean boolean8 = node4.isSetterDef();
        int int9 = node4.getLength();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node13.putIntProp(0, (int) ' ');
        boolean boolean17 = node13.isSetterDef();
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean22 = node21.isTry();
        boolean boolean23 = node21.isInc();
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((-1), node4, node13, node21);
        boolean boolean25 = node13.isQualifiedName();
        boolean boolean26 = node13.isAnd();
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node30.putIntProp(0, (int) ' ');
        boolean boolean34 = node30.isVar();
        boolean boolean35 = node30.isNull();
        boolean boolean36 = node13.isEquivalentToShallow(node30);
        boolean boolean37 = node13.isReturn();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean5 = node4.isTry();
        boolean boolean6 = node4.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo7 = null;
        com.google.javascript.rhino.Node node8 = node4.setJSDocInfo(jSDocInfo7);
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node(2, node4);
        boolean boolean10 = node9.isVoid();
        boolean boolean11 = node9.isCast();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (short) 1, "");
        int int3 = node2.getType();
        node2.setString("goog.scope");
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node10.putIntProp(0, (int) ' ');
        boolean boolean14 = node10.isSetterDef();
        int int15 = node10.getLength();
        com.google.javascript.rhino.Node node19 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node19.putIntProp(0, (int) ' ');
        boolean boolean23 = node19.isSetterDef();
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean28 = node27.isTry();
        boolean boolean29 = node27.isInc();
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node((-1), node10, node19, node27);
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node35.putIntProp(0, (int) ' ');
        boolean boolean39 = node35.isSetterDef();
        int int40 = node35.getLength();
        com.google.javascript.rhino.Node node44 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node44.putIntProp(0, (int) ' ');
        boolean boolean48 = node44.isSetterDef();
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean53 = node52.isTry();
        boolean boolean54 = node52.isInc();
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node((-1), node35, node44, node52);
        boolean boolean56 = node44.isQualifiedName();
        boolean boolean57 = node44.isAnd();
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node61.putIntProp(0, (int) ' ');
        boolean boolean65 = node61.isVar();
        boolean boolean66 = node61.isNull();
        boolean boolean67 = node44.isEquivalentToShallow(node61);
        com.google.javascript.rhino.Node node68 = node27.copyInformationFrom(node44);
        boolean boolean69 = node27.isArrayLit();
        node27.setSourceEncodedPositionForTree(57);
        com.google.javascript.rhino.Node node75 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean76 = node75.isTry();
        boolean boolean77 = node75.isInc();
        boolean boolean78 = node75.isWith();
        com.google.javascript.rhino.Node node82 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean83 = node82.isTry();
        boolean boolean84 = node82.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo85 = null;
        com.google.javascript.rhino.Node node86 = node82.setJSDocInfo(jSDocInfo85);
        node75.addChildrenToFront(node82);
        node75.setSourceEncodedPositionForTree((int) (short) 0);
        int int90 = node75.getSideEffectFlags();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable91 = node75.siblings();
        node75.setIsSyntheticBlock(true);
        java.lang.String str94 = node27.checkTreeEquals(node75);
        com.google.javascript.rhino.Node node95 = node2.copyInformationFrom(node75);
        com.google.javascript.rhino.Node node97 = node95.getAncestor(15);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(node86);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
        org.junit.Assert.assertNotNull(nodeIterable91);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "Node tree inequality:\nTree1:\nERROR 0\n\n\nTree2:\nERROR 0 [synthetic: 1]\n    ERROR 0\n\n\nSubtree1: ERROR 0\n\n\nSubtree2: ERROR 0 [synthetic: 1]\n    ERROR 0\n" + "'", str94, "Node tree inequality:\nTree1:\nERROR 0\n\n\nTree2:\nERROR 0 [synthetic: 1]\n    ERROR 0\n\n\nSubtree1: ERROR 0\n\n\nSubtree2: ERROR 0 [synthetic: 1]\n    ERROR 0\n");
        org.junit.Assert.assertNotNull(node95);
        org.junit.Assert.assertNull(node97);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node3.putIntProp(0, (int) ' ');
        boolean boolean7 = node3.isName();
        node3.addSuppression("ERROR 0");
        boolean boolean10 = node3.isTypeOf();
        node3.setCharno((int) (byte) 0);
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node17.putIntProp(0, (int) ' ');
        boolean boolean21 = node17.isSetterDef();
        int int22 = node17.getLength();
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node26.putIntProp(0, (int) ' ');
        boolean boolean30 = node26.isSetterDef();
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean35 = node34.isTry();
        boolean boolean36 = node34.isInc();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((-1), node17, node26, node34);
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node42.putIntProp(0, (int) ' ');
        boolean boolean46 = node42.isSetterDef();
        int int47 = node42.getLength();
        com.google.javascript.rhino.Node node51 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node51.putIntProp(0, (int) ' ');
        boolean boolean55 = node51.isSetterDef();
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean60 = node59.isTry();
        boolean boolean61 = node59.isInc();
        com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node((-1), node42, node51, node59);
        boolean boolean63 = node51.isQualifiedName();
        boolean boolean64 = node51.isAnd();
        com.google.javascript.rhino.Node node68 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node68.putIntProp(0, (int) ' ');
        boolean boolean72 = node68.isVar();
        boolean boolean73 = node68.isNull();
        boolean boolean74 = node51.isEquivalentToShallow(node68);
        com.google.javascript.rhino.Node node75 = node34.copyInformationFrom(node51);
        int int76 = node75.getChangeTime();
        com.google.javascript.rhino.Node node77 = node3.useSourceInfoFromForTree(node75);
        boolean boolean78 = node75.isUnscopedQualifiedName();
        boolean boolean79 = node75.isGetElem();
        java.lang.String str80 = node75.toString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "ERROR 100" + "'", str80, "ERROR 100");
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node3.putIntProp(0, (int) ' ');
        boolean boolean7 = node3.isSetterDef();
        com.google.javascript.rhino.jstype.JSType jSType8 = node3.getJSType();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node13.putIntProp(0, (int) ' ');
        boolean boolean17 = node13.isSetterDef();
        int int18 = node13.getLength();
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node22.putIntProp(0, (int) ' ');
        boolean boolean26 = node22.isSetterDef();
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean31 = node30.isTry();
        boolean boolean32 = node30.isInc();
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node((-1), node13, node22, node30);
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean38 = node37.isTry();
        boolean boolean39 = node37.isInc();
        boolean boolean40 = node37.isWith();
        com.google.javascript.rhino.Node node44 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean45 = node44.isTry();
        boolean boolean46 = node44.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo47 = null;
        com.google.javascript.rhino.Node node48 = node44.setJSDocInfo(jSDocInfo47);
        node37.addChildrenToFront(node44);
        node37.setSourceEncodedPositionForTree((int) (short) 0);
        boolean boolean52 = node37.hasChildren();
        boolean boolean53 = node37.isNot();
        boolean boolean54 = node37.isIn();
        com.google.javascript.rhino.Node node55 = node13.srcrefTree(node37);
        com.google.javascript.rhino.Node node56 = node3.useSourceInfoIfMissingFrom(node13);
        boolean boolean57 = node56.isGetElem();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder58 = node56.getJsDocBuilderForNode();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(fileLevelJsDocBuilder58);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean4 = node3.isTry();
        boolean boolean5 = node3.isInc();
        boolean boolean6 = node3.isWith();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean11 = node10.isTry();
        boolean boolean12 = node10.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo13 = null;
        com.google.javascript.rhino.Node node14 = node10.setJSDocInfo(jSDocInfo13);
        node3.addChildrenToFront(node10);
        node3.setSourceEncodedPositionForTree((int) (short) 0);
        boolean boolean18 = node3.hasChildren();
        java.lang.String str19 = node3.getSourceFileName();
        boolean boolean20 = node3.isExprResult();
        boolean boolean21 = node3.isArrayLit();
        int int22 = node3.getSourceOffset();
        com.google.javascript.rhino.Node node26 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node26.putIntProp(0, (int) ' ');
        boolean boolean30 = node26.isSetterDef();
        int int31 = node26.getLength();
        boolean boolean32 = node26.isLabel();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node37.putIntProp(0, (int) ' ');
        boolean boolean41 = node37.isSetterDef();
        int int42 = node37.getLength();
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node46.putIntProp(0, (int) ' ');
        boolean boolean50 = node46.isSetterDef();
        com.google.javascript.rhino.Node node54 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean55 = node54.isTry();
        boolean boolean56 = node54.isInc();
        com.google.javascript.rhino.Node node57 = new com.google.javascript.rhino.Node((-1), node37, node46, node54);
        boolean boolean58 = node46.isQualifiedName();
        boolean boolean59 = node46.isAnd();
        boolean boolean60 = node46.isWith();
        java.lang.String str61 = node26.checkTreeEquals(node46);
        boolean boolean62 = node26.isStringKey();
        boolean boolean63 = node26.isOr();
        boolean boolean64 = node26.isOr();
        java.util.Set<java.lang.String> strSet65 = node26.getDirectives();
        com.google.javascript.rhino.Node node68 = com.google.javascript.rhino.Node.newString((int) (short) 1, "");
        boolean boolean69 = node68.hasChildren();
        boolean boolean70 = node68.wasEmptyNode();
        boolean boolean71 = node68.isLocalResultCall();
        com.google.javascript.rhino.Node node72 = node26.useSourceInfoIfMissingFrom(node68);
        boolean boolean73 = node72.isAdd();
        node3.addChildrenToBack(node72);
        boolean boolean75 = node72.isInc();
        boolean boolean76 = node72.isBreak();
        boolean boolean77 = node72.isNull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(strSet65);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString((int) '#', "hi!", (int) (short) 1, 0);
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean9 = node8.isTry();
        boolean boolean10 = node8.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo11 = null;
        com.google.javascript.rhino.Node node12 = node8.setJSDocInfo(jSDocInfo11);
        boolean boolean13 = node12.isLabelName();
        com.google.javascript.rhino.Node node14 = node4.srcrefTree(node12);
        boolean boolean15 = node12.isVarArgs();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(8, (int) (byte) 1, (int) '#');
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("ERROR 0\n    ERROR 0\n", 48, 31);
        boolean boolean4 = node3.isTypeOf();
        boolean boolean5 = node3.isDelProp();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (short) 1, "");
        int int3 = node2.getType();
        boolean boolean4 = node2.wasEmptyNode();
        boolean boolean5 = node2.isNumber();
        com.google.javascript.rhino.Node node7 = com.google.javascript.rhino.Node.newNumber(0.0d);
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node12.putIntProp(0, (int) ' ');
        boolean boolean16 = node12.isSetterDef();
        int int17 = node12.getLength();
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node21.putIntProp(0, (int) ' ');
        boolean boolean25 = node21.isSetterDef();
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean30 = node29.isTry();
        boolean boolean31 = node29.isInc();
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((-1), node12, node21, node29);
        boolean boolean33 = node21.isQualifiedName();
        boolean boolean34 = node21.isAnd();
        boolean boolean35 = node21.isWith();
        boolean boolean36 = node21.isNumber();
        boolean boolean37 = node21.isName();
        boolean boolean38 = node21.isContinue();
        java.util.Set<java.lang.String> strSet39 = node21.getDirectives();
        com.google.javascript.rhino.Node node40 = node7.copyInformationFromForTree(node21);
        com.google.javascript.rhino.Node node41 = node2.useSourceInfoIfMissingFromForTree(node40);
        boolean boolean42 = node40.isNE();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str43 = node40.getString();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: NUMBER 0.0 100 is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(strSet39);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 53, 57);
        boolean boolean4 = node3.isCast();
        com.google.javascript.rhino.Node node5 = node3.cloneTree();
        boolean boolean6 = node5.isExprResult();
        boolean boolean7 = node5.isGetElem();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (byte) -1, "Node tree inequality:\nTree1:\nERROR 100\n\n\nTree2:\nERROR 100\n    ERROR 100\n\n\nSubtree1: ERROR 100\n\n\nSubtree2: ERROR 100\n    ERROR 100\n");
        com.google.javascript.rhino.Node node6 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean7 = node6.isTry();
        boolean boolean8 = node6.isInc();
        boolean boolean9 = node6.isWith();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean14 = node13.isTry();
        boolean boolean15 = node13.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo16 = null;
        com.google.javascript.rhino.Node node17 = node13.setJSDocInfo(jSDocInfo16);
        node6.addChildrenToFront(node13);
        node6.setSourceEncodedPositionForTree((int) (short) 0);
        boolean boolean21 = node6.hasChildren();
        boolean boolean22 = node6.isNot();
        boolean boolean23 = node6.isIn();
        boolean boolean24 = node6.isFalse();
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node28.putIntProp(0, (int) ' ');
        boolean boolean32 = node28.isName();
        node28.addSuppression("ERROR 0");
        com.google.javascript.rhino.Node node35 = node6.useSourceInfoFromForTree(node28);
        com.google.javascript.rhino.Node node36 = node6.getLastChild();
        boolean boolean37 = node36.isQuotedString();
        node36.addSuppression("");
        com.google.javascript.rhino.Node node44 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node44.putIntProp(0, (int) ' ');
        boolean boolean48 = node44.isSetterDef();
        int int49 = node44.getLength();
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node53.putIntProp(0, (int) ' ');
        boolean boolean57 = node53.isSetterDef();
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean62 = node61.isTry();
        boolean boolean63 = node61.isInc();
        com.google.javascript.rhino.Node node64 = new com.google.javascript.rhino.Node((-1), node44, node53, node61);
        int int66 = node53.getIntProp(50);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile67 = node53.getStaticSourceFile();
        boolean boolean68 = node53.isAssignAdd();
        boolean boolean69 = node53.isCast();
        node53.setType((int) (byte) -1);
        java.lang.String str72 = node36.checkTreeEquals(node53);
        com.google.javascript.rhino.Node node73 = node2.clonePropsFrom(node53);
        boolean boolean74 = node53.isGetProp();
        com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder75 = node53.new FileLevelJsDocBuilder();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNull(staticSourceFile67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean4 = node3.isTry();
        boolean boolean5 = node3.isInc();
        boolean boolean6 = node3.isWith();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean11 = node10.isTry();
        boolean boolean12 = node10.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo13 = null;
        com.google.javascript.rhino.Node node14 = node10.setJSDocInfo(jSDocInfo13);
        node3.addChildrenToFront(node10);
        node3.setSourceEncodedPositionForTree((int) (short) 0);
        boolean boolean18 = node3.hasChildren();
        java.lang.String str19 = node3.getSourceFileName();
        boolean boolean20 = node3.isExprResult();
        boolean boolean21 = node3.isGetterDef();
        node3.putBooleanProp(12, true);
        boolean boolean25 = node3.isNot();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean4 = node3.isTry();
        boolean boolean5 = node3.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = null;
        com.google.javascript.rhino.Node node7 = node3.setJSDocInfo(jSDocInfo6);
        boolean boolean8 = node7.isDefaultCase();
        com.google.javascript.rhino.jstype.JSType jSType9 = node7.getJSType();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSType9);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("ERROR");
        int int2 = node1.getSourcePosition();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(1, (int) (byte) 10, 42);
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node7.putIntProp(0, (int) ' ');
        boolean boolean11 = node7.isSetterDef();
        int int12 = node7.getLength();
        boolean boolean13 = node7.isLabel();
        com.google.javascript.rhino.Node node18 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node18.putIntProp(0, (int) ' ');
        boolean boolean22 = node18.isSetterDef();
        int int23 = node18.getLength();
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node27.putIntProp(0, (int) ' ');
        boolean boolean31 = node27.isSetterDef();
        com.google.javascript.rhino.Node node35 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean36 = node35.isTry();
        boolean boolean37 = node35.isInc();
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node((-1), node18, node27, node35);
        boolean boolean39 = node27.isQualifiedName();
        boolean boolean40 = node27.isAnd();
        boolean boolean41 = node27.isWith();
        java.lang.String str42 = node7.checkTreeEquals(node27);
        boolean boolean43 = node7.isStringKey();
        com.google.javascript.rhino.Node node44 = node3.copyInformationFrom(node7);
        com.google.javascript.rhino.Node node47 = com.google.javascript.rhino.Node.newString((int) (short) 1, "");
        boolean boolean48 = node47.hasChildren();
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node53.putIntProp(0, (int) ' ');
        boolean boolean57 = node53.isSetterDef();
        int int58 = node53.getLength();
        com.google.javascript.rhino.Node node62 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node62.putIntProp(0, (int) ' ');
        boolean boolean66 = node62.isSetterDef();
        com.google.javascript.rhino.Node node70 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean71 = node70.isTry();
        boolean boolean72 = node70.isInc();
        com.google.javascript.rhino.Node node73 = new com.google.javascript.rhino.Node((-1), node53, node62, node70);
        boolean boolean74 = node62.isQualifiedName();
        boolean boolean75 = node62.isAnd();
        boolean boolean76 = node62.isWith();
        boolean boolean77 = node62.isNumber();
        boolean boolean78 = node62.isName();
        com.google.javascript.rhino.Node node82 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean83 = node82.isTry();
        boolean boolean84 = node82.isInc();
        boolean boolean85 = node82.isWhile();
        boolean boolean86 = node82.isLabelName();
        boolean boolean87 = node62.isEquivalentToTyped(node82);
        com.google.javascript.rhino.Node node88 = node47.srcref(node82);
        com.google.javascript.rhino.Node node89 = node44.useSourceInfoIfMissingFrom(node88);
        boolean boolean90 = node88.isAnd();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node91 = node88.detachFromParent();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(node88);
        org.junit.Assert.assertNotNull(node89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        com.google.javascript.rhino.Node node4 = node3.cloneTree();
        boolean boolean5 = node4.isNumber();
        node4.detachChildren();
        boolean boolean7 = node4.isLocalResultCall();
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node11.putIntProp(0, (int) ' ');
        boolean boolean15 = node11.isSetterDef();
        int int16 = node11.getLength();
        boolean boolean17 = node11.isLabel();
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node22.putIntProp(0, (int) ' ');
        boolean boolean26 = node22.isSetterDef();
        int int27 = node22.getLength();
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node31.putIntProp(0, (int) ' ');
        boolean boolean35 = node31.isSetterDef();
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean40 = node39.isTry();
        boolean boolean41 = node39.isInc();
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node((-1), node22, node31, node39);
        boolean boolean43 = node31.isQualifiedName();
        boolean boolean44 = node31.isAnd();
        boolean boolean45 = node31.isWith();
        java.lang.String str46 = node11.checkTreeEquals(node31);
        boolean boolean47 = node11.isStringKey();
        boolean boolean48 = node11.isOr();
        boolean boolean49 = node11.isStringKey();
        boolean boolean50 = node4.isEquivalentTo(node11);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable51 = node4.children();
        boolean boolean52 = node4.mayMutateGlobalStateOrThrow();
        com.google.javascript.rhino.Node node53 = node4.cloneTree();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(nodeIterable51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(node53);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean4 = node3.isTry();
        boolean boolean5 = node3.isInc();
        boolean boolean6 = node3.hasChildren();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean11 = node10.isTry();
        boolean boolean12 = node10.isInc();
        boolean boolean13 = node10.isWith();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean18 = node17.isTry();
        boolean boolean19 = node17.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo20 = null;
        com.google.javascript.rhino.Node node21 = node17.setJSDocInfo(jSDocInfo20);
        node10.addChildrenToFront(node17);
        node10.setSourceEncodedPositionForTree((int) (short) 0);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean29 = node28.isTry();
        boolean boolean30 = node28.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo31 = null;
        com.google.javascript.rhino.Node node32 = node28.setJSDocInfo(jSDocInfo31);
        node10.addChildrenToBack(node28);
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean38 = node37.isTry();
        boolean boolean39 = node37.isInc();
        boolean boolean40 = node37.isWith();
        com.google.javascript.rhino.Node node44 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean45 = node44.isTry();
        boolean boolean46 = node44.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo47 = null;
        com.google.javascript.rhino.Node node48 = node44.setJSDocInfo(jSDocInfo47);
        node37.addChildrenToFront(node44);
        node37.setSourceEncodedPositionForTree((int) (short) 0);
        node10.addChildrenToFront(node37);
        boolean boolean53 = node37.isIn();
        com.google.javascript.rhino.Node node54 = node3.useSourceInfoIfMissingFrom(node37);
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newString(36, "");
        com.google.javascript.rhino.Node node58 = node54.useSourceInfoIfMissingFrom(node57);
        com.google.javascript.rhino.Node node63 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node63.putIntProp(0, (int) ' ');
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile67 = node63.getStaticSourceFile();
        boolean boolean68 = node63.isNull();
        com.google.javascript.rhino.Node node72 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean73 = node72.isTry();
        boolean boolean74 = node72.isInc();
        boolean boolean75 = node72.isWith();
        com.google.javascript.rhino.Node node79 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean80 = node79.isTry();
        boolean boolean81 = node79.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo82 = null;
        com.google.javascript.rhino.Node node83 = node79.setJSDocInfo(jSDocInfo82);
        node72.addChildrenToFront(node79);
        node72.setSourceEncodedPositionForTree((int) (short) 0);
        com.google.javascript.rhino.Node node87 = new com.google.javascript.rhino.Node((int) (byte) 10, node63, node72);
        node63.detachChildren();
        boolean boolean89 = node63.isNull();
        com.google.javascript.rhino.Node node90 = node58.useSourceInfoIfMissingFrom(node63);
        java.lang.String str91 = node63.getSourceFileName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNull(staticSourceFile67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(node90);
        org.junit.Assert.assertNull(str91);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean4 = node3.isTry();
        boolean boolean5 = node3.isInc();
        boolean boolean6 = node3.hasChildren();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean11 = node10.isTry();
        boolean boolean12 = node10.isInc();
        boolean boolean13 = node10.isWith();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean18 = node17.isTry();
        boolean boolean19 = node17.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo20 = null;
        com.google.javascript.rhino.Node node21 = node17.setJSDocInfo(jSDocInfo20);
        node10.addChildrenToFront(node17);
        node10.setSourceEncodedPositionForTree((int) (short) 0);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean29 = node28.isTry();
        boolean boolean30 = node28.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo31 = null;
        com.google.javascript.rhino.Node node32 = node28.setJSDocInfo(jSDocInfo31);
        node10.addChildrenToBack(node28);
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean38 = node37.isTry();
        boolean boolean39 = node37.isInc();
        boolean boolean40 = node37.isWith();
        com.google.javascript.rhino.Node node44 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean45 = node44.isTry();
        boolean boolean46 = node44.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo47 = null;
        com.google.javascript.rhino.Node node48 = node44.setJSDocInfo(jSDocInfo47);
        node37.addChildrenToFront(node44);
        node37.setSourceEncodedPositionForTree((int) (short) 0);
        node10.addChildrenToFront(node37);
        boolean boolean53 = node37.isIn();
        com.google.javascript.rhino.Node node54 = node3.useSourceInfoIfMissingFrom(node37);
        com.google.javascript.rhino.Node node57 = com.google.javascript.rhino.Node.newString(36, "");
        com.google.javascript.rhino.Node node58 = node54.useSourceInfoIfMissingFrom(node57);
        com.google.javascript.rhino.Node node63 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node63.putIntProp(0, (int) ' ');
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile67 = node63.getStaticSourceFile();
        boolean boolean68 = node63.isNull();
        com.google.javascript.rhino.Node node72 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean73 = node72.isTry();
        boolean boolean74 = node72.isInc();
        boolean boolean75 = node72.isWith();
        com.google.javascript.rhino.Node node79 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean80 = node79.isTry();
        boolean boolean81 = node79.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo82 = null;
        com.google.javascript.rhino.Node node83 = node79.setJSDocInfo(jSDocInfo82);
        node72.addChildrenToFront(node79);
        node72.setSourceEncodedPositionForTree((int) (short) 0);
        com.google.javascript.rhino.Node node87 = new com.google.javascript.rhino.Node((int) (byte) 10, node63, node72);
        node63.detachChildren();
        boolean boolean89 = node63.isNull();
        com.google.javascript.rhino.Node node90 = node58.useSourceInfoIfMissingFrom(node63);
        com.google.javascript.rhino.jstype.JSType jSType91 = node90.getJSType();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNull(staticSourceFile67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(node90);
        org.junit.Assert.assertNull(jSType91);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("Node tree inequality:\nTree1:\nGETELEM hi! 1\n\n\nTree2:\nERROR 100\n\n\nSubtree1: GETELEM hi! 1\n\n\nSubtree2: ERROR 100\n", 16, 57);
        com.google.javascript.rhino.jstype.JSType jSType4 = null;
        node3.setJSType(jSType4);
        boolean boolean6 = node3.isVarArgs();
        java.lang.String str7 = node3.getString();
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Node tree inequality:\nTree1:\nGETELEM hi! 1\n\n\nTree2:\nERROR 100\n\n\nSubtree1: GETELEM hi! 1\n\n\nSubtree2: ERROR 100\n" + "'", str7, "Node tree inequality:\nTree1:\nGETELEM hi! 1\n\n\nTree2:\nERROR 100\n\n\nSubtree1: GETELEM hi! 1\n\n\nSubtree2: ERROR 100\n");
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        com.google.javascript.rhino.Node node5 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node5.putIntProp(0, (int) ' ');
        boolean boolean9 = node5.isSetterDef();
        int int10 = node5.getLength();
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node14.putIntProp(0, (int) ' ');
        boolean boolean18 = node14.isSetterDef();
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean23 = node22.isTry();
        boolean boolean24 = node22.isInc();
        com.google.javascript.rhino.Node node25 = new com.google.javascript.rhino.Node((-1), node5, node14, node22);
        boolean boolean26 = node14.isQualifiedName();
        boolean boolean27 = node14.isAnd();
        boolean boolean28 = node14.isTypeOf();
        boolean boolean29 = node14.isAssign();
        com.google.javascript.rhino.Node node30 = node14.cloneTree();
        boolean boolean31 = node30.isRegExp();
        com.google.javascript.rhino.Node node33 = com.google.javascript.rhino.Node.newNumber((double) 1.0f);
        node33.setCharno(16);
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean40 = node39.isTry();
        boolean boolean41 = node39.isInc();
        boolean boolean42 = node39.isWith();
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean47 = node46.isTry();
        boolean boolean48 = node46.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo49 = null;
        com.google.javascript.rhino.Node node50 = node46.setJSDocInfo(jSDocInfo49);
        node39.addChildrenToFront(node46);
        node39.setSourceEncodedPositionForTree((int) (short) 0);
        int int54 = node39.getSideEffectFlags();
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable55 = node39.siblings();
        node39.setIsSyntheticBlock(true);
        com.google.javascript.rhino.Node node58 = node39.getLastChild();
        boolean boolean59 = node58.isVoid();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node(37, node30, node33, node58);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(nodeIterable55);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean4 = node3.isTry();
        boolean boolean5 = node3.isInc();
        boolean boolean6 = node3.hasChildren();
        boolean boolean7 = node3.isReturn();
        boolean boolean8 = node3.isOr();
        int int9 = node3.getSideEffectFlags();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean4 = node3.isTry();
        boolean boolean5 = node3.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = null;
        com.google.javascript.rhino.Node node7 = node3.setJSDocInfo(jSDocInfo6);
        boolean boolean8 = node7.isStringKey();
        boolean boolean9 = node7.isFromExterns();
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node14.putIntProp(0, (int) ' ');
        boolean boolean18 = node14.isSetterDef();
        int int19 = node14.getLength();
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node23.putIntProp(0, (int) ' ');
        boolean boolean27 = node23.isSetterDef();
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean32 = node31.isTry();
        boolean boolean33 = node31.isInc();
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node((-1), node14, node23, node31);
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean39 = node38.isTry();
        boolean boolean40 = node38.isInc();
        boolean boolean41 = node38.isWith();
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean46 = node45.isTry();
        boolean boolean47 = node45.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo48 = null;
        com.google.javascript.rhino.Node node49 = node45.setJSDocInfo(jSDocInfo48);
        node38.addChildrenToFront(node45);
        node38.setSourceEncodedPositionForTree((int) (short) 0);
        boolean boolean53 = node38.hasChildren();
        boolean boolean54 = node38.isNot();
        boolean boolean55 = node38.isIn();
        com.google.javascript.rhino.Node node56 = node14.srcrefTree(node38);
        boolean boolean57 = node38.hasMoreThanOneChild();
        com.google.javascript.rhino.Node node58 = node38.cloneNode();
        node38.detachChildren();
        com.google.javascript.rhino.Node node60 = node7.srcref(node38);
        boolean boolean61 = node38.isNE();
        com.google.javascript.rhino.Node node65 = new com.google.javascript.rhino.Node(29, 4, (int) (byte) -1);
        boolean boolean66 = node65.isDebugger();
        boolean boolean67 = node65.isComma();
        boolean boolean68 = node65.isOnlyModifiesArgumentsCall();
        boolean boolean69 = node65.mayMutateGlobalStateOrThrow();
        com.google.javascript.rhino.Node node70 = node38.srcrefTree(node65);
        com.google.javascript.rhino.Node node71 = node70.getNext();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNull(node71);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean4 = node3.isTry();
        boolean boolean5 = node3.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = null;
        com.google.javascript.rhino.Node node7 = node3.setJSDocInfo(jSDocInfo6);
        boolean boolean8 = node7.isNew();
        node7.setSourceEncodedPositionForTree(8);
        boolean boolean11 = node7.mayMutateArguments();
        boolean boolean12 = node7.isWhile();
        boolean boolean13 = node7.isTry();
        boolean boolean14 = node7.isParamList();
        com.google.javascript.rhino.Node node15 = node7.getParent();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean4 = node3.isTry();
        boolean boolean5 = node3.isInc();
        boolean boolean6 = node3.isWith();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean11 = node10.isTry();
        boolean boolean12 = node10.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo13 = null;
        com.google.javascript.rhino.Node node14 = node10.setJSDocInfo(jSDocInfo13);
        node3.addChildrenToFront(node10);
        node3.setSourceEncodedPositionForTree((int) (short) 0);
        node3.setLineno((-1));
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node23.putIntProp(0, (int) ' ');
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile27 = node23.getStaticSourceFile();
        com.google.javascript.rhino.Node node28 = node3.useSourceInfoIfMissingFrom(node23);
        java.lang.String str29 = node23.getSourceFileName();
        boolean boolean30 = node23.isSwitch();
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node34.putIntProp(0, (int) ' ');
        boolean boolean38 = node34.isSetterDef();
        int int39 = node34.getLength();
        boolean boolean40 = node34.isLabel();
        com.google.javascript.rhino.Node node42 = node34.getAncestor(30);
        int int43 = node23.getIndexOfChild(node34);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile44 = null;
        node23.setStaticSourceFile(staticSourceFile44);
        node23.setWasEmptyNode(true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(staticSourceFile27);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString(16, "ERROR 0");
        com.google.javascript.rhino.InputId inputId3 = null;
        node2.setInputId(inputId3);
        org.junit.Assert.assertNotNull(node2);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean4 = node3.isTry();
        boolean boolean5 = node3.isInc();
        boolean boolean6 = node3.isWith();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean11 = node10.isTry();
        boolean boolean12 = node10.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo13 = null;
        com.google.javascript.rhino.Node node14 = node10.setJSDocInfo(jSDocInfo13);
        node3.addChildrenToFront(node10);
        node3.setSourceEncodedPositionForTree((int) (short) 0);
        int int19 = node3.getIntProp(100);
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile20 = null;
        node3.setStaticSourceFile(staticSourceFile20);
        boolean boolean22 = node3.mayMutateArguments();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node4.putIntProp(0, (int) ' ');
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile8 = node4.getStaticSourceFile();
        boolean boolean9 = node4.isNull();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean14 = node13.isTry();
        boolean boolean15 = node13.isInc();
        boolean boolean16 = node13.isWith();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean21 = node20.isTry();
        boolean boolean22 = node20.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo23 = null;
        com.google.javascript.rhino.Node node24 = node20.setJSDocInfo(jSDocInfo23);
        node13.addChildrenToFront(node20);
        node13.setSourceEncodedPositionForTree((int) (short) 0);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((int) (byte) 10, node4, node13);
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node33.putIntProp(0, (int) ' ');
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile37 = node33.getStaticSourceFile();
        boolean boolean38 = node33.isNull();
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean43 = node42.isTry();
        boolean boolean44 = node42.isInc();
        boolean boolean45 = node42.isWith();
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean50 = node49.isTry();
        boolean boolean51 = node49.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo52 = null;
        com.google.javascript.rhino.Node node53 = node49.setJSDocInfo(jSDocInfo52);
        node42.addChildrenToFront(node49);
        node42.setSourceEncodedPositionForTree((int) (short) 0);
        com.google.javascript.rhino.Node node57 = new com.google.javascript.rhino.Node((int) (byte) 10, node33, node42);
        node33.detachChildren();
        com.google.javascript.rhino.Node node59 = node13.useSourceInfoFrom(node33);
        com.google.javascript.rhino.jstype.JSType jSType60 = node13.getJSType();
        com.google.javascript.rhino.Node node61 = node13.getLastSibling();
        boolean boolean62 = node13.isOnlyModifiesArgumentsCall();
        boolean boolean63 = node13.isSyntheticBlock();
        node13.setLineno(15);
        org.junit.Assert.assertNull(staticSourceFile8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNull(staticSourceFile37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNull(jSType60);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean4 = node3.isTry();
        boolean boolean5 = node3.isOnlyModifiesArgumentsCall();
        boolean boolean6 = node3.isInstanceOf();
        com.google.javascript.rhino.Node node7 = node3.removeChildren();
        boolean boolean8 = node3.isScript();
        boolean boolean9 = node3.isComma();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean14 = node13.isTry();
        boolean boolean15 = node13.isInc();
        boolean boolean16 = node13.isWhile();
        boolean boolean17 = node13.isLabelName();
        boolean boolean18 = node13.isFor();
        boolean boolean19 = node13.isLabelName();
        boolean boolean20 = node13.isWhile();
        com.google.javascript.rhino.Node node21 = node3.copyInformationFrom(node13);
        boolean boolean22 = node3.isOnlyModifiesThisCall();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags23 = new com.google.javascript.rhino.Node.SideEffectFlags();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags24 = sideEffectFlags23.setThrows();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags25 = sideEffectFlags24.setReturnsTainted();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags26 = sideEffectFlags24.setMutatesThis();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags27 = sideEffectFlags24.setMutatesGlobalState();
        int int28 = sideEffectFlags24.valueOf();
        com.google.javascript.rhino.Node.SideEffectFlags sideEffectFlags29 = sideEffectFlags24.setMutatesThis();
        boolean boolean30 = sideEffectFlags24.areAllFlagsSet();
        // The following exception was thrown during execution in test generation
        try {
            node3.setSideEffectFlags(sideEffectFlags24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: setIsNoSideEffectsCall only supports CALL and NEW nodes, got ERROR");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(sideEffectFlags24);
        org.junit.Assert.assertNotNull(sideEffectFlags25);
        org.junit.Assert.assertNotNull(sideEffectFlags26);
        org.junit.Assert.assertNotNull(sideEffectFlags27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(sideEffectFlags29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean4 = node3.isTry();
        boolean boolean5 = node3.isInc();
        boolean boolean6 = node3.isWith();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean11 = node10.isTry();
        boolean boolean12 = node10.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo13 = null;
        com.google.javascript.rhino.Node node14 = node10.setJSDocInfo(jSDocInfo13);
        node3.addChildrenToFront(node10);
        node3.setSourceEncodedPositionForTree((int) (short) 0);
        boolean boolean18 = node3.hasChildren();
        boolean boolean19 = node3.isNot();
        int int21 = node3.getIntProp(1);
        boolean boolean22 = node3.isFalse();
        int int23 = node3.getLength();
        boolean boolean24 = node3.isLabelName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node(29, 4, (int) (byte) -1);
        boolean boolean4 = node3.isDebugger();
        boolean boolean5 = node3.isDec();
        boolean boolean6 = node3.isVoid();
        boolean boolean7 = node3.isDebugger();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node3.putIntProp(0, (int) ' ');
        boolean boolean7 = node3.isSetterDef();
        com.google.javascript.rhino.jstype.JSType jSType8 = node3.getJSType();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node13.putIntProp(0, (int) ' ');
        boolean boolean17 = node13.isSetterDef();
        int int18 = node13.getLength();
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node22.putIntProp(0, (int) ' ');
        boolean boolean26 = node22.isSetterDef();
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean31 = node30.isTry();
        boolean boolean32 = node30.isInc();
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node((-1), node13, node22, node30);
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean38 = node37.isTry();
        boolean boolean39 = node37.isInc();
        boolean boolean40 = node37.isWith();
        com.google.javascript.rhino.Node node44 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean45 = node44.isTry();
        boolean boolean46 = node44.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo47 = null;
        com.google.javascript.rhino.Node node48 = node44.setJSDocInfo(jSDocInfo47);
        node37.addChildrenToFront(node44);
        node37.setSourceEncodedPositionForTree((int) (short) 0);
        boolean boolean52 = node37.hasChildren();
        boolean boolean53 = node37.isNot();
        boolean boolean54 = node37.isIn();
        com.google.javascript.rhino.Node node55 = node13.srcrefTree(node37);
        com.google.javascript.rhino.Node node56 = node3.useSourceInfoIfMissingFrom(node13);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable57 = node13.children();
        int int58 = node13.getSourceOffset();
        int int59 = node13.getSourcePosition();
        boolean boolean60 = node13.isFunction();
        boolean boolean61 = node13.isCase();
        boolean boolean62 = node13.isQualifiedName();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(nodeIterable57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean4 = node3.isTry();
        boolean boolean5 = node3.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = null;
        com.google.javascript.rhino.Node node7 = node3.setJSDocInfo(jSDocInfo6);
        boolean boolean8 = node7.isStringKey();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node13.putIntProp(0, (int) ' ');
        boolean boolean17 = node13.isSetterDef();
        int int18 = node13.getLength();
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node22.putIntProp(0, (int) ' ');
        boolean boolean26 = node22.isSetterDef();
        com.google.javascript.rhino.Node node30 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean31 = node30.isTry();
        boolean boolean32 = node30.isInc();
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node((-1), node13, node22, node30);
        boolean boolean34 = node22.isQualifiedName();
        boolean boolean35 = node22.isAnd();
        boolean boolean36 = node22.isWith();
        boolean boolean37 = node22.isNumber();
        boolean boolean38 = node7.hasChild(node22);
        boolean boolean40 = node7.getBooleanProp(2);
        boolean boolean41 = node7.isComma();
        node7.setCharno(29);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node3.putIntProp(0, (int) ' ');
        boolean boolean7 = node3.isSetterDef();
        com.google.javascript.rhino.jstype.JSType jSType8 = node3.getJSType();
        boolean boolean9 = node3.isQuotedString();
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node11 = node3.srcrefTree(node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newNumber((double) 16);
        boolean boolean2 = node1.isLabelName();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean4 = node3.isTry();
        boolean boolean5 = node3.isInc();
        boolean boolean6 = node3.isWith();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean11 = node10.isTry();
        boolean boolean12 = node10.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo13 = null;
        com.google.javascript.rhino.Node node14 = node10.setJSDocInfo(jSDocInfo13);
        node3.addChildrenToFront(node10);
        node3.setSourceEncodedPositionForTree((int) (short) 0);
        boolean boolean18 = node3.hasChildren();
        boolean boolean19 = node3.isNot();
        boolean boolean20 = node3.isIn();
        boolean boolean21 = node3.isLabel();
        com.google.javascript.rhino.Node node22 = node3.getLastChild();
        boolean boolean23 = node22.isIf();
        boolean boolean25 = node22.getBooleanProp((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((-1), "hi!");
        int int3 = node2.getSourceOffset();
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node8.putIntProp(0, (int) ' ');
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile12 = node8.getStaticSourceFile();
        boolean boolean13 = node8.isNull();
        com.google.javascript.rhino.Node node17 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean18 = node17.isTry();
        boolean boolean19 = node17.isInc();
        boolean boolean20 = node17.isWith();
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean25 = node24.isTry();
        boolean boolean26 = node24.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo27 = null;
        com.google.javascript.rhino.Node node28 = node24.setJSDocInfo(jSDocInfo27);
        node17.addChildrenToFront(node24);
        node17.setSourceEncodedPositionForTree((int) (short) 0);
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((int) (byte) 10, node8, node17);
        node8.detachChildren();
        boolean boolean34 = node8.isNull();
        boolean boolean35 = node2.hasChild(node8);
        int int36 = node8.getChildCount();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(staticSourceFile12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean4 = node3.isTry();
        boolean boolean5 = node3.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = null;
        com.google.javascript.rhino.Node node7 = node3.setJSDocInfo(jSDocInfo6);
        boolean boolean8 = node7.isNew();
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean13 = node12.isTry();
        boolean boolean14 = node12.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = null;
        com.google.javascript.rhino.Node node16 = node12.setJSDocInfo(jSDocInfo15);
        boolean boolean17 = node16.isStringKey();
        node7.addChildToBack(node16);
        boolean boolean19 = node16.isReturn();
        com.google.javascript.rhino.Node node20 = node16.cloneNode();
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        node16.setJSType(jSType21);
        boolean boolean23 = node16.isExprResult();
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node28.putIntProp(0, (int) ' ');
        boolean boolean32 = node28.isSetterDef();
        int int33 = node28.getLength();
        com.google.javascript.rhino.Node node37 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node37.putIntProp(0, (int) ' ');
        boolean boolean41 = node37.isSetterDef();
        com.google.javascript.rhino.Node node45 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean46 = node45.isTry();
        boolean boolean47 = node45.isInc();
        com.google.javascript.rhino.Node node48 = new com.google.javascript.rhino.Node((-1), node28, node37, node45);
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean53 = node52.isTry();
        boolean boolean54 = node52.isInc();
        boolean boolean55 = node52.isWith();
        com.google.javascript.rhino.Node node59 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean60 = node59.isTry();
        boolean boolean61 = node59.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo62 = null;
        com.google.javascript.rhino.Node node63 = node59.setJSDocInfo(jSDocInfo62);
        node52.addChildrenToFront(node59);
        node52.setSourceEncodedPositionForTree((int) (short) 0);
        boolean boolean67 = node52.hasChildren();
        boolean boolean68 = node52.isNot();
        boolean boolean69 = node52.isIn();
        com.google.javascript.rhino.Node node70 = node28.srcrefTree(node52);
        boolean boolean71 = node52.hasMoreThanOneChild();
        com.google.javascript.rhino.jstype.JSType jSType72 = node52.getJSType();
        boolean boolean73 = node52.isBreak();
        boolean boolean75 = node52.getBooleanProp(36);
        com.google.javascript.rhino.Node node76 = node16.useSourceInfoFromForTree(node52);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNull(jSType72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(node76);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) (short) 1, "");
        int int3 = node2.getType();
        node2.setString("goog.scope");
        com.google.javascript.rhino.Node node9 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean10 = node9.isTry();
        boolean boolean11 = node9.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo12 = null;
        com.google.javascript.rhino.Node node13 = node9.setJSDocInfo(jSDocInfo12);
        boolean boolean14 = node13.isNew();
        boolean boolean15 = node13.isHook();
        com.google.javascript.rhino.Node node18 = com.google.javascript.rhino.Node.newString((int) (short) 1, "");
        java.lang.Object obj20 = node18.getProp(151551);
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean25 = node24.isTry();
        boolean boolean26 = node24.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo27 = null;
        com.google.javascript.rhino.Node node28 = node24.setJSDocInfo(jSDocInfo27);
        boolean boolean29 = node28.isNew();
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean34 = node33.isTry();
        boolean boolean35 = node33.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo36 = null;
        com.google.javascript.rhino.Node node37 = node33.setJSDocInfo(jSDocInfo36);
        boolean boolean38 = node37.isStringKey();
        node28.addChildToBack(node37);
        boolean boolean40 = node18.isEquivalentTo(node28);
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString("");
        node42.setSourceFileForTesting("ERROR 0\n    ERROR 0\n");
        boolean boolean45 = node42.isSyntheticBlock();
        com.google.javascript.rhino.Node node46 = node18.useSourceInfoFromForTree(node42);
        // The following exception was thrown during execution in test generation
        try {
            node2.replaceChildAfter(node13, node42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: prev is not a child of this node.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node46);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node4.putIntProp(0, (int) ' ');
        boolean boolean8 = node4.isSetterDef();
        int int9 = node4.getLength();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node13.putIntProp(0, (int) ' ');
        boolean boolean17 = node13.isSetterDef();
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean22 = node21.isTry();
        boolean boolean23 = node21.isInc();
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((-1), node4, node13, node21);
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node29.putIntProp(0, (int) ' ');
        boolean boolean33 = node29.isSetterDef();
        int int34 = node29.getLength();
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node38.putIntProp(0, (int) ' ');
        boolean boolean42 = node38.isSetterDef();
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean47 = node46.isTry();
        boolean boolean48 = node46.isInc();
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node((-1), node29, node38, node46);
        boolean boolean50 = node38.isQualifiedName();
        boolean boolean51 = node38.isAnd();
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node55.putIntProp(0, (int) ' ');
        boolean boolean59 = node55.isVar();
        boolean boolean60 = node55.isNull();
        boolean boolean61 = node38.isEquivalentToShallow(node55);
        com.google.javascript.rhino.Node node62 = node21.copyInformationFrom(node38);
        node21.setSourceEncodedPosition(50);
        java.lang.String str65 = node21.toString();
        boolean boolean66 = node21.isAnd();
        boolean boolean67 = node21.isTrue();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "ERROR 0" + "'", str65, "ERROR 0");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean4 = node3.isTry();
        boolean boolean5 = node3.isInc();
        boolean boolean6 = node3.isWith();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean11 = node10.isTry();
        boolean boolean12 = node10.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo13 = null;
        com.google.javascript.rhino.Node node14 = node10.setJSDocInfo(jSDocInfo13);
        node3.addChildrenToFront(node10);
        node3.setSourceEncodedPositionForTree((int) (short) 0);
        boolean boolean18 = node3.isNull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean4 = node3.isTry();
        boolean boolean5 = node3.isInc();
        boolean boolean6 = node3.isWhile();
        int int7 = node3.getSourcePosition();
        com.google.javascript.rhino.Node node8 = node3.removeChildren();
        boolean boolean9 = node3.isNE();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 409601 + "'", int7 == 409601);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node3.putIntProp(0, (int) ' ');
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile7 = node3.getStaticSourceFile();
        boolean boolean8 = node3.isNull();
        com.google.javascript.rhino.Node node12 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node12.putIntProp(0, (int) ' ');
        boolean boolean16 = node12.isSetterDef();
        com.google.javascript.rhino.jstype.JSType jSType17 = node12.getJSType();
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node22.putIntProp(0, (int) ' ');
        boolean boolean26 = node22.isSetterDef();
        int int27 = node22.getLength();
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node31.putIntProp(0, (int) ' ');
        boolean boolean35 = node31.isSetterDef();
        com.google.javascript.rhino.Node node39 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean40 = node39.isTry();
        boolean boolean41 = node39.isInc();
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node((-1), node22, node31, node39);
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean47 = node46.isTry();
        boolean boolean48 = node46.isInc();
        boolean boolean49 = node46.isWith();
        com.google.javascript.rhino.Node node53 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean54 = node53.isTry();
        boolean boolean55 = node53.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo56 = null;
        com.google.javascript.rhino.Node node57 = node53.setJSDocInfo(jSDocInfo56);
        node46.addChildrenToFront(node53);
        node46.setSourceEncodedPositionForTree((int) (short) 0);
        boolean boolean61 = node46.hasChildren();
        boolean boolean62 = node46.isNot();
        boolean boolean63 = node46.isIn();
        com.google.javascript.rhino.Node node64 = node22.srcrefTree(node46);
        com.google.javascript.rhino.Node node65 = node12.useSourceInfoIfMissingFrom(node22);
        com.google.javascript.rhino.Node node66 = node3.srcref(node12);
        com.google.javascript.rhino.Node node67 = node66.cloneNode();
        boolean boolean68 = node67.isTry();
        org.junit.Assert.assertNull(staticSourceFile7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node4.putIntProp(0, (int) ' ');
        boolean boolean8 = node4.isSetterDef();
        int int9 = node4.getLength();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node13.putIntProp(0, (int) ' ');
        boolean boolean17 = node13.isSetterDef();
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean22 = node21.isTry();
        boolean boolean23 = node21.isInc();
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((-1), node4, node13, node21);
        com.google.javascript.rhino.Node node29 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node29.putIntProp(0, (int) ' ');
        boolean boolean33 = node29.isSetterDef();
        int int34 = node29.getLength();
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node38.putIntProp(0, (int) ' ');
        boolean boolean42 = node38.isSetterDef();
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean47 = node46.isTry();
        boolean boolean48 = node46.isInc();
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node((-1), node29, node38, node46);
        boolean boolean50 = node38.isQualifiedName();
        boolean boolean51 = node38.isAnd();
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node55.putIntProp(0, (int) ' ');
        boolean boolean59 = node55.isVar();
        boolean boolean60 = node55.isNull();
        boolean boolean61 = node38.isEquivalentToShallow(node55);
        com.google.javascript.rhino.Node node62 = node21.copyInformationFrom(node38);
        node21.setSourceEncodedPosition(50);
        node21.putIntProp((int) (short) 1, 50);
        boolean boolean68 = node21.isGetElem();
        boolean boolean69 = node21.isStringKey();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        boolean boolean2 = node1.isCast();
        node1.setVarArgs(false);
        com.google.javascript.rhino.Node node5 = node1.removeChildren();
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            node5.addChildToFront(node6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean4 = node3.isTry();
        boolean boolean5 = node3.isInc();
        boolean boolean6 = node3.isWhile();
        int int7 = node3.getSourcePosition();
        boolean boolean8 = node3.isThis();
        boolean boolean9 = node3.isStringKey();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 409601 + "'", int7 == 409601);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node3.putIntProp(0, (int) ' ');
        boolean boolean7 = node3.isSetterDef();
        int int8 = node3.getLength();
        boolean boolean9 = node3.isLabel();
        com.google.javascript.rhino.Node node14 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node14.putIntProp(0, (int) ' ');
        boolean boolean18 = node14.isSetterDef();
        int int19 = node14.getLength();
        com.google.javascript.rhino.Node node23 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node23.putIntProp(0, (int) ' ');
        boolean boolean27 = node23.isSetterDef();
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean32 = node31.isTry();
        boolean boolean33 = node31.isInc();
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node((-1), node14, node23, node31);
        boolean boolean35 = node23.isQualifiedName();
        boolean boolean36 = node23.isAnd();
        boolean boolean37 = node23.isWith();
        java.lang.String str38 = node3.checkTreeEquals(node23);
        boolean boolean39 = node23.isIf();
        com.google.javascript.rhino.Node node42 = com.google.javascript.rhino.Node.newString(0, "ERROR 0\n    ERROR 0\n");
        boolean boolean43 = node42.isOr();
        node23.addChildToBack(node42);
        node23.setSourceFileForTesting("ERROR 0");
        boolean boolean47 = node23.isBlock();
        node23.setSourceFileForTesting("Node tree inequality:\nTree1:\nERROR 0\n\n\nTree2:\nERROR 0 [synthetic: 1]\n    ERROR 0\n\n\nSubtree1: ERROR 0\n\n\nSubtree2: ERROR 0 [synthetic: 1]\n    ERROR 0\n");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean5 = node4.isTry();
        boolean boolean6 = node4.isInc();
        boolean boolean7 = node4.isWith();
        com.google.javascript.rhino.Node node11 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean12 = node11.isTry();
        boolean boolean13 = node11.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo14 = null;
        com.google.javascript.rhino.Node node15 = node11.setJSDocInfo(jSDocInfo14);
        node4.addChildrenToFront(node11);
        node4.setSourceEncodedPositionForTree((int) (short) 0);
        com.google.javascript.rhino.Node node22 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean23 = node22.isTry();
        boolean boolean24 = node22.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo25 = null;
        com.google.javascript.rhino.Node node26 = node22.setJSDocInfo(jSDocInfo25);
        node4.addChildrenToBack(node22);
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean32 = node31.isTry();
        boolean boolean33 = node31.isInc();
        boolean boolean34 = node31.isWith();
        com.google.javascript.rhino.Node node38 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean39 = node38.isTry();
        boolean boolean40 = node38.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo41 = null;
        com.google.javascript.rhino.Node node42 = node38.setJSDocInfo(jSDocInfo41);
        node31.addChildrenToFront(node38);
        node31.setSourceEncodedPositionForTree((int) (short) 0);
        node4.addChildrenToFront(node31);
        node4.setLineno((int) (short) 1);
        com.google.javascript.rhino.Node.AncestorIterable ancestorIterable49 = node4.getAncestors();
        com.google.javascript.rhino.Node node50 = node4.getParent();
        com.google.javascript.rhino.Node node51 = new com.google.javascript.rhino.Node((int) 'a', node4);
        com.google.javascript.rhino.jstype.JSType jSType52 = node4.getJSType();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(ancestorIterable49);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNull(jSType52);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        com.google.javascript.rhino.Node node2 = com.google.javascript.rhino.Node.newString((int) '4', "goog.scope");
        com.google.javascript.rhino.Node node7 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node7.putIntProp(0, (int) ' ');
        boolean boolean11 = node7.isSetterDef();
        int int12 = node7.getLength();
        com.google.javascript.rhino.Node node16 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node16.putIntProp(0, (int) ' ');
        boolean boolean20 = node16.isSetterDef();
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean25 = node24.isTry();
        boolean boolean26 = node24.isInc();
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node((-1), node7, node16, node24);
        com.google.javascript.rhino.Node node32 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node32.putIntProp(0, (int) ' ');
        boolean boolean36 = node32.isSetterDef();
        int int37 = node32.getLength();
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node41.putIntProp(0, (int) ' ');
        boolean boolean45 = node41.isSetterDef();
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean50 = node49.isTry();
        boolean boolean51 = node49.isInc();
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node((-1), node32, node41, node49);
        boolean boolean53 = node41.isQualifiedName();
        boolean boolean54 = node41.isAnd();
        com.google.javascript.rhino.Node node58 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node58.putIntProp(0, (int) ' ');
        boolean boolean62 = node58.isVar();
        boolean boolean63 = node58.isNull();
        boolean boolean64 = node41.isEquivalentToShallow(node58);
        com.google.javascript.rhino.Node node65 = node24.copyInformationFrom(node41);
        com.google.javascript.rhino.Node node66 = node65.detachFromParent();
        node2.addChildToBack(node66);
        com.google.javascript.rhino.InputId inputId68 = node2.getInputId();
        node2.setString("ERROR 100\n");
        com.google.javascript.rhino.Node node71 = node2.cloneNode();
        boolean boolean72 = node2.isLocalResultCall();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertNull(inputId68);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        com.google.javascript.rhino.Node node4 = node3.cloneTree();
        boolean boolean5 = node4.isNumber();
        node4.detachChildren();
        boolean boolean7 = node4.hasMoreThanOneChild();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newNumber((double) 151551, (int) (byte) 0, (int) ' ');
        org.junit.Assert.assertNotNull(node3);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node4.putIntProp(0, (int) ' ');
        boolean boolean8 = node4.isSetterDef();
        int int9 = node4.getLength();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node13.putIntProp(0, (int) ' ');
        boolean boolean17 = node13.isSetterDef();
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean22 = node21.isTry();
        boolean boolean23 = node21.isInc();
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((-1), node4, node13, node21);
        boolean boolean25 = node13.isQualifiedName();
        boolean boolean26 = node13.isAnd();
        boolean boolean27 = node13.isWith();
        boolean boolean28 = node13.isNumber();
        boolean boolean29 = node13.isName();
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean34 = node33.isTry();
        boolean boolean35 = node33.isInc();
        boolean boolean36 = node33.isWhile();
        boolean boolean37 = node33.isLabelName();
        boolean boolean38 = node13.isEquivalentToTyped(node33);
        com.google.javascript.rhino.Node node39 = node13.removeFirstChild();
        boolean boolean40 = node13.isIf();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node4.putIntProp(0, (int) ' ');
        boolean boolean8 = node4.isVar();
        com.google.javascript.rhino.Node node9 = node4.getNext();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean14 = node13.isTry();
        boolean boolean15 = node13.isInc();
        boolean boolean16 = node13.isWhile();
        int int17 = node13.getSourcePosition();
        node13.detachChildren();
        int int19 = node4.getIndexOfChild(node13);
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node(4095, node13);
        com.google.javascript.rhino.Node node23 = com.google.javascript.rhino.Node.newString(0, "ERROR 0\n    ERROR 0\n");
        com.google.javascript.rhino.Node node27 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean28 = node27.isTry();
        boolean boolean29 = node27.isInc();
        boolean boolean30 = node27.hasChildren();
        com.google.javascript.rhino.Node node34 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean35 = node34.isTry();
        boolean boolean36 = node34.isInc();
        boolean boolean37 = node34.isWith();
        com.google.javascript.rhino.Node node41 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean42 = node41.isTry();
        boolean boolean43 = node41.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo44 = null;
        com.google.javascript.rhino.Node node45 = node41.setJSDocInfo(jSDocInfo44);
        node34.addChildrenToFront(node41);
        node34.setSourceEncodedPositionForTree((int) (short) 0);
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean53 = node52.isTry();
        boolean boolean54 = node52.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo55 = null;
        com.google.javascript.rhino.Node node56 = node52.setJSDocInfo(jSDocInfo55);
        node34.addChildrenToBack(node52);
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean62 = node61.isTry();
        boolean boolean63 = node61.isInc();
        boolean boolean64 = node61.isWith();
        com.google.javascript.rhino.Node node68 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean69 = node68.isTry();
        boolean boolean70 = node68.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo71 = null;
        com.google.javascript.rhino.Node node72 = node68.setJSDocInfo(jSDocInfo71);
        node61.addChildrenToFront(node68);
        node61.setSourceEncodedPositionForTree((int) (short) 0);
        node34.addChildrenToFront(node61);
        boolean boolean77 = node61.isIn();
        com.google.javascript.rhino.Node node78 = node27.useSourceInfoIfMissingFrom(node61);
        int int79 = node27.getChangeTime();
        com.google.javascript.rhino.Node node80 = node23.useSourceInfoIfMissingFrom(node27);
        com.google.javascript.rhino.Node node84 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean85 = node84.isTry();
        boolean boolean86 = node84.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo87 = null;
        com.google.javascript.rhino.Node node88 = node84.setJSDocInfo(jSDocInfo87);
        boolean boolean89 = node84.isReturn();
        node84.putIntProp((int) ' ', (int) '4');
        node23.addChildrenToFront(node84);
        boolean boolean94 = node84.isBlock();
        boolean boolean95 = node13.isEquivalentToTyped(node84);
        node84.setLineno(12);
        boolean boolean98 = node84.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 409601 + "'", int17 == 409601);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(node88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        boolean boolean2 = node1.isCast();
        node1.setVarArgs(false);
        com.google.javascript.rhino.Node node5 = node1.removeChildren();
        boolean boolean6 = node1.isName();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node4.putIntProp(0, (int) ' ');
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile8 = node4.getStaticSourceFile();
        boolean boolean9 = node4.isNull();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean14 = node13.isTry();
        boolean boolean15 = node13.isInc();
        boolean boolean16 = node13.isWith();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean21 = node20.isTry();
        boolean boolean22 = node20.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo23 = null;
        com.google.javascript.rhino.Node node24 = node20.setJSDocInfo(jSDocInfo23);
        node13.addChildrenToFront(node20);
        node13.setSourceEncodedPositionForTree((int) (short) 0);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((int) (byte) 10, node4, node13);
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node33.putIntProp(0, (int) ' ');
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile37 = node33.getStaticSourceFile();
        boolean boolean38 = node33.isNull();
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean43 = node42.isTry();
        boolean boolean44 = node42.isInc();
        boolean boolean45 = node42.isWith();
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean50 = node49.isTry();
        boolean boolean51 = node49.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo52 = null;
        com.google.javascript.rhino.Node node53 = node49.setJSDocInfo(jSDocInfo52);
        node42.addChildrenToFront(node49);
        node42.setSourceEncodedPositionForTree((int) (short) 0);
        com.google.javascript.rhino.Node node57 = new com.google.javascript.rhino.Node((int) (byte) 10, node33, node42);
        node33.detachChildren();
        com.google.javascript.rhino.Node node59 = node13.useSourceInfoFrom(node33);
        boolean boolean60 = node13.isDelProp();
        boolean boolean61 = node13.isGetterDef();
        boolean boolean62 = node13.isString();
        boolean boolean63 = node13.isTrue();
        node13.putIntProp(8, 48);
        org.junit.Assert.assertNull(staticSourceFile8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNull(staticSourceFile37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean4 = node3.isTry();
        boolean boolean5 = node3.isInc();
        boolean boolean6 = node3.isWith();
        com.google.javascript.rhino.Node node10 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean11 = node10.isTry();
        boolean boolean12 = node10.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo13 = null;
        com.google.javascript.rhino.Node node14 = node10.setJSDocInfo(jSDocInfo13);
        node3.addChildrenToFront(node10);
        int int16 = node10.getLineno();
        boolean boolean17 = node10.isEmpty();
        boolean boolean18 = node10.isCase();
        boolean boolean19 = node10.isAssign();
        boolean boolean20 = node10.isOnlyModifiesArgumentsCall();
        boolean boolean21 = node10.isGetProp();
        boolean boolean22 = node10.isReturn();
        boolean boolean23 = node10.isScript();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        com.google.javascript.rhino.Node node4 = com.google.javascript.rhino.Node.newString((int) '#', "ERROR 0", 50, 57);
        com.google.javascript.rhino.Node node8 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean9 = node8.isTry();
        boolean boolean10 = node8.isOnlyModifiesArgumentsCall();
        boolean boolean11 = node8.isInstanceOf();
        com.google.javascript.rhino.Node node12 = node8.removeChildren();
        boolean boolean13 = node8.isQuotedString();
        boolean boolean14 = node8.isQualifiedName();
        com.google.javascript.rhino.Node node15 = node4.useSourceInfoFrom(node8);
        java.lang.Iterable<com.google.javascript.rhino.Node> nodeIterable16 = node4.siblings();
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(nodeIterable16);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node4.putIntProp(0, (int) ' ');
        boolean boolean8 = node4.isSetterDef();
        int int9 = node4.getLength();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node13.putIntProp(0, (int) ' ');
        boolean boolean17 = node13.isSetterDef();
        com.google.javascript.rhino.Node node21 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean22 = node21.isTry();
        boolean boolean23 = node21.isInc();
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((-1), node4, node13, node21);
        boolean boolean25 = node13.isQualifiedName();
        boolean boolean26 = node13.isAnd();
        boolean boolean27 = node13.isWith();
        boolean boolean28 = node13.isNumber();
        com.google.javascript.rhino.Node node29 = node13.getParent();
        com.google.javascript.rhino.Node node31 = node13.getAncestor(55);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node33 = node31.getChildAtIndex(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNull(node31);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        com.google.javascript.rhino.Node node4 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node4.putIntProp(0, (int) ' ');
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile8 = node4.getStaticSourceFile();
        boolean boolean9 = node4.isNull();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean14 = node13.isTry();
        boolean boolean15 = node13.isInc();
        boolean boolean16 = node13.isWith();
        com.google.javascript.rhino.Node node20 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean21 = node20.isTry();
        boolean boolean22 = node20.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo23 = null;
        com.google.javascript.rhino.Node node24 = node20.setJSDocInfo(jSDocInfo23);
        node13.addChildrenToFront(node20);
        node13.setSourceEncodedPositionForTree((int) (short) 0);
        com.google.javascript.rhino.Node node28 = new com.google.javascript.rhino.Node((int) (byte) 10, node4, node13);
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node33.putIntProp(0, (int) ' ');
        com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile37 = node33.getStaticSourceFile();
        boolean boolean38 = node33.isNull();
        com.google.javascript.rhino.Node node42 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean43 = node42.isTry();
        boolean boolean44 = node42.isInc();
        boolean boolean45 = node42.isWith();
        com.google.javascript.rhino.Node node49 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean50 = node49.isTry();
        boolean boolean51 = node49.isOnlyModifiesArgumentsCall();
        com.google.javascript.rhino.JSDocInfo jSDocInfo52 = null;
        com.google.javascript.rhino.Node node53 = node49.setJSDocInfo(jSDocInfo52);
        node42.addChildrenToFront(node49);
        node42.setSourceEncodedPositionForTree((int) (short) 0);
        com.google.javascript.rhino.Node node57 = new com.google.javascript.rhino.Node((int) (byte) 10, node33, node42);
        node33.detachChildren();
        com.google.javascript.rhino.Node node59 = node13.useSourceInfoFrom(node33);
        boolean boolean60 = node59.mayMutateGlobalStateOrThrow();
        // The following exception was thrown during execution in test generation
        try {
            node59.setQuotedString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: not a StringNode");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(staticSourceFile8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNull(staticSourceFile37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
    }
}

