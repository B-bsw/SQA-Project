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
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("");
        boolean boolean2 = node1.isCast();
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
        boolean boolean28 = node16.isQualifiedName();
        boolean boolean29 = node16.isAnd();
        boolean boolean30 = node16.isWith();
        boolean boolean31 = node16.isNumber();
        boolean boolean32 = node16.isName();
        com.google.javascript.rhino.Node node36 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean37 = node36.isTry();
        boolean boolean38 = node36.isInc();
        boolean boolean39 = node36.isWhile();
        boolean boolean40 = node36.isLabelName();
        boolean boolean41 = node16.isEquivalentToTyped(node36);
        com.google.javascript.rhino.Node node46 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node46.putIntProp(0, (int) ' ');
        boolean boolean50 = node46.isSetterDef();
        int int51 = node46.getLength();
        com.google.javascript.rhino.Node node55 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node55.putIntProp(0, (int) ' ');
        boolean boolean59 = node55.isSetterDef();
        com.google.javascript.rhino.Node node63 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean64 = node63.isTry();
        boolean boolean65 = node63.isInc();
        com.google.javascript.rhino.Node node66 = new com.google.javascript.rhino.Node((-1), node46, node55, node63);
        boolean boolean67 = node66.isBlock();
        boolean boolean68 = node66.isFor();
        boolean boolean69 = node66.mayMutateArguments();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node1.replaceChild(node16, node66);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node32 = node13.getChildAtIndex(40);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
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
        com.google.javascript.rhino.Node node31 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node31.putIntProp(0, (int) ' ');
        boolean boolean35 = node31.isSetterDef();
        int int36 = node31.getLength();
        boolean boolean37 = node31.isLabel();
        com.google.javascript.rhino.Node node39 = node31.getAncestor(30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node13.removeChild(node31);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
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
        boolean boolean39 = node33.isString();
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
        boolean boolean65 = node53.isQualifiedName();
        boolean boolean66 = node53.isAnd();
        com.google.javascript.rhino.Node node70 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node70.putIntProp(0, (int) ' ');
        boolean boolean74 = node70.isVar();
        boolean boolean75 = node70.isNull();
        boolean boolean76 = node53.isEquivalentToShallow(node70);
        int int77 = node70.getSourceOffset();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node33.removeChild(node70);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node3.putIntProp(0, (int) ' ');
        boolean boolean7 = node3.isSetterDef();
        com.google.javascript.rhino.jstype.JSType jSType8 = node3.getJSType();
        boolean boolean9 = node3.isString();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node13.putIntProp(0, (int) ' ');
        boolean boolean17 = node13.isName();
        node13.addSuppression("ERROR 0");
        boolean boolean20 = node13.isTypeOf();
        node13.setCharno((int) (byte) 0);
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
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node52.putIntProp(0, (int) ' ');
        boolean boolean56 = node52.isSetterDef();
        int int57 = node52.getLength();
        com.google.javascript.rhino.Node node61 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node61.putIntProp(0, (int) ' ');
        boolean boolean65 = node61.isSetterDef();
        com.google.javascript.rhino.Node node69 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean70 = node69.isTry();
        boolean boolean71 = node69.isInc();
        com.google.javascript.rhino.Node node72 = new com.google.javascript.rhino.Node((-1), node52, node61, node69);
        boolean boolean73 = node61.isQualifiedName();
        boolean boolean74 = node61.isAnd();
        com.google.javascript.rhino.Node node78 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node78.putIntProp(0, (int) ' ');
        boolean boolean82 = node78.isVar();
        boolean boolean83 = node78.isNull();
        boolean boolean84 = node61.isEquivalentToShallow(node78);
        com.google.javascript.rhino.Node node85 = node44.copyInformationFrom(node61);
        int int86 = node85.getChangeTime();
        com.google.javascript.rhino.Node node87 = node13.useSourceInfoFromForTree(node85);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node88 = node3.getChildBefore(node87);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
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
        com.google.javascript.rhino.Node node43 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node43.putIntProp(0, (int) ' ');
        boolean boolean47 = node43.isSetterDef();
        int int48 = node43.getLength();
        com.google.javascript.rhino.Node node52 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node52.putIntProp(0, (int) ' ');
        boolean boolean56 = node52.isSetterDef();
        com.google.javascript.rhino.Node node60 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean61 = node60.isTry();
        boolean boolean62 = node60.isInc();
        com.google.javascript.rhino.Node node63 = new com.google.javascript.rhino.Node((-1), node43, node52, node60);
        boolean boolean64 = node52.isQualifiedName();
        boolean boolean65 = node52.isAnd();
        com.google.javascript.rhino.Node node69 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node69.putIntProp(0, (int) ' ');
        boolean boolean73 = node69.isVar();
        boolean boolean74 = node69.isNull();
        boolean boolean75 = node52.isEquivalentToShallow(node69);
        int int76 = node69.getSourceOffset();
        node69.setOptionalArg(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node79 = node30.getChildBefore(node69);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("hi!", 53, 57);
        boolean boolean4 = node3.isCast();
        int int5 = node3.getSideEffectFlags();
        int int6 = node3.getSourcePosition();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node8 = node3.getChildAtIndex(54);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        com.google.javascript.rhino.Node node1 = com.google.javascript.rhino.Node.newString("goog.scope");
        node1.setIsSyntheticBlock(true);
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
        boolean boolean44 = node7.isHook();
        boolean boolean45 = node7.isThis();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node46 = node1.getChildBefore(node7);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node3.putIntProp(0, (int) ' ');
        boolean boolean7 = node3.isSetterDef();
        com.google.javascript.rhino.jstype.JSType jSType8 = node3.getJSType();
        boolean boolean9 = node3.isTypeOf();
        boolean boolean10 = node3.isBreak();
        boolean boolean11 = node3.isVar();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node13 = node3.getChildAtIndex(8);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean4 = node3.isTry();
        boolean boolean5 = node3.isInc();
        boolean boolean6 = node3.hasChildren();
        boolean boolean7 = node3.isCase();
        boolean boolean8 = node3.hasMoreThanOneChild();
        boolean boolean9 = node3.isFor();
        com.google.javascript.rhino.Node node13 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node13.putIntProp(0, (int) ' ');
        boolean boolean17 = node13.isSetterDef();
        com.google.javascript.rhino.jstype.JSType jSType18 = node13.getJSType();
        boolean boolean19 = node13.isTypeOf();
        com.google.javascript.rhino.Node node24 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        node24.putIntProp(0, (int) ' ');
        boolean boolean28 = node24.isVar();
        com.google.javascript.rhino.Node node29 = node24.getNext();
        com.google.javascript.rhino.Node node33 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean34 = node33.isTry();
        boolean boolean35 = node33.isInc();
        boolean boolean36 = node33.isWhile();
        int int37 = node33.getSourcePosition();
        node33.detachChildren();
        int int39 = node24.getIndexOfChild(node33);
        com.google.javascript.rhino.Node node40 = new com.google.javascript.rhino.Node(4095, node33);
        boolean boolean41 = node40.wasEmptyNode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        node3.replaceChild(node13, node40);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        com.google.javascript.rhino.Node node3 = new com.google.javascript.rhino.Node((-1), 100, (int) (byte) 1);
        boolean boolean4 = node3.isTry();
        boolean boolean5 = node3.isInc();
        boolean boolean6 = node3.hasChildren();
        boolean boolean7 = node3.isCase();
        boolean boolean8 = node3.hasMoreThanOneChild();
        boolean boolean9 = node3.isFor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node11 = node3.getChildAtIndex(53);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        com.google.javascript.rhino.Node node3 = com.google.javascript.rhino.Node.newString("ERROR 0", 54, (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node5 = node3.getChildAtIndex(56);
    }
}

