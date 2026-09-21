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
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.getExceptionHandler(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node24);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        java.lang.Class<?> wildcardClass22 = peepholeSubstituteAlternateSyntax1.getClass();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = peepholeSubstituteAlternateSyntax1.isPure(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node26);
        com.google.javascript.rhino.Node node28 = null;
        boolean boolean29 = peepholeSubstituteAlternateSyntax1.isPure(node28);
        com.google.javascript.rhino.Node node30 = null;
        boolean boolean31 = peepholeSubstituteAlternateSyntax1.isPure(node30);
        com.google.javascript.rhino.Node node32 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node33 = peepholeSubstituteAlternateSyntax1.getExceptionHandler(node32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.getExceptionHandler(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        java.lang.Class<?> wildcardClass22 = peepholeSubstituteAlternateSyntax1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = peepholeSubstituteAlternateSyntax1.isPure(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node26, node27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node20, node21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node28);
        com.google.javascript.rhino.Node node30 = null;
        boolean boolean31 = peepholeSubstituteAlternateSyntax1.isPure(node30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.rhino.Node node33 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node32, node33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node18, node19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node22, node23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        java.lang.Class<?> wildcardClass22 = peepholeSubstituteAlternateSyntax1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = peepholeSubstituteAlternateSyntax1.isPure(node24);
        com.google.javascript.rhino.Node node26 = null;
        boolean boolean27 = peepholeSubstituteAlternateSyntax1.isPure(node26);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.getExceptionHandler(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass20 = node19.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        java.lang.Class<?> wildcardClass14 = peepholeSubstituteAlternateSyntax1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        java.lang.Class<?> wildcardClass18 = peepholeSubstituteAlternateSyntax1.getClass();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.getExceptionHandler(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = node17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        java.lang.Class<?> wildcardClass20 = peepholeSubstituteAlternateSyntax1.getClass();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = peepholeSubstituteAlternateSyntax1.isPure(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node28, node29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(node27);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node24, node25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node20, node21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node28);
        com.google.javascript.rhino.Node node30 = null;
        boolean boolean31 = peepholeSubstituteAlternateSyntax1.isPure(node30);
        com.google.javascript.rhino.Node node32 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node33 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node24);
        com.google.javascript.rhino.Node node26 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        java.lang.Class<?> wildcardClass22 = peepholeSubstituteAlternateSyntax1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        java.lang.Class<?> wildcardClass20 = peepholeSubstituteAlternateSyntax1.getClass();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        java.lang.Class<?> wildcardClass14 = peepholeSubstituteAlternateSyntax1.getClass();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node20, node21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node12, node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = node17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.getExceptionHandler(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node24);
        com.google.javascript.rhino.Node node26 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass26 = node25.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass24 = node23.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node24);
        java.lang.Class<?> wildcardClass26 = peepholeSubstituteAlternateSyntax1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.getExceptionHandler(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node28);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node29);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node24);
        com.google.javascript.rhino.Node node26 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        java.lang.Class<?> wildcardClass18 = peepholeSubstituteAlternateSyntax1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        java.lang.Class<?> wildcardClass12 = peepholeSubstituteAlternateSyntax1.getClass();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node24);
        java.lang.Class<?> wildcardClass26 = peepholeSubstituteAlternateSyntax1.getClass();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node18, node19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.getExceptionHandler(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.getExceptionHandler(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node24, node25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node16, node17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        java.lang.Class<?> wildcardClass10 = peepholeSubstituteAlternateSyntax1.getClass();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node22, node23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        com.google.javascript.rhino.Node node24 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.getExceptionHandler(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node24, node25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        java.lang.Class<?> wildcardClass22 = peepholeSubstituteAlternateSyntax1.getClass();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.getExceptionHandler(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = peepholeSubstituteAlternateSyntax1.isPure(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node28);
        com.google.javascript.rhino.Node node30 = null;
        boolean boolean31 = peepholeSubstituteAlternateSyntax1.isPure(node30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.rhino.Node node33 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node32, node33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        java.lang.Class<?> wildcardClass16 = peepholeSubstituteAlternateSyntax1.getClass();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.getExceptionHandler(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = peepholeSubstituteAlternateSyntax1.isPure(node24);
        com.google.javascript.rhino.Node node26 = null;
        boolean boolean27 = peepholeSubstituteAlternateSyntax1.isPure(node26);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.getExceptionHandler(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        java.lang.Class<?> wildcardClass18 = peepholeSubstituteAlternateSyntax1.getClass();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        com.google.javascript.rhino.Node node24 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        java.lang.Class<?> wildcardClass16 = peepholeSubstituteAlternateSyntax1.getClass();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.getExceptionHandler(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node20, node21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        com.google.javascript.rhino.Node node24 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.getExceptionHandler(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node24);
        com.google.javascript.rhino.Node node26 = null;
        boolean boolean27 = peepholeSubstituteAlternateSyntax1.isPure(node26);
        com.google.javascript.rhino.Node node28 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node29 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node24);
        com.google.javascript.rhino.Node node26 = null;
        boolean boolean27 = peepholeSubstituteAlternateSyntax1.isPure(node26);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.getExceptionHandler(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        com.google.javascript.rhino.Node node24 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.getExceptionHandler(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node28);
        com.google.javascript.rhino.Node node30 = null;
        boolean boolean31 = peepholeSubstituteAlternateSyntax1.isPure(node30);
        com.google.javascript.rhino.Node node32 = null;
        boolean boolean33 = peepholeSubstituteAlternateSyntax1.isPure(node32);
        java.lang.Class<?> wildcardClass34 = peepholeSubstituteAlternateSyntax1.getClass();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        java.lang.Class<?> wildcardClass22 = peepholeSubstituteAlternateSyntax1.getClass();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.getExceptionHandler(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = peepholeSubstituteAlternateSyntax1.isPure(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node26);
        com.google.javascript.rhino.Node node28 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(node27);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        com.google.javascript.rhino.Node node24 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node12, node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = peepholeSubstituteAlternateSyntax1.isPure(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node26);
        com.google.javascript.rhino.Node node28 = null;
        boolean boolean29 = peepholeSubstituteAlternateSyntax1.isPure(node28);
        com.google.javascript.rhino.Node node30 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = peepholeSubstituteAlternateSyntax1.isPure(node24);
        com.google.javascript.rhino.Node node26 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.getExceptionHandler(node26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.getExceptionHandler(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node14, node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = node13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        java.lang.Class<?> wildcardClass22 = peepholeSubstituteAlternateSyntax1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = peepholeSubstituteAlternateSyntax1.isPure(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node28, node29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(node27);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.getExceptionHandler(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node24);
        com.google.javascript.rhino.Node node26 = null;
        boolean boolean27 = peepholeSubstituteAlternateSyntax1.isPure(node26);
        com.google.javascript.rhino.Node node28 = null;
        boolean boolean29 = peepholeSubstituteAlternateSyntax1.isPure(node28);
        com.google.javascript.rhino.Node node30 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = peepholeSubstituteAlternateSyntax1.isPure(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node26, node27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = peepholeSubstituteAlternateSyntax1.isPure(node24);
        com.google.javascript.rhino.Node node26 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node18, node19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = peepholeSubstituteAlternateSyntax1.isPure(node24);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        java.lang.Class<?> wildcardClass20 = peepholeSubstituteAlternateSyntax1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        java.lang.Class<?> wildcardClass22 = peepholeSubstituteAlternateSyntax1.getClass();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        java.lang.Class<?> wildcardClass18 = peepholeSubstituteAlternateSyntax1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node22, node23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.getExceptionHandler(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node8, node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node24);
        com.google.javascript.rhino.Node node26 = null;
        boolean boolean27 = peepholeSubstituteAlternateSyntax1.isPure(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node28, node29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.getExceptionHandler(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass20 = node19.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = node17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = node17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass24 = node23.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node24);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node14, node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        java.lang.Class<?> wildcardClass18 = peepholeSubstituteAlternateSyntax1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node26);
        com.google.javascript.rhino.Node node28 = null;
        boolean boolean29 = peepholeSubstituteAlternateSyntax1.isPure(node28);
        com.google.javascript.rhino.Node node30 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node31 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node26);
        com.google.javascript.rhino.Node node28 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node29 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node27);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node16, node17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.getExceptionHandler(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass24 = node23.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = peepholeSubstituteAlternateSyntax1.isPure(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node26);
        com.google.javascript.rhino.Node node28 = null;
        boolean boolean29 = peepholeSubstituteAlternateSyntax1.isPure(node28);
        com.google.javascript.rhino.Node node30 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node31 = peepholeSubstituteAlternateSyntax1.getExceptionHandler(node30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.getExceptionHandler(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = peepholeSubstituteAlternateSyntax1.isPure(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node26);
        java.lang.Class<?> wildcardClass28 = peepholeSubstituteAlternateSyntax1.getClass();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node24);
        com.google.javascript.rhino.Node node26 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.getExceptionHandler(node26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node24, node25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = peepholeSubstituteAlternateSyntax1.isPure(node24);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        java.lang.Class<?> wildcardClass18 = peepholeSubstituteAlternateSyntax1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = peepholeSubstituteAlternateSyntax1.isPure(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node26);
        com.google.javascript.rhino.Node node28 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(node27);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.getExceptionHandler(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node24);
        com.google.javascript.rhino.Node node26 = null;
        boolean boolean27 = peepholeSubstituteAlternateSyntax1.isPure(node26);
        java.lang.Class<?> wildcardClass28 = peepholeSubstituteAlternateSyntax1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node22, node23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = node17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node18, node19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.getExceptionHandler(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        com.google.javascript.rhino.Node node24 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        java.lang.Class<?> wildcardClass16 = peepholeSubstituteAlternateSyntax1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = peepholeSubstituteAlternateSyntax1.isPure(node24);
        java.lang.Class<?> wildcardClass26 = peepholeSubstituteAlternateSyntax1.getClass();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.getExceptionHandler(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        java.lang.Class<?> wildcardClass22 = peepholeSubstituteAlternateSyntax1.getClass();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        java.lang.Class<?> wildcardClass20 = peepholeSubstituteAlternateSyntax1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node22, node23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node24);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        java.lang.Class<?> wildcardClass22 = peepholeSubstituteAlternateSyntax1.getClass();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node24);
        com.google.javascript.rhino.Node node26 = null;
        boolean boolean27 = peepholeSubstituteAlternateSyntax1.isPure(node26);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = peepholeSubstituteAlternateSyntax1.isPure(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node26);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(node27);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node16, node17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = peepholeSubstituteAlternateSyntax1.isPure(node24);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = peepholeSubstituteAlternateSyntax1.isPure(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node28);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass30 = node29.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node29);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node22, node23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        java.lang.Class<?> wildcardClass20 = peepholeSubstituteAlternateSyntax1.getClass();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node14, node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.getExceptionHandler(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        com.google.javascript.rhino.Node node24 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(node23);
    }
}

