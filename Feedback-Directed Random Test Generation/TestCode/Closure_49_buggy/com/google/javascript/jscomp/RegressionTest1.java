package com.google.javascript.jscomp;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

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
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique11.enterScope(nodeTraversal12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer1 = contextualRenamer0.forChildScope();
        boolean boolean2 = contextualRenamer0.stripConstIfReplaced();
        boolean boolean3 = contextualRenamer0.stripConstIfReplaced();
        boolean boolean4 = contextualRenamer0.stripConstIfReplaced();
        java.lang.String str6 = contextualRenamer0.getReplacementName("arguments");
        java.lang.String str8 = contextualRenamer0.getReplacementName("$$");
        contextualRenamer0.addDeclaredName("hi!");
        org.junit.Assert.assertNotNull(renamer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        java.lang.String str7 = inlineRenamer3.getReplacementName("arguments");
        java.lang.String str9 = inlineRenamer3.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        boolean boolean11 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean12 = inlineRenamer3.stripConstIfReplaced();
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("$$");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = makeDeclaredNamesUnique7.shouldTraverse(nodeTraversal8, node9, node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("hi!");
        boolean boolean10 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("$$");
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boolean boolean7 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique7.exitScope(nodeTraversal8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boolean boolean7 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("");
        java.lang.String str11 = boilerplateRenamer2.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        java.lang.String str14 = boilerplateRenamer2.getReplacementName("arguments");
        java.lang.String str16 = boilerplateRenamer2.getReplacementName("$$");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        java.lang.String str5 = boilerplateRenamer2.getReplacementName("");
        boilerplateRenamer2.addDeclaredName("$$");
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("hi!");
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer1 = contextualRenamer0.forChildScope();
        boolean boolean2 = contextualRenamer0.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = contextualRenamer0.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = contextualRenamer0.forChildScope();
        org.junit.Assert.assertNotNull(renamer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNotNull(renamer4);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str7 = boilerplateRenamer2.getReplacementName("hi!");
        boolean boolean8 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        java.lang.String str13 = boilerplateRenamer2.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer14 = boilerplateRenamer2.forChildScope();
        java.lang.Class<?> wildcardClass15 = boilerplateRenamer2.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(renamer14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        java.lang.String str8 = boilerplateRenamer2.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        boolean boolean10 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique11.enterScope(nodeTraversal12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer1 = contextualRenamer0.forChildScope();
        boolean boolean2 = contextualRenamer0.stripConstIfReplaced();
        boolean boolean3 = contextualRenamer0.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = contextualRenamer0.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = contextualRenamer0.forChildScope();
        boolean boolean6 = renamer5.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("$$");
        java.lang.String str10 = boilerplateRenamer2.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique13.visit(nodeTraversal14, node15, node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNotNull(renamer12);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        java.lang.Class<?> wildcardClass8 = renamer7.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean9 = inlineRenamer3.stripConstIfReplaced();
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("$$");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boolean boolean4 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("hi!");
        java.lang.String str8 = boilerplateRenamer2.getReplacementName("");
        java.lang.Class<?> wildcardClass9 = boilerplateRenamer2.getClass();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer1 = contextualRenamer0.forChildScope();
        boolean boolean2 = contextualRenamer0.stripConstIfReplaced();
        boolean boolean3 = contextualRenamer0.stripConstIfReplaced();
        boolean boolean4 = contextualRenamer0.stripConstIfReplaced();
        java.lang.String str6 = contextualRenamer0.getReplacementName("arguments");
        boolean boolean7 = contextualRenamer0.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = contextualRenamer0.forChildScope();
        org.junit.Assert.assertNotNull(renamer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(renamer8);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "$$", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        java.lang.String str6 = inlineRenamer3.getReplacementName("hi!");
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boolean boolean4 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique8 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer7);
        java.lang.Class<?> wildcardClass9 = makeDeclaredNamesUnique8.getClass();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str8 = inlineRenamer3.getReplacementName("hi!");
        inlineRenamer3.addDeclaredName("");
        java.lang.String str12 = inlineRenamer3.getReplacementName("hi!");
        inlineRenamer3.addDeclaredName("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("hi!");
        boilerplateRenamer2.addDeclaredName("hi!");
        boilerplateRenamer2.addDeclaredName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean12 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boolean boolean4 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique9 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique9.exitScope(nodeTraversal10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boolean boolean4 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer9);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("arguments");
        boolean boolean10 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean11 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str13 = boilerplateRenamer2.getReplacementName("arguments");
        boolean boolean14 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer15 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique16 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal17 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique16.exitScope(nodeTraversal17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(renamer15);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = renamer9.forChildScope();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        java.lang.String str5 = boilerplateRenamer2.getReplacementName("arguments");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean14 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        java.lang.String str5 = boilerplateRenamer2.getReplacementName("arguments");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique10 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("hi!");
        boolean boolean14 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer15 = boilerplateRenamer2.forChildScope();
        java.lang.Class<?> wildcardClass16 = boilerplateRenamer2.getClass();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(renamer15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boolean boolean4 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        java.lang.String str10 = renamer8.getReplacementName("$$");
        java.lang.Class<?> wildcardClass11 = renamer8.getClass();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        java.lang.String str5 = boilerplateRenamer2.getReplacementName("arguments");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        java.lang.String str10 = boilerplateRenamer2.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = renamer11.forChildScope();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNotNull(renamer12);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        java.lang.String str9 = inlineRenamer3.getReplacementName("hi!");
        boolean boolean10 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = inlineRenamer3.forChildScope();
        java.lang.String str13 = inlineRenamer3.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer14 = inlineRenamer3.forChildScope();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(renamer14);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        java.lang.String str4 = boilerplateRenamer2.getReplacementName("");
        boilerplateRenamer2.addDeclaredName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        java.lang.Class<?> wildcardClass8 = makeDeclaredNamesUnique7.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", false);
        java.lang.String str5 = inlineRenamer3.getReplacementName("hi!");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("arguments");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boolean boolean4 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("hi!");
        boolean boolean7 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique8 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = null;
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = makeDeclaredNamesUnique8.shouldTraverse(nodeTraversal9, node10, node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("arguments");
        boolean boolean10 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique13.exitScope(nodeTraversal14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean6 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boolean boolean8 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str10 = boilerplateRenamer2.getReplacementName("arguments");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique9 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = makeDeclaredNamesUnique9.shouldTraverse(nodeTraversal10, node11, node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("");
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boolean boolean4 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("hi!");
        boilerplateRenamer2.addDeclaredName("");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        boolean boolean12 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        java.lang.String str7 = inlineRenamer3.getReplacementName("arguments");
        java.lang.String str9 = inlineRenamer3.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique10 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal11 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique10.enterScope(nodeTraversal11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boilerplateRenamer2.addDeclaredName("hi!");
        java.lang.String str10 = boilerplateRenamer2.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique12.visit(nodeTraversal13, node14, node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(renamer11);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = inlineRenamer3.forChildScope();
        java.lang.String str11 = inlineRenamer3.getReplacementName("$$");
        boolean boolean12 = inlineRenamer3.stripConstIfReplaced();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str7 = boilerplateRenamer2.getReplacementName("hi!");
        boolean boolean8 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        java.lang.Class<?> wildcardClass10 = boilerplateRenamer2.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        java.lang.String str9 = inlineRenamer3.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        java.lang.String str12 = renamer10.getReplacementName("arguments");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique9 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = makeDeclaredNamesUnique9.shouldTraverse(nodeTraversal10, node11, node12);
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
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        boolean boolean7 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique10 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal11 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique10.exitScope(nodeTraversal11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        java.lang.String str4 = boilerplateRenamer2.getReplacementName("$$");
        boilerplateRenamer2.addDeclaredName("");
        java.lang.String str8 = boilerplateRenamer2.getReplacementName("arguments");
        java.lang.String str10 = boilerplateRenamer2.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        boolean boolean12 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean13 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        java.lang.String str7 = inlineRenamer3.getReplacementName("arguments");
        java.lang.String str9 = inlineRenamer3.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        boolean boolean11 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean12 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean13 = inlineRenamer3.stripConstIfReplaced();
        java.lang.Class<?> wildcardClass14 = inlineRenamer3.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique4 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal5 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique4.enterScope(nodeTraversal5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique9 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        java.lang.Class<?> wildcardClass11 = inlineRenamer3.getClass();
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        java.lang.String str5 = boilerplateRenamer2.getReplacementName("arguments");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique10 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique14 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique14.enterScope(nodeTraversal15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer11);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str10 = inlineRenamer3.getReplacementName("arguments");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique8 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer7);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique8.exitScope(nodeTraversal9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str7 = boilerplateRenamer2.getReplacementName("hi!");
        boolean boolean8 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        java.lang.String str13 = boilerplateRenamer2.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer14 = boilerplateRenamer2.forChildScope();
        // The following exception was thrown during execution in test generation
        try {
            renamer14.addDeclaredName("$$");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(renamer14);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        boolean boolean5 = renamer4.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique6.exitScope(nodeTraversal7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        java.lang.Class<?> wildcardClass8 = inlineRenamer3.getClass();
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "$$", false);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = inlineRenamer3.forChildScope();
        // The following exception was thrown during execution in test generation
        try {
            renamer5.addDeclaredName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(renamer5);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boolean boolean7 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str8 = inlineRenamer3.getReplacementName("hi!");
        inlineRenamer3.addDeclaredName("");
        inlineRenamer3.addDeclaredName("");
        boolean boolean13 = inlineRenamer3.stripConstIfReplaced();
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str7 = boilerplateRenamer2.getReplacementName("hi!");
        boolean boolean8 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        // The following exception was thrown during execution in test generation
        try {
            renamer11.addDeclaredName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(renamer11);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        java.lang.String str4 = boilerplateRenamer2.getReplacementName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("$$");
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("$$");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str7 = boilerplateRenamer2.getReplacementName("hi!");
        boolean boolean8 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        java.lang.Class<?> wildcardClass14 = boilerplateRenamer2.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        boolean boolean12 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "");
        boilerplateRenamer2.addDeclaredName("");
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("arguments");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str7 = boilerplateRenamer2.getReplacementName("hi!");
        boolean boolean8 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNotNull(renamer12);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        java.lang.String str7 = inlineRenamer3.getReplacementName("arguments");
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
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        java.lang.String str7 = inlineRenamer3.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique9 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = makeDeclaredNamesUnique9.shouldTraverse(nodeTraversal10, node11, node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(renamer8);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean9 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique11.visit(nodeTraversal12, node13, node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(renamer10);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str8 = inlineRenamer3.getReplacementName("$$");
        boolean boolean9 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean10 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = inlineRenamer3.forChildScope();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(renamer11);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        java.lang.String str8 = boilerplateRenamer2.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        boolean boolean10 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique11.exitScope(nodeTraversal12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        java.lang.String str12 = boilerplateRenamer2.getReplacementName("$$");
        java.lang.String str14 = boilerplateRenamer2.getReplacementName("arguments");
        boilerplateRenamer2.addDeclaredName("");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = inlineRenamer3.forChildScope();
        java.lang.Class<?> wildcardClass6 = renamer5.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        java.lang.String str5 = boilerplateRenamer2.getReplacementName("arguments");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        java.lang.String str10 = boilerplateRenamer2.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique11.enterScope(nodeTraversal12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = makeDeclaredNamesUnique7.shouldTraverse(nodeTraversal8, node9, node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("");
        java.lang.String str7 = inlineRenamer3.getReplacementName("$$");
        java.lang.String str9 = inlineRenamer3.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique10 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal11 = null;
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique10.visit(nodeTraversal11, node12, node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str8 = inlineRenamer3.getReplacementName("hi!");
        inlineRenamer3.addDeclaredName("");
        java.lang.String str12 = inlineRenamer3.getReplacementName("hi!");
        boolean boolean13 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean14 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str16 = inlineRenamer3.getReplacementName("arguments");
        boolean boolean17 = inlineRenamer3.stripConstIfReplaced();
        java.lang.Class<?> wildcardClass18 = inlineRenamer3.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = inlineRenamer3.forChildScope();
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique11.exitScope(nodeTraversal12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer1 = contextualRenamer0.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer2 = contextualRenamer0.forChildScope();
        java.lang.String str4 = contextualRenamer0.getReplacementName("hi!");
        contextualRenamer0.addDeclaredName("");
        contextualRenamer0.addDeclaredName("arguments");
        boolean boolean9 = contextualRenamer0.stripConstIfReplaced();
        java.lang.String str11 = contextualRenamer0.getReplacementName("arguments");
        org.junit.Assert.assertNotNull(renamer1);
        org.junit.Assert.assertNotNull(renamer2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("$$");
        boolean boolean9 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boolean boolean7 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("");
        java.lang.String str11 = boilerplateRenamer2.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        java.lang.String str14 = boilerplateRenamer2.getReplacementName("$$");
        boilerplateRenamer2.addDeclaredName("arguments");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique8 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer7);
        java.lang.String str10 = renamer7.getReplacementName("hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        java.lang.String str8 = inlineRenamer3.getReplacementName("hi!");
        java.lang.Class<?> wildcardClass9 = inlineRenamer3.getClass();
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer1 = contextualRenamer0.forChildScope();
        boolean boolean2 = contextualRenamer0.stripConstIfReplaced();
        boolean boolean3 = contextualRenamer0.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = contextualRenamer0.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = contextualRenamer0.forChildScope();
        contextualRenamer0.addDeclaredName("arguments");
        org.junit.Assert.assertNotNull(renamer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boolean boolean4 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("hi!");
        boilerplateRenamer2.addDeclaredName("");
        boilerplateRenamer2.addDeclaredName("");
        boilerplateRenamer2.addDeclaredName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique13.exitScope(nodeTraversal14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        java.lang.String str5 = boilerplateRenamer2.getReplacementName("arguments");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        // The following exception was thrown during execution in test generation
        try {
            renamer9.addDeclaredName("$$");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = inlineRenamer3.forChildScope();
        renamer6.addDeclaredName("");
        java.lang.String str10 = renamer6.getReplacementName("$$");
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean9 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean10 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = inlineRenamer3.forChildScope();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(renamer11);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str9 = inlineRenamer3.getReplacementName("hi!");
        boolean boolean10 = inlineRenamer3.stripConstIfReplaced();
        inlineRenamer3.addDeclaredName("");
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = renamer6.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = renamer7.forChildScope();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = renamer6.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique8 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer7);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = null;
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = makeDeclaredNamesUnique8.shouldTraverse(nodeTraversal9, node10, node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str7 = boilerplateRenamer2.getReplacementName("hi!");
        boolean boolean8 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = boilerplateRenamer2.forChildScope();
        java.lang.String str15 = boilerplateRenamer2.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer16 = boilerplateRenamer2.forChildScope();
        java.lang.String str18 = renamer16.getReplacementName("arguments");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(renamer13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(renamer16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = renamer7.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique9 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer7);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = makeDeclaredNamesUnique9.shouldTraverse(nodeTraversal10, node11, node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        boolean boolean12 = renamer11.stripConstIfReplaced();
        java.lang.String str14 = renamer11.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique15 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer11);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique15.exitScope(nodeTraversal16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean6 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer1 = contextualRenamer0.forChildScope();
        boolean boolean2 = contextualRenamer0.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) contextualRenamer0);
        boolean boolean4 = contextualRenamer0.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = contextualRenamer0.forChildScope();
        org.junit.Assert.assertNotNull(renamer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(renamer5);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        java.lang.String str4 = boilerplateRenamer2.getReplacementName("hi!");
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("");
        java.lang.String str8 = boilerplateRenamer2.getReplacementName("");
        java.lang.String str10 = boilerplateRenamer2.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        java.lang.String str13 = boilerplateRenamer2.getReplacementName("arguments");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "$$", false);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = makeDeclaredNamesUnique6.shouldTraverse(nodeTraversal7, node8, node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(renamer5);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique7.enterScope(nodeTraversal8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique6.exitScope(nodeTraversal7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(renamer5);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        java.lang.String str7 = inlineRenamer3.getReplacementName("arguments");
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean9 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str11 = inlineRenamer3.getReplacementName("arguments");
        boolean boolean12 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = makeDeclaredNamesUnique13.shouldTraverse(nodeTraversal14, node15, node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str7 = boilerplateRenamer2.getReplacementName("hi!");
        boolean boolean8 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("hi!");
        boilerplateRenamer2.addDeclaredName("hi!");
        boolean boolean13 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer14 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(renamer14);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique4 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("arguments");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        java.lang.Class<?> wildcardClass7 = renamer6.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        java.lang.String str9 = inlineRenamer3.getReplacementName("$$");
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("arguments");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        java.lang.String str13 = boilerplateRenamer2.getReplacementName("$$");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        java.lang.String str7 = inlineRenamer3.getReplacementName("arguments");
        java.lang.String str9 = inlineRenamer3.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        boolean boolean11 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean12 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str14 = inlineRenamer3.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer15 = inlineRenamer3.forChildScope();
        boolean boolean16 = renamer15.stripConstIfReplaced();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(renamer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        boolean boolean11 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = inlineRenamer3.forChildScope();
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(renamer12);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique9 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique9.exitScope(nodeTraversal10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        java.lang.String str12 = boilerplateRenamer2.getReplacementName("hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNotNull(renamer11);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boilerplateRenamer2.addDeclaredName("hi!");
        java.lang.String str10 = boilerplateRenamer2.getReplacementName("");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        java.lang.String str8 = boilerplateRenamer2.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique10 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal11 = null;
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique10.visit(nodeTraversal11, node12, node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(renamer9);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        boolean boolean12 = renamer11.stripConstIfReplaced();
        java.lang.String str14 = renamer11.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique15 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer11);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = makeDeclaredNamesUnique15.shouldTraverse(nodeTraversal16, node17, node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str7 = boilerplateRenamer2.getReplacementName("hi!");
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("");
        java.lang.Class<?> wildcardClass10 = boilerplateRenamer2.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        java.lang.String str4 = boilerplateRenamer2.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        boolean boolean6 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        java.lang.String str5 = boilerplateRenamer2.getReplacementName("arguments");
        boolean boolean6 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.Class<?> wildcardClass7 = boilerplateRenamer2.getClass();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer1 = contextualRenamer0.forChildScope();
        contextualRenamer0.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = contextualRenamer0.forChildScope();
        java.lang.String str6 = renamer4.getReplacementName("arguments");
        renamer4.addDeclaredName("");
        org.junit.Assert.assertNotNull(renamer1);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        boolean boolean7 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("");
        java.lang.String str11 = boilerplateRenamer2.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = boilerplateRenamer2.forChildScope();
        boolean boolean13 = renamer12.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(renamer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        java.lang.String str4 = boilerplateRenamer2.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(renamer5);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", false);
        java.lang.String str5 = inlineRenamer3.getReplacementName("hi!");
        java.lang.String str7 = inlineRenamer3.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = inlineRenamer3.forChildScope();
        java.lang.Class<?> wildcardClass9 = renamer8.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boolean boolean4 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("hi!");
        boilerplateRenamer2.addDeclaredName("");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        java.lang.String str13 = boilerplateRenamer2.getReplacementName("arguments");
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boolean boolean4 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = renamer8.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique10 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer9);
        java.lang.Class<?> wildcardClass11 = renamer9.getClass();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        inlineRenamer3.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = inlineRenamer3.forChildScope();
        boolean boolean13 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean14 = inlineRenamer3.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNotNull(renamer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = renamer7.forChildScope();
        java.lang.Class<?> wildcardClass9 = renamer8.getClass();
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("arguments");
        boolean boolean10 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = makeDeclaredNamesUnique13.shouldTraverse(nodeTraversal14, node15, node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boilerplateRenamer2.addDeclaredName("hi!");
        java.lang.String str10 = boilerplateRenamer2.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = renamer12.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique14 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer13);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = null;
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = makeDeclaredNamesUnique14.shouldTraverse(nodeTraversal15, node16, node17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNotNull(renamer12);
        org.junit.Assert.assertNotNull(renamer13);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique7.exitScope(nodeTraversal8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        java.lang.String str5 = boilerplateRenamer2.getReplacementName("arguments");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("$$");
        boilerplateRenamer2.addDeclaredName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer15 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNotNull(renamer15);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean6 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boolean boolean8 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boilerplateRenamer2.addDeclaredName("hi!");
        java.lang.String str10 = boilerplateRenamer2.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = renamer12.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique14 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer13);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = null;
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique14.visit(nodeTraversal15, node16, node17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNotNull(renamer12);
        org.junit.Assert.assertNotNull(renamer13);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        java.lang.Class<?> wildcardClass5 = inlineRenamer3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique9 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique9.visit(nodeTraversal10, node11, node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        java.lang.String str5 = boilerplateRenamer2.getReplacementName("arguments");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique10 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("hi!");
        boolean boolean14 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer15 = boilerplateRenamer2.forChildScope();
        boolean boolean16 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer17 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(renamer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(renamer17);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("");
        java.lang.String str7 = inlineRenamer3.getReplacementName("$$");
        java.lang.String str9 = inlineRenamer3.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique10 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        java.lang.String str12 = inlineRenamer3.getReplacementName("");
        boolean boolean13 = inlineRenamer3.stripConstIfReplaced();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        java.lang.String str5 = boilerplateRenamer2.getReplacementName("arguments");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique10 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        java.lang.String str15 = boilerplateRenamer2.getReplacementName("hi!");
        boolean boolean16 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer17 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(renamer17);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer1 = contextualRenamer0.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer2 = contextualRenamer0.forChildScope();
        java.lang.String str4 = contextualRenamer0.getReplacementName("");
        boolean boolean5 = contextualRenamer0.stripConstIfReplaced();
        contextualRenamer0.addDeclaredName("");
        contextualRenamer0.addDeclaredName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = contextualRenamer0.forChildScope();
        org.junit.Assert.assertNotNull(renamer1);
        org.junit.Assert.assertNotNull(renamer2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer10);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("$$");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("hi!");
        boilerplateRenamer2.addDeclaredName("hi!");
        boilerplateRenamer2.addDeclaredName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        boolean boolean10 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(renamer13);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("hi!");
        boilerplateRenamer2.addDeclaredName("hi!");
        boilerplateRenamer2.addDeclaredName("$$");
        boolean boolean9 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean10 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        java.lang.String str5 = boilerplateRenamer2.getReplacementName("arguments");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        java.lang.String str11 = boilerplateRenamer2.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = boilerplateRenamer2.forChildScope();
        java.lang.String str15 = boilerplateRenamer2.getReplacementName("$$");
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(renamer12);
        org.junit.Assert.assertNotNull(renamer13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer1 = contextualRenamer0.forChildScope();
        boolean boolean2 = contextualRenamer0.stripConstIfReplaced();
        boolean boolean3 = contextualRenamer0.stripConstIfReplaced();
        boolean boolean4 = contextualRenamer0.stripConstIfReplaced();
        boolean boolean5 = contextualRenamer0.stripConstIfReplaced();
        java.lang.String str7 = contextualRenamer0.getReplacementName("");
        boolean boolean8 = contextualRenamer0.stripConstIfReplaced();
        contextualRenamer0.addDeclaredName("arguments");
        org.junit.Assert.assertNotNull(renamer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boolean boolean8 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean9 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(renamer10);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("arguments");
        boilerplateRenamer2.addDeclaredName("arguments");
        boilerplateRenamer2.addDeclaredName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique14 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = null;
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = makeDeclaredNamesUnique14.shouldTraverse(nodeTraversal15, node16, node17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "$$", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = inlineRenamer3.forChildScope();
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer6);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boolean boolean8 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.Class<?> wildcardClass9 = boilerplateRenamer2.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boolean boolean4 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("hi!");
        boilerplateRenamer2.addDeclaredName("");
        boilerplateRenamer2.addDeclaredName("");
        boilerplateRenamer2.addDeclaredName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer14 = boilerplateRenamer2.forChildScope();
        java.lang.Class<?> wildcardClass15 = boilerplateRenamer2.getClass();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer13);
        org.junit.Assert.assertNotNull(renamer14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        java.lang.String str4 = boilerplateRenamer2.getReplacementName("");
        boilerplateRenamer2.addDeclaredName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boolean boolean8 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        java.lang.String str5 = boilerplateRenamer2.getReplacementName("arguments");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique10 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        boolean boolean12 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer16 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(renamer13);
        org.junit.Assert.assertNotNull(renamer16);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boolean boolean4 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("hi!");
        boilerplateRenamer2.addDeclaredName("");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        java.lang.Class<?> wildcardClass12 = renamer11.getClass();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer1 = contextualRenamer0.forChildScope();
        boolean boolean2 = contextualRenamer0.stripConstIfReplaced();
        boolean boolean3 = contextualRenamer0.stripConstIfReplaced();
        boolean boolean4 = contextualRenamer0.stripConstIfReplaced();
        boolean boolean5 = contextualRenamer0.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = contextualRenamer0.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = contextualRenamer0.forChildScope();
        java.lang.String str9 = contextualRenamer0.getReplacementName("$$");
        java.lang.Class<?> wildcardClass10 = contextualRenamer0.getClass();
        org.junit.Assert.assertNotNull(renamer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = inlineRenamer3.forChildScope();
        boolean boolean10 = inlineRenamer3.stripConstIfReplaced();
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean9 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = renamer10.forChildScope();
        java.lang.Class<?> wildcardClass12 = renamer11.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique5.exitScope(nodeTraversal6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boolean boolean4 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("hi!");
        boilerplateRenamer2.addDeclaredName("");
        boilerplateRenamer2.addDeclaredName("");
        boilerplateRenamer2.addDeclaredName("$$");
        java.lang.String str14 = boilerplateRenamer2.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer15 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(renamer15);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        boolean boolean5 = renamer4.stripConstIfReplaced();
        boolean boolean6 = renamer4.stripConstIfReplaced();
        // The following exception was thrown during execution in test generation
        try {
            renamer4.addDeclaredName("$$");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        java.lang.String str4 = boilerplateRenamer2.getReplacementName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean6 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str8 = boilerplateRenamer2.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        // The following exception was thrown during execution in test generation
        try {
            renamer9.addDeclaredName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(renamer9);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNotNull(renamer12);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "$$");
        boolean boolean3 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("$$");
        java.lang.String str7 = boilerplateRenamer2.getReplacementName("arguments");
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("hi!");
        boolean boolean10 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("arguments");
        boolean boolean13 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        boolean boolean7 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique8 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = null;
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique8.visit(nodeTraversal9, node10, node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        boolean boolean8 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        boolean boolean10 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str12 = boilerplateRenamer2.getReplacementName("$$");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", false);
        java.lang.String str5 = inlineRenamer3.getReplacementName("hi!");
        java.lang.String str7 = inlineRenamer3.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = inlineRenamer3.forChildScope();
        java.lang.String str11 = inlineRenamer3.getReplacementName("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boolean boolean7 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("hi!");
        boolean boolean10 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean9 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str11 = inlineRenamer3.getReplacementName("$$");
        java.lang.Class<?> wildcardClass12 = inlineRenamer3.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boolean boolean4 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = renamer8.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique10 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer9);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal11 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique10.exitScope(nodeTraversal11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boilerplateRenamer2.addDeclaredName("hi!");
        java.lang.String str10 = boilerplateRenamer2.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("arguments");
        boolean boolean14 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boolean boolean4 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique8 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer7);
        renamer7.addDeclaredName("");
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer7);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        boolean boolean7 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("");
        boilerplateRenamer2.addDeclaredName("");
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        java.lang.Class<?> wildcardClass11 = boilerplateRenamer2.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str7 = boilerplateRenamer2.getReplacementName("hi!");
        boolean boolean8 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("hi!");
        boilerplateRenamer2.addDeclaredName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer14 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(renamer13);
        org.junit.Assert.assertNotNull(renamer14);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boolean boolean4 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique10 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal11 = null;
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique10.visit(nodeTraversal11, node12, node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique9 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        boolean boolean10 = inlineRenamer3.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boilerplateRenamer2.addDeclaredName("hi!");
        boolean boolean9 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = inlineRenamer3.forChildScope();
        inlineRenamer3.addDeclaredName("");
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(renamer8);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boolean boolean4 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("hi!");
        boilerplateRenamer2.addDeclaredName("");
        boilerplateRenamer2.addDeclaredName("");
        boilerplateRenamer2.addDeclaredName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer14 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer13);
        org.junit.Assert.assertNotNull(renamer14);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        java.lang.String str5 = boilerplateRenamer2.getReplacementName("arguments");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique10 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique14 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer15 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNotNull(renamer15);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boolean boolean4 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("hi!");
        boilerplateRenamer2.addDeclaredName("");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        java.lang.Class<?> wildcardClass12 = makeDeclaredNamesUnique11.getClass();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        java.lang.String str9 = inlineRenamer3.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        boolean boolean11 = renamer10.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("arguments");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        java.lang.String str10 = boilerplateRenamer2.getReplacementName("");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        java.lang.String str8 = boilerplateRenamer2.getReplacementName("$$");
        java.lang.Class<?> wildcardClass9 = boilerplateRenamer2.getClass();
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("$$");
        java.lang.String str11 = boilerplateRenamer2.getReplacementName("");
        java.lang.String str13 = boilerplateRenamer2.getReplacementName("hi!");
        boilerplateRenamer2.addDeclaredName("hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boolean boolean4 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("hi!");
        boilerplateRenamer2.addDeclaredName("");
        boilerplateRenamer2.addDeclaredName("");
        boilerplateRenamer2.addDeclaredName("$$");
        java.lang.String str14 = boilerplateRenamer2.getReplacementName("arguments");
        java.lang.String str16 = boilerplateRenamer2.getReplacementName("hi!");
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique4 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("arguments");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(renamer7);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = inlineRenamer3.forChildScope();
        boolean boolean7 = renamer6.stripConstIfReplaced();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        java.lang.String str7 = inlineRenamer3.getReplacementName("arguments");
        java.lang.String str9 = inlineRenamer3.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        boolean boolean11 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean12 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str14 = inlineRenamer3.getReplacementName("arguments");
        java.lang.String str16 = inlineRenamer3.getReplacementName("hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        java.lang.String str5 = boilerplateRenamer2.getReplacementName("arguments");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("hi!");
        boilerplateRenamer2.addDeclaredName("");
        java.lang.String str15 = boilerplateRenamer2.getReplacementName("");
        java.lang.Class<?> wildcardClass16 = boilerplateRenamer2.getClass();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = inlineRenamer3.forChildScope();
        java.lang.String str10 = renamer8.getReplacementName("");
        renamer8.addDeclaredName("");
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        boolean boolean9 = renamer8.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str8 = inlineRenamer3.getReplacementName("hi!");
        inlineRenamer3.addDeclaredName("");
        java.lang.String str12 = inlineRenamer3.getReplacementName("hi!");
        boolean boolean13 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean14 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer15 = inlineRenamer3.forChildScope();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(renamer15);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        java.lang.String str5 = boilerplateRenamer2.getReplacementName("");
        boolean boolean6 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boolean boolean4 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("hi!");
        boilerplateRenamer2.addDeclaredName("");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = renamer11.forChildScope();
        boolean boolean13 = renamer11.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNotNull(renamer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "$$", false);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str6 = inlineRenamer3.getReplacementName("arguments");
        java.lang.String str8 = inlineRenamer3.getReplacementName("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        boolean boolean8 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        java.lang.Class<?> wildcardClass10 = renamer9.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        java.lang.String str8 = boilerplateRenamer2.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        java.lang.String str12 = boilerplateRenamer2.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = boilerplateRenamer2.forChildScope();
        java.lang.Class<?> wildcardClass14 = boilerplateRenamer2.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(renamer13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = boilerplateRenamer2.forChildScope();
        java.lang.Class<?> wildcardClass14 = renamer13.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNotNull(renamer12);
        org.junit.Assert.assertNotNull(renamer13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        java.lang.String str4 = boilerplateRenamer2.getReplacementName("");
        boilerplateRenamer2.addDeclaredName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique7.visit(nodeTraversal8, node9, node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer1 = contextualRenamer0.forChildScope();
        boolean boolean2 = contextualRenamer0.stripConstIfReplaced();
        boolean boolean3 = contextualRenamer0.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = contextualRenamer0.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = renamer4.forChildScope();
        java.lang.String str7 = renamer4.getReplacementName("hi!");
        org.junit.Assert.assertNotNull(renamer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer1 = contextualRenamer0.forChildScope();
        java.lang.String str3 = contextualRenamer0.getReplacementName("$$");
        java.lang.String str5 = contextualRenamer0.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = contextualRenamer0.forChildScope();
        java.lang.Class<?> wildcardClass7 = renamer6.getClass();
        org.junit.Assert.assertNotNull(renamer1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boolean boolean4 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = renamer8.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique10 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer9);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal11 = null;
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = makeDeclaredNamesUnique10.shouldTraverse(nodeTraversal11, node12, node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        inlineRenamer3.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = inlineRenamer3.forChildScope();
        boolean boolean13 = inlineRenamer3.stripConstIfReplaced();
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("$$");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNotNull(renamer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        java.lang.String str4 = boilerplateRenamer2.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        boolean boolean6 = renamer5.stripConstIfReplaced();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique4 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal5 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique4.enterScope(nodeTraversal5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boolean boolean4 = renamer3.stripConstIfReplaced();
        boolean boolean5 = renamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = renamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer3);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique8 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique8.exitScope(nodeTraversal9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boolean boolean4 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique10 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal11 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique10.exitScope(nodeTraversal11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boolean boolean4 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        java.lang.String str10 = boilerplateRenamer2.getReplacementName("arguments");
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boilerplateRenamer2.addDeclaredName("hi!");
        java.lang.String str10 = boilerplateRenamer2.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = renamer11.forChildScope();
        // The following exception was thrown during execution in test generation
        try {
            renamer11.addDeclaredName("arguments");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNotNull(renamer12);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer15 = boilerplateRenamer2.forChildScope();
        boolean boolean16 = renamer15.stripConstIfReplaced();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNotNull(renamer12);
        org.junit.Assert.assertNotNull(renamer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        java.lang.String str4 = boilerplateRenamer2.getReplacementName("hi!");
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("");
        java.lang.String str8 = boilerplateRenamer2.getReplacementName("");
        java.lang.String str10 = boilerplateRenamer2.getReplacementName("");
        java.lang.String str12 = boilerplateRenamer2.getReplacementName("arguments");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique9 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        boolean boolean11 = inlineRenamer3.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = inlineRenamer3.forChildScope();
        java.lang.Class<?> wildcardClass9 = renamer8.getClass();
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        java.lang.String str7 = inlineRenamer3.getReplacementName("arguments");
        java.lang.String str9 = inlineRenamer3.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique10 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal11 = null;
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = makeDeclaredNamesUnique10.shouldTraverse(nodeTraversal11, node12, node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = renamer11.forChildScope();
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNotNull(renamer12);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        java.lang.String str5 = boilerplateRenamer2.getReplacementName("arguments");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        renamer10.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = renamer10.forChildScope();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNotNull(renamer13);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str8 = inlineRenamer3.getReplacementName("hi!");
        inlineRenamer3.addDeclaredName("");
        inlineRenamer3.addDeclaredName("");
        boolean boolean13 = inlineRenamer3.stripConstIfReplaced();
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "$$", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = makeDeclaredNamesUnique6.shouldTraverse(nodeTraversal7, node8, node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", false);
        java.lang.String str5 = inlineRenamer3.getReplacementName("hi!");
        java.lang.String str7 = inlineRenamer3.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = inlineRenamer3.forChildScope();
        boolean boolean9 = inlineRenamer3.stripConstIfReplaced();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = inlineRenamer3.forChildScope();
        boolean boolean10 = inlineRenamer3.stripConstIfReplaced();
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("$$");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "$$");
        boolean boolean3 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("$$");
        java.lang.String str7 = boilerplateRenamer2.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        boolean boolean9 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean10 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        java.lang.String str4 = boilerplateRenamer2.getReplacementName("$$");
        boilerplateRenamer2.addDeclaredName("");
        java.lang.String str8 = boilerplateRenamer2.getReplacementName("arguments");
        java.lang.String str10 = boilerplateRenamer2.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        boolean boolean12 = renamer11.stripConstIfReplaced();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer1 = contextualRenamer0.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer2 = renamer1.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = renamer1.forChildScope();
        java.lang.String str5 = renamer3.getReplacementName("$$");
        java.lang.String str7 = renamer3.getReplacementName("$$");
        boolean boolean8 = renamer3.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer1);
        org.junit.Assert.assertNotNull(renamer2);
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("arguments");
        boolean boolean10 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean11 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str13 = boilerplateRenamer2.getReplacementName("arguments");
        boolean boolean14 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer15 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("$$");
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(renamer15);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str9 = inlineRenamer3.getReplacementName("hi!");
        java.lang.String str11 = inlineRenamer3.getReplacementName("");
        boolean boolean12 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str14 = inlineRenamer3.getReplacementName("$$");
        inlineRenamer3.addDeclaredName("");
        java.lang.String str18 = inlineRenamer3.getReplacementName("");
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = inlineRenamer3.forChildScope();
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("arguments");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(renamer6);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boolean boolean4 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("hi!");
        boilerplateRenamer2.addDeclaredName("");
        boilerplateRenamer2.addDeclaredName("");
        boilerplateRenamer2.addDeclaredName("$$");
        java.lang.String str14 = boilerplateRenamer2.getReplacementName("arguments");
        java.lang.Class<?> wildcardClass15 = boilerplateRenamer2.getClass();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        java.lang.Class<?> wildcardClass6 = inlineRenamer3.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = inlineRenamer3.forChildScope();
        boolean boolean9 = inlineRenamer3.stripConstIfReplaced();
        java.lang.Class<?> wildcardClass10 = inlineRenamer3.getClass();
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        boolean boolean11 = renamer10.stripConstIfReplaced();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer1 = contextualRenamer0.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer2 = renamer1.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = renamer1.forChildScope();
        java.lang.String str5 = renamer3.getReplacementName("$$");
        java.lang.String str7 = renamer3.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique8 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique8.exitScope(nodeTraversal9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer1);
        org.junit.Assert.assertNotNull(renamer2);
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        java.lang.String str9 = inlineRenamer3.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("$$");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        java.lang.String str4 = boilerplateRenamer2.getReplacementName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean6 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(renamer7);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("");
        java.lang.String str7 = inlineRenamer3.getReplacementName("$$");
        java.lang.String str9 = inlineRenamer3.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique10 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal11 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique10.enterScope(nodeTraversal11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique7.exitScope(nodeTraversal8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique4 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique8 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer7);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(renamer7);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique8 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        inlineRenamer3.addDeclaredName("");
        java.lang.String str12 = inlineRenamer3.getReplacementName("");
        java.lang.String str14 = inlineRenamer3.getReplacementName("hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("hi!");
        boilerplateRenamer2.addDeclaredName("hi!");
        boilerplateRenamer2.addDeclaredName("");
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boolean boolean7 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("$$");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique10 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal11 = null;
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = makeDeclaredNamesUnique10.shouldTraverse(nodeTraversal11, node12, node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str8 = inlineRenamer3.getReplacementName("$$");
        boolean boolean9 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        java.lang.String str12 = renamer10.getReplacementName("arguments");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        java.lang.String str8 = boilerplateRenamer2.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        java.lang.String str12 = boilerplateRenamer2.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = boilerplateRenamer2.forChildScope();
        boolean boolean14 = renamer13.stripConstIfReplaced();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(renamer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("");
        boilerplateRenamer2.addDeclaredName("");
        java.lang.String str11 = boilerplateRenamer2.getReplacementName("arguments");
        java.lang.String str13 = boilerplateRenamer2.getReplacementName("hi!");
        boilerplateRenamer2.addDeclaredName("");
        java.lang.String str17 = boilerplateRenamer2.getReplacementName("arguments");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        java.lang.String str8 = boilerplateRenamer2.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        boolean boolean10 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique12.visit(nodeTraversal13, node14, node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer1 = contextualRenamer0.forChildScope();
        boolean boolean2 = contextualRenamer0.stripConstIfReplaced();
        boolean boolean3 = contextualRenamer0.stripConstIfReplaced();
        boolean boolean4 = contextualRenamer0.stripConstIfReplaced();
        boolean boolean5 = contextualRenamer0.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = contextualRenamer0.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = contextualRenamer0.forChildScope();
        java.lang.String str9 = contextualRenamer0.getReplacementName("hi!");
        org.junit.Assert.assertNotNull(renamer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique7.visit(nodeTraversal8, node9, node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = boilerplateRenamer2.forChildScope();
        java.lang.Class<?> wildcardClass13 = renamer12.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNotNull(renamer12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean6 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        boolean boolean8 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        java.lang.String str7 = inlineRenamer3.getReplacementName("arguments");
        java.lang.String str9 = inlineRenamer3.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        java.lang.String str12 = inlineRenamer3.getReplacementName("hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        java.lang.String str5 = boilerplateRenamer2.getReplacementName("");
        boilerplateRenamer2.addDeclaredName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str7 = inlineRenamer3.getReplacementName("");
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = boilerplateRenamer2.forChildScope();
        java.lang.Class<?> wildcardClass14 = boilerplateRenamer2.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNotNull(renamer12);
        org.junit.Assert.assertNotNull(renamer13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str7 = boilerplateRenamer2.getReplacementName("hi!");
        boolean boolean8 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(renamer13);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        java.lang.String str5 = boilerplateRenamer2.getReplacementName("arguments");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        java.lang.String str11 = boilerplateRenamer2.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = boilerplateRenamer2.forChildScope();
        boolean boolean14 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(renamer12);
        org.junit.Assert.assertNotNull(renamer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boolean boolean4 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("");
        boilerplateRenamer2.addDeclaredName("$$");
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        boolean boolean7 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("");
        boilerplateRenamer2.addDeclaredName("hi!");
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        java.lang.String str7 = inlineRenamer3.getReplacementName("arguments");
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean9 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str11 = inlineRenamer3.getReplacementName("arguments");
        boolean boolean12 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique13.enterScope(nodeTraversal14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        java.lang.String str9 = inlineRenamer3.getReplacementName("");
        inlineRenamer3.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = inlineRenamer3.forChildScope();
        java.lang.Class<?> wildcardClass14 = inlineRenamer3.getClass();
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer12);
        org.junit.Assert.assertNotNull(renamer13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean6 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        boolean boolean8 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        java.lang.String str11 = boilerplateRenamer2.getReplacementName("");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = makeDeclaredNamesUnique11.shouldTraverse(nodeTraversal12, node13, node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boilerplateRenamer2.addDeclaredName("hi!");
        java.lang.String str10 = boilerplateRenamer2.getReplacementName("arguments");
        boolean boolean11 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique12.visit(nodeTraversal13, node14, node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        java.lang.String str9 = inlineRenamer3.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = inlineRenamer3.forChildScope();
        // The following exception was thrown during execution in test generation
        try {
            renamer12.addDeclaredName("$$");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNotNull(renamer12);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        java.lang.String str9 = inlineRenamer3.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        java.lang.String str12 = renamer10.getReplacementName("hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique10 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal11 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique10.enterScope(nodeTraversal11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique15 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        java.lang.String str17 = boilerplateRenamer2.getReplacementName("$$");
        boilerplateRenamer2.addDeclaredName("hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNotNull(renamer12);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer12);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique14 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = null;
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = makeDeclaredNamesUnique14.shouldTraverse(nodeTraversal15, node16, node17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNotNull(renamer12);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str9 = inlineRenamer3.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = renamer10.forChildScope();
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNotNull(renamer11);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        java.lang.Class<?> wildcardClass10 = renamer9.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("$$");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNotNull(renamer12);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer1 = contextualRenamer0.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer2 = renamer1.forChildScope();
        boolean boolean3 = renamer1.stripConstIfReplaced();
        java.lang.Class<?> wildcardClass4 = renamer1.getClass();
        org.junit.Assert.assertNotNull(renamer1);
        org.junit.Assert.assertNotNull(renamer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boolean boolean4 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("arguments");
        java.lang.String str8 = boilerplateRenamer2.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(renamer9);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        java.lang.String str7 = inlineRenamer3.getReplacementName("arguments");
        java.lang.String str9 = inlineRenamer3.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        boolean boolean11 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str13 = inlineRenamer3.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer14 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer15 = inlineRenamer3.forChildScope();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(renamer14);
        org.junit.Assert.assertNotNull(renamer15);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", false);
        java.lang.String str5 = inlineRenamer3.getReplacementName("hi!");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = inlineRenamer3.forChildScope();
        boolean boolean9 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str11 = inlineRenamer3.getReplacementName("$$");
        java.lang.String str13 = inlineRenamer3.getReplacementName("arguments");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boolean boolean4 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        boolean boolean9 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean10 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("$$");
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(renamer12);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        java.lang.String str12 = boilerplateRenamer2.getReplacementName("arguments");
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        java.lang.String str5 = boilerplateRenamer2.getReplacementName("arguments");
        boolean boolean6 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("hi!");
        java.lang.String str10 = boilerplateRenamer2.getReplacementName("$$");
        boilerplateRenamer2.addDeclaredName("");
        java.lang.String str14 = boilerplateRenamer2.getReplacementName("$$");
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        java.lang.String str8 = renamer6.getReplacementName("$$");
        boolean boolean9 = renamer6.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = renamer6.forChildScope();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(renamer10);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer1 = contextualRenamer0.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer2 = renamer1.forChildScope();
        renamer2.addDeclaredName("arguments");
        org.junit.Assert.assertNotNull(renamer1);
        org.junit.Assert.assertNotNull(renamer2);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean6 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean7 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("arguments");
        java.lang.String str11 = boilerplateRenamer2.getReplacementName("hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer1 = contextualRenamer0.forChildScope();
        contextualRenamer0.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = contextualRenamer0.forChildScope();
        java.lang.String str6 = renamer4.getReplacementName("arguments");
        boolean boolean7 = renamer4.stripConstIfReplaced();
        renamer4.addDeclaredName("");
        org.junit.Assert.assertNotNull(renamer1);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str10 = inlineRenamer3.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique11.visit(nodeTraversal12, node13, node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean9 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        java.lang.Class<?> wildcardClass11 = inlineRenamer3.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean9 = inlineRenamer3.stripConstIfReplaced();
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("$$");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "$$", false);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str8 = inlineRenamer3.getReplacementName("$$");
        boolean boolean9 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean10 = inlineRenamer3.stripConstIfReplaced();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        inlineRenamer3.addDeclaredName("");
        inlineRenamer3.addDeclaredName("");
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        java.lang.String str5 = boilerplateRenamer2.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        boolean boolean8 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "$$");
        boolean boolean3 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("$$");
        java.lang.String str7 = boilerplateRenamer2.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        boolean boolean9 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.Class<?> wildcardClass10 = boilerplateRenamer2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str7 = boilerplateRenamer2.getReplacementName("hi!");
        boolean boolean8 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("hi!");
        boilerplateRenamer2.addDeclaredName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer14 = boilerplateRenamer2.forChildScope();
        java.lang.String str16 = boilerplateRenamer2.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer17 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(renamer13);
        org.junit.Assert.assertNotNull(renamer14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(renamer17);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        java.lang.String str4 = boilerplateRenamer2.getReplacementName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean6 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str8 = boilerplateRenamer2.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("hi!");
        boolean boolean12 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        java.lang.Class<?> wildcardClass11 = renamer10.getClass();
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer1 = contextualRenamer0.forChildScope();
        boolean boolean2 = contextualRenamer0.stripConstIfReplaced();
        boolean boolean3 = contextualRenamer0.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = contextualRenamer0.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = renamer4.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = renamer4.forChildScope();
        java.lang.Class<?> wildcardClass7 = renamer6.getClass();
        org.junit.Assert.assertNotNull(renamer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean9 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = renamer10.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = renamer11.forChildScope();
        java.lang.Class<?> wildcardClass13 = renamer11.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNotNull(renamer12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        java.lang.String str4 = boilerplateRenamer2.getReplacementName("hi!");
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("");
        java.lang.String str8 = boilerplateRenamer2.getReplacementName("");
        java.lang.String str10 = boilerplateRenamer2.getReplacementName("");
        boolean boolean11 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("");
        boilerplateRenamer2.addDeclaredName("hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "$$");
        boolean boolean3 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(renamer4);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        java.lang.String str8 = boilerplateRenamer2.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        boolean boolean11 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(renamer12);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique8 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        inlineRenamer3.addDeclaredName("");
        java.lang.String str12 = inlineRenamer3.getReplacementName("");
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        java.lang.String str9 = inlineRenamer3.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        boolean boolean11 = inlineRenamer3.stripConstIfReplaced();
        java.lang.Class<?> wildcardClass12 = inlineRenamer3.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str7 = boilerplateRenamer2.getReplacementName("hi!");
        boolean boolean8 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean9 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        boolean boolean11 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "$$", false);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str8 = inlineRenamer3.getReplacementName("$$");
        java.lang.String str10 = inlineRenamer3.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = makeDeclaredNamesUnique11.shouldTraverse(nodeTraversal12, node13, node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", false);
        java.lang.String str5 = inlineRenamer3.getReplacementName("hi!");
        java.lang.String str7 = inlineRenamer3.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = inlineRenamer3.forChildScope();
        java.lang.String str10 = inlineRenamer3.getReplacementName("hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean6 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique9 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer8);
        java.lang.Class<?> wildcardClass10 = makeDeclaredNamesUnique9.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boolean boolean7 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("$$");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boolean boolean7 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer11);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        java.lang.String str5 = boilerplateRenamer2.getReplacementName("arguments");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        java.lang.String str11 = renamer9.getReplacementName("hi!");
        java.lang.Class<?> wildcardClass12 = renamer9.getClass();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique4 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        java.lang.String str9 = inlineRenamer3.getReplacementName("hi!");
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("$$");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        java.lang.String str5 = boilerplateRenamer2.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("hi!");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str8 = inlineRenamer3.getReplacementName("hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        boolean boolean9 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        boolean boolean8 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        java.lang.String str11 = boilerplateRenamer2.getReplacementName("arguments");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        java.lang.String str5 = boilerplateRenamer2.getReplacementName("arguments");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique10 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique14 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boolean boolean15 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean6 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean7 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("arguments");
        boolean boolean10 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        java.lang.String str13 = boilerplateRenamer2.getReplacementName("$$");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        renamer6.addDeclaredName("");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boolean boolean4 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = renamer7.forChildScope();
        // The following exception was thrown during execution in test generation
        try {
            renamer7.addDeclaredName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        java.lang.String str5 = boilerplateRenamer2.getReplacementName("arguments");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique10 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        java.lang.String str15 = boilerplateRenamer2.getReplacementName("hi!");
        boolean boolean16 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str18 = boilerplateRenamer2.getReplacementName("hi!");
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boolean boolean4 = renamer3.stripConstIfReplaced();
        boolean boolean5 = renamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = renamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique7.enterScope(nodeTraversal8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        java.lang.String str4 = boilerplateRenamer2.getReplacementName("hi!");
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("");
        java.lang.String str8 = boilerplateRenamer2.getReplacementName("");
        java.lang.String str10 = boilerplateRenamer2.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = boilerplateRenamer2.forChildScope();
        java.lang.String str14 = boilerplateRenamer2.getReplacementName("arguments");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNotNull(renamer12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("");
        java.lang.String str7 = inlineRenamer3.getReplacementName("$$");
        java.lang.String str9 = inlineRenamer3.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        boolean boolean11 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str13 = inlineRenamer3.getReplacementName("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boolean boolean4 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        boolean boolean9 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean12 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str14 = boilerplateRenamer2.getReplacementName("");
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str8 = inlineRenamer3.getReplacementName("hi!");
        inlineRenamer3.addDeclaredName("");
        java.lang.String str12 = inlineRenamer3.getReplacementName("hi!");
        boolean boolean13 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str15 = inlineRenamer3.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer16 = inlineRenamer3.forChildScope();
        inlineRenamer3.addDeclaredName("");
        inlineRenamer3.addDeclaredName("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(renamer16);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", false);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("arguments");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer4);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str8 = inlineRenamer3.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = inlineRenamer3.forChildScope();
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("arguments");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(renamer9);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boilerplateRenamer2.addDeclaredName("hi!");
        java.lang.String str10 = boilerplateRenamer2.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = makeDeclaredNamesUnique12.shouldTraverse(nodeTraversal13, node14, node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(renamer11);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        java.lang.String str12 = boilerplateRenamer2.getReplacementName("");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "$$", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        java.lang.String str8 = inlineRenamer3.getReplacementName("hi!");
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean9 = inlineRenamer3.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str7 = boilerplateRenamer2.getReplacementName("hi!");
        boolean boolean8 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        java.lang.Class<?> wildcardClass12 = renamer11.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boolean boolean4 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        java.lang.String str11 = renamer9.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer9);
        // The following exception was thrown during execution in test generation
        try {
            renamer9.addDeclaredName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean9 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str11 = inlineRenamer3.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = inlineRenamer3.forChildScope();
        boolean boolean13 = renamer12.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(renamer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        java.lang.String str8 = boilerplateRenamer2.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        boolean boolean11 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "$$", false);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("arguments");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(renamer7);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("arguments");
        boilerplateRenamer2.addDeclaredName("$$");
        boilerplateRenamer2.addDeclaredName("$$");
        boilerplateRenamer2.addDeclaredName("$$");
        java.lang.String str17 = boilerplateRenamer2.getReplacementName("");
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique9 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(renamer10);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        java.lang.String str5 = boilerplateRenamer2.getReplacementName("arguments");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boolean boolean12 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean9 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique11.enterScope(nodeTraversal12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(renamer10);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        java.lang.String str5 = boilerplateRenamer2.getReplacementName("arguments");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique10 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("hi!");
        boolean boolean14 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer15 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer16 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer17 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(renamer15);
        org.junit.Assert.assertNotNull(renamer16);
        org.junit.Assert.assertNotNull(renamer17);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str8 = inlineRenamer3.getReplacementName("hi!");
        inlineRenamer3.addDeclaredName("");
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        java.lang.String str8 = boilerplateRenamer2.getReplacementName("$$");
        java.lang.String str10 = boilerplateRenamer2.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        java.lang.Class<?> wildcardClass12 = boilerplateRenamer2.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        java.lang.String str7 = inlineRenamer3.getReplacementName("arguments");
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean9 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        boolean boolean11 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = inlineRenamer3.forChildScope();
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("$$");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(renamer12);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str8 = inlineRenamer3.getReplacementName("hi!");
        inlineRenamer3.addDeclaredName("");
        inlineRenamer3.addDeclaredName("");
        boolean boolean13 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer14 = inlineRenamer3.forChildScope();
        java.lang.String str16 = inlineRenamer3.getReplacementName("arguments");
        java.lang.Class<?> wildcardClass17 = inlineRenamer3.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(renamer14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        java.lang.String str5 = boilerplateRenamer2.getReplacementName("arguments");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer8);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str8 = inlineRenamer3.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        boolean boolean11 = inlineRenamer3.stripConstIfReplaced();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str9 = inlineRenamer3.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("$$");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("");
        java.lang.String str7 = inlineRenamer3.getReplacementName("$$");
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("arguments");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = renamer7.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique9 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer7);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique9.enterScope(nodeTraversal10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str7 = boilerplateRenamer2.getReplacementName("hi!");
        boolean boolean8 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer14 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer15 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNotNull(renamer14);
        org.junit.Assert.assertNotNull(renamer15);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        java.lang.String str4 = boilerplateRenamer2.getReplacementName("hi!");
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("hi!");
        java.lang.Class<?> wildcardClass14 = boilerplateRenamer2.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = renamer9.forChildScope();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boolean boolean4 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("hi!");
        boolean boolean7 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean8 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        java.lang.String str7 = inlineRenamer3.getReplacementName("arguments");
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean9 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str11 = inlineRenamer3.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = inlineRenamer3.forChildScope();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(renamer12);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boolean boolean4 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = renamer8.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = renamer9.forChildScope();
        boolean boolean11 = renamer9.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str9 = inlineRenamer3.getReplacementName("hi!");
        java.lang.String str11 = inlineRenamer3.getReplacementName("");
        boolean boolean12 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str14 = inlineRenamer3.getReplacementName("$$");
        java.lang.String str16 = inlineRenamer3.getReplacementName("");
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boolean boolean4 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer1 = contextualRenamer0.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer2 = contextualRenamer0.forChildScope();
        java.lang.String str4 = contextualRenamer0.getReplacementName("$$");
        org.junit.Assert.assertNotNull(renamer1);
        org.junit.Assert.assertNotNull(renamer2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boilerplateRenamer2.addDeclaredName("hi!");
        java.lang.String str10 = boilerplateRenamer2.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique12.enterScope(nodeTraversal13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(renamer11);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique11.exitScope(nodeTraversal12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", false);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        boolean boolean5 = renamer4.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boolean boolean4 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("hi!");
        boilerplateRenamer2.addDeclaredName("");
        boilerplateRenamer2.addDeclaredName("");
        boilerplateRenamer2.addDeclaredName("hi!");
        java.lang.String str14 = boilerplateRenamer2.getReplacementName("$$");
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("");
        boilerplateRenamer2.addDeclaredName("");
        java.lang.String str11 = boilerplateRenamer2.getReplacementName("arguments");
        java.lang.String str13 = boilerplateRenamer2.getReplacementName("hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer16 = boilerplateRenamer2.forChildScope();
        java.lang.String str18 = boilerplateRenamer2.getReplacementName("arguments");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(renamer16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", false);
        java.lang.String str5 = inlineRenamer3.getReplacementName("hi!");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str8 = inlineRenamer3.getReplacementName("arguments");
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("$$");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str7 = boilerplateRenamer2.getReplacementName("hi!");
        boolean boolean8 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(renamer11);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        java.lang.String str9 = inlineRenamer3.getReplacementName("");
        boolean boolean10 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = inlineRenamer3.forChildScope();
        boolean boolean12 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str14 = inlineRenamer3.getReplacementName("hi!");
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        java.lang.String str4 = boilerplateRenamer2.getReplacementName("hi!");
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique11.visit(nodeTraversal12, node13, node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        java.lang.String str11 = boilerplateRenamer2.getReplacementName("");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "$$", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique4 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("arguments");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        java.lang.String str9 = inlineRenamer3.getReplacementName("");
        java.lang.String str11 = inlineRenamer3.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique12.enterScope(nodeTraversal13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boilerplateRenamer2.addDeclaredName("hi!");
        java.lang.String str10 = boilerplateRenamer2.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(renamer11);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        boolean boolean7 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("");
        boolean boolean10 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean11 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("arguments");
        boolean boolean10 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str12 = boilerplateRenamer2.getReplacementName("");
        java.lang.String str14 = boilerplateRenamer2.getReplacementName("arguments");
        java.lang.String str16 = boilerplateRenamer2.getReplacementName("");
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boilerplateRenamer2.addDeclaredName("hi!");
        java.lang.String str10 = boilerplateRenamer2.getReplacementName("arguments");
        boolean boolean11 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean16 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean17 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        java.lang.String str5 = boilerplateRenamer2.getReplacementName("arguments");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        java.lang.String str11 = boilerplateRenamer2.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer16 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique17 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique17.visit(nodeTraversal18, node19, node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(renamer12);
        org.junit.Assert.assertNotNull(renamer13);
        org.junit.Assert.assertNotNull(renamer16);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "$$", false);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str8 = inlineRenamer3.getReplacementName("$$");
        java.lang.String str10 = inlineRenamer3.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique11.exitScope(nodeTraversal12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        java.lang.String str4 = boilerplateRenamer2.getReplacementName("hi!");
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("");
        java.lang.String str8 = boilerplateRenamer2.getReplacementName("$$");
        java.lang.String str10 = boilerplateRenamer2.getReplacementName("$$");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean9 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(renamer10);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        java.lang.String str5 = boilerplateRenamer2.getReplacementName("arguments");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        java.lang.String str11 = boilerplateRenamer2.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer16 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique17 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = makeDeclaredNamesUnique17.shouldTraverse(nodeTraversal18, node19, node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(renamer12);
        org.junit.Assert.assertNotNull(renamer13);
        org.junit.Assert.assertNotNull(renamer16);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique8 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer7);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique8.enterScope(nodeTraversal9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        java.lang.String str4 = boilerplateRenamer2.getReplacementName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean6 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str8 = boilerplateRenamer2.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        java.lang.String str11 = renamer9.getReplacementName("");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        java.lang.String str7 = inlineRenamer3.getReplacementName("arguments");
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean9 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str11 = inlineRenamer3.getReplacementName("arguments");
        boolean boolean12 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str14 = inlineRenamer3.getReplacementName("hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        java.lang.String str7 = inlineRenamer3.getReplacementName("arguments");
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean9 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        boolean boolean11 = inlineRenamer3.stripConstIfReplaced();
        inlineRenamer3.addDeclaredName("");
        inlineRenamer3.addDeclaredName("");
        java.lang.String str17 = inlineRenamer3.getReplacementName("arguments");
        java.lang.Class<?> wildcardClass18 = inlineRenamer3.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        java.lang.String str7 = inlineRenamer3.getReplacementName("arguments");
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean9 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean10 = inlineRenamer3.stripConstIfReplaced();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean6 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        java.lang.Class<?> wildcardClass8 = makeDeclaredNamesUnique7.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer12);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique14 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique14.enterScope(nodeTraversal15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNotNull(renamer12);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boolean boolean4 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("hi!");
        boilerplateRenamer2.addDeclaredName("");
        boilerplateRenamer2.addDeclaredName("");
        boilerplateRenamer2.addDeclaredName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer13);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
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
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str9 = inlineRenamer3.getReplacementName("hi!");
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("arguments");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        java.lang.String str5 = boilerplateRenamer2.getReplacementName("arguments");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        java.lang.String str10 = boilerplateRenamer2.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = makeDeclaredNamesUnique11.shouldTraverse(nodeTraversal12, node13, node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("arguments");
        boolean boolean10 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("$$");
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        java.lang.String str8 = inlineRenamer3.getReplacementName("");
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("$$");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = inlineRenamer3.forChildScope();
        java.lang.String str7 = inlineRenamer3.getReplacementName("");
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("arguments");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str7 = boilerplateRenamer2.getReplacementName("hi!");
        boolean boolean8 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("hi!");
        boilerplateRenamer2.addDeclaredName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        java.lang.Class<?> wildcardClass16 = boilerplateRenamer2.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(renamer13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean9 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean10 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = inlineRenamer3.forChildScope();
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(renamer11);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("arguments");
        boilerplateRenamer2.addDeclaredName("arguments");
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("arguments");
        java.lang.String str11 = boilerplateRenamer2.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = boilerplateRenamer2.forChildScope();
        java.lang.String str15 = boilerplateRenamer2.getReplacementName("hi!");
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(renamer12);
        org.junit.Assert.assertNotNull(renamer13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("arguments");
        boolean boolean10 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean11 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str13 = boilerplateRenamer2.getReplacementName("arguments");
        boolean boolean14 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer15 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique16 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boilerplateRenamer2.addDeclaredName("");
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(renamer15);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        java.lang.String str5 = boilerplateRenamer2.getReplacementName("arguments");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        java.lang.String str11 = boilerplateRenamer2.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("hi!");
        java.lang.String str16 = boilerplateRenamer2.getReplacementName("arguments");
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(renamer12);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        java.lang.String str7 = inlineRenamer3.getReplacementName("arguments");
        java.lang.String str9 = inlineRenamer3.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique10 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal11 = null;
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique10.visit(nodeTraversal11, node12, node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("hi!");
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("$$");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        java.lang.String str8 = inlineRenamer3.getReplacementName("hi!");
        java.lang.String str10 = inlineRenamer3.getReplacementName("");
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        java.lang.Class<?> wildcardClass10 = boilerplateRenamer2.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        java.lang.String str9 = inlineRenamer3.getReplacementName("$$");
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("arguments");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        java.lang.String str5 = boilerplateRenamer2.getReplacementName("arguments");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        java.lang.String str11 = boilerplateRenamer2.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique13.enterScope(nodeTraversal14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(renamer12);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("");
        boilerplateRenamer2.addDeclaredName("");
        java.lang.String str11 = boilerplateRenamer2.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = boilerplateRenamer2.forChildScope();
        boolean boolean13 = renamer12.stripConstIfReplaced();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(renamer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        java.lang.String str4 = boilerplateRenamer2.getReplacementName("hi!");
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("");
        java.lang.String str8 = boilerplateRenamer2.getReplacementName("");
        java.lang.String str10 = boilerplateRenamer2.getReplacementName("");
        boilerplateRenamer2.addDeclaredName("hi!");
        java.lang.String str14 = boilerplateRenamer2.getReplacementName("");
        boolean boolean15 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        java.lang.String str5 = boilerplateRenamer2.getReplacementName("arguments");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique10 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        java.lang.String str15 = boilerplateRenamer2.getReplacementName("hi!");
        java.lang.String str17 = boilerplateRenamer2.getReplacementName("hi!");
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        java.lang.String str9 = inlineRenamer3.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        boolean boolean11 = inlineRenamer3.stripConstIfReplaced();
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("arguments");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str10 = inlineRenamer3.getReplacementName("$$");
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("$$");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boolean boolean4 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("hi!");
        boilerplateRenamer2.addDeclaredName("");
        boilerplateRenamer2.addDeclaredName("");
        boilerplateRenamer2.addDeclaredName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer14 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer15 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer13);
        org.junit.Assert.assertNotNull(renamer14);
        org.junit.Assert.assertNotNull(renamer15);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        java.lang.String str8 = boilerplateRenamer2.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        boolean boolean10 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique12.enterScope(nodeTraversal13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        java.lang.String str9 = inlineRenamer3.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = inlineRenamer3.forChildScope();
        renamer12.addDeclaredName("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNotNull(renamer12);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boilerplateRenamer2.addDeclaredName("hi!");
        java.lang.String str10 = boilerplateRenamer2.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = renamer12.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique14 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer13);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique14.enterScope(nodeTraversal15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNotNull(renamer12);
        org.junit.Assert.assertNotNull(renamer13);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str7 = boilerplateRenamer2.getReplacementName("hi!");
        boolean boolean8 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        java.lang.Class<?> wildcardClass11 = renamer10.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("arguments");
        boolean boolean10 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique13.visit(nodeTraversal14, node15, node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer1 = contextualRenamer0.forChildScope();
        contextualRenamer0.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = contextualRenamer0.forChildScope();
        boolean boolean5 = contextualRenamer0.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = contextualRenamer0.forChildScope();
        org.junit.Assert.assertNotNull(renamer1);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique4 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        java.lang.Class<?> wildcardClass5 = makeDeclaredNamesUnique4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        java.lang.String str5 = boilerplateRenamer2.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        java.lang.Class<?> wildcardClass7 = boilerplateRenamer2.getClass();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        java.lang.String str8 = boilerplateRenamer2.getReplacementName("$$");
        java.lang.String str10 = boilerplateRenamer2.getReplacementName("arguments");
        java.lang.String str12 = boilerplateRenamer2.getReplacementName("");
        boolean boolean13 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer16 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(renamer16);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = renamer6.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique8 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = null;
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = makeDeclaredNamesUnique8.shouldTraverse(nodeTraversal9, node10, node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        boolean boolean8 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("$$");
        boilerplateRenamer2.addDeclaredName("$$");
        java.lang.Class<?> wildcardClass13 = boilerplateRenamer2.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boilerplateRenamer2.addDeclaredName("hi!");
        java.lang.String str10 = boilerplateRenamer2.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique15 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boolean boolean16 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNotNull(renamer12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("hi!");
        boilerplateRenamer2.addDeclaredName("hi!");
        java.lang.String str8 = boilerplateRenamer2.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique12.visit(nodeTraversal13, node14, node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(renamer9);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        java.lang.String str5 = boilerplateRenamer2.getReplacementName("");
        java.lang.String str7 = boilerplateRenamer2.getReplacementName("arguments");
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str10 = inlineRenamer3.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique11.enterScope(nodeTraversal12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str7 = boilerplateRenamer2.getReplacementName("hi!");
        boolean boolean8 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        boolean boolean12 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean13 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("$$");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer1 = contextualRenamer0.forChildScope();
        boolean boolean2 = contextualRenamer0.stripConstIfReplaced();
        boolean boolean3 = contextualRenamer0.stripConstIfReplaced();
        boolean boolean4 = contextualRenamer0.stripConstIfReplaced();
        boolean boolean5 = contextualRenamer0.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = contextualRenamer0.forChildScope();
        renamer6.addDeclaredName("");
        java.lang.String str10 = renamer6.getReplacementName("");
        java.lang.Class<?> wildcardClass11 = renamer6.getClass();
        org.junit.Assert.assertNotNull(renamer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        java.lang.String str7 = inlineRenamer3.getReplacementName("arguments");
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean9 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean10 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean11 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean12 = inlineRenamer3.stripConstIfReplaced();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boolean boolean4 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        java.lang.String str12 = boilerplateRenamer2.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(renamer13);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boolean boolean4 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        java.lang.String str11 = renamer9.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer9);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer9);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique13.visit(nodeTraversal14, node15, node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = renamer9.forChildScope();
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", false);
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("arguments");
        boolean boolean10 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean11 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean12 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer14 = renamer13.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique15 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer13);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique15.enterScope(nodeTraversal16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(renamer13);
        org.junit.Assert.assertNotNull(renamer14);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNotNull(renamer4);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        java.lang.String str5 = boilerplateRenamer2.getReplacementName("arguments");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        java.lang.String str11 = renamer9.getReplacementName("hi!");
        boolean boolean12 = renamer9.stripConstIfReplaced();
        // The following exception was thrown during execution in test generation
        try {
            renamer9.addDeclaredName("$$");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str8 = inlineRenamer3.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = inlineRenamer3.forChildScope();
        java.lang.String str11 = inlineRenamer3.getReplacementName("$$");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", false);
        java.lang.String str5 = inlineRenamer3.getReplacementName("hi!");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = makeDeclaredNamesUnique7.shouldTraverse(nodeTraversal8, node9, node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        java.lang.String str4 = boilerplateRenamer2.getReplacementName("$$");
        boilerplateRenamer2.addDeclaredName("");
        java.lang.String str8 = boilerplateRenamer2.getReplacementName("arguments");
        java.lang.String str10 = boilerplateRenamer2.getReplacementName("");
        boolean boolean11 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean12 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str14 = boilerplateRenamer2.getReplacementName("$$");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        java.lang.String str7 = boilerplateRenamer2.getReplacementName("$$");
        boilerplateRenamer2.addDeclaredName("hi!");
        boolean boolean10 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boolean boolean4 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("hi!");
        boilerplateRenamer2.addDeclaredName("");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique11.visit(nodeTraversal12, node13, node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        boolean boolean8 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        java.lang.Class<?> wildcardClass10 = boilerplateRenamer2.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str8 = inlineRenamer3.getReplacementName("hi!");
        inlineRenamer3.addDeclaredName("");
        inlineRenamer3.addDeclaredName("");
        java.lang.String str14 = inlineRenamer3.getReplacementName("arguments");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique8 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer7);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = null;
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = makeDeclaredNamesUnique8.shouldTraverse(nodeTraversal9, node10, node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(renamer7);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean9 = inlineRenamer3.stripConstIfReplaced();
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("$$");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boilerplateRenamer2.addDeclaredName("hi!");
        java.lang.String str10 = boilerplateRenamer2.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = renamer12.forChildScope();
        renamer12.addDeclaredName("");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNotNull(renamer12);
        org.junit.Assert.assertNotNull(renamer13);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        java.lang.String str5 = boilerplateRenamer2.getReplacementName("arguments");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique10 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal11 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique10.exitScope(nodeTraversal11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        java.lang.String str5 = boilerplateRenamer2.getReplacementName("$$");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        boolean boolean7 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("");
        boolean boolean10 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", false);
        java.lang.String str5 = inlineRenamer3.getReplacementName("hi!");
        java.lang.String str7 = inlineRenamer3.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = inlineRenamer3.forChildScope();
        java.lang.String str10 = inlineRenamer3.getReplacementName("hi!");
        java.lang.String str12 = inlineRenamer3.getReplacementName("hi!");
        boolean boolean13 = inlineRenamer3.stripConstIfReplaced();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("$$");
        boilerplateRenamer2.addDeclaredName("$$");
        java.lang.String str13 = boilerplateRenamer2.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer14 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(renamer14);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("hi!");
        boilerplateRenamer2.addDeclaredName("hi!");
        java.lang.String str8 = boilerplateRenamer2.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = boilerplateRenamer2.forChildScope();
        java.lang.Class<?> wildcardClass13 = renamer12.getClass();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        java.lang.String str4 = boilerplateRenamer2.getReplacementName("$$");
        boilerplateRenamer2.addDeclaredName("");
        java.lang.String str8 = boilerplateRenamer2.getReplacementName("arguments");
        java.lang.String str10 = boilerplateRenamer2.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = boilerplateRenamer2.forChildScope();
        boolean boolean13 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.Class<?> wildcardClass14 = boilerplateRenamer2.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNotNull(renamer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boilerplateRenamer2.addDeclaredName("hi!");
        java.lang.String str10 = boilerplateRenamer2.getReplacementName("arguments");
        boolean boolean11 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("hi!");
        java.lang.String str15 = boilerplateRenamer2.getReplacementName("");
        boolean boolean16 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "$$");
        boolean boolean3 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("$$");
        java.lang.String str7 = boilerplateRenamer2.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        java.lang.Class<?> wildcardClass9 = boilerplateRenamer2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str8 = inlineRenamer3.getReplacementName("hi!");
        inlineRenamer3.addDeclaredName("");
        java.lang.String str12 = inlineRenamer3.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = inlineRenamer3.forChildScope();
        boolean boolean14 = inlineRenamer3.stripConstIfReplaced();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(renamer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("arguments");
        boolean boolean10 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean11 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean12 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer14 = renamer13.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique15 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer13);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique15.visit(nodeTraversal16, node17, node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(renamer13);
        org.junit.Assert.assertNotNull(renamer14);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "$$", false);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("$$");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        java.lang.String str9 = inlineRenamer3.getReplacementName("hi!");
        boolean boolean10 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = renamer11.forChildScope();
        java.lang.Class<?> wildcardClass13 = renamer11.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNotNull(renamer12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        boolean boolean7 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = renamer10.forChildScope();
        // The following exception was thrown during execution in test generation
        try {
            renamer11.addDeclaredName("$$");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNotNull(renamer11);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boilerplateRenamer2.addDeclaredName("hi!");
        java.lang.String str10 = boilerplateRenamer2.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer14 = boilerplateRenamer2.forChildScope();
        boolean boolean15 = renamer14.stripConstIfReplaced();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNotNull(renamer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str7 = boilerplateRenamer2.getReplacementName("hi!");
        boolean boolean8 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        java.lang.Class<?> wildcardClass12 = renamer11.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        java.lang.String str4 = boilerplateRenamer2.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("hi!");
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("arguments");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("arguments");
        boolean boolean10 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = boilerplateRenamer2.forChildScope();
        java.lang.String str15 = boilerplateRenamer2.getReplacementName("");
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(renamer13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("hi!");
        boilerplateRenamer2.addDeclaredName("hi!");
        boilerplateRenamer2.addDeclaredName("$$");
        boolean boolean9 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean10 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(renamer11);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("hi!");
        boilerplateRenamer2.addDeclaredName("hi!");
        java.lang.String str8 = boilerplateRenamer2.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = boilerplateRenamer2.forChildScope();
        boolean boolean14 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", false);
        java.lang.String str5 = inlineRenamer3.getReplacementName("hi!");
        java.lang.String str7 = inlineRenamer3.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = inlineRenamer3.forChildScope();
        java.lang.String str11 = renamer9.getReplacementName("hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        inlineRenamer3.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = inlineRenamer3.forChildScope();
        boolean boolean13 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer14 = inlineRenamer3.forChildScope();
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNotNull(renamer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(renamer14);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("$$");
        boilerplateRenamer2.addDeclaredName("hi!");
        boilerplateRenamer2.addDeclaredName("arguments");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        java.lang.Class<?> wildcardClass11 = boilerplateRenamer2.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        java.lang.String str9 = inlineRenamer3.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = inlineRenamer3.forChildScope();
        java.lang.String str13 = renamer11.getReplacementName("arguments");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boolean boolean4 = renamer3.stripConstIfReplaced();
        java.lang.String str6 = renamer3.getReplacementName("");
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "$$", false);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = inlineRenamer3.forChildScope();
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        java.lang.String str4 = boilerplateRenamer2.getReplacementName("hi!");
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("");
        java.lang.String str8 = boilerplateRenamer2.getReplacementName("");
        java.lang.String str10 = boilerplateRenamer2.getReplacementName("");
        boolean boolean11 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean12 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean13 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", false);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "$$", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique4 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique9 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = makeDeclaredNamesUnique9.shouldTraverse(nodeTraversal10, node11, node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        boolean boolean7 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        java.lang.String str11 = boilerplateRenamer2.getReplacementName("hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str7 = boilerplateRenamer2.getReplacementName("hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean10 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean11 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "$$");
        boolean boolean3 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("$$");
        java.lang.String str7 = boilerplateRenamer2.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("$$");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(renamer8);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        java.lang.String str9 = inlineRenamer3.getReplacementName("hi!");
        java.lang.String str11 = inlineRenamer3.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer14 = renamer13.forChildScope();
        java.lang.String str16 = renamer13.getReplacementName("$$");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(renamer12);
        org.junit.Assert.assertNotNull(renamer13);
        org.junit.Assert.assertNotNull(renamer14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        java.lang.String str4 = boilerplateRenamer2.getReplacementName("$$");
        boilerplateRenamer2.addDeclaredName("");
        java.lang.String str8 = boilerplateRenamer2.getReplacementName("arguments");
        java.lang.String str10 = boilerplateRenamer2.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = boilerplateRenamer2.forChildScope();
        java.lang.String str15 = boilerplateRenamer2.getReplacementName("");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNotNull(renamer12);
        org.junit.Assert.assertNotNull(renamer13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "$$", false);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str8 = inlineRenamer3.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNotNull(renamer11);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        java.lang.String str5 = boilerplateRenamer2.getReplacementName("arguments");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        boilerplateRenamer2.addDeclaredName("$$");
        boilerplateRenamer2.addDeclaredName("");
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique9 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique9.exitScope(nodeTraversal10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boilerplateRenamer2.addDeclaredName("hi!");
        java.lang.String str10 = boilerplateRenamer2.getReplacementName("arguments");
        boilerplateRenamer2.addDeclaredName("$$");
        boilerplateRenamer2.addDeclaredName("");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean6 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("$$");
        boilerplateRenamer2.addDeclaredName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(renamer11);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str8 = inlineRenamer3.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        java.lang.String str12 = inlineRenamer3.getReplacementName("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("arguments");
        boolean boolean10 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean11 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str13 = boilerplateRenamer2.getReplacementName("arguments");
        boolean boolean14 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer15 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique16 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boilerplateRenamer2.addDeclaredName("hi!");
        java.lang.String str20 = boilerplateRenamer2.getReplacementName("$$");
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(renamer15);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str9 = inlineRenamer3.getReplacementName("");
        java.lang.String str11 = inlineRenamer3.getReplacementName("$$");
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", false);
        java.lang.String str5 = inlineRenamer3.getReplacementName("hi!");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("$$");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        java.lang.String str5 = boilerplateRenamer2.getReplacementName("arguments");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("$$");
        boolean boolean13 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str8 = inlineRenamer3.getReplacementName("$$");
        boolean boolean9 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        boolean boolean11 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str13 = inlineRenamer3.getReplacementName("hi!");
        boolean boolean14 = inlineRenamer3.stripConstIfReplaced();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boilerplateRenamer2.addDeclaredName("hi!");
        java.lang.String str10 = boilerplateRenamer2.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        boolean boolean12 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean13 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("arguments");
        boilerplateRenamer2.addDeclaredName("$$");
        java.lang.Class<?> wildcardClass18 = boilerplateRenamer2.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("arguments");
        boolean boolean10 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean11 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str13 = boilerplateRenamer2.getReplacementName("arguments");
        boolean boolean14 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str16 = boilerplateRenamer2.getReplacementName("");
        boolean boolean17 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boolean boolean4 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str7 = boilerplateRenamer2.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique8 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boilerplateRenamer2.addDeclaredName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        boolean boolean12 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        java.lang.String str4 = boilerplateRenamer2.getReplacementName("hi!");
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        java.lang.String str12 = boilerplateRenamer2.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer14 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(renamer13);
        org.junit.Assert.assertNotNull(renamer14);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = renamer10.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer11);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique12.exitScope(nodeTraversal13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNotNull(renamer11);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = makeDeclaredNamesUnique13.shouldTraverse(nodeTraversal14, node15, node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNotNull(renamer12);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("");
        java.lang.String str7 = inlineRenamer3.getReplacementName("$$");
        java.lang.String str9 = inlineRenamer3.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        boolean boolean11 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean12 = inlineRenamer3.stripConstIfReplaced();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        boolean boolean8 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("$$");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }
}

