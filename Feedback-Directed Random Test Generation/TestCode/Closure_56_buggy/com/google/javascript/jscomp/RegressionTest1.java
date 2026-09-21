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
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        boolean boolean3 = preloaded2.hasSourceInMemory();
        com.google.javascript.jscomp.Region region5 = preloaded2.getRegion((int) (short) 10);
        java.lang.String str6 = preloaded2.getCodeNoCache();
        java.lang.String str7 = preloaded2.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(region5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        boolean boolean8 = preloaded3.isExtern();
        com.google.javascript.jscomp.Region region10 = preloaded3.getRegion(100);
        java.lang.String str11 = preloaded3.getName();
        com.google.javascript.jscomp.Region region13 = preloaded3.getRegion((int) (short) 0);
        java.lang.String str14 = preloaded3.getCodeNoCache();
        java.lang.String str15 = preloaded3.getOriginalPath();
        java.io.Reader reader16 = preloaded3.getCodeReader();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(region10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(region13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(reader16);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        com.google.javascript.jscomp.Region region8 = preloaded3.getRegion(0);
        preloaded3.setOriginalPath("");
        java.lang.String str11 = preloaded3.toString();
        java.lang.Class<?> wildcardClass12 = preloaded3.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(region8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.getCodeNoCache();
        java.lang.String str7 = preloaded3.getName();
        java.lang.String str8 = preloaded3.getCode();
        java.lang.String str9 = preloaded3.getOriginalPath();
        java.lang.String str11 = preloaded3.getLine(100);
        boolean boolean12 = preloaded3.isExtern();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        java.lang.String str7 = preloaded3.getOriginalPath();
        preloaded3.setOriginalPath("");
        int int11 = preloaded3.getLineOffset((int) (byte) 1);
        preloaded3.setOriginalPath("");
        com.google.javascript.jscomp.Region region15 = preloaded3.getRegion(10);
        boolean boolean16 = preloaded3.isExtern();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(region15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        preloaded2.setIsExtern(true);
        int int5 = preloaded2.getNumLines();
        java.lang.String str7 = preloaded2.getLine((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        boolean boolean9 = generated2.hasSourceInMemory();
        boolean boolean10 = generated2.hasSourceInMemory();
        generated2.setIsExtern(false);
        generated2.clearCachedSource();
        java.lang.String str14 = generated2.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        sourceFile3.setIsExtern(true);
        java.lang.String str6 = sourceFile3.getName();
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = generated2.getLineOffset(100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        preloaded3.clearCachedSource();
        java.lang.String str10 = preloaded3.getLine(100);
        com.google.javascript.jscomp.Region region12 = preloaded3.getRegion((int) ' ');
        java.lang.String str13 = preloaded3.getOriginalPath();
        java.lang.String str14 = preloaded3.getCode();
        java.lang.String str15 = preloaded3.toString();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(region12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        preloaded3.setIsExtern(true);
        preloaded3.clearCachedSource();
        java.lang.String str11 = preloaded3.getCodeNoCache();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = preloaded3.getLineOffset((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        sourceFile3.setOriginalPath("");
        boolean boolean6 = sourceFile3.hasSourceInMemory();
        java.lang.String str7 = sourceFile3.toString();
        java.io.Reader reader8 = sourceFile3.getCodeReader();
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(reader8);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded5 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "");
        java.io.Reader reader6 = preloaded5.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile7 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader6);
        com.google.javascript.jscomp.SourceFile sourceFile8 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader6);
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader6);
        java.lang.String str10 = sourceFile9.getCodeNoCache();
        org.junit.Assert.assertNotNull(reader6);
        org.junit.Assert.assertNotNull(sourceFile7);
        org.junit.Assert.assertNotNull(sourceFile8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        boolean boolean7 = preloaded3.hasSourceInMemory();
        java.lang.String str9 = preloaded3.getLine((int) (short) 0);
        java.lang.String str10 = preloaded3.getCode();
        preloaded3.setIsExtern(true);
        java.lang.String str13 = preloaded3.getCodeNoCache();
        java.lang.String str14 = preloaded3.toString();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        boolean boolean10 = preloaded3.isExtern();
        java.lang.String str11 = preloaded3.getOriginalPath();
        boolean boolean12 = preloaded3.hasSourceInMemory();
        preloaded3.setIsExtern(true);
        boolean boolean15 = preloaded3.isExtern();
        java.lang.String str16 = preloaded3.toString();
        preloaded3.setIsExtern(false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        java.lang.String str8 = preloaded3.toString();
        java.lang.String str9 = preloaded3.getName();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        java.lang.String str8 = generated2.getOriginalPath();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        java.lang.String str12 = generated2.getCodeNoCache();
        boolean boolean13 = generated2.isExtern();
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        java.lang.String str8 = generated2.getOriginalPath();
        generated2.setIsExtern(false);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = generated2.getLineOffset(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setIsExtern(true);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        preloaded2.setIsExtern(true);
        boolean boolean5 = preloaded2.isExtern();
        boolean boolean6 = preloaded2.hasSourceInMemory();
        int int7 = preloaded2.getNumLines();
        java.lang.String str9 = preloaded2.getLine((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        boolean boolean10 = preloaded3.isExtern();
        int int11 = preloaded3.getNumLines();
        java.lang.String str12 = preloaded3.getCodeNoCache();
        java.io.Reader reader13 = preloaded3.getCodeReader();
        com.google.javascript.jscomp.Region region15 = preloaded3.getRegion((int) 'a');
        preloaded3.clearCachedSource();
        java.lang.String str17 = preloaded3.getCodeNoCache();
        java.lang.String str18 = preloaded3.getName();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(reader13);
        org.junit.Assert.assertNull(region15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded4.toString();
        int int8 = preloaded4.getNumLines();
        com.google.javascript.jscomp.Region region10 = preloaded4.getRegion((int) '#');
        boolean boolean11 = preloaded4.isExtern();
        boolean boolean12 = preloaded4.isExtern();
        java.lang.String str13 = preloaded4.getOriginalPath();
        java.lang.String str14 = preloaded4.getName();
        java.io.Reader reader15 = preloaded4.getCodeReader();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile16 = com.google.javascript.jscomp.SourceFile.fromReader("", reader15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(region10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(reader15);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        java.lang.String str8 = generated2.getOriginalPath();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = generated2.getNumLines();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        boolean boolean5 = preloaded3.hasSourceInMemory();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = preloaded3.getLineOffset(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        java.lang.String str7 = preloaded3.getOriginalPath();
        preloaded3.setOriginalPath("");
        java.lang.String str10 = preloaded3.getName();
        int int11 = preloaded3.getNumLines();
        preloaded3.setIsExtern(true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded5 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str7 = preloaded5.getLine((int) (byte) 10);
        java.lang.String str8 = preloaded5.toString();
        int int9 = preloaded5.getNumLines();
        com.google.javascript.jscomp.Region region11 = preloaded5.getRegion((int) '#');
        java.lang.String str12 = preloaded5.toString();
        java.io.Reader reader13 = preloaded5.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile14 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader13);
        com.google.javascript.jscomp.SourceFile sourceFile15 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader13);
        int int16 = sourceFile15.getNumLines();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(region11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(reader13);
        org.junit.Assert.assertNotNull(sourceFile14);
        org.junit.Assert.assertNotNull(sourceFile15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str4 = preloaded3.getOriginalPath();
        preloaded3.setOriginalPath("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded4.clearCachedSource();
        java.lang.String str7 = preloaded4.getLine((int) (byte) -1);
        int int8 = preloaded4.getNumLines();
        java.io.Reader reader9 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile10 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader9);
        java.lang.String str12 = sourceFile10.getLine((int) (byte) 100);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(reader9);
        org.junit.Assert.assertNotNull(sourceFile10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str5 = preloaded3.getOriginalPath();
        preloaded3.setIsExtern(false);
        preloaded3.setIsExtern(true);
        boolean boolean10 = preloaded3.hasSourceInMemory();
        preloaded3.setOriginalPath("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded5 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str7 = preloaded5.getLine((int) (byte) 10);
        boolean boolean8 = preloaded5.isExtern();
        java.io.Reader reader9 = preloaded5.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile10 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader9);
        com.google.javascript.jscomp.SourceFile sourceFile11 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader9);
        sourceFile11.setIsExtern(false);
        java.io.Reader reader14 = sourceFile11.getCodeReader();
        java.lang.String str16 = sourceFile11.getLine((int) (byte) 10);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(reader9);
        org.junit.Assert.assertNotNull(sourceFile10);
        org.junit.Assert.assertNotNull(sourceFile11);
        org.junit.Assert.assertNotNull(reader14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        sourceFile3.setIsExtern(true);
        boolean boolean6 = sourceFile3.isExtern();
        java.lang.String str7 = sourceFile3.getCodeNoCache();
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        java.lang.String str8 = preloaded4.getLine(10);
        preloaded4.clearCachedSource();
        int int10 = preloaded4.getNumLines();
        java.lang.String str11 = preloaded4.getCode();
        int int12 = preloaded4.getNumLines();
        java.io.Reader reader13 = preloaded4.getCodeReader();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile14 = com.google.javascript.jscomp.SourceFile.fromReader("", reader13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(reader13);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.getOriginalPath();
        java.lang.String str12 = sourceFile9.getLine((int) (short) 10);
        java.lang.String str13 = sourceFile9.getCodeNoCache();
        java.lang.String str14 = sourceFile9.getCode();
        sourceFile9.clearCachedSource();
        java.lang.String str17 = sourceFile9.getLine((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = sourceFile9.getLineOffset((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        preloaded2.setIsExtern(true);
        boolean boolean5 = preloaded2.isExtern();
        preloaded2.clearCachedSource();
        boolean boolean7 = preloaded2.hasSourceInMemory();
        preloaded2.setOriginalPath("");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        preloaded3.clearCachedSource();
        java.lang.String str9 = preloaded3.toString();
        int int10 = preloaded3.getNumLines();
        java.lang.String str11 = preloaded3.getCodeNoCache();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", generator1);
        boolean boolean3 = sourceFile2.isExtern();
        boolean boolean4 = sourceFile2.isExtern();
        java.lang.String str5 = sourceFile2.getCodeNoCache();
        java.lang.String str6 = sourceFile2.getCodeNoCache();
        sourceFile2.setIsExtern(false);
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        java.lang.String str7 = generated2.getCodeNoCache();
        generated2.setIsExtern(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.toString();
        boolean boolean11 = sourceFile9.hasSourceInMemory();
        java.io.Reader reader12 = sourceFile9.getCodeReader();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(reader12);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", generator1);
        boolean boolean3 = sourceFile2.isExtern();
        boolean boolean4 = sourceFile2.isExtern();
        java.lang.String str5 = sourceFile2.getCodeNoCache();
        boolean boolean6 = sourceFile2.isExtern();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Region region8 = sourceFile2.getRegion((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        boolean boolean11 = generated2.isExtern();
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        sourceFile3.setOriginalPath("");
        sourceFile3.setOriginalPath("");
        java.io.Reader reader8 = sourceFile3.getCodeReader();
        sourceFile3.setOriginalPath("hi!");
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertNotNull(reader8);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        java.lang.String str7 = generated2.getName();
        boolean boolean8 = generated2.isExtern();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        boolean boolean9 = generated2.hasSourceInMemory();
        boolean boolean10 = generated2.hasSourceInMemory();
        boolean boolean11 = generated2.isExtern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setIsExtern(true);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        preloaded3.clearCachedSource();
        java.lang.String str10 = preloaded3.getLine(100);
        java.lang.String str11 = preloaded3.toString();
        java.lang.String str13 = preloaded3.getLine(100);
        java.lang.String str15 = preloaded3.getLine((int) '4');
        java.lang.String str16 = preloaded3.toString();
        java.lang.String str17 = preloaded3.getName();
        java.lang.Class<?> wildcardClass18 = preloaded3.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        com.google.javascript.jscomp.SourceFile sourceFile5 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        java.lang.String str6 = sourceFile5.getOriginalPath();
        java.io.Reader reader7 = sourceFile5.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile8 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader7);
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader7);
        java.lang.String str10 = sourceFile9.getCode();
        java.io.Reader reader11 = sourceFile9.getCodeReader();
        org.junit.Assert.assertNotNull(sourceFile5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertNotNull(sourceFile8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(reader11);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        java.lang.String str8 = preloaded3.getOriginalPath();
        java.lang.String str9 = preloaded3.getCode();
        java.lang.String str11 = preloaded3.getLine(10);
        java.lang.Class<?> wildcardClass12 = preloaded3.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.getCode();
        java.lang.String str8 = preloaded3.getLine((int) (byte) 100);
        preloaded3.setOriginalPath("hi!");
        preloaded3.setIsExtern(true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        preloaded2.setIsExtern(true);
        preloaded2.setIsExtern(true);
        java.lang.String str8 = preloaded2.getLine((int) (byte) 10);
        com.google.javascript.jscomp.Region region10 = preloaded2.getRegion((int) (short) 1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(region10);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        java.lang.String str8 = preloaded3.getOriginalPath();
        java.lang.String str9 = preloaded3.getCode();
        java.lang.String str11 = preloaded3.getLine(10);
        boolean boolean12 = preloaded3.hasSourceInMemory();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.setOriginalPath("");
        java.lang.String str6 = generated2.getOriginalPath();
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        preloaded2.setIsExtern(true);
        boolean boolean5 = preloaded2.isExtern();
        preloaded2.clearCachedSource();
        com.google.javascript.jscomp.Region region8 = preloaded2.getRegion((int) (short) 1);
        preloaded2.setOriginalPath("");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(region8);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        sourceFile3.clearCachedSource();
        sourceFile3.clearCachedSource();
        java.lang.Class<?> wildcardClass6 = sourceFile3.getClass();
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "", "");
        sourceFile3.setOriginalPath("hi!");
        sourceFile3.setOriginalPath("hi!");
        sourceFile3.setIsExtern(false);
        org.junit.Assert.assertNotNull(sourceFile3);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.getCode();
        int int7 = preloaded3.getNumLines();
        java.lang.String str8 = preloaded3.getName();
        preloaded3.setIsExtern(false);
        int int11 = preloaded3.getNumLines();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        boolean boolean8 = preloaded3.isExtern();
        boolean boolean9 = preloaded3.hasSourceInMemory();
        java.lang.String str10 = preloaded3.getCode();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = preloaded3.getLineOffset((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        int int10 = preloaded3.getNumLines();
        java.lang.String str11 = preloaded3.getCodeNoCache();
        boolean boolean12 = preloaded3.isExtern();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset1);
        java.lang.String str3 = sourceFile2.getOriginalPath();
        com.google.javascript.jscomp.Region region5 = sourceFile2.getRegion((int) '#');
        boolean boolean6 = sourceFile2.isExtern();
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(region5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        preloaded3.setOriginalPath("");
        java.lang.String str12 = preloaded3.getName();
        boolean boolean13 = preloaded3.isExtern();
        preloaded3.setOriginalPath("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        com.google.javascript.jscomp.Region region11 = sourceFile9.getRegion((int) '#');
        boolean boolean12 = sourceFile9.hasSourceInMemory();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertNull(region11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", generator1);
        boolean boolean3 = sourceFile2.isExtern();
        java.lang.String str4 = sourceFile2.getName();
        java.lang.String str5 = sourceFile2.toString();
        sourceFile2.setOriginalPath("");
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!");
        java.lang.String str3 = sourceFile2.getOriginalPath();
        sourceFile2.setOriginalPath("");
        java.lang.String str6 = sourceFile2.getCode();
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        preloaded3.setIsExtern(true);
        preloaded3.clearCachedSource();
        java.lang.String str11 = preloaded3.getOriginalPath();
        int int12 = preloaded3.getNumLines();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = preloaded3.getLineOffset((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        java.lang.String str11 = preloaded3.getLine((int) (short) -1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = preloaded2.getLineOffset((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        boolean boolean10 = preloaded3.isExtern();
        boolean boolean11 = preloaded3.isExtern();
        java.lang.String str12 = preloaded3.getOriginalPath();
        java.lang.String str13 = preloaded3.getName();
        int int14 = preloaded3.getNumLines();
        boolean boolean15 = preloaded3.isExtern();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        boolean boolean9 = generated2.hasSourceInMemory();
        boolean boolean10 = generated2.hasSourceInMemory();
        generated2.clearCachedSource();
        java.lang.String str12 = generated2.getCodeNoCache();
        generated2.setOriginalPath("");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        java.lang.String str7 = generated2.getName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = generated2.getLineOffset((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.getOriginalPath();
        java.lang.String str11 = sourceFile9.getName();
        boolean boolean12 = sourceFile9.isExtern();
        com.google.javascript.jscomp.Region region14 = sourceFile9.getRegion((int) (short) 10);
        java.lang.String str16 = sourceFile9.getLine((int) '4');
        boolean boolean17 = sourceFile9.hasSourceInMemory();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(region14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        boolean boolean10 = preloaded3.isExtern();
        java.lang.String str11 = preloaded3.getOriginalPath();
        boolean boolean12 = preloaded3.isExtern();
        int int13 = preloaded3.getNumLines();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", generator1);
        boolean boolean3 = sourceFile2.isExtern();
        java.lang.String str4 = sourceFile2.toString();
        java.lang.String str5 = sourceFile2.toString();
        java.lang.String str6 = sourceFile2.getCodeNoCache();
        sourceFile2.setIsExtern(true);
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        int int4 = preloaded3.getNumLines();
        java.lang.String str5 = preloaded3.getCodeNoCache();
        java.lang.String str6 = preloaded3.toString();
        java.lang.String str7 = preloaded3.getOriginalPath();
        boolean boolean8 = preloaded3.isExtern();
        preloaded3.setOriginalPath("hi!");
        java.lang.String str11 = preloaded3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset1);
        boolean boolean3 = sourceFile2.isExtern();
        boolean boolean4 = sourceFile2.isExtern();
        sourceFile2.setIsExtern(true);
        sourceFile2.setIsExtern(true);
        sourceFile2.setIsExtern(true);
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        boolean boolean10 = preloaded3.isExtern();
        boolean boolean11 = preloaded3.isExtern();
        java.lang.String str12 = preloaded3.getOriginalPath();
        java.lang.String str13 = preloaded3.getName();
        java.io.Reader reader14 = preloaded3.getCodeReader();
        java.lang.Class<?> wildcardClass15 = preloaded3.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(reader14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", generator1);
        java.lang.String str3 = sourceFile2.toString();
        java.lang.String str4 = sourceFile2.toString();
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        boolean boolean9 = generated2.hasSourceInMemory();
        boolean boolean10 = generated2.hasSourceInMemory();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("hi!");
        java.lang.String str2 = sourceFile1.toString();
        boolean boolean3 = sourceFile1.hasSourceInMemory();
        java.lang.String str4 = sourceFile1.getOriginalPath();
        sourceFile1.clearCachedSource();
        java.lang.String str6 = sourceFile1.getCode();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.getOriginalPath();
        java.lang.String str12 = sourceFile9.getLine((int) (short) 10);
        java.lang.String str13 = sourceFile9.getCodeNoCache();
        int int14 = sourceFile9.getNumLines();
        boolean boolean15 = sourceFile9.isExtern();
        java.lang.String str16 = sourceFile9.getOriginalPath();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        preloaded3.setOriginalPath("");
        java.lang.String str12 = preloaded3.getName();
        java.lang.String str13 = preloaded3.getCode();
        boolean boolean14 = preloaded3.hasSourceInMemory();
        java.io.Reader reader15 = preloaded3.getCodeReader();
        java.lang.String str16 = preloaded3.getName();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(reader15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset1);
        java.lang.String str3 = sourceFile2.getOriginalPath();
        int int4 = sourceFile2.getNumLines();
        java.lang.String str6 = sourceFile2.getLine((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.io.Reader reader7 = sourceFile2.getCodeReader();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset1);
        java.lang.String str3 = sourceFile2.getOriginalPath();
        sourceFile2.setOriginalPath("");
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        java.lang.String str4 = sourceFile3.toString();
        boolean boolean5 = sourceFile3.hasSourceInMemory();
        java.lang.String str6 = sourceFile3.getName();
        int int7 = sourceFile3.getNumLines();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = sourceFile3.getLineOffset((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.toString();
        java.lang.String str11 = sourceFile9.toString();
        java.lang.String str12 = sourceFile9.getName();
        sourceFile9.clearCachedSource();
        sourceFile9.setIsExtern(false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        preloaded2.setIsExtern(true);
        preloaded2.setIsExtern(true);
        java.lang.String str8 = preloaded2.getLine((int) (byte) 10);
        boolean boolean9 = preloaded2.isExtern();
        boolean boolean10 = preloaded2.isExtern();
        java.lang.String str11 = preloaded2.toString();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        int int8 = preloaded3.getNumLines();
        preloaded3.clearCachedSource();
        boolean boolean10 = preloaded3.hasSourceInMemory();
        java.lang.String str12 = preloaded3.getLine(0);
        int int13 = preloaded3.getNumLines();
        java.lang.String str15 = preloaded3.getLine((int) (short) 1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset1);
        boolean boolean3 = sourceFile2.isExtern();
        boolean boolean4 = sourceFile2.isExtern();
        java.lang.Class<?> wildcardClass5 = sourceFile2.getClass();
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setOriginalPath("hi!");
        generated2.setIsExtern(false);
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "");
        java.io.Reader reader5 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile6 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader5);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile7 = com.google.javascript.jscomp.SourceFile.fromReader("", reader5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader5);
        org.junit.Assert.assertNotNull(sourceFile6);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        int int7 = preloaded3.getNumLines();
        java.lang.String str9 = preloaded3.getLine((int) (byte) 10);
        preloaded3.clearCachedSource();
        com.google.javascript.jscomp.Region region12 = preloaded3.getRegion((int) ' ');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(region12);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        com.google.javascript.jscomp.SourceFile sourceFile7 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        java.lang.String str8 = sourceFile7.getOriginalPath();
        java.io.Reader reader9 = sourceFile7.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile10 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader9);
        com.google.javascript.jscomp.SourceFile sourceFile11 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader9);
        com.google.javascript.jscomp.SourceFile sourceFile12 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader9);
        com.google.javascript.jscomp.SourceFile sourceFile13 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader9);
        sourceFile13.setIsExtern(false);
        org.junit.Assert.assertNotNull(sourceFile7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(reader9);
        org.junit.Assert.assertNotNull(sourceFile10);
        org.junit.Assert.assertNotNull(sourceFile11);
        org.junit.Assert.assertNotNull(sourceFile12);
        org.junit.Assert.assertNotNull(sourceFile13);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        preloaded3.clearCachedSource();
        java.lang.String str10 = preloaded3.getLine(100);
        com.google.javascript.jscomp.Region region12 = preloaded3.getRegion((int) ' ');
        java.lang.String str13 = preloaded3.getOriginalPath();
        preloaded3.setOriginalPath("");
        java.lang.String str16 = preloaded3.getName();
        java.lang.String str17 = preloaded3.getName();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(region12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        preloaded2.setIsExtern(false);
        java.lang.Class<?> wildcardClass5 = preloaded2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.toString();
        java.io.Reader reader11 = sourceFile9.getCodeReader();
        java.lang.String str12 = sourceFile9.getCodeNoCache();
        java.lang.String str14 = sourceFile9.getLine((int) '4');
        sourceFile9.clearCachedSource();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(reader11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        java.lang.String str8 = generated2.getOriginalPath();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setIsExtern(true);
        java.lang.String str14 = generated2.getOriginalPath();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.getOriginalPath();
        java.lang.String str12 = sourceFile9.getLine((int) (short) 10);
        java.lang.String str13 = sourceFile9.getCodeNoCache();
        boolean boolean14 = sourceFile9.hasSourceInMemory();
        java.lang.String str15 = sourceFile9.getName();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        boolean boolean8 = preloaded3.isExtern();
        boolean boolean9 = preloaded3.hasSourceInMemory();
        java.lang.String str10 = preloaded3.getCode();
        preloaded3.setIsExtern(true);
        java.lang.String str13 = preloaded3.getOriginalPath();
        java.lang.String str14 = preloaded3.getCode();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        java.lang.String str8 = preloaded3.toString();
        boolean boolean9 = preloaded3.isExtern();
        java.lang.String str10 = preloaded3.getName();
        java.lang.Class<?> wildcardClass11 = preloaded3.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        boolean boolean10 = preloaded3.isExtern();
        boolean boolean11 = preloaded3.isExtern();
        preloaded3.setIsExtern(false);
        java.lang.Class<?> wildcardClass14 = preloaded3.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str5 = preloaded3.getName();
        java.lang.String str7 = preloaded3.getLine(0);
        java.lang.String str8 = preloaded3.getCode();
        boolean boolean9 = preloaded3.isExtern();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        int int7 = preloaded3.getNumLines();
        boolean boolean8 = preloaded3.hasSourceInMemory();
        java.lang.String str10 = preloaded3.getLine(100);
        preloaded3.clearCachedSource();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        java.lang.String str7 = preloaded3.getOriginalPath();
        java.lang.String str8 = preloaded3.getCode();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        int int4 = preloaded3.getNumLines();
        java.lang.String str5 = preloaded3.toString();
        int int6 = preloaded3.getNumLines();
        boolean boolean7 = preloaded3.hasSourceInMemory();
        java.lang.String str8 = preloaded3.getCode();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        java.io.Reader reader4 = sourceFile3.getCodeReader();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile5 = com.google.javascript.jscomp.SourceFile.fromReader("", reader4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertNotNull(reader4);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        preloaded2.setIsExtern(true);
        preloaded2.setIsExtern(true);
        java.lang.String str8 = preloaded2.getLine((int) (byte) 10);
        preloaded2.setOriginalPath("hi!");
        java.lang.String str11 = preloaded2.getCode();
        java.lang.String str12 = preloaded2.getCode();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        boolean boolean10 = preloaded3.isExtern();
        java.lang.String str11 = preloaded3.getOriginalPath();
        boolean boolean12 = preloaded3.hasSourceInMemory();
        preloaded3.clearCachedSource();
        java.lang.String str14 = preloaded3.getCodeNoCache();
        java.lang.String str15 = preloaded3.toString();
        java.lang.String str16 = preloaded3.getCodeNoCache();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.getOriginalPath();
        java.lang.String str11 = sourceFile9.getName();
        boolean boolean12 = sourceFile9.isExtern();
        com.google.javascript.jscomp.Region region14 = sourceFile9.getRegion((int) (short) 10);
        sourceFile9.setOriginalPath("");
        boolean boolean17 = sourceFile9.isExtern();
        boolean boolean18 = sourceFile9.isExtern();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(region14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        boolean boolean7 = preloaded3.hasSourceInMemory();
        boolean boolean8 = preloaded3.hasSourceInMemory();
        preloaded3.setOriginalPath("");
        java.lang.String str11 = preloaded3.getOriginalPath();
        preloaded3.clearCachedSource();
        com.google.javascript.jscomp.Region region14 = preloaded3.getRegion(10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(region14);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        preloaded2.setIsExtern(true);
        boolean boolean5 = preloaded2.isExtern();
        preloaded2.clearCachedSource();
        boolean boolean7 = preloaded2.hasSourceInMemory();
        boolean boolean8 = preloaded2.isExtern();
        java.lang.String str9 = preloaded2.getOriginalPath();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        preloaded2.setIsExtern(true);
        preloaded2.setIsExtern(true);
        java.lang.String str8 = preloaded2.getLine((int) (byte) 10);
        boolean boolean9 = preloaded2.isExtern();
        java.lang.String str10 = preloaded2.getCodeNoCache();
        java.lang.String str11 = preloaded2.getOriginalPath();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        java.lang.String str10 = preloaded3.toString();
        java.io.Reader reader11 = preloaded3.getCodeReader();
        preloaded3.clearCachedSource();
        int int13 = preloaded3.getNumLines();
        java.lang.Class<?> wildcardClass14 = preloaded3.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(reader11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        boolean boolean10 = preloaded3.isExtern();
        java.lang.String str11 = preloaded3.getOriginalPath();
        boolean boolean12 = preloaded3.hasSourceInMemory();
        preloaded3.clearCachedSource();
        java.lang.String str14 = preloaded3.getCodeNoCache();
        preloaded3.setOriginalPath("");
        java.lang.String str17 = preloaded3.toString();
        java.lang.String str18 = preloaded3.toString();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        boolean boolean10 = preloaded3.isExtern();
        java.lang.String str11 = preloaded3.getOriginalPath();
        boolean boolean12 = preloaded3.hasSourceInMemory();
        preloaded3.setIsExtern(true);
        boolean boolean15 = preloaded3.isExtern();
        java.lang.String str16 = preloaded3.toString();
        preloaded3.setOriginalPath("");
        java.lang.String str19 = preloaded3.getOriginalPath();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", generator1);
        java.lang.String str3 = sourceFile2.toString();
        sourceFile2.setOriginalPath("hi!");
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        int int4 = preloaded3.getNumLines();
        java.lang.String str5 = preloaded3.getCodeNoCache();
        java.lang.String str6 = preloaded3.toString();
        java.lang.String str7 = preloaded3.toString();
        java.lang.Class<?> wildcardClass8 = preloaded3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        boolean boolean8 = preloaded3.isExtern();
        boolean boolean9 = preloaded3.hasSourceInMemory();
        preloaded3.clearCachedSource();
        boolean boolean11 = preloaded3.hasSourceInMemory();
        java.lang.String str12 = preloaded3.getCodeNoCache();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        boolean boolean10 = preloaded3.isExtern();
        java.lang.String str11 = preloaded3.getOriginalPath();
        boolean boolean12 = preloaded3.hasSourceInMemory();
        preloaded3.clearCachedSource();
        java.lang.String str14 = preloaded3.getCodeNoCache();
        java.lang.String str15 = preloaded3.toString();
        java.io.Reader reader16 = preloaded3.getCodeReader();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(reader16);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        boolean boolean3 = preloaded2.hasSourceInMemory();
        java.lang.String str4 = preloaded2.getCode();
        preloaded2.setIsExtern(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        preloaded4.setIsExtern(true);
        preloaded4.clearCachedSource();
        java.lang.String str12 = preloaded4.getOriginalPath();
        java.lang.String str14 = preloaded4.getLine((int) (short) 1);
        boolean boolean15 = preloaded4.hasSourceInMemory();
        java.io.Reader reader16 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile17 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader16);
        java.lang.String str19 = sourceFile17.getLine((int) (byte) 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(reader16);
        org.junit.Assert.assertNotNull(sourceFile17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        java.lang.String str8 = preloaded3.getCodeNoCache();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = preloaded3.getLineOffset(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        boolean boolean10 = preloaded3.isExtern();
        java.lang.String str11 = preloaded3.getOriginalPath();
        boolean boolean12 = preloaded3.hasSourceInMemory();
        preloaded3.setIsExtern(true);
        boolean boolean15 = preloaded3.isExtern();
        java.lang.String str16 = preloaded3.toString();
        int int17 = preloaded3.getNumLines();
        preloaded3.clearCachedSource();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        boolean boolean9 = generated2.hasSourceInMemory();
        boolean boolean10 = generated2.hasSourceInMemory();
        generated2.setIsExtern(false);
        boolean boolean13 = generated2.isExtern();
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        com.google.javascript.jscomp.Region region6 = preloaded3.getRegion(0);
        int int7 = preloaded3.getNumLines();
        java.lang.Class<?> wildcardClass8 = preloaded3.getClass();
        org.junit.Assert.assertNotNull(region6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        preloaded3.setOriginalPath("");
        java.lang.String str12 = preloaded3.getName();
        java.lang.String str13 = preloaded3.getCode();
        boolean boolean14 = preloaded3.hasSourceInMemory();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = preloaded3.getLineOffset((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.getCode();
        int int7 = preloaded3.getNumLines();
        java.lang.String str8 = preloaded3.toString();
        java.lang.String str9 = preloaded3.getOriginalPath();
        preloaded3.clearCachedSource();
        preloaded3.setOriginalPath("");
        com.google.javascript.jscomp.Region region14 = preloaded3.getRegion((-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(region14);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        java.lang.String str8 = generated2.getName();
        generated2.clearCachedSource();
        generated2.setOriginalPath("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        java.lang.String str8 = generated2.getOriginalPath();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded6 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str8 = preloaded6.getLine((int) (byte) 10);
        boolean boolean9 = preloaded6.isExtern();
        java.io.Reader reader10 = preloaded6.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile11 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader10);
        com.google.javascript.jscomp.SourceFile sourceFile12 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader10);
        com.google.javascript.jscomp.SourceFile sourceFile13 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader10);
        boolean boolean14 = sourceFile13.hasSourceInMemory();
        sourceFile13.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = sourceFile13.getLineOffset((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(reader10);
        org.junit.Assert.assertNotNull(sourceFile11);
        org.junit.Assert.assertNotNull(sourceFile12);
        org.junit.Assert.assertNotNull(sourceFile13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        boolean boolean10 = preloaded3.isExtern();
        boolean boolean11 = preloaded3.isExtern();
        java.lang.String str12 = preloaded3.getOriginalPath();
        preloaded3.setOriginalPath("");
        java.lang.String str15 = preloaded3.getOriginalPath();
        java.lang.String str17 = preloaded3.getLine((int) '#');
        java.lang.String str18 = preloaded3.getName();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        preloaded3.setOriginalPath("");
        java.lang.String str12 = preloaded3.getName();
        java.lang.String str13 = preloaded3.getCode();
        boolean boolean14 = preloaded3.hasSourceInMemory();
        java.lang.String str15 = preloaded3.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = preloaded3.getLineOffset((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        boolean boolean5 = generated2.hasSourceInMemory();
        boolean boolean6 = generated2.hasSourceInMemory();
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        boolean boolean7 = preloaded3.hasSourceInMemory();
        java.lang.String str9 = preloaded3.getLine((int) (short) 0);
        java.lang.String str10 = preloaded3.getCode();
        java.lang.String str11 = preloaded3.getOriginalPath();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.getOriginalPath();
        java.lang.String str12 = sourceFile9.getLine(10);
        java.lang.Class<?> wildcardClass13 = sourceFile9.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        preloaded3.setOriginalPath("");
        java.lang.String str12 = preloaded3.getCode();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        int int4 = preloaded3.getNumLines();
        java.lang.String str5 = preloaded3.toString();
        int int6 = preloaded3.getNumLines();
        boolean boolean7 = preloaded3.hasSourceInMemory();
        preloaded3.setOriginalPath("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setIsExtern(true);
        generated2.clearCachedSource();
        boolean boolean8 = generated2.isExtern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setIsExtern(true);
        generated2.clearCachedSource();
        java.lang.String str8 = generated2.toString();
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str5 = preloaded3.getName();
        java.lang.String str7 = preloaded3.getLine(0);
        java.lang.String str9 = preloaded3.getLine(0);
        java.lang.String str11 = preloaded3.getLine((int) ' ');
        boolean boolean12 = preloaded3.hasSourceInMemory();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.getCode();
        int int7 = preloaded3.getNumLines();
        java.lang.String str8 = preloaded3.getName();
        boolean boolean9 = preloaded3.hasSourceInMemory();
        java.lang.String str10 = preloaded3.getName();
        java.lang.String str11 = preloaded3.getCode();
        com.google.javascript.jscomp.Region region13 = preloaded3.getRegion((int) (short) 100);
        java.lang.String str14 = preloaded3.toString();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(region13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        boolean boolean8 = preloaded3.isExtern();
        boolean boolean9 = preloaded3.hasSourceInMemory();
        preloaded3.clearCachedSource();
        com.google.javascript.jscomp.Region region12 = preloaded3.getRegion((int) '#');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(region12);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        preloaded3.clearCachedSource();
        java.lang.String str9 = preloaded3.toString();
        preloaded3.setOriginalPath("hi!");
        com.google.javascript.jscomp.Region region13 = preloaded3.getRegion((int) '4');
        boolean boolean14 = preloaded3.hasSourceInMemory();
        java.io.Reader reader15 = preloaded3.getCodeReader();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(region13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(reader15);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        boolean boolean8 = preloaded3.isExtern();
        com.google.javascript.jscomp.Region region10 = preloaded3.getRegion(100);
        java.lang.String str11 = preloaded3.getName();
        com.google.javascript.jscomp.Region region13 = preloaded3.getRegion((int) (short) 0);
        preloaded3.clearCachedSource();
        java.lang.Class<?> wildcardClass15 = preloaded3.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(region10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(region13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        preloaded3.clearCachedSource();
        java.lang.String str10 = preloaded3.getLine(100);
        com.google.javascript.jscomp.Region region12 = preloaded3.getRegion((int) ' ');
        preloaded3.clearCachedSource();
        boolean boolean14 = preloaded3.hasSourceInMemory();
        java.lang.String str15 = preloaded3.getName();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(region12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        java.lang.String str7 = generated2.getCodeNoCache();
        generated2.setOriginalPath("");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        com.google.javascript.jscomp.SourceFile sourceFile4 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        java.lang.String str5 = sourceFile4.getOriginalPath();
        java.io.Reader reader6 = sourceFile4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile7 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader6);
        java.lang.String str8 = sourceFile7.getName();
        java.lang.String str9 = sourceFile7.getCode();
        org.junit.Assert.assertNotNull(sourceFile4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(reader6);
        org.junit.Assert.assertNotNull(sourceFile7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        int int7 = preloaded3.getNumLines();
        boolean boolean8 = preloaded3.isExtern();
        int int9 = preloaded3.getNumLines();
        int int10 = preloaded3.getNumLines();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        preloaded3.clearCachedSource();
        int int9 = preloaded3.getNumLines();
        java.lang.String str10 = preloaded3.getCode();
        java.lang.String str12 = preloaded3.getLine(1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        com.google.javascript.jscomp.Region region6 = preloaded3.getRegion(0);
        java.lang.Class<?> wildcardClass7 = region6.getClass();
        org.junit.Assert.assertNotNull(region6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        int int7 = preloaded3.getNumLines();
        boolean boolean8 = preloaded3.isExtern();
        boolean boolean9 = preloaded3.isExtern();
        java.io.Reader reader10 = preloaded3.getCodeReader();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = preloaded3.getLineOffset(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(reader10);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded4.toString();
        int int8 = preloaded4.getNumLines();
        com.google.javascript.jscomp.Region region10 = preloaded4.getRegion((int) '#');
        boolean boolean11 = preloaded4.isExtern();
        int int12 = preloaded4.getNumLines();
        java.lang.String str13 = preloaded4.getCodeNoCache();
        java.io.Reader reader14 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile15 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader14);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(region10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(reader14);
        org.junit.Assert.assertNotNull(sourceFile15);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        int int4 = preloaded3.getNumLines();
        java.lang.String str5 = preloaded3.getCodeNoCache();
        java.lang.String str6 = preloaded3.toString();
        preloaded3.setOriginalPath("");
        java.lang.String str9 = preloaded3.getCode();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("hi!");
        java.lang.String str2 = sourceFile1.toString();
        sourceFile1.setOriginalPath("");
        java.lang.Class<?> wildcardClass5 = sourceFile1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        boolean boolean10 = preloaded3.isExtern();
        java.lang.String str11 = preloaded3.getOriginalPath();
        boolean boolean12 = preloaded3.hasSourceInMemory();
        preloaded3.clearCachedSource();
        java.lang.String str14 = preloaded3.getCodeNoCache();
        java.lang.String str15 = preloaded3.getOriginalPath();
        int int16 = preloaded3.getNumLines();
        preloaded3.setIsExtern(true);
        java.lang.Class<?> wildcardClass19 = preloaded3.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        java.lang.String str7 = generated2.getCodeNoCache();
        java.lang.String str8 = generated2.getName();
        // The following exception was thrown during execution in test generation
        try {
            java.io.Reader reader9 = generated2.getCodeReader();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        preloaded3.clearCachedSource();
        java.lang.String str10 = preloaded3.getLine(100);
        com.google.javascript.jscomp.Region region12 = preloaded3.getRegion((int) ' ');
        int int13 = preloaded3.getNumLines();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(region12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        boolean boolean3 = preloaded2.hasSourceInMemory();
        com.google.javascript.jscomp.Region region5 = preloaded2.getRegion((int) (short) 10);
        java.lang.String str6 = preloaded2.getCodeNoCache();
        preloaded2.clearCachedSource();
        java.lang.String str8 = preloaded2.getCodeNoCache();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(region5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        boolean boolean10 = preloaded3.isExtern();
        boolean boolean11 = preloaded3.isExtern();
        java.lang.String str12 = preloaded3.getOriginalPath();
        preloaded3.setOriginalPath("");
        java.lang.String str15 = preloaded3.getOriginalPath();
        java.lang.String str17 = preloaded3.getLine((int) '#');
        java.lang.String str18 = preloaded3.toString();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.setOriginalPath("");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        java.lang.String str4 = sourceFile3.toString();
        boolean boolean5 = sourceFile3.hasSourceInMemory();
        java.lang.String str6 = sourceFile3.getName();
        java.lang.String str7 = sourceFile3.getName();
        java.lang.String str8 = sourceFile3.getOriginalPath();
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        int int7 = preloaded3.getNumLines();
        java.lang.String str9 = preloaded3.getLine((int) (byte) 10);
        preloaded3.clearCachedSource();
        int int11 = preloaded3.getNumLines();
        int int12 = preloaded3.getNumLines();
        preloaded3.clearCachedSource();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str5 = preloaded3.getName();
        java.lang.String str7 = preloaded3.getLine(0);
        java.lang.String str8 = preloaded3.getCode();
        boolean boolean9 = preloaded3.hasSourceInMemory();
        java.lang.Class<?> wildcardClass10 = preloaded3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        boolean boolean8 = preloaded3.isExtern();
        boolean boolean9 = preloaded3.hasSourceInMemory();
        java.lang.String str10 = preloaded3.getName();
        preloaded3.clearCachedSource();
        java.lang.String str13 = preloaded3.getLine((int) (short) -1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.getName();
        java.lang.String str11 = sourceFile9.getCode();
        java.lang.String str12 = sourceFile9.getCode();
        int int13 = sourceFile9.getNumLines();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setIsExtern(true);
        generated2.clearCachedSource();
        java.lang.String str8 = generated2.toString();
        generated2.clearCachedSource();
        java.lang.Class<?> wildcardClass10 = generated2.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        boolean boolean10 = preloaded3.isExtern();
        java.lang.String str11 = preloaded3.getOriginalPath();
        boolean boolean12 = preloaded3.hasSourceInMemory();
        preloaded3.clearCachedSource();
        java.lang.String str14 = preloaded3.getCodeNoCache();
        java.lang.String str15 = preloaded3.toString();
        java.lang.Class<?> wildcardClass16 = preloaded3.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        boolean boolean10 = preloaded3.isExtern();
        boolean boolean11 = preloaded3.isExtern();
        java.lang.String str12 = preloaded3.getOriginalPath();
        preloaded3.setOriginalPath("");
        preloaded3.clearCachedSource();
        java.lang.String str16 = preloaded3.getOriginalPath();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        java.lang.String str8 = generated2.getOriginalPath();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.getCode();
        int int7 = preloaded3.getNumLines();
        java.lang.String str8 = preloaded3.getName();
        boolean boolean9 = preloaded3.hasSourceInMemory();
        java.lang.String str10 = preloaded3.getOriginalPath();
        preloaded3.setIsExtern(true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!", "");
        java.lang.String str4 = preloaded3.getName();
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.toString();
        preloaded3.setOriginalPath("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.getOriginalPath();
        java.lang.String str11 = sourceFile9.getName();
        boolean boolean12 = sourceFile9.isExtern();
        com.google.javascript.jscomp.Region region14 = sourceFile9.getRegion((int) (short) 10);
        sourceFile9.setOriginalPath("");
        int int17 = sourceFile9.getNumLines();
        // The following exception was thrown during execution in test generation
        try {
            int int19 = sourceFile9.getLineOffset(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(region14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        boolean boolean10 = preloaded3.isExtern();
        boolean boolean11 = preloaded3.isExtern();
        int int13 = preloaded3.getLineOffset(1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        java.lang.String str7 = generated2.getCodeNoCache();
        generated2.setOriginalPath("");
        generated2.clearCachedSource();
        generated2.setOriginalPath("");
        java.lang.String str13 = generated2.getOriginalPath();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        boolean boolean10 = preloaded3.isExtern();
        java.lang.String str11 = preloaded3.getOriginalPath();
        boolean boolean12 = preloaded3.hasSourceInMemory();
        preloaded3.clearCachedSource();
        java.lang.String str14 = preloaded3.getCodeNoCache();
        java.lang.String str15 = preloaded3.getName();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        boolean boolean11 = generated2.isExtern();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = generated2.getNumLines();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        boolean boolean5 = preloaded3.hasSourceInMemory();
        java.lang.String str6 = preloaded3.getName();
        com.google.javascript.jscomp.Region region8 = preloaded3.getRegion((int) (short) 0);
        java.lang.String str9 = preloaded3.getOriginalPath();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(region8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        int int7 = preloaded3.getNumLines();
        java.lang.String str9 = preloaded3.getLine((int) (byte) 10);
        preloaded3.clearCachedSource();
        boolean boolean11 = preloaded3.hasSourceInMemory();
        java.lang.String str12 = preloaded3.getCode();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset1);
        java.lang.String str3 = sourceFile2.getOriginalPath();
        int int4 = sourceFile2.getNumLines();
        java.lang.String str5 = sourceFile2.toString();
        java.lang.String str6 = sourceFile2.getOriginalPath();
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("hi!");
        boolean boolean2 = sourceFile1.hasSourceInMemory();
        boolean boolean3 = sourceFile1.hasSourceInMemory();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", generator1);
        boolean boolean3 = sourceFile2.isExtern();
        java.lang.String str4 = sourceFile2.toString();
        java.lang.String str5 = sourceFile2.toString();
        sourceFile2.setIsExtern(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = sourceFile2.getLine(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!");
        java.lang.String str3 = sourceFile2.getCode();
        java.lang.String str4 = sourceFile2.getOriginalPath();
        java.lang.String str5 = sourceFile2.getCode();
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        preloaded2.setIsExtern(true);
        boolean boolean5 = preloaded2.isExtern();
        preloaded2.clearCachedSource();
        com.google.javascript.jscomp.Region region8 = preloaded2.getRegion((int) (short) 1);
        java.lang.String str9 = preloaded2.getName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(region8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        boolean boolean5 = preloaded3.hasSourceInMemory();
        java.lang.String str7 = preloaded3.getLine((int) 'a');
        int int8 = preloaded3.getNumLines();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = preloaded3.getLineOffset(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        preloaded3.setIsExtern(true);
        preloaded3.clearCachedSource();
        java.lang.String str11 = preloaded3.getOriginalPath();
        int int12 = preloaded3.getNumLines();
        java.lang.String str13 = preloaded3.getName();
        java.lang.String str14 = preloaded3.getName();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.setOriginalPath("");
        java.lang.String str6 = generated2.getOriginalPath();
        generated2.setIsExtern(true);
        java.lang.String str9 = generated2.getName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.toString();
        java.io.Reader reader11 = sourceFile9.getCodeReader();
        java.lang.String str12 = sourceFile9.getCodeNoCache();
        int int13 = sourceFile9.getNumLines();
        sourceFile9.setOriginalPath("hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(reader11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        preloaded3.clearCachedSource();
        java.lang.String str10 = preloaded3.getLine(100);
        com.google.javascript.jscomp.Region region12 = preloaded3.getRegion((int) ' ');
        java.lang.String str13 = preloaded3.getOriginalPath();
        java.lang.String str15 = preloaded3.getLine((int) (short) -1);
        preloaded3.setOriginalPath("");
        preloaded3.setIsExtern(false);
        java.lang.String str20 = preloaded3.getCodeNoCache();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(region12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setIsExtern(true);
        generated2.clearCachedSource();
        java.lang.String str8 = generated2.toString();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setOriginalPath("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = generated2.getLine(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.getCode();
        java.lang.String str8 = preloaded3.getLine((int) (byte) 100);
        preloaded3.setIsExtern(false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        boolean boolean5 = preloaded3.hasSourceInMemory();
        java.lang.String str6 = preloaded3.getName();
        com.google.javascript.jscomp.Region region8 = preloaded3.getRegion((int) (short) 0);
        boolean boolean9 = preloaded3.hasSourceInMemory();
        java.lang.String str10 = preloaded3.getOriginalPath();
        java.io.Reader reader11 = preloaded3.getCodeReader();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(region8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(reader11);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setOriginalPath("hi!");
        generated2.setIsExtern(false);
        // The following exception was thrown during execution in test generation
        try {
            java.io.Reader reader10 = generated2.getCodeReader();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        int int4 = preloaded3.getNumLines();
        java.lang.String str5 = preloaded3.getCodeNoCache();
        java.lang.String str6 = preloaded3.toString();
        java.lang.String str7 = preloaded3.getName();
        java.lang.Class<?> wildcardClass8 = preloaded3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded5 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str7 = preloaded5.getLine((int) (byte) 10);
        boolean boolean8 = preloaded5.isExtern();
        java.io.Reader reader9 = preloaded5.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile10 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader9);
        com.google.javascript.jscomp.SourceFile sourceFile11 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader9);
        sourceFile11.setIsExtern(false);
        com.google.javascript.jscomp.Region region15 = sourceFile11.getRegion((int) (byte) 1);
        int int16 = sourceFile11.getNumLines();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(reader9);
        org.junit.Assert.assertNotNull(sourceFile10);
        org.junit.Assert.assertNotNull(sourceFile11);
        org.junit.Assert.assertNull(region15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.getOriginalPath();
        sourceFile9.setOriginalPath("");
        int int13 = sourceFile9.getNumLines();
        sourceFile9.setOriginalPath("");
        sourceFile9.setIsExtern(false);
        java.lang.String str18 = sourceFile9.getCode();
        sourceFile9.setIsExtern(true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        boolean boolean9 = generated2.hasSourceInMemory();
        boolean boolean10 = generated2.hasSourceInMemory();
        generated2.setIsExtern(false);
        generated2.clearCachedSource();
        java.lang.String str14 = generated2.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = generated2.getLineOffset(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        boolean boolean8 = generated2.hasSourceInMemory();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Region region10 = generated2.getRegion((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        boolean boolean7 = preloaded3.hasSourceInMemory();
        java.lang.String str9 = preloaded3.getLine((int) (short) 0);
        java.lang.String str10 = preloaded3.getCode();
        preloaded3.setIsExtern(true);
        boolean boolean13 = preloaded3.isExtern();
        java.lang.String str15 = preloaded3.getLine((int) (short) -1);
        java.lang.Class<?> wildcardClass16 = preloaded3.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        boolean boolean7 = preloaded3.hasSourceInMemory();
        boolean boolean8 = preloaded3.hasSourceInMemory();
        preloaded3.clearCachedSource();
        java.lang.String str10 = preloaded3.getCode();
        preloaded3.clearCachedSource();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        boolean boolean10 = preloaded3.isExtern();
        java.lang.String str11 = preloaded3.getOriginalPath();
        boolean boolean12 = preloaded3.hasSourceInMemory();
        preloaded3.setIsExtern(true);
        com.google.javascript.jscomp.Region region16 = preloaded3.getRegion((-1));
        boolean boolean17 = preloaded3.hasSourceInMemory();
        boolean boolean18 = preloaded3.hasSourceInMemory();
        java.lang.String str20 = preloaded3.getLine(0);
        preloaded3.setOriginalPath("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(region16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        java.lang.String str8 = generated2.getOriginalPath();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setIsExtern(true);
        java.lang.String str14 = generated2.getOriginalPath();
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        int int4 = preloaded3.getNumLines();
        java.lang.String str5 = preloaded3.toString();
        int int6 = preloaded3.getNumLines();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        java.lang.String str8 = preloaded3.getOriginalPath();
        com.google.javascript.jscomp.Region region10 = preloaded3.getRegion((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(region10);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        int int4 = preloaded3.getNumLines();
        java.lang.String str5 = preloaded3.toString();
        int int6 = preloaded3.getNumLines();
        preloaded3.clearCachedSource();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.getCode();
        int int7 = preloaded3.getNumLines();
        java.lang.String str8 = preloaded3.getName();
        boolean boolean9 = preloaded3.hasSourceInMemory();
        java.lang.String str10 = preloaded3.getName();
        java.lang.String str12 = preloaded3.getLine((int) '#');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "", "hi!");
        java.lang.String str4 = sourceFile3.getCode();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = sourceFile3.getLineOffset((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        int int8 = preloaded3.getNumLines();
        java.lang.String str9 = preloaded3.getOriginalPath();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = preloaded3.getLineOffset((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        java.lang.String str7 = generated2.getCodeNoCache();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = generated2.getLine((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str5 = preloaded3.getOriginalPath();
        preloaded3.setOriginalPath("");
        java.lang.String str8 = preloaded3.getCodeNoCache();
        java.lang.String str9 = preloaded3.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "", "");
        java.lang.String str5 = sourceFile3.getLine((int) (short) -1);
        java.lang.String str7 = sourceFile3.getLine((int) (short) 10);
        java.lang.String str8 = sourceFile3.getOriginalPath();
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded5 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "");
        java.io.Reader reader6 = preloaded5.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile7 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader6);
        com.google.javascript.jscomp.SourceFile sourceFile8 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader6);
        java.lang.String str9 = sourceFile8.getCode();
        java.io.Reader reader10 = sourceFile8.getCodeReader();
        java.io.Reader reader11 = sourceFile8.getCodeReader();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile12 = com.google.javascript.jscomp.SourceFile.fromReader("", reader11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader6);
        org.junit.Assert.assertNotNull(sourceFile7);
        org.junit.Assert.assertNotNull(sourceFile8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(reader10);
        org.junit.Assert.assertNotNull(reader11);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        boolean boolean3 = preloaded2.hasSourceInMemory();
        preloaded2.clearCachedSource();
        java.lang.String str5 = preloaded2.getCodeNoCache();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        java.lang.String str8 = preloaded4.getLine(10);
        boolean boolean9 = preloaded4.isExtern();
        boolean boolean10 = preloaded4.hasSourceInMemory();
        java.io.Reader reader11 = preloaded4.getCodeReader();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile12 = com.google.javascript.jscomp.SourceFile.fromReader("", reader11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(reader11);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        int int9 = preloaded3.getLineOffset(1);
        java.lang.Class<?> wildcardClass10 = preloaded3.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        preloaded3.clearCachedSource();
        java.lang.String str10 = preloaded3.getLine(100);
        com.google.javascript.jscomp.Region region12 = preloaded3.getRegion((int) ' ');
        java.lang.String str13 = preloaded3.getOriginalPath();
        java.lang.String str15 = preloaded3.getLine((int) (short) -1);
        preloaded3.setOriginalPath("");
        preloaded3.setIsExtern(false);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = preloaded3.getLineOffset((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(region12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        int int4 = preloaded3.getNumLines();
        java.lang.String str5 = preloaded3.getCodeNoCache();
        java.lang.String str6 = preloaded3.toString();
        preloaded3.setOriginalPath("");
        preloaded3.setOriginalPath("hi!");
        java.lang.String str11 = preloaded3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.getOriginalPath();
        java.lang.String str11 = sourceFile9.getName();
        com.google.javascript.jscomp.Region region13 = sourceFile9.getRegion((int) (byte) -1);
        java.lang.String str14 = sourceFile9.getCodeNoCache();
        java.lang.String str15 = sourceFile9.getName();
        com.google.javascript.jscomp.Region region17 = sourceFile9.getRegion((int) (short) 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(region13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(region17);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        boolean boolean8 = preloaded3.isExtern();
        boolean boolean9 = preloaded3.hasSourceInMemory();
        java.lang.String str10 = preloaded3.getCode();
        preloaded3.setIsExtern(true);
        java.lang.String str13 = preloaded3.toString();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.getOriginalPath();
        java.lang.String str12 = sourceFile9.getLine(10);
        sourceFile9.setIsExtern(false);
        java.lang.String str15 = sourceFile9.getName();
        sourceFile9.setOriginalPath("");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        boolean boolean8 = generated2.hasSourceInMemory();
        generated2.setOriginalPath("");
        generated2.clearCachedSource();
        generated2.setOriginalPath("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = generated2.getLine((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.getName();
        java.lang.String str11 = sourceFile9.getCode();
        java.io.Reader reader12 = sourceFile9.getCodeReader();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(reader12);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        boolean boolean8 = preloaded3.isExtern();
        preloaded3.setIsExtern(true);
        preloaded3.setOriginalPath("hi!");
        java.lang.String str13 = preloaded3.getCodeNoCache();
        boolean boolean14 = preloaded3.isExtern();
        java.lang.String str16 = preloaded3.getLine((int) (short) -1);
        int int17 = preloaded3.getNumLines();
        java.lang.Class<?> wildcardClass18 = preloaded3.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        java.lang.String str7 = generated2.getCodeNoCache();
        generated2.setIsExtern(false);
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = generated2.getLineOffset((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        boolean boolean8 = preloaded3.isExtern();
        boolean boolean9 = preloaded3.hasSourceInMemory();
        java.lang.String str10 = preloaded3.getName();
        java.lang.String str11 = preloaded3.getName();
        boolean boolean12 = preloaded3.hasSourceInMemory();
        java.lang.String str13 = preloaded3.getName();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        java.lang.String str8 = preloaded3.getOriginalPath();
        java.lang.String str9 = preloaded3.toString();
        com.google.javascript.jscomp.Region region11 = preloaded3.getRegion((int) (byte) 1);
        java.lang.String str12 = preloaded3.getName();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(region11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded6 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str8 = preloaded6.getLine((int) (byte) 10);
        boolean boolean9 = preloaded6.isExtern();
        java.io.Reader reader10 = preloaded6.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile11 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader10);
        com.google.javascript.jscomp.SourceFile sourceFile12 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader10);
        com.google.javascript.jscomp.SourceFile sourceFile13 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader10);
        sourceFile13.setOriginalPath("hi!");
        java.lang.String str17 = sourceFile13.getLine(100);
        boolean boolean18 = sourceFile13.hasSourceInMemory();
        java.lang.String str20 = sourceFile13.getLine((int) (byte) 10);
        sourceFile13.setIsExtern(false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(reader10);
        org.junit.Assert.assertNotNull(sourceFile11);
        org.junit.Assert.assertNotNull(sourceFile12);
        org.junit.Assert.assertNotNull(sourceFile13);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        preloaded3.setIsExtern(true);
        preloaded3.clearCachedSource();
        java.lang.String str11 = preloaded3.getOriginalPath();
        java.lang.String str13 = preloaded3.getLine((int) (short) 1);
        boolean boolean14 = preloaded3.hasSourceInMemory();
        preloaded3.clearCachedSource();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        preloaded2.setIsExtern(true);
        int int5 = preloaded2.getNumLines();
        java.io.Reader reader6 = preloaded2.getCodeReader();
        preloaded2.clearCachedSource();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(reader6);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        preloaded3.setOriginalPath("");
        java.lang.String str12 = preloaded3.getName();
        java.lang.String str13 = preloaded3.getCode();
        boolean boolean14 = preloaded3.hasSourceInMemory();
        java.io.Reader reader15 = preloaded3.getCodeReader();
        preloaded3.setIsExtern(true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(reader15);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        preloaded3.setIsExtern(true);
        preloaded3.clearCachedSource();
        java.lang.String str11 = preloaded3.getOriginalPath();
        int int12 = preloaded3.getNumLines();
        java.lang.String str13 = preloaded3.getName();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = preloaded3.getLineOffset((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        int int4 = preloaded3.getNumLines();
        java.lang.String str5 = preloaded3.getCodeNoCache();
        java.lang.String str6 = preloaded3.getCodeNoCache();
        int int7 = preloaded3.getNumLines();
        preloaded3.clearCachedSource();
        preloaded3.setOriginalPath("");
        java.lang.String str12 = preloaded3.getLine(1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = preloaded3.getLineOffset((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        java.lang.String str8 = preloaded3.getOriginalPath();
        preloaded3.setOriginalPath("hi!");
        preloaded3.setIsExtern(true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        preloaded3.clearCachedSource();
        java.lang.String str9 = preloaded3.toString();
        int int10 = preloaded3.getNumLines();
        java.lang.String str11 = preloaded3.getCode();
        java.lang.String str12 = preloaded3.getCode();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        java.lang.String str3 = preloaded2.getName();
        java.io.Reader reader4 = preloaded2.getCodeReader();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(reader4);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        boolean boolean8 = preloaded3.isExtern();
        preloaded3.setIsExtern(true);
        preloaded3.setOriginalPath("hi!");
        preloaded3.setIsExtern(false);
        java.lang.String str15 = preloaded3.getCode();
        com.google.javascript.jscomp.Region region17 = preloaded3.getRegion((int) (short) 100);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(region17);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!", "hi!");
        java.io.Reader reader5 = preloaded4.getCodeReader();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile6 = com.google.javascript.jscomp.SourceFile.fromReader("", reader5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader5);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        sourceFile3.clearCachedSource();
        sourceFile3.setIsExtern(false);
        sourceFile3.setIsExtern(true);
        java.lang.String str9 = sourceFile3.getCodeNoCache();
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        boolean boolean3 = generated2.isExtern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        preloaded3.clearCachedSource();
        java.lang.String str10 = preloaded3.getLine(100);
        com.google.javascript.jscomp.Region region12 = preloaded3.getRegion((int) ' ');
        java.lang.String str13 = preloaded3.getOriginalPath();
        preloaded3.setOriginalPath("");
        java.lang.String str16 = preloaded3.getName();
        preloaded3.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            int int19 = preloaded3.getLineOffset((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(region12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.lang.String str7 = preloaded3.getOriginalPath();
        preloaded3.setIsExtern(true);
        com.google.javascript.jscomp.Region region11 = preloaded3.getRegion(10);
        java.lang.String str12 = preloaded3.getName();
        java.lang.String str13 = preloaded3.getName();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(region11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        java.lang.String str4 = sourceFile3.getCode();
        int int5 = sourceFile3.getNumLines();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = sourceFile3.getLineOffset(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        java.lang.String str5 = sourceFile3.getLine((int) (short) 0);
        java.lang.String str7 = sourceFile3.getLine((int) (byte) 100);
        java.lang.String str9 = sourceFile3.getLine((int) (short) 100);
        java.lang.String str10 = sourceFile3.getName();
        java.lang.Class<?> wildcardClass11 = sourceFile3.getClass();
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        java.lang.String str8 = preloaded3.getOriginalPath();
        java.lang.String str9 = preloaded3.getCode();
        preloaded3.setIsExtern(false);
        com.google.javascript.jscomp.Region region13 = preloaded3.getRegion(0);
        java.lang.String str14 = preloaded3.getName();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(region13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        java.lang.String str8 = generated2.getOriginalPath();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        java.lang.String str12 = generated2.getCodeNoCache();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        boolean boolean4 = sourceFile3.isExtern();
        int int5 = sourceFile3.getNumLines();
        java.lang.String str6 = sourceFile3.toString();
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        preloaded3.clearCachedSource();
        java.lang.String str10 = preloaded3.getLine(100);
        com.google.javascript.jscomp.Region region12 = preloaded3.getRegion((int) ' ');
        java.lang.String str13 = preloaded3.getOriginalPath();
        preloaded3.setOriginalPath("");
        java.lang.String str16 = preloaded3.getName();
        java.lang.Class<?> wildcardClass17 = preloaded3.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(region12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        preloaded3.clearCachedSource();
        java.lang.String str9 = preloaded3.getCode();
        java.io.Reader reader10 = preloaded3.getCodeReader();
        boolean boolean11 = preloaded3.isExtern();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(reader10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        boolean boolean10 = preloaded3.isExtern();
        int int11 = preloaded3.getNumLines();
        java.lang.String str12 = preloaded3.getCodeNoCache();
        java.io.Reader reader13 = preloaded3.getCodeReader();
        com.google.javascript.jscomp.Region region15 = preloaded3.getRegion((int) 'a');
        java.io.Reader reader16 = preloaded3.getCodeReader();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(reader13);
        org.junit.Assert.assertNull(region15);
        org.junit.Assert.assertNotNull(reader16);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded5 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str7 = preloaded5.getLine((int) (byte) 10);
        java.lang.String str8 = preloaded5.toString();
        int int9 = preloaded5.getNumLines();
        com.google.javascript.jscomp.Region region11 = preloaded5.getRegion((int) '#');
        boolean boolean12 = preloaded5.isExtern();
        boolean boolean13 = preloaded5.isExtern();
        java.lang.String str14 = preloaded5.getOriginalPath();
        java.lang.String str15 = preloaded5.toString();
        java.io.Reader reader16 = preloaded5.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile17 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader16);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile18 = com.google.javascript.jscomp.SourceFile.fromReader("", reader16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(region11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(reader16);
        org.junit.Assert.assertNotNull(sourceFile17);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        java.lang.String str3 = sourceFile2.getName();
        sourceFile2.setIsExtern(false);
        java.lang.String str7 = sourceFile2.getLine(1);
        java.lang.String str8 = sourceFile2.getName();
        boolean boolean9 = sourceFile2.hasSourceInMemory();
        java.lang.String str10 = sourceFile2.getCodeNoCache();
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        boolean boolean10 = preloaded3.isExtern();
        int int11 = preloaded3.getNumLines();
        java.lang.String str12 = preloaded3.getCodeNoCache();
        java.io.Reader reader13 = preloaded3.getCodeReader();
        java.lang.String str14 = preloaded3.getName();
        java.lang.Class<?> wildcardClass15 = preloaded3.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(reader13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        java.lang.String str8 = preloaded3.getOriginalPath();
        java.lang.String str9 = preloaded3.toString();
        int int10 = preloaded3.getNumLines();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = preloaded3.getLineOffset((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        java.lang.String str9 = preloaded3.getLine((int) '#');
        int int10 = preloaded3.getNumLines();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded4.toString();
        int int8 = preloaded4.getNumLines();
        com.google.javascript.jscomp.Region region10 = preloaded4.getRegion((int) '#');
        java.lang.String str11 = preloaded4.toString();
        java.io.Reader reader12 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile13 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader12);
        java.lang.String str15 = sourceFile13.getLine(0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(region10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(reader12);
        org.junit.Assert.assertNotNull(sourceFile13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.setOriginalPath("hi!");
        boolean boolean11 = generated2.hasSourceInMemory();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        int int7 = preloaded3.getNumLines();
        boolean boolean8 = preloaded3.isExtern();
        java.lang.String str9 = preloaded3.getName();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset1);
        sourceFile2.setOriginalPath("");
        org.junit.Assert.assertNotNull(sourceFile2);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        int int7 = preloaded3.getNumLines();
        java.lang.String str9 = preloaded3.getLine((int) (byte) 10);
        preloaded3.clearCachedSource();
        boolean boolean11 = preloaded3.hasSourceInMemory();
        preloaded3.clearCachedSource();
        int int13 = preloaded3.getNumLines();
        java.lang.String str14 = preloaded3.getCode();
        preloaded3.setIsExtern(true);
        preloaded3.setIsExtern(true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.lang.String str7 = preloaded3.getOriginalPath();
        int int8 = preloaded3.getNumLines();
        java.lang.String str9 = preloaded3.getName();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        preloaded3.clearCachedSource();
        int int9 = preloaded3.getNumLines();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        preloaded3.clearCachedSource();
        int int9 = preloaded3.getNumLines();
        java.lang.String str10 = preloaded3.getCode();
        int int11 = preloaded3.getNumLines();
        boolean boolean12 = preloaded3.hasSourceInMemory();
        int int14 = preloaded3.getLineOffset(1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        int int4 = preloaded3.getNumLines();
        java.lang.String str5 = preloaded3.getCodeNoCache();
        java.lang.String str6 = preloaded3.getCodeNoCache();
        int int7 = preloaded3.getNumLines();
        preloaded3.clearCachedSource();
        java.lang.String str9 = preloaded3.getName();
        java.lang.String str10 = preloaded3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        java.lang.String str3 = sourceFile2.getName();
        sourceFile2.setIsExtern(false);
        boolean boolean6 = sourceFile2.isExtern();
        boolean boolean7 = sourceFile2.isExtern();
        java.lang.String str8 = sourceFile2.getOriginalPath();
        boolean boolean9 = sourceFile2.isExtern();
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.getCode();
        int int7 = preloaded3.getNumLines();
        java.lang.String str8 = preloaded3.getName();
        boolean boolean9 = preloaded3.hasSourceInMemory();
        java.lang.String str10 = preloaded3.getName();
        java.lang.String str11 = preloaded3.getOriginalPath();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = preloaded3.getLineOffset((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        boolean boolean7 = preloaded3.hasSourceInMemory();
        boolean boolean8 = preloaded3.hasSourceInMemory();
        boolean boolean9 = preloaded3.hasSourceInMemory();
        java.lang.String str10 = preloaded3.getOriginalPath();
        preloaded3.setIsExtern(false);
        java.lang.Class<?> wildcardClass13 = preloaded3.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        boolean boolean10 = preloaded3.isExtern();
        int int11 = preloaded3.getNumLines();
        java.lang.String str12 = preloaded3.toString();
        com.google.javascript.jscomp.Region region14 = preloaded3.getRegion((int) 'a');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(region14);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.getCode();
        int int7 = preloaded3.getNumLines();
        java.lang.String str8 = preloaded3.getName();
        boolean boolean9 = preloaded3.hasSourceInMemory();
        java.lang.String str10 = preloaded3.getName();
        java.lang.String str11 = preloaded3.getCode();
        com.google.javascript.jscomp.Region region13 = preloaded3.getRegion((int) (short) 100);
        int int15 = preloaded3.getLineOffset((int) (short) 1);
        com.google.javascript.jscomp.Region region17 = preloaded3.getRegion((int) (short) -1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(region13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(region17);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        com.google.javascript.jscomp.Region region11 = sourceFile9.getRegion((int) '#');
        com.google.javascript.jscomp.Region region13 = sourceFile9.getRegion((int) (short) 1);
        sourceFile9.clearCachedSource();
        java.lang.String str15 = sourceFile9.toString();
        java.lang.Class<?> wildcardClass16 = sourceFile9.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertNull(region11);
        org.junit.Assert.assertNull(region13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!", "");
        java.lang.String str4 = preloaded3.getName();
        java.lang.String str6 = preloaded3.getLine((int) (short) 0);
        int int7 = preloaded3.getNumLines();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.setOriginalPath("");
        java.lang.String str6 = generated2.getOriginalPath();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.getName();
        com.google.javascript.jscomp.Region region12 = sourceFile9.getRegion((int) (short) 1);
        com.google.javascript.jscomp.Region region14 = sourceFile9.getRegion(10);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(region12);
        org.junit.Assert.assertNull(region14);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        preloaded2.setIsExtern(true);
        int int5 = preloaded2.getNumLines();
        java.lang.String str7 = preloaded2.getLine(10);
        java.lang.String str9 = preloaded2.getLine(0);
        java.lang.String str10 = preloaded2.getOriginalPath();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        int int4 = preloaded3.getNumLines();
        java.lang.String str5 = preloaded3.getCodeNoCache();
        java.lang.String str6 = preloaded3.toString();
        java.lang.String str7 = preloaded3.getOriginalPath();
        boolean boolean8 = preloaded3.isExtern();
        java.lang.String str9 = preloaded3.getCode();
        java.lang.String str10 = preloaded3.getOriginalPath();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.setOriginalPath("");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = generated2.getNumLines();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset1);
        com.google.javascript.jscomp.Region region4 = sourceFile2.getRegion((int) '4');
        boolean boolean5 = sourceFile2.isExtern();
        java.lang.String str6 = sourceFile2.getCodeNoCache();
        sourceFile2.clearCachedSource();
        sourceFile2.clearCachedSource();
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertNull(region4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        boolean boolean8 = preloaded3.isExtern();
        com.google.javascript.jscomp.Region region10 = preloaded3.getRegion(100);
        java.lang.String str11 = preloaded3.getName();
        java.lang.String str13 = preloaded3.getLine(1);
        preloaded3.setOriginalPath("");
        int int16 = preloaded3.getNumLines();
        java.lang.String str17 = preloaded3.toString();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(region10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        preloaded3.setIsExtern(true);
        preloaded3.clearCachedSource();
        java.lang.String str11 = preloaded3.getOriginalPath();
        java.lang.String str13 = preloaded3.getLine((int) (short) 1);
        java.lang.String str14 = preloaded3.getOriginalPath();
        java.lang.String str15 = preloaded3.getCode();
        java.lang.String str16 = preloaded3.getOriginalPath();
        java.lang.Class<?> wildcardClass17 = preloaded3.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        boolean boolean9 = generated2.hasSourceInMemory();
        boolean boolean10 = generated2.hasSourceInMemory();
        boolean boolean11 = generated2.isExtern();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Region region13 = generated2.getRegion((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        int int4 = preloaded3.getNumLines();
        java.lang.String str5 = preloaded3.getCodeNoCache();
        java.lang.String str6 = preloaded3.toString();
        preloaded3.setOriginalPath("");
        preloaded3.setOriginalPath("hi!");
        preloaded3.setOriginalPath("");
        preloaded3.clearCachedSource();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        java.lang.String str4 = sourceFile3.toString();
        sourceFile3.setOriginalPath("hi!");
        java.lang.String str7 = sourceFile3.getCode();
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("hi!");
        java.lang.String str2 = sourceFile1.getOriginalPath();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!", "");
        java.lang.String str5 = preloaded4.getName();
        preloaded4.setOriginalPath("hi!");
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.Class<?> wildcardClass10 = reader8.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "");
        java.io.Reader reader3 = preloaded2.getCodeReader();
        java.lang.Class<?> wildcardClass4 = preloaded2.getClass();
        org.junit.Assert.assertNotNull(reader3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        int int4 = preloaded3.getNumLines();
        java.lang.String str5 = preloaded3.getCodeNoCache();
        java.lang.String str6 = preloaded3.getCodeNoCache();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        java.lang.Class<?> wildcardClass8 = reader7.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("hi!");
        java.lang.String str2 = sourceFile1.toString();
        sourceFile1.setOriginalPath("");
        java.lang.String str5 = sourceFile1.getCodeNoCache();
        sourceFile1.setOriginalPath("");
        java.lang.String str8 = sourceFile1.getCode();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        preloaded2.setIsExtern(true);
        preloaded2.setIsExtern(true);
        java.lang.String str8 = preloaded2.getLine((int) (byte) 10);
        preloaded2.setOriginalPath("hi!");
        java.lang.String str11 = preloaded2.getCode();
        java.lang.String str13 = preloaded2.getLine((int) '#');
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        boolean boolean11 = generated2.isExtern();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        com.google.javascript.jscomp.Region region11 = sourceFile9.getRegion((int) '#');
        com.google.javascript.jscomp.Region region13 = sourceFile9.getRegion((int) (short) 1);
        sourceFile9.clearCachedSource();
        java.lang.String str15 = sourceFile9.toString();
        java.lang.String str16 = sourceFile9.getCodeNoCache();
        java.lang.String str17 = sourceFile9.getName();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertNull(region11);
        org.junit.Assert.assertNull(region13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        boolean boolean7 = preloaded3.hasSourceInMemory();
        boolean boolean8 = preloaded3.hasSourceInMemory();
        boolean boolean9 = preloaded3.hasSourceInMemory();
        java.lang.String str10 = preloaded3.getOriginalPath();
        java.lang.String str11 = preloaded3.getName();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded5 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str7 = preloaded5.getLine((int) (byte) 10);
        boolean boolean8 = preloaded5.isExtern();
        java.io.Reader reader9 = preloaded5.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile10 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader9);
        sourceFile10.setOriginalPath("hi!");
        int int13 = sourceFile10.getNumLines();
        java.io.Reader reader14 = sourceFile10.getCodeReader();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile15 = com.google.javascript.jscomp.SourceFile.fromReader("", reader14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(reader9);
        org.junit.Assert.assertNotNull(sourceFile10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(reader14);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        boolean boolean5 = preloaded3.hasSourceInMemory();
        java.lang.String str6 = preloaded3.getName();
        java.lang.String str7 = preloaded3.toString();
        java.lang.String str8 = preloaded3.getOriginalPath();
        java.lang.String str10 = preloaded3.getLine((int) (short) 100);
        java.lang.String str11 = preloaded3.getCode();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        com.google.javascript.jscomp.SourceFile sourceFile7 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        java.lang.String str8 = sourceFile7.getOriginalPath();
        java.io.Reader reader9 = sourceFile7.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile10 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader9);
        com.google.javascript.jscomp.SourceFile sourceFile11 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader9);
        com.google.javascript.jscomp.SourceFile sourceFile12 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader9);
        com.google.javascript.jscomp.SourceFile sourceFile13 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader9);
        java.lang.String str15 = sourceFile13.getLine((int) '#');
        boolean boolean16 = sourceFile13.isExtern();
        org.junit.Assert.assertNotNull(sourceFile7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(reader9);
        org.junit.Assert.assertNotNull(sourceFile10);
        org.junit.Assert.assertNotNull(sourceFile11);
        org.junit.Assert.assertNotNull(sourceFile12);
        org.junit.Assert.assertNotNull(sourceFile13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.toString();
        java.io.Reader reader11 = sourceFile9.getCodeReader();
        java.lang.String str12 = sourceFile9.getCode();
        com.google.javascript.jscomp.Region region14 = sourceFile9.getRegion((int) (byte) 10);
        boolean boolean15 = sourceFile9.isExtern();
        java.io.Reader reader16 = sourceFile9.getCodeReader();
        java.lang.String str17 = sourceFile9.getName();
        boolean boolean18 = sourceFile9.hasSourceInMemory();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(reader11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(region14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(reader16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        boolean boolean7 = preloaded3.hasSourceInMemory();
        boolean boolean8 = preloaded3.hasSourceInMemory();
        preloaded3.setOriginalPath("");
        int int11 = preloaded3.getNumLines();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded5 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str7 = preloaded5.getLine((int) (byte) 10);
        boolean boolean8 = preloaded5.isExtern();
        java.io.Reader reader9 = preloaded5.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile10 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader9);
        com.google.javascript.jscomp.SourceFile sourceFile11 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader9);
        sourceFile11.clearCachedSource();
        java.lang.String str14 = sourceFile11.getLine((int) (short) 1);
        sourceFile11.setOriginalPath("");
        com.google.javascript.jscomp.Region region18 = sourceFile11.getRegion((int) (byte) 100);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(reader9);
        org.junit.Assert.assertNotNull(sourceFile10);
        org.junit.Assert.assertNotNull(sourceFile11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(region18);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.setOriginalPath("");
        java.lang.String str6 = generated2.getCodeNoCache();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str5 = preloaded3.getOriginalPath();
        com.google.javascript.jscomp.Region region7 = preloaded3.getRegion((int) (byte) 1);
        boolean boolean8 = preloaded3.hasSourceInMemory();
        java.io.Reader reader9 = preloaded3.getCodeReader();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(region7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(reader9);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine(0);
        java.lang.String str7 = preloaded3.getCode();
        int int8 = preloaded3.getNumLines();
        java.io.Reader reader9 = preloaded3.getCodeReader();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(reader9);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        int int7 = preloaded3.getNumLines();
        boolean boolean8 = preloaded3.isExtern();
        boolean boolean9 = preloaded3.isExtern();
        java.io.Reader reader10 = preloaded3.getCodeReader();
        preloaded3.setOriginalPath("hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(reader10);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        java.lang.String str3 = sourceFile2.getCode();
        boolean boolean4 = sourceFile2.isExtern();
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        int int4 = preloaded3.getNumLines();
        java.lang.String str5 = preloaded3.toString();
        boolean boolean6 = preloaded3.isExtern();
        preloaded3.setOriginalPath("hi!");
        int int9 = preloaded3.getNumLines();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "", "");
        java.lang.String str5 = sourceFile3.getLine((int) (short) -1);
        java.lang.String str6 = sourceFile3.getOriginalPath();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = sourceFile3.getLineOffset((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        boolean boolean10 = preloaded3.isExtern();
        java.lang.String str11 = preloaded3.getOriginalPath();
        boolean boolean12 = preloaded3.hasSourceInMemory();
        preloaded3.clearCachedSource();
        java.lang.String str14 = preloaded3.getCodeNoCache();
        preloaded3.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = preloaded3.getLineOffset((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        int int8 = preloaded3.getNumLines();
        preloaded3.clearCachedSource();
        boolean boolean10 = preloaded3.hasSourceInMemory();
        java.lang.String str11 = preloaded3.getOriginalPath();
        java.lang.Class<?> wildcardClass12 = preloaded3.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        preloaded2.setIsExtern(true);
        boolean boolean5 = preloaded2.isExtern();
        preloaded2.clearCachedSource();
        java.lang.String str7 = preloaded2.getOriginalPath();
        java.lang.String str8 = preloaded2.getName();
        preloaded2.setOriginalPath("hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int12 = preloaded2.getLineOffset((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        java.lang.String str3 = sourceFile2.getName();
        sourceFile2.setIsExtern(false);
        java.lang.String str7 = sourceFile2.getLine(1);
        java.lang.String str8 = sourceFile2.getName();
        boolean boolean9 = sourceFile2.hasSourceInMemory();
        boolean boolean10 = sourceFile2.hasSourceInMemory();
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        preloaded3.clearCachedSource();
        java.lang.String str9 = preloaded3.toString();
        preloaded3.setOriginalPath("hi!");
        com.google.javascript.jscomp.Region region13 = preloaded3.getRegion((int) '4');
        java.lang.String str14 = preloaded3.getCode();
        java.lang.String str15 = preloaded3.getName();
        com.google.javascript.jscomp.Region region17 = preloaded3.getRegion((int) (short) 1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(region13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(region17);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        boolean boolean9 = generated2.hasSourceInMemory();
        boolean boolean10 = generated2.hasSourceInMemory();
        generated2.setIsExtern(false);
        boolean boolean13 = generated2.isExtern();
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            java.io.Reader reader15 = generated2.getCodeReader();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        java.lang.String str4 = sourceFile3.toString();
        boolean boolean5 = sourceFile3.hasSourceInMemory();
        java.lang.String str6 = sourceFile3.getName();
        java.lang.String str7 = sourceFile3.getName();
        java.lang.String str8 = sourceFile3.getCodeNoCache();
        java.lang.Class<?> wildcardClass9 = sourceFile3.getClass();
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        java.lang.String str8 = generated2.getOriginalPath();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded5 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str7 = preloaded5.getLine((int) (byte) 10);
        boolean boolean8 = preloaded5.isExtern();
        java.io.Reader reader9 = preloaded5.getCodeReader();
        java.lang.String str10 = preloaded5.getOriginalPath();
        preloaded5.setOriginalPath("hi!");
        java.lang.String str13 = preloaded5.getName();
        java.io.Reader reader14 = preloaded5.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile15 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader14);
        com.google.javascript.jscomp.SourceFile sourceFile16 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader14);
        java.io.Reader reader17 = sourceFile16.getCodeReader();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(reader9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(reader14);
        org.junit.Assert.assertNotNull(sourceFile15);
        org.junit.Assert.assertNotNull(sourceFile16);
        org.junit.Assert.assertNotNull(reader17);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "");
        int int5 = preloaded3.getLineOffset((int) (byte) 1);
        preloaded3.setIsExtern(false);
        boolean boolean8 = preloaded3.isExtern();
        java.io.Reader reader9 = preloaded3.getCodeReader();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile10 = com.google.javascript.jscomp.SourceFile.fromReader("", reader9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(reader9);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.getOriginalPath();
        sourceFile9.setOriginalPath("");
        boolean boolean13 = sourceFile9.hasSourceInMemory();
        java.lang.String str14 = sourceFile9.getCodeNoCache();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        int int10 = preloaded3.getNumLines();
        java.lang.String str11 = preloaded3.getName();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = preloaded3.getLineOffset((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        com.google.javascript.jscomp.SourceFile sourceFile4 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        sourceFile4.setOriginalPath("");
        sourceFile4.setOriginalPath("");
        java.lang.String str9 = sourceFile4.getCodeNoCache();
        java.io.Reader reader10 = sourceFile4.getCodeReader();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile11 = com.google.javascript.jscomp.SourceFile.fromReader("", reader10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(reader10);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        com.google.javascript.jscomp.Region region8 = preloaded3.getRegion(0);
        java.lang.String str9 = preloaded3.getName();
        preloaded3.clearCachedSource();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(region8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        sourceFile3.setOriginalPath("");
        sourceFile3.setOriginalPath("");
        java.io.Reader reader8 = sourceFile3.getCodeReader();
        com.google.javascript.jscomp.Region region10 = sourceFile3.getRegion(10);
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNull(region10);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        sourceFile3.setOriginalPath("");
        int int7 = sourceFile3.getLineOffset((int) (byte) 1);
        java.lang.Class<?> wildcardClass8 = sourceFile3.getClass();
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", generator1);
        boolean boolean3 = sourceFile2.hasSourceInMemory();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = sourceFile2.getLineOffset((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        int int7 = preloaded3.getNumLines();
        boolean boolean8 = preloaded3.hasSourceInMemory();
        boolean boolean9 = preloaded3.isExtern();
        preloaded3.setOriginalPath("");
        preloaded3.setIsExtern(false);
        java.lang.Class<?> wildcardClass14 = preloaded3.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        int int4 = preloaded3.getNumLines();
        java.lang.String str5 = preloaded3.getCodeNoCache();
        java.lang.String str6 = preloaded3.toString();
        com.google.javascript.jscomp.Region region8 = preloaded3.getRegion((int) ' ');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(region8);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        boolean boolean5 = preloaded3.hasSourceInMemory();
        java.lang.String str6 = preloaded3.getName();
        com.google.javascript.jscomp.Region region8 = preloaded3.getRegion((int) (short) 0);
        boolean boolean9 = preloaded3.hasSourceInMemory();
        int int10 = preloaded3.getNumLines();
        java.lang.String str11 = preloaded3.getCode();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(region8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.getName();
        java.lang.String str11 = sourceFile9.getCode();
        sourceFile9.clearCachedSource();
        java.lang.String str13 = sourceFile9.getOriginalPath();
        java.lang.String str14 = sourceFile9.getName();
        sourceFile9.setOriginalPath("hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded5 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str7 = preloaded5.getLine((int) (byte) 10);
        boolean boolean8 = preloaded5.isExtern();
        java.io.Reader reader9 = preloaded5.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile10 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader9);
        com.google.javascript.jscomp.SourceFile sourceFile11 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader9);
        java.io.Reader reader12 = sourceFile11.getCodeReader();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(reader9);
        org.junit.Assert.assertNotNull(sourceFile10);
        org.junit.Assert.assertNotNull(sourceFile11);
        org.junit.Assert.assertNotNull(reader12);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.getCode();
        int int7 = preloaded3.getNumLines();
        java.lang.String str8 = preloaded3.getName();
        boolean boolean9 = preloaded3.hasSourceInMemory();
        java.lang.String str10 = preloaded3.getName();
        java.lang.String str11 = preloaded3.getCode();
        java.lang.String str12 = preloaded3.getCodeNoCache();
        preloaded3.setOriginalPath("hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        int int4 = preloaded3.getNumLines();
        java.lang.String str5 = preloaded3.getCodeNoCache();
        java.lang.String str6 = preloaded3.toString();
        java.lang.String str7 = preloaded3.getOriginalPath();
        boolean boolean8 = preloaded3.isExtern();
        preloaded3.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = preloaded3.getLineOffset((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded4.toString();
        int int8 = preloaded4.getNumLines();
        com.google.javascript.jscomp.Region region10 = preloaded4.getRegion((int) '#');
        boolean boolean11 = preloaded4.isExtern();
        boolean boolean12 = preloaded4.isExtern();
        java.lang.String str13 = preloaded4.getOriginalPath();
        java.lang.String str14 = preloaded4.toString();
        java.io.Reader reader15 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile16 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader15);
        java.lang.String str17 = sourceFile16.getOriginalPath();
        // The following exception was thrown during execution in test generation
        try {
            int int19 = sourceFile16.getLineOffset((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(region10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(reader15);
        org.junit.Assert.assertNotNull(sourceFile16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        boolean boolean9 = generated2.hasSourceInMemory();
        boolean boolean10 = generated2.hasSourceInMemory();
        generated2.setIsExtern(false);
        boolean boolean13 = generated2.isExtern();
        generated2.setOriginalPath("");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Region region17 = generated2.getRegion((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        preloaded3.setIsExtern(true);
        preloaded3.clearCachedSource();
        java.lang.String str11 = preloaded3.getOriginalPath();
        int int12 = preloaded3.getNumLines();
        java.lang.String str13 = preloaded3.getName();
        preloaded3.setIsExtern(false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        java.lang.String str10 = preloaded3.toString();
        java.io.Reader reader11 = preloaded3.getCodeReader();
        boolean boolean12 = preloaded3.isExtern();
        preloaded3.setIsExtern(false);
        java.lang.String str16 = preloaded3.getLine(1);
        boolean boolean17 = preloaded3.hasSourceInMemory();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(reader11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str5 = preloaded3.getName();
        java.lang.String str7 = preloaded3.getLine(0);
        java.lang.String str8 = preloaded3.getCode();
        preloaded3.setIsExtern(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        preloaded3.clearCachedSource();
        int int9 = preloaded3.getNumLines();
        int int11 = preloaded3.getLineOffset((int) (byte) 1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        int int4 = preloaded3.getNumLines();
        java.lang.String str5 = preloaded3.getCodeNoCache();
        java.lang.String str6 = preloaded3.getCodeNoCache();
        preloaded3.clearCachedSource();
        int int8 = preloaded3.getNumLines();
        java.lang.String str9 = preloaded3.getCodeNoCache();
        java.lang.String str10 = preloaded3.getCode();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = preloaded3.getLineOffset((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        preloaded3.setIsExtern(true);
        java.io.Reader reader10 = preloaded3.getCodeReader();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = preloaded3.getLineOffset((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertNotNull(reader10);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "");
        boolean boolean4 = preloaded3.isExtern();
        java.lang.String str6 = preloaded3.getLine((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        java.lang.String str11 = generated2.getCodeNoCache();
        java.lang.Class<?> wildcardClass12 = generated2.getClass();
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        int int4 = preloaded3.getNumLines();
        java.lang.String str5 = preloaded3.getCodeNoCache();
        java.lang.String str6 = preloaded3.getCodeNoCache();
        int int7 = preloaded3.getNumLines();
        preloaded3.clearCachedSource();
        preloaded3.setOriginalPath("");
        preloaded3.clearCachedSource();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        sourceFile3.setIsExtern(true);
        java.io.Reader reader6 = sourceFile3.getCodeReader();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Region region8 = sourceFile3.getRegion((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertNotNull(reader6);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        preloaded3.clearCachedSource();
        int int9 = preloaded3.getNumLines();
        boolean boolean10 = preloaded3.isExtern();
        java.lang.String str11 = preloaded3.getName();
        java.lang.String str12 = preloaded3.getCodeNoCache();
        java.lang.String str13 = preloaded3.toString();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        java.lang.String str8 = generated2.getOriginalPath();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        boolean boolean12 = generated2.hasSourceInMemory();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        preloaded3.setIsExtern(true);
        preloaded3.clearCachedSource();
        java.lang.String str11 = preloaded3.getOriginalPath();
        java.lang.String str13 = preloaded3.getLine((int) (short) 1);
        boolean boolean14 = preloaded3.hasSourceInMemory();
        java.io.Reader reader15 = preloaded3.getCodeReader();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = preloaded3.getLineOffset((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(reader15);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        preloaded3.clearCachedSource();
        java.lang.String str9 = preloaded3.toString();
        preloaded3.setOriginalPath("hi!");
        preloaded3.setIsExtern(false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        java.lang.String str8 = generated2.getOriginalPath();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setIsExtern(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        int int8 = preloaded3.getNumLines();
        java.lang.String str9 = preloaded3.getOriginalPath();
        preloaded3.setOriginalPath("hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.toString();
        java.io.Reader reader11 = sourceFile9.getCodeReader();
        java.lang.String str12 = sourceFile9.getName();
        boolean boolean13 = sourceFile9.isExtern();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(reader11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        boolean boolean5 = generated2.hasSourceInMemory();
        boolean boolean6 = generated2.hasSourceInMemory();
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = generated2.getLine((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        preloaded3.setIsExtern(true);
        preloaded3.setIsExtern(true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.getName();
        java.io.Reader reader11 = sourceFile9.getCodeReader();
        java.lang.String str12 = sourceFile9.getOriginalPath();
        java.lang.String str13 = sourceFile9.toString();
        java.lang.String str14 = sourceFile9.getCodeNoCache();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(reader11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        preloaded2.setIsExtern(true);
        boolean boolean5 = preloaded2.isExtern();
        preloaded2.clearCachedSource();
        boolean boolean7 = preloaded2.isExtern();
        com.google.javascript.jscomp.Region region9 = preloaded2.getRegion((int) '4');
        java.lang.String str10 = preloaded2.getOriginalPath();
        java.lang.String str11 = preloaded2.getName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.setOriginalPath("");
        java.lang.String str6 = generated2.getCodeNoCache();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = generated2.getLine(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        int int7 = preloaded3.getNumLines();
        boolean boolean8 = preloaded3.isExtern();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = preloaded3.getLineOffset(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!");
        java.lang.String str3 = sourceFile2.getOriginalPath();
        java.io.Reader reader4 = sourceFile2.getCodeReader();
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(reader4);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        java.lang.String str9 = preloaded3.getLine((int) '#');
        boolean boolean10 = preloaded3.isExtern();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        preloaded3.setOriginalPath("");
        java.lang.String str12 = preloaded3.getName();
        java.lang.String str13 = preloaded3.getCode();
        boolean boolean14 = preloaded3.hasSourceInMemory();
        java.io.Reader reader15 = preloaded3.getCodeReader();
        preloaded3.setOriginalPath("hi!");
        boolean boolean18 = preloaded3.hasSourceInMemory();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(reader15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        java.lang.String str8 = generated2.getOriginalPath();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        java.lang.String str8 = preloaded3.toString();
        preloaded3.setIsExtern(true);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = preloaded3.getLineOffset(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        preloaded2.setIsExtern(true);
        boolean boolean5 = preloaded2.isExtern();
        java.lang.String str6 = preloaded2.getName();
        java.lang.String str8 = preloaded2.getLine(100);
        preloaded2.setIsExtern(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.getOriginalPath();
        java.lang.String str12 = sourceFile9.getLine((int) (short) 10);
        java.lang.String str13 = sourceFile9.getCodeNoCache();
        java.lang.String str14 = sourceFile9.getCode();
        sourceFile9.clearCachedSource();
        java.lang.String str17 = sourceFile9.getLine((int) (byte) -1);
        sourceFile9.setOriginalPath("hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        boolean boolean7 = preloaded3.hasSourceInMemory();
        java.lang.String str9 = preloaded3.getLine((int) (short) 0);
        java.lang.String str10 = preloaded3.getCode();
        preloaded3.setIsExtern(true);
        boolean boolean13 = preloaded3.isExtern();
        java.lang.String str15 = preloaded3.getLine((int) (short) -1);
        preloaded3.setOriginalPath("hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        preloaded3.setIsExtern(true);
        preloaded3.clearCachedSource();
        java.lang.String str11 = preloaded3.getOriginalPath();
        java.lang.String str13 = preloaded3.getLine((int) (short) 1);
        boolean boolean14 = preloaded3.hasSourceInMemory();
        java.lang.String str15 = preloaded3.getCode();
        java.lang.String str16 = preloaded3.getCode();
        preloaded3.setOriginalPath("hi!");
        java.lang.String str20 = preloaded3.getLine((int) (short) 1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        boolean boolean9 = generated2.hasSourceInMemory();
        boolean boolean10 = generated2.hasSourceInMemory();
        generated2.setIsExtern(false);
        boolean boolean13 = generated2.isExtern();
        generated2.clearCachedSource();
        java.lang.String str15 = generated2.getOriginalPath();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = generated2.getNumLines();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        preloaded2.setIsExtern(true);
        int int5 = preloaded2.getNumLines();
        java.lang.String str7 = preloaded2.getLine(10);
        java.lang.String str9 = preloaded2.getLine(0);
        java.lang.String str11 = preloaded2.getLine((int) (short) 1);
        int int12 = preloaded2.getNumLines();
        int int13 = preloaded2.getNumLines();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        java.lang.String str8 = preloaded4.getLine(10);
        boolean boolean9 = preloaded4.isExtern();
        boolean boolean10 = preloaded4.hasSourceInMemory();
        java.io.Reader reader11 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile12 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader11);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(reader11);
        org.junit.Assert.assertNotNull(sourceFile12);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.setOriginalPath("");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        boolean boolean8 = preloaded3.isExtern();
        com.google.javascript.jscomp.Region region10 = preloaded3.getRegion(100);
        java.lang.String str11 = preloaded3.getName();
        java.lang.String str13 = preloaded3.getLine(1);
        preloaded3.clearCachedSource();
        java.io.Reader reader15 = preloaded3.getCodeReader();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(region10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(reader15);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded4.toString();
        int int8 = preloaded4.getNumLines();
        com.google.javascript.jscomp.Region region10 = preloaded4.getRegion((int) '#');
        java.lang.String str11 = preloaded4.toString();
        java.io.Reader reader12 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile13 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader12);
        java.lang.String str14 = sourceFile13.getName();
        boolean boolean15 = sourceFile13.isExtern();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(region10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(reader12);
        org.junit.Assert.assertNotNull(sourceFile13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        boolean boolean10 = preloaded3.isExtern();
        java.lang.String str11 = preloaded3.getOriginalPath();
        boolean boolean12 = preloaded3.hasSourceInMemory();
        preloaded3.clearCachedSource();
        java.lang.String str14 = preloaded3.getCodeNoCache();
        preloaded3.setOriginalPath("");
        com.google.javascript.jscomp.Region region18 = preloaded3.getRegion(100);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(region18);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        preloaded2.setIsExtern(true);
        int int5 = preloaded2.getNumLines();
        preloaded2.setIsExtern(false);
        java.io.Reader reader8 = preloaded2.getCodeReader();
        preloaded2.setIsExtern(true);
        java.lang.String str11 = preloaded2.getOriginalPath();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded6 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str8 = preloaded6.getLine((int) (byte) 10);
        boolean boolean9 = preloaded6.isExtern();
        java.io.Reader reader10 = preloaded6.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile11 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader10);
        com.google.javascript.jscomp.SourceFile sourceFile12 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader10);
        com.google.javascript.jscomp.SourceFile sourceFile13 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader10);
        sourceFile13.setOriginalPath("hi!");
        java.lang.String str17 = sourceFile13.getLine(100);
        boolean boolean18 = sourceFile13.hasSourceInMemory();
        java.lang.String str20 = sourceFile13.getLine((int) (byte) 10);
        java.lang.Class<?> wildcardClass21 = sourceFile13.getClass();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(reader10);
        org.junit.Assert.assertNotNull(sourceFile11);
        org.junit.Assert.assertNotNull(sourceFile12);
        org.junit.Assert.assertNotNull(sourceFile13);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        preloaded2.setIsExtern(true);
        int int5 = preloaded2.getNumLines();
        preloaded2.setIsExtern(false);
        int int9 = preloaded2.getLineOffset(1);
        java.io.Reader reader10 = preloaded2.getCodeReader();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(reader10);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        java.lang.String str4 = sourceFile3.getOriginalPath();
        java.lang.Class<?> wildcardClass5 = sourceFile3.getClass();
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.toString();
        java.io.Reader reader11 = sourceFile9.getCodeReader();
        java.lang.String str12 = sourceFile9.getCode();
        com.google.javascript.jscomp.Region region14 = sourceFile9.getRegion((int) (byte) 10);
        java.lang.String str15 = sourceFile9.getCodeNoCache();
        java.lang.String str16 = sourceFile9.getName();
        java.io.Reader reader17 = sourceFile9.getCodeReader();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(reader11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(region14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(reader17);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.toString();
        java.io.Reader reader11 = sourceFile9.getCodeReader();
        java.lang.String str12 = sourceFile9.getCode();
        com.google.javascript.jscomp.Region region14 = sourceFile9.getRegion((int) (byte) 10);
        boolean boolean15 = sourceFile9.isExtern();
        java.io.Reader reader16 = sourceFile9.getCodeReader();
        java.lang.String str18 = sourceFile9.getLine(0);
        sourceFile9.setIsExtern(true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(reader11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(region14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(reader16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        int int7 = preloaded3.getNumLines();
        java.lang.String str9 = preloaded3.getLine((int) (byte) 10);
        preloaded3.clearCachedSource();
        int int11 = preloaded3.getNumLines();
        int int12 = preloaded3.getNumLines();
        java.lang.Class<?> wildcardClass13 = preloaded3.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        int int8 = preloaded3.getNumLines();
        preloaded3.clearCachedSource();
        boolean boolean10 = preloaded3.hasSourceInMemory();
        com.google.javascript.jscomp.Region region12 = preloaded3.getRegion(10);
        java.lang.String str13 = preloaded3.getCodeNoCache();
        preloaded3.clearCachedSource();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(region12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        boolean boolean8 = preloaded3.isExtern();
        preloaded3.setIsExtern(true);
        preloaded3.setOriginalPath("hi!");
        com.google.javascript.jscomp.Region region14 = preloaded3.getRegion((int) '4');
        com.google.javascript.jscomp.Region region16 = preloaded3.getRegion((int) (byte) 1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(region14);
        org.junit.Assert.assertNull(region16);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        int int4 = preloaded3.getNumLines();
        java.lang.String str5 = preloaded3.getCodeNoCache();
        java.lang.String str6 = preloaded3.getCodeNoCache();
        int int7 = preloaded3.getNumLines();
        java.lang.String str8 = preloaded3.getOriginalPath();
        com.google.javascript.jscomp.Region region10 = preloaded3.getRegion(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(region10);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        boolean boolean9 = generated2.hasSourceInMemory();
        boolean boolean10 = generated2.hasSourceInMemory();
        generated2.setIsExtern(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        preloaded3.clearCachedSource();
        java.lang.String str9 = preloaded3.toString();
        preloaded3.setIsExtern(true);
        com.google.javascript.jscomp.Region region13 = preloaded3.getRegion((int) (byte) 100);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(region13);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.getOriginalPath();
        java.lang.String str11 = sourceFile9.getName();
        boolean boolean12 = sourceFile9.isExtern();
        com.google.javascript.jscomp.Region region14 = sourceFile9.getRegion((int) (short) 10);
        sourceFile9.setOriginalPath("");
        int int17 = sourceFile9.getNumLines();
        boolean boolean18 = sourceFile9.hasSourceInMemory();
        boolean boolean19 = sourceFile9.isExtern();
        java.lang.String str20 = sourceFile9.getCodeNoCache();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(region14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        boolean boolean10 = preloaded3.isExtern();
        preloaded3.setOriginalPath("");
        preloaded3.clearCachedSource();
        preloaded3.setIsExtern(false);
        preloaded3.setOriginalPath("hi!");
        java.io.Reader reader18 = preloaded3.getCodeReader();
        java.lang.String str19 = preloaded3.getCodeNoCache();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(reader18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.setOriginalPath("");
        java.lang.String str6 = generated2.getOriginalPath();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Region region8 = generated2.getRegion(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        preloaded3.clearCachedSource();
        java.lang.String str9 = preloaded3.toString();
        com.google.javascript.jscomp.Region region11 = preloaded3.getRegion(10);
        java.io.Reader reader12 = preloaded3.getCodeReader();
        java.lang.Class<?> wildcardClass13 = preloaded3.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(region11);
        org.junit.Assert.assertNotNull(reader12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        java.lang.String str8 = preloaded3.getOriginalPath();
        java.lang.String str9 = preloaded3.getCode();
        preloaded3.setIsExtern(false);
        com.google.javascript.jscomp.Region region13 = preloaded3.getRegion(0);
        java.lang.String str14 = preloaded3.getOriginalPath();
        boolean boolean15 = preloaded3.hasSourceInMemory();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(region13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        boolean boolean7 = preloaded3.hasSourceInMemory();
        java.lang.String str9 = preloaded3.getLine((int) (short) 0);
        java.lang.String str10 = preloaded3.getCode();
        preloaded3.setOriginalPath("");
        java.lang.Class<?> wildcardClass13 = preloaded3.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        java.lang.String str8 = preloaded3.getOriginalPath();
        java.lang.String str9 = preloaded3.toString();
        java.lang.String str10 = preloaded3.getOriginalPath();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        preloaded3.clearCachedSource();
        java.lang.String str9 = preloaded3.toString();
        int int10 = preloaded3.getNumLines();
        preloaded3.setIsExtern(true);
        java.lang.Class<?> wildcardClass13 = preloaded3.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        preloaded3.clearCachedSource();
        java.lang.String str9 = preloaded3.toString();
        boolean boolean10 = preloaded3.hasSourceInMemory();
        java.lang.String str11 = preloaded3.getCode();
        int int12 = preloaded3.getNumLines();
        boolean boolean13 = preloaded3.isExtern();
        preloaded3.clearCachedSource();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.toString();
        java.io.Reader reader11 = sourceFile9.getCodeReader();
        java.lang.String str12 = sourceFile9.getName();
        java.lang.String str13 = sourceFile9.getName();
        boolean boolean14 = sourceFile9.hasSourceInMemory();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = sourceFile9.getLineOffset((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(reader11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        java.lang.String str4 = sourceFile3.getCode();
        java.lang.String str5 = sourceFile3.getCodeNoCache();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Region region7 = sourceFile3.getRegion((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        int int7 = preloaded3.getNumLines();
        boolean boolean8 = preloaded3.hasSourceInMemory();
        int int9 = preloaded3.getNumLines();
        java.lang.String str10 = preloaded3.getCodeNoCache();
        java.lang.String str12 = preloaded3.getLine(0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        java.lang.String str7 = generated2.getName();
        generated2.clearCachedSource();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.getOriginalPath();
        java.lang.String str11 = sourceFile9.getName();
        boolean boolean12 = sourceFile9.isExtern();
        com.google.javascript.jscomp.Region region14 = sourceFile9.getRegion((int) (short) 10);
        sourceFile9.setOriginalPath("");
        int int17 = sourceFile9.getNumLines();
        boolean boolean18 = sourceFile9.hasSourceInMemory();
        boolean boolean19 = sourceFile9.isExtern();
        java.lang.String str21 = sourceFile9.getLine((int) '4');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(region14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        java.lang.String str3 = preloaded2.getCodeNoCache();
        boolean boolean4 = preloaded2.isExtern();
        java.lang.String str5 = preloaded2.getCodeNoCache();
        java.lang.String str6 = preloaded2.getCodeNoCache();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset1);
        boolean boolean3 = sourceFile2.isExtern();
        boolean boolean4 = sourceFile2.isExtern();
        sourceFile2.setIsExtern(true);
        java.lang.String str7 = sourceFile2.toString();
        sourceFile2.clearCachedSource();
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded5 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded5.clearCachedSource();
        java.lang.String str8 = preloaded5.getLine((int) (byte) -1);
        int int9 = preloaded5.getNumLines();
        java.io.Reader reader10 = preloaded5.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile11 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader10);
        com.google.javascript.jscomp.SourceFile sourceFile12 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader10);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(reader10);
        org.junit.Assert.assertNotNull(sourceFile11);
        org.junit.Assert.assertNotNull(sourceFile12);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        preloaded3.clearCachedSource();
        java.lang.String str10 = preloaded3.getLine(100);
        java.lang.String str11 = preloaded3.toString();
        java.lang.String str13 = preloaded3.getLine(100);
        java.lang.String str14 = preloaded3.getCodeNoCache();
        preloaded3.clearCachedSource();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        preloaded3.setOriginalPath("");
        int int13 = preloaded3.getLineOffset((int) (byte) 1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded5 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str7 = preloaded5.getLine((int) (byte) 10);
        java.lang.String str8 = preloaded5.toString();
        int int9 = preloaded5.getNumLines();
        com.google.javascript.jscomp.Region region11 = preloaded5.getRegion((int) '#');
        java.lang.String str12 = preloaded5.toString();
        java.io.Reader reader13 = preloaded5.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile14 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader13);
        com.google.javascript.jscomp.SourceFile sourceFile15 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader13);
        java.lang.Class<?> wildcardClass16 = reader13.getClass();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(region11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(reader13);
        org.junit.Assert.assertNotNull(sourceFile14);
        org.junit.Assert.assertNotNull(sourceFile15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "");
        int int4 = preloaded2.getLineOffset((int) (byte) 1);
        preloaded2.setIsExtern(false);
        boolean boolean7 = preloaded2.isExtern();
        java.io.Reader reader8 = preloaded2.getCodeReader();
        boolean boolean9 = preloaded2.isExtern();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset1);
        boolean boolean3 = sourceFile2.isExtern();
        boolean boolean4 = sourceFile2.isExtern();
        com.google.javascript.jscomp.Region region6 = sourceFile2.getRegion((int) (short) -1);
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(region6);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        int int7 = preloaded3.getNumLines();
        java.lang.String str9 = preloaded3.getLine((int) (byte) 10);
        preloaded3.clearCachedSource();
        int int11 = preloaded3.getNumLines();
        int int12 = preloaded3.getNumLines();
        preloaded3.setIsExtern(true);
        java.lang.String str15 = preloaded3.getCodeNoCache();
        java.lang.String str17 = preloaded3.getLine((int) ' ');
        boolean boolean18 = preloaded3.hasSourceInMemory();
        java.io.Reader reader19 = preloaded3.getCodeReader();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(reader19);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("hi!");
        java.lang.String str2 = sourceFile1.toString();
        sourceFile1.setOriginalPath("");
        java.lang.String str5 = sourceFile1.getCodeNoCache();
        sourceFile1.clearCachedSource();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        com.google.javascript.jscomp.Region region7 = preloaded3.getRegion(100);
        preloaded3.setOriginalPath("");
        boolean boolean10 = preloaded3.isExtern();
        boolean boolean11 = preloaded3.isExtern();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(region7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        preloaded3.clearCachedSource();
        boolean boolean8 = preloaded3.hasSourceInMemory();
        java.lang.String str9 = preloaded3.getName();
        boolean boolean10 = preloaded3.hasSourceInMemory();
        preloaded3.setOriginalPath("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        preloaded3.clearCachedSource();
        java.lang.String str10 = preloaded3.getLine(100);
        com.google.javascript.jscomp.Region region12 = preloaded3.getRegion((int) ' ');
        java.lang.String str13 = preloaded3.getOriginalPath();
        boolean boolean14 = preloaded3.hasSourceInMemory();
        boolean boolean15 = preloaded3.isExtern();
        java.lang.String str16 = preloaded3.toString();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(region12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.setOriginalPath("");
        java.lang.String str6 = generated2.getCodeNoCache();
        java.lang.String str7 = generated2.getCodeNoCache();
        boolean boolean8 = generated2.hasSourceInMemory();
        generated2.clearCachedSource();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded4.toString();
        int int8 = preloaded4.getNumLines();
        com.google.javascript.jscomp.Region region10 = preloaded4.getRegion((int) '#');
        boolean boolean11 = preloaded4.isExtern();
        java.lang.String str12 = preloaded4.getOriginalPath();
        boolean boolean13 = preloaded4.hasSourceInMemory();
        preloaded4.setIsExtern(true);
        boolean boolean16 = preloaded4.isExtern();
        java.lang.String str17 = preloaded4.toString();
        java.io.Reader reader18 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile19 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader18);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(region10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(reader18);
        org.junit.Assert.assertNotNull(sourceFile19);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.getCode();
        int int7 = preloaded3.getNumLines();
        java.lang.String str8 = preloaded3.getName();
        preloaded3.setIsExtern(false);
        boolean boolean11 = preloaded3.hasSourceInMemory();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        java.lang.String str5 = generated2.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = generated2.getLineOffset((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        boolean boolean9 = generated2.hasSourceInMemory();
        boolean boolean10 = generated2.hasSourceInMemory();
        java.lang.String str11 = generated2.getCodeNoCache();
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "");
        java.io.Reader reader5 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile6 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader5);
        com.google.javascript.jscomp.SourceFile sourceFile7 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader5);
        java.lang.String str8 = sourceFile7.getCode();
        java.io.Reader reader9 = sourceFile7.getCodeReader();
        boolean boolean10 = sourceFile7.isExtern();
        int int11 = sourceFile7.getNumLines();
        org.junit.Assert.assertNotNull(reader5);
        org.junit.Assert.assertNotNull(sourceFile6);
        org.junit.Assert.assertNotNull(sourceFile7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(reader9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        sourceFile9.setOriginalPath("hi!");
        java.lang.String str12 = sourceFile9.getCodeNoCache();
        java.lang.String str13 = sourceFile9.getName();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        int int5 = preloaded4.getNumLines();
        java.lang.String str6 = preloaded4.getCodeNoCache();
        java.lang.String str7 = preloaded4.getCodeNoCache();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        int int4 = preloaded3.getNumLines();
        java.lang.String str5 = preloaded3.toString();
        java.lang.String str6 = preloaded3.getCode();
        java.lang.String str7 = preloaded3.toString();
        java.lang.String str8 = preloaded3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        preloaded3.clearCachedSource();
        java.lang.String str10 = preloaded3.getLine(100);
        java.lang.String str11 = preloaded3.toString();
        java.lang.String str13 = preloaded3.getLine(100);
        java.lang.String str15 = preloaded3.getLine((int) '4');
        java.lang.String str16 = preloaded3.getCode();
        java.lang.String str17 = preloaded3.toString();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        boolean boolean9 = generated2.hasSourceInMemory();
        boolean boolean10 = generated2.hasSourceInMemory();
        java.lang.String str11 = generated2.getCodeNoCache();
        boolean boolean12 = generated2.isExtern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded4.toString();
        int int8 = preloaded4.getNumLines();
        com.google.javascript.jscomp.Region region10 = preloaded4.getRegion((int) '#');
        boolean boolean11 = preloaded4.isExtern();
        int int12 = preloaded4.getNumLines();
        java.lang.String str13 = preloaded4.getCodeNoCache();
        preloaded4.clearCachedSource();
        java.io.Reader reader15 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile16 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader15);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(region10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(reader15);
        org.junit.Assert.assertNotNull(sourceFile16);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        java.lang.String str9 = preloaded4.getOriginalPath();
        preloaded4.setOriginalPath("hi!");
        java.lang.String str12 = preloaded4.getName();
        java.io.Reader reader13 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile14 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader13);
        sourceFile14.setIsExtern(false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(reader13);
        org.junit.Assert.assertNotNull(sourceFile14);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.getCode();
        int int7 = preloaded3.getNumLines();
        preloaded3.clearCachedSource();
        preloaded3.setOriginalPath("hi!");
        boolean boolean11 = preloaded3.hasSourceInMemory();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded4.clearCachedSource();
        java.lang.String str7 = preloaded4.getLine((int) (byte) -1);
        int int8 = preloaded4.getNumLines();
        java.io.Reader reader9 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile10 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader9);
        java.lang.String str11 = sourceFile10.getCode();
        java.io.Reader reader12 = sourceFile10.getCodeReader();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(reader9);
        org.junit.Assert.assertNotNull(sourceFile10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(reader12);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        java.lang.String str7 = generated2.toString();
        generated2.clearCachedSource();
        generated2.setOriginalPath("");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        preloaded2.setIsExtern(true);
        int int5 = preloaded2.getNumLines();
        java.lang.String str7 = preloaded2.getLine(10);
        java.lang.String str9 = preloaded2.getLine(0);
        java.lang.String str10 = preloaded2.getName();
        java.lang.String str11 = preloaded2.getCode();
        boolean boolean12 = preloaded2.isExtern();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        preloaded3.setOriginalPath("");
        java.lang.String str12 = preloaded3.getName();
        java.lang.String str13 = preloaded3.getCode();
        boolean boolean14 = preloaded3.hasSourceInMemory();
        int int15 = preloaded3.getNumLines();
        java.lang.String str17 = preloaded3.getLine((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = preloaded3.getLineOffset(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        java.lang.String str3 = sourceFile2.getCode();
        java.lang.String str4 = sourceFile2.toString();
        java.lang.String str6 = sourceFile2.getLine((int) (short) 0);
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.getOriginalPath();
        java.lang.String str11 = sourceFile9.getOriginalPath();
        java.lang.String str12 = sourceFile9.toString();
        java.lang.String str13 = sourceFile9.toString();
        java.lang.String str14 = sourceFile9.toString();
        java.lang.String str15 = sourceFile9.getCodeNoCache();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        java.lang.String str4 = sourceFile3.toString();
        boolean boolean5 = sourceFile3.hasSourceInMemory();
        java.lang.String str6 = sourceFile3.getName();
        int int7 = sourceFile3.getNumLines();
        sourceFile3.clearCachedSource();
        java.lang.Class<?> wildcardClass9 = sourceFile3.getClass();
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.getCode();
        int int7 = preloaded3.getNumLines();
        java.lang.String str8 = preloaded3.getName();
        boolean boolean9 = preloaded3.hasSourceInMemory();
        java.lang.String str10 = preloaded3.getName();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = preloaded3.getLineOffset((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        int int4 = preloaded3.getNumLines();
        java.lang.String str5 = preloaded3.getCodeNoCache();
        java.lang.String str6 = preloaded3.toString();
        java.lang.String str7 = preloaded3.getOriginalPath();
        boolean boolean8 = preloaded3.isExtern();
        java.lang.String str9 = preloaded3.getCode();
        com.google.javascript.jscomp.Region region11 = preloaded3.getRegion((int) (byte) 10);
        java.lang.String str13 = preloaded3.getLine((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(region11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.lang.String str7 = preloaded3.getOriginalPath();
        preloaded3.setIsExtern(true);
        com.google.javascript.jscomp.Region region11 = preloaded3.getRegion(10);
        java.lang.String str12 = preloaded3.getName();
        int int14 = preloaded3.getLineOffset((int) (byte) 1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(region11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        preloaded3.clearCachedSource();
        preloaded3.setIsExtern(false);
        java.lang.String str11 = preloaded3.getCodeNoCache();
        java.lang.String str12 = preloaded3.getCodeNoCache();
        java.io.Reader reader13 = preloaded3.getCodeReader();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(reader13);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        int int8 = preloaded3.getNumLines();
        java.lang.String str9 = preloaded3.getOriginalPath();
        java.lang.String str10 = preloaded3.getOriginalPath();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.getCode();
        int int7 = preloaded3.getNumLines();
        java.lang.String str8 = preloaded3.getName();
        boolean boolean9 = preloaded3.hasSourceInMemory();
        java.lang.String str10 = preloaded3.getName();
        java.lang.String str11 = preloaded3.getCode();
        preloaded3.clearCachedSource();
        java.lang.String str13 = preloaded3.getCode();
        preloaded3.setOriginalPath("hi!");
        java.lang.Class<?> wildcardClass16 = preloaded3.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.toString();
        java.io.Reader reader11 = sourceFile9.getCodeReader();
        java.lang.String str12 = sourceFile9.getCode();
        java.lang.String str14 = sourceFile9.getLine((int) (byte) -1);
        int int15 = sourceFile9.getNumLines();
        java.lang.String str17 = sourceFile9.getLine((int) '4');
        java.lang.String str18 = sourceFile9.getName();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(reader11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        preloaded3.clearCachedSource();
        boolean boolean8 = preloaded3.hasSourceInMemory();
        java.lang.String str9 = preloaded3.getName();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = preloaded3.getLineOffset((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        boolean boolean11 = generated2.isExtern();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            java.io.Reader reader14 = generated2.getCodeReader();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        java.lang.String str5 = sourceFile3.getLine((int) (short) 0);
        java.lang.String str7 = sourceFile3.getLine((int) (byte) 100);
        java.lang.String str9 = sourceFile3.getLine((int) (short) 100);
        java.lang.String str11 = sourceFile3.getLine((int) (short) 1);
        java.lang.String str12 = sourceFile3.toString();
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        boolean boolean10 = preloaded3.isExtern();
        java.lang.String str11 = preloaded3.getOriginalPath();
        java.lang.String str12 = preloaded3.getCodeNoCache();
        java.lang.String str13 = preloaded3.toString();
        int int14 = preloaded3.getNumLines();
        java.lang.String str15 = preloaded3.getCodeNoCache();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        int int4 = preloaded3.getNumLines();
        java.lang.String str5 = preloaded3.getCodeNoCache();
        java.lang.String str6 = preloaded3.getCodeNoCache();
        int int7 = preloaded3.getNumLines();
        preloaded3.clearCachedSource();
        int int9 = preloaded3.getNumLines();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        int int7 = preloaded3.getNumLines();
        boolean boolean8 = preloaded3.isExtern();
        preloaded3.clearCachedSource();
        java.lang.String str10 = preloaded3.toString();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        int int10 = preloaded3.getNumLines();
        preloaded3.setIsExtern(true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        java.lang.String str8 = preloaded3.getOriginalPath();
        preloaded3.setOriginalPath("hi!");
        java.lang.String str11 = preloaded3.getCodeNoCache();
        boolean boolean12 = preloaded3.isExtern();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        java.lang.String str3 = sourceFile2.getName();
        sourceFile2.setIsExtern(false);
        boolean boolean6 = sourceFile2.isExtern();
        java.lang.String str7 = sourceFile2.getCode();
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        boolean boolean10 = preloaded3.isExtern();
        java.lang.String str11 = preloaded3.getOriginalPath();
        boolean boolean12 = preloaded3.hasSourceInMemory();
        java.lang.String str13 = preloaded3.getCode();
        java.lang.String str14 = preloaded3.getCodeNoCache();
        preloaded3.clearCachedSource();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.getOriginalPath();
        sourceFile9.setOriginalPath("");
        int int13 = sourceFile9.getNumLines();
        sourceFile9.setIsExtern(true);
        boolean boolean16 = sourceFile9.hasSourceInMemory();
        sourceFile9.setIsExtern(false);
        java.lang.String str19 = sourceFile9.getCodeNoCache();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        int int4 = preloaded3.getNumLines();
        java.lang.String str5 = preloaded3.getCodeNoCache();
        java.lang.String str6 = preloaded3.getCodeNoCache();
        preloaded3.clearCachedSource();
        int int8 = preloaded3.getNumLines();
        java.lang.String str9 = preloaded3.getCodeNoCache();
        java.lang.String str10 = preloaded3.getCode();
        java.lang.String str11 = preloaded3.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.lang.String str8 = preloaded4.getOriginalPath();
        preloaded4.setIsExtern(true);
        com.google.javascript.jscomp.Region region12 = preloaded4.getRegion(10);
        java.io.Reader reader13 = preloaded4.getCodeReader();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile14 = com.google.javascript.jscomp.SourceFile.fromReader("", reader13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(region12);
        org.junit.Assert.assertNotNull(reader13);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded5 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str7 = preloaded5.getLine((int) (byte) 10);
        boolean boolean8 = preloaded5.isExtern();
        java.io.Reader reader9 = preloaded5.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile10 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader9);
        java.lang.String str11 = sourceFile10.getName();
        java.io.Reader reader12 = sourceFile10.getCodeReader();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile13 = com.google.javascript.jscomp.SourceFile.fromReader("", reader12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(reader9);
        org.junit.Assert.assertNotNull(sourceFile10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(reader12);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        java.lang.String str8 = preloaded3.getOriginalPath();
        boolean boolean9 = preloaded3.hasSourceInMemory();
        java.lang.String str10 = preloaded3.getCode();
        boolean boolean11 = preloaded3.hasSourceInMemory();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        int int10 = preloaded3.getNumLines();
        java.lang.String str11 = preloaded3.getName();
        java.lang.String str12 = preloaded3.getCode();
        boolean boolean13 = preloaded3.isExtern();
        boolean boolean14 = preloaded3.isExtern();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        java.lang.String str7 = generated2.getCodeNoCache();
        java.lang.String str8 = generated2.getName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        preloaded3.setIsExtern(true);
        preloaded3.clearCachedSource();
        java.lang.String str11 = preloaded3.getOriginalPath();
        java.lang.String str13 = preloaded3.getLine((int) (short) 1);
        java.lang.String str14 = preloaded3.getOriginalPath();
        java.lang.String str15 = preloaded3.getCode();
        int int17 = preloaded3.getLineOffset(1);
        java.lang.String str18 = preloaded3.getOriginalPath();
        boolean boolean19 = preloaded3.hasSourceInMemory();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "");
        int int5 = preloaded3.getLineOffset((int) (byte) 1);
        preloaded3.setIsExtern(false);
        java.lang.String str8 = preloaded3.toString();
        int int10 = preloaded3.getLineOffset((int) (byte) 1);
        java.io.Reader reader11 = preloaded3.getCodeReader();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile12 = com.google.javascript.jscomp.SourceFile.fromReader("", reader11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(reader11);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        boolean boolean10 = preloaded3.isExtern();
        java.lang.String str11 = preloaded3.getOriginalPath();
        boolean boolean12 = preloaded3.hasSourceInMemory();
        preloaded3.clearCachedSource();
        java.lang.String str14 = preloaded3.getCodeNoCache();
        preloaded3.setOriginalPath("");
        java.lang.String str17 = preloaded3.toString();
        int int18 = preloaded3.getNumLines();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        preloaded3.setIsExtern(true);
        preloaded3.clearCachedSource();
        java.lang.String str11 = preloaded3.getOriginalPath();
        java.lang.String str13 = preloaded3.getLine((int) (short) 1);
        java.lang.String str14 = preloaded3.getOriginalPath();
        java.lang.String str15 = preloaded3.getCode();
        boolean boolean16 = preloaded3.isExtern();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded6 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str8 = preloaded6.getLine((int) (byte) 10);
        boolean boolean9 = preloaded6.isExtern();
        java.io.Reader reader10 = preloaded6.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile11 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader10);
        com.google.javascript.jscomp.SourceFile sourceFile12 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader10);
        com.google.javascript.jscomp.SourceFile sourceFile13 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader10);
        boolean boolean14 = sourceFile13.hasSourceInMemory();
        java.lang.String str15 = sourceFile13.getCode();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(reader10);
        org.junit.Assert.assertNotNull(sourceFile11);
        org.junit.Assert.assertNotNull(sourceFile12);
        org.junit.Assert.assertNotNull(sourceFile13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        int int4 = preloaded3.getNumLines();
        java.lang.String str5 = preloaded3.getCodeNoCache();
        java.lang.String str6 = preloaded3.getCodeNoCache();
        java.lang.String str7 = preloaded3.getName();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion(0);
        java.lang.String str11 = preloaded3.getLine(10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(region9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        boolean boolean8 = preloaded3.isExtern();
        preloaded3.setIsExtern(true);
        preloaded3.setOriginalPath("hi!");
        java.lang.String str13 = preloaded3.getCodeNoCache();
        boolean boolean14 = preloaded3.isExtern();
        java.lang.String str16 = preloaded3.getLine((int) (short) -1);
        java.lang.String str17 = preloaded3.getOriginalPath();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        boolean boolean10 = preloaded3.isExtern();
        java.lang.String str11 = preloaded3.getOriginalPath();
        boolean boolean12 = preloaded3.hasSourceInMemory();
        preloaded3.setIsExtern(true);
        com.google.javascript.jscomp.Region region16 = preloaded3.getRegion((-1));
        boolean boolean17 = preloaded3.hasSourceInMemory();
        boolean boolean18 = preloaded3.hasSourceInMemory();
        java.lang.String str20 = preloaded3.getLine(0);
        boolean boolean21 = preloaded3.hasSourceInMemory();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(region16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        int int5 = preloaded4.getNumLines();
        java.lang.String str6 = preloaded4.toString();
        int int7 = preloaded4.getNumLines();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.getName();
        sourceFile9.clearCachedSource();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        java.lang.String str4 = sourceFile3.toString();
        java.lang.String str5 = sourceFile3.toString();
        sourceFile3.clearCachedSource();
        com.google.javascript.jscomp.Region region8 = sourceFile3.getRegion((int) (short) 10);
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(region8);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        preloaded3.clearCachedSource();
        java.lang.String str9 = preloaded3.toString();
        int int10 = preloaded3.getNumLines();
        preloaded3.setIsExtern(true);
        java.lang.String str14 = preloaded3.getLine((int) (byte) 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.getOriginalPath();
        sourceFile9.setOriginalPath("");
        boolean boolean13 = sourceFile9.isExtern();
        boolean boolean14 = sourceFile9.hasSourceInMemory();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        java.lang.String str7 = generated2.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        preloaded3.clearCachedSource();
        java.lang.String str10 = preloaded3.getLine(100);
        com.google.javascript.jscomp.Region region12 = preloaded3.getRegion((int) ' ');
        java.lang.String str13 = preloaded3.getOriginalPath();
        java.lang.String str14 = preloaded3.getCode();
        preloaded3.setIsExtern(true);
        preloaded3.setIsExtern(false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(region12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        preloaded2.setIsExtern(true);
        int int5 = preloaded2.getNumLines();
        java.lang.String str7 = preloaded2.getLine(10);
        java.lang.String str9 = preloaded2.getLine(0);
        java.lang.String str11 = preloaded2.getLine((int) (short) 1);
        java.lang.String str12 = preloaded2.getOriginalPath();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        boolean boolean4 = sourceFile3.isExtern();
        int int5 = sourceFile3.getNumLines();
        java.io.Reader reader6 = sourceFile3.getCodeReader();
        sourceFile3.clearCachedSource();
        sourceFile3.setOriginalPath("");
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(reader6);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.getOriginalPath();
        sourceFile9.setOriginalPath("");
        int int13 = sourceFile9.getNumLines();
        sourceFile9.setIsExtern(true);
        boolean boolean16 = sourceFile9.hasSourceInMemory();
        sourceFile9.setIsExtern(false);
        boolean boolean19 = sourceFile9.isExtern();
        java.io.Reader reader20 = sourceFile9.getCodeReader();
        sourceFile9.setIsExtern(true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(reader20);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        java.lang.String str7 = generated2.getCodeNoCache();
        generated2.setOriginalPath("");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        boolean boolean5 = preloaded3.hasSourceInMemory();
        java.lang.String str6 = preloaded3.getName();
        java.lang.String str7 = preloaded3.toString();
        java.lang.String str8 = preloaded3.getOriginalPath();
        int int9 = preloaded3.getNumLines();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        boolean boolean7 = preloaded3.hasSourceInMemory();
        java.lang.String str9 = preloaded3.getLine((int) (short) 0);
        java.lang.String str10 = preloaded3.getCode();
        preloaded3.setIsExtern(true);
        boolean boolean13 = preloaded3.isExtern();
        java.lang.String str15 = preloaded3.getLine((int) (short) -1);
        java.lang.String str17 = preloaded3.getLine((int) (short) 100);
        preloaded3.clearCachedSource();
        java.lang.String str19 = preloaded3.getName();
        preloaded3.setIsExtern(false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset1);
        boolean boolean3 = sourceFile2.isExtern();
        com.google.javascript.jscomp.Region region5 = sourceFile2.getRegion((int) '#');
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(region5);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setIsExtern(true);
        generated2.clearCachedSource();
        java.lang.String str8 = generated2.toString();
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = generated2.getNumLines();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        java.lang.String str8 = generated2.getOriginalPath();
        generated2.setIsExtern(false);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "");
        int int4 = preloaded2.getLineOffset((int) (byte) 1);
        preloaded2.clearCachedSource();
        java.lang.String str6 = preloaded2.getOriginalPath();
        java.io.Reader reader7 = preloaded2.getCodeReader();
        int int8 = preloaded2.getNumLines();
        java.lang.String str9 = preloaded2.getName();
        java.lang.String str10 = preloaded2.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.toString();
        java.io.Reader reader11 = sourceFile9.getCodeReader();
        java.lang.String str12 = sourceFile9.getCode();
        com.google.javascript.jscomp.Region region14 = sourceFile9.getRegion((int) (byte) 10);
        sourceFile9.setOriginalPath("hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(reader11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(region14);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        preloaded4.clearCachedSource();
        java.lang.String str10 = preloaded4.toString();
        boolean boolean11 = preloaded4.hasSourceInMemory();
        java.lang.String str12 = preloaded4.getCode();
        preloaded4.clearCachedSource();
        java.io.Reader reader14 = preloaded4.getCodeReader();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile15 = com.google.javascript.jscomp.SourceFile.fromReader("", reader14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(reader14);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.getCode();
        int int7 = preloaded3.getNumLines();
        preloaded3.clearCachedSource();
        java.io.Reader reader9 = preloaded3.getCodeReader();
        java.lang.Class<?> wildcardClass10 = reader9.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(reader9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "");
        int int4 = preloaded2.getLineOffset((int) (byte) 1);
        preloaded2.setIsExtern(false);
        boolean boolean7 = preloaded2.isExtern();
        java.lang.String str8 = preloaded2.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "");
        int int6 = preloaded4.getLineOffset((int) (byte) 1);
        preloaded4.setIsExtern(false);
        java.lang.String str9 = preloaded4.toString();
        boolean boolean10 = preloaded4.isExtern();
        java.io.Reader reader11 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile12 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader11);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile13 = com.google.javascript.jscomp.SourceFile.fromReader("", reader11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(reader11);
        org.junit.Assert.assertNotNull(sourceFile12);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded6 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str8 = preloaded6.getLine((int) (byte) 10);
        boolean boolean9 = preloaded6.isExtern();
        java.io.Reader reader10 = preloaded6.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile11 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader10);
        com.google.javascript.jscomp.SourceFile sourceFile12 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader10);
        com.google.javascript.jscomp.SourceFile sourceFile13 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader10);
        boolean boolean14 = sourceFile13.hasSourceInMemory();
        sourceFile13.clearCachedSource();
        sourceFile13.setIsExtern(true);
        java.lang.String str19 = sourceFile13.getLine((int) (short) 10);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(reader10);
        org.junit.Assert.assertNotNull(sourceFile11);
        org.junit.Assert.assertNotNull(sourceFile12);
        org.junit.Assert.assertNotNull(sourceFile13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.getCode();
        int int7 = preloaded3.getNumLines();
        java.lang.String str8 = preloaded3.getName();
        boolean boolean9 = preloaded3.hasSourceInMemory();
        java.lang.String str10 = preloaded3.getName();
        java.lang.String str11 = preloaded3.getCode();
        java.lang.String str12 = preloaded3.getCode();
        int int13 = preloaded3.getNumLines();
        preloaded3.clearCachedSource();
        boolean boolean15 = preloaded3.hasSourceInMemory();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        preloaded3.clearCachedSource();
        java.lang.String str10 = preloaded3.getLine(100);
        com.google.javascript.jscomp.Region region12 = preloaded3.getRegion((int) ' ');
        java.lang.String str13 = preloaded3.getOriginalPath();
        preloaded3.setOriginalPath("");
        com.google.javascript.jscomp.Region region17 = preloaded3.getRegion((int) '4');
        java.io.Reader reader18 = preloaded3.getCodeReader();
        java.lang.String str20 = preloaded3.getLine((int) '#');
        preloaded3.clearCachedSource();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(region12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(region17);
        org.junit.Assert.assertNotNull(reader18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        java.lang.String str4 = sourceFile3.getOriginalPath();
        int int6 = sourceFile3.getLineOffset((int) (byte) 1);
        java.lang.Class<?> wildcardClass7 = sourceFile3.getClass();
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        java.lang.String str11 = generated2.getCodeNoCache();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "", "hi!");
        boolean boolean4 = sourceFile3.hasSourceInMemory();
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "");
        java.io.Reader reader5 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile6 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader5);
        com.google.javascript.jscomp.SourceFile sourceFile7 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader5);
        java.lang.String str8 = sourceFile7.getCode();
        java.io.Reader reader9 = sourceFile7.getCodeReader();
        java.lang.Class<?> wildcardClass10 = reader9.getClass();
        org.junit.Assert.assertNotNull(reader5);
        org.junit.Assert.assertNotNull(sourceFile6);
        org.junit.Assert.assertNotNull(sourceFile7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(reader9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        int int4 = preloaded3.getNumLines();
        java.lang.String str5 = preloaded3.getCodeNoCache();
        java.lang.String str6 = preloaded3.toString();
        java.lang.String str7 = preloaded3.getOriginalPath();
        boolean boolean8 = preloaded3.isExtern();
        java.lang.String str9 = preloaded3.getCode();
        int int10 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region12 = preloaded3.getRegion(0);
        com.google.javascript.jscomp.Region region14 = preloaded3.getRegion((int) ' ');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(region12);
        org.junit.Assert.assertNull(region14);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        preloaded2.setIsExtern(true);
        preloaded2.setIsExtern(true);
        java.lang.String str8 = preloaded2.getLine((int) (byte) 10);
        boolean boolean9 = preloaded2.isExtern();
        java.lang.String str10 = preloaded2.getOriginalPath();
        boolean boolean11 = preloaded2.isExtern();
        java.lang.String str12 = preloaded2.getCode();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        com.google.javascript.jscomp.SourceFile sourceFile5 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        java.lang.String str6 = sourceFile5.getOriginalPath();
        java.io.Reader reader7 = sourceFile5.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile8 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader7);
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader7);
        java.lang.String str10 = sourceFile9.getCodeNoCache();
        int int12 = sourceFile9.getLineOffset(1);
        org.junit.Assert.assertNotNull(sourceFile5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertNotNull(sourceFile8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", generator1);
        boolean boolean3 = sourceFile2.isExtern();
        java.lang.String str4 = sourceFile2.toString();
        java.lang.String str5 = sourceFile2.toString();
        sourceFile2.setIsExtern(true);
        sourceFile2.setOriginalPath("hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int11 = sourceFile2.getLineOffset((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!");
        java.lang.String str3 = sourceFile2.getCode();
        sourceFile2.setOriginalPath("");
        // The following exception was thrown during execution in test generation
        try {
            int int7 = sourceFile2.getLineOffset((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        preloaded3.clearCachedSource();
        int int9 = preloaded3.getNumLines();
        java.lang.String str10 = preloaded3.getCode();
        preloaded3.setIsExtern(false);
        com.google.javascript.jscomp.Region region14 = preloaded3.getRegion(10);
        preloaded3.clearCachedSource();
        java.lang.String str16 = preloaded3.toString();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(region14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.lang.String str7 = preloaded3.getOriginalPath();
        preloaded3.setIsExtern(true);
        com.google.javascript.jscomp.Region region11 = preloaded3.getRegion((int) (byte) 1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(region11);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        preloaded3.setOriginalPath("");
        preloaded3.setOriginalPath("hi!");
        preloaded3.setIsExtern(true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        java.lang.String str8 = preloaded3.getOriginalPath();
        preloaded3.clearCachedSource();
        boolean boolean10 = preloaded3.isExtern();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        int int7 = preloaded3.getNumLines();
        java.lang.String str8 = preloaded3.getCodeNoCache();
        preloaded3.setOriginalPath("hi!");
        boolean boolean11 = preloaded3.hasSourceInMemory();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.lang.String str7 = preloaded3.getOriginalPath();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = preloaded3.getLineOffset((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.getCodeNoCache();
        java.lang.String str7 = preloaded3.getName();
        java.lang.String str8 = preloaded3.getCode();
        boolean boolean9 = preloaded3.isExtern();
        preloaded3.setOriginalPath("hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.toString();
        java.io.Reader reader11 = sourceFile9.getCodeReader();
        java.lang.String str12 = sourceFile9.getName();
        java.lang.String str13 = sourceFile9.getName();
        boolean boolean14 = sourceFile9.hasSourceInMemory();
        java.io.Reader reader15 = sourceFile9.getCodeReader();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = sourceFile9.getLineOffset((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(reader11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(reader15);
    }
}

