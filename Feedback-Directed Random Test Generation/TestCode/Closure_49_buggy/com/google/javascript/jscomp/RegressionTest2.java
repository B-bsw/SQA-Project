package com.google.javascript.jscomp;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

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
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "$$", false);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = inlineRenamer3.forChildScope();
        java.lang.String str7 = inlineRenamer3.getReplacementName("$$");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        java.lang.String str9 = inlineRenamer3.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        boolean boolean11 = inlineRenamer3.stripConstIfReplaced();
        inlineRenamer3.addDeclaredName("");
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        java.lang.String str8 = inlineRenamer3.getReplacementName("hi!");
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("$$");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        java.lang.String str9 = inlineRenamer3.getReplacementName("");
        boolean boolean10 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean11 = inlineRenamer3.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", false);
        java.lang.String str5 = inlineRenamer3.getReplacementName("hi!");
        java.lang.String str7 = inlineRenamer3.getReplacementName("arguments");
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
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(renamer8);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        java.lang.String str5 = boilerplateRenamer2.getReplacementName("arguments");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        java.lang.String str10 = boilerplateRenamer2.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        java.lang.Class<?> wildcardClass12 = boilerplateRenamer2.getClass();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("$$");
        java.lang.String str10 = boilerplateRenamer2.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique14 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique14.enterScope(nodeTraversal15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNotNull(renamer12);
        org.junit.Assert.assertNotNull(renamer13);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        java.lang.String str7 = inlineRenamer3.getReplacementName("arguments");
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str10 = inlineRenamer3.getReplacementName("");
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("arguments");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "$$");
        boolean boolean3 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("$$");
        java.lang.String str7 = boilerplateRenamer2.getReplacementName("arguments");
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("hi!");
        boolean boolean10 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNotNull(renamer12);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "$$", false);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str8 = inlineRenamer3.getReplacementName("$$");
        java.lang.String str10 = inlineRenamer3.getReplacementName("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str9 = inlineRenamer3.getReplacementName("hi!");
        java.lang.String str11 = inlineRenamer3.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
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
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean9 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str11 = inlineRenamer3.getReplacementName("$$");
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
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer1 = contextualRenamer0.forChildScope();
        boolean boolean2 = contextualRenamer0.stripConstIfReplaced();
        boolean boolean3 = contextualRenamer0.stripConstIfReplaced();
        boolean boolean4 = contextualRenamer0.stripConstIfReplaced();
        boolean boolean5 = contextualRenamer0.stripConstIfReplaced();
        java.lang.String str7 = contextualRenamer0.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = contextualRenamer0.forChildScope();
        contextualRenamer0.addDeclaredName("$$");
        org.junit.Assert.assertNotNull(renamer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(renamer8);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
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
        java.lang.String str18 = boilerplateRenamer2.getReplacementName("");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(renamer16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        java.lang.String str5 = boilerplateRenamer2.getReplacementName("arguments");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer14 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer14);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        java.lang.String str5 = boilerplateRenamer2.getReplacementName("arguments");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique10 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNotNull(renamer12);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = inlineRenamer3.forChildScope();
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("arguments");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer6);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        java.lang.String str9 = inlineRenamer3.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        boolean boolean11 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str13 = inlineRenamer3.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer14 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique15 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique15.enterScope(nodeTraversal16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(renamer14);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        java.lang.String str12 = boilerplateRenamer2.getReplacementName("arguments");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
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
        java.lang.Class<?> wildcardClass14 = makeDeclaredNamesUnique13.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNotNull(renamer12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
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
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer16 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique17 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer16);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(renamer16);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        java.lang.String str7 = inlineRenamer3.getReplacementName("arguments");
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean9 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        boolean boolean11 = inlineRenamer3.stripConstIfReplaced();
        inlineRenamer3.addDeclaredName("");
        boolean boolean14 = inlineRenamer3.stripConstIfReplaced();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str10 = inlineRenamer3.getReplacementName("$$");
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
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        java.lang.String str8 = boilerplateRenamer2.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(renamer9);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boilerplateRenamer2.addDeclaredName("hi!");
        java.lang.String str10 = boilerplateRenamer2.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = boilerplateRenamer2.forChildScope();
        boolean boolean13 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNotNull(renamer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("arguments");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        java.lang.String str7 = inlineRenamer3.getReplacementName("arguments");
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean9 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        boolean boolean11 = inlineRenamer3.stripConstIfReplaced();
        java.lang.Class<?> wildcardClass12 = inlineRenamer3.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boolean boolean8 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(renamer9);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean6 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique9 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer8);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = renamer8.forChildScope();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer10);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        inlineRenamer3.addDeclaredName("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        java.lang.String str7 = inlineRenamer3.getReplacementName("arguments");
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean9 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        boolean boolean11 = inlineRenamer3.stripConstIfReplaced();
        inlineRenamer3.addDeclaredName("");
        java.lang.Class<?> wildcardClass14 = inlineRenamer3.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boolean boolean4 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique8 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer7);
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
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer7);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str8 = inlineRenamer3.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = inlineRenamer3.forChildScope();
        java.lang.String str11 = inlineRenamer3.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique12.enterScope(nodeTraversal13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
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
        org.junit.Assert.assertNotNull(renamer12);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = renamer6.forChildScope();
        java.lang.Class<?> wildcardClass8 = renamer6.getClass();
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str7 = boilerplateRenamer2.getReplacementName("hi!");
        boolean boolean8 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(renamer9);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        java.lang.String str8 = boilerplateRenamer2.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        boolean boolean10 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean11 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(renamer12);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        java.lang.String str4 = boilerplateRenamer2.getReplacementName("$$");
        boilerplateRenamer2.addDeclaredName("");
        java.lang.String str8 = boilerplateRenamer2.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boolean boolean4 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        boolean boolean9 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean10 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(renamer11);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique9 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer8);
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
        org.junit.Assert.assertNotNull(renamer8);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer1 = contextualRenamer0.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer2 = contextualRenamer0.forChildScope();
        renamer2.addDeclaredName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = renamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer1);
        org.junit.Assert.assertNotNull(renamer2);
        org.junit.Assert.assertNotNull(renamer5);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean6 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique9 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique9.enterScope(nodeTraversal10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(renamer8);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
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
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer19 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(renamer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(renamer19);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "$$", false);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str6 = inlineRenamer3.getReplacementName("arguments");
        java.lang.String str8 = inlineRenamer3.getReplacementName("arguments");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boilerplateRenamer2.addDeclaredName("hi!");
        java.lang.String str10 = boilerplateRenamer2.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        java.lang.String str13 = boilerplateRenamer2.getReplacementName("$$");
        java.lang.String str15 = boilerplateRenamer2.getReplacementName("");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("arguments");
        boolean boolean10 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean11 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean12 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer15 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(renamer15);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
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

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        java.lang.String str9 = inlineRenamer3.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = inlineRenamer3.forChildScope();
        boolean boolean13 = renamer12.stripConstIfReplaced();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNotNull(renamer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str8 = inlineRenamer3.getReplacementName("hi!");
        inlineRenamer3.addDeclaredName("");
        inlineRenamer3.addDeclaredName("");
        boolean boolean13 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean14 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean15 = inlineRenamer3.stripConstIfReplaced();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("");
        boilerplateRenamer2.addDeclaredName("");
        java.lang.String str11 = boilerplateRenamer2.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(renamer12);
        org.junit.Assert.assertNotNull(renamer13);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str8 = inlineRenamer3.getReplacementName("hi!");
        inlineRenamer3.addDeclaredName("");
        inlineRenamer3.addDeclaredName("");
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("$$");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("$$");
        boilerplateRenamer2.addDeclaredName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer12);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer5);
        boolean boolean7 = renamer5.stripConstIfReplaced();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
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
        boolean boolean12 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        java.lang.String str4 = boilerplateRenamer2.getReplacementName("hi!");
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("");
        java.lang.String str8 = boilerplateRenamer2.getReplacementName("");
        java.lang.String str10 = boilerplateRenamer2.getReplacementName("");
        boolean boolean11 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean14 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str16 = boilerplateRenamer2.getReplacementName("hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        java.lang.String str5 = boilerplateRenamer2.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = renamer6.forChildScope();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
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
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer16 = boilerplateRenamer2.forChildScope();
        java.lang.String str18 = boilerplateRenamer2.getReplacementName("hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(renamer16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
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
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer14 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(renamer12);
        org.junit.Assert.assertNotNull(renamer13);
        org.junit.Assert.assertNotNull(renamer14);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        java.lang.String str9 = inlineRenamer3.getReplacementName("hi!");
        boolean boolean10 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean11 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str13 = inlineRenamer3.getReplacementName("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean9 = inlineRenamer3.stripConstIfReplaced();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = inlineRenamer3.forChildScope();
        java.lang.String str8 = inlineRenamer3.getReplacementName("arguments");
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
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        java.lang.String str9 = renamer7.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = renamer7.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer7);
        // The following exception was thrown during execution in test generation
        try {
            renamer7.addDeclaredName("$$");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = renamer7.forChildScope();
        java.lang.Class<?> wildcardClass9 = renamer7.getClass();
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean9 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        // The following exception was thrown during execution in test generation
        try {
            renamer10.addDeclaredName("arguments");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(renamer10);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        java.lang.String str9 = inlineRenamer3.getReplacementName("hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("hi!");
        boolean boolean10 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer11);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(renamer11);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boolean boolean4 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique8 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer7);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique9 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer7);
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
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boolean boolean4 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        java.lang.String str11 = renamer9.getReplacementName("arguments");
        java.lang.String str13 = renamer9.getReplacementName("hi!");
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("$$");
        java.lang.String str10 = boilerplateRenamer2.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNotNull(renamer12);
        org.junit.Assert.assertNotNull(renamer13);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean9 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = inlineRenamer3.forChildScope();
        java.lang.String str13 = renamer11.getReplacementName("arguments");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        java.lang.String str7 = inlineRenamer3.getReplacementName("arguments");
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str10 = inlineRenamer3.getReplacementName("");
        java.lang.String str12 = inlineRenamer3.getReplacementName("hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
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
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str8 = inlineRenamer3.getReplacementName("hi!");
        inlineRenamer3.addDeclaredName("");
        java.lang.String str12 = inlineRenamer3.getReplacementName("hi!");
        boolean boolean13 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean14 = inlineRenamer3.stripConstIfReplaced();
        java.lang.Class<?> wildcardClass15 = inlineRenamer3.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("hi!");
        boilerplateRenamer2.addDeclaredName("hi!");
        boilerplateRenamer2.addDeclaredName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique10 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer9);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal11 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique10.exitScope(nodeTraversal11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer9);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("arguments");
        boolean boolean10 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("");
        java.lang.String str14 = boilerplateRenamer2.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer15 = boilerplateRenamer2.forChildScope();
        java.lang.String str17 = renamer15.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer18 = renamer15.forChildScope();
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(renamer15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(renamer18);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("");
        boilerplateRenamer2.addDeclaredName("");
        java.lang.String str11 = boilerplateRenamer2.getReplacementName("arguments");
        java.lang.String str13 = boilerplateRenamer2.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer14 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(renamer14);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str7 = boilerplateRenamer2.getReplacementName("hi!");
        boolean boolean8 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("hi!");
        boilerplateRenamer2.addDeclaredName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(renamer13);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
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
            makeDeclaredNamesUnique11.visit(nodeTraversal12, node13, node14);
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
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        java.lang.String str7 = inlineRenamer3.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique9 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer8);
        java.lang.Class<?> wildcardClass10 = makeDeclaredNamesUnique9.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boolean boolean7 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(renamer10);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        java.lang.String str7 = inlineRenamer3.getReplacementName("arguments");
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean9 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        boolean boolean11 = inlineRenamer3.stripConstIfReplaced();
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("hi!");
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
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("hi!");
        boilerplateRenamer2.addDeclaredName("hi!");
        boilerplateRenamer2.addDeclaredName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        boolean boolean10 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.Class<?> wildcardClass11 = boilerplateRenamer2.getClass();
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("$$");
        java.lang.String str10 = boilerplateRenamer2.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique14 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique15 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
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
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNotNull(renamer12);
        org.junit.Assert.assertNotNull(renamer13);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        java.lang.String str5 = boilerplateRenamer2.getReplacementName("");
        boilerplateRenamer2.addDeclaredName("$$");
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        java.lang.String str13 = boilerplateRenamer2.getReplacementName("$$");
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = inlineRenamer3.forChildScope();
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("$$");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer6);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        java.lang.String str4 = boilerplateRenamer2.getReplacementName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean6 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean7 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        java.lang.String str4 = boilerplateRenamer2.getReplacementName("hi!");
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        boolean boolean8 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        java.lang.String str11 = renamer9.getReplacementName("$$");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
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
        boolean boolean18 = inlineRenamer3.stripConstIfReplaced();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        java.lang.String str4 = boilerplateRenamer2.getReplacementName("");
        boilerplateRenamer2.addDeclaredName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique7.exitScope(nodeTraversal8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
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
        java.lang.String str18 = renamer16.getReplacementName("");
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(renamer15);
        org.junit.Assert.assertNotNull(renamer16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
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
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", false);
        java.lang.String str5 = inlineRenamer3.getReplacementName("hi!");
        java.lang.String str7 = inlineRenamer3.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = inlineRenamer3.forChildScope();
        java.lang.String str10 = inlineRenamer3.getReplacementName("hi!");
        boolean boolean11 = inlineRenamer3.stripConstIfReplaced();
        inlineRenamer3.addDeclaredName("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        java.lang.String str5 = boilerplateRenamer2.getReplacementName("arguments");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        java.lang.String str11 = boilerplateRenamer2.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = boilerplateRenamer2.forChildScope();
        boolean boolean13 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer14 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(renamer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(renamer14);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
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
            makeDeclaredNamesUnique8.enterScope(nodeTraversal9);
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
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("$$");
        java.lang.String str10 = boilerplateRenamer2.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique14 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique14.exitScope(nodeTraversal15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNotNull(renamer12);
        org.junit.Assert.assertNotNull(renamer13);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        java.lang.String str10 = boilerplateRenamer2.getReplacementName("arguments");
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = renamer10.forChildScope();
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNotNull(renamer11);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", false);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = inlineRenamer3.forChildScope();
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str7 = boilerplateRenamer2.getReplacementName("hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean10 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(renamer11);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique9 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer8);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique4 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("arguments");
        boilerplateRenamer2.addDeclaredName("hi!");
        org.junit.Assert.assertNotNull(renamer3);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        boolean boolean9 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.Class<?> wildcardClass10 = boilerplateRenamer2.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean9 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = inlineRenamer3.forChildScope();
        inlineRenamer3.addDeclaredName("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNotNull(renamer11);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        java.lang.String str5 = boilerplateRenamer2.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        java.lang.String str8 = inlineRenamer3.getReplacementName("hi!");
        boolean boolean9 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique10 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal11 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique10.enterScope(nodeTraversal11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str9 = inlineRenamer3.getReplacementName("hi!");
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
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        java.lang.String str5 = boilerplateRenamer2.getReplacementName("arguments");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        java.lang.String str10 = boilerplateRenamer2.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        java.lang.Class<?> wildcardClass12 = renamer11.getClass();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
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
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("hi!");
        boolean boolean10 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        boolean boolean9 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean10 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("arguments");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer1 = contextualRenamer0.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer2 = contextualRenamer0.forChildScope();
        java.lang.String str4 = contextualRenamer0.getReplacementName("hi!");
        contextualRenamer0.addDeclaredName("");
        java.lang.String str8 = contextualRenamer0.getReplacementName("");
        boolean boolean9 = contextualRenamer0.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer1);
        org.junit.Assert.assertNotNull(renamer2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        java.lang.String str4 = boilerplateRenamer2.getReplacementName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("$$");
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("");
        boilerplateRenamer2.addDeclaredName("");
        java.lang.String str11 = boilerplateRenamer2.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique14 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer13);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique14.exitScope(nodeTraversal15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(renamer12);
        org.junit.Assert.assertNotNull(renamer13);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
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
            boolean boolean16 = makeDeclaredNamesUnique12.shouldTraverse(nodeTraversal13, node14, node15);
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
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        java.lang.String str4 = boilerplateRenamer2.getReplacementName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("$$");
        boilerplateRenamer2.addDeclaredName("");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNotNull(renamer6);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str9 = inlineRenamer3.getReplacementName("hi!");
        java.lang.String str11 = inlineRenamer3.getReplacementName("");
        boolean boolean12 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = inlineRenamer3.forChildScope();
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(renamer13);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer5);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean6 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean7 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
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
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer16 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer17 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer18 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNotNull(renamer12);
        org.junit.Assert.assertNotNull(renamer16);
        org.junit.Assert.assertNotNull(renamer17);
        org.junit.Assert.assertNotNull(renamer18);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        inlineRenamer3.addDeclaredName("");
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
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "$$", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer4);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        java.lang.String str7 = inlineRenamer3.getReplacementName("arguments");
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean9 = inlineRenamer3.stripConstIfReplaced();
        inlineRenamer3.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = inlineRenamer3.forChildScope();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(renamer12);
        org.junit.Assert.assertNotNull(renamer13);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = makeDeclaredNamesUnique3.shouldTraverse(nodeTraversal4, node5, node6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("");
        java.lang.String str7 = inlineRenamer3.getReplacementName("$$");
        java.lang.String str9 = inlineRenamer3.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique10 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = inlineRenamer3.forChildScope();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNotNull(renamer12);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        boolean boolean7 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("$$");
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
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
            makeDeclaredNamesUnique15.exitScope(nodeTraversal16);
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
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str8 = inlineRenamer3.getReplacementName("$$");
        boolean boolean9 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        boolean boolean11 = inlineRenamer3.stripConstIfReplaced();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", false);
        java.lang.String str5 = inlineRenamer3.getReplacementName("hi!");
        java.lang.String str7 = inlineRenamer3.getReplacementName("arguments");
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
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(renamer8);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique9 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer8);
        java.lang.String str11 = renamer8.getReplacementName("arguments");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
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
            makeDeclaredNamesUnique6.visit(nodeTraversal7, node8, node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        java.lang.String str8 = inlineRenamer3.getReplacementName("hi!");
        boolean boolean9 = inlineRenamer3.stripConstIfReplaced();
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
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("hi!");
        boilerplateRenamer2.addDeclaredName("hi!");
        java.lang.String str8 = boilerplateRenamer2.getReplacementName("arguments");
        boolean boolean9 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boolean boolean4 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        java.lang.String str8 = renamer6.getReplacementName("");
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boolean boolean4 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        java.lang.String str9 = inlineRenamer3.getReplacementName("");
        java.lang.String str11 = inlineRenamer3.getReplacementName("");
        boolean boolean12 = inlineRenamer3.stripConstIfReplaced();
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
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boolean boolean4 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        boolean boolean9 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str11 = boilerplateRenamer2.getReplacementName("hi!");
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        java.lang.String str5 = boilerplateRenamer2.getReplacementName("arguments");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer14 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer14);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        java.lang.String str9 = inlineRenamer3.getReplacementName("");
        java.lang.String str11 = inlineRenamer3.getReplacementName("");
        boolean boolean12 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean13 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str15 = inlineRenamer3.getReplacementName("hi!");
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        boolean boolean7 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(renamer10);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str8 = inlineRenamer3.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = inlineRenamer3.forChildScope();
        java.lang.String str11 = inlineRenamer3.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = inlineRenamer3.forChildScope();
        boolean boolean13 = inlineRenamer3.stripConstIfReplaced();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(renamer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
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
            boolean boolean15 = makeDeclaredNamesUnique11.shouldTraverse(nodeTraversal12, node13, node14);
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
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("arguments");
        boolean boolean10 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer16 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(renamer13);
        org.junit.Assert.assertNotNull(renamer16);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boolean boolean7 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(renamer10);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("hi!");
        boilerplateRenamer2.addDeclaredName("hi!");
        boilerplateRenamer2.addDeclaredName("$$");
        boolean boolean9 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean10 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str12 = boilerplateRenamer2.getReplacementName("hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str9 = inlineRenamer3.getReplacementName("arguments");
        inlineRenamer3.addDeclaredName("");
        java.lang.Class<?> wildcardClass12 = inlineRenamer3.getClass();
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        boolean boolean11 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        java.lang.String str11 = boilerplateRenamer2.getReplacementName("$$");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boolean boolean4 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("arguments");
        java.lang.String str8 = boilerplateRenamer2.getReplacementName("arguments");
        boilerplateRenamer2.addDeclaredName("");
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "$$", false);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = inlineRenamer3.forChildScope();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(renamer5);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("$$");
        boilerplateRenamer2.addDeclaredName("$$");
        boilerplateRenamer2.addDeclaredName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer14 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer14);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str9 = inlineRenamer3.getReplacementName("");
        boolean boolean10 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean11 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str13 = inlineRenamer3.getReplacementName("arguments");
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        java.lang.String str4 = boilerplateRenamer2.getReplacementName("hi!");
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("");
        java.lang.String str8 = boilerplateRenamer2.getReplacementName("");
        java.lang.String str10 = boilerplateRenamer2.getReplacementName("");
        boilerplateRenamer2.addDeclaredName("hi!");
        boolean boolean13 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        java.lang.String str9 = inlineRenamer3.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        java.lang.String str12 = inlineRenamer3.getReplacementName("hi!");
        java.lang.Class<?> wildcardClass13 = inlineRenamer3.getClass();
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        boolean boolean8 = renamer7.stripConstIfReplaced();
        java.lang.Class<?> wildcardClass9 = renamer7.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        java.lang.String str8 = inlineRenamer3.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = inlineRenamer3.forChildScope();
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("arguments");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(renamer9);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        boolean boolean8 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("$$");
        boilerplateRenamer2.addDeclaredName("arguments");
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = inlineRenamer3.forChildScope();
        java.lang.String str8 = inlineRenamer3.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique9 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        java.lang.Class<?> wildcardClass10 = inlineRenamer3.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer1 = contextualRenamer0.forChildScope();
        boolean boolean2 = contextualRenamer0.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) contextualRenamer0);
        boolean boolean4 = contextualRenamer0.stripConstIfReplaced();
        contextualRenamer0.addDeclaredName("arguments");
        org.junit.Assert.assertNotNull(renamer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        java.lang.String str7 = inlineRenamer3.getReplacementName("arguments");
        java.lang.String str9 = inlineRenamer3.getReplacementName("");
        java.lang.String str11 = inlineRenamer3.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = inlineRenamer3.forChildScope();
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(renamer12);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
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
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer15 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer16 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique17 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNotNull(renamer12);
        org.junit.Assert.assertNotNull(renamer15);
        org.junit.Assert.assertNotNull(renamer16);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        java.lang.String str7 = inlineRenamer3.getReplacementName("arguments");
        java.lang.String str9 = inlineRenamer3.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        boolean boolean11 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean12 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str14 = inlineRenamer3.getReplacementName("arguments");
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
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        boolean boolean7 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        java.lang.String str10 = boilerplateRenamer2.getReplacementName("arguments");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boolean boolean4 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer1 = contextualRenamer0.forChildScope();
        boolean boolean2 = contextualRenamer0.stripConstIfReplaced();
        boolean boolean3 = contextualRenamer0.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = contextualRenamer0.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = contextualRenamer0.forChildScope();
        boolean boolean6 = contextualRenamer0.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        boolean boolean7 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique10 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        java.lang.String str12 = boilerplateRenamer2.getReplacementName("");
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boolean boolean4 = renamer3.stripConstIfReplaced();
        boolean boolean5 = renamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = renamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer3);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique8 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer3);
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
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "$$", false);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = inlineRenamer3.forChildScope();
        java.lang.String str7 = inlineRenamer3.getReplacementName("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("arguments");
        boilerplateRenamer2.addDeclaredName("arguments");
        boilerplateRenamer2.addDeclaredName("");
        boilerplateRenamer2.addDeclaredName("$$");
        boilerplateRenamer2.addDeclaredName("arguments");
        boilerplateRenamer2.addDeclaredName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer16 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNotNull(renamer16);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("arguments");
        boilerplateRenamer2.addDeclaredName("$$");
        boilerplateRenamer2.addDeclaredName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer14 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer14);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        java.lang.String str8 = inlineRenamer3.getReplacementName("");
        boolean boolean9 = inlineRenamer3.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("arguments");
        boolean boolean10 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean11 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean12 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("arguments");
        boolean boolean15 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        java.lang.String str7 = inlineRenamer3.getReplacementName("$$");
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        boilerplateRenamer2.addDeclaredName("arguments");
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str7 = inlineRenamer3.getReplacementName("");
        java.lang.String str9 = inlineRenamer3.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique10 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        boolean boolean11 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str13 = inlineRenamer3.getReplacementName("hi!");
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        boolean boolean8 = renamer7.stripConstIfReplaced();
        boolean boolean9 = renamer7.stripConstIfReplaced();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str7 = boilerplateRenamer2.getReplacementName("hi!");
        boolean boolean8 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("hi!");
        boolean boolean11 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean12 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = boilerplateRenamer2.forChildScope();
        boolean boolean14 = renamer13.stripConstIfReplaced();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(renamer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        java.lang.String str12 = boilerplateRenamer2.getReplacementName("hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        java.lang.String str8 = boilerplateRenamer2.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        boolean boolean10 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boilerplateRenamer2.addDeclaredName("arguments");
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        java.lang.String str10 = renamer8.getReplacementName("");
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boolean boolean4 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean9 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("arguments");
        boolean boolean10 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean11 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean12 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean13 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique14 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique14.exitScope(nodeTraversal15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str9 = inlineRenamer3.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        boolean boolean11 = inlineRenamer3.stripConstIfReplaced();
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("hi!");
        java.lang.String str11 = boilerplateRenamer2.getReplacementName("$$");
        boilerplateRenamer2.addDeclaredName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer14 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique15 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique15.exitScope(nodeTraversal16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(renamer14);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "$$");
        boolean boolean3 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique4 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        java.lang.String str4 = boilerplateRenamer2.getReplacementName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean6 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(renamer7);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("arguments");
        boolean boolean10 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean11 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("hi!");
        boilerplateRenamer2.addDeclaredName("arguments");
        java.lang.String str17 = boilerplateRenamer2.getReplacementName("hi!");
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique4 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique5.visit(nodeTraversal6, node7, node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        java.lang.String str9 = inlineRenamer3.getReplacementName("");
        boolean boolean10 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str12 = inlineRenamer3.getReplacementName("arguments");
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        java.lang.String str4 = boilerplateRenamer2.getReplacementName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("hi!");
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("");
        boolean boolean10 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        boolean boolean12 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str9 = inlineRenamer3.getReplacementName("$$");
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
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
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
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNotNull(renamer11);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "$$", false);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str6 = inlineRenamer3.getReplacementName("arguments");
        java.lang.String str8 = inlineRenamer3.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = inlineRenamer3.forChildScope();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(renamer9);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
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
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", false);
        java.lang.String str5 = inlineRenamer3.getReplacementName("hi!");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str9 = inlineRenamer3.getReplacementName("hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        java.lang.String str9 = inlineRenamer3.getReplacementName("");
        boolean boolean10 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str12 = inlineRenamer3.getReplacementName("arguments");
        java.lang.String str14 = inlineRenamer3.getReplacementName("");
        java.lang.String str16 = inlineRenamer3.getReplacementName("$$");
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        java.lang.String str9 = inlineRenamer3.getReplacementName("hi!");
        java.lang.String str11 = inlineRenamer3.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = inlineRenamer3.forChildScope();
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
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(renamer12);
        org.junit.Assert.assertNotNull(renamer13);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
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
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique18 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        java.lang.Class<?> wildcardClass19 = boilerplateRenamer2.getClass();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(renamer15);
        org.junit.Assert.assertNotNull(renamer16);
        org.junit.Assert.assertNotNull(renamer17);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        boolean boolean7 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique8 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        java.lang.String str10 = boilerplateRenamer2.getReplacementName("arguments");
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer1 = contextualRenamer0.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer2 = renamer1.forChildScope();
        boolean boolean3 = renamer1.stripConstIfReplaced();
        boolean boolean4 = renamer1.stripConstIfReplaced();
        renamer1.addDeclaredName("$$");
        org.junit.Assert.assertNotNull(renamer1);
        org.junit.Assert.assertNotNull(renamer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique3.exitScope(nodeTraversal4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        java.lang.String str5 = boilerplateRenamer2.getReplacementName("arguments");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique10 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer11);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean9 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean10 = inlineRenamer3.stripConstIfReplaced();
        inlineRenamer3.addDeclaredName("");
        java.lang.String str14 = inlineRenamer3.getReplacementName("$$");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str8 = inlineRenamer3.getReplacementName("");
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
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("");
        boilerplateRenamer2.addDeclaredName("");
        java.lang.String str11 = boilerplateRenamer2.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = boilerplateRenamer2.forChildScope();
        boolean boolean13 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("hi!");
        java.lang.Class<?> wildcardClass16 = boilerplateRenamer2.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(renamer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = inlineRenamer3.forChildScope();
        boolean boolean6 = renamer5.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boolean boolean7 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("");
        java.lang.String str11 = boilerplateRenamer2.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        java.lang.String str14 = boilerplateRenamer2.getReplacementName("hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        java.lang.String str13 = boilerplateRenamer2.getReplacementName("");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique8 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        inlineRenamer3.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = inlineRenamer3.forChildScope();
        // The following exception was thrown during execution in test generation
        try {
            renamer11.addDeclaredName("arguments");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer11);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("arguments");
        boilerplateRenamer2.addDeclaredName("arguments");
        boilerplateRenamer2.addDeclaredName("$$");
        java.lang.String str15 = boilerplateRenamer2.getReplacementName("");
        boolean boolean16 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str9 = inlineRenamer3.getReplacementName("arguments");
        boolean boolean10 = inlineRenamer3.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique8 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
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
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("arguments");
        boolean boolean10 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str12 = boilerplateRenamer2.getReplacementName("");
        boilerplateRenamer2.addDeclaredName("hi!");
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        java.lang.String str12 = boilerplateRenamer2.getReplacementName("$$");
        java.lang.String str14 = boilerplateRenamer2.getReplacementName("$$");
        boolean boolean15 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
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
        boolean boolean17 = inlineRenamer3.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("arguments");
        boilerplateRenamer2.addDeclaredName("arguments");
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("arguments");
        boolean boolean10 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(renamer11);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        boolean boolean7 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        boolean boolean9 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
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
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer17 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(renamer13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(renamer16);
        org.junit.Assert.assertNotNull(renamer17);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean9 = inlineRenamer3.stripConstIfReplaced();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        java.lang.Class<?> wildcardClass12 = boilerplateRenamer2.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        java.lang.String str9 = renamer7.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = renamer7.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer7);
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
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        java.lang.String str9 = inlineRenamer3.getReplacementName("");
        boolean boolean10 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str12 = inlineRenamer3.getReplacementName("arguments");
        java.lang.String str14 = inlineRenamer3.getReplacementName("");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("arguments");
        boilerplateRenamer2.addDeclaredName("arguments");
        boilerplateRenamer2.addDeclaredName("");
        boilerplateRenamer2.addDeclaredName("$$");
        boilerplateRenamer2.addDeclaredName("arguments");
        boilerplateRenamer2.addDeclaredName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer16 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNotNull(renamer16);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        java.lang.String str9 = inlineRenamer3.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = renamer11.forChildScope();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNotNull(renamer12);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique9 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
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
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        boolean boolean7 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("hi!");
        boolean boolean10 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
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
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("arguments");
        boolean boolean10 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("");
        java.lang.String str14 = boilerplateRenamer2.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer15 = boilerplateRenamer2.forChildScope();
        java.lang.String str17 = renamer15.getReplacementName("hi!");
        java.lang.String str19 = renamer15.getReplacementName("arguments");
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(renamer15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        java.lang.String str5 = boilerplateRenamer2.getReplacementName("arguments");
        boilerplateRenamer2.addDeclaredName("");
        boilerplateRenamer2.addDeclaredName("hi!");
        boilerplateRenamer2.addDeclaredName("$$");
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", false);
        java.lang.String str5 = inlineRenamer3.getReplacementName("hi!");
        java.lang.String str7 = inlineRenamer3.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = inlineRenamer3.forChildScope();
        boolean boolean9 = inlineRenamer3.stripConstIfReplaced();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNotNull(renamer11);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", false);
        java.lang.String str5 = inlineRenamer3.getReplacementName("hi!");
        java.lang.String str7 = inlineRenamer3.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = inlineRenamer3.forChildScope();
        java.lang.String str10 = inlineRenamer3.getReplacementName("hi!");
        java.lang.String str12 = inlineRenamer3.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique14 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer15 = inlineRenamer3.forChildScope();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(renamer13);
        org.junit.Assert.assertNotNull(renamer15);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("");
        java.lang.String str7 = inlineRenamer3.getReplacementName("$$");
        java.lang.String str9 = inlineRenamer3.getReplacementName("");
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str7 = boilerplateRenamer2.getReplacementName("hi!");
        boolean boolean8 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("hi!");
        boilerplateRenamer2.addDeclaredName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer14 = renamer13.forChildScope();
        java.lang.String str16 = renamer14.getReplacementName("$$");
        // The following exception was thrown during execution in test generation
        try {
            renamer14.addDeclaredName("arguments");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(renamer13);
        org.junit.Assert.assertNotNull(renamer14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique8 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer7);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = renamer7.forChildScope();
        java.lang.Class<?> wildcardClass10 = renamer7.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str7 = boilerplateRenamer2.getReplacementName("hi!");
        boolean boolean8 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str10 = boilerplateRenamer2.getReplacementName("arguments");
        boilerplateRenamer2.addDeclaredName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = boilerplateRenamer2.forChildScope();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(renamer13);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        boolean boolean8 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("$$");
        boilerplateRenamer2.addDeclaredName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boolean boolean14 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = inlineRenamer3.forChildScope();
        java.lang.String str11 = inlineRenamer3.getReplacementName("");
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
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
        java.lang.String str19 = inlineRenamer3.getReplacementName("hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        java.lang.Class<?> wildcardClass9 = inlineRenamer3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str8 = inlineRenamer3.getReplacementName("");
        inlineRenamer3.addDeclaredName("");
        boolean boolean11 = inlineRenamer3.stripConstIfReplaced();
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("$$");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boolean boolean4 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        java.lang.Class<?> wildcardClass9 = boilerplateRenamer2.getClass();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boilerplateRenamer2.addDeclaredName("hi!");
        java.lang.String str10 = boilerplateRenamer2.getReplacementName("arguments");
        boolean boolean11 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer14 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer15 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(renamer14);
        org.junit.Assert.assertNotNull(renamer15);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
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
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer19 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(renamer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(renamer19);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean9 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        inlineRenamer3.addDeclaredName("");
        java.lang.String str14 = inlineRenamer3.getReplacementName("arguments");
        java.lang.String str16 = inlineRenamer3.getReplacementName("$$");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        java.lang.String str7 = inlineRenamer3.getReplacementName("arguments");
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean9 = inlineRenamer3.stripConstIfReplaced();
        inlineRenamer3.addDeclaredName("");
        boolean boolean12 = inlineRenamer3.stripConstIfReplaced();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str7 = boilerplateRenamer2.getReplacementName("hi!");
        boolean boolean8 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("hi!");
        boolean boolean11 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean12 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique14 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique14.enterScope(nodeTraversal15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("$$");
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boolean boolean4 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str7 = boilerplateRenamer2.getReplacementName("hi!");
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
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer1 = contextualRenamer0.forChildScope();
        boolean boolean2 = contextualRenamer0.stripConstIfReplaced();
        boolean boolean3 = contextualRenamer0.stripConstIfReplaced();
        java.lang.String str5 = contextualRenamer0.getReplacementName("$$");
        boolean boolean6 = contextualRenamer0.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) contextualRenamer0);
        boolean boolean8 = contextualRenamer0.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("hi!");
        boilerplateRenamer2.addDeclaredName("hi!");
        java.lang.String str8 = boilerplateRenamer2.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        java.lang.String str14 = boilerplateRenamer2.getReplacementName("");
        java.lang.String str16 = boilerplateRenamer2.getReplacementName("hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boilerplateRenamer2.addDeclaredName("hi!");
        java.lang.String str10 = boilerplateRenamer2.getReplacementName("arguments");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(renamer13);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        java.lang.String str7 = inlineRenamer3.getReplacementName("$$");
        java.lang.String str9 = inlineRenamer3.getReplacementName("arguments");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", false);
        java.lang.String str5 = inlineRenamer3.getReplacementName("hi!");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        java.lang.String str9 = inlineRenamer3.getReplacementName("hi!");
        java.lang.String str11 = inlineRenamer3.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = inlineRenamer3.forChildScope();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(renamer12);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("arguments");
        boolean boolean10 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean11 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("$$");
        boolean boolean14 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        java.lang.String str9 = renamer7.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = renamer7.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer7);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique11.exitScope(nodeTraversal12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = inlineRenamer3.forChildScope();
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str10 = inlineRenamer3.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = inlineRenamer3.forChildScope();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(renamer11);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str7 = boilerplateRenamer2.getReplacementName("hi!");
        boolean boolean8 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        // The following exception was thrown during execution in test generation
        try {
            renamer9.addDeclaredName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(renamer9);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        java.lang.String str9 = inlineRenamer3.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        java.lang.String str12 = renamer10.getReplacementName("$$");
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer1 = contextualRenamer0.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer2 = contextualRenamer0.forChildScope();
        contextualRenamer0.addDeclaredName("$$");
        org.junit.Assert.assertNotNull(renamer1);
        org.junit.Assert.assertNotNull(renamer2);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        java.lang.String str7 = inlineRenamer3.getReplacementName("");
        java.lang.String str9 = inlineRenamer3.getReplacementName("arguments");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("arguments");
        boolean boolean10 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean11 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer14 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer15 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(renamer14);
        org.junit.Assert.assertNotNull(renamer15);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        java.lang.String str4 = boilerplateRenamer2.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boolean boolean6 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("$$");
        boilerplateRenamer2.addDeclaredName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer12);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("arguments");
        boilerplateRenamer2.addDeclaredName("arguments");
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("arguments");
        java.lang.String str11 = boilerplateRenamer2.getReplacementName("");
        boilerplateRenamer2.addDeclaredName("hi!");
        java.lang.String str15 = boilerplateRenamer2.getReplacementName("hi!");
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
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
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique15 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        java.lang.Class<?> wildcardClass16 = boilerplateRenamer2.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str7 = boilerplateRenamer2.getReplacementName("hi!");
        boolean boolean8 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("hi!");
        boolean boolean11 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean12 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        java.lang.String str15 = boilerplateRenamer2.getReplacementName("hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("arguments");
        boilerplateRenamer2.addDeclaredName("arguments");
        boilerplateRenamer2.addDeclaredName("");
        java.lang.String str11 = boilerplateRenamer2.getReplacementName("arguments");
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = inlineRenamer3.forChildScope();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(renamer9);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        java.lang.String str7 = inlineRenamer3.getReplacementName("arguments");
        java.lang.String str9 = inlineRenamer3.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique10 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        java.lang.String str12 = inlineRenamer3.getReplacementName("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str10 = inlineRenamer3.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = inlineRenamer3.forChildScope();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(renamer11);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer3);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "$$", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique4 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = inlineRenamer3.forChildScope();
        java.lang.Class<?> wildcardClass6 = inlineRenamer3.getClass();
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        java.lang.String str13 = boilerplateRenamer2.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer14 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(renamer14);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str8 = inlineRenamer3.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = inlineRenamer3.forChildScope();
        java.lang.String str11 = inlineRenamer3.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique12.exitScope(nodeTraversal13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean9 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = renamer10.forChildScope();
        boolean boolean12 = renamer11.stripConstIfReplaced();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str8 = inlineRenamer3.getReplacementName("$$");
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
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(renamer11);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer1 = contextualRenamer0.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer2 = contextualRenamer0.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = contextualRenamer0.forChildScope();
        boolean boolean4 = contextualRenamer0.stripConstIfReplaced();
        java.lang.String str6 = contextualRenamer0.getReplacementName("arguments");
        org.junit.Assert.assertNotNull(renamer1);
        org.junit.Assert.assertNotNull(renamer2);
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("");
        boilerplateRenamer2.addDeclaredName("");
        java.lang.String str11 = boilerplateRenamer2.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = boilerplateRenamer2.forChildScope();
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
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(renamer12);
        org.junit.Assert.assertNotNull(renamer13);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("");
        boilerplateRenamer2.addDeclaredName("");
        java.lang.String str11 = boilerplateRenamer2.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = boilerplateRenamer2.forChildScope();
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
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(renamer12);
        org.junit.Assert.assertNotNull(renamer13);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = renamer8.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = renamer8.forChildScope();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer1 = contextualRenamer0.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer2 = contextualRenamer0.forChildScope();
        java.lang.String str4 = contextualRenamer0.getReplacementName("");
        boolean boolean5 = contextualRenamer0.stripConstIfReplaced();
        contextualRenamer0.addDeclaredName("");
        java.lang.String str9 = contextualRenamer0.getReplacementName("hi!");
        org.junit.Assert.assertNotNull(renamer1);
        org.junit.Assert.assertNotNull(renamer2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = inlineRenamer3.forChildScope();
        java.lang.Class<?> wildcardClass7 = renamer6.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        java.lang.String str5 = boilerplateRenamer2.getReplacementName("");
        boilerplateRenamer2.addDeclaredName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean9 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean10 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str12 = inlineRenamer3.getReplacementName("$$");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boolean boolean4 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("hi!");
        boilerplateRenamer2.addDeclaredName("");
        boilerplateRenamer2.addDeclaredName("");
        boilerplateRenamer2.addDeclaredName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = boilerplateRenamer2.forChildScope();
        boolean boolean14 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("$$");
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        java.lang.String str4 = boilerplateRenamer2.getReplacementName("hi!");
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("");
        java.lang.String str8 = boilerplateRenamer2.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        // The following exception was thrown during execution in test generation
        try {
            renamer9.addDeclaredName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(renamer9);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique6.enterScope(nodeTraversal7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(renamer5);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        java.lang.String str9 = inlineRenamer3.getReplacementName("hi!");
        boolean boolean10 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = inlineRenamer3.forChildScope();
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(renamer11);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str7 = boilerplateRenamer2.getReplacementName("hi!");
        boolean boolean8 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("hi!");
        boolean boolean11 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean12 = boilerplateRenamer2.stripConstIfReplaced();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        java.lang.String str9 = inlineRenamer3.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        boolean boolean11 = inlineRenamer3.stripConstIfReplaced();
        java.lang.Class<?> wildcardClass12 = inlineRenamer3.getClass();
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        java.lang.String str4 = boilerplateRenamer2.getReplacementName("$$");
        boilerplateRenamer2.addDeclaredName("");
        java.lang.String str8 = boilerplateRenamer2.getReplacementName("arguments");
        java.lang.String str10 = boilerplateRenamer2.getReplacementName("");
        boolean boolean11 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str13 = boilerplateRenamer2.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer14 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(renamer14);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
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
            makeDeclaredNamesUnique10.enterScope(nodeTraversal11);
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
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique10 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
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
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "$$", false);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        inlineRenamer3.addDeclaredName("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        java.lang.String str9 = inlineRenamer3.getReplacementName("");
        boolean boolean10 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str12 = inlineRenamer3.getReplacementName("arguments");
        inlineRenamer3.addDeclaredName("");
        boolean boolean15 = inlineRenamer3.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        java.lang.String str4 = boilerplateRenamer2.getReplacementName("");
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str8 = inlineRenamer3.getReplacementName("hi!");
        inlineRenamer3.addDeclaredName("");
        inlineRenamer3.addDeclaredName("");
        java.lang.String str14 = inlineRenamer3.getReplacementName("arguments");
        boolean boolean15 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean16 = inlineRenamer3.stripConstIfReplaced();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boolean boolean7 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        // The following exception was thrown during execution in test generation
        try {
            renamer8.addDeclaredName("$$");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(renamer8);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        boolean boolean9 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str11 = boilerplateRenamer2.getReplacementName("hi!");
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        java.lang.String str7 = inlineRenamer3.getReplacementName("arguments");
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean9 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = inlineRenamer3.forChildScope();
        boolean boolean12 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str14 = inlineRenamer3.getReplacementName("hi!");
        inlineRenamer3.addDeclaredName("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        java.lang.String str5 = boilerplateRenamer2.getReplacementName("arguments");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique10 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boilerplateRenamer2.addDeclaredName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer14 = boilerplateRenamer2.forChildScope();
        boolean boolean15 = renamer14.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        boilerplateRenamer2.addDeclaredName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer10);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boilerplateRenamer2.addDeclaredName("hi!");
        java.lang.String str10 = boilerplateRenamer2.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNotNull(renamer13);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        java.lang.String str9 = renamer7.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = renamer7.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer7);
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("hi!");
        boilerplateRenamer2.addDeclaredName("hi!");
        java.lang.String str8 = boilerplateRenamer2.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        boolean boolean10 = renamer9.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = renamer9.forChildScope();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(renamer11);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer1 = contextualRenamer0.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer2 = contextualRenamer0.forChildScope();
        contextualRenamer0.addDeclaredName("arguments");
        contextualRenamer0.addDeclaredName("hi!");
        boolean boolean7 = contextualRenamer0.stripConstIfReplaced();
        java.lang.Class<?> wildcardClass8 = contextualRenamer0.getClass();
        org.junit.Assert.assertNotNull(renamer1);
        org.junit.Assert.assertNotNull(renamer2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str9 = inlineRenamer3.getReplacementName("$$");
        inlineRenamer3.addDeclaredName("");
        boolean boolean12 = inlineRenamer3.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = inlineRenamer3.forChildScope();
        java.lang.String str7 = inlineRenamer3.getReplacementName("");
        java.lang.String str9 = inlineRenamer3.getReplacementName("arguments");
        boolean boolean10 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str12 = inlineRenamer3.getReplacementName("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer1 = contextualRenamer0.forChildScope();
        boolean boolean2 = contextualRenamer0.stripConstIfReplaced();
        boolean boolean3 = contextualRenamer0.stripConstIfReplaced();
        boolean boolean4 = contextualRenamer0.stripConstIfReplaced();
        boolean boolean5 = contextualRenamer0.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = contextualRenamer0.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = contextualRenamer0.forChildScope();
        contextualRenamer0.addDeclaredName("hi!");
        org.junit.Assert.assertNotNull(renamer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boolean boolean12 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean13 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        inlineRenamer3.addDeclaredName("");
        boolean boolean11 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = inlineRenamer3.forChildScope();
        boolean boolean14 = inlineRenamer3.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(renamer12);
        org.junit.Assert.assertNotNull(renamer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        // The following exception was thrown during execution in test generation
        try {
            renamer8.addDeclaredName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
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
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer17 = renamer16.forChildScope();
        java.lang.Class<?> wildcardClass18 = renamer17.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(renamer16);
        org.junit.Assert.assertNotNull(renamer17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        inlineRenamer3.addDeclaredName("");
        java.lang.String str9 = inlineRenamer3.getReplacementName("arguments");
        boolean boolean10 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = inlineRenamer3.forChildScope();
        boolean boolean13 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer14 = inlineRenamer3.forChildScope();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNotNull(renamer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(renamer14);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        java.lang.String str9 = inlineRenamer3.getReplacementName("");
        boolean boolean10 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = inlineRenamer3.forChildScope();
        java.lang.String str13 = inlineRenamer3.getReplacementName("$$");
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "$$", false);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(renamer5);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
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
        java.lang.String str18 = boilerplateRenamer2.getReplacementName("");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        java.lang.String str9 = inlineRenamer3.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        boolean boolean11 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str13 = inlineRenamer3.getReplacementName("");
        inlineRenamer3.addDeclaredName("");
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("$$");
        java.lang.String str10 = boilerplateRenamer2.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique14 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique15 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer16 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNotNull(renamer12);
        org.junit.Assert.assertNotNull(renamer13);
        org.junit.Assert.assertNotNull(renamer16);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boolean boolean4 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        java.lang.Class<?> wildcardClass8 = renamer7.getClass();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
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
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(renamer13);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str7 = boilerplateRenamer2.getReplacementName("hi!");
        boolean boolean8 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        java.lang.String str13 = boilerplateRenamer2.getReplacementName("");
        boilerplateRenamer2.addDeclaredName("hi!");
        boolean boolean16 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(renamer7);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        boolean boolean11 = renamer10.stripConstIfReplaced();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        boolean boolean5 = renamer4.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique6.enterScope(nodeTraversal7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique7.enterScope(nodeTraversal8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
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
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = makeDeclaredNamesUnique11.shouldTraverse(nodeTraversal12, node13, node14);
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
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boolean boolean4 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("hi!");
        boilerplateRenamer2.addDeclaredName("");
        boilerplateRenamer2.addDeclaredName("");
        boilerplateRenamer2.addDeclaredName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = boilerplateRenamer2.forChildScope();
        java.lang.Class<?> wildcardClass14 = boilerplateRenamer2.getClass();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "$$", false);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = inlineRenamer3.forChildScope();
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(renamer5);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        java.lang.String str8 = boilerplateRenamer2.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        boolean boolean10 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        java.lang.Class<?> wildcardClass12 = makeDeclaredNamesUnique11.getClass();
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str8 = inlineRenamer3.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = inlineRenamer3.forChildScope();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNotNull(renamer11);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("arguments");
        boilerplateRenamer2.addDeclaredName("arguments");
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("arguments");
        java.lang.String str11 = boilerplateRenamer2.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer14 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(renamer12);
        org.junit.Assert.assertNotNull(renamer13);
        org.junit.Assert.assertNotNull(renamer14);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
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
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", false);
        java.lang.String str5 = inlineRenamer3.getReplacementName("hi!");
        java.lang.String str7 = inlineRenamer3.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = inlineRenamer3.forChildScope();
        boolean boolean10 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str12 = inlineRenamer3.getReplacementName("hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "$$", false);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        java.lang.String str8 = inlineRenamer3.getReplacementName("arguments");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        boolean boolean7 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        boolean boolean11 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean12 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("hi!");
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boilerplateRenamer2.addDeclaredName("hi!");
        java.lang.String str10 = boilerplateRenamer2.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boolean boolean13 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean14 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("arguments");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "$$", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("arguments");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        inlineRenamer3.addDeclaredName("");
        boolean boolean9 = inlineRenamer3.stripConstIfReplaced();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        java.lang.String str5 = boilerplateRenamer2.getReplacementName("arguments");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        boolean boolean9 = renamer8.stripConstIfReplaced();
        java.lang.Class<?> wildcardClass10 = renamer8.getClass();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        java.lang.String str7 = inlineRenamer3.getReplacementName("arguments");
        java.lang.Class<?> wildcardClass8 = inlineRenamer3.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        java.lang.String str9 = inlineRenamer3.getReplacementName("");
        java.lang.String str11 = inlineRenamer3.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        java.lang.String str14 = inlineRenamer3.getReplacementName("");
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        java.lang.Class<?> wildcardClass6 = makeDeclaredNamesUnique5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        java.lang.String str4 = boilerplateRenamer2.getReplacementName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("hi!");
        boolean boolean8 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique9 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
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
        boolean boolean13 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("$$");
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
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
            makeDeclaredNamesUnique12.exitScope(nodeTraversal13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(renamer11);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique9 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
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
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str7 = boilerplateRenamer2.getReplacementName("hi!");
        boolean boolean8 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("hi!");
        boilerplateRenamer2.addDeclaredName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = boilerplateRenamer2.forChildScope();
        boolean boolean14 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean15 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(renamer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
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
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        java.lang.String str5 = boilerplateRenamer2.getReplacementName("arguments");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique10 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boilerplateRenamer2.addDeclaredName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer13);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str7 = inlineRenamer3.getReplacementName("");
        java.lang.String str9 = inlineRenamer3.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("arguments");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        java.lang.String str4 = boilerplateRenamer2.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boolean boolean4 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("hi!");
        boilerplateRenamer2.addDeclaredName("");
        boilerplateRenamer2.addDeclaredName("");
        boilerplateRenamer2.addDeclaredName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer13);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean6 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        boolean boolean10 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        java.lang.String str4 = boilerplateRenamer2.getReplacementName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("$$");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("hi!");
        java.lang.String str11 = boilerplateRenamer2.getReplacementName("$$");
        boilerplateRenamer2.addDeclaredName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer14 = boilerplateRenamer2.forChildScope();
        java.lang.String str16 = boilerplateRenamer2.getReplacementName("arguments");
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(renamer14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str7 = boilerplateRenamer2.getReplacementName("hi!");
        boolean boolean8 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str10 = boilerplateRenamer2.getReplacementName("arguments");
        boilerplateRenamer2.addDeclaredName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique14 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique14.exitScope(nodeTraversal15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(renamer13);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        boolean boolean11 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean12 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("arguments");
        boolean boolean10 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean11 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("hi!");
        boilerplateRenamer2.addDeclaredName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer16 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(renamer16);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boolean boolean4 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("hi!");
        boilerplateRenamer2.addDeclaredName("");
        boilerplateRenamer2.addDeclaredName("");
        boilerplateRenamer2.addDeclaredName("hi!");
        java.lang.String str14 = boilerplateRenamer2.getReplacementName("hi!");
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        java.lang.Class<?> wildcardClass9 = renamer8.getClass();
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
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
        boilerplateRenamer2.addDeclaredName("arguments");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(renamer14);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
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
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = makeDeclaredNamesUnique12.shouldTraverse(nodeTraversal13, node14, node15);
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
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str7 = boilerplateRenamer2.getReplacementName("hi!");
        boolean boolean8 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str10 = inlineRenamer3.getReplacementName("arguments");
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boilerplateRenamer2.addDeclaredName("hi!");
        java.lang.String str10 = boilerplateRenamer2.getReplacementName("arguments");
        boilerplateRenamer2.addDeclaredName("$$");
        java.lang.String str14 = boilerplateRenamer2.getReplacementName("arguments");
        boilerplateRenamer2.addDeclaredName("");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("hi!");
        boilerplateRenamer2.addDeclaredName("hi!");
        java.lang.String str8 = boilerplateRenamer2.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("$$");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(renamer9);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        inlineRenamer3.addDeclaredName("");
        java.lang.String str9 = inlineRenamer3.getReplacementName("arguments");
        java.lang.String str11 = inlineRenamer3.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = inlineRenamer3.forChildScope();
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("arguments");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(renamer12);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str8 = inlineRenamer3.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = inlineRenamer3.forChildScope();
        boolean boolean10 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = inlineRenamer3.forChildScope();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(renamer11);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str7 = inlineRenamer3.getReplacementName("");
        java.lang.String str9 = inlineRenamer3.getReplacementName("");
        java.lang.String str11 = inlineRenamer3.getReplacementName("arguments");
        java.lang.String str13 = inlineRenamer3.getReplacementName("arguments");
        java.lang.Class<?> wildcardClass14 = inlineRenamer3.getClass();
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer1 = contextualRenamer0.forChildScope();
        boolean boolean2 = contextualRenamer0.stripConstIfReplaced();
        boolean boolean3 = contextualRenamer0.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = contextualRenamer0.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = contextualRenamer0.forChildScope();
        java.lang.Class<?> wildcardClass6 = contextualRenamer0.getClass();
        org.junit.Assert.assertNotNull(renamer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        java.lang.String str5 = boilerplateRenamer2.getReplacementName("arguments");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
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
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "$$", false);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = inlineRenamer3.forChildScope();
        java.lang.String str7 = inlineRenamer3.getReplacementName("arguments");
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        java.lang.String str8 = boilerplateRenamer2.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        java.lang.String str11 = renamer9.getReplacementName("$$");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
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
        boolean boolean17 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer18 = boilerplateRenamer2.forChildScope();
        java.lang.Class<?> wildcardClass19 = boilerplateRenamer2.getClass();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(renamer18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("$$");
        java.lang.String str10 = boilerplateRenamer2.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer14 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer15 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNotNull(renamer12);
        org.junit.Assert.assertNotNull(renamer13);
        org.junit.Assert.assertNotNull(renamer14);
        org.junit.Assert.assertNotNull(renamer15);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        java.lang.String str4 = boilerplateRenamer2.getReplacementName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean6 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        // The following exception was thrown during execution in test generation
        try {
            renamer7.addDeclaredName("arguments");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(renamer7);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boilerplateRenamer2.addDeclaredName("arguments");
        boilerplateRenamer2.addDeclaredName("$$");
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean9 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        java.lang.String str13 = inlineRenamer3.getReplacementName("arguments");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = inlineRenamer3.forChildScope();
        java.lang.String str7 = inlineRenamer3.getReplacementName("");
        java.lang.String str9 = inlineRenamer3.getReplacementName("arguments");
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("$$");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boilerplateRenamer2.addDeclaredName("hi!");
        java.lang.String str10 = boilerplateRenamer2.getReplacementName("arguments");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean13 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer14 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(renamer14);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("");
        java.lang.String str7 = inlineRenamer3.getReplacementName("$$");
        java.lang.String str9 = inlineRenamer3.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        java.lang.String str12 = inlineRenamer3.getReplacementName("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        java.lang.String str9 = inlineRenamer3.getReplacementName("");
        java.lang.String str11 = inlineRenamer3.getReplacementName("");
        boolean boolean12 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean13 = inlineRenamer3.stripConstIfReplaced();
        inlineRenamer3.addDeclaredName("");
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
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
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique16 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal17 = null;
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = makeDeclaredNamesUnique16.shouldTraverse(nodeTraversal17, node18, node19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNotNull(renamer12);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        java.lang.String str8 = boilerplateRenamer2.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        java.lang.String str12 = boilerplateRenamer2.getReplacementName("");
        boilerplateRenamer2.addDeclaredName("");
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        inlineRenamer3.addDeclaredName("");
        java.lang.String str9 = inlineRenamer3.getReplacementName("arguments");
        boolean boolean10 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = inlineRenamer3.forChildScope();
        boolean boolean13 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str15 = inlineRenamer3.getReplacementName("$$");
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("arguments");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNotNull(renamer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer7);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        java.lang.String str7 = inlineRenamer3.getReplacementName("arguments");
        java.lang.String str9 = inlineRenamer3.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        boolean boolean11 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean12 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str14 = inlineRenamer3.getReplacementName("arguments");
        inlineRenamer3.addDeclaredName("");
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("arguments");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boolean boolean7 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = renamer8.forChildScope();
        // The following exception was thrown during execution in test generation
        try {
            renamer8.addDeclaredName("$$");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer1 = contextualRenamer0.forChildScope();
        boolean boolean2 = contextualRenamer0.stripConstIfReplaced();
        boolean boolean3 = contextualRenamer0.stripConstIfReplaced();
        boolean boolean4 = contextualRenamer0.stripConstIfReplaced();
        java.lang.String str6 = contextualRenamer0.getReplacementName("arguments");
        java.lang.String str8 = contextualRenamer0.getReplacementName("$$");
        java.lang.String str10 = contextualRenamer0.getReplacementName("$$");
        java.lang.String str12 = contextualRenamer0.getReplacementName("hi!");
        org.junit.Assert.assertNotNull(renamer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        java.lang.String str8 = boilerplateRenamer2.getReplacementName("$$");
        java.lang.String str10 = boilerplateRenamer2.getReplacementName("");
        boilerplateRenamer2.addDeclaredName("arguments");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean6 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        java.lang.Class<?> wildcardClass10 = renamer9.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str7 = boilerplateRenamer2.getReplacementName("hi!");
        boolean boolean8 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str10 = boilerplateRenamer2.getReplacementName("$$");
        boilerplateRenamer2.addDeclaredName("arguments");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = inlineRenamer3.forChildScope();
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
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean6 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        // The following exception was thrown during execution in test generation
        try {
            renamer9.addDeclaredName("$$");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        java.lang.String str5 = boilerplateRenamer2.getReplacementName("");
        java.lang.String str7 = boilerplateRenamer2.getReplacementName("$$");
        boolean boolean8 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("");
        java.lang.String str12 = boilerplateRenamer2.getReplacementName("$$");
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str8 = inlineRenamer3.getReplacementName("$$");
        boolean boolean9 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean10 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer11);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(renamer11);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boolean boolean4 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str7 = boilerplateRenamer2.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique8 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        java.lang.String str10 = boilerplateRenamer2.getReplacementName("hi!");
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("$$");
        boilerplateRenamer2.addDeclaredName("hi!");
        boolean boolean12 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(renamer13);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = renamer5.forChildScope();
        java.lang.Class<?> wildcardClass7 = renamer6.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        java.lang.String str4 = boilerplateRenamer2.getReplacementName("hi!");
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("");
        java.lang.String str8 = boilerplateRenamer2.getReplacementName("");
        java.lang.String str10 = boilerplateRenamer2.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = renamer11.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = renamer11.forChildScope();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNotNull(renamer12);
        org.junit.Assert.assertNotNull(renamer13);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("arguments");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        java.lang.String str4 = boilerplateRenamer2.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = renamer6.forChildScope();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boolean boolean7 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = boilerplateRenamer2.forChildScope();
        java.lang.String str14 = boilerplateRenamer2.getReplacementName("$$");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNotNull(renamer12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("arguments");
        boolean boolean10 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("");
        java.lang.String str14 = boilerplateRenamer2.getReplacementName("$$");
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str9 = inlineRenamer3.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        java.lang.String str12 = inlineRenamer3.getReplacementName("$$");
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean6 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean7 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("arguments");
        boolean boolean10 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = renamer11.forChildScope();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNotNull(renamer12);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "$$", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique4 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("arguments");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = boilerplateRenamer2.forChildScope();
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("arguments");
        boilerplateRenamer2.addDeclaredName("arguments");
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
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
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boolean boolean4 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        java.lang.String str9 = renamer7.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique10 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer7);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal11 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique10.enterScope(nodeTraversal11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        java.lang.String str4 = boilerplateRenamer2.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique5.exitScope(nodeTraversal6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        boolean boolean9 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("arguments");
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        boolean boolean8 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        java.lang.String str8 = inlineRenamer3.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = inlineRenamer3.forChildScope();
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
        org.junit.Assert.assertNotNull(renamer9);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", false);
        java.lang.String str5 = inlineRenamer3.getReplacementName("hi!");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        java.lang.String str9 = inlineRenamer3.getReplacementName("hi!");
        java.lang.String str11 = inlineRenamer3.getReplacementName("$$");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
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
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique15 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique15.exitScope(nodeTraversal16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        java.lang.String str7 = inlineRenamer3.getReplacementName("arguments");
        java.lang.String str9 = inlineRenamer3.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique10 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        inlineRenamer3.addDeclaredName("");
        java.lang.Class<?> wildcardClass13 = inlineRenamer3.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        boolean boolean7 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("$$");
        boolean boolean10 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = inlineRenamer3.forChildScope();
        java.lang.String str11 = inlineRenamer3.getReplacementName("hi!");
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boolean boolean4 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        boolean boolean9 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str11 = boilerplateRenamer2.getReplacementName("hi!");
        boilerplateRenamer2.addDeclaredName("");
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "$$");
        boolean boolean3 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("$$");
        java.lang.String str7 = boilerplateRenamer2.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique8 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique8.enterScope(nodeTraversal9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
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
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer17 = boilerplateRenamer2.forChildScope();
        boolean boolean18 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(renamer16);
        org.junit.Assert.assertNotNull(renamer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean6 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique9 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer8);
        renamer8.addDeclaredName("");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(renamer8);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("arguments");
        boolean boolean10 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(renamer13);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
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
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = boilerplateRenamer2.forChildScope();
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer7);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str7 = boilerplateRenamer2.getReplacementName("hi!");
        boolean boolean8 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("hi!");
        boolean boolean11 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean12 = boilerplateRenamer2.stripConstIfReplaced();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
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
        boilerplateRenamer2.addDeclaredName("arguments");
        boilerplateRenamer2.addDeclaredName("arguments");
        boolean boolean17 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        java.lang.String str4 = boilerplateRenamer2.getReplacementName("$$");
        boilerplateRenamer2.addDeclaredName("");
        java.lang.String str8 = boilerplateRenamer2.getReplacementName("arguments");
        java.lang.String str10 = boilerplateRenamer2.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        boolean boolean12 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("$$");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        java.lang.String str9 = inlineRenamer3.getReplacementName("");
        boolean boolean10 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str12 = inlineRenamer3.getReplacementName("arguments");
        inlineRenamer3.addDeclaredName("");
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", false);
        java.lang.String str5 = inlineRenamer3.getReplacementName("hi!");
        java.lang.String str7 = inlineRenamer3.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = inlineRenamer3.forChildScope();
        inlineRenamer3.addDeclaredName("");
        java.lang.String str12 = inlineRenamer3.getReplacementName("arguments");
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str10 = inlineRenamer3.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        java.lang.String str13 = inlineRenamer3.getReplacementName("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boolean boolean8 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean9 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean10 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "$$", false);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str8 = inlineRenamer3.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = inlineRenamer3.forChildScope();
        boolean boolean10 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str12 = inlineRenamer3.getReplacementName("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("arguments");
        boolean boolean10 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str12 = boilerplateRenamer2.getReplacementName("");
        boolean boolean13 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = inlineRenamer3.forChildScope();
        boolean boolean9 = inlineRenamer3.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        java.lang.String str4 = boilerplateRenamer2.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        boolean boolean7 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        java.lang.String str7 = inlineRenamer3.getReplacementName("arguments");
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean9 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = inlineRenamer3.forChildScope();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNotNull(renamer12);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
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
        java.lang.String str16 = boilerplateRenamer2.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer17 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer13);
        org.junit.Assert.assertNotNull(renamer14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(renamer17);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        java.lang.String str9 = inlineRenamer3.getReplacementName("");
        inlineRenamer3.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique13.exitScope(nodeTraversal14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer12);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("");
        java.lang.String str7 = inlineRenamer3.getReplacementName("");
        java.lang.String str9 = inlineRenamer3.getReplacementName("hi!");
        boolean boolean10 = inlineRenamer3.stripConstIfReplaced();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
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
            boolean boolean16 = makeDeclaredNamesUnique12.shouldTraverse(nodeTraversal13, node14, node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        java.lang.String str9 = inlineRenamer3.getReplacementName("hi!");
        boolean boolean10 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = renamer11.forChildScope();
        java.lang.String str14 = renamer11.getReplacementName("arguments");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNotNull(renamer12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boolean boolean4 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        java.lang.String str7 = boilerplateRenamer2.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("arguments");
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(renamer8);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", false);
        java.lang.String str5 = inlineRenamer3.getReplacementName("hi!");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = inlineRenamer3.forChildScope();
        boolean boolean9 = inlineRenamer3.stripConstIfReplaced();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean9 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        inlineRenamer3.addDeclaredName("");
        boolean boolean13 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str15 = inlineRenamer3.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer16 = inlineRenamer3.forChildScope();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(renamer16);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", false);
        java.lang.String str5 = inlineRenamer3.getReplacementName("hi!");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        inlineRenamer3.addDeclaredName("");
        java.lang.String str10 = inlineRenamer3.getReplacementName("$$");
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
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
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique17 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer16);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique18 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal19 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique18.exitScope(nodeTraversal19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(renamer15);
        org.junit.Assert.assertNotNull(renamer16);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boilerplateRenamer2.addDeclaredName("hi!");
        java.lang.String str10 = boilerplateRenamer2.getReplacementName("arguments");
        boolean boolean11 = boilerplateRenamer2.stripConstIfReplaced();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(renamer12);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = inlineRenamer3.forChildScope();
        java.lang.String str11 = inlineRenamer3.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = renamer6.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique8 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer6);
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
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "");
        java.lang.String str4 = boilerplateRenamer2.getReplacementName("arguments");
        boilerplateRenamer2.addDeclaredName("$$");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("");
        java.lang.String str7 = inlineRenamer3.getReplacementName("$$");
        java.lang.String str9 = inlineRenamer3.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        boolean boolean11 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = inlineRenamer3.forChildScope();
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("arguments");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(renamer12);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boolean boolean4 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("hi!");
        boolean boolean7 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique8 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique8.enterScope(nodeTraversal9);
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
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str7 = boilerplateRenamer2.getReplacementName("hi!");
        boolean boolean8 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str10 = boilerplateRenamer2.getReplacementName("arguments");
        boilerplateRenamer2.addDeclaredName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(renamer13);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        inlineRenamer3.addDeclaredName("");
        boolean boolean11 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str13 = inlineRenamer3.getReplacementName("hi!");
        java.lang.String str15 = inlineRenamer3.getReplacementName("hi!");
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        java.lang.String str4 = boilerplateRenamer2.getReplacementName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean6 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean7 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNotNull(renamer11);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        java.lang.String str7 = inlineRenamer3.getReplacementName("arguments");
        java.lang.String str9 = inlineRenamer3.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        boolean boolean11 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean12 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str14 = inlineRenamer3.getReplacementName("arguments");
        java.lang.String str16 = inlineRenamer3.getReplacementName("arguments");
        java.lang.String str18 = inlineRenamer3.getReplacementName("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("hi!");
        boolean boolean9 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.Class<?> wildcardClass10 = boilerplateRenamer2.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = renamer5.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = renamer6.forChildScope();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boolean boolean4 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("arguments");
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean9 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean10 = inlineRenamer3.stripConstIfReplaced();
        inlineRenamer3.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = inlineRenamer3.forChildScope();
        boolean boolean14 = inlineRenamer3.stripConstIfReplaced();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(renamer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        java.lang.String str4 = boilerplateRenamer2.getReplacementName("hi!");
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("");
        java.lang.String str8 = boilerplateRenamer2.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique9 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
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
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = inlineRenamer3.forChildScope();
        java.lang.String str8 = inlineRenamer3.getReplacementName("arguments");
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("$$");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("hi!");
        boilerplateRenamer2.addDeclaredName("hi!");
        java.lang.String str8 = boilerplateRenamer2.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = renamer12.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique14 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique14.exitScope(nodeTraversal15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer12);
        org.junit.Assert.assertNotNull(renamer13);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "$$", false);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str8 = inlineRenamer3.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = inlineRenamer3.forChildScope();
        boolean boolean12 = inlineRenamer3.stripConstIfReplaced();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str9 = inlineRenamer3.getReplacementName("hi!");
        java.lang.String str11 = inlineRenamer3.getReplacementName("");
        boolean boolean12 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = inlineRenamer3.forChildScope();
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(renamer13);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "$$", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        java.lang.String str9 = inlineRenamer3.getReplacementName("$$");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "$$", false);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str8 = inlineRenamer3.getReplacementName("$$");
        java.lang.String str10 = inlineRenamer3.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        java.lang.String str13 = inlineRenamer3.getReplacementName("arguments");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boolean boolean4 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        boolean boolean10 = renamer9.stripConstIfReplaced();
        renamer9.addDeclaredName("");
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        java.lang.String str8 = boilerplateRenamer2.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        java.lang.String str11 = boilerplateRenamer2.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer12);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(renamer12);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        inlineRenamer3.addDeclaredName("");
        java.lang.String str9 = inlineRenamer3.getReplacementName("arguments");
        java.lang.String str11 = inlineRenamer3.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = inlineRenamer3.forChildScope();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(renamer12);
        org.junit.Assert.assertNotNull(renamer13);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        boolean boolean11 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str13 = inlineRenamer3.getReplacementName("$$");
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("arguments");
        boilerplateRenamer2.addDeclaredName("arguments");
        boilerplateRenamer2.addDeclaredName("");
        java.lang.String str11 = boilerplateRenamer2.getReplacementName("");
        boilerplateRenamer2.addDeclaredName("");
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        inlineRenamer3.addDeclaredName("");
        java.lang.String str9 = inlineRenamer3.getReplacementName("arguments");
        boolean boolean10 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = inlineRenamer3.forChildScope();
        java.lang.String str13 = inlineRenamer3.getReplacementName("hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        java.lang.String str8 = boilerplateRenamer2.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        boolean boolean10 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boilerplateRenamer2.addDeclaredName("$$");
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("$$");
        java.lang.String str10 = boilerplateRenamer2.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique14 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique15 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
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
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNotNull(renamer12);
        org.junit.Assert.assertNotNull(renamer13);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer1 = contextualRenamer0.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer2 = contextualRenamer0.forChildScope();
        renamer2.addDeclaredName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = renamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer1);
        org.junit.Assert.assertNotNull(renamer2);
        org.junit.Assert.assertNotNull(renamer5);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = boilerplateRenamer2.forChildScope();
        boolean boolean13 = renamer12.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str7 = inlineRenamer3.getReplacementName("");
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
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("arguments");
        boilerplateRenamer2.addDeclaredName("arguments");
        boolean boolean8 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(renamer9);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "$$", false);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str8 = inlineRenamer3.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = renamer9.forChildScope();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        java.lang.String str9 = inlineRenamer3.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        java.lang.Class<?> wildcardClass11 = inlineRenamer3.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", false);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("$$");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer4);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
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
        boolean boolean15 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean16 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean17 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(renamer12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        java.lang.String str7 = inlineRenamer3.getReplacementName("arguments");
        java.lang.String str9 = inlineRenamer3.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = inlineRenamer3.forChildScope();
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNotNull(renamer11);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        java.lang.String str4 = boilerplateRenamer2.getReplacementName("hi!");
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boolean boolean4 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("$$");
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        java.lang.String str5 = boilerplateRenamer2.getReplacementName("arguments");
        java.lang.String str7 = boilerplateRenamer2.getReplacementName("");
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        java.lang.String str7 = inlineRenamer3.getReplacementName("arguments");
        java.lang.String str9 = inlineRenamer3.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        boolean boolean11 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean12 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean13 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str15 = inlineRenamer3.getReplacementName("arguments");
        boolean boolean16 = inlineRenamer3.stripConstIfReplaced();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
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
        boilerplateRenamer2.addDeclaredName("");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str7 = boilerplateRenamer2.getReplacementName("hi!");
        boolean boolean8 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("$$");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(renamer9);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        java.lang.String str8 = boilerplateRenamer2.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        java.lang.String str11 = boilerplateRenamer2.getReplacementName("$$");
        boilerplateRenamer2.addDeclaredName("");
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNull(str11);
    }
}

