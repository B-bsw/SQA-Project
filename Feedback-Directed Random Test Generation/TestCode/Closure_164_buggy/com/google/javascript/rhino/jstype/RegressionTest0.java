package com.google.javascript.rhino.jstype;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
            System.out.format("%n%s%n", "RegressionTest0.test01");
        com.google.javascript.rhino.jstype.JSType jSType0 = null;
        com.google.javascript.rhino.jstype.JSType jSType1 = null;
        boolean boolean2 = com.google.javascript.rhino.jstype.JSType.isEquivalent(jSType0, jSType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.lang.String str0 = com.google.javascript.rhino.jstype.JSType.NOT_A_TYPE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Not declared as a type name" + "'", str0, "Not declared as a type name");
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        int int0 = com.google.javascript.rhino.jstype.JSType.ENUMDECL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        java.lang.String str0 = com.google.javascript.rhino.jstype.JSType.UNKNOWN_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Unknown class name" + "'", str0, "Unknown class name");
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        java.lang.String str0 = com.google.javascript.rhino.jstype.JSType.NOT_A_CLASS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Not declared as a constructor" + "'", str0, "Not declared as a constructor");
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        java.lang.String str0 = com.google.javascript.rhino.jstype.JSType.EMPTY_TYPE_COMPONENT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Named type with empty name component" + "'", str0, "Named type with empty name component");
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ArrowType arrowType3 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry0, node1, jSType2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ArrowType arrowType4 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry0, node1, jSType2, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.jstype.JSType jSType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ArrowType arrowType4 = new com.google.javascript.rhino.jstype.ArrowType(jSTypeRegistry0, node1, jSType2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        int int0 = com.google.javascript.rhino.jstype.JSType.NOT_ENUMDECL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }
}

