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
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.booleanNode(false);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue2 = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(node1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.getRValueOfLValue(node1);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.booleanNode(true);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isExprCall(node1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isTryCatchNodeContainer(node1);
    }
}

