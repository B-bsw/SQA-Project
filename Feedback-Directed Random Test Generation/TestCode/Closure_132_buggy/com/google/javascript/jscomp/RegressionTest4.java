package com.google.javascript.jscomp;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

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
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
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
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
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
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node18);
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
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
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
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
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
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = peepholeSubstituteAlternateSyntax1.isPure(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node26);
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(node27);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
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
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
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
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = peepholeSubstituteAlternateSyntax1.isPure(node24);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
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
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        java.lang.Class<?> wildcardClass14 = peepholeSubstituteAlternateSyntax1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
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
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
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
        java.lang.Class<?> wildcardClass16 = peepholeSubstituteAlternateSyntax1.getClass();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
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
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = peepholeSubstituteAlternateSyntax1.isPure(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node26);
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
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(node27);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
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
        boolean boolean29 = peepholeSubstituteAlternateSyntax1.isPure(node28);
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node14);
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
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
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
        boolean boolean27 = peepholeSubstituteAlternateSyntax1.isPure(node26);
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
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
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
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
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
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = peepholeSubstituteAlternateSyntax1.isPure(node24);
        com.google.javascript.rhino.Node node26 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node26);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
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
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
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
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
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
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
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
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
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
        com.google.javascript.rhino.Node node21 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node20, node21);
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
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
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
            com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node16);
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
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
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
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
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
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = node17.getClass();
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
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
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
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node20);
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node26);
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
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
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
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
        com.google.javascript.rhino.Node node30 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node31 = peepholeSubstituteAlternateSyntax1.getExceptionHandler(node30);
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
        org.junit.Assert.assertNull(node29);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
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
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.getExceptionHandler(node22);
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
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node18);
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
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node32);
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
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
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
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
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
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
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
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass22 = node21.getClass();
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
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        java.lang.Class<?> wildcardClass12 = peepholeSubstituteAlternateSyntax1.getClass();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
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
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
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
        boolean boolean27 = peepholeSubstituteAlternateSyntax1.isPure(node26);
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
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
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node12, node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
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
        java.lang.Class<?> wildcardClass20 = peepholeSubstituteAlternateSyntax1.getClass();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
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
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
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
        boolean boolean27 = peepholeSubstituteAlternateSyntax1.isPure(node26);
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
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
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
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
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
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
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
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
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
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
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        java.lang.Class<?> wildcardClass24 = peepholeSubstituteAlternateSyntax1.getClass();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
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
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
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
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        java.lang.Class<?> wildcardClass22 = peepholeSubstituteAlternateSyntax1.getClass();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
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
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
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
        com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node26);
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
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node27);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
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
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
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
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
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
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
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
        java.lang.Class<?> wildcardClass26 = peepholeSubstituteAlternateSyntax1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = node11.getClass();
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
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
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
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        java.lang.Class<?> wildcardClass16 = peepholeSubstituteAlternateSyntax1.getClass();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
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
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node6, node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
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
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        java.lang.Class<?> wildcardClass22 = peepholeSubstituteAlternateSyntax1.getClass();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
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
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
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
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
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
        java.lang.Class<?> wildcardClass14 = peepholeSubstituteAlternateSyntax1.getClass();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
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
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
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
        com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node26);
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
        org.junit.Assert.assertNull(node27);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
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
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
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
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
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
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        java.lang.Class<?> wildcardClass14 = peepholeSubstituteAlternateSyntax1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
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
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node18);
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
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
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
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
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
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
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
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
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
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.getExceptionHandler(node14);
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
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
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
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node30, node31);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(node29);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass28 = node27.getClass();
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
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
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
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
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
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
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
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
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
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
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
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
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
        com.google.javascript.rhino.Node node26 = null;
        boolean boolean27 = peepholeSubstituteAlternateSyntax1.isPure(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node28);
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(node29);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
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
        com.google.javascript.rhino.Node node28 = null;
        boolean boolean29 = peepholeSubstituteAlternateSyntax1.isPure(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node30);
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(node31);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
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
        com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node24);
        com.google.javascript.rhino.Node node26 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node26);
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
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
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
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
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
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
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
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
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
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node12);
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
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
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
        java.lang.Class<?> wildcardClass14 = peepholeSubstituteAlternateSyntax1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
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
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
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
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
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
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }
}

