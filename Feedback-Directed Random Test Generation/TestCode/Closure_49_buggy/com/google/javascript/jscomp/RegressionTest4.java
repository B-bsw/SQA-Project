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
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("hi!");
        boilerplateRenamer2.addDeclaredName("hi!");
        boilerplateRenamer2.addDeclaredName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        boolean boolean10 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer14 = boilerplateRenamer2.forChildScope();
        boolean boolean15 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(renamer13);
        org.junit.Assert.assertNotNull(renamer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boolean boolean4 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("hi!");
        boilerplateRenamer2.addDeclaredName("");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        java.lang.String str13 = boilerplateRenamer2.getReplacementName("arguments");
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
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
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNotNull(renamer14);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str9 = inlineRenamer3.getReplacementName("hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        java.lang.String str5 = boilerplateRenamer2.getReplacementName("");
        boilerplateRenamer2.addDeclaredName("$$");
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique4 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = inlineRenamer3.forChildScope();
        java.lang.String str11 = inlineRenamer3.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = inlineRenamer3.forChildScope();
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(renamer12);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        java.lang.String str8 = inlineRenamer3.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
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
        boilerplateRenamer2.addDeclaredName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer19 = boilerplateRenamer2.forChildScope();
        boolean boolean20 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer21 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(renamer19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(renamer21);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("$$");
        boilerplateRenamer2.addDeclaredName("hi!");
        boolean boolean12 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean9 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean10 = inlineRenamer3.stripConstIfReplaced();
        inlineRenamer3.addDeclaredName("");
        boolean boolean13 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean14 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique15 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("");
        boilerplateRenamer2.addDeclaredName("");
        java.lang.String str11 = boilerplateRenamer2.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = boilerplateRenamer2.forChildScope();
        java.lang.String str15 = boilerplateRenamer2.getReplacementName("");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(renamer12);
        org.junit.Assert.assertNotNull(renamer13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
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
        java.lang.String str16 = boilerplateRenamer2.getReplacementName("arguments");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
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
        org.junit.Assert.assertNotNull(renamer14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
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
        boolean boolean16 = boilerplateRenamer2.stripConstIfReplaced();
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
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
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
            makeDeclaredNamesUnique8.exitScope(nodeTraversal9);
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
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str8 = inlineRenamer3.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = inlineRenamer3.forChildScope();
        java.lang.String str11 = inlineRenamer3.getReplacementName("arguments");
        boolean boolean12 = inlineRenamer3.stripConstIfReplaced();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str7 = inlineRenamer3.getReplacementName("");
        java.lang.String str9 = inlineRenamer3.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique10 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
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
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        boilerplateRenamer2.addDeclaredName("hi!");
        boilerplateRenamer2.addDeclaredName("hi!");
        boolean boolean12 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
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
        boolean boolean17 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str19 = boilerplateRenamer2.getReplacementName("hi!");
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(renamer12);
        org.junit.Assert.assertNotNull(renamer13);
        org.junit.Assert.assertNotNull(renamer16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        java.lang.String str9 = inlineRenamer3.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        boolean boolean11 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = inlineRenamer3.forChildScope();
        java.lang.Class<?> wildcardClass13 = renamer12.getClass();
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(renamer12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
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
        boolean boolean14 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
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
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str8 = inlineRenamer3.getReplacementName("hi!");
        inlineRenamer3.addDeclaredName("");
        java.lang.String str12 = inlineRenamer3.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer14 = inlineRenamer3.forChildScope();
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
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(renamer13);
        org.junit.Assert.assertNotNull(renamer14);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "$$");
        boolean boolean3 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("$$");
        java.lang.String str7 = boilerplateRenamer2.getReplacementName("arguments");
        boolean boolean8 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique4 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer3);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer3);
        java.lang.String str7 = renamer3.getReplacementName("$$");
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = inlineRenamer3.forChildScope();
        boolean boolean10 = inlineRenamer3.stripConstIfReplaced();
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
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer6);
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
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        java.lang.String str7 = inlineRenamer3.getReplacementName("arguments");
        java.lang.String str9 = inlineRenamer3.getReplacementName("");
        java.lang.String str11 = inlineRenamer3.getReplacementName("hi!");
        inlineRenamer3.addDeclaredName("");
        java.lang.String str15 = inlineRenamer3.getReplacementName("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        java.lang.String str8 = boilerplateRenamer2.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        java.lang.String str11 = boilerplateRenamer2.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("hi!");
        boolean boolean15 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(renamer12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = boilerplateRenamer2.forChildScope();
        renamer12.addDeclaredName("");
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNotNull(renamer12);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
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
            makeDeclaredNamesUnique13.enterScope(nodeTraversal14);
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
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str8 = inlineRenamer3.getReplacementName("hi!");
        inlineRenamer3.addDeclaredName("");
        java.lang.String str12 = inlineRenamer3.getReplacementName("hi!");
        boolean boolean13 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer14 = inlineRenamer3.forChildScope();
        java.lang.String str16 = inlineRenamer3.getReplacementName("$$");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(renamer14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str7 = boilerplateRenamer2.getReplacementName("hi!");
        boilerplateRenamer2.addDeclaredName("");
        java.lang.Class<?> wildcardClass10 = boilerplateRenamer2.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str9 = inlineRenamer3.getReplacementName("");
        boolean boolean10 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean11 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean12 = inlineRenamer3.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("arguments");
        boilerplateRenamer2.addDeclaredName("arguments");
        boilerplateRenamer2.addDeclaredName("");
        boilerplateRenamer2.addDeclaredName("$$");
        boilerplateRenamer2.addDeclaredName("arguments");
        boilerplateRenamer2.addDeclaredName("$$");
        boolean boolean16 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = inlineRenamer3.forChildScope();
        java.lang.String str7 = inlineRenamer3.getReplacementName("");
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "$$", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique4 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boolean boolean4 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        java.lang.String str10 = boilerplateRenamer2.getReplacementName("");
        boilerplateRenamer2.addDeclaredName("");
        boilerplateRenamer2.addDeclaredName("hi!");
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        java.lang.String str5 = boilerplateRenamer2.getReplacementName("arguments");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        java.lang.String str11 = boilerplateRenamer2.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = boilerplateRenamer2.forChildScope();
        java.lang.String str14 = boilerplateRenamer2.getReplacementName("");
        boilerplateRenamer2.addDeclaredName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer17 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer18 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(renamer12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(renamer17);
        org.junit.Assert.assertNotNull(renamer18);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str8 = inlineRenamer3.getReplacementName("hi!");
        inlineRenamer3.addDeclaredName("");
        inlineRenamer3.addDeclaredName("");
        java.lang.String str14 = inlineRenamer3.getReplacementName("arguments");
        boolean boolean15 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer16 = inlineRenamer3.forChildScope();
        java.lang.String str18 = inlineRenamer3.getReplacementName("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(renamer16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer8);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
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
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
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
        boilerplateRenamer2.addDeclaredName("$$");
        boilerplateRenamer2.addDeclaredName("arguments");
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(renamer13);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        java.lang.String str9 = inlineRenamer3.getReplacementName("hi!");
        boolean boolean10 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = inlineRenamer3.forChildScope();
        boolean boolean12 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = inlineRenamer3.forChildScope();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(renamer13);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "$$", false);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str8 = inlineRenamer3.getReplacementName("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        java.lang.String str4 = boilerplateRenamer2.getReplacementName("hi!");
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("");
        java.lang.String str8 = boilerplateRenamer2.getReplacementName("");
        java.lang.String str10 = boilerplateRenamer2.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = boilerplateRenamer2.forChildScope();
        boolean boolean13 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNotNull(renamer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str8 = inlineRenamer3.getReplacementName("$$");
        boolean boolean9 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        java.lang.String str12 = inlineRenamer3.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique13.exitScope(nodeTraversal14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boilerplateRenamer2.addDeclaredName("hi!");
        java.lang.String str10 = boilerplateRenamer2.getReplacementName("arguments");
        boolean boolean11 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boilerplateRenamer2.addDeclaredName("arguments");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer17 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("$$");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(renamer17);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        java.lang.String str5 = boilerplateRenamer2.getReplacementName("arguments");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        java.lang.String str10 = boilerplateRenamer2.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        boolean boolean12 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        boolean boolean12 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str8 = inlineRenamer3.getReplacementName("$$");
        boolean boolean9 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean10 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = inlineRenamer3.forChildScope();
        java.lang.String str13 = renamer11.getReplacementName("arguments");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        boolean boolean7 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        java.lang.Class<?> wildcardClass13 = boilerplateRenamer2.getClass();
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", false);
        java.lang.String str5 = inlineRenamer3.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer9);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        java.lang.String str8 = boilerplateRenamer2.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        boolean boolean10 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        java.lang.String str13 = boilerplateRenamer2.getReplacementName("");
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        java.lang.String str7 = inlineRenamer3.getReplacementName("arguments");
        java.lang.String str9 = inlineRenamer3.getReplacementName("hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("");
        java.lang.String str7 = inlineRenamer3.getReplacementName("");
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean9 = inlineRenamer3.stripConstIfReplaced();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boolean boolean4 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str7 = boilerplateRenamer2.getReplacementName("hi!");
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("$$");
        boilerplateRenamer2.addDeclaredName("");
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        java.lang.String str12 = renamer10.getReplacementName("");
        java.lang.String str14 = renamer10.getReplacementName("");
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        java.lang.String str4 = boilerplateRenamer2.getReplacementName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("hi!");
        boolean boolean8 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str10 = boilerplateRenamer2.getReplacementName("hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer1 = contextualRenamer0.forChildScope();
        boolean boolean2 = contextualRenamer0.stripConstIfReplaced();
        boolean boolean3 = contextualRenamer0.stripConstIfReplaced();
        boolean boolean4 = contextualRenamer0.stripConstIfReplaced();
        java.lang.String str6 = contextualRenamer0.getReplacementName("hi!");
        contextualRenamer0.addDeclaredName("hi!");
        org.junit.Assert.assertNotNull(renamer1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
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
        java.lang.Class<?> wildcardClass14 = renamer13.getClass();
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(renamer12);
        org.junit.Assert.assertNotNull(renamer13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNotNull(renamer12);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        java.lang.String str7 = inlineRenamer3.getReplacementName("$$");
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        java.lang.String str7 = inlineRenamer3.getReplacementName("arguments");
        java.lang.String str9 = inlineRenamer3.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique10 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        inlineRenamer3.addDeclaredName("");
        java.lang.String str14 = inlineRenamer3.getReplacementName("hi!");
        boolean boolean15 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique16 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal17 = null;
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique16.visit(nodeTraversal17, node18, node19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str7 = boilerplateRenamer2.getReplacementName("hi!");
        boolean boolean8 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("hi!");
        boilerplateRenamer2.addDeclaredName("hi!");
        boolean boolean13 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique14 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        java.lang.String str4 = boilerplateRenamer2.getReplacementName("hi!");
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        java.lang.String str12 = boilerplateRenamer2.getReplacementName("$$");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
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
        // The following exception was thrown during execution in test generation
        try {
            renamer12.addDeclaredName("$$");
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
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str9 = inlineRenamer3.getReplacementName("arguments");
        inlineRenamer3.addDeclaredName("");
        boolean boolean12 = inlineRenamer3.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        inlineRenamer3.addDeclaredName("");
        boolean boolean11 = inlineRenamer3.stripConstIfReplaced();
        java.lang.Class<?> wildcardClass12 = inlineRenamer3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        java.lang.String str9 = inlineRenamer3.getReplacementName("hi!");
        java.lang.String str11 = inlineRenamer3.getReplacementName("$$");
        boolean boolean12 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str14 = inlineRenamer3.getReplacementName("arguments");
        java.lang.String str16 = inlineRenamer3.getReplacementName("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        boolean boolean12 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str8 = inlineRenamer3.getReplacementName("$$");
        boolean boolean9 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean10 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = inlineRenamer3.forChildScope();
        java.lang.String str13 = inlineRenamer3.getReplacementName("$$");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        inlineRenamer3.addDeclaredName("");
        java.lang.String str9 = inlineRenamer3.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique10 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "$$", false);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = inlineRenamer3.forChildScope();
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boilerplateRenamer2.addDeclaredName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        java.lang.String str11 = boilerplateRenamer2.getReplacementName("");
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "$$", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique6.enterScope(nodeTraversal7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
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
        java.lang.Class<?> wildcardClass16 = boilerplateRenamer2.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "$$", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique4 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = inlineRenamer3.forChildScope();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(renamer8);
    }
}

